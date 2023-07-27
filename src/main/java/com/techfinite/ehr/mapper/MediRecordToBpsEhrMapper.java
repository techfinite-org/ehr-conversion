package com.techfinite.ehr.mapper;

import com.techfinite.ehr.conversion.source.schema.*;
import com.techfinite.ehr.conversion.target.schema.Correspondence;
import com.techfinite.ehr.conversion.target.schema.Document;
import com.techfinite.ehr.conversion.target.schema.Patient;
import com.techfinite.ehr.mapstruct.qualifier.Base64AttachmentEncoder;
import com.techfinite.ehr.mapstruct.qualifier.WithTimezoneToLocalDate;
import io.micrometer.core.instrument.util.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Mapper(uses = {MediRecordToBpsEhrMapper.class})
public interface MediRecordToBpsEhrMapper {

    MediRecordToBpsEhrMapper MEDI_RECORD_TO_BPS_EHR_MAPPER = Mappers.getMapper(MediRecordToBpsEhrMapper.class);

    public static final String DOCTYPE_HTML = "HTML";

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
    @Mapping(source = "notes", target = "OTHERNOTES")
    @Mapping(source = "preferredName", target = "PREFERREDNAME")
    @Mapping(source = "homePhone", target = "HOMEPHONE")
    @Mapping(source = "officePhone", target = "OFFICEPHONE")
    @Mapping(source = "createdDateTime", target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    Patient mapPatientDetail(PatientDetails patientDetails, @MappingTarget Patient patient);

    @Mapping(source = "practiceName", target = "practiceName")
    @Mapping(source = "practiceId", target = "practiceID")
    com.techfinite.ehr.conversion.target.schema.Practice mapPracticeDetails(Practice practiceDetails, @MappingTarget com.techfinite.ehr.conversion.target.schema.Practice practice);


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
    @Mapping(source = "dvaCardtype", target = "DVACODE")
    Patient mapPatientSettings(PatientSettings patientSettings, @MappingTarget Patient patient);


    @Mapping(source="id", target = "DOCUMENTID")
    @Mapping(source="senderName", target="CONTACTNAME")
    @Mapping(source= "subject", target = "CATEGORY")
    @Mapping(source="subject", target="SUBJECT")
    @Mapping(source="senderName", target="SENDERNAME")
    @Mapping(source="createdDateTime",  target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="createdDateTime",  target = "CORRESPONDENCEDATE", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="documentType",target="DocumentPage.DocType")
    @Mapping(source="attachmentContent",target="DocumentPage.Content", qualifiedBy = Base64AttachmentEncoder.class)
    @Mapping(source = "recordStatus", target = "RECORDSTATUS")
    Document mapCorrespondenceIn(CorrespondenceInbound correspondenceInbound);

    List<Document> mapCorrespondenceInbound(List<CorrespondenceInbound> correspondenceInbounds);


    @Mapping(source="id", target = "RECORDID")
    @Mapping(source="senderName", target="CONTACTNAME")
    @Mapping(source="senderName", target="SENDERNAME")
    @Mapping(source= "subject", target = "CATEGORY")
    @Mapping(source = "recordStatus", target = "RECORDSTATUS")
    @Mapping(source="createdDateTime",  target = "CREATED", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="createdDateTime",  target = "CORRESPONDENCEDATE", qualifiedBy = WithTimezoneToLocalDate.class)
    @Mapping(source="subject", target="SUBJECT")
    @Mapping(source="attachmentContent", target="CONTENT", qualifiedBy = Base64AttachmentEncoder.class)
    @Mapping(source="documentType", target="DOCTYPE")
    Correspondence mapCorrespondenceOut(CorrespondenceOutbound correspondenceOutbound);

    List<Correspondence> mapCorrespondenceOutbound(List<CorrespondenceOutbound> correspondenceOutbounds);

    @WithTimezoneToLocalDate
    default String timezoneToLocalDate(String source) {
        // Do your conversion here
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(source.substring(0,10),inputFormatter);
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Base64AttachmentEncoder
    static String base64EncodeAttachment(String content) {
        byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
        byte[] bytes = Base64.encodeBase64(contentBytes);
        return new String(bytes);
    }
}
