package com.techfinite.ehr.conversion.source.schema;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MediRecordPatient {

    private String version;
    private PatientDetails patientDetails;
    private PatientAddress patientAddress;
    private PatientRelationship patientRelationship;
    private PatientRelationshipData patientRelationshipData;
    private PatientSettings patientSettings;
    private List<CorrespondenceInbound> correspondenceInbound;
    private List<CorrespondenceOutbound> correspondenceOutbound;
    private PracticeDetails practiceDetails;
}
