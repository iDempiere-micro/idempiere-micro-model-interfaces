package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_Web_Properties
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_Web_Properties {

  /** TableName=U_Web_Properties */
  String Table_Name = "U_Web_Properties";

  /** AD_Table_ID=52001 */
  int Table_ID = 52001;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name U_Key */
  String COLUMNNAME_U_Key = "U_Key";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name U_Value */
  String COLUMNNAME_U_Value = "U_Value";
  /** Column name U_Web_Properties_ID */
  String COLUMNNAME_U_Web_Properties_ID = "U_Web_Properties_ID";
  /** Column name U_Web_Properties_UU */
  String COLUMNNAME_U_Web_Properties_UU = "U_Web_Properties_UU";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Key */
  String getU_Key();

  /** Set Key */
  void setU_Key(String U_Key);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Value */
  String getU_Value();

  /** Set Value */
  void setU_Value(String U_Value);

  /** Get Web Properties */
  int getU_Web_Properties_ID();

  /** Set Web Properties */
  void setU_Web_Properties_ID(int U_Web_Properties_ID);

  /** Get U_Web_Properties_UU */
  String getU_Web_Properties_UU();

  /** Set U_Web_Properties_UU */
  void setU_Web_Properties_UU(String U_Web_Properties_UU);
}
