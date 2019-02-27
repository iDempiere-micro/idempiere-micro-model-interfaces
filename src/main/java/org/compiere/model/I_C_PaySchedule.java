package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaySchedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySchedule {

    /**
     * AD_Table_ID=548
     */
    int Table_ID = 548;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_PaySchedule_ID
     */
    String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
    /**
     * Column name Discount
     */
    String COLUMNNAME_Discount = "Discount";
    /**
     * Column name DiscountDays
     */
    String COLUMNNAME_DiscountDays = "DiscountDays";
    /**
     * Column name GraceDays
     */
    String COLUMNNAME_GraceDays = "GraceDays";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name NetDays
     */
    String COLUMNNAME_NetDays = "NetDays";
    /**
     * Column name Percentage
     */
    String COLUMNNAME_Percentage = "Percentage";

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getPaymentTermId();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setPaymentTermId(int C_PaymentTerm_ID);

    /**
     * Get Payment Schedule. Payment Schedule Template
     */
    int getC_PaySchedule_ID();

    /**
     * Get Discount %. Discount in percent
     */
    BigDecimal getDiscount();

    /**
     * Set Discount %. Discount in percent
     */
    void setDiscount(BigDecimal Discount);

    /**
     * Get Discount Days. Number of days from invoice date to be eligible for discount
     */
    int getDiscountDays();

    /**
     * Set Discount Days. Number of days from invoice date to be eligible for discount
     */
    void setDiscountDays(int DiscountDays);

    /**
     * Set Grace Days. Days after due date to send first dunning letter
     */
    void setGraceDays(int GraceDays);

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Net Days. Net Days in which payment is due
     */
    int getNetDays();

    /**
     * Set Net Days. Net Days in which payment is due
     */
    void setNetDays(int NetDays);

    /**
     * Get Percentage. Percent of the entire amount
     */
    BigDecimal getPercentage();

    /**
     * Set Percentage. Percent of the entire amount
     */
    void setPercentage(BigDecimal Percentage);

}
