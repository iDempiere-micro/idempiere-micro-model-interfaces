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

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

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

    /** Get Landed Cost Allocation. Allocation for Land Costs */
  int getC_LandedCostAllocation_ID();

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

    /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

}
