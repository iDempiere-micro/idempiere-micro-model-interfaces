package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostQueue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostQueue {

  /** TableName=M_CostQueue */
  String Table_Name = "M_CostQueue";

  /** AD_Table_ID=817 */
  int Table_ID = 817;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /** Column name CurrentCostPrice */
  String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
  /** Column name CurrentQty */
  String COLUMNNAME_CurrentQty = "CurrentQty";
    /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_CostQueue_ID */
  String COLUMNNAME_M_CostQueue_ID = "M_CostQueue_ID";
  /** Column name M_CostQueue_UU */
  String COLUMNNAME_M_CostQueue_UU = "M_CostQueue_UU";
  /** Column name M_CostType_ID */
  String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

    /** Get Current Cost Price. The currently used cost price */
  BigDecimal getCurrentCostPrice();

  /** Set Current Cost Price. The currently used cost price */
  void setCurrentCostPrice(BigDecimal CurrentCostPrice);

  /** Get Current Quantity. Current Quantity */
  BigDecimal getCurrentQty();

  /** Set Current Quantity. Current Quantity */
  void setCurrentQty(BigDecimal CurrentQty);

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

    /** Get Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  int getM_CostType_ID();

  /** Set Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  void setM_CostType_ID(int M_CostType_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

}
