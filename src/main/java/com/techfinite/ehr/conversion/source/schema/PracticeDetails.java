package com.techfinite.ehr.conversion.source.schema;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PracticeDetails {
    private String practiceName;
    private String practiceId;

    @Override
    public String toString()
    {
        return "ClassPojo [practiceName = "+practiceName+", practiceId = "+practiceId+"]";
    }
}
