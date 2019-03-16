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
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

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
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Production. Plan for producing a product
     */
    int getProduction_ID();

    /**
     * Set Production. Plan for producing a product
     */
    void setProduction_ID(int M_Production_ID);

    I_M_Production getProduction() throws RuntimeException;

    /**
     * Get Production Line. Document Line representing a production
     */
    int getProductionLineId();

    /**
     * Set Production Line. Document Line representing a production
     */
    void setProductionLineId(int M_ProductionLine_ID);

    /**
     * Get Production Plan. Plan for how a product is produced
     */
    int getProductionPlan_ID();

    /**
     * Set Production Plan. Plan for how a product is produced
     */
    void setProductionPlan_ID(int M_ProductionPlan_ID);

    I_M_ProductionPlan getProductionPlan() throws RuntimeException;

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
