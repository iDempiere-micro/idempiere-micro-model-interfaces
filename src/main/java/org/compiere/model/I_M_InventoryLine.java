package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InventoryLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InventoryLine extends PersistentObject {

    /**
     * TableName=M_InventoryLine
     */
    String Table_Name = "M_InventoryLine";

    /**
     * AD_Table_ID=322
     */
    int Table_ID = 322;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name InventoryType
     */
    String COLUMNNAME_InventoryType = "InventoryType";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Inventory_ID
     */
    String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name NewCostPrice
     */
    String COLUMNNAME_NewCostPrice = "NewCostPrice";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyBook
     */
    String COLUMNNAME_QtyBook = "QtyBook";
    /**
     * Column name QtyCount
     */
    String COLUMNNAME_QtyCount = "QtyCount";
    /**
     * Column name QtyInternalUse
     */
    String COLUMNNAME_QtyInternalUse = "QtyInternalUse";
    /**
     * Column name ReversalLine_ID
     */
    String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    void setChargeId(int C_Charge_ID);

    /**
     * Get Current Cost Price. The currently used cost price
     */
    BigDecimal getCurrentCostPrice();

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Inventory Type. Type of inventory difference
     */
    String getInventoryType();

    /**
     * Set Inventory Type. Type of inventory difference
     */
    void setInventoryType(String InventoryType);

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
     * Get Phys.Inventory. Parameters for a Physical Inventory
     */
    int getInventoryId();

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setInventoryId(int M_Inventory_ID);

    I_M_Inventory getInventory() throws RuntimeException;

    /**
     * Get Phys.Inventory Line. Unique line in an Inventory document
     */
    int getInventoryLineId();

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

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
     * Get New Cost Price. New current cost price after processing of M_CostDetail
     */
    BigDecimal getNewCostPrice();

    /**
     * Set New Cost Price. New current cost price after processing of M_CostDetail
     */
    void setNewCostPrice(BigDecimal NewCostPrice);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity book. Book Quantity
     */
    BigDecimal getQtyBook();

    /**
     * Set Quantity book. Book Quantity
     */
    void setQtyBook(BigDecimal QtyBook);

    /**
     * Get Quantity count. Counted Quantity
     */
    BigDecimal getQtyCount();

    /**
     * Set Quantity count. Counted Quantity
     */
    void setQtyCount(BigDecimal QtyCount);

    /**
     * Get Internal Use Qty. Internal Use Quantity removed from Inventory
     */
    BigDecimal getQtyInternalUse();

    /**
     * Set Internal Use Qty. Internal Use Quantity removed from Inventory
     */
    void setQtyInternalUse(BigDecimal QtyInternalUse);

    /**
     * Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    void setReversalLineId(int ReversalLine_ID);

    boolean isSOTrx();

    I_M_Inventory getParent();

    void addDescription(String toString);

    void saveEx();
}
