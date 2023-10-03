# Program for Complete Log creation using XML

import csv
import os
import xml.etree.ElementTree as ET

def parseXML(xmlfile):

    tree = ET.parse(xmlfile)

    root = tree.getroot()

    demographic = {}
    record = []
    correspondence = {}
    no_of_corres_in = 0
    no_of_corres_out = 0
    corres_in_len40 = 0
    corres_out_len40 = 0
    corres_in_LETTER = 0
    corres_out_LETTER = 0


    for demo in root.findall('./Demographics/Patient'):
        for child in demo:
            # print(child.tag + ":"  + child.text)
            demographic[child.tag] = child.text
            if child.tag == "PENSIONCODE":
                print(demographic['PENSIONCODE'])
                if demographic['PENSIONCODE'] == "2":
                    print("YES")
                    correspondence['Pension Code:2'] = "YES"
                else:
                    correspondence['Pension Code:2'] = "NO" 

    correspondence['PATIENT'] = demographic['FIRSTNAME'] + "-" + demographic['SURNAME'] + "-" + demographic['DOB']  
    

    for outitem in root.findall('./CorrespondenceOut/Correspondence'):
        no_of_corres_out = no_of_corres_out + 1
        for child in outitem:
            # print(child.tag + ":"  + child.text)
            if(child.tag == "CATEGORY"): 
                if len(child.text) > 40:
                    corres_out_len40 = corres_out_len40 + 1
                if child.text == "LETTER":
                    corres_out_LETTER = corres_out_LETTER + 1
    
    correspondence['Total No. of Corres OUT'] = no_of_corres_out
    correspondence['No. of Corres OUT with Length > 40'] = corres_out_len40
    correspondence['No. of Corres OUT with LETTER'] = corres_out_LETTER
                
    for outitem in root.findall('./CorrespondenceIn/Document'):
        no_of_corres_in = no_of_corres_in + 1
        for child in outitem:
            # print(child.tag + ":"  + child.text)
            if(child.tag == "CATEGORY"): 
                if len(child.text) > 40:
                    corres_in_len40 = corres_in_len40 + 1
                if child.text == "LETTER":
                    corres_in_LETTER = corres_in_LETTER + 1
    
    correspondence['Total No. of Corres IN'] = no_of_corres_in
    correspondence['No. of Corres IN with Length > 40'] = corres_in_len40
    correspondence['No. of Corres IN with LETTER'] = corres_in_LETTER

    record.append(correspondence)

    return record


def saveRecordtoCSV(record, filename, printHeader):
    fields = ['PATIENT','Pension Code:2','Total No. of Corres OUT','Total No. of Corres IN','No. of Corres OUT with Length > 40','No. of Corres IN with Length > 40','No. of Corres OUT with LETTER','No. of Corres IN with LETTER']
    with open(filename, 'a', newline='') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames = fields)
        if(printHeader == "Y"):
            writer.writeheader()
        writer.writerows(record)
	
def main():
    count = 0
    printHeader = "N"
    os.chdir('Source Directory') # Give the path of Source Directory
    for f in os.listdir():
        printHeader = "N"
        file_name, file_ext = os.path.splitext(f)
        if file_ext == '.xml':
            count = count + 1
            record = parseXML(f)
            print("Count",count)
            if(count == 1):
                printHeader = "Y"

            saveRecordtoCSV(record, "log.csv", printHeader)

if __name__ == "__main__":
	count = 0
	# calling main function
	main()