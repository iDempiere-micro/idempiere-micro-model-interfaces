package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Field
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Field {

  /** TableName=ASP_Field */
  String Table_Name = "ASP_Field";

  /** AD_Table_ID=53048 */
  int Table_ID = 53048;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Field_ID */
  String COLUMNNAME_AD_Field_ID = "AD_Field_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ASP_Field_ID */
  String COLUMNNAME_ASP_Field_ID = "ASP_Field_ID";
  /** Column name ASP_Field_UU */
  String COLUMNNAME_ASP_Field_UU = "ASP_Field_UU";
  /** Column name ASP_Status */
  String COLUMNNAME_ASP_Status = "ASP_Status";
  /** Column name ASP_Tab_ID */
  String COLUMNNAME_ASP_Tab_ID = "ASP_Tab_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Field. Field on a database table */
  int getAD_Field_ID();

  /** Set Field. Field on a database table */
  void setAD_Field_ID(int AD_Field_ID);

  I_AD_Field getAD_Field() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get ASP Field */
  int getASP_Field_ID();

  /** Set ASP Field */
  void setASP_Field_ID(int ASP_Field_ID);

  /** Get ASP_Field_UU */
  String getASP_Field_UU();

  /** Set ASP_Field_UU */
  void setASP_Field_UU(String ASP_Field_UU);

  /** Get ASP Status */
  String getASP_Status();

  /** Set ASP Status */
  void setASP_Status(String ASP_Status);

  /** Get ASP Tab */
  int getASP_Tab_ID();

  /** Set ASP Tab */
  void setASP_Tab_ID(int ASP_Tab_ID);

  I_ASP_Tab getASP_Tab() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
