package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_OrderLandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLandedCost {

    /**
     * TableName=C_OrderLandedCost
     */
    String Table_Name = "C_OrderLandedCost";

    /**
     * AD_Table_ID=200103
     */
    int Table_ID = 200103;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderLandedCost_ID
     */
    String COLUMNNAME_C_OrderLandedCost_ID = "C_OrderLandedCost_ID";
    /**
     * Column name LandedCostDistribution
     */
    String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";

    /**
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Get Order. Order
     */
    int getOrderId();

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Estimated Landed Cost
     */
    int getC_OrderLandedCost_ID();

    /**
     * Get Cost Distribution. Landed Cost Distribution
     */
    String getLandedCostDistribution();

    /**
     * Get Cost Element. Product Cost Element
     */
    int getM_CostElement_ID();

}
