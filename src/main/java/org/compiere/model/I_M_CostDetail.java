package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostDetail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostDetail {

  /** TableName=M_CostDetail */
  String Table_Name = "M_CostDetail";

  /** AD_Table_ID=808 */
  int Table_ID = 808;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_ProjectIssue_ID */
  String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
    /** Column name CumulatedAmt */
  String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
  /** Column name CumulatedQty */
  String COLUMNNAME_CumulatedQty = "CumulatedQty";
  /** Column name CurrentCostPrice */
  String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
  /** Column name CurrentQty */
  String COLUMNNAME_CurrentQty = "CurrentQty";
  /** Column name DeltaAmt */
  String COLUMNNAME_DeltaAmt = "DeltaAmt";
  /** Column name DeltaQty */
  String COLUMNNAME_DeltaQty = "DeltaQty";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostDetail_ID */
  String COLUMNNAME_M_CostDetail_ID = "M_CostDetail_ID";
  /** Column name M_CostDetail_UU */
  String COLUMNNAME_M_CostDetail_UU = "M_CostDetail_UU";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_InventoryLine_ID */
  String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
  /** Column name M_MatchInv_ID */
  String COLUMNNAME_M_MatchInv_ID = "M_MatchInv_ID";
  /** Column name M_MovementLine_ID */
  String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_ProductionLine_ID */
  String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
  /** Column name PP_Cost_Collector_ID */
  String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
  /** Column name Price */
  String COLUMNNAME_Price = "Price";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";

    /** Get Amount. Amount */
  BigDecimal getAmt();

  /** Set Amount. Amount */
  void setAmt(BigDecimal Amt);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

    /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

    /** Get Project Issue. Project Issues (Material, Labor) */
  int getC_ProjectIssue_ID();

  /** Set Project Issue. Project Issues (Material, Labor) */
  void setC_ProjectIssue_ID(int C_ProjectIssue_ID);

    /** Set Accumulated Amt. Total Amount */
  void setCumulatedAmt(BigDecimal CumulatedAmt);

    /** Set Accumulated Qty. Total Quantity */
  void setCumulatedQty(BigDecimal CumulatedQty);

    /** Set Current Cost Price. The currently used cost price */
  void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /** Set Current Quantity. Current Quantity */
  void setCurrentQty(BigDecimal CurrentQty);

  /** Get Delta Amount. Difference Amount */
  BigDecimal getDeltaAmt();

  /** Set Delta Amount. Difference Amount */
  void setDeltaAmt(BigDecimal DeltaAmt);

  /** Get Delta Quantity. Quantity Difference */
  BigDecimal getDeltaQty();

  /** Set Delta Quantity. Quantity Difference */
  void setDeltaQty(BigDecimal DeltaQty);

    /** Set Description. Optional short description of the record */
  void setDescription(String Description);

    /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Cost Detail. Cost Detail Information */
  int getM_CostDetail_ID();

    /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

    /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

    /** Get Phys.Inventory Line. Unique line in an Inventory document */
  int getM_InventoryLine_ID();

  /** Set Phys.Inventory Line. Unique line in an Inventory document */
  void setM_InventoryLine_ID(int M_InventoryLine_ID);

  I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

  /** Get Match Invoice. Match Shipment/Receipt to Invoice */
  int getM_MatchInv_ID();

  /** Set Match Invoice. Match Shipment/Receipt to Invoice */
  void setM_MatchInv_ID(int M_MatchInv_ID);

    /** Get Move Line. Inventory Move document Line */
  int getM_MovementLine_ID();

  /** Set Move Line. Inventory Move document Line */
  void setM_MovementLine_ID(int M_MovementLine_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Get Production Line. Document Line representing a production */
  int getM_ProductionLine_ID();

  /** Set Production Line. Document Line representing a production */
  void setM_ProductionLine_ID(int M_ProductionLine_ID);

    /** Get Manufacturing Cost Collector */
  int getPP_Cost_Collector_ID();

    /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

}
