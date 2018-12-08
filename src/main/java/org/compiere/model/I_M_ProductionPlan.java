package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductionPlan
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductionPlan {

  /** TableName=M_ProductionPlan */
  String Table_Name = "M_ProductionPlan";

  /** AD_Table_ID=385 */
  int Table_ID = 385;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Production_ID */
  String COLUMNNAME_M_Production_ID = "M_Production_ID";
  /** Column name M_ProductionPlan_ID */
  String COLUMNNAME_M_ProductionPlan_ID = "M_ProductionPlan_ID";
  /** Column name M_ProductionPlan_UU */
  String COLUMNNAME_M_ProductionPlan_UU = "M_ProductionPlan_UU";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProductionQty */
  String COLUMNNAME_ProductionQty = "ProductionQty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

  I_M_Locator getM_Locator() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Production. Plan for producing a product */
  int getM_Production_ID();

  /** Set Production. Plan for producing a product */
  void setM_Production_ID(int M_Production_ID);

  I_M_Production getM_Production() throws RuntimeException;

  /** Get Production Plan. Plan for how a product is produced */
  int getM_ProductionPlan_ID();

  /** Set Production Plan. Plan for how a product is produced */
  void setM_ProductionPlan_ID(int M_ProductionPlan_ID);

  /** Get M_ProductionPlan_UU */
  String getM_ProductionPlan_UU();

  /** Set M_ProductionPlan_UU */
  void setM_ProductionPlan_UU(String M_ProductionPlan_UU);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Production Quantity. Quantity of products to produce */
  BigDecimal getProductionQty();

  /** Set Production Quantity. Quantity of products to produce */
  void setProductionQty(BigDecimal ProductionQty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
