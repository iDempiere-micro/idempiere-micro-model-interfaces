package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_BankStatement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_BankStatement {

    /**
     * AD_Table_ID=600
     */
    int Table_ID = 600;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name BankAccountNo
     */
    String COLUMNNAME_BankAccountNo = "BankAccountNo";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BankStatement_ID
     */
    String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
    /**
     * Column name C_BankStatementLine_ID
     */
    String COLUMNNAME_C_BankStatementLine_ID = "C_BankStatementLine_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name ChargeName
     */
    String COLUMNNAME_ChargeName = "ChargeName";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EftAmt
     */
    String COLUMNNAME_EftAmt = "EftAmt";
    /**
     * Column name EftCheckNo
     */
    String COLUMNNAME_EftCheckNo = "EftCheckNo";
    /**
     * Column name EftCurrency
     */
    String COLUMNNAME_EftCurrency = "EftCurrency";
    /**
     * Column name EftMemo
     */
    String COLUMNNAME_EftMemo = "EftMemo";
    /**
     * Column name EftPayee
     */
    String COLUMNNAME_EftPayee = "EftPayee";
    /**
     * Column name EftPayeeAccount
     */
    String COLUMNNAME_EftPayeeAccount = "EftPayeeAccount";
    /**
     * Column name EftReference
     */
    String COLUMNNAME_EftReference = "EftReference";
    /**
     * Column name EftStatementDate
     */
    String COLUMNNAME_EftStatementDate = "EftStatementDate";
    /**
     * Column name EftStatementLineDate
     */
    String COLUMNNAME_EftStatementLineDate = "EftStatementLineDate";
    /**
     * Column name EftStatementReference
     */
    String COLUMNNAME_EftStatementReference = "EftStatementReference";
    /**
     * Column name EftTrxID
     */
    String COLUMNNAME_EftTrxID = "EftTrxID";
    /**
     * Column name EftTrxType
     */
    String COLUMNNAME_EftTrxType = "EftTrxType";
    /**
     * Column name EftValutaDate
     */
    String COLUMNNAME_EftValutaDate = "EftValutaDate";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name InterestAmt
     */
    String COLUMNNAME_InterestAmt = "InterestAmt";
    /**
     * Column name ISO_Code
     */
    String COLUMNNAME_ISO_Code = "ISO_Code";
    /**
     * Column name IsReversal
     */
    String COLUMNNAME_IsReversal = "IsReversal";
    /**
     * Column name LineDescription
     */
    String COLUMNNAME_LineDescription = "LineDescription";
    /**
     * Column name Memo
     */
    String COLUMNNAME_Memo = "Memo";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ReferenceNo
     */
    String COLUMNNAME_ReferenceNo = "ReferenceNo";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";
    /**
     * Column name StatementDate
     */
    String COLUMNNAME_StatementDate = "StatementDate";
    /**
     * Column name StatementLineDate
     */
    String COLUMNNAME_StatementLineDate = "StatementLineDate";
    /**
     * Column name StmtAmt
     */
    String COLUMNNAME_StmtAmt = "StmtAmt";
    /**
     * Column name TrxAmt
     */
    String COLUMNNAME_TrxAmt = "TrxAmt";
    /**
     * Column name ValutaDate
     */
    String COLUMNNAME_ValutaDate = "ValutaDate";

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Statement. Bank Statement of account
     */
    void setBankStatementId(int C_BankStatement_ID);

    /**
     * Set Bank statement line. Line on a statement from this Bank
     */
    void setBankStatementLineId(int C_BankStatementLine_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

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
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    /**
     * Get Payment. Payment identifier
     */
    int getPaymentId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get EFT Amount. Electronic Funds Transfer Amount
     */
    BigDecimal getEftAmt();

    /**
     * Get EFT Check No. Electronic Funds Transfer Check No
     */
    String getEftCheckNo();

    /**
     * Get EFT Currency. Electronic Funds Transfer Currency
     */
    String getEftCurrency();

    /**
     * Get EFT Memo. Electronic Funds Transfer Memo
     */
    String getEftMemo();

    /**
     * Get EFT Payee. Electronic Funds Transfer Payee information
     */
    String getEftPayee();

    /**
     * Get EFT Payee Account. Electronic Funds Transfer Payee Account Information
     */
    String getEftPayeeAccount();

    /**
     * Get EFT Reference. Electronic Funds Transfer Reference
     */
    String getEftReference();

    /**
     * Get EFT Statement Date. Electronic Funds Transfer Statement Date
     */
    Timestamp getEftStatementDate();

    /**
     * Get EFT Statement Line Date. Electronic Funds Transfer Statement Line Date
     */
    Timestamp getEftStatementLineDate();

    /**
     * Get EFT Statement Reference. Electronic Funds Transfer Statement Reference
     */
    String getEftStatementReference();

    /**
     * Get EFT Trx ID. Electronic Funds Transfer Transaction ID
     */
    String getEftTrxID();

    /**
     * Get EFT Trx Type. Electronic Funds Transfer Transaction Type
     */
    String getEftTrxType();

    /**
     * Get EFT Effective Date. Electronic Funds Transfer Valuta (effective) Date
     */
    Timestamp getEftValutaDate();

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(boolean I_IsImported);

    /**
     * Get Interest Amount. Interest Amount
     */
    BigDecimal getInterestAmt();

    /**
     * Get Reversal. This is a reversing transaction
     */
    boolean isReversal();

    /**
     * Get Line Description. Description of the Line
     */
    String getLineDescription();

    /**
     * Get Memo. Memo Text
     */
    String getMemo();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Reference No. Your customer or vendor number at the Business Partner's site
     */
    String getReferenceNo();

    /**
     * Get Statement date. Date of the statement
     */
    Timestamp getStatementDate();

    /**
     * Get Statement Line Date. Date of the Statement Line
     */
    Timestamp getStatementLineDate();

    /**
     * Get Statement amount. Statement Amount
     */
    BigDecimal getStmtAmt();

    /**
     * Get Transaction Amount. Amount of a transaction
     */
    BigDecimal getTrxAmt();

    /**
     * Set Transaction Amount. Amount of a transaction
     */
    void setTrxAmt(BigDecimal TrxAmt);

    /**
     * Get Effective date. Date when money is available
     */
    Timestamp getValutaDate();

}
