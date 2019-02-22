package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ProductionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductionLine {

    /**
     * TableName=M_ProductionLine
     */
    String Table_Name = "M_ProductionLine";

    /**
     * AD_Table_ID=326
     */
    int Table_ID = 326;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsEndProduct
     */
    String COLUMNNAME_IsEndProduct = "IsEndProduct";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Production_ID
     */
    String COLUMNNAME_M_Production_ID = "M_Production_ID";
    /**
     * Column name M_ProductionLine_ID
     */
    String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
    /**
     * Column name M_ProductionLine_UU
     */
    String COLUMNNAME_M_ProductionLine_UU = "M_ProductionLine_UU";
    /**
     * Column name M_ProductionPlan_ID
     */
    String COLUMNNAME_M_ProductionPlan_ID = "M_ProductionPlan_ID";
    /**
     * Column name PlannedQty
     */
    String COLUMNNAME_PlannedQty = "PlannedQty";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProductType
     */
    String COLUMNNAME_ProductType = "ProductType";
    /**
     * Column name QtyAvailable
     */
    String COLUMNNAME_QtyAvailable = "QtyAvailable";
    /**
     * Column name QtyUsed
     */
    String COLUMNNAME_QtyUsed = "QtyUsed";

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set End Product. End Product of production
     */
    void setIsEndProduct(boolean IsEndProduct);

    /**
     * Get End Product. End Product of production
     */
    boolean isEndProduct();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Production. Plan for producing a product
     */
    int getM_Production_ID();

    /**
     * Set Production. Plan for producing a product
     */
    void setM_Production_ID(int M_Production_ID);

    I_M_Production getM_Production() throws RuntimeException;

    /**
     * Get Production Line. Document Line representing a production
     */
    int getM_ProductionLine_ID();

    /**
     * Set Production Line. Document Line representing a production
     */
    void setM_ProductionLine_ID(int M_ProductionLine_ID);

    /**
     * Get Production Plan. Plan for how a product is produced
     */
    int getM_ProductionPlan_ID();

    /**
     * Set Production Plan. Plan for how a product is produced
     */
    void setM_ProductionPlan_ID(int M_ProductionPlan_ID);

    I_M_ProductionPlan getM_ProductionPlan() throws RuntimeException;

    /**
     * Get Planned Quantity. Planned quantity for this project
     */
    BigDecimal getPlannedQty();

    /**
     * Set Planned Quantity. Planned quantity for this project
     */
    void setPlannedQty(BigDecimal PlannedQty);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity Used
     */
    BigDecimal getQtyUsed();

    /**
     * Set Quantity Used
     */
    void setQtyUsed(BigDecimal QtyUsed);

}
