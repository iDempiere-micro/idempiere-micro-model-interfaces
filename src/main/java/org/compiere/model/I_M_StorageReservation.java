package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_StorageReservation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_StorageReservation {

    /**
     * TableName=M_StorageReservation
     */
    String Table_Name = "M_StorageReservation";

    /**
     * AD_Table_ID=200027
     */
    int Table_ID = 200027;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

}
