package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintFont
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintFont {

  /** TableName=AD_PrintFont */
  String Table_Name = "AD_PrintFont";

  /** AD_Table_ID=491 */
  int Table_ID = 491;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintFont_ID */
  String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
  /** Column name AD_PrintFont_UU */
  String COLUMNNAME_AD_PrintFont_UU = "AD_PrintFont_UU";
  /** Column name Code */
  String COLUMNNAME_Code = "Code";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Font. Maintain Print Font */
  int getAD_PrintFont_ID();

  /** Set Print Font. Maintain Print Font */
  void setAD_PrintFont_ID(int AD_PrintFont_ID);

  /** Get AD_PrintFont_UU */
  String getAD_PrintFont_UU();

  /** Set AD_PrintFont_UU */
  void setAD_PrintFont_UU(String AD_PrintFont_UU);

  /** Get Validation code. Validation Code */
  String getCode();

  /** Set Validation code. Validation Code */
  void setCode(String Code);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
