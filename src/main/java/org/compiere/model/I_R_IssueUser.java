package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueUser
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueUser {

  /** TableName=R_IssueUser */
  String Table_Name = "R_IssueUser";

  /** AD_Table_ID=841 */
  int Table_ID = 841;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name R_IssueUser_ID */
  String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";
  /** Column name R_IssueUser_UU */
  String COLUMNNAME_R_IssueUser_UU = "R_IssueUser_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserName */
  String COLUMNNAME_UserName = "UserName";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

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

  /** Get IssueUser. User who reported issues */
  int getR_IssueUser_ID();

  /** Set IssueUser. User who reported issues */
  void setR_IssueUser_ID(int R_IssueUser_ID);

  /** Get R_IssueUser_UU */
  String getR_IssueUser_UU();

  /** Set R_IssueUser_UU */
  void setR_IssueUser_UU(String R_IssueUser_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Name */
  String getUserName();

  /** Set User Name */
  void setUserName(String UserName);
}
