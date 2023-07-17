package com.techfinite.ehr.conversion.target.schema;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Patient {

    private String POSTAL_SUBURB;

    private String DOB_SOURCE;

    private String MOBILEPHONE;

    private String ADDRESS_VERSION;

    private String IHISOURCE;

    private String NAME_TYPE;

    private String RECORDSTATUS;

    private String FIRSTNAME;

    private String IHI;

    private String NAME_VERSION;

    private String DEFAULTVISITTYPE;

    private String ADDRESS_SETID;

    private String PATIENTSTATUS;

    private String DOB;

    private String DVANO;

    private String PENSIONSTART;

    private String EMERGENCYID;

    private String ETHNICCODE;

    private String REFERRALCODE;

    private String DENYACCESS;

    private String CONSENTSMSREMINDER;

    private String HEALTHFUNDNAME;

    private String ELIGIBLE_PUBLIC_FUNDING;

    private String CSCVALID;

    private String CSCEXPIRY;

    private String HUCVALID;

    private String ENROLMENTCHECK;

    private String RELIGION;

    private String POSTALADDRESS;

    private String PHARMACYID;

    private String HCHTIER;

    private String CORE_VERSION;

    private String COUNTRYOFBIRTH;

    private String POSTCODE;

    private String UPDATED;

    private String ERX;

    private String ETHNIC1CODE;

    private String DIFFERENTIDENTITY;

    private String ORIGIN;

    private String IHIRECORDSTATUS;

    private String POSTALCOUNTRY;

    private String NAME_SOURCE;

    private String ADDRESS_GEOTAG;

    private String MOH_CHECKED;

    private String SAFETYNETNO;

    private String SEXCODE;

    private String PENSIONNO;

    private String EXTRACTIONOPTOUT;

    private String POSTALCITY;

    private String OTHERNOTES;

    private String CITY;

    private String FINDEPENDANT;

    private String POSTALPOSTCODE;

    private String NAME_SETID;

    private String ESAM_CHECKED;

    private String ACCOUNTCODE;

    private String ADDRESS_DOMICILE;

    private String HEALTHFUNDID;

    private String DATEOFDEATH;

    private String HCHSTARTED;

    private String HUCEXPIRY;

    private String INTERNALID;

    private String HOMEPHONE;

    private String EMAIL;

    private String PLACEOFBIRTH;

    private String MEDICAREEXPIRY;

    private String MIDDLENAME;

    private String COUNTRY;

    private String USERID;

    private String PENDINGMOBILECHANGE;

    private String HUCHOLDER;

    private String IHISTATUS;

    private String POSTAL_ADDRESS_GEOTAG;

    private String POSTAL_ADDRESS_DOMICILE;

    private String NEXTOFKINID;

    private String REGISTRATIONID;

    private String REFERRINGDOCTOR;

    private String POSTAL_ESAM_CHECKED;

    private String CITIZEN_SOURCE;

    private String PRONOUNCODE;

    private String HUCNUMBER;

    private String NOREMINDERS;

    private String QED;

    private String MEDVIEW;

    private String HEADOFFAMILYID;

    private String CSCHOLDER;

    private String ADDRESS_NOTVALID_REASON;

    private String EXTERNALID;

    private String DVACODE;

    private String ENROLMENTID;

    private String ETHNIC2CODE;

    private String ESCRIPTDEFAULT;

    private String VPE;

    private String CSCNUMBER;

    private String MCOLVERIFYDATE;

    private String RECORDNO;

    private String HCHCURRENT;

    private String CREATED;

    private String POSTAL_ADDRESS_NOTVALID_REASON;

    private String PENSIONEXPIRY;

    private String HEALTHFUNDNO;

    private String IHIVALIDATION;

    private String IWI;

    private String UPDATEDBY;

    private String GENDERCODE;

    private String PUBLICFUNDING;

    private String ADDRESS1;

    private String HEALTHFUNDEXPIRY;

    private String CREATEDBY;

    private String CITIZEN;

    private String ADDRESS2;

    private String WORKPHONE;

    private String REFERRALDATE;

    private String MEDICARENO;

    private String SURNAME;

    private String PENSIONCODE;

    private String ESCRIPTTOKEN;

    private String PREFERREDNAME;

    private String DATEOFDEATHSOURCE;

    private String USEMBADDRESS;

    private String OVERALL_PATIENTVERSION;

    private String MEDICARELINENO;

    private String PREVIOUSUSERID;

    private String COUNTRYOFBIRTH_SOURCE;

    private String ATRISKOFCOVID;

    private String TITLECODE;

    private String INCSUPPNUMBER;

    private String CONTACTMETHOD;

    private String CTG;

    private String IHIVALIDATED;

    private String DISPENSE;

    @Override
    public String toString() {
        return "ClassPojo [POSTAL_SUBURB = " + POSTAL_SUBURB + ", DOB_SOURCE = " + DOB_SOURCE + ", MOBILEPHONE = " + MOBILEPHONE + ", ADDRESS_VERSION = " + ADDRESS_VERSION + ", IHISOURCE = " + IHISOURCE + ", NAME_TYPE = " + NAME_TYPE + ", RECORDSTATUS = " + RECORDSTATUS + ", FIRSTNAME = " + FIRSTNAME + ", IHI = " + IHI + ", NAME_VERSION = " + NAME_VERSION + ", DEFAULTVISITTYPE = " + DEFAULTVISITTYPE + ", ADDRESS_SETID = " + ADDRESS_SETID + ", PATIENTSTATUS = " + PATIENTSTATUS + ", DOB = " + DOB + ", DVANO = " + DVANO + ", PENSIONSTART = " + PENSIONSTART + ", EMERGENCYID = " + EMERGENCYID + ", ETHNICCODE = " + ETHNICCODE + ", REFERRALCODE = " + REFERRALCODE + ", DENYACCESS = " + DENYACCESS + ", CONSENTSMSREMINDER = " + CONSENTSMSREMINDER + ", HEALTHFUNDNAME = " + HEALTHFUNDNAME + ", ELIGIBLE_PUBLIC_FUNDING = " + ELIGIBLE_PUBLIC_FUNDING + ", CSCVALID = " + CSCVALID + ", CSCEXPIRY = " + CSCEXPIRY + ", HUCVALID = " + HUCVALID + ", ENROLMENTCHECK = " + ENROLMENTCHECK + ", RELIGION = " + RELIGION + ", POSTALADDRESS = " + POSTALADDRESS + ", PHARMACYID = " + PHARMACYID + ", HCHTIER = " + HCHTIER + ", CORE_VERSION = " + CORE_VERSION + ", COUNTRYOFBIRTH = " + COUNTRYOFBIRTH + ", POSTCODE = " + POSTCODE + ", UPDATED = " + UPDATED + ", ERX = " + ERX + ", ETHNIC1CODE = " + ETHNIC1CODE + ", DIFFERENTIDENTITY = " + DIFFERENTIDENTITY + ", ORIGIN = " + ORIGIN + ", IHIRECORDSTATUS = " + IHIRECORDSTATUS + ", POSTALCOUNTRY = " + POSTALCOUNTRY + ", NAME_SOURCE = " + NAME_SOURCE + ", ADDRESS_GEOTAG = " + ADDRESS_GEOTAG + ", MOH_CHECKED = " + MOH_CHECKED + ", SAFETYNETNO = " + SAFETYNETNO + ", SEXCODE = " + SEXCODE + ", PENSIONNO = " + PENSIONNO + ", EXTRACTIONOPTOUT = " + EXTRACTIONOPTOUT + ", POSTALCITY = " + POSTALCITY + ", OTHERNOTES = " + OTHERNOTES + ", CITY = " + CITY + ", FINDEPENDANT = " + FINDEPENDANT + ", POSTALPOSTCODE = " + POSTALPOSTCODE + ", NAME_SETID = " + NAME_SETID + ", ESAM_CHECKED = " + ESAM_CHECKED + ", ACCOUNTCODE = " + ACCOUNTCODE + ", ADDRESS_DOMICILE = " + ADDRESS_DOMICILE + ", HEALTHFUNDID = " + HEALTHFUNDID + ", DATEOFDEATH = " + DATEOFDEATH + ", HCHSTARTED = " + HCHSTARTED + ", HUCEXPIRY = " + HUCEXPIRY + ", INTERNALID = " + INTERNALID + ", HOMEPHONE = " + HOMEPHONE + ", EMAIL = " + EMAIL + ", PLACEOFBIRTH = " + PLACEOFBIRTH + ", MEDICAREEXPIRY = " + MEDICAREEXPIRY + ", MIDDLENAME = " + MIDDLENAME + ", COUNTRY = " + COUNTRY + ", USERID = " + USERID + ", PENDINGMOBILECHANGE = " + PENDINGMOBILECHANGE + ", HUCHOLDER = " + HUCHOLDER + ", IHISTATUS = " + IHISTATUS + ", POSTAL_ADDRESS_GEOTAG = " + POSTAL_ADDRESS_GEOTAG + ", POSTAL_ADDRESS_DOMICILE = " + POSTAL_ADDRESS_DOMICILE + ", NEXTOFKINID = " + NEXTOFKINID + ", REGISTRATIONID = " + REGISTRATIONID + ", REFERRINGDOCTOR = " + REFERRINGDOCTOR + ", POSTAL_ESAM_CHECKED = " + POSTAL_ESAM_CHECKED + ", CITIZEN_SOURCE = " + CITIZEN_SOURCE + ", PRONOUNCODE = " + PRONOUNCODE + ", HUCNUMBER = " + HUCNUMBER + ", NOREMINDERS = " + NOREMINDERS + ", QED = " + QED + ", MEDVIEW = " + MEDVIEW + ", HEADOFFAMILYID = " + HEADOFFAMILYID + ", CSCHOLDER = " + CSCHOLDER + ", ADDRESS_NOTVALID_REASON = " + ADDRESS_NOTVALID_REASON + ", EXTERNALID = " + EXTERNALID + ", DVACODE = " + DVACODE + ", ENROLMENTID = " + ENROLMENTID + ", ETHNIC2CODE = " + ETHNIC2CODE + ", ESCRIPTDEFAULT = " + ESCRIPTDEFAULT + ", VPE = " + VPE + ", CSCNUMBER = " + CSCNUMBER + ", MCOLVERIFYDATE = " + MCOLVERIFYDATE + ", RECORDNO = " + RECORDNO + ", HCHCURRENT = " + HCHCURRENT + ", CREATED = " + CREATED + ", POSTAL_ADDRESS_NOTVALID_REASON = " + POSTAL_ADDRESS_NOTVALID_REASON + ", PENSIONEXPIRY = " + PENSIONEXPIRY + ", HEALTHFUNDNO = " + HEALTHFUNDNO + ", IHIVALIDATION = " + IHIVALIDATION + ", IWI = " + IWI + ", UPDATEDBY = " + UPDATEDBY + ", GENDERCODE = " + GENDERCODE + ", PUBLICFUNDING = " + PUBLICFUNDING + ", ADDRESS1 = " + ADDRESS1 + ", HEALTHFUNDEXPIRY = " + HEALTHFUNDEXPIRY + ", CREATEDBY = " + CREATEDBY + ", CITIZEN = " + CITIZEN + ", ADDRESS2 = " + ADDRESS2 + ", WORKPHONE = " + WORKPHONE + ", REFERRALDATE = " + REFERRALDATE + ", MEDICARENO = " + MEDICARENO + ", SURNAME = " + SURNAME + ", PENSIONCODE = " + PENSIONCODE + ", ESCRIPTTOKEN = " + ESCRIPTTOKEN + ", PREFERREDNAME = " + PREFERREDNAME + ", DATEOFDEATHSOURCE = " + DATEOFDEATHSOURCE + ", USEMBADDRESS = " + USEMBADDRESS + ", OVERALL_PATIENTVERSION = " + OVERALL_PATIENTVERSION + ", MEDICARELINENO = " + MEDICARELINENO + ", PREVIOUSUSERID = " + PREVIOUSUSERID + ", COUNTRYOFBIRTH_SOURCE = " + COUNTRYOFBIRTH_SOURCE + ", ATRISKOFCOVID = " + ATRISKOFCOVID + ", TITLECODE = " + TITLECODE + ", INCSUPPNUMBER = " + INCSUPPNUMBER + ", CONTACTMETHOD = " + CONTACTMETHOD + ", CTG = " + CTG + ", IHIVALIDATED = " + IHIVALIDATED + ", DISPENSE = " + DISPENSE + "]";
    }
}
			
		