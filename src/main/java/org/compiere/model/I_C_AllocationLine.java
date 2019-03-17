package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_AllocationLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AllocationLine {

    /**
     * AD_Table_ID=390
     */
    int Table_ID = 390;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_AllocationHdr_ID
     */
    String COLUMNNAME_C_AllocationHdr_ID = "C_AllocationHdr_ID";
    /**
     * Column name C_AllocationLine_ID
     */
    String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_CashLine_ID
     */
    String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
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
     * Get Allocation. Payment allocation
     */
    int getPaymentAllocationHeaderId();

    /**
     * Set Allocation. Payment allocation
     */
    void setPaymentAllocationHeaderId(int C_AllocationHdr_ID);

    /**
     * Get Allocation Line. Allocation Line
     */
    int getAllocationLineId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Cash Journal Line. Cash Journal Line
     */
    int getCashLineId();

    /**
     * Set Cash Journal Line. Cash Journal Line
     */
    void setCashLineId(int C_CashLine_ID);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    I_C_Invoice getInvoice() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Get Payment. Payment identifier
     */
    int getPaymentId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    I_C_Payment getPayment() throws RuntimeException;

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

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
