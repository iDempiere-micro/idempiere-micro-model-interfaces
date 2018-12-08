package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_BOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_BOM {

  /** TableName=M_Product_BOM */
  String Table_Name = "M_Product_BOM";

  /** AD_Table_ID=383 */
  int Table_ID = 383;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BOMQty */
  String COLUMNNAME_BOMQty = "BOMQty";
  /** Column name BOMType */
  String COLUMNNAME_BOMType = "BOMType";
  /** Column name CostStandard */
  String COLUMNNAME_CostStandard = "CostStandard";
  /** Column name CostStandardCumAmt */
  String COLUMNNAME_CostStandardCumAmt = "CostStandardCumAmt";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBillOfMaterial */
  String COLUMNNAME_IsBillOfMaterial = "IsBillOfMaterial";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_PartType_ID */
  String COLUMNNAME_M_PartType_ID = "M_PartType_ID";
  /** Column name M_Product_BOM_ID */
  String COLUMNNAME_M_Product_BOM_ID = "M_Product_BOM_ID";
  /** Column name M_ProductBOM_ID */
  String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
  /** Column name M_Product_BOM_UU */
  String COLUMNNAME_M_Product_BOM_UU = "M_Product_BOM_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get BOM Quantity. Bill of Materials Quantity */
  BigDecimal getBOMQty();

  /** Set BOM Quantity. Bill of Materials Quantity */
  void setBOMQty(BigDecimal BOMQty);

  /** Get BOM Type. Type of BOM */
  String getBOMType();

  /** Set BOM Type. Type of BOM */
  void setBOMType(String BOMType);

  /** Get Standard Cost. Standard Costs */
  BigDecimal getCostStandard();

  /** Set Standard Cost. Standard Costs */
  void setCostStandard(BigDecimal CostStandard);

  /** Get Std Cost Amount Sum. Standard Cost Invoice Amount Sum (internal) */
  BigDecimal getCostStandardCumAmt();

  /** Set Std Cost Amount Sum. Standard Cost Invoice Amount Sum (internal) */
  void setCostStandardCumAmt(BigDecimal CostStandardCumAmt);

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

  /** Set Bill of Materials. Bill of Materials */
  void setIsBillOfMaterial(boolean IsBillOfMaterial);

  /** Get Bill of Materials. Bill of Materials */
  boolean isBillOfMaterial();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Part Type */
  int getM_PartType_ID();

  /** Set Part Type */
  void setM_PartType_ID(int M_PartType_ID);

  I_M_PartType getM_PartType() throws RuntimeException;

  /** Get BOM Line */
  int getM_Product_BOM_ID();

  /** Set BOM Line */
  void setM_Product_BOM_ID(int M_Product_BOM_ID);

  /** Get BOM Product. Bill of Material Component Product */
  int getM_ProductBOM_ID();

  /** Set BOM Product. Bill of Material Component Product */
  void setM_ProductBOM_ID(int M_ProductBOM_ID);

  I_M_Product getM_ProductBOM() throws RuntimeException;

  /** Get M_Product_BOM_UU */
  String getM_Product_BOM_UU();

  /** Set M_Product_BOM_UU */
  void setM_Product_BOM_UU(String M_Product_BOM_UU);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
