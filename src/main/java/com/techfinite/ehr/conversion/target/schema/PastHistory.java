package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PastHistory {

    private Condition[] Condition;

    @Override
    public String toString() {
        return "ClassPojo [Condition = " + Condition + "]";
    }
}
	