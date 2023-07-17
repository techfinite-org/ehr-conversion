package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EPCValues {

    private EPCValue[] EPCValue;

    @Override
    public String toString() {
        return "ClassPojo [EPCValue = " + EPCValue + "]";
    }
}