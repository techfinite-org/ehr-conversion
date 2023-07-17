package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Parameter {

    private String DATATIME;

    private String DATANAME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String DATAVALUE;

    private String RECORDID;

    private String CREATED;

    private String DATADATE;

    private String USERID;

    private String DATACODE;

    private String UPDATEDBY;

    private String CREATEDBY;

    @Override
    public String toString() {
        return "ClassPojo [DATATIME = " + DATATIME + ", DATANAME = " + DATANAME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", DATAVALUE = " + DATAVALUE + ", RECORDID = " + RECORDID + ", CREATED = " + CREATED + ", DATADATE = " + DATADATE + ", USERID = " + USERID + ", DATACODE = " + DATACODE + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + "]";
    }
}
	