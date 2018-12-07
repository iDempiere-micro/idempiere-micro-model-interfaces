package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Preference
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Preference {

  /** TableName=AD_Preference */
  String Table_Name = "AD_Preference";

  /** AD_Table_ID=195 */
  int Table_ID = 195;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Preference_ID */
  String COLUMNNAME_AD_Preference_ID = "AD_Preference_ID";
  /** Column name AD_Preference_UU */
  String COLUMNNAME_AD_Preference_UU = "AD_Preference_UU";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name Attribute */
  String COLUMNNAME_Attribute = "Attribute";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PreferenceFor */
  String COLUMNNAME_PreferenceFor = "PreferenceFor";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Preference. Personal Value Preference */
  int getAD_Preference_ID();

  /** Set Preference. Personal Value Preference */
  void setAD_Preference_ID(int AD_Preference_ID);

  /** Get AD_Preference_UU */
  String getAD_Preference_UU();

  /** Set AD_Preference_UU */
  void setAD_Preference_UU(String AD_Preference_UU);

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Attribute */
  String getAttribute();

  /** Set Attribute */
  void setAttribute(String Attribute);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Preference For. Type of preference, it can window, info window or parameter process */
  String getPreferenceFor();

  /** Set Preference For. Type of preference, it can window, info window or parameter process */
  void setPreferenceFor(String PreferenceFor);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
