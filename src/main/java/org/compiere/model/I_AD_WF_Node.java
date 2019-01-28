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
    /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";
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

    /** Get Context Help */
  int getAD_CtxHelp_ID();

    /** Get Special Form. Special Form */
  int getAD_Form_ID();

    /** Get Image. Image or Icon */
  int getAD_Image_ID();

    /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

    /** Get Process. Process or Report */
  int getAD_Process_ID();

    /** Get OS Task. Operation System Task */
  int getAD_Task_ID();

    /** Get Workflow Block. Workflow Transaction Execution Block */
  int getAD_WF_Block_ID();

    /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

    /** Get Workflow Responsible. Responsible for Workflow Execution */
  int getAD_WF_Responsible_ID();

    /** Get Window. Data entry or display window */
  int getAD_Window_ID();

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

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Set Cost. Cost information */
  void setCost(BigDecimal Cost);

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Document Action. The targeted status of the document */
  String getDocAction();

    /** Get Duration. Normal Duration in Duration Unit */
  int getDuration();

  /** Set Duration. Normal Duration in Duration Unit */
  void setDuration(int Duration);

  /** Get Dynamic Priority Change. Change of priority when Activity is suspended waiting for user */
  BigDecimal getDynPriorityChange();

    /** Get Dynamic Priority Unit. Change of priority when Activity is suspended waiting for user */
  String getDynPriorityUnit();

    /** Get EMail Address. Electronic Mail Address */
  String getEMail();

    /** Get EMail Recipient. Recipient of the EMail */
  String getEMailRecipient();

    /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

    /** Get Comment/Help. Comment or Hint */
  String getHelp();

    /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /** Get Join Element. Semantics for multiple incoming Transitions */
  String getJoinElement();

  /** Set Join Element. Semantics for multiple incoming Transitions */
  void setJoinElement(String JoinElement);

  /** Get Duration Limit. Maximum Duration in Duration Unit */
  int getLimit();

  /** Set Duration Limit. Maximum Duration in Duration Unit */
  void setLimit(int Limit);

    /** Get Priority. Indicates if this request is of a high, medium or low priority. */
  int getPriority();

    /** Get Mail Template. Text templates for mailings */
  int getR_MailText_ID();

    /** Get Split Element. Semantics for multiple outgoing Transitions */
  String getSplitElement();

  /** Set Split Element. Semantics for multiple outgoing Transitions */
  void setSplitElement(String SplitElement);

  /** Get Resource. Resource */
  int getS_Resource_ID();

    /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

    /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

    /** Set Waiting Time. Workflow Simulation Waiting time */
  void setWaitingTime(int WaitingTime);

  /** Get Wait Time. Time in minutes to wait (sleep) */
  int getWaitTime();

    /** Get Workflow. Workflow or tasks */
  int getWorkflow_ID();

    /** Get X Position. Absolute X (horizontal) position in 1/72 of an inch */
  int getXPosition();

  /** Set X Position. Absolute X (horizontal) position in 1/72 of an inch */
  void setXPosition(int XPosition);

    /** Get Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  int getYPosition();

  /** Set Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  void setYPosition(int YPosition);
}
