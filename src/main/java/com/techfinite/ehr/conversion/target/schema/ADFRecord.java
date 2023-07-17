package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ADFRecord {

    private String CREATED;

    private String ADFPROMPT;

    private String ADFCODE;

    private String UPDATED;

    private String INTERNALID;

    private String UPDATEDBY;

    private String CREATEDBY;

    private String RECORDID;

    @Override
    public String toString() {
        return "ClassPojo [CREATED = " + CREATED + ", ADFPROMPT = " + ADFPROMPT + ", ADFCODE = " + ADFCODE + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", UPDATEDBY = " + UPDATEDBY + ", CREATEDBY = " + CREATEDBY + ", RECORDID = " + RECORDID + "]";
    }
}
		