package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Action {

    private String PERFORMEDTITLE;

    private String SURNAME;

    private String PERFORMED;

    private String PERFORMEDSURNAME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String PRIORITY;

    private String FIRSTNAME;

    private String INTERNALID;

    private String RECORDID;

    private String COMMENT;

    private String PREVIOUSUSERID;

    private String PERFORMEDBY;

    private String CREATED;

    private String ADDED;

    private String USERID;

    private String ACTIONTEXT;

    private String TITLE;

    private String UPDATEDBY;

    private String PERFORMEDFIRSTNAME;

    private String DUEDATE;

    private String CREATEDBY;

    private String ACTIONSTATUS;

    private String STATUSTEXT;

    @Override
    public String toString() {
        return "ClassPojo [PERFORMEDTITLE = " + PERFORMEDTITLE + ", SURNAME = " + SURNAME + ", PERFORMED = " + PERFORMED + ", PERFORMEDSURNAME = " + PERFORMEDSURNAME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", PRIORITY = " + PRIORITY + ", FIRSTNAME = " + FIRSTNAME + ", INTERNALID = " + INTERNALID + ", RECORDID = " + RECORDID + ", COMMENT = " + COMMENT + ", PREVIOUSUSERID = " + PREVIOUSUSERID + ", PERFORMEDBY = " + PERFORMEDBY + ", CREATED = " + CREATED + ", ADDED = " + ADDED + ", USERID = " + USERID + ", ACTIONTEXT = " + ACTIONTEXT + ", TITLE = " + TITLE + ", UPDATEDBY = " + UPDATEDBY + ", PERFORMEDFIRSTNAME = " + PERFORMEDFIRSTNAME + ", DUEDATE = " + DUEDATE + ", CREATEDBY = " + CREATEDBY + ", ACTIONSTATUS = " + ACTIONSTATUS + ", STATUSTEXT = " + STATUSTEXT + "]";
    }
}
	