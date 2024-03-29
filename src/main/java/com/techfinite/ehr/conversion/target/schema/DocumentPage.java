package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DocumentPage {

    private String Content;

    private String FileName;

    private String PageNo;

    private String DocType;

    @Override
    public String toString() {
        return "ClassPojo [Content = " + Content + ", FileName = " + FileName + ", PageNo = " + PageNo + ", DocType = " + DocType + "]";
    }
}
		