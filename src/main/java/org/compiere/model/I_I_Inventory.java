package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

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
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name ChargeName
     */
    String COLUMNNAME_ChargeName = "ChargeName";
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
     * Column name DocTypeName
     */
    String COLUMNNAME_DocTypeName = "DocTypeName";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_Inventory_ID
     */
    String COLUMNNAME_I_Inventory_ID = "I_Inventory_ID";
    /**
     * Column name I_Inventory_UU
     */
    String COLUMNNAME_I_Inventory_UU = "I_Inventory_UU";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LocatorValue
     */
    String COLUMNNAME_LocatorValue = "LocatorValue";
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
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Column name WarehouseValue
     */
    String COLUMNNAME_WarehouseValue = "WarehouseValue";
    /**
     * Column name X
     */
    String COLUMNNAME_X = "X";
    /**
     * Column name Y
     */
    String COLUMNNAME_Y = "Y";
    /**
     * Column name Z
     */
    String COLUMNNAME_Z = "Z";

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
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Set Document Type. Document type or rules
     */
    void setC_DocType_ID(int C_DocType_ID);

    I_C_DocType getC_DocType() throws RuntimeException;

    /**
     * Get Charge Name. Name of the Charge
     */
    String getChargeName();

    /**
     * Set Charge Name. Name of the Charge
     */
    void setChargeName(String ChargeName);

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
     * Get Document Type Name. Name of the Document Type
     */
    String getDocTypeName();

    /**
     * Set Document Type Name. Name of the Document Type
     */
    void setDocTypeName(String DocTypeName);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Import Inventory. Import Inventory Transactions
     */
    int getI_Inventory_ID();

    /**
     * Set Import Inventory. Import Inventory Transactions
     */
    void setI_Inventory_ID(int I_Inventory_ID);

    /**
     * Get I_Inventory_UU
     */
    String getI_Inventory_UU();

    /**
     * Set I_Inventory_UU
     */
    void setI_Inventory_UU(String I_Inventory_UU);

    /**
     * Get Imported. Has this import been processed
     */
    boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Locator Key. Key of the Warehouse Locator
     */
    String getLocatorValue();

    /**
     * Set Locator Key. Key of the Warehouse Locator
     */
    void setLocatorValue(String LocatorValue);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

    /**
     * Get Cost Adjustment Line. Unique line in an Inventory cost adjustment document
     */
    int getM_CostingLine_ID();

    /**
     * Set Cost Adjustment Line. Unique line in an Inventory cost adjustment document
     */
    void setM_CostingLine_ID(int M_CostingLine_ID);

    I_M_InventoryLine getM_CostingLine() throws RuntimeException;

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

    I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

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
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

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
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

    /**
     * Set Serial No. Product Serial Number
     */
    void setSerNo(String SerNo);

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

    /**
     * Get Warehouse Key. Key of the Warehouse
     */
    String getWarehouseValue();

    /**
     * Set Warehouse Key. Key of the Warehouse
     */
    void setWarehouseValue(String WarehouseValue);

    /**
     * Get Aisle (X). X dimension, e.g., Aisle
     */
    String getX();

    /**
     * Set Aisle (X). X dimension, e.g., Aisle
     */
    void setX(String X);

    /**
     * Get Bin (Y). Y dimension, e.g., Bin
     */
    String getY();

    /**
     * Set Bin (Y). Y dimension, e.g., Bin
     */
    void setY(String Y);

    /**
     * Get Level (Z). Z dimension, e.g., Level
     */
    String getZ();

    /**
     * Set Level (Z). Z dimension, e.g., Level
     */
    void setZ(String Z);
}
