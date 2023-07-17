package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Observations {

    private Observation[] Observation;

    @Override
    public String toString() {
        return "ClassPojo [Observation = " + Observation + "]";
    }
}