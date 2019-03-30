package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_StorageOnHand
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_StorageOnHand extends IPO {

    /**
     * TableName=M_StorageOnHand
     */
    String Table_Name = "M_StorageOnHand";

    /**
     * AD_Table_ID=200026
     */
    int Table_ID = 200026;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name DateLastInventory
     */
    String COLUMNNAME_DateLastInventory = "DateLastInventory";
    /**
     * Column name DateMaterialPolicy
     */
    String COLUMNNAME_DateMaterialPolicy = "DateMaterialPolicy";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name QtyOnHand
     */
    String COLUMNNAME_QtyOnHand = "QtyOnHand";

    /**
     * Set Date last inventory count. Date of Last Inventory Count
     */
    void setDateLastInventory(Timestamp DateLastInventory);

    /**
     * Get Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    Timestamp getDateMaterialPolicy();

    /**
     * Set Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    void setDateMaterialPolicy(Timestamp DateMaterialPolicy);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

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

    /**
     * Get On Hand Quantity. On Hand Quantity
     */
    BigDecimal getQtyOnHand();

    /**
     * Set On Hand Quantity. On Hand Quantity
     */
    void setQtyOnHand(BigDecimal QtyOnHand);


    /** Get Updated.
     * Date this record was updated
     */
    Timestamp getUpdated();

    /** Get Updated in ISO 9601 format.
     * Date this record was updated in ISO 9601 format
     */
    String getDateUpdatedISOFormat();

}
