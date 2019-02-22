package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_SchedulerLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_SchedulerLog {

    /**
     * TableName=AD_SchedulerLog
     */
    String Table_Name = "AD_SchedulerLog";

    /**
     * AD_Table_ID=687
     */
    int Table_ID = 687;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Scheduler_ID
     */
    String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
    /**
     * Column name AD_SchedulerLog_ID
     */
    String COLUMNNAME_AD_SchedulerLog_ID = "AD_SchedulerLog_ID";
    /**
     * Column name AD_SchedulerLog_UU
     */
    String COLUMNNAME_AD_SchedulerLog_UU = "AD_SchedulerLog_UU";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name Reference
     */
    String COLUMNNAME_Reference = "Reference";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";

    /**
     * Get Scheduler. Schedule Processes
     */
    int getAD_Scheduler_ID();

    /**
     * Set Scheduler. Schedule Processes
     */
    void setAD_Scheduler_ID(int AD_Scheduler_ID);

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Set Reference. Reference for this record
     */
    void setReference(String Reference);

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
