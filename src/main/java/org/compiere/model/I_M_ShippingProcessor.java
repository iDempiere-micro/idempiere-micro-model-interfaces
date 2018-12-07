package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShippingProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingProcessor {

  /** TableName=M_ShippingProcessor */
  String Table_Name = "M_ShippingProcessor";

  /** AD_Table_ID=200039 */
  int Table_ID = 200039;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ConnectionKey */
  String COLUMNNAME_ConnectionKey = "ConnectionKey";
  /** Column name ConnectionPassword */
  String COLUMNNAME_ConnectionPassword = "ConnectionPassword";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_ShippingProcessorCfg_ID */
  String COLUMNNAME_M_ShippingProcessorCfg_ID = "M_ShippingProcessorCfg_ID";
  /** Column name M_ShippingProcessor_ID */
  String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
  /** Column name M_ShippingProcessor_UU */
  String COLUMNNAME_M_ShippingProcessor_UU = "M_ShippingProcessor_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserID */
  String COLUMNNAME_UserID = "UserID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Connection Key */
  String getConnectionKey();

  /** Set Connection Key */
  void setConnectionKey(String ConnectionKey);

  /** Get Connection Password */
  String getConnectionPassword();

  /** Set Connection Password */
  void setConnectionPassword(String ConnectionPassword);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Shipping Processor Configuration */
  int getM_ShippingProcessorCfg_ID();

  /** Set Shipping Processor Configuration */
  void setM_ShippingProcessorCfg_ID(int M_ShippingProcessorCfg_ID);

  I_M_ShippingProcessorCfg getM_ShippingProcessorCfg() throws RuntimeException;

  /** Get Shipping Processor */
  int getM_ShippingProcessor_ID();

  /** Set Shipping Processor */
  void setM_ShippingProcessor_ID(int M_ShippingProcessor_ID);

  /** Get M_ShippingProcessor_UU */
  String getM_ShippingProcessor_UU();

  /** Set M_ShippingProcessor_UU */
  void setM_ShippingProcessor_UU(String M_ShippingProcessor_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User ID. User ID or account number */
  String getUserID();

  /** Set User ID. User ID or account number */
  void setUserID(String UserID);
}
