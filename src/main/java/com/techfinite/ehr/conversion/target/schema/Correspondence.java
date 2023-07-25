package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class Correspondence {

    private String LOCATIONID;

    private String STORED;

    private String CONTACTNAME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String FIRSTNAME;

    private String INTERNALID;

    private String CONTACTID;

    private String COMMENT;

    private String CORRESPONDENCEDATE;

    private String CREATED;

    private String ORIGIN;

    private String CATEGORY;

    private String USERID;

    private String UPDATEDBY;

    private String CONTENT;

    private String DOCTYPE;

    private String CREATEDBY;

    private String SURNAME;

    private String STATUSCODE;

    private String SENDERNAME;

    private String RECORDID;

    private String CONFIDENTIALFLAG;

    private String ACTION;

    private String ACTIONDATE;

    private String CHECKDATE;

    private String USERREFERENCE;

    private String NOTATION;

    private String SUBJECT;

    private String TITLE;

    private String ACTIONED;

    private String PAGESETTINGS;

    private String CHECKEDBY;

    @Override
    public String toString() {
        return "ClassPojo [LOCATIONID = " + LOCATIONID + ", STORED = " + STORED + ", CONTACTNAME = " + CONTACTNAME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", FIRSTNAME = " + FIRSTNAME + ", INTERNALID = " + INTERNALID + ", CONTACTID = " + CONTACTID + ", COMMENT = " + COMMENT + ", CORRESPONDENCEDATE = " + CORRESPONDENCEDATE + ", CREATED = " + CREATED + ", ORIGIN = " + ORIGIN + ", CATEGORY = " + CATEGORY + ", USERID = " + USERID + ", UPDATEDBY = " + UPDATEDBY + ", CONTENT = " + CONTENT + ", DOCTYPE = " + DOCTYPE + ", CREATEDBY = " + CREATEDBY + ", SURNAME = " + SURNAME + ", STATUSCODE = " + STATUSCODE + ", SENDERNAME = " + SENDERNAME + ", RECORDID = " + RECORDID + ", CONFIDENTIALFLAG = " + CONFIDENTIALFLAG + ", ACTION = " + ACTION + ", ACTIONDATE = " + ACTIONDATE + ", CHECKDATE = " + CHECKDATE + ", USERREFERENCE = " + USERREFERENCE + ", NOTATION = " + NOTATION + ", SUBJECT = " + SUBJECT + ", TITLE = " + TITLE + ", ACTIONED = " + ACTIONED + ", PAGESETTINGS = " + PAGESETTINGS + ", CHECKEDBY = " + CHECKEDBY + "]";
    }
}
	