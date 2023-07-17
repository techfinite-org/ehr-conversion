package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AlcoholRecord {

    private String YEARSTARTED;

    private String PASTALCOHOLLEVEL;

    private String RECORDSTATUS;

    private String UPDATED;

    private String INTERNALID;

    private String PASTDRINKSPERDAY;

    private String RECORDID;

    private String COMMENT;

    private String ALCOHOLTEXT;

    private String CREATED;

    private String DAYSPERWEEK;

    private String DRINKSPERDAY;

    private String ALCOHOLCODE;

    private String YEARSTOPPED;

    private String UPDATEDBY;

    private String PASTDAYSPERWEEK;

    private String CREATEDBY;

    @Override
    public String toString() {
        return "ClassPojo [YEARSTARTED = " + YEARSTARTED + ", PASTALCOHOLLEVEL = " + PASTALCOHOLLEVEL + ", RECORDSTATUS = " + RECORDSTATUS + ", UPDATED = " + UPDATED + ", INTERNALID = " + INTERNALID + ", PASTDRINKSPERDAY = " + PASTDRINKSPERDAY + ", RECORDID = " + RECORDID + ", COMMENT = " + COMMENT + ", ALCOHOLTEXT = " + ALCOHOLTEXT + ", CREATED = " + CREATED + ", DAYSPERWEEK = " + DAYSPERWEEK + ", DRINKSPERDAY = " + DRINKSPERDAY + ", ALCOHOLCODE = " + ALCOHOLCODE + ", YEARSTOPPED = " + YEARSTOPPED + ", UPDATEDBY = " + UPDATEDBY + ", PASTDAYSPERWEEK = " + PASTDAYSPERWEEK + ", CREATEDBY = " + CREATEDBY + "]";
    }
}
		