package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceFieldOutput
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceFieldOutput {

  /** TableName=WS_WebServiceFieldOutput */
  String Table_Name = "WS_WebServiceFieldOutput";

  /** AD_Table_ID=53167 */
  int Table_ID = 53167;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
  /** Column name WS_WebServiceFieldOutput_ID */
  String COLUMNNAME_WS_WebServiceFieldOutput_ID = "WS_WebServiceFieldOutput_ID";
  /** Column name WS_WebServiceFieldOutput_UU */
  String COLUMNNAME_WS_WebServiceFieldOutput_UU = "WS_WebServiceFieldOutput_UU";
  /** Column name WS_WebServiceType_ID */
  String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Web Service Field Output */
  int getWS_WebServiceFieldOutput_ID();

  /** Set Web Service Field Output */
  void setWS_WebServiceFieldOutput_ID(int WS_WebServiceFieldOutput_ID);

  /** Get WS_WebServiceFieldOutput_UU */
  String getWS_WebServiceFieldOutput_UU();

  /** Set WS_WebServiceFieldOutput_UU */
  void setWS_WebServiceFieldOutput_UU(String WS_WebServiceFieldOutput_UU);

  /** Get Web Service Type */
  int getWS_WebServiceType_ID();

  /** Set Web Service Type */
  void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

  I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
