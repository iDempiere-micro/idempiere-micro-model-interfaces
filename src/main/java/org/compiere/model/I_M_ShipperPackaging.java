package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperPackaging
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPackaging {

  /** TableName=M_ShipperPackaging */
  String Table_Name = "M_ShipperPackaging";

  /** AD_Table_ID=200041 */
  int Table_ID = 200041;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_ShipperPackagingCfg_ID */
  String COLUMNNAME_M_ShipperPackagingCfg_ID = "M_ShipperPackagingCfg_ID";
  /** Column name M_ShipperPackaging_ID */
  String COLUMNNAME_M_ShipperPackaging_ID = "M_ShipperPackaging_ID";
  /** Column name M_ShipperPackaging_UU */
  String COLUMNNAME_M_ShipperPackaging_UU = "M_ShipperPackaging_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Weight */
  String COLUMNNAME_Weight = "Weight";

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

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

  /** Set Shipper. Method or manner of product delivery */
  void setM_Shipper_ID(int M_Shipper_ID);

  I_M_Shipper getM_Shipper() throws RuntimeException;

  /** Get Shipper Packaging Configuration */
  int getM_ShipperPackagingCfg_ID();

  /** Set Shipper Packaging Configuration */
  void setM_ShipperPackagingCfg_ID(int M_ShipperPackagingCfg_ID);

  I_M_ShipperPackagingCfg getM_ShipperPackagingCfg() throws RuntimeException;

  /** Get Shipper Packaging */
  int getM_ShipperPackaging_ID();

  /** Set Shipper Packaging */
  void setM_ShipperPackaging_ID(int M_ShipperPackaging_ID);

  /** Get M_ShipperPackaging_UU */
  String getM_ShipperPackaging_UU();

  /** Set M_ShipperPackaging_UU */
  void setM_ShipperPackaging_UU(String M_ShipperPackaging_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Weight. Weight of a product */
  BigDecimal getWeight();

  /** Set Weight. Weight of a product */
  void setWeight(BigDecimal Weight);
}
