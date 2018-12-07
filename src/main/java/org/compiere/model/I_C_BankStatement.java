package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankStatement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatement {

  /** TableName=C_BankStatement */
  String Table_Name = "C_BankStatement";

  /** AD_Table_ID=392 */
  int Table_ID = 392;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BeginningBalance */
  String COLUMNNAME_BeginningBalance = "BeginningBalance";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BankStatement_ID */
  String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
  /** Column name C_BankStatement_UU */
  String COLUMNNAME_C_BankStatement_UU = "C_BankStatement_UU";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name CreateFromBatch */
  String COLUMNNAME_CreateFromBatch = "CreateFromBatch";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name EftStatementDate */
  String COLUMNNAME_EftStatementDate = "EftStatementDate";
  /** Column name EftStatementReference */
  String COLUMNNAME_EftStatementReference = "EftStatementReference";
  /** Column name EndingBalance */
  String COLUMNNAME_EndingBalance = "EndingBalance";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name MatchStatement */
  String COLUMNNAME_MatchStatement = "MatchStatement";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name StatementDate */
  String COLUMNNAME_StatementDate = "StatementDate";
  /** Column name StatementDifference */
  String COLUMNNAME_StatementDifference = "StatementDifference";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Beginning Balance. Balance prior to any transactions */
  BigDecimal getBeginningBalance();

  /** Set Beginning Balance. Balance prior to any transactions */
  void setBeginningBalance(BigDecimal BeginningBalance);

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Bank Statement. Bank Statement of account */
  int getC_BankStatement_ID();

  /** Set Bank Statement. Bank Statement of account */
  void setC_BankStatement_ID(int C_BankStatement_ID);

  /** Get C_BankStatement_UU */
  String getC_BankStatement_UU();

  /** Set C_BankStatement_UU */
  void setC_BankStatement_UU(String C_BankStatement_UU);

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  String getCreateFrom();

  /**
   * Set Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  void setCreateFrom(String CreateFrom);

  /** Get Create From Batch */
  String getCreateFromBatch();

  /** Set Create From Batch */
  void setCreateFromBatch(String CreateFromBatch);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get EFT Statement Date. Electronic Funds Transfer Statement Date */
  Timestamp getEftStatementDate();

  /** Set EFT Statement Date. Electronic Funds Transfer Statement Date */
  void setEftStatementDate(Timestamp EftStatementDate);

  /** Get EFT Statement Reference. Electronic Funds Transfer Statement Reference */
  String getEftStatementReference();

  /** Set EFT Statement Reference. Electronic Funds Transfer Statement Reference */
  void setEftStatementReference(String EftStatementReference);

  /** Get Ending balance. Ending or closing balance */
  BigDecimal getEndingBalance();

  /** Set Ending balance. Ending or closing balance */
  void setEndingBalance(BigDecimal EndingBalance);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

  /** Get Match Statement */
  String getMatchStatement();

  /** Set Match Statement */
  void setMatchStatement(String MatchStatement);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

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

  /** Get Statement date. Date of the statement */
  Timestamp getStatementDate();

  /** Set Statement date. Date of the statement */
  void setStatementDate(Timestamp StatementDate);

  /**
   * Get Statement difference. Difference between statement ending balance and actual ending balance
   */
  BigDecimal getStatementDifference();

  /**
   * Set Statement difference. Difference between statement ending balance and actual ending balance
   */
  void setStatementDifference(BigDecimal StatementDifference);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
