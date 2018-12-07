package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_POSPayment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSPayment {

  /** TableName=C_POSPayment */
  String Table_Name = "C_POSPayment";

  /** AD_Table_ID=200016 */
  int Table_ID = 200016;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AccountNo */
  String COLUMNNAME_AccountNo = "AccountNo";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Name */
  String COLUMNNAME_A_Name = "A_Name";
  /** Column name CheckNo */
  String COLUMNNAME_CheckNo = "CheckNo";
  /** Column name CheckStatus */
  String COLUMNNAME_CheckStatus = "CheckStatus";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_POSPayment_ID */
  String COLUMNNAME_C_POSPayment_ID = "C_POSPayment_ID";
  /** Column name C_POSPayment_UU */
  String COLUMNNAME_C_POSPayment_UU = "C_POSPayment_UU";
  /** Column name C_POSTenderType_ID */
  String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreditCardNumber */
  String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
  /** Column name CreditCardType */
  String COLUMNNAME_CreditCardType = "CreditCardType";
  /** Column name DatePromised */
  String COLUMNNAME_DatePromised = "DatePromised";
  /** Column name DepositGroup */
  String COLUMNNAME_DepositGroup = "DepositGroup";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IBAN */
  String COLUMNNAME_IBAN = "IBAN";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPostDated */
  String COLUMNNAME_IsPostDated = "IsPostDated";
  /** Column name Micr */
  String COLUMNNAME_Micr = "Micr";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name RoutingNo */
  String COLUMNNAME_RoutingNo = "RoutingNo";
  /** Column name SwiftCode */
  String COLUMNNAME_SwiftCode = "SwiftCode";
  /** Column name TenderType */
  String COLUMNNAME_TenderType = "TenderType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VoiceAuthCode */
  String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";

  /** Get Account No. Account Number */
  String getAccountNo();

  /** Set Account No. Account Number */
  void setAccountNo(String AccountNo);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Account Name. Name on Credit Card or Account holder */
  String getA_Name();

  /** Set Account Name. Name on Credit Card or Account holder */
  void setA_Name(String A_Name);

  /** Get Check No. Check Number */
  String getCheckNo();

  /** Set Check No. Check Number */
  void setCheckNo(String CheckNo);

  /** Get Check Status */
  String getCheckStatus();

  /** Set Check Status */
  void setCheckStatus(String CheckStatus);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get POS Payment */
  int getC_POSPayment_ID();

  /** Set POS Payment */
  void setC_POSPayment_ID(int C_POSPayment_ID);

  /** Get C_POSPayment_UU */
  String getC_POSPayment_UU();

  /** Set C_POSPayment_UU */
  void setC_POSPayment_UU(String C_POSPayment_UU);

  /** Get POS Tender Type */
  int getC_POSTenderType_ID();

  /** Set POS Tender Type */
  void setC_POSTenderType_ID(int C_POSTenderType_ID);

  I_C_POSTenderType getC_POSTenderType() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Number. Credit Card Number */
  String getCreditCardNumber();

  /** Set Number. Credit Card Number */
  void setCreditCardNumber(String CreditCardNumber);

  /** Get Credit Card. Credit Card (Visa, MC, AmEx) */
  String getCreditCardType();

  /** Set Credit Card. Credit Card (Visa, MC, AmEx) */
  void setCreditCardType(String CreditCardType);

  /** Get Date Promised. Date Order was promised */
  Timestamp getDatePromised();

  /** Set Date Promised. Date Order was promised */
  void setDatePromised(Timestamp DatePromised);

  /** Get Deposit Group */
  String getDepositGroup();

  /** Set Deposit Group */
  void setDepositGroup(String DepositGroup);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get IBAN. International Bank Account Number */
  String getIBAN();

  /** Set IBAN. International Bank Account Number */
  void setIBAN(String IBAN);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Post Dated */
  void setIsPostDated(boolean IsPostDated);

  /** Get Post Dated */
  boolean isPostDated();

  /** Get Micr. Combination of routing no, account and check no */
  String getMicr();

  /** Set Micr. Combination of routing no, account and check no */
  void setMicr(String Micr);

  /** Get Payment amount. Amount being paid */
  BigDecimal getPayAmt();

  /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Routing No. Bank Routing Number */
  String getRoutingNo();

  /** Set Routing No. Bank Routing Number */
  void setRoutingNo(String RoutingNo);

  /** Get Swift code. Swift Code or BIC */
  String getSwiftCode();

  /** Set Swift code. Swift Code or BIC */
  void setSwiftCode(String SwiftCode);

  /** Get Tender type. Method of Payment */
  String getTenderType();

  /** Set Tender type. Method of Payment */
  void setTenderType(String TenderType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Voice authorization code. Voice Authorization Code from credit card company */
  String getVoiceAuthCode();

  /** Set Voice authorization code. Voice Authorization Code from credit card company */
  void setVoiceAuthCode(String VoiceAuthCode);
}
