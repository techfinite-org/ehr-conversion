package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EPCReport {

    private String REPORTSUBTYPE;

    private String SURNAME;

    private String STORED;

    private String RECORDSTATUS;

    private String UPDATED;

    private String FIRSTNAME;

    private String INTERNALID;

    private String REPORTDATE;

    private String REPORTSTATUS;

    private String CREATED;

    private String USERID;

    private String REPORTTYPE;

    private String TITLE;

    private String UPDATEDBY;

    private String CONTENT;

    private String PAGESETTINGS;

    private String CREATEDBY;

    private String REPORTID;

    private String DURATION;

    @Override
    public String toString() {
        return "ClassPojo [REPORTSUBTYPE = " + REPORTSUBTYPE + ", SURNAME = " + SURNAME + ", STORED = " + STORED + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", FIRSTNAME = " + FIRSTNAME + ", INTERNALID = " + INTERNALID + ", REPORTDATE = " + REPORTDATE + ", REPORTSTATUS = " + REPORTSTATUS + ", CREATED = " + CREATED + ", USERID = " + USERID + ", REPORTTYPE = " + REPORTTYPE + ", TITLE = " + TITLE + ", UPDATEDBY = " + UPDATEDBY + ", CONTENT = " + CONTENT + ", PAGESETTINGS = " + PAGESETTINGS + ", CREATEDBY = " + CREATEDBY + ", REPORTID = " + REPORTID + ", DURATION = " + DURATION + "]";
    }
}
	