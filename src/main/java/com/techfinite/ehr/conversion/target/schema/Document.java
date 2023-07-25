package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class Document {

    private String LOCATIONID;

    private String STORED;

    private String CONTACTNAME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String FIRSTNAME;

    private String INTERNALID;

    private String CONTACTID;

    private String COMMENT;

    private String ORIGIN;

    private String CORRESPONDENCEDATE;

    private String CREATED;

    private DocumentPage DocumentPage;

    private String CATEGORY;

    private String CLINICALIMAGE;

    private String USERID;

    private String UPDATEDBY;

    private String CREATEDBY;

    @XmlElement(name="DocumentID")
    private String DOCUMENTID;

    private String SURNAME;

    private String STATUSCODE;

    private String SENDERNAME;

    private String DETAIL;

    private String CONFIDENTIALFLAG;

    private String ACTION;

    private String ACTIONDATE;

    private String USERREFERENCE;

    private String CHECKDATE;

    private String NOTATION;

    private String SUBJECT;

    private String TITLE;

    private String ACTIONED;

    private String PAGESETTINGS;

    private String CHECKEDBY;

    @Override
    public String toString() {
        return "ClassPojo [LOCATIONID = " + LOCATIONID + ", STORED = " + STORED + ", CONTACTNAME = " + CONTACTNAME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", FIRSTNAME = " + FIRSTNAME + ", INTERNALID = " + INTERNALID + ", CONTACTID = " + CONTACTID + ", COMMENT = " + COMMENT + ", ORIGIN = " + ORIGIN + ", CORRESPONDENCEDATE = " + CORRESPONDENCEDATE + ", CREATED = " + CREATED + ", DocumentPage = " + DocumentPage + ", CATEGORY = " + CATEGORY + ", CLINICALIMAGE = " + CLINICALIMAGE + ", USERID = " + USERID + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + ", DOCUMENTID = " + DOCUMENTID + ", SURNAME = " + SURNAME + ", STATUSCODE = " + STATUSCODE + ", SENDERNAME = " + SENDERNAME + ", DETAIL = " + DETAIL + ", CONFIDENTIALFLAG = " + CONFIDENTIALFLAG + ", ACTION = " + ACTION + ", ACTIONDATE = " + ACTIONDATE + ", USERREFERENCE = " + USERREFERENCE + ", CHECKDATE = " + CHECKDATE + ", NOTATION = " + NOTATION + ", SUBJECT = " + SUBJECT + ", TITLE = " + TITLE + ", ACTIONED = " + ACTIONED + ", PAGESETTINGS = " + PAGESETTINGS + ", CHECKEDBY = " + CHECKEDBY + "]";
    }
}
	