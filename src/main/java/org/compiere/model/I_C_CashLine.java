package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name C_CashLine_UU
     */
    String COLUMNNAME_C_CashLine_UU = "C_CashLine_UU";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsGenerated
     */
    String COLUMNNAME_IsGenerated = "IsGenerated";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WriteOffAmt
     */
    String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    I_C_BankAccount getC_BankAccount() throws RuntimeException;

    /**
     * Get Cash Journal. Cash Journal
     */
    int getC_Cash_ID();

    /**
     * Set Cash Journal. Cash Journal
     */
    void setC_Cash_ID(int C_Cash_ID);

    I_C_Cash getC_Cash() throws RuntimeException;

    /**
     * Get Cash Journal Line. Cash Journal Line
     */
    int getC_CashLine_ID();

    /**
     * Set Cash Journal Line. Cash Journal Line
     */
    void setC_CashLine_ID(int C_CashLine_ID);

    /**
     * Get C_CashLine_UU
     */
    String getC_CashLine_UU();

    /**
     * Set C_CashLine_UU
     */
    void setC_CashLine_UU(String C_CashLine_UU);

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    I_C_Payment getC_Payment() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Generated. This Line is generated
     */
    void setIsGenerated(boolean IsGenerated);

    /**
     * Get Generated. This Line is generated
     */
    boolean isGenerated();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

    /**
     * Set Write-off Amount. Amount to write-off
     */
    void setWriteOffAmt(BigDecimal WriteOffAmt);
}
