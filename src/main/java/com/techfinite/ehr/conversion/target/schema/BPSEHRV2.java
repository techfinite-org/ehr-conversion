package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlRootElement(name = "BPSEHRV2")
@XmlAccessorType(XmlAccessType.FIELD)
public class BPSEHRV2 {

    private FamilyHistoryDetails FamilyHistoryDetails;

    private Practice Practice;

    private String Reactions;

    private PastHistory PastHistory;

    private ClinicalDetails ClinicalDetails;

    private String Requests;

    private String BPSVersion;

    private Demographics Demographics;

    private Reminders Reminders;

    private Visits Visits;

    private String MMSE;

    private FamilyHistory FamilyHistory;

    private CurrentRx CurrentRx;

    private String Prescriptions;

    private String ScriptItems;

    private RemindersSent RemindersSent;

    private String PatientPhoto;

    private EPCValues EPCValues;

    private String AuditC;

    private Parameters Parameters;

    private String InvestigationValues;

    private ReasonForVisit ReasonForVisit;

    private Actions Actions;

    private String INRValues;

    private TobaccoHistory TobaccoHistory;

    private CorrespondenceOut CorrespondenceOut;

    private String DiabetesValues;

    private String PatientAppEnrolment;

    private AlcoholHistory AlcoholHistory;

    private String K10;

    private String ObsGynDetail;

    private PatientConsent PatientConsent;

    private CorrespondenceIn CorrespondenceIn;

    private String Investigations;

    private String Immunisations;

    private String NextOfKin;

    private String MedReferCorrespondence;

    private EPCReports EPCReports;

    private String ClinicalImages;

    private ADFOccupation ADFOccupation;

    private Observations Observations;

    private String OccupationHistory;

    @Override
    public String toString() {
        return "ClassPojo [FamilyHistoryDetails = " + FamilyHistoryDetails + ", Practice = " + Practice + ", Reactions = " + Reactions + ", PastHistory = " + PastHistory + ", ClinicalDetails = " + ClinicalDetails + ", Requests = " + Requests + ", BPSVersion = " + BPSVersion + ", Demographics = " + Demographics + ", Reminders = " + Reminders + ", Visits = " + Visits + ", MMSE = " + MMSE + ", FamilyHistory = " + FamilyHistory + ", CurrentRx = " + CurrentRx + ", Prescriptions = " + Prescriptions + ", ScriptItems = " + ScriptItems + ", RemindersSent = " + RemindersSent + ", PatientPhoto = " + PatientPhoto + ", EPCValues = " + EPCValues + ", AuditC = " + AuditC + ", Parameters = " + Parameters + ", InvestigationValues = " + InvestigationValues + ", ReasonForVisit = " + ReasonForVisit + ", Actions = " + Actions + ", INRValues = " + INRValues + ", TobaccoHistory = " + TobaccoHistory + ", CorrespondenceOut = " + CorrespondenceOut + ", DiabetesValues = " + DiabetesValues + ", PatientAppEnrolment = " + PatientAppEnrolment + ", AlcoholHistory = " + AlcoholHistory + ", K10 = " + K10 + ", ObsGynDetail = " + ObsGynDetail + ", PatientConsent = " + PatientConsent + ", CorrespondenceIn = " + CorrespondenceIn + ", Investigations = " + Investigations + ", Immunisations = " + Immunisations + ", NextOfKin = " + NextOfKin + ", MedReferCorrespondence = " + MedReferCorrespondence + ", EPCReports = " + EPCReports + ", ClinicalImages = " + ClinicalImages + ", ADFOccupation = " + ADFOccupation + ", Observations = " + Observations + ", OccupationHistory = " + OccupationHistory + "]";
    }
}