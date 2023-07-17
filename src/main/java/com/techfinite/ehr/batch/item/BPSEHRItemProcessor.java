package com.techfinite.ehr.batch.item;

import com.techfinite.ehr.conversion.source.schema.MediRecordPatient;
import com.techfinite.ehr.conversion.target.schema.BPSEHRV2;
import com.techfinite.ehr.conversion.target.schema.Correspondence;
import com.techfinite.ehr.conversion.target.schema.CorrespondenceIn;
import com.techfinite.ehr.conversion.target.schema.CorrespondenceOut;
import com.techfinite.ehr.conversion.target.schema.Demographics;
import com.techfinite.ehr.conversion.target.schema.Document;
import com.techfinite.ehr.conversion.target.schema.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.techfinite.ehr.mapper.MediRecordToBpsEhrMapper.MEDI_RECORD_TO_BPS_EHR_MAPPER;

@Slf4j
@Component
public class BPSEHRItemProcessor implements ItemProcessor<MediRecordPatient, BPSEHRV2> {


    @Override
    public BPSEHRV2 process(final MediRecordPatient mediRecordPatient) throws Exception {
        BPSEHRV2 bpsehrv2 = new BPSEHRV2();
        bpsehrv2.setBPSVersion("1.12.0.998");
        Demographics demographics = new Demographics();
        Patient patient = new Patient();

        MEDI_RECORD_TO_BPS_EHR_MAPPER.mapPatientDetails(mediRecordPatient.getPatientDetails(),patient);
        MEDI_RECORD_TO_BPS_EHR_MAPPER.mapPatientAddress(mediRecordPatient.getPatientAddress(),patient);

        List<Document> correspondenceInDocs = MEDI_RECORD_TO_BPS_EHR_MAPPER.mapCorrespondenceInbound(mediRecordPatient.getCorrespondenceInbound());
        CorrespondenceIn correspondenceIn = CorrespondenceIn.builder().Document(correspondenceInDocs.toArray(new Document[0])).build();

        List<Correspondence> correspondenceOutDocs = MEDI_RECORD_TO_BPS_EHR_MAPPER.mapCorrespondenceOutbound(mediRecordPatient.getCorrespondenceOutbound());
        CorrespondenceOut correspondenceOut = CorrespondenceOut.builder().Correspondence(correspondenceOutDocs.toArray(new Correspondence[0])).build();

        demographics.setPatient(patient);
        bpsehrv2.setDemographics(demographics);
        bpsehrv2.setCorrespondenceIn(correspondenceIn);
        bpsehrv2.setCorrespondenceOut(correspondenceOut);
        return bpsehrv2;
    }
}
