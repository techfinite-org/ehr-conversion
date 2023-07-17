package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EPCReports {

    private EPCReport[] EPCReport;

    @Override
    public String toString() {
        return "ClassPojo [EPCReport = " + EPCReport + "]";
    }
}
			
		