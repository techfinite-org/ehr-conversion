package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CorrespondenceOutbound {

    private String originatorName;

    private String attachmentUrl;

    private String notes;

    private String updatedBy;

    private String patientId;

    private String subject;

    private String practiceId;

    private String createdDateTime;

    private String htmlContent;

    private String updatedDateTime;

    private String senderId;

    private String senderName;

    private String recipientType;

    private String createdBy;

    private String importDate;

    private String recipientId;

    private String recipientName;

    private String id;

    private String outboundStatus;

    private String category;

    private String letterStatus;

}