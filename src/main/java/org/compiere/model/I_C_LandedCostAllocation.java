package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_LandedCostAllocation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_LandedCostAllocation {

  /** TableName=C_LandedCostAllocation */
  String Table_Name = "C_LandedCostAllocation";

  /** AD_Table_ID=760 */
  int Table_ID = 760;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name Base */
  String COLUMNNAME_Base = "Base";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_LandedCostAllocation_ID */
  String COLUMNNAME_C_LandedCostAllocation_ID = "C_LandedCostAllocation_ID";
  /** Column name C_LandedCostAllocation_UU */
  String COLUMNNAME_C_LandedCostAllocation_UU = "C_LandedCostAllocation_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Amount. Amount */
  BigDecimal getAmt();

  /** Set Amount. Amount */
  void setAmt(BigDecimal Amt);

  /** Get Base. Calculation Base */
  BigDecimal getBase();

  /** Set Base. Calculation Base */
  void setBase(BigDecimal Base);

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Landed Cost Allocation. Allocation for Land Costs */
  int getC_LandedCostAllocation_ID();

  /** Set Landed Cost Allocation. Allocation for Land Costs */
  void setC_LandedCostAllocation_ID(int C_LandedCostAllocation_ID);

  /** Get C_LandedCostAllocation_UU */
  String getC_LandedCostAllocation_UU();

  /** Set C_LandedCostAllocation_UU */
  void setC_LandedCostAllocation_UU(String C_LandedCostAllocation_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

  I_M_CostElement getM_CostElement() throws RuntimeException;

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

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
