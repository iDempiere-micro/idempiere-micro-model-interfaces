package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Schedule_ID
     */
    String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
    /**
     * Column name AD_Schedule_UU
     */
    String COLUMNNAME_AD_Schedule_UU = "AD_Schedule_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WeekDay
     */
    String COLUMNNAME_WeekDay = "WeekDay";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Schedule
     */
    int getAD_Schedule_ID();

    /**
     * Set Schedule
     */
    void setAD_Schedule_ID(int AD_Schedule_ID);

    /**
     * Get AD_Schedule_UU
     */
    String getAD_Schedule_UU();

    /**
     * Set AD_Schedule_UU
     */
    void setAD_Schedule_UU(String AD_Schedule_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Cron Scheduling Pattern. Cron pattern to define when the process should be invoked.
     */
    String getCronPattern();

    /**
     * Set Cron Scheduling Pattern. Cron pattern to define when the process should be invoked.
     */
    void setCronPattern(String CronPattern);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Ignore Processing Time. Do not include processing time for the DateNextRun calculation
     */
    void setIsIgnoreProcessingTime(boolean IsIgnoreProcessingTime);

    /**
     * Get Ignore Processing Time. Do not include processing time for the DateNextRun calculation
     */
    boolean isIgnoreProcessingTime();

    /**
     * Set System Schedule. Schedule Just For System
     */
    void setIsSystemSchedule(boolean IsSystemSchedule);

    /**
     * Get System Schedule. Schedule Just For System
     */
    boolean isSystemSchedule();

    /**
     * Get Day of the Month. Day of the month 1 to 28/29/30/31
     */
    int getMonthDay();

    /**
     * Set Day of the Month. Day of the month 1 to 28/29/30/31
     */
    void setMonthDay(int MonthDay);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Run only on IP
     */
    String getRunOnlyOnIP();

    /**
     * Set Run only on IP
     */
    void setRunOnlyOnIP(String RunOnlyOnIP);

    /**
     * Get Schedule Type. Type of schedule
     */
    String getScheduleType();

    /**
     * Set Schedule Type. Type of schedule
     */
    void setScheduleType(String ScheduleType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Day of the Week. Day of the Week
     */
    String getWeekDay();

    /**
     * Set Day of the Week. Day of the Week
     */
    void setWeekDay(String WeekDay);
}
