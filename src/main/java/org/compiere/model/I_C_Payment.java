package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Payment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Payment {

  /** TableName=C_Payment */
  String Table_Name = "C_Payment";

  /** AD_Table_ID=335 */
  int Table_ID = 335;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AccountNo */
  String COLUMNNAME_AccountNo = "AccountNo";
  /** Column name A_City */
  String COLUMNNAME_A_City = "A_City";
  /** Column name A_Country */
  String COLUMNNAME_A_Country = "A_Country";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name A_EMail */
  String COLUMNNAME_A_EMail = "A_EMail";
  /** Column name A_Ident_DL */
  String COLUMNNAME_A_Ident_DL = "A_Ident_DL";
  /** Column name A_Ident_SSN */
  String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
  /** Column name A_Name */
  String COLUMNNAME_A_Name = "A_Name";
  /** Column name A_State */
  String COLUMNNAME_A_State = "A_State";
  /** Column name A_Street */
  String COLUMNNAME_A_Street = "A_Street";
  /** Column name A_Zip */
  String COLUMNNAME_A_Zip = "A_Zip";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_BankAccount_ID */
  String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_CashBook_ID */
  String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DepositBatch_ID */
  String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name CheckNo */
  String COLUMNNAME_CheckNo = "CheckNo";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_PaymentBatch_ID */
  String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
  /** Column name C_Payment_UU */
  String COLUMNNAME_C_Payment_UU = "C_Payment_UU";
  /** Column name C_POSTenderType_ID */
  String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreditCardExpMM */
  String COLUMNNAME_CreditCardExpMM = "CreditCardExpMM";
  /** Column name CreditCardExpYY */
  String COLUMNNAME_CreditCardExpYY = "CreditCardExpYY";
  /** Column name CreditCardNumber */
  String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
  /** Column name CreditCardType */
  String COLUMNNAME_CreditCardType = "CreditCardType";
  /** Column name CreditCardVV */
  String COLUMNNAME_CreditCardVV = "CreditCardVV";
  /** Column name CustomerAddressID */
  String COLUMNNAME_CustomerAddressID = "CustomerAddressID";
  /** Column name CustomerPaymentProfileID */
  String COLUMNNAME_CustomerPaymentProfileID = "CustomerPaymentProfileID";
  /** Column name CustomerProfileID */
  String COLUMNNAME_CustomerProfileID = "CustomerProfileID";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateTrx */
  String COLUMNNAME_DateTrx = "DateTrx";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IBAN */
  String COLUMNNAME_IBAN = "IBAN";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAllocated */
  String COLUMNNAME_IsAllocated = "IsAllocated";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsDelayedCapture */
  String COLUMNNAME_IsDelayedCapture = "IsDelayedCapture";
  /** Column name IsOnline */
  String COLUMNNAME_IsOnline = "IsOnline";
  /** Column name IsOverUnderPayment */
  String COLUMNNAME_IsOverUnderPayment = "IsOverUnderPayment";
  /** Column name IsPrepayment */
  String COLUMNNAME_IsPrepayment = "IsPrepayment";
  /** Column name IsReceipt */
  String COLUMNNAME_IsReceipt = "IsReceipt";
  /** Column name IsReconciled */
  String COLUMNNAME_IsReconciled = "IsReconciled";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name IsVoided */
  String COLUMNNAME_IsVoided = "IsVoided";
  /** Column name Micr */
  String COLUMNNAME_Micr = "Micr";
  /** Column name OProcessing */
  String COLUMNNAME_OProcessing = "OProcessing";
  /** Column name Orig_TrxID */
  String COLUMNNAME_Orig_TrxID = "Orig_TrxID";
  /** Column name OverUnderAmt */
  String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name PONum */
  String COLUMNNAME_PONum = "PONum";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name R_AuthCode */
  String COLUMNNAME_R_AuthCode = "R_AuthCode";
  /** Column name R_AuthCode_DC */
  String COLUMNNAME_R_AuthCode_DC = "R_AuthCode_DC";
  /** Column name R_AvsAddr */
  String COLUMNNAME_R_AvsAddr = "R_AvsAddr";
  /** Column name R_AvsZip */
  String COLUMNNAME_R_AvsZip = "R_AvsZip";
  /** Column name R_CVV2Match */
  String COLUMNNAME_R_CVV2Match = "R_CVV2Match";
  /** Column name Ref_Payment_ID */
  String COLUMNNAME_Ref_Payment_ID = "Ref_Payment_ID";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name R_Info */
  String COLUMNNAME_R_Info = "R_Info";
  /** Column name RoutingNo */
  String COLUMNNAME_RoutingNo = "RoutingNo";
  /** Column name R_PnRef */
  String COLUMNNAME_R_PnRef = "R_PnRef";
  /** Column name R_PnRef_DC */
  String COLUMNNAME_R_PnRef_DC = "R_PnRef_DC";
  /** Column name R_RespMsg */
  String COLUMNNAME_R_RespMsg = "R_RespMsg";
  /** Column name R_Result */
  String COLUMNNAME_R_Result = "R_Result";
  /** Column name R_VoidMsg */
  String COLUMNNAME_R_VoidMsg = "R_VoidMsg";
  /** Column name SwiftCode */
  String COLUMNNAME_SwiftCode = "SwiftCode";
  /** Column name Swipe */
  String COLUMNNAME_Swipe = "Swipe";
  /** Column name TaxAmt */
  String COLUMNNAME_TaxAmt = "TaxAmt";
  /** Column name TenderType */
  String COLUMNNAME_TenderType = "TenderType";
  /** Column name TrxType */
  String COLUMNNAME_TrxType = "TrxType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";
  /** Column name VoiceAuthCode */
  String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";
  /** Column name WriteOffAmt */
  String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

  /** Get Account No. Account Number */
  String getAccountNo();

  /** Set Account No. Account Number */
  void setAccountNo(String AccountNo);

  /** Get Account City. City or the Credit Card or Account Holder */
  String getA_City();

  /** Set Account City. City or the Credit Card or Account Holder */
  void setA_City(String A_City);

  /** Get Account Country. Country */
  String getA_Country();

  /** Set Account Country. Country */
  void setA_Country(String A_Country);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Account EMail. Email Address */
  String getA_EMail();

  /** Set Account EMail. Email Address */
  void setA_EMail(String A_EMail);

  /** Get Driver License. Payment Identification - Driver License */
  String getA_Ident_DL();

  /** Set Driver License. Payment Identification - Driver License */
  void setA_Ident_DL(String A_Ident_DL);

  /** Get Social Security No. Payment Identification - Social Security No */
  String getA_Ident_SSN();

  /** Set Social Security No. Payment Identification - Social Security No */
  void setA_Ident_SSN(String A_Ident_SSN);

  /** Get Account Name. Name on Credit Card or Account holder */
  String getA_Name();

  /** Set Account Name. Name on Credit Card or Account holder */
  void setA_Name(String A_Name);

  /** Get Account State. State of the Credit Card or Account holder */
  String getA_State();

  /** Set Account State. State of the Credit Card or Account holder */
  void setA_State(String A_State);

  /** Get Account Street. Street address of the Credit Card or Account holder */
  String getA_Street();

  /** Set Account Street. Street address of the Credit Card or Account holder */
  void setA_Street(String A_Street);

  /** Get Account Zip/Postal. Zip Code of the Credit Card or Account Holder */
  String getA_Zip();

  /** Set Account Zip/Postal. Zip Code of the Credit Card or Account Holder */
  void setA_Zip(String A_Zip);

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Bank Account. Bank Account of the Business Partner */
  int getC_BP_BankAccount_ID();

  /** Set Partner Bank Account. Bank Account of the Business Partner */
  void setC_BP_BankAccount_ID(int C_BP_BankAccount_ID);

  I_C_BP_BankAccount getC_BP_BankAccount() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Cash Book. Cash Book for recording petty cash transactions */
  int getC_CashBook_ID();

  /** Set Cash Book. Cash Book for recording petty cash transactions */
  void setC_CashBook_ID(int C_CashBook_ID);

  I_C_CashBook getC_CashBook() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Deposit Batch */
  int getC_DepositBatch_ID();

  /** Set Deposit Batch */
  void setC_DepositBatch_ID(int C_DepositBatch_ID);

  I_C_DepositBatch getC_DepositBatch() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Check No. Check Number */
  String getCheckNo();

  /** Set Check No. Check Number */
  void setCheckNo(String CheckNo);

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment Batch. Payment batch for EFT */
  int getC_PaymentBatch_ID();

  /** Set Payment Batch. Payment batch for EFT */
  void setC_PaymentBatch_ID(int C_PaymentBatch_ID);

  I_C_PaymentBatch getC_PaymentBatch() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

  /** Set Payment Processor. Payment processor for electronic payments */
  void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

  I_C_PaymentProcessor getC_PaymentProcessor() throws RuntimeException;

  /** Get C_Payment_UU */
  String getC_Payment_UU();

  /** Set C_Payment_UU */
  void setC_Payment_UU(String C_Payment_UU);

  /** Get POS Tender Type */
  int getC_POSTenderType_ID();

  /** Set POS Tender Type */
  void setC_POSTenderType_ID(int C_POSTenderType_ID);

  I_C_POSTenderType getC_POSTenderType() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Exp. Month. Expiry Month */
  int getCreditCardExpMM();

  /** Set Exp. Month. Expiry Month */
  void setCreditCardExpMM(int CreditCardExpMM);

  /** Get Exp. Year. Expiry Year */
  int getCreditCardExpYY();

  /** Set Exp. Year. Expiry Year */
  void setCreditCardExpYY(int CreditCardExpYY);

  /** Get Number. Credit Card Number */
  String getCreditCardNumber();

  /** Set Number. Credit Card Number */
  void setCreditCardNumber(String CreditCardNumber);

  /** Get Credit Card. Credit Card (Visa, MC, AmEx) */
  String getCreditCardType();

  /** Set Credit Card. Credit Card (Visa, MC, AmEx) */
  void setCreditCardType(String CreditCardType);

  /** Get Verification Code. Credit Card Verification code on credit card */
  String getCreditCardVV();

  /** Set Verification Code. Credit Card Verification code on credit card */
  void setCreditCardVV(String CreditCardVV);

  /** Get Customer Address ID */
  String getCustomerAddressID();

  /** Set Customer Address ID */
  void setCustomerAddressID(String CustomerAddressID);

  /** Get Customer Payment Profile ID */
  String getCustomerPaymentProfileID();

  /** Set Customer Payment Profile ID */
  void setCustomerPaymentProfileID(String CustomerPaymentProfileID);

  /** Get Customer Profile ID */
  String getCustomerProfileID();

  /** Set Customer Profile ID */
  void setCustomerProfileID(String CustomerProfileID);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Transaction Date. Transaction Date */
  Timestamp getDateTrx();

  /** Set Transaction Date. Transaction Date */
  void setDateTrx(Timestamp DateTrx);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get IBAN. International Bank Account Number */
  String getIBAN();

  /** Set IBAN. International Bank Account Number */
  void setIBAN(String IBAN);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Allocated. Indicates if the payment has been allocated */
  void setIsAllocated(boolean IsAllocated);

  /** Get Allocated. Indicates if the payment has been allocated */
  boolean isAllocated();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Delayed Capture. Charge after Shipment */
  void setIsDelayedCapture(boolean IsDelayedCapture);

  /** Get Delayed Capture. Charge after Shipment */
  boolean isDelayedCapture();

  /** Set Online Access. Can be accessed online */
  void setIsOnline(boolean IsOnline);

  /** Get Online Access. Can be accessed online */
  boolean isOnline();

  /** Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) */
  void setIsOverUnderPayment(boolean IsOverUnderPayment);

  /** Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) */
  boolean isOverUnderPayment();

  /** Set Prepayment. The Payment/Receipt is a Prepayment */
  void setIsPrepayment(boolean IsPrepayment);

  /** Get Prepayment. The Payment/Receipt is a Prepayment */
  boolean isPrepayment();

  /** Set Receipt. This is a sales transaction (receipt) */
  void setIsReceipt(boolean IsReceipt);

  /** Get Receipt. This is a sales transaction (receipt) */
  boolean isReceipt();

  /** Set Reconciled. Payment is reconciled with bank statement */
  void setIsReconciled(boolean IsReconciled);

  /** Get Reconciled. Payment is reconciled with bank statement */
  boolean isReconciled();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Set Voided */
  void setIsVoided(boolean IsVoided);

  /** Get Voided */
  boolean isVoided();

  /** Get Micr. Combination of routing no, account and check no */
  String getMicr();

  /** Set Micr. Combination of routing no, account and check no */
  void setMicr(String Micr);

  /** Get Online Processing. This payment can be processed online */
  String getOProcessing();

  /** Set Online Processing. This payment can be processed online */
  void setOProcessing(String OProcessing);

  /** Get Original Transaction ID. Original Transaction ID */
  String getOrig_TrxID();

  /** Set Original Transaction ID. Original Transaction ID */
  void setOrig_TrxID(String Orig_TrxID);

  /**
   * Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  BigDecimal getOverUnderAmt();

  /**
   * Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  void setOverUnderAmt(BigDecimal OverUnderAmt);

  /** Get Payment amount. Amount being paid */
  BigDecimal getPayAmt();

  /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

  /** Get PO Number. Purchase Order Number */
  String getPONum();

  /** Set PO Number. Purchase Order Number */
  void setPONum(String PONum);

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /**
   * Get Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  BigDecimal getProcessedOn();

  /**
   * Set Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  void setProcessedOn(BigDecimal ProcessedOn);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Authorization Code. Authorization Code returned */
  String getR_AuthCode();

  /** Set Authorization Code. Authorization Code returned */
  void setR_AuthCode(String R_AuthCode);

  /** Get Authorization Code (DC). Authorization Code Delayed Capture returned */
  String getR_AuthCode_DC();

  /** Set Authorization Code (DC). Authorization Code Delayed Capture returned */
  void setR_AuthCode_DC(String R_AuthCode_DC);

  /** Get Address verified. This address has been verified */
  String getR_AvsAddr();

  /** Set Address verified. This address has been verified */
  void setR_AvsAddr(String R_AvsAddr);

  /** Get Zip verified. The Zip Code has been verified */
  String getR_AvsZip();

  /** Set Zip verified. The Zip Code has been verified */
  void setR_AvsZip(String R_AvsZip);

  /** Get CVV Match. Credit Card Verification Code Match */
  boolean isR_CVV2Match();

  /** Set CVV Match. Credit Card Verification Code Match */
  void setR_CVV2Match(boolean R_CVV2Match);

  /** Get Referenced Payment */
  int getRef_Payment_ID();

  /** Set Referenced Payment */
  void setRef_Payment_ID(int Ref_Payment_ID);

  I_C_Payment getRef_Payment() throws RuntimeException;

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

  I_C_Payment getReversal() throws RuntimeException;

  /** Get Info. Response info */
  String getR_Info();

  /** Set Info. Response info */
  void setR_Info(String R_Info);

  /** Get Routing No. Bank Routing Number */
  String getRoutingNo();

  /** Set Routing No. Bank Routing Number */
  void setRoutingNo(String RoutingNo);

  /** Get Reference. Payment reference */
  String getR_PnRef();

  /** Set Reference. Payment reference */
  void setR_PnRef(String R_PnRef);

  /** Get Reference (DC). Payment Reference Delayed Capture */
  String getR_PnRef_DC();

  /** Set Reference (DC). Payment Reference Delayed Capture */
  void setR_PnRef_DC(String R_PnRef_DC);

  /** Get Response Message. Response message */
  String getR_RespMsg();

  /** Set Response Message. Response message */
  void setR_RespMsg(String R_RespMsg);

  /** Get Result. Result of transmission */
  String getR_Result();

  /** Set Result. Result of transmission */
  void setR_Result(String R_Result);

  /** Get Void Message */
  String getR_VoidMsg();

  /** Set Void Message */
  void setR_VoidMsg(String R_VoidMsg);

  /** Get Swift code. Swift Code or BIC */
  String getSwiftCode();

  /** Set Swift code. Swift Code or BIC */
  void setSwiftCode(String SwiftCode);

  /** Get Swipe. Track 1 and 2 of the Credit Card */
  String getSwipe();

  /** Set Swipe. Track 1 and 2 of the Credit Card */
  void setSwipe(String Swipe);

  /** Get Tax Amount. Tax Amount for a document */
  BigDecimal getTaxAmt();

  /** Set Tax Amount. Tax Amount for a document */
  void setTaxAmt(BigDecimal TaxAmt);

  /** Get Tender type. Method of Payment */
  String getTenderType();

  /** Set Tender type. Method of Payment */
  void setTenderType(String TenderType);

  /** Get Transaction Type. Type of credit card transaction */
  String getTrxType();

  /** Set Transaction Type. Type of credit card transaction */
  void setTrxType(String TrxType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;

  /** Get Voice authorization code. Voice Authorization Code from credit card company */
  String getVoiceAuthCode();

  /** Set Voice authorization code. Voice Authorization Code from credit card company */
  void setVoiceAuthCode(String VoiceAuthCode);

  /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}