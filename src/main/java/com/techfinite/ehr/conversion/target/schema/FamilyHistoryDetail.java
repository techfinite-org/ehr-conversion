package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FamilyHistoryDetail {

    private String CREATED;

    private String RELATIONCODE;

    private String DISEASECOMMENT;

    private String RECORDSTATUS;

    private String UPDATED;

    private String RELATIONNO;

    private String CONDITION;

    private String INTERNALID;

    private String UPDATEDBY;

    private String DISEASECODE;

    private String CREATEDBY;

    private String RECORDID;

    @Override
    public String toString() {
        return "ClassPojo [CREATED = " + CREATED + ", RELATIONCODE = " + RELATIONCODE + ", DISEASECOMMENT = " + DISEASECOMMENT + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", RELATIONNO = " + RELATIONNO + ", CONDITION = " + CONDITION + ", INTERNALID = " + INTERNALID + ", UPDATEDBY = " + UPDATEDBY + ", DISEASECODE = " + DISEASECODE + ", CREATEDBY = " + CREATEDBY + ", RECORDID = " + RECORDID + "]";
    }
}
	