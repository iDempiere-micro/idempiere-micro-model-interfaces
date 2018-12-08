package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Tab_Customization
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Tab_Customization {

  /** TableName=AD_Tab_Customization */
  String Table_Name = "AD_Tab_Customization";

  /** AD_Table_ID=200008 */
  int Table_ID = 200008;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tab_Customization_ID */
  String COLUMNNAME_AD_Tab_Customization_ID = "AD_Tab_Customization_ID";
  /** Column name AD_Tab_Customization_UU */
  String COLUMNNAME_AD_Tab_Customization_UU = "AD_Tab_Customization_UU";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Custom */
  String COLUMNNAME_Custom = "Custom";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDisplayedGrid */
  String COLUMNNAME_IsDisplayedGrid = "IsDisplayedGrid";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tab Customization */
  int getAD_Tab_Customization_ID();

  /** Set Tab Customization */
  void setAD_Tab_Customization_ID(int AD_Tab_Customization_ID);

  /** Get AD_Tab_Customization_UU */
  String getAD_Tab_Customization_UU();

  /** Set AD_Tab_Customization_UU */
  void setAD_Tab_Customization_UU(String AD_Tab_Customization_UU);

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Custom */
  String getCustom();

  /** Set Custom */
  void setCustom(String Custom);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Show in Grid */
  String getIsDisplayedGrid();

  /** Set Show in Grid */
  void setIsDisplayedGrid(String IsDisplayedGrid);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
