package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Observation {

    private String DATANAME;

    private String MODIFIER;

    private String OBSTIME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String DATAVALUE;

    private String RECORDID;

    private String CREATED;

    private String PRIMARYOBS;

    private String OBSDATE;

    private String USERID;

    private String DATACODE;

    private String UPDATEDBY;

    private String CREATEDBY;

    @Override
    public String toString() {
        return "ClassPojo [DATANAME = " + DATANAME + ", MODIFIER = " + MODIFIER + ", OBSTIME = " + OBSTIME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", DATAVALUE = " + DATAVALUE + ", RECORDID = " + RECORDID + ", CREATED = " + CREATED + ", PRIMARYOBS = " + PRIMARYOBS + ", OBSDATE = " + OBSDATE + ", USERID = " + USERID + ", DATACODE = " + DATACODE + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + "]";
    }
}