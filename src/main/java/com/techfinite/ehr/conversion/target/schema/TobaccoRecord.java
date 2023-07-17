package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TobaccoRecord {

    private String YEARSTARTED;

    private String MEDICATION;

    private String SMOKINGTYPE;

    private String PASTSMOKESPERDAY;

    private String PASTSMOKINGCODE;

    private String SMOKINGCODE;

    private String SMOKESPERDAY;

    private String PASTSTARTED;

    private String RECORDSTATUS;

    private String UPDATED;

    private String ADVICE;

    private String REFERRAL;

    private String INTERNALID;

    private String RECORDID;

    private String COMMENT;

    private String CESSATION;

    private String PASTSTOPPED;

    private String SUPPORT;

    private String CREATED;

    private String UPDATEDBY;

    private String CREATEDBY;


    @Override
    public String toString() {
        return "ClassPojo [YEARSTARTED = " + YEARSTARTED + ", MEDICATION = " + MEDICATION + ", SMOKINGTYPE = " + SMOKINGTYPE + ", PASTSMOKESPERDAY = " + PASTSMOKESPERDAY + ", PASTSMOKINGCODE = " + PASTSMOKINGCODE + ", SMOKINGCODE = " + SMOKINGCODE + ", SMOKESPERDAY = " + SMOKESPERDAY + ", PASTSTARTED = " + PASTSTARTED + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", ADVICE = " + ADVICE + ", REFERRAL = " + REFERRAL + ", INTERNALID = " + INTERNALID + ", RECORDID = " + RECORDID + ", COMMENT = " + COMMENT + ", CESSATION = " + CESSATION + ", PASTSTOPPED = " + PASTSTOPPED + ", SUPPORT = " + SUPPORT + ", CREATED = " + CREATED + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + "]";
    }
}