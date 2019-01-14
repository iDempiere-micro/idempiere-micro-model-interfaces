package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_Journal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Journal {

  /** TableName=GL_Journal */
  String Table_Name = "GL_Journal";

  /** AD_Table_ID=224 */
  int Table_ID = 224;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ControlAmt */
  String COLUMNNAME_ControlAmt = "ControlAmt";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrencyRate */
  String COLUMNNAME_CurrencyRate = "CurrencyRate";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name GL_Budget_ID */
  String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
  /** Column name GL_Category_ID */
  String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
  /** Column name GL_JournalBatch_ID */
  String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
  /** Column name GL_Journal_ID */
  String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
  /** Column name GL_Journal_UU */
  String COLUMNNAME_GL_Journal_UU = "GL_Journal_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name TotalCr */
  String COLUMNNAME_TotalCr = "TotalCr";
  /** Column name TotalDr */
  String COLUMNNAME_TotalDr = "TotalDr";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Control Amount. If not zero, the Debit amount of the document must be equal this amount */
  BigDecimal getControlAmt();

  /** Set Control Amount. If not zero, the Debit amount of the document must be equal this amount */
  void setControlAmt(BigDecimal ControlAmt);

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Rate. Currency Conversion Rate */
  BigDecimal getCurrencyRate();

  /** Set Rate. Currency Conversion Rate */
  void setCurrencyRate(BigDecimal CurrencyRate);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

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

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Budget. General Ledger Budget */
  int getGL_Budget_ID();

  /** Set Budget. General Ledger Budget */
  void setGL_Budget_ID(int GL_Budget_ID);

  I_GL_Budget getGL_Budget() throws RuntimeException;

  /** Get GL Category. General Ledger Category */
  int getGL_Category_ID();

  /** Set GL Category. General Ledger Category */
  void setGL_Category_ID(int GL_Category_ID);

  I_GL_Category getGL_Category() throws RuntimeException;

  /** Get Journal Batch. General Ledger Journal Batch */
  int getGL_JournalBatch_ID();

  /** Set Journal Batch. General Ledger Journal Batch */
  void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

  I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException;

  /** Get Journal. General Ledger Journal */
  int getGL_Journal_ID();

  /** Set Journal. General Ledger Journal */
  void setGL_Journal_ID(int GL_Journal_ID);

  /** Get GL_Journal_UU */
  String getGL_Journal_UU();

  /** Set GL_Journal_UU */
  void setGL_Journal_UU(String GL_Journal_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

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

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

  I_GL_Journal getReversal() throws RuntimeException;

  /** Get Total Credit. Total Credit in document currency */
  BigDecimal getTotalCr();

  /** Set Total Credit. Total Credit in document currency */
  void setTotalCr(BigDecimal TotalCr);

  /** Get Total Debit. Total debit in document currency */
  BigDecimal getTotalDr();

  /** Set Total Debit. Total debit in document currency */
  void setTotalDr(BigDecimal TotalDr);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}