package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_WorkflowProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WorkflowProcessor {

    /**
     * TableName=AD_WorkflowProcessor
     */
    String Table_Name = "AD_WorkflowProcessor";

    /**
     * AD_Table_ID=697
     */
    int Table_ID = 697;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Schedule_ID
     */
    String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
    /**
     * Column name AD_WorkflowProcessor_ID
     */
    String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
    /**
     * Column name AD_WorkflowProcessor_UU
     */
    String COLUMNNAME_AD_WorkflowProcessor_UU = "AD_WorkflowProcessor_UU";
    /**
     * Column name AlertOverPriority
     */
    String COLUMNNAME_AlertOverPriority = "AlertOverPriority";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name DateNextRun
     */
    String COLUMNNAME_DateNextRun = "DateNextRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name InactivityAlertDays
     */
    String COLUMNNAME_InactivityAlertDays = "InactivityAlertDays";
    /**
     * Column name KeepLogDays
     */
    String COLUMNNAME_KeepLogDays = "KeepLogDays";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name RemindDays
     */
    String COLUMNNAME_RemindDays = "RemindDays";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

    /**
     * Get Schedule
     */
    int getAD_Schedule_ID();

    /**
     * Get Workflow Processor. Workflow Processor Server
     */
    int getAD_WorkflowProcessor_ID();

    /**
     * Get Date next run. Date the process will run next
     */
    Timestamp getDateNextRun();

    /**
     * Set Date next run. Date the process will run next
     */
    void setDateNextRun(Timestamp DateNextRun);

    /**
     * Get Days to keep Log. Number of days to keep the log entries
     */
    int getKeepLogDays();

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisor_ID();

}
