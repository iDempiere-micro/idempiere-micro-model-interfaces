package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    int getM_WarehouseSource_ID();

    /**
     * Get Qty Batch Size
     */
    BigDecimal getQtyBatchSize();

}
