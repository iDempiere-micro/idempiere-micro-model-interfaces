package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctSchema_Default
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema_Default {

  /** TableName=C_AcctSchema_Default */
  String Table_Name = "C_AcctSchema_Default";

  /** AD_Table_ID=315 */
  int Table_ID = 315;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name B_Asset_Acct */
  String COLUMNNAME_B_Asset_Acct = "B_Asset_Acct";
  /** Column name B_InterestExp_Acct */
  String COLUMNNAME_B_InterestExp_Acct = "B_InterestExp_Acct";
  /** Column name B_InterestRev_Acct */
  String COLUMNNAME_B_InterestRev_Acct = "B_InterestRev_Acct";
  /** Column name B_InTransit_Acct */
  String COLUMNNAME_B_InTransit_Acct = "B_InTransit_Acct";
  /** Column name B_PaymentSelect_Acct */
  String COLUMNNAME_B_PaymentSelect_Acct = "B_PaymentSelect_Acct";
  /** Column name B_UnallocatedCash_Acct */
  String COLUMNNAME_B_UnallocatedCash_Acct = "B_UnallocatedCash_Acct";
  /** Column name C_AcctSchema_Default_UU */
  String COLUMNNAME_C_AcctSchema_Default_UU = "C_AcctSchema_Default_UU";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name CB_Asset_Acct */
  String COLUMNNAME_CB_Asset_Acct = "CB_Asset_Acct";
  /** Column name CB_CashTransfer_Acct */
  String COLUMNNAME_CB_CashTransfer_Acct = "CB_CashTransfer_Acct";
  /** Column name CB_Differences_Acct */
  String COLUMNNAME_CB_Differences_Acct = "CB_Differences_Acct";
  /** Column name CB_Expense_Acct */
  String COLUMNNAME_CB_Expense_Acct = "CB_Expense_Acct";
  /** Column name CB_Receipt_Acct */
  String COLUMNNAME_CB_Receipt_Acct = "CB_Receipt_Acct";
  /** Column name Ch_Expense_Acct */
  String COLUMNNAME_Ch_Expense_Acct = "Ch_Expense_Acct";
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
  /** Column name P_Asset_Acct */
  String COLUMNNAME_P_Asset_Acct = "P_Asset_Acct";
  /** Column name P_AverageCostVariance_Acct */
  String COLUMNNAME_P_AverageCostVariance_Acct = "P_AverageCostVariance_Acct";
  /** Column name PayDiscount_Exp_Acct */
  String COLUMNNAME_PayDiscount_Exp_Acct = "PayDiscount_Exp_Acct";
  /** Column name PayDiscount_Rev_Acct */
  String COLUMNNAME_PayDiscount_Rev_Acct = "PayDiscount_Rev_Acct";
  /** Column name P_COGS_Acct */
  String COLUMNNAME_P_COGS_Acct = "P_COGS_Acct";
  /** Column name P_CostAdjustment_Acct */
  String COLUMNNAME_P_CostAdjustment_Acct = "P_CostAdjustment_Acct";
  /** Column name P_Expense_Acct */
  String COLUMNNAME_P_Expense_Acct = "P_Expense_Acct";
  /** Column name P_InventoryClearing_Acct */
  String COLUMNNAME_P_InventoryClearing_Acct = "P_InventoryClearing_Acct";
  /** Column name P_InvoicePriceVariance_Acct */
  String COLUMNNAME_P_InvoicePriceVariance_Acct = "P_InvoicePriceVariance_Acct";
  /** Column name PJ_Asset_Acct */
  String COLUMNNAME_PJ_Asset_Acct = "PJ_Asset_Acct";
  /** Column name PJ_WIP_Acct */
  String COLUMNNAME_PJ_WIP_Acct = "PJ_WIP_Acct";
  /** Column name P_LandedCostClearing_Acct */
  String COLUMNNAME_P_LandedCostClearing_Acct = "P_LandedCostClearing_Acct";
  /** Column name P_PurchasePriceVariance_Acct */
  String COLUMNNAME_P_PurchasePriceVariance_Acct = "P_PurchasePriceVariance_Acct";
  /** Column name P_RateVariance_Acct */
  String COLUMNNAME_P_RateVariance_Acct = "P_RateVariance_Acct";
  /** Column name P_Revenue_Acct */
  String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name P_TradeDiscountGrant_Acct */
  String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
  /** Column name P_TradeDiscountRec_Acct */
  String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";
  /** Column name RealizedGain_Acct */
  String COLUMNNAME_RealizedGain_Acct = "RealizedGain_Acct";
  /** Column name RealizedLoss_Acct */
  String COLUMNNAME_RealizedLoss_Acct = "RealizedLoss_Acct";
  /** Column name T_Credit_Acct */
  String COLUMNNAME_T_Credit_Acct = "T_Credit_Acct";
  /** Column name T_Due_Acct */
  String COLUMNNAME_T_Due_Acct = "T_Due_Acct";
  /** Column name T_Expense_Acct */
  String COLUMNNAME_T_Expense_Acct = "T_Expense_Acct";
  /** Column name UnEarnedRevenue_Acct */
  String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
  /** Column name UnrealizedGain_Acct */
  String COLUMNNAME_UnrealizedGain_Acct = "UnrealizedGain_Acct";
  /** Column name UnrealizedLoss_Acct */
  String COLUMNNAME_UnrealizedLoss_Acct = "UnrealizedLoss_Acct";
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
  /** Column name W_Differences_Acct */
  String COLUMNNAME_W_Differences_Acct = "W_Differences_Acct";
  /** Column name WriteOff_Acct */
  String COLUMNNAME_WriteOff_Acct = "WriteOff_Acct";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Bank Asset. Bank Asset Account */
  int getB_Asset_Acct();

  /** Set Bank Asset. Bank Asset Account */
  void setB_Asset_Acct(int B_Asset_Acct);

  I_C_ValidCombination getB_Asset_A() throws RuntimeException;

  /** Get Bank Interest Expense. Bank Interest Expense Account */
  int getB_InterestExp_Acct();

  /** Set Bank Interest Expense. Bank Interest Expense Account */
  void setB_InterestExp_Acct(int B_InterestExp_Acct);

  I_C_ValidCombination getB_InterestExp_A() throws RuntimeException;

  /** Get Bank Interest Revenue. Bank Interest Revenue Account */
  int getB_InterestRev_Acct();

  /** Set Bank Interest Revenue. Bank Interest Revenue Account */
  void setB_InterestRev_Acct(int B_InterestRev_Acct);

  I_C_ValidCombination getB_InterestRev_A() throws RuntimeException;

  /** Get Bank In Transit. Bank In Transit Account */
  int getB_InTransit_Acct();

  /** Set Bank In Transit. Bank In Transit Account */
  void setB_InTransit_Acct(int B_InTransit_Acct);

  I_C_ValidCombination getB_InTransit_A() throws RuntimeException;

  /** Get Payment Selection. AP Payment Selection Clearing Account */
  int getB_PaymentSelect_Acct();

  /** Set Payment Selection. AP Payment Selection Clearing Account */
  void setB_PaymentSelect_Acct(int B_PaymentSelect_Acct);

  I_C_ValidCombination getB_PaymentSelect_A() throws RuntimeException;

  /** Get Unallocated Cash. Unallocated Cash Clearing Account */
  int getB_UnallocatedCash_Acct();

  /** Set Unallocated Cash. Unallocated Cash Clearing Account */
  void setB_UnallocatedCash_Acct(int B_UnallocatedCash_Acct);

  I_C_ValidCombination getB_UnallocatedCash_A() throws RuntimeException;

  /** Get C_AcctSchema_Default_UU */
  String getC_AcctSchema_Default_UU();

  /** Set C_AcctSchema_Default_UU */
  void setC_AcctSchema_Default_UU(String C_AcctSchema_Default_UU);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Cash Book Asset. Cash Book Asset Account */
  int getCB_Asset_Acct();

  /** Set Cash Book Asset. Cash Book Asset Account */
  void setCB_Asset_Acct(int CB_Asset_Acct);

  I_C_ValidCombination getCB_Asset_A() throws RuntimeException;

  /** Get Cash Transfer. Cash Transfer Clearing Account */
  int getCB_CashTransfer_Acct();

  /** Set Cash Transfer. Cash Transfer Clearing Account */
  void setCB_CashTransfer_Acct(int CB_CashTransfer_Acct);

  I_C_ValidCombination getCB_CashTransfer_A() throws RuntimeException;

  /** Get Cash Book Differences. Cash Book Differences Account */
  int getCB_Differences_Acct();

  /** Set Cash Book Differences. Cash Book Differences Account */
  void setCB_Differences_Acct(int CB_Differences_Acct);

  I_C_ValidCombination getCB_Differences_A() throws RuntimeException;

  /** Get Cash Book Expense. Cash Book Expense Account */
  int getCB_Expense_Acct();

  /** Set Cash Book Expense. Cash Book Expense Account */
  void setCB_Expense_Acct(int CB_Expense_Acct);

  I_C_ValidCombination getCB_Expense_A() throws RuntimeException;

  /** Get Cash Book Receipt. Cash Book Receipts Account */
  int getCB_Receipt_Acct();

  /** Set Cash Book Receipt. Cash Book Receipts Account */
  void setCB_Receipt_Acct(int CB_Receipt_Acct);

  I_C_ValidCombination getCB_Receipt_A() throws RuntimeException;

  /** Get Charge Account. Charge Account */
  int getCh_Expense_Acct();

  /** Set Charge Account. Charge Account */
  void setCh_Expense_Acct(int Ch_Expense_Acct);

  I_C_ValidCombination getCh_Expense_A() throws RuntimeException;

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

  /** Get Product Asset. Account for Product Asset (Inventory) */
  int getP_Asset_Acct();

  /** Set Product Asset. Account for Product Asset (Inventory) */
  void setP_Asset_Acct(int P_Asset_Acct);

  I_C_ValidCombination getP_Asset_A() throws RuntimeException;

  /** Get Average Cost Variance. Average Cost Variance */
  int getP_AverageCostVariance_Acct();

  /** Set Average Cost Variance. Average Cost Variance */
  void setP_AverageCostVariance_Acct(int P_AverageCostVariance_Acct);

  I_C_ValidCombination getP_AverageCostVariance_A() throws RuntimeException;

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

  /** Get Product COGS. Account for Cost of Goods Sold */
  int getP_COGS_Acct();

  /** Set Product COGS. Account for Cost of Goods Sold */
  void setP_COGS_Acct(int P_COGS_Acct);

  I_C_ValidCombination getP_COGS_A() throws RuntimeException;

  /** Get Cost Adjustment. Product Cost Adjustment Account */
  int getP_CostAdjustment_Acct();

  /** Set Cost Adjustment. Product Cost Adjustment Account */
  void setP_CostAdjustment_Acct(int P_CostAdjustment_Acct);

  I_C_ValidCombination getP_CostAdjustment_A() throws RuntimeException;

  /** Get Product Expense. Account for Product Expense */
  int getP_Expense_Acct();

  /** Set Product Expense. Account for Product Expense */
  void setP_Expense_Acct(int P_Expense_Acct);

  I_C_ValidCombination getP_Expense_A() throws RuntimeException;

  /** Get Inventory Clearing. Product Inventory Clearing Account */
  int getP_InventoryClearing_Acct();

  /** Set Inventory Clearing. Product Inventory Clearing Account */
  void setP_InventoryClearing_Acct(int P_InventoryClearing_Acct);

  I_C_ValidCombination getP_InventoryClearing_A() throws RuntimeException;

  /** Get Invoice Price Variance. Difference between Costs and Invoice Price (IPV) */
  int getP_InvoicePriceVariance_Acct();

  /** Set Invoice Price Variance. Difference between Costs and Invoice Price (IPV) */
  void setP_InvoicePriceVariance_Acct(int P_InvoicePriceVariance_Acct);

  I_C_ValidCombination getP_InvoicePriceVariance_A() throws RuntimeException;

  /** Get Project Asset. Project Asset Account */
  int getPJ_Asset_Acct();

  /** Set Project Asset. Project Asset Account */
  void setPJ_Asset_Acct(int PJ_Asset_Acct);

  I_C_ValidCombination getPJ_Asset_A() throws RuntimeException;

  /** Get Work In Progress. Account for Work in Progress */
  int getPJ_WIP_Acct();

  /** Set Work In Progress. Account for Work in Progress */
  void setPJ_WIP_Acct(int PJ_WIP_Acct);

  I_C_ValidCombination getPJ_WIP_A() throws RuntimeException;

  /** Get Landed Cost Clearing. Product Landed Cost Clearing Account */
  int getP_LandedCostClearing_Acct();

  /** Set Landed Cost Clearing. Product Landed Cost Clearing Account */
  void setP_LandedCostClearing_Acct(int P_LandedCostClearing_Acct);

  I_C_ValidCombination getP_LandedCostClearing_A() throws RuntimeException;

  /** Get Purchase Price Variance. Difference between Standard Cost and Purchase Price (PPV) */
  int getP_PurchasePriceVariance_Acct();

  /** Set Purchase Price Variance. Difference between Standard Cost and Purchase Price (PPV) */
  void setP_PurchasePriceVariance_Acct(int P_PurchasePriceVariance_Acct);

  I_C_ValidCombination getP_PurchasePriceVariance_A() throws RuntimeException;

  /** Get Rate Variance. The Rate Variance account is the account used Manufacturing Order */
  int getP_RateVariance_Acct();

  /** Set Rate Variance. The Rate Variance account is the account used Manufacturing Order */
  void setP_RateVariance_Acct(int P_RateVariance_Acct);

  I_C_ValidCombination getP_RateVariance_A() throws RuntimeException;

  /** Get Product Revenue. Account for Product Revenue (Sales Account) */
  int getP_Revenue_Acct();

  /** Set Product Revenue. Account for Product Revenue (Sales Account) */
  void setP_Revenue_Acct(int P_Revenue_Acct);

  I_C_ValidCombination getP_Revenue_A() throws RuntimeException;

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Trade Discount Granted. Trade Discount Granted Account */
  int getP_TradeDiscountGrant_Acct();

  /** Set Trade Discount Granted. Trade Discount Granted Account */
  void setP_TradeDiscountGrant_Acct(int P_TradeDiscountGrant_Acct);

  I_C_ValidCombination getP_TradeDiscountGrant_A() throws RuntimeException;

  /** Get Trade Discount Received. Trade Discount Receivable Account */
  int getP_TradeDiscountRec_Acct();

  /** Set Trade Discount Received. Trade Discount Receivable Account */
  void setP_TradeDiscountRec_Acct(int P_TradeDiscountRec_Acct);

  I_C_ValidCombination getP_TradeDiscountRec_A() throws RuntimeException;

  /** Get Realized Gain Acct. Realized Gain Account */
  int getRealizedGain_Acct();

  /** Set Realized Gain Acct. Realized Gain Account */
  void setRealizedGain_Acct(int RealizedGain_Acct);

  I_C_ValidCombination getRealizedGain_A() throws RuntimeException;

  /** Get Realized Loss Acct. Realized Loss Account */
  int getRealizedLoss_Acct();

  /** Set Realized Loss Acct. Realized Loss Account */
  void setRealizedLoss_Acct(int RealizedLoss_Acct);

  I_C_ValidCombination getRealizedLoss_A() throws RuntimeException;

  /** Get Tax Credit. Account for Tax you can reclaim */
  int getT_Credit_Acct();

  /** Set Tax Credit. Account for Tax you can reclaim */
  void setT_Credit_Acct(int T_Credit_Acct);

  I_C_ValidCombination getT_Credit_A() throws RuntimeException;

  /** Get Tax Due. Account for Tax you have to pay */
  int getT_Due_Acct();

  /** Set Tax Due. Account for Tax you have to pay */
  void setT_Due_Acct(int T_Due_Acct);

  I_C_ValidCombination getT_Due_A() throws RuntimeException;

  /** Get Tax Expense. Account for paid tax you cannot reclaim */
  int getT_Expense_Acct();

  /** Set Tax Expense. Account for paid tax you cannot reclaim */
  void setT_Expense_Acct(int T_Expense_Acct);

  I_C_ValidCombination getT_Expense_A() throws RuntimeException;

  /** Get Unearned Revenue. Account for unearned revenue */
  int getUnEarnedRevenue_Acct();

  /** Set Unearned Revenue. Account for unearned revenue */
  void setUnEarnedRevenue_Acct(int UnEarnedRevenue_Acct);

  I_C_ValidCombination getUnEarnedRevenue_A() throws RuntimeException;

  /** Get Unrealized Gain Acct. Unrealized Gain Account for currency revaluation */
  int getUnrealizedGain_Acct();

  /** Set Unrealized Gain Acct. Unrealized Gain Account for currency revaluation */
  void setUnrealizedGain_Acct(int UnrealizedGain_Acct);

  I_C_ValidCombination getUnrealizedGain_A() throws RuntimeException;

  /** Get Unrealized Loss Acct. Unrealized Loss Account for currency revaluation */
  int getUnrealizedLoss_Acct();

  /** Set Unrealized Loss Acct. Unrealized Loss Account for currency revaluation */
  void setUnrealizedLoss_Acct(int UnrealizedLoss_Acct);

  I_C_ValidCombination getUnrealizedLoss_A() throws RuntimeException;

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

  /** Get Warehouse Differences. Warehouse Differences Account */
  int getW_Differences_Acct();

  /** Set Warehouse Differences. Warehouse Differences Account */
  void setW_Differences_Acct(int W_Differences_Acct);

  I_C_ValidCombination getW_Differences_A() throws RuntimeException;

  /** Get Write-off. Account for Receivables write-off */
  int getWriteOff_Acct();

  /** Set Write-off. Account for Receivables write-off */
  void setWriteOff_Acct(int WriteOff_Acct);

  I_C_ValidCombination getWriteOff_A() throws RuntimeException;
}
