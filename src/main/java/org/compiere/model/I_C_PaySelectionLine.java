package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaySelectionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelectionLine {

    /**
     * TableName=C_PaySelectionLine
     */
    String Table_Name = "C_PaySelectionLine";

    /**
     * AD_Table_ID=427
     */
    int Table_ID = 427;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_PaySelectionCheck_ID
     */
    String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
    /**
     * Column name C_PaySelection_ID
     */
    String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
    /**
     * Column name C_PaySelectionLine_ID
     */
    String COLUMNNAME_C_PaySelectionLine_ID = "C_PaySelectionLine_ID";
    /**
     * Column name DifferenceAmt
     */
    String COLUMNNAME_DifferenceAmt = "DifferenceAmt";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name OpenAmt
     */
    String COLUMNNAME_OpenAmt = "OpenAmt";
    /**
     * Column name PayAmt
     */
    String COLUMNNAME_PayAmt = "PayAmt";
    /**
     * Column name PaymentRule
     */
    String COLUMNNAME_PaymentRule = "PaymentRule";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name WriteOffAmt
     */
    String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    /**
     * Set Pay Selection Check. Payment Selection Check
     */
    void setC_PaySelectionCheck_ID(int C_PaySelectionCheck_ID);

    /**
     * Get Payment Selection. Payment Selection
     */
    int getC_PaySelection_ID();

    /**
     * Set Payment Selection. Payment Selection
     */
    void setC_PaySelection_ID(int C_PaySelection_ID);

    /**
     * Get Difference. Difference Amount
     */
    BigDecimal getDifferenceAmt();

    /**
     * Set Difference. Difference Amount
     */
    void setDifferenceAmt(BigDecimal DifferenceAmt);

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Open Amount. Open item amount
     */
    BigDecimal getOpenAmt();

    /**
     * Set Open Amount. Open item amount
     */
    void setOpenAmt(BigDecimal OpenAmt);

    /**
     * Get Payment amount. Amount being paid
     */
    BigDecimal getPayAmt();

    /**
     * Set Payment amount. Amount being paid
     */
    void setPayAmt(BigDecimal PayAmt);

    /**
     * Get Payment Rule. How you pay the invoice
     */
    String getPaymentRule();

    /**
     * Set Payment Rule. How you pay the invoice
     */
    void setPaymentRule(String PaymentRule);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

    /**
     * Set Write-off Amount. Amount to write-off
     */
    void setWriteOffAmt(BigDecimal WriteOffAmt);
}
