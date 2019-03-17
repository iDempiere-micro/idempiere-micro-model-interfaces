package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_MovementLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MovementLine {

    /**
     * TableName=M_MovementLine
     */
    String Table_Name = "M_MovementLine";

    /**
     * AD_Table_ID=324
     */
    int Table_ID = 324;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name ConfirmedQty
     */
    String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
    /**
     * Column name DD_OrderLine_ID
     */
    String COLUMNNAME_DD_OrderLine_ID = "DD_OrderLine_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_AttributeSetInstanceTo_ID
     */
    String COLUMNNAME_M_AttributeSetInstanceTo_ID = "M_AttributeSetInstanceTo_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_LocatorTo_ID
     */
    String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
    /**
     * Column name M_Movement_ID
     */
    String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
    /**
     * Column name M_MovementLine_ID
     */
    String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ReversalLine_ID
     */
    String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name TargetQty
     */
    String COLUMNNAME_TargetQty = "TargetQty";

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Set Attribute Set Instance To. Target Product Attribute Set Instance
     */
    void setM_AttributeSetInstanceTo_ID(int M_AttributeSetInstanceTo_ID);

    /**
     * Get Attribute Set Instance To. Target Product Attribute Set Instance
     */
    int getMAttributeSetInstanceTo_ID();

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    /**
     * Get Locator To. Location inventory is moved to
     */
    int getLocatorTo_ID();

    /**
     * Set Locator To. Location inventory is moved to
     */
    void setLocatorTo_ID(int M_LocatorTo_ID);

    /**
     * Get Inventory Move. Movement of Inventory
     */
    int getMovementId();

    /**
     * Set Inventory Move. Movement of Inventory
     */
    void setMovementId(int M_Movement_ID);

    I_M_Movement getM_Movement() throws RuntimeException;

    /**
     * Get Move Line. Inventory Move document Line
     */
    int getMovementLineId();

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

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    void setReversalLineId(int ReversalLine_ID);

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Set Target Quantity. Target Movement Quantity
     */
    void setTargetQty(BigDecimal TargetQty);

}
