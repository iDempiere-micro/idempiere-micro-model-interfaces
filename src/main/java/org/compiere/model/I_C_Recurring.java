package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Recurring
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Recurring {

    /**
     * TableName=C_Recurring
     */
    String Table_Name = "C_Recurring";

    /**
     * AD_Table_ID=574
     */
    int Table_ID = 574;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_RecurringGroup_ID
     */
    String COLUMNNAME_C_RecurringGroup_ID = "C_RecurringGroup_ID";
    /**
     * Column name C_Recurring_ID
     */
    String COLUMNNAME_C_Recurring_ID = "C_Recurring_ID";
    /**
     * Column name C_Recurring_UU
     */
    String COLUMNNAME_C_Recurring_UU = "C_Recurring_UU";
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
     * Column name Frequency
     */
    String COLUMNNAME_Frequency = "Frequency";
    /**
     * Column name FrequencyType
     */
    String COLUMNNAME_FrequencyType = "FrequencyType";
    /**
     * Column name GL_JournalBatch_ID
     */
    String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name RecurringType
     */
    String COLUMNNAME_RecurringType = "RecurringType";
    /**
     * Column name RunsMax
     */
    String COLUMNNAME_RunsMax = "RunsMax";
    /**
     * Column name RunsRemaining
     */
    String COLUMNNAME_RunsRemaining = "RunsRemaining";
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
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    I_C_Payment getC_Payment() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Recurring Group
     */
    int getC_RecurringGroup_ID();

    /**
     * Set Recurring Group
     */
    void setC_RecurringGroup_ID(int C_RecurringGroup_ID);

    I_C_RecurringGroup getC_RecurringGroup() throws RuntimeException;

    /**
     * Get Recurring. Recurring Document
     */
    int getC_Recurring_ID();

    /**
     * Set Recurring. Recurring Document
     */
    void setC_Recurring_ID(int C_Recurring_ID);

    /**
     * Get C_Recurring_UU
     */
    String getC_Recurring_UU();

    /**
     * Set C_Recurring_UU
     */
    void setC_Recurring_UU(String C_Recurring_UU);

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
     * Get Journal Batch. General Ledger Journal Batch
     */
    int getGL_JournalBatch_ID();

    /**
     * Set Journal Batch. General Ledger Journal Batch
     */
    void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

    I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException;

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Recurring Type. Type of Recurring Document
     */
    String getRecurringType();

    /**
     * Set Recurring Type. Type of Recurring Document
     */
    void setRecurringType(String RecurringType);

    /**
     * Get Maximum Runs. Number of recurring runs
     */
    int getRunsMax();

    /**
     * Set Maximum Runs. Number of recurring runs
     */
    void setRunsMax(int RunsMax);

    /**
     * Get Remaining Runs. Number of recurring runs remaining
     */
    int getRunsRemaining();

    /**
     * Set Remaining Runs. Number of recurring runs remaining
     */
    void setRunsRemaining(int RunsRemaining);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
