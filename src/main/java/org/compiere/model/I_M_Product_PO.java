package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Product_PO
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_PO {

    /**
     * TableName=M_Product_PO
     */
    String Table_Name = "M_Product_PO";

    /**
     * AD_Table_ID=210
     */
    int Table_ID = 210;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name IsCurrentVendor
     */
    String COLUMNNAME_IsCurrentVendor = "IsCurrentVendor";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PriceLastPO
     */
    String COLUMNNAME_PriceLastPO = "PriceLastPO";
    /**
     * Column name PriceList
     */
    String COLUMNNAME_PriceList = "PriceList";
    /**
     * Column name PricePO
     */
    String COLUMNNAME_PricePO = "PricePO";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set Current vendor. Use this Vendor for pricing and stock replenishment
     */
    void setIsCurrentVendor(boolean IsCurrentVendor);

    /**
     * Get Current vendor. Use this Vendor for pricing and stock replenishment
     */
    boolean isCurrentVendor();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Last PO Price. Price of the last purchase order for the product
     */
    BigDecimal getPriceLastPO();

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Get PO Price. Price based on a purchase order
     */
    BigDecimal getPricePO();

}
