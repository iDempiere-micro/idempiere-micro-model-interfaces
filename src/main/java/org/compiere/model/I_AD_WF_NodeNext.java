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

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_WF_Next_ID */
  String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_NodeNext_ID */
  String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
  /** Column name AD_WF_NodeNext_UU */
  String COLUMNNAME_AD_WF_NodeNext_UU = "AD_WF_NodeNext_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
    /** Column name IsStdUserWorkflow */
  String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name TransitionCode */
  String COLUMNNAME_TransitionCode = "TransitionCode";

    /** Get Next Node. Next Node in workflow */
  int getAD_WF_Next_ID();

  /** Set Next Node. Next Node in workflow */
  void setAD_WF_Next_ID(int AD_WF_Next_ID);

    /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

  /** Set Node. Workflow Node (activity), step or process */
  void setAD_WF_Node_ID(int AD_WF_Node_ID);

    /** Get Node Transition. Workflow Node Transition */
  int getAD_WF_NodeNext_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

    /** Set Std User Workflow. Standard Manual User Approval Workflow */
  void setIsStdUserWorkflow(boolean IsStdUserWorkflow);

  /** Get Std User Workflow. Standard Manual User Approval Workflow */
  boolean isStdUserWorkflow();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

}
