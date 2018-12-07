package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebService_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebService_Para {

  /** TableName=WS_WebService_Para */
  String Table_Name = "WS_WebService_Para";

  /** AD_Table_ID=53165 */
  int Table_ID = 53165;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ConstantValue */
  String COLUMNNAME_ConstantValue = "ConstantValue";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ParameterName */
  String COLUMNNAME_ParameterName = "ParameterName";
  /** Column name ParameterType */
  String COLUMNNAME_ParameterType = "ParameterType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WS_WebService_Para_ID */
  String COLUMNNAME_WS_WebService_Para_ID = "WS_WebService_Para_ID";
  /** Column name WS_WebService_Para_UU */
  String COLUMNNAME_WS_WebService_Para_UU = "WS_WebService_Para_UU";
  /** Column name WS_WebServiceType_ID */
  String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Constant Value. Constant value */
  String getConstantValue();

  /** Set Constant Value. Constant value */
  void setConstantValue(String ConstantValue);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Parameter Name */
  String getParameterName();

  /** Set Parameter Name */
  void setParameterName(String ParameterName);

  /** Get Parameter Type */
  String getParameterType();

  /** Set Parameter Type */
  void setParameterType(String ParameterType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Web Service Parameters */
  int getWS_WebService_Para_ID();

  /** Set Web Service Parameters */
  void setWS_WebService_Para_ID(int WS_WebService_Para_ID);

  /** Get WS_WebService_Para_UU */
  String getWS_WebService_Para_UU();

  /** Set WS_WebService_Para_UU */
  void setWS_WebService_Para_UU(String WS_WebService_Para_UU);

  /** Get Web Service Type */
  int getWS_WebServiceType_ID();

  /** Set Web Service Type */
  void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

  I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
