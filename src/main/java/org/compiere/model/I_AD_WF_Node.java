package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_Node
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Node {

  /** TableName=AD_WF_Node */
  String Table_Name = "AD_WF_Node";

  /** AD_Table_ID=129 */
  int Table_ID = 129;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name Action */
  String COLUMNNAME_Action = "Action";
  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_Form_ID */
  String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Task_ID */
  String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
  /** Column name AD_WF_Block_ID */
  String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_Node_UU */
  String COLUMNNAME_AD_WF_Node_UU = "AD_WF_Node_UU";
  /** Column name AD_WF_Responsible_ID */
  String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name AD_Workflow_ID */
  String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
  /** Column name AttributeName */
  String COLUMNNAME_AttributeName = "AttributeName";
  /** Column name AttributeValue */
  String COLUMNNAME_AttributeValue = "AttributeValue";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name Cost */
  String COLUMNNAME_Cost = "Cost";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name Duration */
  String COLUMNNAME_Duration = "Duration";
  /** Column name DynPriorityChange */
  String COLUMNNAME_DynPriorityChange = "DynPriorityChange";
  /** Column name DynPriorityUnit */
  String COLUMNNAME_DynPriorityUnit = "DynPriorityUnit";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name EMailRecipient */
  String COLUMNNAME_EMailRecipient = "EMailRecipient";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name FinishMode */
  String COLUMNNAME_FinishMode = "FinishMode";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsMilestone */
  String COLUMNNAME_IsMilestone = "IsMilestone";
  /** Column name IsSubcontracting */
  String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
  /** Column name JoinElement */
  String COLUMNNAME_JoinElement = "JoinElement";
  /** Column name Limit */
  String COLUMNNAME_Limit = "Limit";
  /** Column name MovingTime */
  String COLUMNNAME_MovingTime = "MovingTime";
  /** Column name OverlapUnits */
  String COLUMNNAME_OverlapUnits = "OverlapUnits";
  /** Column name Priority */
  String COLUMNNAME_Priority = "Priority";
  /** Column name QueuingTime */
  String COLUMNNAME_QueuingTime = "QueuingTime";
  /** Column name R_MailText_ID */
  String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
  /** Column name SetupTime */
  String COLUMNNAME_SetupTime = "SetupTime";
  /** Column name SplitElement */
  String COLUMNNAME_SplitElement = "SplitElement";
  /** Column name S_Resource_ID */
  String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
  /** Column name StartMode */
  String COLUMNNAME_StartMode = "StartMode";
  /** Column name SubflowExecution */
  String COLUMNNAME_SubflowExecution = "SubflowExecution";
  /** Column name UnitsCycles */
  String COLUMNNAME_UnitsCycles = "UnitsCycles";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name WaitingTime */
  String COLUMNNAME_WaitingTime = "WaitingTime";
  /** Column name WaitTime */
  String COLUMNNAME_WaitTime = "WaitTime";
  /** Column name Workflow_ID */
  String COLUMNNAME_Workflow_ID = "Workflow_ID";
  /** Column name WorkingTime */
  String COLUMNNAME_WorkingTime = "WorkingTime";
  /** Column name XPosition */
  String COLUMNNAME_XPosition = "XPosition";
  /** Column name Yield */
  String COLUMNNAME_Yield = "Yield";
  /** Column name YPosition */
  String COLUMNNAME_YPosition = "YPosition";

  /** Get Action. Indicates the Action to be performed */
  String getAction();

  /** Set Action. Indicates the Action to be performed */
  void setAction(String Action);

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Get Context Help */
  int getAD_CtxHelp_ID();

  /** Set Context Help */
  void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

  /** Get Special Form. Special Form */
  int getAD_Form_ID();

  /** Set Special Form. Special Form */
  void setAD_Form_ID(int AD_Form_ID);

  I_AD_Form getAD_Form() throws RuntimeException;

  /** Get Image. Image or Icon */
  int getAD_Image_ID();

  /** Set Image. Image or Icon */
  void setAD_Image_ID(int AD_Image_ID);

  I_AD_Image getAD_Image() throws RuntimeException;

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get OS Task. Operation System Task */
  int getAD_Task_ID();

  /** Set OS Task. Operation System Task */
  void setAD_Task_ID(int AD_Task_ID);

  I_AD_Task getAD_Task() throws RuntimeException;

  /** Get Workflow Block. Workflow Transaction Execution Block */
  int getAD_WF_Block_ID();

  /** Set Workflow Block. Workflow Transaction Execution Block */
  void setAD_WF_Block_ID(int AD_WF_Block_ID);

  I_AD_WF_Block getAD_WF_Block() throws RuntimeException;

  /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

  /** Set Node. Workflow Node (activity), step or process */
  void setAD_WF_Node_ID(int AD_WF_Node_ID);

  /** Get AD_WF_Node_UU */
  String getAD_WF_Node_UU();

  /** Set AD_WF_Node_UU */
  void setAD_WF_Node_UU(String AD_WF_Node_UU);

  /** Get Workflow Responsible. Responsible for Workflow Execution */
  int getAD_WF_Responsible_ID();

  /** Set Workflow Responsible. Responsible for Workflow Execution */
  void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

  I_AD_WF_Responsible getAD_WF_Responsible() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Workflow. Workflow or combination of tasks */
  int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  void setAD_Workflow_ID(int AD_Workflow_ID);

  I_AD_Workflow getAD_Workflow() throws RuntimeException;

  /** Get Attribute Name. Name of the Attribute */
  String getAttributeName();

  /** Set Attribute Name. Name of the Attribute */
  void setAttributeName(String AttributeName);

  /** Get Attribute Value. Value of the Attribute */
  String getAttributeValue();

  /** Set Attribute Value. Value of the Attribute */
  void setAttributeValue(String AttributeValue);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Cost. Cost information */
  BigDecimal getCost();

  /** Set Cost. Cost information */
  void setCost(BigDecimal Cost);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Duration. Normal Duration in Duration Unit */
  int getDuration();

  /** Set Duration. Normal Duration in Duration Unit */
  void setDuration(int Duration);

  /** Get Dynamic Priority Change. Change of priority when Activity is suspended waiting for user */
  BigDecimal getDynPriorityChange();

  /** Set Dynamic Priority Change. Change of priority when Activity is suspended waiting for user */
  void setDynPriorityChange(BigDecimal DynPriorityChange);

  /** Get Dynamic Priority Unit. Change of priority when Activity is suspended waiting for user */
  String getDynPriorityUnit();

  /** Set Dynamic Priority Unit. Change of priority when Activity is suspended waiting for user */
  void setDynPriorityUnit(String DynPriorityUnit);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Get EMail Recipient. Recipient of the EMail */
  String getEMailRecipient();

  /** Set EMail Recipient. Recipient of the EMail */
  void setEMailRecipient(String EMailRecipient);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Finish Mode. Workflow Activity Finish Mode */
  String getFinishMode();

  /** Set Finish Mode. Workflow Activity Finish Mode */
  void setFinishMode(String FinishMode);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

  /** Get Centrally maintained. Information maintained in System Element table */
  boolean isCentrallyMaintained();

  /** Set Is Milestone */
  void setIsMilestone(boolean IsMilestone);

  /** Get Is Milestone */
  boolean isMilestone();

  /** Set Is Subcontracting */
  void setIsSubcontracting(boolean IsSubcontracting);

  /** Get Is Subcontracting */
  boolean isSubcontracting();

  /** Get Join Element. Semantics for multiple incoming Transitions */
  String getJoinElement();

  /** Set Join Element. Semantics for multiple incoming Transitions */
  void setJoinElement(String JoinElement);

  /** Get Duration Limit. Maximum Duration in Duration Unit */
  int getLimit();

  /** Set Duration Limit. Maximum Duration in Duration Unit */
  void setLimit(int Limit);

  /** Get Moving Time */
  int getMovingTime();

  /** Set Moving Time */
  void setMovingTime(int MovingTime);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /**
   * Get Overlap Units. Overlap Units are number of units that must be completed before they are
   * moved the next activity
   */
  int getOverlapUnits();

  /**
   * Set Overlap Units. Overlap Units are number of units that must be completed before they are
   * moved the next activity
   */
  void setOverlapUnits(int OverlapUnits);

  /** Get Priority. Indicates if this request is of a high, medium or low priority. */
  int getPriority();

  /** Set Priority. Indicates if this request is of a high, medium or low priority. */
  void setPriority(int Priority);

  /** Get Queuing Time. Queue time is the time a job waits at a work center before begin handled. */
  int getQueuingTime();

  /** Set Queuing Time. Queue time is the time a job waits at a work center before begin handled. */
  void setQueuingTime(int QueuingTime);

  /** Get Mail Template. Text templates for mailings */
  int getR_MailText_ID();

  /** Set Mail Template. Text templates for mailings */
  void setR_MailText_ID(int R_MailText_ID);

  I_R_MailText getR_MailText() throws RuntimeException;

  /** Get Setup Time. Setup time before starting Production */
  int getSetupTime();

  /** Set Setup Time. Setup time before starting Production */
  void setSetupTime(int SetupTime);

  /** Get Split Element. Semantics for multiple outgoing Transitions */
  String getSplitElement();

  /** Set Split Element. Semantics for multiple outgoing Transitions */
  void setSplitElement(String SplitElement);

  /** Get Resource. Resource */
  int getS_Resource_ID();

  /** Set Resource. Resource */
  void setS_Resource_ID(int S_Resource_ID);

  I_S_Resource getS_Resource() throws RuntimeException;

  /** Get Start Mode. Workflow Activity Start Mode */
  String getStartMode();

  /** Set Start Mode. Workflow Activity Start Mode */
  void setStartMode(String StartMode);

  /** Get Subflow Execution. Mode how the sub-workflow is executed */
  String getSubflowExecution();

  /** Set Subflow Execution. Mode how the sub-workflow is executed */
  void setSubflowExecution(String SubflowExecution);

  /**
   * Get Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
   * and indicated the product to be manufactured on a production line for duration unit.
   */
  BigDecimal getUnitsCycles();

  /**
   * Set Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
   * and indicated the product to be manufactured on a production line for duration unit.
   */
  void setUnitsCycles(BigDecimal UnitsCycles);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);

  /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

  /** Set Valid to. Valid to including this date (last day) */
  void setValidTo(Timestamp ValidTo);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Waiting Time. Workflow Simulation Waiting time */
  int getWaitingTime();

  /** Set Waiting Time. Workflow Simulation Waiting time */
  void setWaitingTime(int WaitingTime);

  /** Get Wait Time. Time in minutes to wait (sleep) */
  int getWaitTime();

  /** Set Wait Time. Time in minutes to wait (sleep) */
  void setWaitTime(int WaitTime);

  /** Get Workflow. Workflow or tasks */
  int getWorkflow_ID();

  /** Set Workflow. Workflow or tasks */
  void setWorkflow_ID(int Workflow_ID);

  I_AD_Workflow getWorkflow() throws RuntimeException;

  /** Get Working Time. Workflow Simulation Execution Time */
  int getWorkingTime();

  /** Set Working Time. Workflow Simulation Execution Time */
  void setWorkingTime(int WorkingTime);

  /** Get X Position. Absolute X (horizontal) position in 1/72 of an inch */
  int getXPosition();

  /** Set X Position. Absolute X (horizontal) position in 1/72 of an inch */
  void setXPosition(int XPosition);

  /**
   * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
   * may fall below 100 percent
   */
  int getYield();

  /**
   * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
   * may fall below 100 percent
   */
  void setYield(int Yield);

  /** Get Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  int getYPosition();

  /** Set Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  void setYPosition(int YPosition);
}
