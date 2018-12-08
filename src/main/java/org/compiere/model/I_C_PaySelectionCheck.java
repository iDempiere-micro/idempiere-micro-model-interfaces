package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaySelectionCheck
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelectionCheck {

  /** TableName=C_PaySelectionCheck */
  String Table_Name = "C_PaySelectionCheck";

  /** AD_Table_ID=525 */
  int Table_ID = 525;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_BankAccount_ID */
  String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_PaySelectionCheck_ID */
  String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
  /** Column name C_PaySelectionCheck_UU */
  String COLUMNNAME_C_PaySelectionCheck_UU = "C_PaySelectionCheck_UU";
  /** Column name C_PaySelection_ID */
  String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsGeneratedDraft */
  String COLUMNNAME_IsGeneratedDraft = "IsGeneratedDraft";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsReceipt */
  String COLUMNNAME_IsReceipt = "IsReceipt";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WriteOffAmt */
  String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Bank Account. Bank Account of the Business Partner */
  int getC_BP_BankAccount_ID();

  /** Set Partner Bank Account. Bank Account of the Business Partner */
  void setC_BP_BankAccount_ID(int C_BP_BankAccount_ID);

  I_C_BP_BankAccount getC_BP_BankAccount() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Pay Selection Check. Payment Selection Check */
  int getC_PaySelectionCheck_ID();

  /** Set Pay Selection Check. Payment Selection Check */
  void setC_PaySelectionCheck_ID(int C_PaySelectionCheck_ID);

  /** Get C_PaySelectionCheck_UU */
  String getC_PaySelectionCheck_UU();

  /** Set C_PaySelectionCheck_UU */
  void setC_PaySelectionCheck_UU(String C_PaySelectionCheck_UU);

  /** Get Payment Selection. Payment Selection */
  int getC_PaySelection_ID();

  /** Set Payment Selection. Payment Selection */
  void setC_PaySelection_ID(int C_PaySelection_ID);

  I_C_PaySelection getC_PaySelection() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Generated Draft */
  void setIsGeneratedDraft(boolean IsGeneratedDraft);

  /** Get Generated Draft */
  boolean isGeneratedDraft();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Set Receipt. This is a sales transaction (receipt) */
  void setIsReceipt(boolean IsReceipt);

  /** Get Receipt. This is a sales transaction (receipt) */
  boolean isReceipt();

  /** Get Payment amount. Amount being paid */
  BigDecimal getPayAmt();

  /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. Quantity */
  int getQty();

  /** Set Quantity. Quantity */
  void setQty(int Qty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}
