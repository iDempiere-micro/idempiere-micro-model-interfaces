package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueStatus
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueStatus {

  /** TableName=R_IssueStatus */
  String Table_Name = "R_IssueStatus";

  /** AD_Table_ID=838 */
  int Table_ID = 838;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name R_IssueStatus_ID */
  String COLUMNNAME_R_IssueStatus_ID = "R_IssueStatus_ID";
  /** Column name R_IssueStatus_UU */
  String COLUMNNAME_R_IssueStatus_UU = "R_IssueStatus_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Issue Status. Status of an Issue */
  int getR_IssueStatus_ID();

  /** Set Issue Status. Status of an Issue */
  void setR_IssueStatus_ID(int R_IssueStatus_ID);

  /** Get R_IssueStatus_UU */
  String getR_IssueStatus_UU();

  /** Set R_IssueStatus_UU */
  void setR_IssueStatus_UU(String R_IssueStatus_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
