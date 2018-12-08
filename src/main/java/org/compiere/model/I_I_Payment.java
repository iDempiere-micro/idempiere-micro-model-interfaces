package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_Payment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Payment {

  /** TableName=I_Payment */
  String Table_Name = "I_Payment";

  /** AD_Table_ID=597 */
  int Table_ID = 597;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AccountNo */
  String COLUMNNAME_AccountNo = "AccountNo";
  /** Column name A_City */
  String COLUMNNAME_A_City = "A_City";
  /** Column name A_Country */
  String COLUMNNAME_A_Country = "A_Country";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
  /** Column name BankAccountNo */
  String COLUMNNAME_BankAccountNo = "BankAccountNo";
  /** Column name BPartnerValue */
  String COLUMNNAME_BPartnerValue = "BPartnerValue";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name ChargeName */
  String COLUMNNAME_ChargeName = "ChargeName";
  /** Column name CheckNo */
  String COLUMNNAME_CheckNo = "CheckNo";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateTrx */
  String COLUMNNAME_DateTrx = "DateTrx";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name DocTypeName */
  String COLUMNNAME_DocTypeName = "DocTypeName";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IBAN */
  String COLUMNNAME_IBAN = "IBAN";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name InvoiceDocumentNo */
  String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";
  /** Column name I_Payment_ID */
  String COLUMNNAME_I_Payment_ID = "I_Payment_ID";
  /** Column name I_Payment_UU */
  String COLUMNNAME_I_Payment_UU = "I_Payment_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsDelayedCapture */
  String COLUMNNAME_IsDelayedCapture = "IsDelayedCapture";
  /** Column name ISO_Code */
  String COLUMNNAME_ISO_Code = "ISO_Code";
  /** Column name IsOverUnderPayment */
  String COLUMNNAME_IsOverUnderPayment = "IsOverUnderPayment";
  /** Column name IsReceipt */
  String COLUMNNAME_IsReceipt = "IsReceipt";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name Micr */
  String COLUMNNAME_Micr = "Micr";
  /** Column name Orig_TrxID */
  String COLUMNNAME_Orig_TrxID = "Orig_TrxID";
  /** Column name OverUnderAmt */
  String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name PONum */
  String COLUMNNAME_PONum = "PONum";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name R_AuthCode */
  String COLUMNNAME_R_AuthCode = "R_AuthCode";
  /** Column name R_Info */
  String COLUMNNAME_R_Info = "R_Info";
  /** Column name RoutingNo */
  String COLUMNNAME_RoutingNo = "RoutingNo";
  /** Column name R_PnRef */
  String COLUMNNAME_R_PnRef = "R_PnRef";
  /** Column name R_RespMsg */
  String COLUMNNAME_R_RespMsg = "R_RespMsg";
  /** Column name R_Result */
  String COLUMNNAME_R_Result = "R_Result";
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

  /** Get Bank Account No. Bank Account Number */
  String getBankAccountNo();

  /** Set Bank Account No. Bank Account Number */
  void setBankAccountNo(String BankAccountNo);

  /** Get Business Partner Key. Key of the Business Partner */
  String getBPartnerValue();

  /** Set Business Partner Key. Key of the Business Partner */
  void setBPartnerValue(String BPartnerValue);

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

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Charge Name. Name of the Charge */
  String getChargeName();

  /** Set Charge Name. Name of the Charge */
  void setChargeName(String ChargeName);

  /** Get Check No. Check Number */
  String getCheckNo();

  /** Set Check No. Check Number */
  void setCheckNo(String CheckNo);

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

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

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Transaction Date. Transaction Date */
  Timestamp getDateTrx();

  /** Set Transaction Date. Transaction Date */
  void setDateTrx(Timestamp DateTrx);

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Get Document Type Name. Name of the Document Type */
  String getDocTypeName();

  /** Set Document Type Name. Name of the Document Type */
  void setDocTypeName(String DocTypeName);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get IBAN. International Bank Account Number */
  String getIBAN();

  /** Set IBAN. International Bank Account Number */
  void setIBAN(String IBAN);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Get Invoice Document No. Document Number of the Invoice */
  String getInvoiceDocumentNo();

  /** Set Invoice Document No. Document Number of the Invoice */
  void setInvoiceDocumentNo(String InvoiceDocumentNo);

  /** Get Import Payment. Import Payment */
  int getI_Payment_ID();

  /** Set Import Payment. Import Payment */
  void setI_Payment_ID(int I_Payment_ID);

  /** Get I_Payment_UU */
  String getI_Payment_UU();

  /** Set I_Payment_UU */
  void setI_Payment_UU(String I_Payment_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Delayed Capture. Charge after Shipment */
  void setIsDelayedCapture(boolean IsDelayedCapture);

  /** Get Delayed Capture. Charge after Shipment */
  boolean isDelayedCapture();

  /** Get ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  String getISO_Code();

  /** Set ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  void setISO_Code(String ISO_Code);

  /** Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) */
  void setIsOverUnderPayment(boolean IsOverUnderPayment);

  /** Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) */
  boolean isOverUnderPayment();

  /** Set Receipt. This is a sales transaction (receipt) */
  void setIsReceipt(boolean IsReceipt);

  /** Get Receipt. This is a sales transaction (receipt) */
  boolean isReceipt();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Get Micr. Combination of routing no, account and check no */
  String getMicr();

  /** Set Micr. Combination of routing no, account and check no */
  void setMicr(String Micr);

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

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Authorization Code. Authorization Code returned */
  String getR_AuthCode();

  /** Set Authorization Code. Authorization Code returned */
  void setR_AuthCode(String R_AuthCode);

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

  /** Get Response Message. Response message */
  String getR_RespMsg();

  /** Set Response Message. Response message */
  void setR_RespMsg(String R_RespMsg);

  /** Get Result. Result of transmission */
  String getR_Result();

  /** Set Result. Result of transmission */
  void setR_Result(String R_Result);

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

  /** Get Voice authorization code. Voice Authorization Code from credit card company */
  String getVoiceAuthCode();

  /** Set Voice authorization code. Voice Authorization Code from credit card company */
  void setVoiceAuthCode(String VoiceAuthCode);

  /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}
