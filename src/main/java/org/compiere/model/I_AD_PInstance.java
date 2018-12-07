package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PInstance {

    /**
     * TableName=AD_PInstance
     */
    String Table_Name = "AD_PInstance";

    /**
     * AD_Table_ID=282
     */
    int Table_ID = 282;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Language_ID
     */
    String COLUMNNAME_AD_Language_ID = "AD_Language_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AD_PInstance_UU
     */
    String COLUMNNAME_AD_PInstance_UU = "AD_PInstance_UU";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name ErrorMsg
     */
    String COLUMNNAME_ErrorMsg = "ErrorMsg";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsProcessing
     */
    String COLUMNNAME_IsProcessing = "IsProcessing";
    /**
     * Column name IsRunAsJob
     */
    String COLUMNNAME_IsRunAsJob = "IsRunAsJob";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name NotificationType
     */
    String COLUMNNAME_NotificationType = "NotificationType";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name ReportType
     */
    String COLUMNNAME_ReportType = "ReportType";
    /**
     * Column name Result
     */
    String COLUMNNAME_Result = "Result";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Language ID
     */
    void setADLanguage_ID(int AD_Language_ID);

    /**
     * Get Language ID
     */
    int getAD_Language_ID();

    I_AD_Language getADLanguage() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    /**
     * Get AD_PInstance_UU
     */
    String getAD_PInstance_UU();

    /**
     * Set AD_PInstance_UU
     */
    void setAD_PInstance_UU(String AD_PInstance_UU);

    /**
     * Get Print Format. Data Print Format
     */
    int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /**
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Error Msg
     */
    String getErrorMsg();

    /**
     * Set Error Msg
     */
    void setErrorMsg(String ErrorMsg);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Processing
     */
    void setIsProcessing(boolean IsProcessing);

    /**
     * Get Processing
     */
    boolean isProcessing();

    /**
     * Set Run as Job
     */
    void setIsRunAsJob(boolean IsRunAsJob);

    /**
     * Get Run as Job
     */
    boolean isRunAsJob();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Notification Type. Type of Notifications
     */
    String getNotificationType();

    /**
     * Set Notification Type. Type of Notifications
     */
    void setNotificationType(String NotificationType);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Report Type
     */
    String getReportType();

    /**
     * Set Report Type
     */
    void setReportType(String ReportType);

    /**
     * Get Result. Result of the action taken
     */
    int getResult();

    /**
     * Set Result. Result of the action taken
     */
    void setResult(int Result);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
