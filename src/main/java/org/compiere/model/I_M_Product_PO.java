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

    /** Load Meta Data */

    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CostPerOrder
     */
    String COLUMNNAME_CostPerOrder = "CostPerOrder";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DeliveryTime_Actual
     */
    String COLUMNNAME_DeliveryTime_Actual = "DeliveryTime_Actual";
    /**
     * Column name DeliveryTime_Promised
     */
    String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
    /**
     * Column name Discontinued
     */
    String COLUMNNAME_Discontinued = "Discontinued";
    /**
     * Column name DiscontinuedAt
     */
    String COLUMNNAME_DiscontinuedAt = "DiscontinuedAt";
    /**
     * Column name IsCurrentVendor
     */
    String COLUMNNAME_IsCurrentVendor = "IsCurrentVendor";
    /**
     * Column name Manufacturer
     */
    String COLUMNNAME_Manufacturer = "Manufacturer";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Product_PO_UU
     */
    String COLUMNNAME_M_Product_PO_UU = "M_Product_PO_UU";
    /**
     * Column name Order_Min
     */
    String COLUMNNAME_Order_Min = "Order_Min";
    /**
     * Column name Order_Pack
     */
    String COLUMNNAME_Order_Pack = "Order_Pack";
    /**
     * Column name PriceEffective
     */
    String COLUMNNAME_PriceEffective = "PriceEffective";
    /**
     * Column name PriceLastInv
     */
    String COLUMNNAME_PriceLastInv = "PriceLastInv";
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
     * Column name QualityRating
     */
    String COLUMNNAME_QualityRating = "QualityRating";
    /**
     * Column name RoyaltyAmt
     */
    String COLUMNNAME_RoyaltyAmt = "RoyaltyAmt";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name VendorCategory
     */
    String COLUMNNAME_VendorCategory = "VendorCategory";
    /**
     * Column name VendorProductNo
     */
    String COLUMNNAME_VendorProductNo = "VendorProductNo";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

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
    int getM_Product_ID();

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
