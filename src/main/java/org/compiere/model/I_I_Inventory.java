package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Inventory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Inventory {

    /**
     * TableName=I_Inventory
     */
    String Table_Name = "I_Inventory";

    /**
     * AD_Table_ID=572
     */
    int Table_ID = 572;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_Inventory_ID
     */
    String COLUMNNAME_I_Inventory_ID = "I_Inventory_ID";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name M_CostingLine_ID
     */
    String COLUMNNAME_M_CostingLine_ID = "M_CostingLine_ID";
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
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Get Current Cost Price. The currently used cost price
     */
    BigDecimal getCurrentCostPrice();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Cost Adjustment Line. Unique line in an Inventory cost adjustment document
     */
    void setM_CostingLine_ID(int M_CostingLine_ID);

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setM_Inventory_ID(int M_Inventory_ID);

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setM_InventoryLine_ID(int M_InventoryLine_ID);

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity book. Book Quantity
     */
    BigDecimal getQtyBook();

    /**
     * Get Quantity count. Counted Quantity
     */
    BigDecimal getQtyCount();

    /**
     * Get Internal Use Qty. Internal Use Quantity removed from Inventory
     */
    BigDecimal getQtyInternalUse();

    /**
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

}
