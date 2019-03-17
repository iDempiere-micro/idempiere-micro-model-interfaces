package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_PaymentTransaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentTransaction {

    /**
     * TableName=C_PaymentTransaction
     */
    String Table_Name = "C_PaymentTransaction";

    /**
     * AD_Table_ID=200031
     */
    int Table_ID = 200031;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_BankAccount_ID
     */
    String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_CashBook_ID
     */
    String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CheckNo
     */
    String COLUMNNAME_CheckNo = "CheckNo";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_PaymentBatch_ID
     */
    String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_PaymentProcessor_ID
     */
    String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /**
     * Column name C_PaymentTransaction_ID
     */
    String COLUMNNAME_C_PaymentTransaction_ID = "C_PaymentTransaction_ID";
    /**
     * Column name C_POSTenderType_ID
     */
    String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
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
     * Column name CustomerAddressID
     */
    String COLUMNNAME_CustomerAddressID = "CustomerAddressID";
    /**
     * Column name CustomerPaymentProfileID
     */
    String COLUMNNAME_CustomerPaymentProfileID = "CustomerPaymentProfileID";
    /**
     * Column name CustomerProfileID
     */
    String COLUMNNAME_CustomerProfileID = "CustomerProfileID";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsDelayedCapture
     */
    String COLUMNNAME_IsDelayedCapture = "IsDelayedCapture";
    /**
     * Column name IsOnline
     */
    String COLUMNNAME_IsOnline = "IsOnline";
    /**
     * Column name IsReceipt
     */
    String COLUMNNAME_IsReceipt = "IsReceipt";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name IsVoided
     */
    String COLUMNNAME_IsVoided = "IsVoided";
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
     * Column name R_AvsAddr
     */
    String COLUMNNAME_R_AvsAddr = "R_AvsAddr";
    /**
     * Column name R_AvsZip
     */
    String COLUMNNAME_R_AvsZip = "R_AvsZip";
    /**
     * Column name R_CVV2Match
     */
    String COLUMNNAME_R_CVV2Match = "R_CVV2Match";
    /**
     * Column name Ref_PaymentTransaction_ID
     */
    String COLUMNNAME_Ref_PaymentTransaction_ID = "Ref_PaymentTransaction_ID";
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
     * Column name R_VoidMsg
     */
    String COLUMNNAME_R_VoidMsg = "R_VoidMsg";
    /**
     * Column name SwiftCode
     */
    String COLUMNNAME_SwiftCode = "SwiftCode";
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
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name VoiceAuthCode
     */
    String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Set Account No. Account Number
     */
    void setAccountNo(String AccountNo);

    /**
     * Get Account City. City or the Credit Card or Account Holder
     */
    String getAccountCity();

    /**
     * Set Account City. City or the Credit Card or Account Holder
     */
    void setAccountCity(String A_City);

    /**
     * Get Account Country. Country
     */
    String getA_Country();

    /**
     * Set Account Country. Country
     */
    void setA_Country(String A_Country);

    /**
     * Get Account EMail. Email Address
     */
    String getAccountEMail();

    /**
     * Set Account EMail. Email Address
     */
    void setAccountEMail(String A_EMail);

    /**
     * Get Driver License. Payment Identification - Driver License
     */
    String getPaymentIdentificationDriverLicence();

    /**
     * Set Driver License. Payment Identification - Driver License
     */
    void setPaymentIdentificationDriverLicence(String A_Ident_DL);

    /**
     * Get Social Security No. Payment Identification - Social Security No
     */
    String getSocialSecurityNoPaymentIdentification();

    /**
     * Set Social Security No. Payment Identification - Social Security No
     */
    void setSocialSecurityNoPaymentIdentification(String A_Ident_SSN);

    /**
     * Get Account Name. Name on Credit Card or Account holder
     */
    String getAccountName();

    /**
     * Set Account Name. Name on Credit Card or Account holder
     */
    void setAccountName(String A_Name);

    /**
     * Get Account State. State of the Credit Card or Account holder
     */
    String getA_State();

    /**
     * Set Account State. State of the Credit Card or Account holder
     */
    void setA_State(String A_State);

    /**
     * Get Account Street. Street address of the Credit Card or Account holder
     */
    String getA_Street();

    /**
     * Set Account Street. Street address of the Credit Card or Account holder
     */
    void setA_Street(String A_Street);

    /**
     * Get Account Zip/Postal. Zip Code of the Credit Card or Account Holder
     */
    String getAccountZip();

    /**
     * Set Account Zip/Postal. Zip Code of the Credit Card or Account Holder
     */
    void setAccountZip(String A_Zip);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setBankAccountId(int C_BankAccount_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    int getBusinessPartnerBankAccountId();

    /**
     * Set Partner Bank Account. Bank Account of the Business Partner
     */
    void setBusinessPartnerBankAccountId(int C_BP_BankAccount_ID);

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getConversionTypeId();

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setConversionTypeId(int C_ConversionType_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Get Check No. Check Number
     */
    String getCheckNo();

    /**
     * Set Check No. Check Number
     */
    void setCheckNo(String CheckNo);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get Payment Processor. Payment processor for electronic payments
     */
    int getPaymentProcessorId();

    /**
     * Set Payment Processor. Payment processor for electronic payments
     */
    void setPaymentProcessorId(int C_PaymentProcessor_ID);

    /**
     * Get Payment Transaction
     */
    int getPaymentTransactionId();

    /**
     * Get POS Tender Type
     */
    int getC_POSTenderTypeId();

    /**
     * Set POS Tender Type
     */
    void setC_POSTenderTypeId(int C_POSTenderType_ID);

    /**
     * Get Exp. Month. Expiry Month
     */
    int getCreditCardExpMM();

    /**
     * Set Exp. Month. Expiry Month
     */
    void setCreditCardExpMM(int CreditCardExpMM);

    /**
     * Get Exp. Year. Expiry Year
     */
    int getCreditCardExpYY();

    /**
     * Set Exp. Year. Expiry Year
     */
    void setCreditCardExpYY(int CreditCardExpYY);

    /**
     * Get Number. Credit Card Number
     */
    String getCreditCardNumber();

    /**
     * Set Number. Credit Card Number
     */
    void setCreditCardNumber(String CreditCardNumber);

    /**
     * Get Credit Card. Credit Card (Visa, MC, AmEx)
     */
    String getCreditCardType();

    /**
     * Set Credit Card. Credit Card (Visa, MC, AmEx)
     */
    void setCreditCardType(String CreditCardType);

    /**
     * Get Verification Code. Credit Card Verification code on credit card
     */
    String getCreditCardVV();

    /**
     * Set Verification Code. Credit Card Verification code on credit card
     */
    void setCreditCardVV(String CreditCardVV);

    /**
     * Get Customer Address ID
     */
    String getCustomerAddressID();

    /**
     * Set Customer Address ID
     */
    void setCustomerAddressID(String CustomerAddressID);

    /**
     * Get Customer Payment Profile ID
     */
    String getCustomerPaymentProfileID();

    /**
     * Set Customer Payment Profile ID
     */
    void setCustomerPaymentProfileID(String CustomerPaymentProfileID);

    /**
     * Get Customer Profile ID
     */
    String getCustomerProfileID();

    /**
     * Set Customer Profile ID
     */
    void setCustomerProfileID(String CustomerProfileID);

    /**
     * Get Transaction Date. Transaction Date
     */
    Timestamp getDateTrx();

    /**
     * Set Transaction Date. Transaction Date
     */
    void setDateTrx(Timestamp DateTrx);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set IBAN. International Bank Account Number
     */
    void setIBAN(String IBAN);

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Delayed Capture. Charge after Shipment
     */
    void setIsDelayedCapture(boolean IsDelayedCapture);

    /**
     * Get Delayed Capture. Charge after Shipment
     */
    boolean isDelayedCapture();

    /**
     * Set Online Access. Can be accessed online
     */
    void setIsOnline(boolean IsOnline);

    /**
     * Get Online Access. Can be accessed online
     */
    boolean isOnline();

    /**
     * Set Receipt. This is a sales transaction (receipt)
     */
    void setIsReceipt(boolean IsReceipt);

    /**
     * Get Receipt. This is a sales transaction (receipt)
     */
    boolean isReceipt();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Set Voided
     */
    void setIsVoided(boolean IsVoided);

    /**
     * Get Voided
     */
    boolean isVoided();

    /**
     * Get Micr. Combination of routing no, account and check no
     */
    String getMicr();

    /**
     * Set Micr. Combination of routing no, account and check no
     */
    void setMicr(String Micr);

    /**
     * Get Original Transaction ID. Original Transaction ID
     */
    String getOrig_TrxID();

    /**
     * Set Original Transaction ID. Original Transaction ID
     */
    void setOrig_TrxID(String Orig_TrxID);

    /**
     * Get Payment amount. Amount being paid
     */
    BigDecimal getPayAmt();

    /**
     * Set Payment amount. Amount being paid
     */
    void setPayAmt(BigDecimal PayAmt);

    /**
     * Get PO Number. Purchase Order Number
     */
    String getPONum();

    /**
     * Set PO Number. Purchase Order Number
     */
    void setPONum(String PONum);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Authorization Code. Authorization Code returned
     */
    String getAuthorizationCode();

    /**
     * Set Authorization Code. Authorization Code returned
     */
    void setAuthorizationCode(String R_AuthCode);

    /**
     * Get Address verified. This address has been verified
     */
    String getR_AvsAddr();

    /**
     * Set Address verified. This address has been verified
     */
    void setR_AvsAddr(String R_AvsAddr);

    /**
     * Get Zip verified. The Zip Code has been verified
     */
    String getR_AvsZip();

    /**
     * Set Zip verified. The Zip Code has been verified
     */
    void setR_AvsZip(String R_AvsZip);

    /**
     * Get CVV Match. Credit Card Verification Code Match
     */
    boolean isCVV2Match();

    /**
     * Set CVV Match. Credit Card Verification Code Match
     */
    void setCVV2Match(boolean R_CVV2Match);

    /**
     * Set Referenced Payment Transaction
     */
    void setRef_PaymentTransactionId(int Ref_PaymentTransaction_ID);

    /**
     * Get Info. Response info
     */
    String getR_Info();

    /**
     * Set Info. Response info
     */
    void setR_Info(String R_Info);

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Set Routing No. Bank Routing Number
     */
    void setRoutingNo(String RoutingNo);

    /**
     * Get Reference. Payment reference
     */
    String getPaymentReference();

    /**
     * Set Reference. Payment reference
     */
    void setPaymentReference(String R_PnRef);

    /**
     * Get Response Message. Response message
     */
    String getR_RespMsg();

    /**
     * Set Response Message. Response message
     */
    void setR_RespMsg(String R_RespMsg);

    /**
     * Get Result. Result of transmission
     */
    String getTransmissionResult();

    /**
     * Set Result. Result of transmission
     */
    void setTransmissionResult(String R_Result);

    /**
     * Get Void Message
     */
    String getVoidMessage();

    /**
     * Set Void Message
     */
    void setVoidMessage(String R_VoidMsg);

    /**
     * Get Swift code. Swift Code or BIC
     */
    String getSwiftCode();

    /**
     * Set Swift code. Swift Code or BIC
     */
    void setSwiftCode(String SwiftCode);

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Set Tax Amount. Tax Amount for a document
     */
    void setTaxAmt(BigDecimal TaxAmt);

    /**
     * Get Tender type. Method of Payment
     */
    String getTenderType();

    /**
     * Set Tender type. Method of Payment
     */
    void setTenderType(String TenderType);

    /**
     * Get Transaction Type. Type of credit card transaction
     */
    String getTrxType();

    /**
     * Set Transaction Type. Type of credit card transaction
     */
    void setTrxType(String TrxType);

    /**
     * Get Voice authorization code. Voice Authorization Code from credit card company
     */
    String getVoiceAuthCode();

    /**
     * Set Voice authorization code. Voice Authorization Code from credit card company
     */
    void setVoiceAuthCode(String VoiceAuthCode);

}
