package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BP_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Group {

    /**
     * TableName=C_BP_Group
     */
    String Table_Name = "C_BP_Group";

    /**
     * AD_Table_ID=394
     */
    int Table_ID = 394;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name C_Dunning_ID
     */
    String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
    /**
     * Column name CreditWatchPercent
     */
    String COLUMNNAME_CreditWatchPercent = "CreditWatchPercent";
    /**
     * Column name IsConfidentialInfo
     */
    String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name M_DiscountSchema_ID
     */
    String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name PO_DiscountSchema_ID
     */
    String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
    /**
     * Column name PO_PriceList_ID
     */
    String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
    /**
     * Column name PriceMatchTolerance
     */
    String COLUMNNAME_PriceMatchTolerance = "PriceMatchTolerance";
    /**
     * Column name PriorityBase
     */
    String COLUMNNAME_PriorityBase = "PriorityBase";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getC_BP_Group_ID();

    /**
     * Get Dunning. Dunning Rules for overdue invoices
     */
    int getC_Dunning_ID();

    /**
     * Get Credit Watch %. Credit Watch - Percent of Credit Limit when OK switches to Watch
     */
    BigDecimal getCreditWatchPercent();

    /**
     * Set Confidential Info. Can enter confidential information
     */
    void setIsConfidentialInfo(boolean IsConfidentialInfo);

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Discount Schema. Schema to calculate the trade discount percentage
     */
    int getM_DiscountSchema_ID();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getM_PriceList_ID();

    /**
     * Get PO Discount Schema. Schema to calculate the purchase trade discount percentage
     */
    int getPO_DiscountSchema_ID();

    /**
     * Get Purchase Pricelist. Price List used by this Business Partner
     */
    int getPO_PriceList_ID();

    /**
     * Get Price Match Tolerance. PO-Invoice Match Price Tolerance in percent of the purchase price
     */
    BigDecimal getPriceMatchTolerance();

    /**
     * Get Priority Base. Base of Priority
     */
    String getPriorityBase();

    /**
     * Set Priority Base. Base of Priority
     */
    void setPriorityBase(String PriorityBase);

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
