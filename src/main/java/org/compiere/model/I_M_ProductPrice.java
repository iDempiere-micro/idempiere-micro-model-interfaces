package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ProductPrice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductPrice extends IPO {

    /**
     * TableName=M_ProductPrice
     */
    String Table_Name = "M_ProductPrice";

    /**
     * AD_Table_ID=251
     */
    int Table_ID = 251;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name PriceStd
     */
    String COLUMNNAME_PriceStd = "PriceStd";

    /**
     * Get Price List Version. Identifies a unique instance of a Price List
     */
    int getPriceListVersionId();

    /**
     * Set Price List Version. Identifies a unique instance of a Price List
     */
    void setPriceListVersionId(int M_PriceList_Version_ID);

    I_M_PriceList_Version getPriceListVersion() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Limit Price. Lowest price for a product
     */
    BigDecimal getPriceLimit();

    /**
     * Set Limit Price. Lowest price for a product
     */
    void setPriceLimit(BigDecimal PriceLimit);

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Set List Price. List Price
     */
    void setPriceList(BigDecimal PriceList);

    /**
     * Get Standard Price. Standard Price
     */
    BigDecimal getPriceStd();

    /**
     * Set Standard Price. Standard Price
     */
    void setPriceStd(BigDecimal PriceStd);

}
