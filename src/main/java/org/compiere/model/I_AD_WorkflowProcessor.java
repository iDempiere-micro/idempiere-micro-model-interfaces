package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

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

    I_AD_Schedule getAD_Schedule() throws RuntimeException;

    /**
     * Get Workflow Processor. Workflow Processor Server
     */
    int getAD_WorkflowProcessor_ID();

    /**
     * Set Workflow Processor. Workflow Processor Server
     */
    void setAD_WorkflowProcessor_ID(int AD_WorkflowProcessor_ID);

    /**
     * Get AD_WorkflowProcessor_UU
     */
    String getAD_WorkflowProcessor_UU();

    /**
     * Set AD_WorkflowProcessor_UU
     */
    void setAD_WorkflowProcessor_UU(String AD_WorkflowProcessor_UU);

    /**
     * Get Alert over Priority. Send alert email when over priority
     */
    int getAlertOverPriority();

    /**
     * Set Alert over Priority. Send alert email when over priority
     */
    void setAlertOverPriority(int AlertOverPriority);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

    /**
     * Get Date next run. Date the process will run next
     */
    Timestamp getDateNextRun();

    /**
     * Set Date next run. Date the process will run next
     */
    void setDateNextRun(Timestamp DateNextRun);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Inactivity Alert Days. Send Alert when there is no activity after days (0= no alert)
     */
    int getInactivityAlertDays();

    /**
     * Set Inactivity Alert Days. Send Alert when there is no activity after days (0= no alert)
     */
    void setInactivityAlertDays(int InactivityAlertDays);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Days to keep Log. Number of days to keep the log entries
     */
    int getKeepLogDays();

    /**
     * Set Days to keep Log. Number of days to keep the log entries
     */
    void setKeepLogDays(int KeepLogDays);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Reminder Days. Days between sending Reminder Emails for a due or inactive Document
     */
    int getRemindDays();

    /**
     * Set Reminder Days. Days between sending Reminder Emails for a due or inactive Document
     */
    void setRemindDays(int RemindDays);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisor_ID();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisor_ID(int Supervisor_ID);

    I_AD_User getSupervisor() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
