package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_LandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_LandedCost {

  /** TableName=C_LandedCost */
  String Table_Name = "C_LandedCost";

  /** AD_Table_ID=759 */
  int Table_ID = 759;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_LandedCost_ID */
  String COLUMNNAME_C_LandedCost_ID = "C_LandedCost_ID";
  /** Column name C_LandedCost_UU */
  String COLUMNNAME_C_LandedCost_UU = "C_LandedCost_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name LandedCostDistribution */
  String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Landed Cost. Landed cost to be allocated to material receipts */
  int getC_LandedCost_ID();

  /** Set Landed Cost. Landed cost to be allocated to material receipts */
  void setC_LandedCost_ID(int C_LandedCost_ID);

  /** Get C_LandedCost_UU */
  String getC_LandedCost_UU();

  /** Set C_LandedCost_UU */
  void setC_LandedCost_UU(String C_LandedCost_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Cost Distribution. Landed Cost Distribution */
  String getLandedCostDistribution();

  /** Set Cost Distribution. Landed Cost Distribution */
  void setLandedCostDistribution(String LandedCostDistribution);

  /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

  I_M_CostElement getM_CostElement() throws RuntimeException;

  /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

  /** Set Shipment/Receipt. Material Shipment Document */
  void setM_InOut_ID(int M_InOut_ID);

  I_M_InOut getM_InOut() throws RuntimeException;

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
