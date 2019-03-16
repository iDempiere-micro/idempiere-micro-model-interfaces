package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_EventAudit
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_EventAudit {

    /**
     * TableName=AD_WF_EventAudit
     */
    String Table_Name = "AD_WF_EventAudit";

    /**
     * AD_Table_ID=649
     */
    int Table_ID = 649;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_WF_EventAudit_ID
     */
    String COLUMNNAME_AD_WF_EventAudit_ID = "AD_WF_EventAudit_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Process_ID
     */
    String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AttributeName
     */
    String COLUMNNAME_AttributeName = "AttributeName";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name ElapsedTimeMS
     */
    String COLUMNNAME_ElapsedTimeMS = "ElapsedTimeMS";
    /**
     * Column name EventType
     */
    String COLUMNNAME_EventType = "EventType";
    /**
     * Column name NewValue
     */
    String COLUMNNAME_NewValue = "NewValue";
    /**
     * Column name OldValue
     */
    String COLUMNNAME_OldValue = "OldValue";
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
     * Set Table. Database Table information
     */
    void setTableId(int AD_Table_ID);

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    /**
     * Set Workflow Process. Actual Workflow Process Instance
     */
    void setWorkflowProcessId(int AD_WF_Process_ID);

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setWorkflowResponsibleId(int AD_WF_Responsible_ID);

    /**
     * Set Attribute Name. Name of the Attribute
     */
    void setAttributeName(String AttributeName);

    /**
     * Set Elapsed Time ms. Elapsed Time in milli seconds
     */
    void setElapsedTimeMS(BigDecimal ElapsedTimeMS);

    /**
     * Set Event Type. Type of Event
     */
    void setEventType(String EventType);

    /**
     * Set New Value. New field value
     */
    void setNewValue(String NewValue);

    /**
     * Set Old Value. The old file data
     */
    void setOldValue(String OldValue);

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecordId(int Record_ID);

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Set Workflow State. State of the execution of the workflow
     */
    void setWFState(String WFState);
}
