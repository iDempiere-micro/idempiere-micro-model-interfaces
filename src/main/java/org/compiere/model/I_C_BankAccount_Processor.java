package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankAccount_Processor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccount_Processor {

  /** TableName=C_BankAccount_Processor */
  String Table_Name = "C_BankAccount_Processor";

  /** AD_Table_ID=200030 */
  int Table_ID = 200030;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AcceptAMEX */
  String COLUMNNAME_AcceptAMEX = "AcceptAMEX";
  /** Column name AcceptATM */
  String COLUMNNAME_AcceptATM = "AcceptATM";
  /** Column name AcceptCheck */
  String COLUMNNAME_AcceptCheck = "AcceptCheck";
  /** Column name AcceptCorporate */
  String COLUMNNAME_AcceptCorporate = "AcceptCorporate";
  /** Column name AcceptDiners */
  String COLUMNNAME_AcceptDiners = "AcceptDiners";
  /** Column name AcceptDirectDebit */
  String COLUMNNAME_AcceptDirectDebit = "AcceptDirectDebit";
  /** Column name AcceptDirectDeposit */
  String COLUMNNAME_AcceptDirectDeposit = "AcceptDirectDeposit";
  /** Column name AcceptDiscover */
  String COLUMNNAME_AcceptDiscover = "AcceptDiscover";
  /** Column name AcceptMC */
  String COLUMNNAME_AcceptMC = "AcceptMC";
  /** Column name AcceptVisa */
  String COLUMNNAME_AcceptVisa = "AcceptVisa";
    /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BankAccount_Processor_UU */
  String COLUMNNAME_C_BankAccount_Processor_UU = "C_BankAccount_Processor_UU";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /** Column name IsPPAcceptAMEX */
  String COLUMNNAME_IsPPAcceptAMEX = "IsPPAcceptAMEX";
  /** Column name IsPPAcceptATM */
  String COLUMNNAME_IsPPAcceptATM = "IsPPAcceptATM";
  /** Column name IsPPAcceptCheck */
  String COLUMNNAME_IsPPAcceptCheck = "IsPPAcceptCheck";
  /** Column name IsPPAcceptCorporate */
  String COLUMNNAME_IsPPAcceptCorporate = "IsPPAcceptCorporate";
  /** Column name IsPPAcceptDiners */
  String COLUMNNAME_IsPPAcceptDiners = "IsPPAcceptDiners";
  /** Column name IsPPAcceptDirectDebit */
  String COLUMNNAME_IsPPAcceptDirectDebit = "IsPPAcceptDirectDebit";
  /** Column name IsPPAcceptDirectDeposit */
  String COLUMNNAME_IsPPAcceptDirectDeposit = "IsPPAcceptDirectDeposit";
  /** Column name IsPPAcceptDiscover */
  String COLUMNNAME_IsPPAcceptDiscover = "IsPPAcceptDiscover";
  /** Column name IsPPAcceptMC */
  String COLUMNNAME_IsPPAcceptMC = "IsPPAcceptMC";
  /** Column name IsPPAcceptVisa */
  String COLUMNNAME_IsPPAcceptVisa = "IsPPAcceptVisa";
  /** Column name MinimumAmt */
  String COLUMNNAME_MinimumAmt = "MinimumAmt";
  /** Column name PartnerID */
  String COLUMNNAME_PartnerID = "PartnerID";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name RequireVV */
  String COLUMNNAME_RequireVV = "RequireVV";
    /** Column name UserID */
  String COLUMNNAME_UserID = "UserID";
  /** Column name VendorID */
  String COLUMNNAME_VendorID = "VendorID";

  /** Get Accept AMEX. Accept American Express Card */
  boolean isAcceptAMEX();

    /** Get Accept ATM. Accept Bank ATM Card */
  boolean isAcceptATM();

    /** Get Accept Electronic Check. Accept ECheck (Electronic Checks) */
  boolean isAcceptCheck();

    /** Get Accept Corporate. Accept Corporate Purchase Cards */
  boolean isAcceptCorporate();

    /** Get Accept Diners. Accept Diner's Club */
  boolean isAcceptDiners();

    /** Get Accept Direct Debit. Accept Direct Debits (vendor initiated) */
  boolean isAcceptDirectDebit();

    /** Get Accept Direct Deposit. Accept Direct Deposit (payee initiated) */
  boolean isAcceptDirectDeposit();

    /** Get Accept Discover. Accept Discover Card */
  boolean isAcceptDiscover();

    /** Get Accept MasterCard. Accept Master Card */
  boolean isAcceptMC();

    /** Get Accept Visa. Accept Visa Cards */
  boolean isAcceptVisa();

    /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

    /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

  /** Set Payment Processor. Payment processor for electronic payments */
  void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

}
