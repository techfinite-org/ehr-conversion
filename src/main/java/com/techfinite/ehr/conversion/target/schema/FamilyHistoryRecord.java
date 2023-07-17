package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FamilyHistoryRecord {

    private String FHCOMMENT;

    private String PATCAUSEOFDEATH;

    private String MATAGEATDEATH;

    private String RECORDSTATUS;

    private String UPDATED;

    private String MATCAUSEOFDEATH;

    private String INTERNALID;

    private String PATALIVE;

    private String PATAGEATDEATH;

    private String ADOPTED;

    private String MATCAUSEOFDEATHCODE;

    private String CREATED;

    private String MATALIVE;

    private String PATCAUSEOFDEATHCODE;

    private String UPDATEDBY;

    private String CREATEDBY;

    @Override
    public String toString() {
        return "ClassPojo [FHCOMMENT = " + FHCOMMENT + ", PATCAUSEOFDEATH = " + PATCAUSEOFDEATH + ", MATAGEATDEATH = " + MATAGEATDEATH + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", MATCAUSEOFDEATH = " + MATCAUSEOFDEATH + ", INTERNALID = " + INTERNALID + ", PATALIVE = " + PATALIVE + ", PATAGEATDEATH = " + PATAGEATDEATH + ", ADOPTED = " + ADOPTED + ", MATCAUSEOFDEATHCODE = " + MATCAUSEOFDEATHCODE + ", CREATED = " + CREATED + ", MATALIVE = " + MATALIVE + ", PATCAUSEOFDEATHCODE = " + PATCAUSEOFDEATHCODE + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + "]";
    }
}