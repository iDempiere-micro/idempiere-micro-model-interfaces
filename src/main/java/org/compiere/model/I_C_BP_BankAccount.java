package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_BankAccount
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_BankAccount {

  /** TableName=C_BP_BankAccount */
  String Table_Name = "C_BP_BankAccount";

  /** AD_Table_ID=298 */
  int Table_ID = 298;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AccountNo */
  String COLUMNNAME_AccountNo = "AccountNo";
  /** Column name A_City */
  String COLUMNNAME_A_City = "A_City";
  /** Column name A_Country */
  String COLUMNNAME_A_Country = "A_Country";
    /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
  /** Column name BankAccountType */
  String COLUMNNAME_BankAccountType = "BankAccountType";
  /** Column name BPBankAcctUse */
  String COLUMNNAME_BPBankAcctUse = "BPBankAcctUse";
  /** Column name C_Bank_ID */
  String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_BankAccount_ID */
  String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
  /** Column name C_BP_BankAccount_UU */
  String COLUMNNAME_C_BP_BankAccount_UU = "C_BP_BankAccount_UU";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
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
  /** Column name CustomerPaymentProfileID */
  String COLUMNNAME_CustomerPaymentProfileID = "CustomerPaymentProfileID";
  /** Column name IBAN */
  String COLUMNNAME_IBAN = "IBAN";
  /** Column name IsACH */
  String COLUMNNAME_IsACH = "IsACH";
    /** Column name R_AvsAddr */
  String COLUMNNAME_R_AvsAddr = "R_AvsAddr";
  /** Column name R_AvsZip */
  String COLUMNNAME_R_AvsZip = "R_AvsZip";
  /** Column name RoutingNo */
  String COLUMNNAME_RoutingNo = "RoutingNo";

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

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

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

    /** Get Account Usage. Business Partner Bank Account usage */
  String getBPBankAcctUse();

  /** Set Account Usage. Business Partner Bank Account usage */
  void setBPBankAcctUse(String BPBankAcctUse);

  /** Get Bank. Bank */
  int getC_Bank_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Get Partner Bank Account. Bank Account of the Business Partner */
  int getC_BP_BankAccount_ID();

    /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

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

    /** Get IBAN. International Bank Account Number */
  String getIBAN();

  /** Set IBAN. International Bank Account Number */
  void setIBAN(String IBAN);

  /** Set ACH. Automatic Clearing House */
  void setIsACH(boolean IsACH);

  /** Get ACH. Automatic Clearing House */
  boolean isACH();

    /** Set Address verified. This address has been verified */
  void setR_AvsAddr(String R_AvsAddr);

    /** Set Zip verified. The Zip Code has been verified */
  void setR_AvsZip(String R_AvsZip);

  /** Get Routing No. Bank Routing Number */
  String getRoutingNo();

  /** Set Routing No. Bank Routing Number */
  void setRoutingNo(String RoutingNo);

}
