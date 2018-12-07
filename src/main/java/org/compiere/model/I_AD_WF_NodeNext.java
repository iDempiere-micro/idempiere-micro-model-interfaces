package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_NodeNext
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_NodeNext {

  /** TableName=AD_WF_NodeNext */
  String Table_Name = "AD_WF_NodeNext";

  /** AD_Table_ID=131 */
  int Table_ID = 131;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_WF_Next_ID */
  String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_NodeNext_ID */
  String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
  /** Column name AD_WF_NodeNext_UU */
  String COLUMNNAME_AD_WF_NodeNext_UU = "AD_WF_NodeNext_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsStdUserWorkflow */
  String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name TransitionCode */
  String COLUMNNAME_TransitionCode = "TransitionCode";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Next Node. Next Node in workflow */
  int getAD_WF_Next_ID();

  /** Set Next Node. Next Node in workflow */
  void setAD_WF_Next_ID(int AD_WF_Next_ID);

  I_AD_WF_Node getAD_WF_Next() throws RuntimeException;

  /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

  /** Set Node. Workflow Node (activity), step or process */
  void setAD_WF_Node_ID(int AD_WF_Node_ID);

  I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

  /** Get Node Transition. Workflow Node Transition */
  int getAD_WF_NodeNext_ID();

  /** Set Node Transition. Workflow Node Transition */
  void setAD_WF_NodeNext_ID(int AD_WF_NodeNext_ID);

  /** Get AD_WF_NodeNext_UU */
  String getAD_WF_NodeNext_UU();

  /** Set AD_WF_NodeNext_UU */
  void setAD_WF_NodeNext_UU(String AD_WF_NodeNext_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Std User Workflow. Standard Manual User Approval Workflow */
  void setIsStdUserWorkflow(boolean IsStdUserWorkflow);

  /** Get Std User Workflow. Standard Manual User Approval Workflow */
  boolean isStdUserWorkflow();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Transition Code. Code resulting in TRUE of FALSE */
  String getTransitionCode();

  /** Set Transition Code. Code resulting in TRUE of FALSE */
  void setTransitionCode(String TransitionCode);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
