package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_NextCondition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_NextCondition {

  /** TableName=AD_WF_NextCondition */
  String Table_Name = "AD_WF_NextCondition";

  /** AD_Table_ID=706 */
  int Table_ID = 706;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_WF_NextCondition_ID */
  String COLUMNNAME_AD_WF_NextCondition_ID = "AD_WF_NextCondition_ID";
  /** Column name AD_WF_NextCondition_UU */
  String COLUMNNAME_AD_WF_NextCondition_UU = "AD_WF_NextCondition_UU";
  /** Column name AD_WF_NodeNext_ID */
  String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
  /** Column name AndOr */
  String COLUMNNAME_AndOr = "AndOr";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Operation */
  String COLUMNNAME_Operation = "Operation";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name Value2 */
  String COLUMNNAME_Value2 = "Value2";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Transition Condition. Workflow Node Transition Condition */
  int getAD_WF_NextCondition_ID();

  /** Set Transition Condition. Workflow Node Transition Condition */
  void setAD_WF_NextCondition_ID(int AD_WF_NextCondition_ID);

  /** Get AD_WF_NextCondition_UU */
  String getAD_WF_NextCondition_UU();

  /** Set AD_WF_NextCondition_UU */
  void setAD_WF_NextCondition_UU(String AD_WF_NextCondition_UU);

  /** Get Node Transition. Workflow Node Transition */
  int getAD_WF_NodeNext_ID();

  /** Set Node Transition. Workflow Node Transition */
  void setAD_WF_NodeNext_ID(int AD_WF_NodeNext_ID);

  I_AD_WF_NodeNext getAD_WF_NodeNext() throws RuntimeException;

  /** Get And/Or. Logical operation: AND or OR */
  String getAndOr();

  /** Set And/Or. Logical operation: AND or OR */
  void setAndOr(String AndOr);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Operation. Compare Operation */
  String getOperation();

  /** Set Operation. Compare Operation */
  void setOperation(String Operation);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Value To. Value To */
  String getValue2();

  /** Set Value To. Value To */
  void setValue2(String Value2);
}
