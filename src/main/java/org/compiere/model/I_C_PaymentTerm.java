package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaymentTerm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentTerm extends IPO {

    /**
     * TableName=C_PaymentTerm
     */
    String Table_Name = "C_PaymentTerm";

    /**
     * AD_Table_ID=113
     */
    int Table_ID = 113;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AfterDelivery
     */
    String COLUMNNAME_AfterDelivery = "AfterDelivery";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name Discount
     */
    String COLUMNNAME_Discount = "Discount";
    /**
     * Column name Discount2
     */
    String COLUMNNAME_Discount2 = "Discount2";
    /**
     * Column name DiscountDays
     */
    String COLUMNNAME_DiscountDays = "DiscountDays";
    /**
     * Column name DiscountDays2
     */
    String COLUMNNAME_DiscountDays2 = "DiscountDays2";
    /**
     * Column name FixMonthCutoff
     */
    String COLUMNNAME_FixMonthCutoff = "FixMonthCutoff";
    /**
     * Column name FixMonthDay
     */
    String COLUMNNAME_FixMonthDay = "FixMonthDay";
    /**
     * Column name GraceDays
     */
    String COLUMNNAME_GraceDays = "GraceDays";
    /**
     * Column name IsDueFixed
     */
    String COLUMNNAME_IsDueFixed = "IsDueFixed";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name NetDays
     */
    String COLUMNNAME_NetDays = "NetDays";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setSearchKey(String Value);

    String validate();

    void saveEx();
}
