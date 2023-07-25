package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientSettings
{
    private String racfId;

    private String accountPayerCode;

    private String patientId;

    private String medicareAlias;

    private String medicareFirstNameAlias;

    private String dvaNo;

    private String createdDateTime;

    private String ihiRecordStatusCode;

    private String research;

    private String medicareExpiry;

    private String pensionCardno;

    private String medicareSurNameAlias;

    private String providerId;

    private String ihiNoStatusCode;

    private String id;

    private String healthFundExpiryDate;

    private String healthFundNo;

    private String medicareIRN;

    private String eprescribing;

    private String updatedBy;

    private String healthFundUPI;

    private String appointmentIntervalCode;

    private String pensionCardExpiry;

    private String dvaConditions;

    private String pensionCardtype;

    private String medicareNo;

    private String updatedDateTime;

    private String dvaCardtype;

    private String chartNo;

    private String accountTypeId;

    private String ihiNo;

    private String createdBy;

    private String medicareAddress;

    private String safetyNetNo;

    private String appointmentNotes;

    @Override
    public String toString()
    {
        return "ClassPojo [racfId = "+racfId+", accountPayerCode = "+accountPayerCode+", patientId = "+patientId+", medicareAlias = "+medicareAlias+", medicareFirstNameAlias = "+medicareFirstNameAlias+", dvaNo = "+dvaNo+", createdDateTime = "+createdDateTime+", ihiRecordStatusCode = "+ihiRecordStatusCode+", research = "+research+", medicareExpiry = "+medicareExpiry+", pensionCardno = "+pensionCardno+", medicareSurNameAlias = "+medicareSurNameAlias+", providerId = "+providerId+", ihiNoStatusCode = "+ihiNoStatusCode+", id = "+id+", healthFundExpiryDate = "+healthFundExpiryDate+", healthFundNo = "+healthFundNo+", medicareIRN = "+medicareIRN+", eprescribing = "+eprescribing+", updatedBy = "+updatedBy+", healthFundUPI = "+healthFundUPI+", appointmentIntervalCode = "+appointmentIntervalCode+", pensionCardExpiry = "+pensionCardExpiry+", dvaConditions = "+dvaConditions+", pensionCardtype = "+pensionCardtype+", medicareNo = "+medicareNo+", updatedDateTime = "+updatedDateTime+", dvaCardtype = "+dvaCardtype+", chartNo = "+chartNo+", accountTypeId = "+accountTypeId+", ihiNo = "+ihiNo+", createdBy = "+createdBy+", medicareAddress = "+medicareAddress+", safetyNetNo = "+safetyNetNo+", appointmentNotes = "+appointmentNotes+"]";
    }
}
		