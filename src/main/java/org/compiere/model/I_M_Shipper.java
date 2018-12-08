package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Shipper
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Shipper {

  /** TableName=M_Shipper */
  String Table_Name = "M_Shipper";

  /** AD_Table_ID=253 */
  int Table_ID = 253;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_ShipperCfg_ID */
  String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_Shipper_UU */
  String COLUMNNAME_M_Shipper_UU = "M_Shipper_UU";
  /** Column name M_ShippingProcessor_ID */
  String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  String getCreateFrom();

  /**
   * Set Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  void setCreateFrom(String CreateFrom);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Shipper Configuration */
  int getM_ShipperCfg_ID();

  /** Set Shipper Configuration */
  void setM_ShipperCfg_ID(int M_ShipperCfg_ID);

  I_M_ShipperCfg getM_ShipperCfg() throws RuntimeException;

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

  /** Set Shipper. Method or manner of product delivery */
  void setM_Shipper_ID(int M_Shipper_ID);

  /** Get M_Shipper_UU */
  String getM_Shipper_UU();

  /** Set M_Shipper_UU */
  void setM_Shipper_UU(String M_Shipper_UU);

  /** Get Shipping Processor */
  int getM_ShippingProcessor_ID();

  /** Set Shipping Processor */
  void setM_ShippingProcessor_ID(int M_ShippingProcessor_ID);

  I_M_ShippingProcessor getM_ShippingProcessor() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
