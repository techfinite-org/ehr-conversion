package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Demographics {
    private Patient Patient;

    @Override
    public String toString() {
        return "ClassPojo [Patient = " + Patient + "]";
    }
}