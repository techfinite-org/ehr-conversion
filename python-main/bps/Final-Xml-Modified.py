# Program to remove Pension Details for Patient having Pension Code 2, Trim the Category and Subject tag element to length of 40 when it is greater than 40 and to create log.

import csv
import os
import xml.etree.ElementTree as ET

def parseXML(xmlfile,file_name):

    tree = ET.parse(xmlfile)

    root = tree.getroot()

    demographic = {}
    record = []
    correspondence = {}
    tags_to_remove = ['PENSIONCODE', 'PENSIONEXPIRY', 'PENSIONNO'] 


    for demo in root.findall('./Demographics/Patient'):
        for child in demo:
            demographic[child.tag] = child.text
            if child.tag == "PENSIONCODE":
                if demographic['PENSIONCODE'] == "2":
                    for tag_name in tags_to_remove:
                        elements_to_remove = root.findall('.//{}'.format(tag_name))
                        for ele in elements_to_remove:
                            demo.remove(ele)
    

    for outitem in root.findall('./CorrespondenceOut/Correspondence'):
        for child in outitem:
            if(child.tag == "CATEGORY"): 
                if len(child.text) > 40:
                    correspondence['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']
                    correspondence['Corres In/Corres Out'] = "Corres Out"
                    correspondence['Before Triming'] = child.text
                    child.text = child.text[:40]
                    correspondence['After Triming'] = child.text
            if(child.tag == "SUBJECT"): 
                if len(child.text) > 40:
                    child.text = child.text[:40]
                
    for outitem in root.findall('./CorrespondenceIn/Document'):
        for child in outitem:
            if(child.tag == "CATEGORY"): 
                if len(child.text) > 40:
                    correspondence['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']
                    correspondence['Corres In/Corres Out'] = "Corres In"
                    correspondence['Before Triming'] = child.text
                    child.text = child.text[:40]
                    correspondence['After Triming'] = child.text
            if(child.tag == "SUBJECT"): 
                if len(child.text) > 40:
                    child.text = child.text[:40]

    tree.write(f'D:/InActive Patient XML/final/{file_name}.xml',xml_declaration=True,encoding='UTF-8')

    record.append(correspondence)

    return record

def saveRecordtoCSV(record, filename, printHeader):
    fields = ['PATIENT','Corres In/Corres Out','Before Triming','After Triming']
    with open(filename, 'a', newline='') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames = fields)
        if(printHeader == "Y"):
            writer.writeheader()
        writer.writerows(record)
	
def main():
    count = 0
    printHeader = "N"
    os.chdir('D:/InActive Patient XML')
    for f in os.listdir():
        printHeader = "N"
        file_name, file_ext = os.path.splitext(f)
        if file_ext == '.xml':
            count = count + 1
            record = parseXML(f,file_name)
            print("Count",count)
            if(count == 1):
                printHeader = "Y"

            saveRecordtoCSV(record, "length40log.csv", printHeader)

if __name__ == "__main__":
	count = 0
	main()