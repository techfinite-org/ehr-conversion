# Program to print the Name of patient into text file

import os
import xml.etree.ElementTree as ET

# Path to the folder containing XML files
xml_folder = 'Source Directory'

# Path to the output text file
output_file = 'Output Text File'

# Open the output text file for writing
with open(output_file, 'w') as f_out:
    # Iterate through each XML file in the folder
    for xml_file in os.listdir(xml_folder):
        if xml_file.endswith('.xml'):
            xml_path = os.path.join(xml_folder, xml_file)
            tree = ET.parse(xml_path)
            root = tree.getroot()

            # Extract values of FIRSTNAME, LASTNAME, and DATEOFBIRTH

            firstname = root.find('.//FIRSTNAME').text
            lastname = root.find('.//SURNAME').text
            dob = root.find('.//DOB').text

            f_out.write(lastname + ", " + firstname + "|" + dob + "\n")
