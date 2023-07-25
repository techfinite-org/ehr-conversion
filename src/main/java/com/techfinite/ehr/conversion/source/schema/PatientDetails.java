package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientDetails
{

    private String lastName;

    private String englishAsSecondLanguage;

    private String notes;

    private String gender;

    private String atsiStatus;

    private String dateOfDeath;

    private String languageSpokenAtHome;

    private String createdDateTime;

    private String titleCode;

    private String patientStatusCode;

    private String previouslyKnownAs;

    private String defaultPracticeId;

    private String oneNameOnly;

    private String id;

    private String preferredName;

    private String email;

    private String contactMethod;

    private String placeOfBirth;

    private String updatedBy;

    private String homePhone;

    private String estimated;

    private String fullName;

    private String usualDoctorId;

    private String updatedDateTime;

    private String firstName;

    private String mobilePhone;

    private String createdBy;

    private String dob;

    private String skinCode;

    private String ctgCoPaymentRelief;

    private String middleName;

    private String workPhone;

    private String ethnicityCode;

    private String causeOfDeath;

    private String patientStatus;

    private String recordStatus;

    @Override
    public String toString()
    {
        return "ClassPojo [patientStatus = "+patientStatus+",recordStatus = "+recordStatus+",lastName = "+lastName+", englishAsSecondLanguage = "+englishAsSecondLanguage+", notes = "+notes+", gender = "+gender+", atsiStatus = "+atsiStatus+", dateOfDeath = "+dateOfDeath+", languageSpokenAtHome = "+languageSpokenAtHome+", createdDateTime = "+createdDateTime+", titleCode = "+titleCode+", patientStatusCode = "+patientStatusCode+", previouslyKnownAs = "+previouslyKnownAs+", defaultPracticeId = "+defaultPracticeId+", oneNameOnly = "+oneNameOnly+", id = "+id+", preferredName = "+preferredName+", email = "+email+", contactMethod = "+contactMethod+", placeOfBirth = "+placeOfBirth+", updatedBy = "+updatedBy+", homePhone = "+homePhone+", estimated = "+estimated+", fullName = "+fullName+", usualDoctorId = "+usualDoctorId+", updatedDateTime = "+updatedDateTime+", firstName = "+firstName+", mobilePhone = "+mobilePhone+", createdBy = "+createdBy+", dob = "+dob+", skinCode = "+skinCode+", ctgCoPaymentRelief = "+ctgCoPaymentRelief+", middleName = "+middleName+", workPhone = "+workPhone+", ethnicityCode = "+ethnicityCode+", causeOfDeath = "+causeOfDeath+"]";
    }

}
	