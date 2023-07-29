package com.techfinite.ehr.conversion.source.schema;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Practice {
    private String pipNo;

    private String updatedBy;

    private String mainPhone;

    private String city;

    private String postcode;

    private String practiceId;

    private String acirClinicCode;

    private String createdDateTime;

    private String abn;

    private String lspNo;

    private String updatedDateTime;

    private String practiceName;

    private String createdBy;

    private String countryCode;

    private String serviceTypeText;

    private String primaryPractice;

    private String addressLine1;

    private String addressLine2;

    private String stateCode;

    private String id;

    private String acirCommunityCode;

    private String fax;

    private String email;

    private String status;

    @Override
    public String toString()
    {
        return "ClassPojo [pipNo = "+pipNo+", updatedBy = "+updatedBy+", mainPhone = "+mainPhone+", city = "+city+", postcode = "+postcode+", practiceId = "+practiceId+", acirClinicCode = "+acirClinicCode+", createdDateTime = "+createdDateTime+", abn = "+abn+", lspNo = "+lspNo+", updatedDateTime = "+updatedDateTime+", practiceName = "+practiceName+", createdBy = "+createdBy+", countryCode = "+countryCode+", serviceTypeText = "+serviceTypeText+", primaryPractice = "+primaryPractice+", addressLine1 = "+addressLine1+", addressLine2 = "+addressLine2+", stateCode = "+stateCode+", id = "+id+", acirCommunityCode = "+acirCommunityCode+", fax = "+fax+", email = "+email+", status = "+status+"]";
    }
}
