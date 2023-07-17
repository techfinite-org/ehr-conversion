package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Medication {

    private String ROUTE;

    private String LASTQUANTITY;

    private String INITIALDISPENSEPERIOD;

    private String AUTHORITYEXPIRY;

    private String QUANTITY;

    private String RECORDSTATUS;

    private String BARCODE;

    private String RPPA;

    private String INTERNALID;

    private String DRUGNAME;

    private String PRN;

    private String INDICATION;

    private String INCLUDEBRAND;

    private String AUTHORITYINDICATION;

    private String SUMMARY;

    private String SPECIALISTRECOMMENDATION;

    private String SCIDNO;

    private String OTHERDETAIL;

    private String VISITID;

    private String RXSTATUS;

    private String REPEATS;

    private String REGULATION24;

    private String SAHCNO;

    private String SENDTOPATIENT;

    private String DELETIONREASON;

    private String REPEATINTERVAL;

    private String INDICATIONCODE;

    private String AUTHORITYCODE;

    private String PRODUCTUNIT;

    private String RESTRICTIONCODE;

    private String DELETIONDATE;

    private String RECORDID;

    private String AUTHORITY;

    private String FIRSTDATE;

    private String UNUSUALDOSE;

    private String DOSE;

    private String USEPBSQUANTITY;

    private String PACKID;

    private String COMPLIANCECHECK;

    private String CERTIFIEDCONDITION;

    private String UPDATED;

    private String DURATIONUNIT;

    private String PRODUCTID;

    private String TGPEXEMPT;

    private String SCID;

    private String ALLOWSUBSTITUTION;

    private String COMMENT;

    private String ASLCONSENT;

    private String CREATED;

    private String DOSESPERDAY;

    private String FREQUENTDISPENSE;

    private String FREQUENCY;

    private String UPDATEDBY;

    private String NPDRCONSENT;

    private String CREATEDBY;

    private String LASTREPEATS;

    private String AUTHORITYDETAIL;

    private String PREVIOUSAUTHORITY;

    private String INSTRUCTIONS;

    private String AUTHORITYNUMBER;

    private String PATIENTCONSENT;

    private String APPROVALNUMBER;

    private String LASTDATE;

    private String VISITUPDATED;

    private String DURATION;

    private String FOOD;

    @Override
    public String toString() {
        return "ClassPojo [ROUTE = " + ROUTE + ", LASTQUANTITY = " + LASTQUANTITY + ", INITIALDISPENSEPERIOD = " + INITIALDISPENSEPERIOD + ", AUTHORITYEXPIRY = " + AUTHORITYEXPIRY + ", QUANTITY = " + QUANTITY + ", RECORDSTATUS = " + RECORDSTATUS + ", BARCODE = " + BARCODE + ", RPPA = " + RPPA + ", INTERNALID = " + INTERNALID + ", DRUGNAME = " + DRUGNAME + ", PRN = " + PRN + ", INDICATION = " + INDICATION + ", INCLUDEBRAND = " + INCLUDEBRAND + ", AUTHORITYINDICATION = " + AUTHORITYINDICATION + ", SUMMARY = " + SUMMARY + ", SPECIALISTRECOMMENDATION = " + SPECIALISTRECOMMENDATION + ", SCIDNO = " + SCIDNO + ", OTHERDETAIL = " + OTHERDETAIL + ", VISITID = " + VISITID + ", RXSTATUS = " + RXSTATUS + ", REPEATS = " + REPEATS + ", REGULATION24 = " + REGULATION24 + ", SAHCNO = " + SAHCNO + ", SENDTOPATIENT = " + SENDTOPATIENT + ", DELETIONREASON = " + DELETIONREASON + ", REPEATINTERVAL = " + REPEATINTERVAL + ", INDICATIONCODE = " + INDICATIONCODE + ", AUTHORITYCODE = " + AUTHORITYCODE + ", PRODUCTUNIT = " + PRODUCTUNIT + ", RESTRICTIONCODE = " + RESTRICTIONCODE + ", DELETIONDATE = " + DELETIONDATE + ", RECORDID = " + RECORDID + ", AUTHORITY = " + AUTHORITY + ", FIRSTDATE = " + FIRSTDATE + ", UNUSUALDOSE = " + UNUSUALDOSE + ", DOSE = " + DOSE + ", USEPBSQUANTITY = " + USEPBSQUANTITY + ", PACKID = " + PACKID + ", COMPLIANCECHECK = " + COMPLIANCECHECK + ", CERTIFIEDCONDITION = " + CERTIFIEDCONDITION + ", UPDATED = " + UPDATED + ", DURATIONUNIT = " + DURATIONUNIT + ", PRODUCTID = " + PRODUCTID + ", TGPEXEMPT = " + TGPEXEMPT + ", SCID = " + SCID + ", ALLOWSUBSTITUTION = " + ALLOWSUBSTITUTION + ", COMMENT = " + COMMENT + ", ASLCONSENT = " + ASLCONSENT + ", CREATED = " + CREATED + ", DOSESPERDAY = " + DOSESPERDAY + ", FREQUENTDISPENSE = " + FREQUENTDISPENSE + ", FREQUENCY = " + FREQUENCY + ", UPDATEDBY = " + UPDATEDBY + ", NPDRCONSENT = " + NPDRCONSENT + ", CREATEDBY = " + CREATEDBY + ", LASTREPEATS = " + LASTREPEATS + ", AUTHORITYDETAIL = " + AUTHORITYDETAIL + ", PREVIOUSAUTHORITY = " + PREVIOUSAUTHORITY + ", INSTRUCTIONS = " + INSTRUCTIONS + ", AUTHORITYNUMBER = " + AUTHORITYNUMBER + ", PATIENTCONSENT = " + PATIENTCONSENT + ", APPROVALNUMBER = " + APPROVALNUMBER + ", LASTDATE = " + LASTDATE + ", VISITUPDATED = " + VISITUPDATED + ", DURATION = " + DURATION + ", FOOD = " + FOOD + "]";
    }
}