package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_CostQueue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostQueue {

    /**
     * AD_Table_ID=817
     */
    int Table_ID = 817;

    /**
     * TableName=M_CostQueue
     */
    String Table_Name = "M_CostQueue";


    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentQty
     */
    String COLUMNNAME_CurrentQty = "CurrentQty";
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
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    /**
     * Get Current Cost Price. The currently used cost price
     */
    BigDecimal getCurrentCostPrice();

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Get Current Quantity. Current Quantity
     */
    BigDecimal getCurrentQty();

    /**
     * Set Current Quantity. Current Quantity
     */
    void setCurrentQty(BigDecimal CurrentQty);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    void setCostTypeId(int M_CostType_ID);

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

}
