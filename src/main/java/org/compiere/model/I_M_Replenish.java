package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Replenish
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Replenish {

    /**
     * TableName=M_Replenish
     */
    String Table_Name = "M_Replenish";

    /**
     * AD_Table_ID=249
     */
    int Table_ID = 249;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Level_Max
     */
    String COLUMNNAME_Level_Max = "Level_Max";
    /**
     * Column name Level_Min
     */
    String COLUMNNAME_Level_Min = "Level_Min";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Replenish_UU
     */
    String COLUMNNAME_M_Replenish_UU = "M_Replenish_UU";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name M_WarehouseSource_ID
     */
    String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
    /**
     * Column name QtyBatchSize
     */
    String COLUMNNAME_QtyBatchSize = "QtyBatchSize";
    /**
     * Column name ReplenishType
     */
    String COLUMNNAME_ReplenishType = "ReplenishType";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Maximum Level. Maximum Inventory level for this product
     */
    BigDecimal getLevel_Max();

    /**
     * Set Maximum Level. Maximum Inventory level for this product
     */
    void setLevel_Max(BigDecimal Level_Max);

    /**
     * Get Minimum Level. Minimum Inventory level for this product
     */
    BigDecimal getLevel_Min();

    /**
     * Set Minimum Level. Minimum Inventory level for this product
     */
    void setLevel_Min(BigDecimal Level_Min);

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
     * Get M_Replenish_UU
     */
    String getM_Replenish_UU();

    /**
     * Set M_Replenish_UU
     */
    void setM_Replenish_UU(String M_Replenish_UU);

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
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    int getM_WarehouseSource_ID();

    /**
     * Set Source Warehouse. Optional Warehouse to replenish from
     */
    void setM_WarehouseSource_ID(int M_WarehouseSource_ID);

    I_M_Warehouse getM_WarehouseSource() throws RuntimeException;

    /**
     * Get Qty Batch Size
     */
    BigDecimal getQtyBatchSize();

    /**
     * Set Qty Batch Size
     */
    void setQtyBatchSize(BigDecimal QtyBatchSize);

    /**
     * Get Replenish Type. Method for re-ordering a product
     */
    String getReplenishType();

    /**
     * Set Replenish Type. Method for re-ordering a product
     */
    void setReplenishType(String ReplenishType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
