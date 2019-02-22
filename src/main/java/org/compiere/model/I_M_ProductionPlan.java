package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ProductionPlan
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductionPlan {

    /**
     * TableName=M_ProductionPlan
     */
    String Table_Name = "M_ProductionPlan";

    /**
     * AD_Table_ID=385
     */
    int Table_ID = 385;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Production_ID
     */
    String COLUMNNAME_M_Production_ID = "M_Production_ID";
    /**
     * Column name M_ProductionPlan_ID
     */
    String COLUMNNAME_M_ProductionPlan_ID = "M_ProductionPlan_ID";
    /**
     * Column name M_ProductionPlan_UU
     */
    String COLUMNNAME_M_ProductionPlan_UU = "M_ProductionPlan_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProductionQty
     */
    String COLUMNNAME_ProductionQty = "ProductionQty";

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Production. Plan for producing a product
     */
    int getM_Production_ID();

    /**
     * Set Production. Plan for producing a product
     */
    void setM_Production_ID(int M_Production_ID);

    /**
     * Get Production Plan. Plan for how a product is produced
     */
    int getM_ProductionPlan_ID();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Production Quantity. Quantity of products to produce
     */
    BigDecimal getProductionQty();

    /**
     * Set Production Quantity. Quantity of products to produce
     */
    void setProductionQty(BigDecimal ProductionQty);

}
