package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SentReminder {

    private String LOCATIONID;

    private String ACTIONBY;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String SENTCODE;

    private String RECORDID;

    private String SENTDATE;

    private String ACTIONCODE;

    private String CREATED;

    private String CONTACTNOTEID;

    private String TEMPLATEID;

    private String ACTIONDATE;

    private String USERID;

    private String ACTIONTEXT;

    private String UPDATEDBY;

    private String SENTBY;

    private String CREATEDBY;

    private String REMINDERID;

    @Override
    public String toString() {
        return "ClassPojo [LOCATIONID = " + LOCATIONID + ", ACTIONBY = " + ACTIONBY + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", SENTCODE = " + SENTCODE + ", RECORDID = " + RECORDID + ", SENTDATE = " + SENTDATE + ", ACTIONCODE = " + ACTIONCODE + ", CREATED = " + CREATED + ", CONTACTNOTEID = " + CONTACTNOTEID + ", TEMPLATEID = " + TEMPLATEID + ", ACTIONDATE = " + ACTIONDATE + ", USERID = " + USERID + ", ACTIONTEXT = " + ACTIONTEXT + ", UPDATEDBY = " + UPDATEDBY + ", SENTBY = " + SENTBY + ", CREATEDBY = " + CREATEDBY + ", REMINDERID = " + REMINDERID + "]";
    }
}
			
	