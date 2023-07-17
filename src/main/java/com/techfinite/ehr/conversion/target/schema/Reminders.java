package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Reminders {

    private Reminder[] Reminder;

    @Override
    public String toString() {
        return "ClassPojo [Reminder = " + Reminder + "]";
    }
}
			
	