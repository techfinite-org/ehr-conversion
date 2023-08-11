#Python code to illustrate parsing of XML files
# importing the required modules
import csv
import os
import requests
import xml.etree.ElementTree as ET


def parseXML(xmlfile):

	# create element tree object
	tree = ET.parse(xmlfile)

	# get root element
	root = tree.getroot()

	correspondenceOuts = []
	correspondenceIns  = []
	demographics = []
	demographic = {}

	for demo in root.findall('./Demographics/Patient'):
		for child in demo:
			print(child.tag + ":"  + child.text)
			demographic[child.tag] = child.text
		
	for practice in root.findall('./Practice'):
		for child in practice:
			print(child.tag + ":"  + child.text)
			demographic[child.tag] = child.text
	demographic['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']
	demographics.append(demographic)

	for outitem in root.findall('./CorrespondenceOut/Correspondence'):
		correspondenceOut = {}
		correspondenceOut['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']
		
		for child in outitem:
			print(child.tag + ":"  + child.text)
			correspondenceOut[child.tag] = child.text
		correspondenceOuts.append(correspondenceOut)

	for inItem in root.findall('./CorrespondenceIn/Document'):
		correspondenceIn = {}
		correspondenceIn['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']
		for child in inItem:
			correspondenceIn[child.tag] = child.text
		correspondenceIns.append(correspondenceIn)

	return demographics, correspondenceOuts, correspondenceIns


def saveDemographicstoCSV(demographics, filename, printHeader):
	fields = ['PATIENT', 'FIRSTNAME', 'SURNAME', 'DOB', 'PracticeName', 'PracticeID',
	    'ADDRESS1', 'CITY', 'CREATED', 'MEDICAREEXPIRY', 'MEDICARELINENO', 
		'MEDICARENO', 'MOBILEPHONE', 'PATIENTSTATUS', 'POSTCODE', 'RECORDSTATUS', 'SEXCODE',
		 'DVACODE',  'PENSIONCODE', 'PENSIONNO', 'PENSIONEXPIRY',  'EMAIL', 'ADDRESS2',  
		 'PREFERREDNAME', 'MIDDLENAME',  'HOMEPHONE', 'WORKPHONE', 'OTHERNOTES', 'DVANO']
	with open(filename, 'a', newline='') as csvfile:
		writer = csv.DictWriter(csvfile, fieldnames = fields)
		if(printHeader == "Y"):
			writer.writeheader()

		writer.writerows(demographics)

def saveCorrespondenceOutstoCSV(correspondenceOuts, filename, printHeader):
	fields = ['PATIENT','CONTACTNAME', 'CORRESPONDENCEDATE', 'CREATED', 'CATEGORY', 'SENDERNAME', 'SUBJECT', 'RECORDID', 'RECORDSTATUS']
	with open(filename, 'a', newline='') as csvfile:
		writer = csv.DictWriter(csvfile, fieldnames = fields)
		if(printHeader == "Y"):
			writer.writeheader()

		writer.writerows(correspondenceOuts)


def saveCorrespondenceInstoCSV(correspondenceIns, filename, printHeader):
	fields = ['PATIENT','RECORDSTATUS', 'CORRESPONDENCEDATE', 'CREATED', 'DocumentPage', 'CATEGORY', 'DocumentID', 'SUBJECT', 'SENDERNAME', 'CONTACTNAME']
	with open(filename, 'a', newline='') as csvfile:
		writer = csv.DictWriter(csvfile, fieldnames = fields)
		if(printHeader == "Y"):
			writer.writeheader()

		writer.writerows(correspondenceIns)
	
def main():
	count = 0
	printHeader = "N"
	os.chdir('D:/compare/run/01/new')
	for f in os.listdir():
		printHeader = "N"
		file_name, file_ext = os.path.splitext(f)
		if file_ext == '.xml':
			count = count + 1
			demographics, correspondenceOuts, correspondenceIns = parseXML(f)
			if(count == 1):
				printHeader = "Y"
			saveDemographicstoCSV(demographics, "patient.csv", printHeader)
			saveCorrespondenceOutstoCSV(correspondenceOuts, "corres-outs.csv", printHeader)
			saveCorrespondenceInstoCSV(correspondenceIns, "corres-ins.csv", printHeader)
	
if __name__ == "__main__":
	count = 0
	# calling main function
	main()
