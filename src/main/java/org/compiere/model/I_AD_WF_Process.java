package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_Process
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Process {

    /**
     * TableName=AD_WF_Process
     */
    String Table_Name = "AD_WF_Process";

    /**
     * AD_Table_ID=645
     */
    int Table_ID = 645;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_WF_Process_ID
     */
    String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
    /**
     * Column name AD_WF_Process_UU
     */
    String COLUMNNAME_AD_WF_Process_UU = "AD_WF_Process_UU";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
    /**
     * Column name WFState
     */
    String COLUMNNAME_WFState = "WFState";

    /**
     * Get Message. System Message
     */
    int getAD_Message_ID();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    /**
     * Get Workflow Process. Actual Workflow Process Instance
     */
    int getAD_WF_Process_ID();

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getAD_WF_Responsible_ID();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_Workflow_ID(int AD_Workflow_ID);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(int Priority);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Get Workflow State. State of the execution of the workflow
     */
    String getWFState();

    /**
     * Set Workflow State. State of the execution of the workflow
     */
    void setWFState(String WFState);
}
