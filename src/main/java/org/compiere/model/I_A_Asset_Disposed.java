package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Disposed
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Disposed {

  /** TableName=A_Asset_Disposed */
  String Table_Name = "A_Asset_Disposed";

  /** AD_Table_ID=53127 */
  int Table_ID = 53127;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Accumulated_Depr_Delta */
  String COLUMNNAME_A_Accumulated_Depr_Delta = "A_Accumulated_Depr_Delta";
  /** Column name A_Activation_Method */
  String COLUMNNAME_A_Activation_Method = "A_Activation_Method";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_Disposed_ID */
  String COLUMNNAME_A_Asset_Disposed_ID = "A_Asset_Disposed_ID";
  /** Column name A_Asset_Disposed_UU */
  String COLUMNNAME_A_Asset_Disposed_UU = "A_Asset_Disposed_UU";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Status */
  String COLUMNNAME_A_Asset_Status = "A_Asset_Status";
  /** Column name A_Asset_Trade_ID */
  String COLUMNNAME_A_Asset_Trade_ID = "A_Asset_Trade_ID";
  /** Column name A_Disposal_Amt */
  String COLUMNNAME_A_Disposal_Amt = "A_Disposal_Amt";
  /** Column name A_Disposed_Date */
  String COLUMNNAME_A_Disposed_Date = "A_Disposed_Date";
  /** Column name A_Disposed_Method */
  String COLUMNNAME_A_Disposed_Method = "A_Disposed_Method";
  /** Column name A_Disposed_Reason */
  String COLUMNNAME_A_Disposed_Reason = "A_Disposed_Reason";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Proceeds */
  String COLUMNNAME_A_Proceeds = "A_Proceeds";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
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
  /** Column name Expense */
  String COLUMNNAME_Expense = "Expense";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsDisposed */
  String COLUMNNAME_IsDisposed = "IsDisposed";
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
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

  /** Get Accumulated Depreciation (delta) */
  BigDecimal getA_Accumulated_Depr_Delta();

  /** Set Accumulated Depreciation (delta) */
  void setA_Accumulated_Depr_Delta(BigDecimal A_Accumulated_Depr_Delta);

  /** Get Activation Method */
  String getA_Activation_Method();

  /** Set Activation Method */
  void setA_Activation_Method(String A_Activation_Method);

  /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

  /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

  /** Get Asset Disposed */
  int getA_Asset_Disposed_ID();

  /** Set Asset Disposed */
  void setA_Asset_Disposed_ID(int A_Asset_Disposed_ID);

  /** Get A_Asset_Disposed_UU */
  String getA_Asset_Disposed_UU();

  /** Set A_Asset_Disposed_UU */
  void setA_Asset_Disposed_UU(String A_Asset_Disposed_UU);

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get Asset Status */
  String getA_Asset_Status();

  /** Set Asset Status */
  void setA_Asset_Status(String A_Asset_Status);

  /** Get Asset Trade */
  int getA_Asset_Trade_ID();

  /** Set Asset Trade */
  void setA_Asset_Trade_ID(int A_Asset_Trade_ID);

  I_A_Asset getA_Asset_Trade() throws RuntimeException;

  /** Get Disposal Amount */
  BigDecimal getA_Disposal_Amt();

  /** Set Disposal Amount */
  void setA_Disposal_Amt(BigDecimal A_Disposal_Amt);

  /** Get Disposed Date */
  Timestamp getA_Disposed_Date();

  /** Set Disposed Date */
  void setA_Disposed_Date(Timestamp A_Disposed_Date);

  /** Get Disposed Method */
  String getA_Disposed_Method();

  /** Set Disposed Method */
  void setA_Disposed_Method(String A_Disposed_Method);

  /** Get Disposed Reason */
  String getA_Disposed_Reason();

  /** Set Disposed Reason */
  void setA_Disposed_Reason(String A_Disposed_Reason);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Asset Proceeds */
  BigDecimal getA_Proceeds();

  /** Set Asset Proceeds */
  void setA_Proceeds(BigDecimal A_Proceeds);

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Get Expense */
  BigDecimal getExpense();

  /** Set Expense */
  void setExpense(BigDecimal Expense);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Disposed. The asset is disposed */
  void setIsDisposed(boolean IsDisposed);

  /** Get Disposed. The asset is disposed */
  boolean isDisposed();

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
