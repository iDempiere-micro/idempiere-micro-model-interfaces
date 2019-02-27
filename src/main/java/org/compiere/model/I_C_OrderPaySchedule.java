package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_OrderPaySchedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderPaySchedule {

    /**
     * TableName=C_OrderPaySchedule
     */
    String Table_Name = "C_OrderPaySchedule";

    /**
     * AD_Table_ID=53296
     */
    int Table_ID = 53296;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_PaySchedule_ID
     */
    String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name DiscountDate
     */
    String COLUMNNAME_DiscountDate = "DiscountDate";
    /**
     * Column name DueAmt
     */
    String COLUMNNAME_DueAmt = "DueAmt";
    /**
     * Column name DueDate
     */
    String COLUMNNAME_DueDate = "DueDate";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Set Payment Schedule. Payment Schedule Template
     */
    void setC_PaySchedule_ID(int C_PaySchedule_ID);

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

    /**
     * Get Discount Date. Last Date for payments with discount
     */
    Timestamp getDiscountDate();

    /**
     * Set Discount Date. Last Date for payments with discount
     */
    void setDiscountDate(Timestamp DiscountDate);

    /**
     * Get Amount due. Amount of the payment due
     */
    BigDecimal getDueAmt();

    /**
     * Set Amount due. Amount of the payment due
     */
    void setDueAmt(BigDecimal DueAmt);

    /**
     * Get Due Date. Date when the payment is due
     */
    Timestamp getDueDate();

    /**
     * Set Due Date. Date when the payment is due
     */
    void setDueDate(Timestamp DueDate);

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Process Now
     */
    boolean isProcessing();

}
