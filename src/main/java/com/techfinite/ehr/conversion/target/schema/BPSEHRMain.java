package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BPSEHRMain {

    private BPSEHRV2 BPSEHRV2;

    @Override
    public String toString() {
        return "ClassPojo [BPSEHRV2 = " + BPSEHRV2 + "]";
    }
}
