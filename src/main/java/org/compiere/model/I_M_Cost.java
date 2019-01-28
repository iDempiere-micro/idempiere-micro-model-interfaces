package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Cost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Cost {

  /** TableName=M_Cost */
  String Table_Name = "M_Cost";

  /** AD_Table_ID=771 */
  int Table_ID = 771;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name CostingMethod */
  String COLUMNNAME_CostingMethod = "CostingMethod";
    /** Column name CumulatedAmt */
  String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
  /** Column name CumulatedQty */
  String COLUMNNAME_CumulatedQty = "CumulatedQty";
  /** Column name CurrentCostPrice */
  String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
  /** Column name CurrentCostPriceLL */
  String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
  /** Column name CurrentQty */
  String COLUMNNAME_CurrentQty = "CurrentQty";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FutureCostPrice */
  String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
  /** Column name FutureCostPriceLL */
  String COLUMNNAME_FutureCostPriceLL = "FutureCostPriceLL";
    /** Column name IsCostFrozen */
  String COLUMNNAME_IsCostFrozen = "IsCostFrozen";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_CostType_ID */
  String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
  /** Column name M_Cost_UU */
  String COLUMNNAME_M_Cost_UU = "M_Cost_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Percent */
  String COLUMNNAME_Percent = "Percent";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";

    /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /** Get Accumulated Amt. Total Amount */
  BigDecimal getCumulatedAmt();

  /** Set Accumulated Amt. Total Amount */
  void setCumulatedAmt(BigDecimal CumulatedAmt);

  /** Get Accumulated Qty. Total Quantity */
  BigDecimal getCumulatedQty();

  /** Set Accumulated Qty. Total Quantity */
  void setCumulatedQty(BigDecimal CumulatedQty);

  /** Get Current Cost Price. The currently used cost price */
  BigDecimal getCurrentCostPrice();

  /** Set Current Cost Price. The currently used cost price */
  void setCurrentCostPrice(BigDecimal CurrentCostPrice);

  /**
   * Get Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
   * components of this product manufactured for this level.
   */
  BigDecimal getCurrentCostPriceLL();

    /** Get Current Quantity. Current Quantity */
  BigDecimal getCurrentQty();

  /** Set Current Quantity. Current Quantity */
  void setCurrentQty(BigDecimal CurrentQty);

    /** Get Future Cost Price */
  BigDecimal getFutureCostPrice();

  /** Set Future Cost Price */
  void setFutureCostPrice(BigDecimal FutureCostPrice);

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

  I_M_CostElement getM_CostElement() throws RuntimeException;

  /** Get Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  int getM_CostType_ID();

  /** Set Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  void setM_CostType_ID(int M_CostType_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Percent. Percentage */
  int getPercent();

  /** Set Percent. Percentage */
  void setPercent(int Percent);

}
