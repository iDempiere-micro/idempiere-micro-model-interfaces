package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaySelectionCheck
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelectionCheck {

    /**
     * AD_Table_ID=525
     */
    int Table_ID = 525;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_BankAccount_ID
     */
    String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_PaySelectionCheck_ID
     */
    String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
    /**
     * Column name C_PaySelection_ID
     */
    String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsGeneratedDraft
     */
    String COLUMNNAME_IsGeneratedDraft = "IsGeneratedDraft";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsReceipt
     */
    String COLUMNNAME_IsReceipt = "IsReceipt";
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
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name WriteOffAmt
     */
    String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    int getC_BP_BankAccount_ID();

    /**
     * Set Partner Bank Account. Bank Account of the Business Partner
     */
    void setC_BP_BankAccount_ID(int C_BP_BankAccount_ID);

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    /**
     * Get Pay Selection Check. Payment Selection Check
     */
    int getC_PaySelectionCheck_ID();

    /**
     * Get Payment Selection. Payment Selection
     */
    int getC_PaySelection_ID();

    /**
     * Set Payment Selection. Payment Selection
     */
    void setC_PaySelection_ID(int C_PaySelection_ID);

    I_C_PaySelection getC_PaySelection() throws RuntimeException;

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Get Generated Draft
     */
    boolean isGeneratedDraft();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Set Receipt. This is a sales transaction (receipt)
     */
    void setIsReceipt(boolean IsReceipt);

    /**
     * Get Receipt. This is a sales transaction (receipt)
     */
    boolean isReceipt();

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
     * Get Quantity. Quantity
     */
    int getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(int Qty);

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

    /**
     * Set Write-off Amount. Amount to write-off
     */
    void setWriteOffAmt(BigDecimal WriteOffAmt);
}
