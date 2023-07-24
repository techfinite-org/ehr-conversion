package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CorrespondenceInbound {

    private String originatorName;

    private String attachmentUrl;

    private String notes;

    private String updatedBy;

    private String checkedDate;

    private String patientId;

    private String subject;

    private String practiceId;

    private String checkedById;

    private String createdDateTime;

    private String checkedByName;

    private String updatedDateTime;

    private String senderId;

    private String senderName;

    private String createdBy;

    private String importDate;

    private String recipientId;

    private String recipientName;

    private String senderType;

    private String id;

    private String category;

    private String letterStatus;

    private String documentType;

    private String attachmentContent;
}