package com.techfinite.ehr.conversion.target.schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RemindersSent {

    private SentReminder SentReminder;

    @Override
    public String toString() {
        return "ClassPojo [SentReminder = " + SentReminder + "]";
    }
}
	