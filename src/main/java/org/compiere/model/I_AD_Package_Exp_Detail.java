package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Exp_Detail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Exp_Detail {

    /**
     * TableName=AD_Package_Exp_Detail
     */
    String Table_Name = "AD_Package_Exp_Detail";

    /**
     * AD_Table_ID=50006
     */
    int Table_ID = 50006;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_EntityType_ID
     */
    String COLUMNNAME_AD_EntityType_ID = "AD_EntityType_ID";
    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_ImpFormat_ID
     */
    String COLUMNNAME_AD_ImpFormat_ID = "AD_ImpFormat_ID";
    /**
     * Column name AD_Menu_ID
     */
    String COLUMNNAME_AD_Menu_ID = "AD_Menu_ID";
    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name AD_ModelValidator_ID
     */
    String COLUMNNAME_AD_ModelValidator_ID = "AD_ModelValidator_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Package_Code_New
     */
    String COLUMNNAME_AD_Package_Code_New = "AD_Package_Code_New";
    /**
     * Column name AD_Package_Code_Old
     */
    String COLUMNNAME_AD_Package_Code_Old = "AD_Package_Code_Old";
    /**
     * Column name AD_Package_Exp_Detail_ID
     */
    String COLUMNNAME_AD_Package_Exp_Detail_ID = "AD_Package_Exp_Detail_ID";
    /**
     * Column name AD_Package_Exp_Detail_UU
     */
    String COLUMNNAME_AD_Package_Exp_Detail_UU = "AD_Package_Exp_Detail_UU";
    /**
     * Column name AD_Package_Exp_ID
     */
    String COLUMNNAME_AD_Package_Exp_ID = "AD_Package_Exp_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_ReportView_ID
     */
    String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Val_Rule_ID
     */
    String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Workbench_ID
     */
    String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DBType
     */
    String COLUMNNAME_DBType = "DBType";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Destination_Directory
     */
    String COLUMNNAME_Destination_Directory = "Destination_Directory";
    /**
     * Column name Destination_FileName
     */
    String COLUMNNAME_Destination_FileName = "Destination_FileName";
    /**
     * Column name File_Directory
     */
    String COLUMNNAME_File_Directory = "File_Directory";
    /**
     * Column name FileName
     */
    String COLUMNNAME_FileName = "FileName";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name SQLStatement
     */
    String COLUMNNAME_SQLStatement = "SQLStatement";
    /**
     * Column name Target_Directory
     */
    String COLUMNNAME_Target_Directory = "Target_Directory";
    /**
     * Column name Type
     */
    String COLUMNNAME_Type = "Type";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Entity Type. System Entity Type
     */
    int getAD_EntityType_ID();

    /**
     * Set Entity Type. System Entity Type
     */
    void setAD_EntityType_ID(int AD_EntityType_ID);

    I_AD_EntityType getAD_EntityType() throws RuntimeException;

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
     * Get Import Format
     */
    int getAD_ImpFormat_ID();

    /**
     * Set Import Format
     */
    void setAD_ImpFormat_ID(int AD_ImpFormat_ID);

    I_AD_ImpFormat getAD_ImpFormat() throws RuntimeException;

    /**
     * Get Menu. Identifies a Menu
     */
    int getAD_Menu_ID();

    /**
     * Set Menu. Identifies a Menu
     */
    void setAD_Menu_ID(int AD_Menu_ID);

    I_AD_Menu getAD_Menu() throws RuntimeException;

    /**
     * Get Message. System Message
     */
    int getAD_Message_ID();

    /**
     * Set Message. System Message
     */
    void setAD_Message_ID(int AD_Message_ID);

    I_AD_Message getAD_Message() throws RuntimeException;

    /**
     * Get Model Validator
     */
    int getAD_ModelValidator_ID();

    /**
     * Set Model Validator
     */
    void setAD_ModelValidator_ID(int AD_ModelValidator_ID);

    I_AD_ModelValidator getAD_ModelValidator() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get New Package Code
     */
    String getAD_Package_Code_New();

    /**
     * Set New Package Code
     */
    void setAD_Package_Code_New(String AD_Package_Code_New);

    /**
     * Get Old Package Code
     */
    String getAD_Package_Code_Old();

    /**
     * Set Old Package Code
     */
    void setAD_Package_Code_Old(String AD_Package_Code_Old);

    /**
     * Get Package Exp. Detail
     */
    int getAD_Package_Exp_Detail_ID();

    /**
     * Set Package Exp. Detail
     */
    void setAD_Package_Exp_Detail_ID(int AD_Package_Exp_Detail_ID);

    /**
     * Get AD_Package_Exp_Detail_UU
     */
    String getAD_Package_Exp_Detail_UU();

    /**
     * Set AD_Package_Exp_Detail_UU
     */
    void setAD_Package_Exp_Detail_UU(String AD_Package_Exp_Detail_UU);

    /**
     * Get Package Exp.
     */
    int getAD_Package_Exp_ID();

    /**
     * Set Package Exp.
     */
    void setAD_Package_Exp_ID(int AD_Package_Exp_ID);

    I_AD_Package_Exp getAD_Package_Exp() throws RuntimeException;

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
     * Get Reference. System Reference and Validation
     */
    int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    void setAD_Reference_ID(int AD_Reference_ID);

    I_AD_Reference getAD_Reference() throws RuntimeException;

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
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Set Dynamic Validation. Dynamic Validation Rule
     */
    void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

    /**
     * Get Dynamic Validation. Dynamic Validation Rule
     */
    int getValRule_ID();

    I_AD_Val_Rule getValRule() throws RuntimeException;

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

    /**
     * Get Workbench. Collection of windows, reports
     */
    int getAD_Workbench_ID();

    /**
     * Set Workbench. Collection of windows, reports
     */
    void setAD_Workbench_ID(int AD_Workbench_ID);

    I_AD_Workbench getAD_Workbench() throws RuntimeException;

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get DBType
     */
    String getDBType();

    /**
     * Set DBType
     */
    void setDBType(String DBType);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Destination_Directory
     */
    String getDestination_Directory();

    /**
     * Set Destination_Directory
     */
    void setDestination_Directory(String Destination_Directory);

    /**
     * Get Destination_FileName
     */
    String getDestination_FileName();

    /**
     * Set Destination_FileName
     */
    void setDestination_FileName(String Destination_FileName);

    /**
     * Get File_Directory
     */
    String getFile_Directory();

    /**
     * Set File_Directory
     */
    void setFile_Directory(String File_Directory);

    /**
     * Get File Name. Name of the local file or URL
     */
    String getFileName();

    /**
     * Set File Name. Name of the local file or URL
     */
    void setFileName(String FileName);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Name 2. Additional Name
     */
    String getName2();

    /**
     * Set Name 2. Additional Name
     */
    void setName2(String Name2);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get SQLStatement
     */
    String getSQLStatement();

    /**
     * Set SQLStatement
     */
    void setSQLStatement(String SQLStatement);

    /**
     * Get Target_Directory
     */
    String getTarget_Directory();

    /**
     * Set Target_Directory
     */
    void setTarget_Directory(String Target_Directory);

    /**
     * Get Type. Type of Validation (SQL, Java Script, Java Language)
     */
    String getType();

    /**
     * Set Type. Type of Validation (SQL, Java Script, Java Language)
     */
    void setType(String Type);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
