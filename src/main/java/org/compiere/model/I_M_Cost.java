package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Cost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Cost extends IPO {

    /**
     * TableName=M_Cost
     */
    String Table_Name = "M_Cost";

    /**
     * AD_Table_ID=771
     */
    int Table_ID = 771;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CumulatedAmt
     */
    String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
    /**
     * Column name CumulatedQty
     */
    String COLUMNNAME_CumulatedQty = "CumulatedQty";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentCostPriceLL
     */
    String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
    /**
     * Column name CurrentQty
     */
    String COLUMNNAME_CurrentQty = "CurrentQty";
    /**
     * Column name FutureCostPrice
     */
    String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Percent
     */
    String COLUMNNAME_Percent = "Percent";

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    I_C_AcctSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Accumulated Amt. Total Amount
     */
    BigDecimal getCumulatedAmt();

    /**
     * Set Accumulated Amt. Total Amount
     */
    void setCumulatedAmt(BigDecimal CumulatedAmt);

    /**
     * Get Accumulated Qty. Total Quantity
     */
    BigDecimal getCumulatedQty();

    /**
     * Set Accumulated Qty. Total Quantity
     */
    void setCumulatedQty(BigDecimal CumulatedQty);

    /**
     * Get Current Cost Price. The currently used cost price
     */
    BigDecimal getCurrentCostPrice();

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Get Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    BigDecimal getCurrentCostPriceLL();

    /**
     * Get Current Quantity. Current Quantity
     */
    BigDecimal getCurrentQty();

    /**
     * Set Current Quantity. Current Quantity
     */
    void setCurrentQty(BigDecimal CurrentQty);

    /**
     * Get Future Cost Price
     */
    BigDecimal getFutureCostPrice();

    /**
     * Set Future Cost Price
     */
    void setFutureCostPrice(BigDecimal FutureCostPrice);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Cost Element. Product Cost Element
     */
    int getCostElementId();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    I_M_CostElement getCostElement() throws RuntimeException;

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    int getCostTypeId();

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    void setCostTypeId(int M_CostType_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Percent. Percentage
     */
    int getPercent();

    /**
     * Set Percent. Percentage
     */
    void setPercent(int Percent);

    void deleteEx(boolean b);

    BigDecimal getHistoryAverage();

    void setWeightedAverage(BigDecimal amt, BigDecimal qty);

    void add(BigDecimal amt, BigDecimal qty);

    void setWeightedAverageInitial(BigDecimal amt);
}
