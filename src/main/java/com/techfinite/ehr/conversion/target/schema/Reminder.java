package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Reminder {

    private String LOCATIONID;

    private String REMINDERREASONID;

    private String RECORDSTATUS;

    private String UPDATED;

    private String COMMENTS;

    private String INTERNALID;

    private String CREATED;

    private String REMINDERCODE;

    private String USERID;

    private String REMINDERDUE;

    private String UPDATEDBY;

    private String VISITID;

    private String CREATEDBY;

    private String REMINDERID;

    private String STATUSTEXT;

    private String INTERVAL;

    private String INTERVALCODE;

    private String USERFIRSTNAME;

    private String PREVIOUSUSERID;

    private String BATCHID;

    private String APPOINTMENTID;

    private String REASONTEXT;

    private String USERTITLE;

    private String USERSURNAME;

    private String REMINDERSTATUS;

    @Override
    public String toString() {
        return "ClassPojo [LOCATIONID = " + LOCATIONID + ", REMINDERREASONID = " + REMINDERREASONID + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", COMMENTS = " + COMMENTS + ", INTERNALID = " + INTERNALID + ", CREATED = " + CREATED + ", REMINDERCODE = " + REMINDERCODE + ", USERID = " + USERID + ", REMINDERDUE = " + REMINDERDUE + ", UPDATEDBY = " + UPDATEDBY + ", VISITID = " + VISITID + ", CREATEDBY = " + CREATEDBY + ", REMINDERID = " + REMINDERID + ", STATUSTEXT = " + STATUSTEXT + ", INTERVAL = " + INTERVAL + ", INTERVALCODE = " + INTERVALCODE + ", USERFIRSTNAME = " + USERFIRSTNAME + ", PREVIOUSUSERID = " + PREVIOUSUSERID + ", BATCHID = " + BATCHID + ", APPOINTMENTID = " + APPOINTMENTID + ", REASONTEXT = " + REASONTEXT + ", USERTITLE = " + USERTITLE + ", USERSURNAME = " + USERSURNAME + ", REMINDERSTATUS = " + REMINDERSTATUS + "]";
    }
}
			
	