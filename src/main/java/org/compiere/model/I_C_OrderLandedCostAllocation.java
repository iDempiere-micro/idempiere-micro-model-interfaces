package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_OrderLandedCostAllocation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLandedCostAllocation {

    /**
     * TableName=C_OrderLandedCostAllocation
     */
    String Table_Name = "C_OrderLandedCostAllocation";

    /**
     * AD_Table_ID=200104
     */
    int Table_ID = 200104;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name Base
     */
    String COLUMNNAME_Base = "Base";
    /**
     * Column name C_OrderLandedCostAllocation_ID
     */
    String COLUMNNAME_C_OrderLandedCostAllocation_ID = "C_OrderLandedCostAllocation_ID";
    /**
     * Column name C_OrderLandedCost_ID
     */
    String COLUMNNAME_C_OrderLandedCost_ID = "C_OrderLandedCost_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";

    /**
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Set Amount. Amount
     */
    void setAmt(BigDecimal Amt);

    /**
     * Set Base. Calculation Base
     */
    void setBase(BigDecimal Base);

    /**
     * Get Estimated Landed Cost Allocation
     */
    int getOrderLandedCostAllocationId();

    /**
     * Get Estimated Landed Cost
     */
    int getOrderLandedCostId();

    /**
     * Set Estimated Landed Cost
     */
    void setOrderLandedCostId(int C_OrderLandedCost_ID);

    I_C_OrderLandedCost getOrderLandedCost() throws RuntimeException;

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getOrderLineId();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    I_C_OrderLine getOrderLine() throws RuntimeException;

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

}
