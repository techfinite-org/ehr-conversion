package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientConsent {

    private String CONSENTEMAIL;

    private String OPTOUT;

    private String UPDATED;

    private String INTERNALID;

    private String SIGNEDCONSENT;

    private String HEALTHAWARENESS;

    private String CREATED;

    private String CLINICALREMINDERS;

    private String ENROLLEDSMS;

    private String CLINICALAWARENESS;

    private String UPDATEDBY;

    private String CREATEDBY;

    private String APPOINTMENTREMINDERS;

    private String ENROLLEDAPP;

    @Override
    public String toString() {
        return "ClassPojo [CONSENTEMAIL = " + CONSENTEMAIL + ", OPTOUT = " + OPTOUT + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", SIGNEDCONSENT = " + SIGNEDCONSENT + ", HEALTHAWARENESS = " + HEALTHAWARENESS + ", CREATED = " + CREATED + ", CLINICALREMINDERS = " + CLINICALREMINDERS + ", ENROLLEDSMS = " + ENROLLEDSMS + ", CLINICALAWARENESS = " + CLINICALAWARENESS + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + ", APPOINTMENTREMINDERS = " + APPOINTMENTREMINDERS + ", ENROLLEDAPP = " + ENROLLEDAPP + "]";
    }
}