package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for T_Replenish
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Replenish {

    /**
     * AD_Table_ID=364
     */
    int Table_ID = 364;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name M_WarehouseSource_ID
     */
    String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
    /**
     * Column name QtyToOrder
     */
    String COLUMNNAME_QtyToOrder = "QtyToOrder";
    /**
     * Column name ReplenishType
     */
    String COLUMNNAME_ReplenishType = "ReplenishType";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    int getWarehouseSourceId();

    /**
     * Get Quantity to Order
     */
    BigDecimal getQtyToOrder();

    /**
     * Set Quantity to Order
     */
    void setQtyToOrder(BigDecimal QtyToOrder);

    /**
     * Get Replenish Type. Method for re-ordering a product
     */
    String getReplenishType();

}
