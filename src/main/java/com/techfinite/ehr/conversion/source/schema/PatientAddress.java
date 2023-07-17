package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientAddress
{
    private String updatedBy;

    private String patientId;

    private String addressType;

    private String cityCode;

    private String postcode;

    private String createdDateTime;

    private String updatedDateTime;

    private String createdBy;

    private String countryCode;

    private String addressLine1;

    private String addressLine2;

    private String stateCode;

    private String id;

    private String addressLine3;


    @Override
    public String toString()
    {
        return "ClassPojo [updatedBy = "+updatedBy+", patientId = "+patientId+", addressType = "+addressType+", cityCode = "+cityCode+", postcode = "+postcode+", createdDateTime = "+createdDateTime+", updatedDateTime = "+updatedDateTime+", createdBy = "+createdBy+", countryCode = "+countryCode+", addressLine1 = "+addressLine1+", addressLine2 = "+addressLine2+", stateCode = "+stateCode+", id = "+id+", addressLine3 = "+addressLine3+"]";
    }
}
			