package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaymentAllocate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentAllocate {

    /**
     * AD_Table_ID=812
     */
    int Table_ID = 812;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_AllocationLine_ID
     */
    String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name InvoiceAmt
     */
    String COLUMNNAME_InvoiceAmt = "InvoiceAmt";
    /**
     * Column name OverUnderAmt
     */
    String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
    /**
     * Column name WriteOffAmt
     */
    String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /**
     * Get Amount. Amount in a defined currency
     */
    BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    void setAmount(BigDecimal Amount);

    /**
     * Set Allocation Line. Allocation Line
     */
    void setC_AllocationLine_ID(int C_AllocationLine_ID);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

    /**
     * Get Invoice Amt
     */
    BigDecimal getInvoiceAmt();

    /**
     * Set Invoice Amt
     */
    void setInvoiceAmt(BigDecimal InvoiceAmt);

    /**
     * Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
     */
    BigDecimal getOverUnderAmt();

    /**
     * Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
     */
    void setOverUnderAmt(BigDecimal OverUnderAmt);

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

    /**
     * Set Write-off Amount. Amount to write-off
     */
    void setWriteOffAmt(BigDecimal WriteOffAmt);
}
