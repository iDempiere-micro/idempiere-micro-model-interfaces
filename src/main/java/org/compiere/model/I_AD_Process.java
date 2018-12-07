package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Process
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Process {

    /**
     * TableName=AD_Process
     */
    String Table_Name = "AD_Process";

    /**
     * AD_Table_ID=284
     */
    int Table_ID = 284;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AccessLevel
     */
    String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Process_UU
     */
    String COLUMNNAME_AD_Process_UU = "AD_Process_UU";
    /**
     * Column name AD_ReportView_ID
     */
    String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Classname
     */
    String COLUMNNAME_Classname = "Classname";
    /**
     * Column name CopyFromProcess
     */
    String COLUMNNAME_CopyFromProcess = "CopyFromProcess";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBetaFunctionality
     */
    String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
    /**
     * Column name IsDirectPrint
     */
    String COLUMNNAME_IsDirectPrint = "IsDirectPrint";
    /**
     * Column name IsReport
     */
    String COLUMNNAME_IsReport = "IsReport";
    /**
     * Column name IsServerProcess
     */
    String COLUMNNAME_IsServerProcess = "IsServerProcess";
    /**
     * Column name JasperReport
     */
    String COLUMNNAME_JasperReport = "JasperReport";
    /**
     * Column name ProcedureName
     */
    String COLUMNNAME_ProcedureName = "ProcedureName";
    /**
     * Column name ShowHelp
     */
    String COLUMNNAME_ShowHelp = "ShowHelp";
    /**
     * Column name Statistic_Count
     */
    String COLUMNNAME_Statistic_Count = "Statistic_Count";
    /**
     * Column name Statistic_Seconds
     */
    String COLUMNNAME_Statistic_Seconds = "Statistic_Seconds";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name WorkflowValue
     */
    String COLUMNNAME_WorkflowValue = "WorkflowValue";

    /**
     * Get Data Access Level. Access Level required
     */
    String getProcessAccessLevel();

    /**
     * Set Data Access Level. Access Level required
     */
    void setProcessAccessLevel(String AccessLevel);

    /**
     * Get Context Help
     */
    int getAD_CtxHelp_ID();

    /**
     * Set Context Help
     */
    void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

    I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

    /**
     * Get Special Form. Special Form
     */
    int getAD_Form_ID();

    /**
     * Set Special Form. Special Form
     */
    void setAD_Form_ID(int AD_Form_ID);

    I_AD_Form getAD_Form() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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

    /**
     * Get AD_Process_UU
     */
    String getAD_Process_UU();

    /**
     * Set AD_Process_UU
     */
    void setAD_Process_UU(String AD_Process_UU);

    /**
     * Get Report View. View used to generate this report
     */
    int getAD_ReportView_ID();

    /**
     * Set Report View. View used to generate this report
     */
    void setAD_ReportView_ID(int AD_ReportView_ID);

    I_AD_ReportView getAD_ReportView() throws RuntimeException;

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_Workflow_ID(int AD_Workflow_ID);

    I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Classname. Java Classname
     */
    String getClassname();

    /**
     * Set Classname. Java Classname
     */
    void setClassname(String Classname);

    /**
     * Get Copy From Report and Process. Copy settings from one report and process to another.
     */
    String getCopyFromProcess();

    /**
     * Set Copy From Report and Process. Copy settings from one report and process to another.
     */
    void setCopyFromProcess(String CopyFromProcess);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

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
     * Set Beta Functionality. This functionality is considered Beta
     */
    void setIsBetaFunctionality(boolean IsBetaFunctionality);

    /**
     * Get Beta Functionality. This functionality is considered Beta
     */
    boolean isBetaFunctionality();

    /**
     * Set Direct print. Print without dialog
     */
    void setIsDirectPrint(boolean IsDirectPrint);

    /**
     * Get Direct print. Print without dialog
     */
    boolean isDirectPrint();

    /**
     * Set Report. Indicates a Report record
     */
    void setIsReport(boolean IsReport);

    /**
     * Get Report. Indicates a Report record
     */
    boolean isReport();

    /**
     * Set Server Process. Run this Process on Server only
     */
    void setIsServerProcess(boolean IsServerProcess);

    /**
     * Get Server Process. Run this Process on Server only
     */
    boolean isServerProcess();

    /**
     * Get Jasper Report
     */
    String getJasperReport();

    /**
     * Set Jasper Report
     */
    void setJasperReport(String JasperReport);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Procedure. Name of the Database Procedure
     */
    String getProcedureName();

    /**
     * Set Procedure. Name of the Database Procedure
     */
    void setProcedureName(String ProcedureName);

    /**
     * Get Show Help
     */
    String getShowHelp();

    /**
     * Set Show Help
     */
    void setShowHelp(String ShowHelp);

    /**
     * Get Statistic Count. Internal statistics how often the entity was used
     */
    int getStatistic_Count();

    /**
     * Set Statistic Count. Internal statistics how often the entity was used
     */
    void setStatistic_Count(int Statistic_Count);

    /**
     * Get Statistic Seconds. Internal statistics how many seconds a process took
     */
    int getStatistic_Seconds();

    /**
     * Set Statistic Seconds. Internal statistics how many seconds a process took
     */
    void setStatistic_Seconds(int Statistic_Seconds);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Workflow Key. Key of the Workflow to start
     */
    String getWorkflowValue();

    /**
     * Set Workflow Key. Key of the Workflow to start
     */
    void setWorkflowValue(String WorkflowValue);
}
