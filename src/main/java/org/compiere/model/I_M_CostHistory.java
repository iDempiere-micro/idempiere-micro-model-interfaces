package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_CostHistory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostHistory {

    /**
     * AD_Table_ID=200001
     */
    int Table_ID = 200001;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_CostDetail_ID
     */
    String COLUMNNAME_M_CostDetail_ID = "M_CostDetail_ID";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name NewCAmt
     */
    String COLUMNNAME_NewCAmt = "NewCAmt";
    /**
     * Column name NewCostPrice
     */
    String COLUMNNAME_NewCostPrice = "NewCostPrice";
    /**
     * Column name NewCQty
     */
    String COLUMNNAME_NewCQty = "NewCQty";
    /**
     * Column name NewQty
     */
    String COLUMNNAME_NewQty = "NewQty";
    /**
     * Column name OldCAmt
     */
    String COLUMNNAME_OldCAmt = "OldCAmt";
    /**
     * Column name OldCostPrice
     */
    String COLUMNNAME_OldCostPrice = "OldCostPrice";
    /**
     * Column name OldCQty
     */
    String COLUMNNAME_OldCQty = "OldCQty";
    /**
     * Column name OldQty
     */
    String COLUMNNAME_OldQty = "OldQty";

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Set Cost Detail. Cost Detail Information
     */
    void setCostDetailId(int M_CostDetail_ID);

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    void setCostTypeId(int M_CostType_ID);

    /**
     * Set New Accumulated Amt. Accumulated Amt after processing of M_CostDetail
     */
    void setNewCAmt(BigDecimal NewCAmt);

    /**
     * Get New Cost Price. New current cost price after processing of M_CostDetail
     */
    BigDecimal getNewCostPrice();

    /**
     * Set New Cost Price. New current cost price after processing of M_CostDetail
     */
    void setNewCostPrice(BigDecimal NewCostPrice);

    /**
     * Set New Accumulated Qty. New Accumulated Qty after processing of M_CostDetail
     */
    void setNewCQty(BigDecimal NewCQty);

    /**
     * Get New Current Quantity. New current quantity after processing of M_CostDetail
     */
    BigDecimal getNewQty();

    /**
     * Set New Current Quantity. New current quantity after processing of M_CostDetail
     */
    void setNewQty(BigDecimal NewQty);

    /**
     * Get Old Accumulated Amt. Old accumulated amt before the processing of M_CostDetail
     */
    BigDecimal getOldCAmt();

    /**
     * Set Old Accumulated Amt. Old accumulated amt before the processing of M_CostDetail
     */
    void setOldCAmt(BigDecimal OldCAmt);

    /**
     * Get Old Current Cost Price. Old current cost price before the processing of M_CostDetail
     */
    BigDecimal getOldCostPrice();

    /**
     * Set Old Current Cost Price. Old current cost price before the processing of M_CostDetail
     */
    void setOldCostPrice(BigDecimal OldCostPrice);

    /**
     * Get Old Accumulated Qty. Old accumulated qty before the processing of M_CostDetail
     */
    BigDecimal getOldCQty();

    /**
     * Set Old Accumulated Qty. Old accumulated qty before the processing of M_CostDetail
     */
    void setOldCQty(BigDecimal OldCQty);

    /**
     * Get Old Current Quantity. Old current quantity before the processing of M_CostDetail
     */
    BigDecimal getOldQty();

    /**
     * Set Old Current Quantity. Old current quantity before the processing of M_CostDetail
     */
    void setOldQty(BigDecimal OldQty);

}
