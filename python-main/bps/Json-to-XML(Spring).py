import requests
import os


def main():
    count = 0
    os.chdir('Source Directory') # Give the path of source directory it must be same as directory given in Spring program
    for f in os.listdir():
        file_name, file_ext = os.path.splitext(f)
        if file_ext == '.json':
            count = count + 1
            response = requests.post(f"http://localhost:8080/ehr/api/v1/launch?patient_file={file_name}.json&output_file={file_name}.xml")
            if (response.text == "Success"):
                 print(f"XML count = {count}")
if __name__ == "__main__":
	count = 0
	# calling main function
	main()