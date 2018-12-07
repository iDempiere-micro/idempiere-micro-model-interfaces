package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_User_Substitute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User_Substitute {

  /** TableName=AD_User_Substitute */
  String Table_Name = "AD_User_Substitute";

  /** AD_Table_ID=642 */
  int Table_ID = 642;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_User_Substitute_ID */
  String COLUMNNAME_AD_User_Substitute_ID = "AD_User_Substitute_ID";
  /** Column name AD_User_Substitute_UU */
  String COLUMNNAME_AD_User_Substitute_UU = "AD_User_Substitute_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Substitute_ID */
  String COLUMNNAME_Substitute_ID = "Substitute_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get User Substitute. Substitute of the user */
  int getAD_User_Substitute_ID();

  /** Set User Substitute. Substitute of the user */
  void setAD_User_Substitute_ID(int AD_User_Substitute_ID);

  /** Get AD_User_Substitute_UU */
  String getAD_User_Substitute_UU();

  /** Set AD_User_Substitute_UU */
  void setAD_User_Substitute_UU(String AD_User_Substitute_UU);

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

  /** Get Substitute. Entity which can be used in place of this entity */
  int getSubstitute_ID();

  /** Set Substitute. Entity which can be used in place of this entity */
  void setSubstitute_ID(int Substitute_ID);

  I_AD_User getSubstitute() throws RuntimeException;

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
}
