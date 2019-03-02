package org.compiere.model;

import java.math.BigDecimal;
import java.util.Properties;

/**
 * Generated Interface for M_Warehouse
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Warehouse {

    /**
     * TableName=M_Warehouse
     */
    String Table_Name = "M_Warehouse";

    /**
     * AD_Table_ID=190
     */
    int Table_ID = 190;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name IsDisallowNegativeInv
     */
    String COLUMNNAME_IsDisallowNegativeInv = "IsDisallowNegativeInv";
    /**
     * Column name IsInTransit
     */
    String COLUMNNAME_IsInTransit = "IsInTransit";
    /**
     * Column name M_ReserveLocator_ID
     */
    String COLUMNNAME_M_ReserveLocator_ID = "M_ReserveLocator_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name M_WarehouseSource_ID
     */
    String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
    /**
     * Column name ReplenishmentClass
     */
    String COLUMNNAME_ReplenishmentClass = "ReplenishmentClass";
    /**
     * Column name Separator
     */
    String COLUMNNAME_Separator = "Separator";

    /**
     * Set Address. Location or Address
     */
    void setLocationId(int C_Location_ID);

    /**
     * Get Disallow Negative Inventory. Negative Inventory is not allowed in this warehouse
     */
    boolean isDisallowNegativeInv();

    /**
     * Get In Transit. Movement is in transit
     */
    boolean isInTransit();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    int getM_WarehouseSource_ID();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Replenishment Class. Custom class to calculate Quantity to Order
     */
    String getReplenishmentClass();

    /**
     * Set Element Separator. Element Separator
     */
    void setSeparator(String Separator);

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setSearchKey(String Value);

    Properties getCtx();
}
