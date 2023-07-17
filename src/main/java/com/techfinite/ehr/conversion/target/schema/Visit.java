package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Visit {

    private String LOCATION;

    private String ENDTIME;

    private String DRNAME;

    private String RECORDSTATUS;

    private String VISITNOTES;

    private String UPDATED;

    private String REVIEWDATE;

    private String INTERNALID;

    private String PREVIOUSUSERID;

    private String VISITDATE;

    private String VISITCODE;

    private String CREATED;

    private String STARTTIME;

    private String USERID;

    private String RECORDEDDATE;

    private String VISITID;

    private String UPDATEDBY;

    private String CREATEDBY;

    private String DURATION;

    private String CONFIDENTIAL;

    private String HISTORY;

    private String EXAM;

    @Override
    public String toString() {
        return "ClassPojo [LOCATION = " + LOCATION + ", ENDTIME = " + ENDTIME + ", DRNAME = " + DRNAME + ", RECORDSTATUS = " + RECORDSTATUS + ", VISITNOTES = " + VISITNOTES + ", UPDATED = " + UPDATED + ", REVIEWDATE = " + REVIEWDATE + ", INTERNALID = " + INTERNALID + ", PREVIOUSUSERID = " + PREVIOUSUSERID + ", VISITDATE = " + VISITDATE + ", VISITCODE = " + VISITCODE + ", CREATED = " + CREATED + ", STARTTIME = " + STARTTIME + ", USERID = " + USERID + ", RECORDEDDATE = " + RECORDEDDATE + ", VISITID = " + VISITID + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + ", DURATION = " + DURATION + ", CONFIDENTIAL = " + CONFIDENTIAL + ", HISTORY = " + HISTORY + ", EXAM = " + EXAM + "]";
    }
}
	