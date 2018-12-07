package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaymentBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentBatch {

  /** TableName=C_PaymentBatch */
  String Table_Name = "C_PaymentBatch";

  /** AD_Table_ID=411 */
  int Table_ID = 411;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_PaymentBatch_ID */
  String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
  /** Column name C_PaymentBatch_UU */
  String COLUMNNAME_C_PaymentBatch_UU = "C_PaymentBatch_UU";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProcessingDate */
  String COLUMNNAME_ProcessingDate = "ProcessingDate";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Payment Batch. Payment batch for EFT */
  int getC_PaymentBatch_ID();

  /** Set Payment Batch. Payment batch for EFT */
  void setC_PaymentBatch_ID(int C_PaymentBatch_ID);

  /** Get C_PaymentBatch_UU */
  String getC_PaymentBatch_UU();

  /** Set C_PaymentBatch_UU */
  void setC_PaymentBatch_UU(String C_PaymentBatch_UU);

  /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

  /** Set Payment Processor. Payment processor for electronic payments */
  void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

  I_C_PaymentProcessor getC_PaymentProcessor() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Processing date */
  Timestamp getProcessingDate();

  /** Set Processing date */
  void setProcessingDate(Timestamp ProcessingDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
