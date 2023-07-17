package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientRelationshipData
{
    private String updatedBy;

    private String contactName;

    private String homePhone;

    private String createdDateTime;

    private String relationshipCode;

    private String isFamily;

    private String isHeadOfFamily;

    private String updatedDateTime;

    private String isEmergency;

    private String mobilePhone;

    private String createdBy;

    private String workPhone;

    private String id;

    private String relatedPersonId;

    private String isNOK;

    private String email;

    private String contactMethod;

    @Override
    public String toString()
    {
        return "ClassPojo [updatedBy = "+updatedBy+", contactName = "+contactName+", homePhone = "+homePhone+", createdDateTime = "+createdDateTime+", relationshipCode = "+relationshipCode+", isFamily = "+isFamily+", isHeadOfFamily = "+isHeadOfFamily+", updatedDateTime = "+updatedDateTime+", isEmergency = "+isEmergency+", mobilePhone = "+mobilePhone+", createdBy = "+createdBy+", workPhone = "+workPhone+", id = "+id+", relatedPersonId = "+relatedPersonId+", isNOK = "+isNOK+", email = "+email+", contactMethod = "+contactMethod+"]";
    }
}