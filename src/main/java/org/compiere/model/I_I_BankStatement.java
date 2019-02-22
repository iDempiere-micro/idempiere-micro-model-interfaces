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
     * TableName=I_BankStatement
     */
    String Table_Name = "I_BankStatement";

    /**
     * AD_Table_ID=600
     */
    int Table_ID = 600;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name BankAccountNo
     */
    String COLUMNNAME_BankAccountNo = "BankAccountNo";
    /**
     * Column name BPartnerValue
     */
    String COLUMNNAME_BPartnerValue = "BPartnerValue";
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
     * Column name CreatePayment
     */
    String COLUMNNAME_CreatePayment = "CreatePayment";
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
     * Column name I_BankStatement_ID
     */
    String COLUMNNAME_I_BankStatement_ID = "I_BankStatement_ID";
    /**
     * Column name I_BankStatement_UU
     */
    String COLUMNNAME_I_BankStatement_UU = "I_BankStatement_UU";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name InterestAmt
     */
    String COLUMNNAME_InterestAmt = "InterestAmt";
    /**
     * Column name InvoiceDocumentNo
     */
    String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";
    /**
     * Column name ISO_Code
     */
    String COLUMNNAME_ISO_Code = "ISO_Code";
    /**
     * Column name IsReversal
     */
    String COLUMNNAME_IsReversal = "IsReversal";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineDescription
     */
    String COLUMNNAME_LineDescription = "LineDescription";
    /**
     * Column name MatchStatement
     */
    String COLUMNNAME_MatchStatement = "MatchStatement";
    /**
     * Column name Memo
     */
    String COLUMNNAME_Memo = "Memo";
    /**
     * Column name PaymentDocumentNo
     */
    String COLUMNNAME_PaymentDocumentNo = "PaymentDocumentNo";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Column name TrxType
     */
    String COLUMNNAME_TrxType = "TrxType";
    /**
     * Column name ValutaDate
     */
    String COLUMNNAME_ValutaDate = "ValutaDate";

    /**
     * Get Bank Account No. Bank Account Number
     */
    String getBankAccountNo();

    /**
     * Set Bank Account No. Bank Account Number
     */
    void setBankAccountNo(String BankAccountNo);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    /**
     * Get Bank Statement. Bank Statement of account
     */
    int getC_BankStatement_ID();

    /**
     * Set Bank Statement. Bank Statement of account
     */
    void setC_BankStatement_ID(int C_BankStatement_ID);

    /**
     * Get Bank statement line. Line on a statement from this Bank
     */
    int getC_BankStatementLine_ID();

    /**
     * Set Bank statement line. Line on a statement from this Bank
     */
    void setC_BankStatementLine_ID(int C_BankStatementLine_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Set Charge amount. Charge Amount
     */
    void setChargeAmt(BigDecimal ChargeAmt);

    /**
     * Set Charge Name. Name of the Charge
     */
    void setChargeName(String ChargeName);

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
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

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
     * Set EFT Amount. Electronic Funds Transfer Amount
     */
    void setEftAmt(BigDecimal EftAmt);

    /**
     * Get EFT Check No. Electronic Funds Transfer Check No
     */
    String getEftCheckNo();

    /**
     * Set EFT Check No. Electronic Funds Transfer Check No
     */
    void setEftCheckNo(String EftCheckNo);

    /**
     * Get EFT Currency. Electronic Funds Transfer Currency
     */
    String getEftCurrency();

    /**
     * Set EFT Currency. Electronic Funds Transfer Currency
     */
    void setEftCurrency(String EftCurrency);

    /**
     * Get EFT Memo. Electronic Funds Transfer Memo
     */
    String getEftMemo();

    /**
     * Set EFT Memo. Electronic Funds Transfer Memo
     */
    void setEftMemo(String EftMemo);

    /**
     * Get EFT Payee. Electronic Funds Transfer Payee information
     */
    String getEftPayee();

    /**
     * Set EFT Payee. Electronic Funds Transfer Payee information
     */
    void setEftPayee(String EftPayee);

    /**
     * Get EFT Payee Account. Electronic Funds Transfer Payee Account Information
     */
    String getEftPayeeAccount();

    /**
     * Set EFT Payee Account. Electronic Funds Transfer Payee Account Information
     */
    void setEftPayeeAccount(String EftPayeeAccount);

    /**
     * Get EFT Reference. Electronic Funds Transfer Reference
     */
    String getEftReference();

    /**
     * Set EFT Reference. Electronic Funds Transfer Reference
     */
    void setEftReference(String EftReference);

    /**
     * Get EFT Statement Date. Electronic Funds Transfer Statement Date
     */
    Timestamp getEftStatementDate();

    /**
     * Set EFT Statement Date. Electronic Funds Transfer Statement Date
     */
    void setEftStatementDate(Timestamp EftStatementDate);

    /**
     * Get EFT Statement Line Date. Electronic Funds Transfer Statement Line Date
     */
    Timestamp getEftStatementLineDate();

    /**
     * Set EFT Statement Line Date. Electronic Funds Transfer Statement Line Date
     */
    void setEftStatementLineDate(Timestamp EftStatementLineDate);

    /**
     * Get EFT Statement Reference. Electronic Funds Transfer Statement Reference
     */
    String getEftStatementReference();

    /**
     * Set EFT Statement Reference. Electronic Funds Transfer Statement Reference
     */
    void setEftStatementReference(String EftStatementReference);

    /**
     * Get EFT Trx ID. Electronic Funds Transfer Transaction ID
     */
    String getEftTrxID();

    /**
     * Set EFT Trx ID. Electronic Funds Transfer Transaction ID
     */
    void setEftTrxID(String EftTrxID);

    /**
     * Get EFT Trx Type. Electronic Funds Transfer Transaction Type
     */
    String getEftTrxType();

    /**
     * Set EFT Trx Type. Electronic Funds Transfer Transaction Type
     */
    void setEftTrxType(String EftTrxType);

    /**
     * Get EFT Effective Date. Electronic Funds Transfer Valuta (effective) Date
     */
    Timestamp getEftValutaDate();

    /**
     * Set EFT Effective Date. Electronic Funds Transfer Valuta (effective) Date
     */
    void setEftValutaDate(Timestamp EftValutaDate);

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set IBAN. International Bank Account Number
     */
    void setIBAN(String IBAN);

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Interest Amount. Interest Amount
     */
    BigDecimal getInterestAmt();

    /**
     * Set Interest Amount. Interest Amount
     */
    void setInterestAmt(BigDecimal InterestAmt);

    /**
     * Set ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    void setISO_Code(String ISO_Code);

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
     * Set Memo. Memo Text
     */
    void setMemo(String Memo);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Reference No. Your customer or vendor number at the Business Partner's site
     */
    String getReferenceNo();

    /**
     * Set Reference No. Your customer or vendor number at the Business Partner's site
     */
    void setReferenceNo(String ReferenceNo);

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Set Routing No. Bank Routing Number
     */
    void setRoutingNo(String RoutingNo);

    /**
     * Get Statement date. Date of the statement
     */
    Timestamp getStatementDate();

    /**
     * Set Statement date. Date of the statement
     */
    void setStatementDate(Timestamp StatementDate);

    /**
     * Get Statement Line Date. Date of the Statement Line
     */
    Timestamp getStatementLineDate();

    /**
     * Set Statement Line Date. Date of the Statement Line
     */
    void setStatementLineDate(Timestamp StatementLineDate);

    /**
     * Get Statement amount. Statement Amount
     */
    BigDecimal getStmtAmt();

    /**
     * Set Statement amount. Statement Amount
     */
    void setStmtAmt(BigDecimal StmtAmt);

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

    /**
     * Set Effective date. Date when money is available
     */
    void setValutaDate(Timestamp ValutaDate);
}
