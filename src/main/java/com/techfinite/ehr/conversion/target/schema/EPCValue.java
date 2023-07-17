package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EPCValue {

    private String RECORDDATE;

    private String DATANAME;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String DATAVALUE;

    private String RECORDID;

    private String CREATED;

    private String DATATYPE;

    private String DATADATE;

    private String USERID;

    private String DATASTRING;

    private String UPDATEDBY;

    private String CREATEDBY;

    private String REPORTID;

    @Override
    public String toString() {
        return "ClassPojo [RECORDDATE = " + RECORDDATE + ", DATANAME = " + DATANAME + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", DATAVALUE = " + DATAVALUE + ", RECORDID = " + RECORDID + ", CREATED = " + CREATED + ", DATATYPE = " + DATATYPE + ", DATADATE = " + DATADATE + ", USERID = " + USERID + ", DATASTRING = " + DATASTRING + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + ", REPORTID = " + REPORTID + "]";
    }
}
			