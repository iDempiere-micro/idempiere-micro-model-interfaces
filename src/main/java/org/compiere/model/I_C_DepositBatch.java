package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DepositBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatch {

  /** TableName=C_DepositBatch */
  String Table_Name = "C_DepositBatch";

  /** AD_Table_ID=200056 */
  int Table_ID = 200056;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_DepositBatch_ID */
  String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
  /** Column name C_DepositBatch_UU */
  String COLUMNNAME_C_DepositBatch_UU = "C_DepositBatch_UU";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name DateDeposit */
  String COLUMNNAME_DateDeposit = "DateDeposit";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name DepositAmt */
  String COLUMNNAME_DepositAmt = "DepositAmt";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Deposit Batch */
  int getC_DepositBatch_ID();

  /** Set Deposit Batch */
  void setC_DepositBatch_ID(int C_DepositBatch_ID);

  /** Get C_DepositBatch_UU */
  String getC_DepositBatch_UU();

  /** Set C_DepositBatch_UU */
  void setC_DepositBatch_UU(String C_DepositBatch_UU);

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

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

  /** Get Deposit Date */
  Timestamp getDateDeposit();

  /** Set Deposit Date */
  void setDateDeposit(Timestamp DateDeposit);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

  /** Get Deposit Amount */
  BigDecimal getDepositAmt();

  /** Set Deposit Amount */
  void setDepositAmt(BigDecimal DepositAmt);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
