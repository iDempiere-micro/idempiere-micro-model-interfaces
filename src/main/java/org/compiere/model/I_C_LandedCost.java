package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for C_LandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_LandedCost extends PersistentObject {

    /**
     * AD_Table_ID=759
     */
    int Table_ID = 759;

    /**
     * TableName=C_LandedCost
     */
    String Table_Name = "C_LandedCost";

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name LandedCostDistribution
     */
    String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getInvoiceLineId();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

    /**
     * Get Cost Distribution. Landed Cost Distribution
     */
    String getLandedCostDistribution();

    /**
     * Set Cost Distribution. Landed Cost Distribution
     */
    void setLandedCostDistribution(String LandedCostDistribution);

    /**
     * Get Cost Element. Product Cost Element
     */
    int getCostElementId();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getInOutId();

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

}
