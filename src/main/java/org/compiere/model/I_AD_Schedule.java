package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Schedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Schedule {

    /**
     * TableName=AD_Schedule
     */
    String Table_Name = "AD_Schedule";

    /**
     * AD_Table_ID=200020
     */
    int Table_ID = 200020;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Schedule_ID
     */
    String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
    /**
     * Column name AD_Schedule_UU
     */
    String COLUMNNAME_AD_Schedule_UU = "AD_Schedule_UU";
    /**
     * Column name CronPattern
     */
    String COLUMNNAME_CronPattern = "CronPattern";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Frequency
     */
    String COLUMNNAME_Frequency = "Frequency";
    /**
     * Column name FrequencyType
     */
    String COLUMNNAME_FrequencyType = "FrequencyType";
    /**
     * Column name IsIgnoreProcessingTime
     */
    String COLUMNNAME_IsIgnoreProcessingTime = "IsIgnoreProcessingTime";
    /**
     * Column name IsSystemSchedule
     */
    String COLUMNNAME_IsSystemSchedule = "IsSystemSchedule";
    /**
     * Column name MonthDay
     */
    String COLUMNNAME_MonthDay = "MonthDay";
    /**
     * Column name RunOnlyOnIP
     */
    String COLUMNNAME_RunOnlyOnIP = "RunOnlyOnIP";
    /**
     * Column name ScheduleType
     */
    String COLUMNNAME_ScheduleType = "ScheduleType";
    /**
     * Column name WeekDay
     */
    String COLUMNNAME_WeekDay = "WeekDay";

    /**
     * Get Cron Scheduling Pattern. Cron pattern to define when the process should be invoked.
     */
    String getCronPattern();

    /**
     * Set Cron Scheduling Pattern. Cron pattern to define when the process should be invoked.
     */
    void setCronPattern(String CronPattern);

    /**
     * Get Frequency. Frequency of events
     */
    int getFrequency();

    /**
     * Set Frequency. Frequency of events
     */
    void setFrequency(int Frequency);

    /**
     * Get Frequency Type. Frequency of event
     */
    String getFrequencyType();

    /**
     * Set Frequency Type. Frequency of event
     */
    void setFrequencyType(String FrequencyType);

    /**
     * Get Ignore Processing Time. Do not include processing time for the DateNextRun calculation
     */
    boolean isIgnoreProcessingTime();

    /**
     * Get Run only on IP
     */
    String getRunOnlyOnIP();

    /**
     * Get Schedule Type. Type of schedule
     */
    String getScheduleType();

}
