package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TobaccoHistory {

    private TobaccoRecord TobaccoRecord;

    @Override
    public String toString() {
        return "ClassPojo [TobaccoRecord = " + TobaccoRecord + "]";
    }
}