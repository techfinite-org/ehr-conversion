from datetime import datetime
import requests
import json
import os
import re
from base64 import b64encode
import pandas as pd
import threading

INPUT_FILE          = "./input.txt" 
OUTPUT_DIR          = "D:/json-new/"
LOG_file            = "./run.log"
JSON_TO_XML_SERVER  = "http://localhost:8080"
AUTH_KEY            = "NDIk28Le3MM5RmGWmgtVWbYhIGA"

FS      = "|"
ERROR   = "ERROR"
INFO    = "INFO"
WARN    = "WARN"

TAG_PATIENT_SEARCH      = "SEARCH-API"
TAG_JSON_WRITE          = "JSON-WRITE"
TAG_XML_WRITE           = "XML-WRITE"
TAG_DEMOGRAPHICS        = "DEMOGRAPICS-API"
TAG_PATIENT_SETTINGS    = "PATIENT_SETTINGS"
TAG_CORRESPONDENCE_IN   = "CORRESPONDENCE_IN"
TAG_CORRESPONDENCE_OUT  = "CORRESPONDENCE_OUT"
TAG_PRACTICE            = "PRACTICE"
TAG_ATTACHMENT          = "ATTACHMENT"
TAG_VALIDATION          = "VALIDATION"
TAG_PATIENT_START       = "PATIENT_SEQ"

URL_DEMOGRAPHICS        = "https://api.medirecords.com/v1/patients/{id}/addresses"
URL_CORRESPONDENCE_IN   = "https://api.medirecords.com/v1/upload/patients/{id}/correspondences/inbounds"
URL_CORRESPONDENCE_OUT  = "https://api.medirecords.com/v1/upload/patients/{id}/correspondences/outbounds"
URL_PATIENT_SETTINGS    = "https://api.medirecords.com/v1/patients/{id}/settings/"
URL_PATINET_SEARCH      = "https://api.medirecords.com/v1/patients/search"
URL_PRACTICE            = "https://api.medirecords.com/v1/practices/{id}"

ctx = {}

def convert_json_to_xml(tag, file_name):
    try:
        url = JSON_TO_XML_SERVER + f"/ehr/api/v1/launch?patient_file={file_name}.json&output_file={file_name}.xml"
        #url = f"http://localhost:8080/ehr/api/v1/launch?patient_file={file_name}.json&output_file={file_name}.xml"
        response = requests.post(url)
        log(INFO, tag, str(response.status_code) + FS + url )
        return response.status_code
    except Exception as e:
        print("Error: ", e)
        log(ERROR, tag, str(response.status_code) + FS +  url + FS + str(e))


def encode(name, value, operator=None):
    if operator == "or":
        return "%2C" + name + "%3D%3D" + value
    elif operator == "and":
        return "%3B" + name + "%3D%3D" + value
    return name + "%3D%3D" + value

def _or(name, value):
    return encode(name, value, "or")

def _and(name, value):
    return encode(name, value, "and")

def fill(url, id):
    return url.replace("{id}", id)
        
def get_attachment_content(tag, url):
    try:
        response = requests.get(url)
        file_format = response.headers["Content-Type"].split("/")[-1].upper()
        log(INFO, tag, str(response.status_code) + FS + url )
        return b64encode(response.content).decode(), file_format
    except Exception as e:
        print("Error: ", e)
        log(ERROR, tag, str(response.status_code) + FS +  url + FS + str(e))
    

def process_pages( patient_id, type):
    try:
        tag = TAG_CORRESPONDENCE_IN if type == "Inbound" else TAG_CORRESPONDENCE_OUT
        url = URL_CORRESPONDENCE_IN if type == "Inbound" else URL_CORRESPONDENCE_OUT

        response_status, response = _api3(tag, url, patient_id ) # process first page
        
        # ERROR
        if(response_status == 500):
            log(INFO, tag, type +  FS + "FIRST_PAGE_NONE" )
            return []
        
        # NEWLY ADDED
        if(len(response["data"]) != 0 ):
            totalPages = response["totalPages"]
            totalElements = response["totalElements"]

            log(INFO, tag, str(response_status) + FS + "META" + FS + str(totalPages) + FS + str(totalElements) )
            if(totalPages < 2):
                log(INFO, tag, str(response_status) + FS + "META" + FS + str(totalPages) + FS + str(totalElements) + FS + "ACTUALS" + FS + str(len(response['data'])))
                return response['data']

            for page in range(1, totalPages):
                response_status, _response = _api3(tag, url + "?page=" + str(page),  patient_id)
                if( response_status == 200):
                    response['data'] += _response['data']
            
            log(INFO, tag, str(response_status) + FS + "META" + FS + str(totalPages) + FS + str(totalElements) + FS + "ACTUALS" + FS + str(len(response['data'])))
        else:
            log(INFO, tag, str(response_status) + FS + "NO CORRESPONDENCE RECORDS FOUND")

    except Exception as e:
        print("Error: ", e)
        log(ERROR, tag, str(response_status) + FS +  url + FS + str(e))
           
    return response['data']

def process_elements(elements):
    count = 1
    for element in elements:
        element["recordStatus"] = 1
        element["id"] = count
        count += 1
        if element["attachmentUrl"] != None:
            element["attachmentContent"], element["documentType"] = get_attachment_content( TAG_ATTACHMENT, element["attachmentUrl"] )
        elif "htmlContent" in element.keys():
            if element["htmlContent"] != None:
                element["documentType"] = "HTML"
                element["attachmentContent"] = element["htmlContent"]
    return elements

def _api1(url):
    return _api2("", url)

def _api3(tag, url, patient_id):
    return _api2(tag, fill(url, patient_id))

def _api2(tag, url):
    try:
        headers = {
            "Accept": "application/json",
            "Authorization": "Bearer " + AUTH_KEY,
        }
        response = requests.get(url, headers=headers)
    except Exception as e:
        print("Error: ", e)
        log(ERROR, tag, str(response.status_code) + FS + url + FS + str(e))
        return (response.status_code, response.json())

    log(INFO, tag, str(response.status_code) + FS + url)
    return (response.status_code, response.json())

def get_patient_correspondence(patient_id, type):
    response = process_pages(patient_id, type )
    if(not isEmpty(response)):
        response = process_elements(response)
    return response

def get_practice_details(defaultPracticeId):
    response_status, response = _api3(TAG_PRACTICE, URL_PRACTICE, defaultPracticeId )
    if(isEmpty(response) or response_status != 200):
        return None

    if (response["practiceName"] == "Vecare Health Holbrook"):
        response["practiceId"] = "24784"
    elif (response["practiceName"] == "Vecare Health - Walla Walla"):
        response["practiceId"] = "28200"
    else:
        log(WARN, TAG_PRACTICE, "Other Pratice Patient" + response["practiceName"])
        print("Other practice")
    return response

def process_json():
    try:
        json_dict = {}
        first_name = ctx["first_name"]
        last_name = ctx["last_name"]
        dob = ctx["dob"]

        response_status, patient_search_response = _api2(TAG_PATIENT_SEARCH,
            URL_PATINET_SEARCH
            + "?q="
            + encode("firstName", first_name)
            + _and("lastName", last_name)
            + _and("dob", dob)
        )
        if response_status != 200:
            log(ERROR, TAG_PATIENT_SEARCH, "RESPONSE_STATUS: " + response_status)
            return
        elif isEmpty(patient_search_response["data"]):
            log(ERROR, TAG_PATIENT_SEARCH, "No records found")
            return
        elif isEmpty(patient_search_response["data"][0]):
            log(ERROR, TAG_PATIENT_SEARCH, "No Patient Details found.")
            return
        else:
            patient_details = patient_search_response["data"][0]
            patient_id = patient_details["id"]
            if( isEmpty(patient_id)):
                log(ERROR, TAG_PATIENT_SEARCH, "No Patient Id is found")
                return

            patient_details["recordStatus"] = 1
            patient_details["patientStatus"] = 1

            json_dict["patientDetails"] = patient_details

            status, patient_settings = _api3(TAG_PATIENT_SETTINGS, URL_PATIENT_SETTINGS, patient_id )
            if(isEmpty(patient_settings)):
                patient_settings = None
            json_dict["patientSettings"] = patient_settings

            status, response = _api3(TAG_DEMOGRAPHICS, URL_DEMOGRAPHICS, patient_id )
            if(not isEmpty(response)):
                patient_address = response[0] # get primary address - the first one on the list
                json_dict["patientAddress"] = patient_address

            correspondence_inbound = get_patient_correspondence( patient_id, "Inbound" )
            if(isEmpty(correspondence_inbound)):
                correspondence_inbound = []
            json_dict["correspondenceInbound"] = correspondence_inbound

            correspondence_outbound = get_patient_correspondence( patient_id, "Outbound" )
            if(isEmpty(correspondence_outbound)):
                correspondence_outbound = []
            json_dict["correspondenceOutbound"] = correspondence_outbound
            
            practice = get_practice_details( patient_details["defaultPracticeId"] )
            if(isEmpty(practice) or len(practice) < 1):
                practice = []
                practice_name = "X"
            else:
                json_dict["practice"] = practice
                practice_name = json_dict["practice"]["practiceName"]

            file_name = first_name + "_" + last_name + "_" + practice_name
            write_json(file_name, json_dict)
            write_xml(file_name)
          
    except Exception as e:
        raise e
        #print("Error:", e)
        #log(ERROR, "CONVERSION", "Error occured during conversion :" + str(e))

def write_json(file_name, json_dict):
    log(INFO, TAG_JSON_WRITE, "Writing Json file")

    with open(f"{OUTPUT_DIR}{file_name}.json", "w") as outfile:
        json.dump([json_dict], outfile)
    
    log(INFO, TAG_JSON_WRITE, "Json Conversion Completed")

def write_xml(file_name):
    log(INFO, TAG_XML_WRITE, "XML Conversion Started")

    convert_json_to_xml(TAG_XML_WRITE, file_name)

    log(INFO, TAG_XML_WRITE, "XML Conversion Completed")

def  _split3(s, delimiter, position):
    if(s == None):
        return
    arr = s.split(delimiter)
    if( len(arr) <= position):
        return s
    val = arr[position]
    if(val == None or len(val) < 1):
        return val
    return val.strip()
    
def  _split2(s, position):
   return _split3(s, "|", position)

def log(logLevel, tag, description):
    with open( LOG_file, 'a') as outfile:
        outfile.write(ctx["record"] + FS + logLevel + FS + tag + FS + str(description) + "\n")

def isEmpty(s):
    if(s == None or len(s) < 1):
        return True
    else:
        return False

def main():
    with open(INPUT_FILE, 'r') as file:
        input_records = [line.strip() for line in file]
        print(input_records)

    count = 1073
    for record in input_records:
        
        ctx["record"] = record
        if(record == "STOP"):
            break
        fullName = _split2(record, 0)
        dob = _split2(record, 1)

        if(isEmpty(fullName) or isEmpty(dob)):
            log(ERROR, TAG_VALIDATION, "Incomplete Input Record")
            continue

        firstName = _split3(fullName, ",", 1)
        lastName = _split3(fullName, ",", 0)
        
        ctx["first_name"] = firstName
        ctx["last_name"] = lastName
        ctx["dob"] = dob

        log( "INFO", TAG_PATIENT_START, count )

        process_json()
        
        count += 1

if __name__ == "__main__":
    main()