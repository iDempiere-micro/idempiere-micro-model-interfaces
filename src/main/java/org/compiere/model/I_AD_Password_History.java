package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Password_History
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Password_History {

  /** TableName=AD_Password_History */
  String Table_Name = "AD_Password_History";

  /** AD_Table_ID=200171 */
  int Table_ID = 200171;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Password_History_ID */
  String COLUMNNAME_AD_Password_History_ID = "AD_Password_History_ID";
  /** Column name AD_Password_History_UU */
  String COLUMNNAME_AD_Password_History_UU = "AD_Password_History_UU";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DatePasswordChanged */
  String COLUMNNAME_DatePasswordChanged = "DatePasswordChanged";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name Salt */
  String COLUMNNAME_Salt = "Salt";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Password History ID */
  int getAD_Password_History_ID();

  /** Set Password History ID */
  void setAD_Password_History_ID(int AD_Password_History_ID);

  /** Get AD_Password_History_UU */
  String getAD_Password_History_UU();

  /** Set AD_Password_History_UU */
  void setAD_Password_History_UU(String AD_Password_History_UU);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date Password Changed */
  Timestamp getDatePasswordChanged();

  /** Set Date Password Changed */
  void setDatePasswordChanged(Timestamp DatePasswordChanged);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Salt. Random data added to improve password hash effectiveness */
  String getSalt();

  /** Set Salt. Random data added to improve password hash effectiveness */
  void setSalt(String Salt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
