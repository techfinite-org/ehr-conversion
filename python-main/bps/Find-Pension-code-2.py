# Program to find the patient with Pension Code 2

import os
import shutil
import xml.etree.ElementTree as ET

# Source directory containing XML files
source_directory = "Source Directory"

# Destination directory to move XML files with the specified tag
destination_directory = "Destination Directory"

# Tag and value to search for in the XML files
target_tag = "PENSIONCODE"
target_value = "2"

# Ensure the destination directory exists
if not os.path.exists(destination_directory):
    os.makedirs(destination_directory)

# Loop through the XML files in the source directory
for filename in os.listdir(source_directory):
    if filename.endswith(".xml"):
        xml_path = os.path.join(source_directory, filename)

        # Parse the XML file
        tree = ET.parse(xml_path)
        root = tree.getroot()

        # Find the specified tag and value in the XML
        pensioncard_elements = root.findall(f".//{target_tag}")
        for element in pensioncard_elements:
            if element.text == target_value:
                # Copy the XML file to the destination directory
                destination_path = os.path.join(destination_directory, filename)
                shutil.copy(xml_path, destination_path)
                break  # Exit the loop once a matching tag is found

print("All files with the specified tag have been copied.")
