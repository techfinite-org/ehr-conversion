package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ClinicalDetails {

    private String POWEROFATTORNEY;

    private String CAUSEOFDEATH;

    private String WEBSTER;

    private String OTHERCOMMENT;

    private String UPDATED;

    private String INTERNALID;

    private String RECREATION;

    private String CREATED;

    private String MARITALSTATUS;

    private String PASTHISTORY;

    private String ACCOMODATION;

    private String PACEMAKER;

    private String UPDATEDBY;

    private String ALCOHOLSTATUS;

    private String SEXUALITY;

    private String HASCARER;

    private String CREATEDBY;

    private String FAMILYHISTORY;

    private String SHS;

    private String SAFEINHOME;

    private String ACD;

    private String BLOODGROUP;

    private String SMOKINGSTATUS;

    private String ELITESPORTS;

    private String DRNOTECOMPLETEDUSERID;

    private String CAUSEOFDEATHCODE;

    private String ISCARER;

    private String DRNOTE;

    private String RH;

    private String RETIRED;

    private String NIR;

    private String SOCIALHX;

    private String HIDEDRNOTE;

    private String LIVESWITH;

    private String PCEHR;

    private String KNOWNALLERGIES;

    @Override
    public String toString() {
        return "ClassPojo [POWEROFATTORNEY = " + POWEROFATTORNEY + ", CAUSEOFDEATH = " + CAUSEOFDEATH + ", WEBSTER = " + WEBSTER + ", OTHERCOMMENT = " + OTHERCOMMENT + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", RECREATION = " + RECREATION + ", CREATED = " + CREATED + ", MARITALSTATUS = " + MARITALSTATUS + ", PASTHISTORY = " + PASTHISTORY + ", ACCOMODATION = " + ACCOMODATION + ", PACEMAKER = " + PACEMAKER + ", UPDATEDBY = " + UPDATEDBY + ", ALCOHOLSTATUS = " + ALCOHOLSTATUS + ", SEXUALITY = " + SEXUALITY + ", HASCARER = " + HASCARER + ", CREATEDBY = " + CREATEDBY + ", FAMILYHISTORY = " + FAMILYHISTORY + ", SHS = " + SHS + ", SAFEINHOME = " + SAFEINHOME + ", ACD = " + ACD + ", BLOODGROUP = " + BLOODGROUP + ", SMOKINGSTATUS = " + SMOKINGSTATUS + ", ELITESPORTS = " + ELITESPORTS + ", DRNOTECOMPLETEDUSERID = " + DRNOTECOMPLETEDUSERID + ", CAUSEOFDEATHCODE = " + CAUSEOFDEATHCODE + ", ISCARER = " + ISCARER + ", DRNOTE = " + DRNOTE + ", RH = " + RH + ", RETIRED = " + RETIRED + ", NIR = " + NIR + ", SOCIALHX = " + SOCIALHX + ", HIDEDRNOTE = " + HIDEDRNOTE + ", LIVESWITH = " + LIVESWITH + ", PCEHR = " + PCEHR + ", KNOWNALLERGIES = " + KNOWNALLERGIES + "]";
    }
}
			
		