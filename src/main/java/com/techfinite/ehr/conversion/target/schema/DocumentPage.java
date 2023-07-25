package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentPage {

    private String FileName;

    private String PageNo;

    @XmlElement(name="docType")
    private String DocType;

    private String Content;

    @Override
    public String toString() {
        return "ClassPojo [Content = " + Content + ", FileName = " + FileName + ", PageNo = " + PageNo + ", DocType = " + DocType + "]";
    }
}
		