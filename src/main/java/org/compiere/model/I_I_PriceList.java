package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_PriceList
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_PriceList {

    /**
     * AD_Table_ID=53173
     */
    int Table_ID = 53173;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name BreakValue
     */
    String COLUMNNAME_BreakValue = "BreakValue";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EnforcePriceLimit
     */
    String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
    /**
     * Column name I_PriceList_ID
     */
    String COLUMNNAME_I_PriceList_ID = "I_PriceList_ID";
    /**
     * Column name IsSOPriceList
     */
    String COLUMNNAME_IsSOPriceList = "IsSOPriceList";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PriceLimit
     */
    String COLUMNNAME_PriceLimit = "PriceLimit";
    /**
     * Column name PriceList
     */
    String COLUMNNAME_PriceList = "PriceList";
    /**
     * Column name PricePrecision
     */
    String COLUMNNAME_PricePrecision = "PricePrecision";
    /**
     * Column name PriceStd
     */
    String COLUMNNAME_PriceStd = "PriceStd";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

    /**
     * Get Break Value. Low Value of trade discount break level
     */
    BigDecimal getBreakValue();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Enforce price limit. Do not allow prices below the limit price
     */
    boolean isEnforcePriceLimit();

    /**
     * Get Import Price List
     */
    int getI_PriceList_ID();

    /**
     * Get Sales Price list. This is a Sales Price List
     */
    boolean isSOPriceList();

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Get Price List Version. Identifies a unique instance of a Price List
     */
    int getM_PriceList_Version_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Limit Price. Lowest price for a product
     */
    BigDecimal getPriceLimit();

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Get Price Precision. Precision (number of decimals) for the Price
     */
    int getPricePrecision();

    /**
     * Get Standard Price. Standard Price
     */
    BigDecimal getPriceStd();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

}
