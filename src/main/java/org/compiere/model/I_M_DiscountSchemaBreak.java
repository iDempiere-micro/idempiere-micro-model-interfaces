package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_DiscountSchemaBreak
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchemaBreak {

    /**
     * AD_Table_ID=476
     */
    int Table_ID = 476;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name BreakDiscount
     */
    String COLUMNNAME_BreakDiscount = "BreakDiscount";
    /**
     * Column name BreakValue
     */
    String COLUMNNAME_BreakValue = "BreakValue";
    /**
     * Column name IsBPartnerFlatDiscount
     */
    String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";
    /**
     * Column name M_DiscountSchema_ID
     */
    String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Break Discount %. Trade Discount in Percent for the break level
     */
    BigDecimal getBreakDiscount();

    /**
     * Get Break Value. Low Value of trade discount break level
     */
    BigDecimal getBreakValue();

    /**
     * Get B.Partner Flat Discount. Use flat discount defined on Business Partner Level
     */
    boolean isBPartnerFlatDiscount();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
