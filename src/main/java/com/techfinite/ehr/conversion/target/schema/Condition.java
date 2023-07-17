package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Condition {

    private String MONTH;

    private String DETAILS;

    private String COMPOUND;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String LOCATIONCODE;

    private String ACUTECODE;

    private String CREATED;

    private String YEAR;

    private String SEVERITYCODE;

    private String PROVISIONAL;

    private String USERID;

    private String SPIRAL;

    private String UPDATEDBY;

    private String VISITID;

    private String ITEMCODE;

    private String CREATEDBY;

    private String MOMPATH;

    private String ITEMTEXT;

    private String PRIVACYCODE;

    private String STATUSCODE;

    private String DESCRIPTIONCODE;

    private String MOM;

    private String RECORDID;

    private String FRACTURE;

    private String DISPLACED;

    private String SUMMARYCODE;

    private String GREENSTICK;

    private String COMMINUTED;

    private String PCEHR;

    private String POSITIONCODE;

    private String DAY;

    private String VISITUPDATED;

    @Override
    public String toString() {
        return "ClassPojo [MONTH = " + MONTH + ", DETAILS = " + DETAILS + ", COMPOUND = " + COMPOUND + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", LOCATIONCODE = " + LOCATIONCODE + ", ACUTECODE = " + ACUTECODE + ", CREATED = " + CREATED + ", YEAR = " + YEAR + ", SEVERITYCODE = " + SEVERITYCODE + ", PROVISIONAL = " + PROVISIONAL + ", USERID = " + USERID + ", SPIRAL = " + SPIRAL + ", UPDATEDBY = " + UPDATEDBY + ", VISITID = " + VISITID + ", ITEMCODE = " + ITEMCODE + ", CREATEDBY = " + CREATEDBY + ", MOMPATH = " + MOMPATH + ", ITEMTEXT = " + ITEMTEXT + ", PRIVACYCODE = " + PRIVACYCODE + ", STATUSCODE = " + STATUSCODE + ", DESCRIPTIONCODE = " + DESCRIPTIONCODE + ", MOM = " + MOM + ", RECORDID = " + RECORDID + ", FRACTURE = " + FRACTURE + ", DISPLACED = " + DISPLACED + ", SUMMARYCODE = " + SUMMARYCODE + ", GREENSTICK = " + GREENSTICK + ", COMMINUTED = " + COMMINUTED + ", PCEHR = " + PCEHR + ", POSITIONCODE = " + POSITIONCODE + ", DAY = " + DAY + ", VISITUPDATED = " + VISITUPDATED + "]";
    }
}
		