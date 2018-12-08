package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceFieldInput
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceFieldInput {

  /** TableName=WS_WebServiceFieldInput */
  String Table_Name = "WS_WebServiceFieldInput";

  /** AD_Table_ID=53166 */
  int Table_ID = 53166;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Reference_Value_ID */
  String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
  /** Column name ColumnName */
  String COLUMNNAME_ColumnName = "ColumnName";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IdentifierLogic */
  String COLUMNNAME_IdentifierLogic = "IdentifierLogic";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsIdentifier */
  String COLUMNNAME_IsIdentifier = "IsIdentifier";
  /** Column name IsNullIdentifier */
  String COLUMNNAME_IsNullIdentifier = "IsNullIdentifier";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WS_WebServiceFieldInput_ID */
  String COLUMNNAME_WS_WebServiceFieldInput_ID = "WS_WebServiceFieldInput_ID";
  /** Column name WS_WebServiceFieldInput_UU */
  String COLUMNNAME_WS_WebServiceFieldInput_UU = "WS_WebServiceFieldInput_UU";
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

  /** Get Reference. System Reference and Validation */
  int getAD_Reference_ID();

  /** Set Reference. System Reference and Validation */
  void setAD_Reference_ID(int AD_Reference_ID);

  I_AD_Reference getAD_Reference() throws RuntimeException;

  /** Get Reference Key. Required to specify, if data type is Table or List */
  int getAD_Reference_Value_ID();

  /** Set Reference Key. Required to specify, if data type is Table or List */
  void setAD_Reference_Value_ID(int AD_Reference_Value_ID);

  I_AD_Reference getAD_Reference_Value() throws RuntimeException;

  /** Get DB Column Name. Name of the column in the database */
  String getColumnName();

  /** Set DB Column Name. Name of the column in the database */
  void setColumnName(String ColumnName);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Identifier Logic */
  String getIdentifierLogic();

  /** Set Identifier Logic */
  void setIdentifierLogic(String IdentifierLogic);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Identifier. This column is part of the record identifier */
  void setIsIdentifier(boolean IsIdentifier);

  /** Get Identifier. This column is part of the record identifier */
  boolean isIdentifier();

  /** Set Allow Null Value. Should allow null value for identifiere field */
  void setIsNullIdentifier(boolean IsNullIdentifier);

  /** Get Allow Null Value. Should allow null value for identifiere field */
  boolean isNullIdentifier();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Web Service Field Input */
  int getWS_WebServiceFieldInput_ID();

  /** Set Web Service Field Input */
  void setWS_WebServiceFieldInput_ID(int WS_WebServiceFieldInput_ID);

  /** Get WS_WebServiceFieldInput_UU */
  String getWS_WebServiceFieldInput_UU();

  /** Set WS_WebServiceFieldInput_UU */
  void setWS_WebServiceFieldInput_UU(String WS_WebServiceFieldInput_UU);

  /** Get Web Service Type */
  int getWS_WebServiceType_ID();

  /** Set Web Service Type */
  void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

  I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
