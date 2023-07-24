package com.techfinite.ehr.mapper;

import com.techfinite.ehr.conversion.source.schema.CorrespondenceInbound;
import com.techfinite.ehr.conversion.source.schema.CorrespondenceOutbound;
import com.techfinite.ehr.conversion.source.schema.PatientAddress;
import com.techfinite.ehr.conversion.source.schema.PatientDetails;
import com.techfinite.ehr.conversion.target.schema.Correspondence;
import com.techfinite.ehr.conversion.target.schema.Document;
import com.techfinite.ehr.conversion.target.schema.DocumentPage;
import com.techfinite.ehr.conversion.target.schema.Patient;
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
    @Mapping(source = "lastName", target = "SURNAME")
    @Mapping(source = "preferredName", target = "PREFERREDNAME")
    @Mapping(source = "dob", target = "DOB")
    @Mapping(source = "mobilePhone", target = "MOBILEPHONE")
    @Mapping(source = "ethnicityCode", target = "ETHNICCODE")
    @Mapping(source = "genderCode", target = "SEXCODE")
    @Mapping(source = "dateOfDeath", target = "DATEOFDEATH")
    @Mapping(source = "email", target = "EMAIL")
    @Mapping(source = "createdDateTime", target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    Patient mapPatientDetails(PatientDetails patientDetails, @MappingTarget Patient patient);

    @Mapping(source = "addressLine1", target = "ADDRESS1")
    @Mapping(source = "addressLine2", target = "ADDRESS2")
    @Mapping(source = "postcode", target = "POSTCODE")
    @Mapping(source = "cityCode", target = "CITY")
    Patient mapPatientAddress(PatientAddress patientAddress, @MappingTarget Patient patient);


    @Mapping(source="id", target = "DOCUMENTID")
    @Mapping(source="createdDateTime",  target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    Document mapCorrespondenceIn(CorrespondenceInbound correspondenceInbound);

    List<Document> mapCorrespondenceInbound(List<CorrespondenceInbound> correspondenceInbounds);


    @Mapping(source="id", target = "RECORDID")
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
