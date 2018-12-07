package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_Activity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Activity {

  /** TableName=AD_WF_Activity */
  String Table_Name = "AD_WF_Activity";

  /** AD_Table_ID=644 */
  int Table_ID = 644;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_WF_Activity_ID */
  String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
  /** Column name AD_WF_Activity_UU */
  String COLUMNNAME_AD_WF_Activity_UU = "AD_WF_Activity_UU";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_Process_ID */
  String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
  /** Column name AD_WF_Responsible_ID */
  String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
  /** Column name AD_Workflow_ID */
  String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateLastAlert */
  String COLUMNNAME_DateLastAlert = "DateLastAlert";
  /** Column name DynPriorityStart */
  String COLUMNNAME_DynPriorityStart = "DynPriorityStart";
  /** Column name EndWaitTime */
  String COLUMNNAME_EndWaitTime = "EndWaitTime";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Priority */
  String COLUMNNAME_Priority = "Priority";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WFState */
  String COLUMNNAME_WFState = "WFState";

  /** Get Message. System Message */
  int getAD_Message_ID();

  /** Set Message. System Message */
  void setAD_Message_ID(int AD_Message_ID);

  I_AD_Message getAD_Message() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Workflow Activity. Workflow Activity */
  int getAD_WF_Activity_ID();

  /** Set Workflow Activity. Workflow Activity */
  void setAD_WF_Activity_ID(int AD_WF_Activity_ID);

  /** Get AD_WF_Activity_UU */
  String getAD_WF_Activity_UU();

  /** Set AD_WF_Activity_UU */
  void setAD_WF_Activity_UU(String AD_WF_Activity_UU);

  /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

  /** Set Node. Workflow Node (activity), step or process */
  void setAD_WF_Node_ID(int AD_WF_Node_ID);

  I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

  /** Get Workflow Process. Actual Workflow Process Instance */
  int getAD_WF_Process_ID();

  /** Set Workflow Process. Actual Workflow Process Instance */
  void setAD_WF_Process_ID(int AD_WF_Process_ID);

  I_AD_WF_Process getAD_WF_Process() throws RuntimeException;

  /** Get Workflow Responsible. Responsible for Workflow Execution */
  int getAD_WF_Responsible_ID();

  /** Set Workflow Responsible. Responsible for Workflow Execution */
  void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

  I_AD_WF_Responsible getAD_WF_Responsible() throws RuntimeException;

  /** Get Workflow. Workflow or combination of tasks */
  int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  void setAD_Workflow_ID(int AD_Workflow_ID);

  I_AD_Workflow getAD_Workflow() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Last Alert. Date when last alert were sent */
  Timestamp getDateLastAlert();

  /** Set Last Alert. Date when last alert were sent */
  void setDateLastAlert(Timestamp DateLastAlert);

  /** Get Dyn Priority Start. Starting priority before changed dynamically */
  int getDynPriorityStart();

  /** Set Dyn Priority Start. Starting priority before changed dynamically */
  void setDynPriorityStart(int DynPriorityStart);

  /** Get End Wait. End of sleep time */
  Timestamp getEndWaitTime();

  /** Set End Wait. End of sleep time */
  void setEndWaitTime(Timestamp EndWaitTime);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Priority. Indicates if this request is of a high, medium or low priority. */
  int getPriority();

  /** Set Priority. Indicates if this request is of a high, medium or low priority. */
  void setPriority(int Priority);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Workflow State. State of the execution of the workflow */
  String getWFState();

  /** Set Workflow State. State of the execution of the workflow */
  void setWFState(String WFState);
}
