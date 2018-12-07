package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DepositBatchLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatchLine {

  /** TableName=C_DepositBatchLine */
  String Table_Name = "C_DepositBatchLine";

  /** AD_Table_ID=200057 */
  int Table_ID = 200057;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_DepositBatch_ID */
  String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
  /** Column name C_DepositBatchLine_ID */
  String COLUMNNAME_C_DepositBatchLine_ID = "C_DepositBatchLine_ID";
  /** Column name C_DepositBatchLine_UU */
  String COLUMNNAME_C_DepositBatchLine_UU = "C_DepositBatchLine_UU";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
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

  /** Get Deposit Batch */
  int getC_DepositBatch_ID();

  /** Set Deposit Batch */
  void setC_DepositBatch_ID(int C_DepositBatch_ID);

  I_C_DepositBatch getC_DepositBatch() throws RuntimeException;

  /** Get Deposit Batch Line */
  int getC_DepositBatchLine_ID();

  /** Set Deposit Batch Line */
  void setC_DepositBatchLine_ID(int C_DepositBatchLine_ID);

  /** Get C_DepositBatchLine_UU */
  String getC_DepositBatchLine_UU();

  /** Set C_DepositBatchLine_UU */
  void setC_DepositBatchLine_UU(String C_DepositBatchLine_UU);

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Payment amount. Amount being paid */
  BigDecimal getPayAmt();

  /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

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
