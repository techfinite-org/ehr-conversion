package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Practice {

    private String PracticeName;

    private String PracticeID;

    @Override
    public String toString() {
        return "ClassPojo [PracticeName = " + PracticeName + ", PracticeID = " + PracticeID + "]";
    }
}
			
	