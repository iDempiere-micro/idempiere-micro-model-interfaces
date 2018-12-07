package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TreeNodeU1
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TreeNodeU1 {

  /** TableName=AD_TreeNodeU1 */
  String Table_Name = "AD_TreeNodeU1";

  /** AD_Table_ID=852 */
  int Table_ID = 852;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tree_ID */
  String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
  /** Column name AD_TreeNodeU1_UU */
  String COLUMNNAME_AD_TreeNodeU1_UU = "AD_TreeNodeU1_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Node_ID */
  String COLUMNNAME_Node_ID = "Node_ID";
  /** Column name Parent_ID */
  String COLUMNNAME_Parent_ID = "Parent_ID";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tree. Identifies a Tree */
  int getAD_Tree_ID();

  /** Set Tree. Identifies a Tree */
  void setAD_Tree_ID(int AD_Tree_ID);

  I_AD_Tree getAD_Tree() throws RuntimeException;

  /** Get AD_TreeNodeU1_UU */
  String getAD_TreeNodeU1_UU();

  /** Set AD_TreeNodeU1_UU */
  void setAD_TreeNodeU1_UU(String AD_TreeNodeU1_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Node */
  int getNode_ID();

  /** Set Node */
  void setNode_ID(int Node_ID);

  /** Get Parent. Parent of Entity */
  int getParent_ID();

  /** Set Parent. Parent of Entity */
  void setParent_ID(int Parent_ID);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
