package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Reason {

    private String COMPOUND;

    private String DESCRIPTIONCODE;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String RECORDID;

    private String LOCATIONCODE;

    private String FRACTURE;

    private String REASONCODE;

    private String CREATED;

    private String ACUTECODE;

    private String DISPLACED;

    private String SEVERITYCODE;

    private String GREENSTICK;

    private String COMMINUTED;

    private String SPIRAL;

    private String CONDITION;

    private String VISITID;

    private String UPDATEDBY;

    private String POSITIONCODE;

    private String REASON;

    private String CREATEDBY;

    @Override
    public String toString() {
        return "ClassPojo [COMPOUND = " + COMPOUND + ", DESCRIPTIONCODE = " + DESCRIPTIONCODE + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", RECORDID = " + RECORDID + ", LOCATIONCODE = " + LOCATIONCODE + ", FRACTURE = " + FRACTURE + ", REASONCODE = " + REASONCODE + ", CREATED = " + CREATED + ", ACUTECODE = " + ACUTECODE + ", DISPLACED = " + DISPLACED + ", SEVERITYCODE = " + SEVERITYCODE + ", GREENSTICK = " + GREENSTICK + ", COMMINUTED = " + COMMINUTED + ", SPIRAL = " + SPIRAL + ", CONDITION = " + CONDITION + ", VISITID = " + VISITID + ", UPDATEDBY = " + UPDATEDBY + ", POSITIONCODE = " + POSITIONCODE + ", REASON = " + REASON + ", CREATEDBY = " + CREATEDBY + "]";
    }
}