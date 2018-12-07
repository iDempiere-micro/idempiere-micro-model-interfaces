package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Group_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Group_Acct {

  /** TableName=C_BP_Group_Acct */
  String Table_Name = "C_BP_Group_Acct";

  /** AD_Table_ID=395 */
  int Table_ID = 395;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_BP_Group_Acct_UU */
  String COLUMNNAME_C_BP_Group_Acct_UU = "C_BP_Group_Acct_UU";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_Prepayment_Acct */
  String COLUMNNAME_C_Prepayment_Acct = "C_Prepayment_Acct";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Receivable_Acct */
  String COLUMNNAME_C_Receivable_Acct = "C_Receivable_Acct";
  /** Column name C_Receivable_Services_Acct */
  String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name NotInvoicedReceipts_Acct */
  String COLUMNNAME_NotInvoicedReceipts_Acct = "NotInvoicedReceipts_Acct";
  /** Column name PayDiscount_Exp_Acct */
  String COLUMNNAME_PayDiscount_Exp_Acct = "PayDiscount_Exp_Acct";
  /** Column name PayDiscount_Rev_Acct */
  String COLUMNNAME_PayDiscount_Rev_Acct = "PayDiscount_Rev_Acct";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name UnEarnedRevenue_Acct */
  String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name V_Liability_Acct */
  String COLUMNNAME_V_Liability_Acct = "V_Liability_Acct";
  /** Column name V_Liability_Services_Acct */
  String COLUMNNAME_V_Liability_Services_Acct = "V_Liability_Services_Acct";
  /** Column name V_Prepayment_Acct */
  String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";
  /** Column name WriteOff_Acct */
  String COLUMNNAME_WriteOff_Acct = "WriteOff_Acct";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get C_BP_Group_Acct_UU */
  String getC_BP_Group_Acct_UU();

  /** Set C_BP_Group_Acct_UU */
  void setC_BP_Group_Acct_UU(String C_BP_Group_Acct_UU);

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Customer Prepayment. Account for customer prepayments */
  int getC_Prepayment_Acct();

  /** Set Customer Prepayment. Account for customer prepayments */
  void setC_Prepayment_Acct(int C_Prepayment_Acct);

  I_C_ValidCombination getC_Prepayment_A() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Customer Receivables. Account for Customer Receivables */
  int getC_Receivable_Acct();

  /** Set Customer Receivables. Account for Customer Receivables */
  void setC_Receivable_Acct(int C_Receivable_Acct);

  I_C_ValidCombination getC_Receivable_A() throws RuntimeException;

  /** Get Receivable Services. Customer Accounts Receivables Services Account */
  int getC_Receivable_Services_Acct();

  /** Set Receivable Services. Customer Accounts Receivables Services Account */
  void setC_Receivable_Services_Acct(int C_Receivable_Services_Acct);

  I_C_ValidCombination getC_Receivable_Services_A() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Not-invoiced Receipts. Account for not-invoiced Material Receipts */
  int getNotInvoicedReceipts_Acct();

  /** Set Not-invoiced Receipts. Account for not-invoiced Material Receipts */
  void setNotInvoicedReceipts_Acct(int NotInvoicedReceipts_Acct);

  I_C_ValidCombination getNotInvoicedReceipts_A() throws RuntimeException;

  /** Get Payment Discount Expense. Payment Discount Expense Account */
  int getPayDiscount_Exp_Acct();

  /** Set Payment Discount Expense. Payment Discount Expense Account */
  void setPayDiscount_Exp_Acct(int PayDiscount_Exp_Acct);

  I_C_ValidCombination getPayDiscount_Exp_A() throws RuntimeException;

  /** Get Payment Discount Revenue. Payment Discount Revenue Account */
  int getPayDiscount_Rev_Acct();

  /** Set Payment Discount Revenue. Payment Discount Revenue Account */
  void setPayDiscount_Rev_Acct(int PayDiscount_Rev_Acct);

  I_C_ValidCombination getPayDiscount_Rev_A() throws RuntimeException;

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Unearned Revenue. Account for unearned revenue */
  int getUnEarnedRevenue_Acct();

  /** Set Unearned Revenue. Account for unearned revenue */
  void setUnEarnedRevenue_Acct(int UnEarnedRevenue_Acct);

  I_C_ValidCombination getUnEarnedRevenue_A() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Vendor Liability. Account for Vendor Liability */
  int getV_Liability_Acct();

  /** Set Vendor Liability. Account for Vendor Liability */
  void setV_Liability_Acct(int V_Liability_Acct);

  I_C_ValidCombination getV_Liability_A() throws RuntimeException;

  /** Get Vendor Service Liability. Account for Vendor Service Liability */
  int getV_Liability_Services_Acct();

  /** Set Vendor Service Liability. Account for Vendor Service Liability */
  void setV_Liability_Services_Acct(int V_Liability_Services_Acct);

  I_C_ValidCombination getV_Liability_Services_A() throws RuntimeException;

  /** Get Vendor Prepayment. Account for Vendor Prepayments */
  int getV_Prepayment_Acct();

  /** Set Vendor Prepayment. Account for Vendor Prepayments */
  void setV_Prepayment_Acct(int V_Prepayment_Acct);

  I_C_ValidCombination getV_Prepayment_A() throws RuntimeException;

  /** Get Write-off. Account for Receivables write-off */
  int getWriteOff_Acct();

  /** Set Write-off. Account for Receivables write-off */
  void setWriteOff_Acct(int WriteOff_Acct);

  I_C_ValidCombination getWriteOff_A() throws RuntimeException;
}
