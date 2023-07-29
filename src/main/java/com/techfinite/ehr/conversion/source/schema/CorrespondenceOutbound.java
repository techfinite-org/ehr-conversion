package com.techfinite.ehr.conversion.source.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

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

    private String recordStatus;

    private String documentType;

    private String attachmentContent;

    public String encodeAttachmentContent(String content, String docType) {
        if (docType.equals("HTML")) {
            byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
            byte[] bytes = Base64.encodeBase64(contentBytes);
            return new String(bytes);
        }
        return content;
    }

}