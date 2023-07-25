package com.techfinite.ehr.mapper;

import com.techfinite.ehr.conversion.source.schema.*;
import com.techfinite.ehr.conversion.target.schema.*;
import com.techfinite.ehr.conversion.target.schema.Practice;
import com.techfinite.ehr.mapstruct.qualifier.WithTimezoneToLocalDate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Mapper(uses = {MediRecordToBpsEhrMapper.class})
public interface MediRecordToBpsEhrMapper {

    MediRecordToBpsEhrMapper MEDI_RECORD_TO_BPS_EHR_MAPPER = Mappers.getMapper(MediRecordToBpsEhrMapper.class);

    @Mapping(source = "firstName", target = "FIRSTNAME")
    @Mapping(source = "middleName", target = "MIDDLENAME")
    @Mapping(source = "lastName", target = "SURNAME")
    @Mapping(source = "preferredName", target = "PREFERREDNAME")
    @Mapping(source = "dob", target = "DOB")
    @Mapping(source = "mobilePhone", target = "MOBILEPHONE")
    @Mapping(source = "dateOfDeath", target = "DATEOFDEATH")
    @Mapping(source = "email", target = "EMAIL")
    @Mapping(source = "patientStatus", target = "PATIENTSTATUS")
    @Mapping(source = "recordStatus", target = "RECORDSTATUS")
    @Mapping(source = "createdDateTime", target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    Patient mapPatientDetail(PatientDetails patientDetails, @MappingTarget Patient patient);
/*

    @Mapping(source = "practiceName", target = "PracticeName")
    @Mapping(source = "practiceId", target = "PracticeID")
    Practice mapPracticeDetails(PracticeDetails practiceDetails, @MappingTarget Practice practice);
*/

    @Mapping(source = "addressLine1", target = "ADDRESS1")
    @Mapping(source = "addressLine2", target = "ADDRESS2")
    @Mapping(source = "postcode", target = "POSTCODE")
    @Mapping(source = "cityCode", target = "CITY")
    Patient mapPatientAddress(PatientAddress patientAddress, @MappingTarget Patient patient);

    @Mapping(source = "medicareNo", target = "MEDICARENO")
    @Mapping(source = "medicareIRN", target = "MEDICARELINENO")
    @Mapping(source = "medicareExpiry", target = "MEDICAREEXPIRY")
    @Mapping(source = "pensionCardtype", target = "PENSIONCODE")
    @Mapping(source = "pensionCardno", target = "PENSIONNO")
    @Mapping(source = "pensionCardExpiry", target = "PENSIONEXPIRY")
    @Mapping(source = "dvaNo", target = "DVANO")
    @Mapping(source = "dvaCardType", target = "DVACODE")
    Patient mapPatientSettings(PatientSettings patientSettings, @MappingTarget Patient patient);


    @Mapping(source="id", target = "DOCUMENTID")
    @Mapping(source="senderName", target="SENDERNAME")
    @Mapping(source="createdDateTime",  target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="createdDateTime",  target = "CORRESPONDENCEDATE", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="documentType",target="DocumentPage.DocType")
    @Mapping(source="attachmentContent",target="DocumentPage.Content")
    @Mapping(source = "recordStatus", target = "RECORDSTATUS")
    Document mapCorrespondenceIn(CorrespondenceInbound correspondenceInbound);

    List<Document> mapCorrespondenceInbound(List<CorrespondenceInbound> correspondenceInbounds);


    @Mapping(source="id", target = "RECORDID")
    @Mapping(source="senderName", target="SENDERNAME")
    @Mapping(source="createdDateTime",  target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="createdDateTime",  target = "CORRESPONDENCEDATE", qualifiedBy = WithTimezoneToLocalDate.class)
    Correspondence mapCorrespondenceOut(CorrespondenceOutbound correspondenceOutbound);

    List<Correspondence> mapCorrespondenceOutbound(List<CorrespondenceOutbound> correspondenceOutbounds);


    @WithTimezoneToLocalDate
    default String timezoneToLocalDate(String source) {
        // Do your conversion here
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(source.substring(0,10),inputFormatter);
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
