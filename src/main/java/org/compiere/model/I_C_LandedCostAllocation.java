package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_LandedCostAllocation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_LandedCostAllocation {

    /**
     * AD_Table_ID=760
     */
    int Table_ID = 760;

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
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_LandedCostAllocation_ID
     */
    String COLUMNNAME_C_LandedCostAllocation_ID = "C_LandedCostAllocation_ID";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
     * Get Base. Calculation Base
     */
    BigDecimal getBase();

    /**
     * Set Base. Calculation Base
     */
    void setBase(BigDecimal Base);

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

    /**
     * Get Landed Cost Allocation. Allocation for Land Costs
     */
    int getC_LandedCostAllocation_ID();

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

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    I_M_InOutLine getInOutLine() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

}
