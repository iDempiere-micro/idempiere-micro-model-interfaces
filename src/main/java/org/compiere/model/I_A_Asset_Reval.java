package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Reval
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Reval {

  /** TableName=A_Asset_Reval */
  String Table_Name = "A_Asset_Reval";

  /** AD_Table_ID=53275 */
  int Table_ID = 53275;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_Cost_Change */
  String COLUMNNAME_A_Asset_Cost_Change = "A_Asset_Cost_Change";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Reval_ID */
  String COLUMNNAME_A_Asset_Reval_ID = "A_Asset_Reval_ID";
  /** Column name A_Asset_Reval_UU */
  String COLUMNNAME_A_Asset_Reval_UU = "A_Asset_Reval_UU";
  /** Column name A_Change_Acumulated_Depr */
  String COLUMNNAME_A_Change_Acumulated_Depr = "A_Change_Acumulated_Depr";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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

  /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

  /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

  /** Get Asset Cost Change */
  BigDecimal getA_Asset_Cost_Change();

  /** Set Asset Cost Change */
  void setA_Asset_Cost_Change(BigDecimal A_Asset_Cost_Change);

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get Asset Revaluation */
  int getA_Asset_Reval_ID();

  /** Set Asset Revaluation */
  void setA_Asset_Reval_ID(int A_Asset_Reval_ID);

  /** Get A_Asset_Reval_UU */
  String getA_Asset_Reval_UU();

  /** Set A_Asset_Reval_UU */
  void setA_Asset_Reval_UU(String A_Asset_Reval_UU);

  /** Get Change Acumulated Depreciation */
  BigDecimal getA_Change_Acumulated_Depr();

  /** Set Change Acumulated Depreciation */
  void setA_Change_Acumulated_Depr(BigDecimal A_Change_Acumulated_Depr);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

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
