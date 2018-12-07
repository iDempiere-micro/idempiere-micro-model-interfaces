package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankStatementLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatementLine {

  /** TableName=C_BankStatementLine */
  String Table_Name = "C_BankStatementLine";

  /** AD_Table_ID=393 */
  int Table_ID = 393;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BankStatement_ID */
  String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
  /** Column name C_BankStatementLine_ID */
  String COLUMNNAME_C_BankStatementLine_ID = "C_BankStatementLine_ID";
  /** Column name C_BankStatementLine_UU */
  String COLUMNNAME_C_BankStatementLine_UU = "C_BankStatementLine_UU";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreatePayment */
  String COLUMNNAME_CreatePayment = "CreatePayment";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EftAmt */
  String COLUMNNAME_EftAmt = "EftAmt";
  /** Column name EftCheckNo */
  String COLUMNNAME_EftCheckNo = "EftCheckNo";
  /** Column name EftCurrency */
  String COLUMNNAME_EftCurrency = "EftCurrency";
  /** Column name EftMemo */
  String COLUMNNAME_EftMemo = "EftMemo";
  /** Column name EftPayee */
  String COLUMNNAME_EftPayee = "EftPayee";
  /** Column name EftPayeeAccount */
  String COLUMNNAME_EftPayeeAccount = "EftPayeeAccount";
  /** Column name EftReference */
  String COLUMNNAME_EftReference = "EftReference";
  /** Column name EftStatementLineDate */
  String COLUMNNAME_EftStatementLineDate = "EftStatementLineDate";
  /** Column name EftTrxID */
  String COLUMNNAME_EftTrxID = "EftTrxID";
  /** Column name EftTrxType */
  String COLUMNNAME_EftTrxType = "EftTrxType";
  /** Column name EftValutaDate */
  String COLUMNNAME_EftValutaDate = "EftValutaDate";
  /** Column name InterestAmt */
  String COLUMNNAME_InterestAmt = "InterestAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name IsReversal */
  String COLUMNNAME_IsReversal = "IsReversal";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name MatchStatement */
  String COLUMNNAME_MatchStatement = "MatchStatement";
  /** Column name Memo */
  String COLUMNNAME_Memo = "Memo";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ReferenceNo */
  String COLUMNNAME_ReferenceNo = "ReferenceNo";
  /** Column name StatementLineDate */
  String COLUMNNAME_StatementLineDate = "StatementLineDate";
  /** Column name StmtAmt */
  String COLUMNNAME_StmtAmt = "StmtAmt";
  /** Column name TrxAmt */
  String COLUMNNAME_TrxAmt = "TrxAmt";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValutaDate */
  String COLUMNNAME_ValutaDate = "ValutaDate";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Bank Statement. Bank Statement of account */
  int getC_BankStatement_ID();

  /** Set Bank Statement. Bank Statement of account */
  void setC_BankStatement_ID(int C_BankStatement_ID);

  I_C_BankStatement getC_BankStatement() throws RuntimeException;

  /** Get Bank statement line. Line on a statement from this Bank */
  int getC_BankStatementLine_ID();

  /** Set Bank statement line. Line on a statement from this Bank */
  void setC_BankStatementLine_ID(int C_BankStatementLine_ID);

  /** Get C_BankStatementLine_UU */
  String getC_BankStatementLine_UU();

  /** Set C_BankStatementLine_UU */
  void setC_BankStatementLine_UU(String C_BankStatementLine_UU);

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

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

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

  /** Get Create Payment */
  String getCreatePayment();

  /** Set Create Payment */
  void setCreatePayment(String CreatePayment);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get EFT Amount. Electronic Funds Transfer Amount */
  BigDecimal getEftAmt();

  /** Set EFT Amount. Electronic Funds Transfer Amount */
  void setEftAmt(BigDecimal EftAmt);

  /** Get EFT Check No. Electronic Funds Transfer Check No */
  String getEftCheckNo();

  /** Set EFT Check No. Electronic Funds Transfer Check No */
  void setEftCheckNo(String EftCheckNo);

  /** Get EFT Currency. Electronic Funds Transfer Currency */
  String getEftCurrency();

  /** Set EFT Currency. Electronic Funds Transfer Currency */
  void setEftCurrency(String EftCurrency);

  /** Get EFT Memo. Electronic Funds Transfer Memo */
  String getEftMemo();

  /** Set EFT Memo. Electronic Funds Transfer Memo */
  void setEftMemo(String EftMemo);

  /** Get EFT Payee. Electronic Funds Transfer Payee information */
  String getEftPayee();

  /** Set EFT Payee. Electronic Funds Transfer Payee information */
  void setEftPayee(String EftPayee);

  /** Get EFT Payee Account. Electronic Funds Transfer Payee Account Information */
  String getEftPayeeAccount();

  /** Set EFT Payee Account. Electronic Funds Transfer Payee Account Information */
  void setEftPayeeAccount(String EftPayeeAccount);

  /** Get EFT Reference. Electronic Funds Transfer Reference */
  String getEftReference();

  /** Set EFT Reference. Electronic Funds Transfer Reference */
  void setEftReference(String EftReference);

  /** Get EFT Statement Line Date. Electronic Funds Transfer Statement Line Date */
  Timestamp getEftStatementLineDate();

  /** Set EFT Statement Line Date. Electronic Funds Transfer Statement Line Date */
  void setEftStatementLineDate(Timestamp EftStatementLineDate);

  /** Get EFT Trx ID. Electronic Funds Transfer Transaction ID */
  String getEftTrxID();

  /** Set EFT Trx ID. Electronic Funds Transfer Transaction ID */
  void setEftTrxID(String EftTrxID);

  /** Get EFT Trx Type. Electronic Funds Transfer Transaction Type */
  String getEftTrxType();

  /** Set EFT Trx Type. Electronic Funds Transfer Transaction Type */
  void setEftTrxType(String EftTrxType);

  /** Get EFT Effective Date. Electronic Funds Transfer Valuta (effective) Date */
  Timestamp getEftValutaDate();

  /** Set EFT Effective Date. Electronic Funds Transfer Valuta (effective) Date */
  void setEftValutaDate(Timestamp EftValutaDate);

  /** Get Interest Amount. Interest Amount */
  BigDecimal getInterestAmt();

  /** Set Interest Amount. Interest Amount */
  void setInterestAmt(BigDecimal InterestAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

  /** Set Reversal. This is a reversing transaction */
  void setIsReversal(boolean IsReversal);

  /** Get Reversal. This is a reversing transaction */
  boolean isReversal();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Match Statement */
  String getMatchStatement();

  /** Set Match Statement */
  void setMatchStatement(String MatchStatement);

  /** Get Memo. Memo Text */
  String getMemo();

  /** Set Memo. Memo Text */
  void setMemo(String Memo);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Reference No. Your customer or vendor number at the Business Partner's site */
  String getReferenceNo();

  /** Set Reference No. Your customer or vendor number at the Business Partner's site */
  void setReferenceNo(String ReferenceNo);

  /** Get Statement Line Date. Date of the Statement Line */
  Timestamp getStatementLineDate();

  /** Set Statement Line Date. Date of the Statement Line */
  void setStatementLineDate(Timestamp StatementLineDate);

  /** Get Statement amount. Statement Amount */
  BigDecimal getStmtAmt();

  /** Set Statement amount. Statement Amount */
  void setStmtAmt(BigDecimal StmtAmt);

  /** Get Transaction Amount. Amount of a transaction */
  BigDecimal getTrxAmt();

  /** Set Transaction Amount. Amount of a transaction */
  void setTrxAmt(BigDecimal TrxAmt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Effective date. Date when money is available */
  Timestamp getValutaDate();

  /** Set Effective date. Date when money is available */
  void setValutaDate(Timestamp ValutaDate);
}
