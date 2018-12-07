package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_InventoryLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InventoryLine {

    /**
     * TableName=M_InventoryLine
     */
    String Table_Name = "M_InventoryLine";

    /**
     * AD_Table_ID=322
     */
    int Table_ID = 322;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name M_InventoryLine_UU
     */
    String COLUMNNAME_M_InventoryLine_UU = "M_InventoryLine_UU";
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
     * Column name QtyCsv
     */
    String COLUMNNAME_QtyCsv = "QtyCsv";
    /**
     * Column name QtyInternalUse
     */
    String COLUMNNAME_QtyInternalUse = "QtyInternalUse";
    /**
     * Column name ReversalLine_ID
     */
    String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Phys.Inventory. Parameters for a Physical Inventory
     */
    int getM_Inventory_ID();

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setM_Inventory_ID(int M_Inventory_ID);

    I_M_Inventory getM_Inventory() throws RuntimeException;

    /**
     * Get Phys.Inventory Line. Unique line in an Inventory document
     */
    int getM_InventoryLine_ID();

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setM_InventoryLine_ID(int M_InventoryLine_ID);

    /**
     * Get M_InventoryLine_UU
     */
    String getM_InventoryLine_UU();

    /**
     * Set M_InventoryLine_UU
     */
    void setM_InventoryLine_UU(String M_InventoryLine_UU);

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

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
     * Get New Cost Price. New current cost price after processing of M_CostDetail
     */
    BigDecimal getNewCostPrice();

    /**
     * Set New Cost Price. New current cost price after processing of M_CostDetail
     */
    void setNewCostPrice(BigDecimal NewCostPrice);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

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
     * Get QtyCsv
     */
    BigDecimal getQtyCsv();

    /**
     * Set QtyCsv
     */
    void setQtyCsv(BigDecimal QtyCsv);

    /**
     * Get Internal Use Qty. Internal Use Quantity removed from Inventory
     */
    BigDecimal getQtyInternalUse();

    /**
     * Set Internal Use Qty. Internal Use Quantity removed from Inventory
     */
    void setQtyInternalUse(BigDecimal QtyInternalUse);

    /**
     * Get Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    int getReversalLine_ID();

    /**
     * Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    void setReversalLine_ID(int ReversalLine_ID);

    I_M_InventoryLine getReversalLine() throws RuntimeException;

    /**
     * Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    String getUPC();

    /**
     * Set UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    void setUPC(String UPC);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
