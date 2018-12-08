package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.icommon.model.IPO;

/** @author Elaine */
public interface PaymentInterface {

  /** Get Account City. City or the Credit Card or Account Holder */
  String getA_City();

  /** Set Account City. City or the Credit Card or Account Holder */
  void setA_City(String A_City);

  /** Get Account Country. Country */
  String getA_Country();

  /** Set Account Country. Country */
  void setA_Country(String A_Country);

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

  /** Get Account No. Account Number */
  String getAccountNo();

  /** Set Account No. Account Number */
  void setAccountNo(String AccountNo);

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  org.compiere.model.I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Partner Bank Account. Bank Account of the Business Partner */
  int getC_BP_BankAccount_ID();

  /** Set Partner Bank Account. Bank Account of the Business Partner */
  void setC_BP_BankAccount_ID(int C_BP_BankAccount_ID);

  org.compiere.model.I_C_BP_BankAccount getC_BP_BankAccount() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  org.compiere.model.I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  org.compiere.model.I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

  /** Set Payment Processor. Payment processor for electronic payments */
  void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

  org.compiere.model.I_C_PaymentProcessor getC_PaymentProcessor() throws RuntimeException;

  /** Get POS Tender Type */
  int getC_POSTenderType_ID();

  /** Set POS Tender Type */
  void setC_POSTenderType_ID(int C_POSTenderType_ID);

  org.compiere.model.I_C_POSTenderType getC_POSTenderType() throws RuntimeException;

  /** Get Check No. Check Number */
  String getCheckNo();

  /** Set Check No. Check Number */
  void setCheckNo(String CheckNo);

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

  /** Get Transaction Date. Transaction Date */
  Timestamp getDateTrx();

  /** Set Transaction Date. Transaction Date */
  void setDateTrx(Timestamp DateTrx);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

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

  /** Set Voided */
  void setIsVoided(boolean IsVoided);

  /** Get Voided */
  boolean isVoided();

  /** Get Micr. Combination of routing no, account and check no */
  String getMicr();

  /** Set Micr. Combination of routing no, account and check no */
  void setMicr(String Micr);

  /** Get Original Transaction ID. Original Transaction ID */
  String getOrig_TrxID();

  /** Set Original Transaction ID. Original Transaction ID */
  void setOrig_TrxID(String Orig_TrxID);

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

  /** Get Authorization Code. Authorization Code returned */
  String getR_AuthCode();

  /** Set Authorization Code. Authorization Code returned */
  void setR_AuthCode(String R_AuthCode);

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

  /** Get Info. Response info */
  String getR_Info();

  /** Set Info. Response info */
  void setR_Info(String R_Info);

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

  /** Get Void Message */
  String getR_VoidMsg();

  /** Set Void Message */
  void setR_VoidMsg(String R_VoidMsg);

  /** Get Routing No. Bank Routing Number */
  String getRoutingNo();

  /** Set Routing No. Bank Routing Number */
  void setRoutingNo(String RoutingNo);

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

  /** Get Voice authorization code. Voice Authorization Code from credit card company */
  String getVoiceAuthCode();

  /** Set Voice authorization code. Voice Authorization Code from credit card company */
  void setVoiceAuthCode(String VoiceAuthCode);

  /**
   * Get Persistent Object
   *
   * @return PO
   */
  IPO getPO();
}
