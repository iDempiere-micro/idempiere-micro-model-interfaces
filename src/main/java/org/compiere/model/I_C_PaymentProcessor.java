package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaymentProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentProcessor {

  /** TableName=C_PaymentProcessor */
  String Table_Name = "C_PaymentProcessor";

  /** AD_Table_ID=398 */
  int Table_ID = 398;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

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
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Sequence_ID */
  String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Commission */
  String COLUMNNAME_Commission = "Commission";
  /** Column name CostPerTrx */
  String COLUMNNAME_CostPerTrx = "CostPerTrx";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
  /** Column name C_PaymentProcessor_UU */
  String COLUMNNAME_C_PaymentProcessor_UU = "C_PaymentProcessor_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name HostAddress */
  String COLUMNNAME_HostAddress = "HostAddress";
  /** Column name HostPort */
  String COLUMNNAME_HostPort = "HostPort";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name MinimumAmt */
  String COLUMNNAME_MinimumAmt = "MinimumAmt";
  /** Column name PayProcessorClass */
  String COLUMNNAME_PayProcessorClass = "PayProcessorClass";
  /** Column name ProxyAddress */
  String COLUMNNAME_ProxyAddress = "ProxyAddress";
  /** Column name ProxyLogon */
  String COLUMNNAME_ProxyLogon = "ProxyLogon";
  /** Column name ProxyPassword */
  String COLUMNNAME_ProxyPassword = "ProxyPassword";
  /** Column name ProxyPort */
  String COLUMNNAME_ProxyPort = "ProxyPort";
  /** Column name RequireVV */
  String COLUMNNAME_RequireVV = "RequireVV";
  /** Column name TrxType */
  String COLUMNNAME_TrxType = "TrxType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Accept AMEX. Accept American Express Card */
  boolean isAcceptAMEX();

  /** Set Accept AMEX. Accept American Express Card */
  void setAcceptAMEX(boolean AcceptAMEX);

  /** Get Accept ATM. Accept Bank ATM Card */
  boolean isAcceptATM();

  /** Set Accept ATM. Accept Bank ATM Card */
  void setAcceptATM(boolean AcceptATM);

  /** Get Accept Electronic Check. Accept ECheck (Electronic Checks) */
  boolean isAcceptCheck();

  /** Set Accept Electronic Check. Accept ECheck (Electronic Checks) */
  void setAcceptCheck(boolean AcceptCheck);

  /** Get Accept Corporate. Accept Corporate Purchase Cards */
  boolean isAcceptCorporate();

  /** Set Accept Corporate. Accept Corporate Purchase Cards */
  void setAcceptCorporate(boolean AcceptCorporate);

  /** Get Accept Diners. Accept Diner's Club */
  boolean isAcceptDiners();

  /** Set Accept Diners. Accept Diner's Club */
  void setAcceptDiners(boolean AcceptDiners);

  /** Get Accept Direct Debit. Accept Direct Debits (vendor initiated) */
  boolean isAcceptDirectDebit();

  /** Set Accept Direct Debit. Accept Direct Debits (vendor initiated) */
  void setAcceptDirectDebit(boolean AcceptDirectDebit);

  /** Get Accept Direct Deposit. Accept Direct Deposit (payee initiated) */
  boolean isAcceptDirectDeposit();

  /** Set Accept Direct Deposit. Accept Direct Deposit (payee initiated) */
  void setAcceptDirectDeposit(boolean AcceptDirectDeposit);

  /** Get Accept Discover. Accept Discover Card */
  boolean isAcceptDiscover();

  /** Set Accept Discover. Accept Discover Card */
  void setAcceptDiscover(boolean AcceptDiscover);

  /** Get Accept MasterCard. Accept Master Card */
  boolean isAcceptMC();

  /** Set Accept MasterCard. Accept Master Card */
  void setAcceptMC(boolean AcceptMC);

  /** Get Accept Visa. Accept Visa Cards */
  boolean isAcceptVisa();

  /** Set Accept Visa. Accept Visa Cards */
  void setAcceptVisa(boolean AcceptVisa);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Sequence. Document Sequence */
  int getAD_Sequence_ID();

  /** Set Sequence. Document Sequence */
  void setAD_Sequence_ID(int AD_Sequence_ID);

  I_AD_Sequence getAD_Sequence() throws RuntimeException;

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Commission %. Commission stated as a percentage */
  BigDecimal getCommission();

  /** Set Commission %. Commission stated as a percentage */
  void setCommission(BigDecimal Commission);

  /** Get Cost per transaction. Fixed cost per transaction */
  BigDecimal getCostPerTrx();

  /** Set Cost per transaction. Fixed cost per transaction */
  void setCostPerTrx(BigDecimal CostPerTrx);

  /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

  /** Set Payment Processor. Payment processor for electronic payments */
  void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

  /** Get C_PaymentProcessor_UU */
  String getC_PaymentProcessor_UU();

  /** Set C_PaymentProcessor_UU */
  void setC_PaymentProcessor_UU(String C_PaymentProcessor_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Host Address. Host Address URL or DNS */
  String getHostAddress();

  /** Set Host Address. Host Address URL or DNS */
  void setHostAddress(String HostAddress);

  /** Get Host port. Host Communication Port */
  int getHostPort();

  /** Set Host port. Host Communication Port */
  void setHostPort(int HostPort);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Minimum Amt. Minimum Amount in Document Currency */
  BigDecimal getMinimumAmt();

  /** Set Minimum Amt. Minimum Amount in Document Currency */
  void setMinimumAmt(BigDecimal MinimumAmt);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Payment Processor Class. Payment Processor Java Class */
  String getPayProcessorClass();

  /** Set Payment Processor Class. Payment Processor Java Class */
  void setPayProcessorClass(String PayProcessorClass);

  /** Get Proxy address. Address of your proxy server */
  String getProxyAddress();

  /** Set Proxy address. Address of your proxy server */
  void setProxyAddress(String ProxyAddress);

  /** Get Proxy logon. Logon of your proxy server */
  String getProxyLogon();

  /** Set Proxy logon. Logon of your proxy server */
  void setProxyLogon(String ProxyLogon);

  /** Get Proxy password. Password of your proxy server */
  String getProxyPassword();

  /** Set Proxy password. Password of your proxy server */
  void setProxyPassword(String ProxyPassword);

  /** Get Proxy port. Port of your proxy server */
  int getProxyPort();

  /** Set Proxy port. Port of your proxy server */
  void setProxyPort(int ProxyPort);

  /** Get Require CreditCard Verification Code. Require 3/4 digit Credit Verification Code */
  boolean isRequireVV();

  /** Set Require CreditCard Verification Code. Require 3/4 digit Credit Verification Code */
  void setRequireVV(boolean RequireVV);

  /** Get Transaction Type. Type of credit card transaction */
  String getTrxType();

  /** Set Transaction Type. Type of credit card transaction */
  void setTrxType(String TrxType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
