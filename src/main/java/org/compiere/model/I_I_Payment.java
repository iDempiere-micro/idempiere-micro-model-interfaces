package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Payment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Payment {

    /**
     * AD_Table_ID=597
     */
    int Table_ID = 597;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AccountNo
     */
    String COLUMNNAME_AccountNo = "AccountNo";
    /**
     * Column name A_City
     */
    String COLUMNNAME_A_City = "A_City";
    /**
     * Column name A_Country
     */
    String COLUMNNAME_A_Country = "A_Country";
    /**
     * Column name A_EMail
     */
    String COLUMNNAME_A_EMail = "A_EMail";
    /**
     * Column name A_Ident_DL
     */
    String COLUMNNAME_A_Ident_DL = "A_Ident_DL";
    /**
     * Column name A_Ident_SSN
     */
    String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
    /**
     * Column name A_Name
     */
    String COLUMNNAME_A_Name = "A_Name";
    /**
     * Column name A_State
     */
    String COLUMNNAME_A_State = "A_State";
    /**
     * Column name A_Street
     */
    String COLUMNNAME_A_Street = "A_Street";
    /**
     * Column name A_Zip
     */
    String COLUMNNAME_A_Zip = "A_Zip";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
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
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name CheckNo
     */
    String COLUMNNAME_CheckNo = "CheckNo";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name CreditCardExpMM
     */
    String COLUMNNAME_CreditCardExpMM = "CreditCardExpMM";
    /**
     * Column name CreditCardExpYY
     */
    String COLUMNNAME_CreditCardExpYY = "CreditCardExpYY";
    /**
     * Column name CreditCardNumber
     */
    String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
    /**
     * Column name CreditCardType
     */
    String COLUMNNAME_CreditCardType = "CreditCardType";
    /**
     * Column name CreditCardVV
     */
    String COLUMNNAME_CreditCardVV = "CreditCardVV";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name DiscountAmt
     */
    String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name Micr
     */
    String COLUMNNAME_Micr = "Micr";
    /**
     * Column name Orig_TrxID
     */
    String COLUMNNAME_Orig_TrxID = "Orig_TrxID";
    /**
     * Column name PayAmt
     */
    String COLUMNNAME_PayAmt = "PayAmt";
    /**
     * Column name PONum
     */
    String COLUMNNAME_PONum = "PONum";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name R_AuthCode
     */
    String COLUMNNAME_R_AuthCode = "R_AuthCode";
    /**
     * Column name R_Info
     */
    String COLUMNNAME_R_Info = "R_Info";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";
    /**
     * Column name R_PnRef
     */
    String COLUMNNAME_R_PnRef = "R_PnRef";
    /**
     * Column name R_RespMsg
     */
    String COLUMNNAME_R_RespMsg = "R_RespMsg";
    /**
     * Column name R_Result
     */
    String COLUMNNAME_R_Result = "R_Result";
    /**
     * Column name SwiftCode
     */
    String COLUMNNAME_SwiftCode = "SwiftCode";
    /**
     * Column name Swipe
     */
    String COLUMNNAME_Swipe = "Swipe";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
    /**
     * Column name TenderType
     */
    String COLUMNNAME_TenderType = "TenderType";
    /**
     * Column name TrxType
     */
    String COLUMNNAME_TrxType = "TrxType";
    /**
     * Column name VoiceAuthCode
     */
    String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";
    /**
     * Column name WriteOffAmt
     */
    String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Get Account City. City or the Credit Card or Account Holder
     */
    String getAccountCity();

    /**
     * Get Account Country. Country
     */
    String getAccountCountry();

    /**
     * Get Account EMail. Email Address
     */
    String getAccountEMail();

    /**
     * Get Driver License. Payment Identification - Driver License
     */
    String getPaymentIdentificationDriverLicence();

    /**
     * Get Social Security No. Payment Identification - Social Security No
     */
    String getSocialSecurityNoPaymentIdentification();

    /**
     * Get Account Name. Name on Credit Card or Account holder
     */
    String getAccountName();

    /**
     * Get Account State. State of the Credit Card or Account holder
     */
    String getAccountState();

    /**
     * Get Account Street. Street address of the Credit Card or Account holder
     */
    String getAccountStreet();

    /**
     * Get Account Zip/Postal. Zip Code of the Credit Card or Account Holder
     */
    String getAccountZip();

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Get Check No. Check Number
     */
    String getCheckNo();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get Exp. Month. Expiry Month
     */
    int getCreditCardExpMM();

    /**
     * Get Exp. Year. Expiry Year
     */
    int getCreditCardExpYY();

    /**
     * Get Number. Credit Card Number
     */
    String getCreditCardNumber();

    /**
     * Get Credit Card. Credit Card (Visa, MC, AmEx)
     */
    String getCreditCardType();

    /**
     * Get Verification Code. Credit Card Verification code on credit card
     */
    String getCreditCardVV();

    /**
     * Get Transaction Date. Transaction Date
     */
    Timestamp getDateTrx();

    /**
     * Get Discount Amount. Calculated amount of discount
     */
    BigDecimal getDiscountAmt();

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(boolean I_IsImported);

    /**
     * Get Micr. Combination of routing no, account and check no
     */
    String getMicr();

    /**
     * Get Original Transaction ID. Original Transaction ID
     */
    String getOriginalTransactionId();

    /**
     * Get Payment amount. Amount being paid
     */
    BigDecimal getPayAmt();

    /**
     * Get PO Number. Purchase Order Number
     */
    String getPONum();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Authorization Code. Authorization Code returned
     */
    String getAuthorizationCode();

    /**
     * Get Info. Response info
     */
    String getResponseInfo();

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Get Reference. Payment reference
     */
    String getPaymentReference();

    /**
     * Get Response Message. Response message
     */
    String getResponseMessage();

    /**
     * Get Result. Result of transmission
     */
    String getTransmissionResult();

    /**
     * Get Swift code. Swift Code or BIC
     */
    String getSwiftCode();

    /**
     * Get Swipe. Track 1 and 2 of the Credit Card
     */
    String getSwipe();

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Get Tender type. Method of Payment
     */
    String getTenderType();

    /**
     * Get Transaction Type. Type of credit card transaction
     */
    String getTrxType();

    /**
     * Get Voice authorization code. Voice Authorization Code from credit card company
     */
    String getVoiceAuthCode();

    /**
     * Get Write-off Amount. Amount to write-off
     */
    BigDecimal getWriteOffAmt();

}
