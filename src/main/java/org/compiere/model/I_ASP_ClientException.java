package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_ClientException
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_ClientException {

    /**
     * TableName=ASP_ClientException
     */
    String Table_Name = "ASP_ClientException";

    /**
     * AD_Table_ID=53057
     */
    int Table_ID = 53057;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Field_ID
     */
    String COLUMNNAME_AD_Field_ID = "AD_Field_ID";
    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Process_Para_ID
     */
    String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
    /**
     * Column name AD_Tab_ID
     */
    String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
    /**
     * Column name AD_Task_ID
     */
    String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name ASP_ClientException_ID
     */
    String COLUMNNAME_ASP_ClientException_ID = "ASP_ClientException_ID";
    /**
     * Column name ASP_ClientException_UU
     */
    String COLUMNNAME_ASP_ClientException_UU = "ASP_ClientException_UU";
    /**
     * Column name ASP_Status
     */
    String COLUMNNAME_ASP_Status = "ASP_Status";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Field. Field on a database table
     */
    int getAD_Field_ID();

    /**
     * Set Field. Field on a database table
     */
    void setAD_Field_ID(int AD_Field_ID);

    I_AD_Field getAD_Field() throws RuntimeException;

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
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

    /**
     * Get Process Parameter
     */
    int getAD_Process_Para_ID();

    /**
     * Set Process Parameter
     */
    void setAD_Process_Para_ID(int AD_Process_Para_ID);

    I_AD_Process_Para getAD_Process_Para() throws RuntimeException;

    /**
     * Get Tab. Tab within a Window
     */
    int getAD_Tab_ID();

    /**
     * Set Tab. Tab within a Window
     */
    void setAD_Tab_ID(int AD_Tab_ID);

    I_AD_Tab getAD_Tab() throws RuntimeException;

    /**
     * Get OS Task. Operation System Task
     */
    int getAD_Task_ID();

    /**
     * Set OS Task. Operation System Task
     */
    void setAD_Task_ID(int AD_Task_ID);

    I_AD_Task getAD_Task() throws RuntimeException;

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getAD_WF_Node_ID();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setAD_WF_Node_ID(int AD_WF_Node_ID);

    I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

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
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_Workflow_ID(int AD_Workflow_ID);

    I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Client Exception
     */
    int getASP_ClientException_ID();

    /**
     * Set Client Exception
     */
    void setASP_ClientException_ID(int ASP_ClientException_ID);

    /**
     * Get ASP_ClientException_UU
     */
    String getASP_ClientException_UU();

    /**
     * Set ASP_ClientException_UU
     */
    void setASP_ClientException_UU(String ASP_ClientException_UU);

    /**
     * Get ASP Status
     */
    String getASP_Status();

    /**
     * Set ASP Status
     */
    void setASP_Status(String ASP_Status);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
