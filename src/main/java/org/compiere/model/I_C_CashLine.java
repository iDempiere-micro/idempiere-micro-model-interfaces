package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_CashLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CashLine {

    /**
     * TableName=C_CashLine
     */
    String Table_Name = "C_CashLine";

    /**
     * AD_Table_ID=410
     */
    int Table_ID = 410;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name CashType
     */
    String COLUMNNAME_CashType = "CashType";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_Cash_ID
     */
    String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
    /**
     * Column name C_CashLine_ID
     */
    String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name IsGenerated
     */
    String COLUMNNAME_IsGenerated = "IsGenerated";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
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
     * Get Cash Type. Source of Cash
     */
    String getCashType();

    /**
     * Set Cash Type. Source of Cash
     */
    void setCashType(String CashType);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setBankAccountId(int C_BankAccount_ID);

    /**
     * Get Cash Journal. Cash Journal
     */
    int getCashId();

    /**
     * Set Cash Journal. Cash Journal
     */
    void setCashId(int C_Cash_ID);

    /**
     * Get Cash Journal Line. Cash Journal Line
     */
    int getCashLineId();

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Get Payment. Payment identifier
     */
    int getPaymentId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Set Discount Amount. Calculated amount of discount
     */
    void setDiscountAmt(BigDecimal DiscountAmt);

    /**
     * Set Generated. This Line is generated
     */
    void setIsGenerated(boolean IsGenerated);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

    /**
     * Set Write-off Amount. Amount to write-off
     */
    void setWriteOffAmt(BigDecimal WriteOffAmt);
}
