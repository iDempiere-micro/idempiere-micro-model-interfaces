package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_LandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_LandedCost {

    /**
     * TableName=C_LandedCost
     */
    String Table_Name = "C_LandedCost";

    /**
     * AD_Table_ID=759
     */
    int Table_ID = 759;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_LandedCost_ID
     */
    String COLUMNNAME_C_LandedCost_ID = "C_LandedCost_ID";
    /**
     * Column name C_LandedCost_UU
     */
    String COLUMNNAME_C_LandedCost_UU = "C_LandedCost_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
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
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

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
    int getM_CostElement_ID();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getM_InOut_ID();

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

}
