package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class Practice {

    private String PracticeName;

    private String PracticeID;

    @Override
    public String toString() {
        return "ClassPojo [PracticeName = " + PracticeName + ", PracticeID = " + PracticeID + "]";
    }
}
			
	