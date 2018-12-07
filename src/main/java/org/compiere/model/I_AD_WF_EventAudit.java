package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name AD_WF_EventAudit_UU
     */
    String COLUMNNAME_AD_WF_EventAudit_UU = "AD_WF_EventAudit_UU";
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
     * Column name ElapsedTimeMS
     */
    String COLUMNNAME_ElapsedTimeMS = "ElapsedTimeMS";
    /**
     * Column name EventType
     */
    String COLUMNNAME_EventType = "EventType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WFState
     */
    String COLUMNNAME_WFState = "WFState";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Workflow Event Audit. Workflow Process Activity Event Audit Information
     */
    int getAD_WF_EventAudit_ID();

    /**
     * Set Workflow Event Audit. Workflow Process Activity Event Audit Information
     */
    void setAD_WF_EventAudit_ID(int AD_WF_EventAudit_ID);

    /**
     * Get AD_WF_EventAudit_UU
     */
    String getAD_WF_EventAudit_UU();

    /**
     * Set AD_WF_EventAudit_UU
     */
    void setAD_WF_EventAudit_UU(String AD_WF_EventAudit_UU);

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
     * Get Workflow Process. Actual Workflow Process Instance
     */
    int getAD_WF_Process_ID();

    /**
     * Set Workflow Process. Actual Workflow Process Instance
     */
    void setAD_WF_Process_ID(int AD_WF_Process_ID);

    I_AD_WF_Process getAD_WF_Process() throws RuntimeException;

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getAD_WF_Responsible_ID();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

    I_AD_WF_Responsible getAD_WF_Responsible() throws RuntimeException;

    /**
     * Get Attribute Name. Name of the Attribute
     */
    String getAttributeName();

    /**
     * Set Attribute Name. Name of the Attribute
     */
    void setAttributeName(String AttributeName);

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
     * Get Elapsed Time ms. Elapsed Time in milli seconds
     */
    BigDecimal getElapsedTimeMS();

    /**
     * Set Elapsed Time ms. Elapsed Time in milli seconds
     */
    void setElapsedTimeMS(BigDecimal ElapsedTimeMS);

    /**
     * Get Event Type. Type of Event
     */
    String getEventType();

    /**
     * Set Event Type. Type of Event
     */
    void setEventType(String EventType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get New Value. New field value
     */
    String getNewValue();

    /**
     * Set New Value. New field value
     */
    void setNewValue(String NewValue);

    /**
     * Get Old Value. The old file data
     */
    String getOldValue();

    /**
     * Set Old Value. The old file data
     */
    void setOldValue(String OldValue);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Workflow State. State of the execution of the workflow
     */
    String getWFState();

    /**
     * Set Workflow State. State of the execution of the workflow
     */
    void setWFState(String WFState);
}
