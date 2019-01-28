package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_Acct {

  /** TableName=M_Product_Acct */
  String Table_Name = "M_Product_Acct";

  /** AD_Table_ID=273 */
  int Table_ID = 273;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /** Column name M_Product_Acct_UU */
  String COLUMNNAME_M_Product_Acct_UU = "M_Product_Acct_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name P_Asset_Acct */
  String COLUMNNAME_P_Asset_Acct = "P_Asset_Acct";
  /** Column name P_AverageCostVariance_Acct */
  String COLUMNNAME_P_AverageCostVariance_Acct = "P_AverageCostVariance_Acct";
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
  /** Column name P_LandedCostClearing_Acct */
  String COLUMNNAME_P_LandedCostClearing_Acct = "P_LandedCostClearing_Acct";
  /** Column name P_PurchasePriceVariance_Acct */
  String COLUMNNAME_P_PurchasePriceVariance_Acct = "P_PurchasePriceVariance_Acct";
  /** Column name P_RateVariance_Acct */
  String COLUMNNAME_P_RateVariance_Acct = "P_RateVariance_Acct";
  /** Column name P_Revenue_Acct */
  String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
  /** Column name P_TradeDiscountGrant_Acct */
  String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
  /** Column name P_TradeDiscountRec_Acct */
  String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";

    /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Product Asset. Account for Product Asset (Inventory) */
  int getP_Asset_Acct();

    /** Get Average Cost Variance. Average Cost Variance */
  int getP_AverageCostVariance_Acct();

    /** Get Product COGS. Account for Cost of Goods Sold */
  int getP_COGS_Acct();

    /** Get Cost Adjustment. Product Cost Adjustment Account */
  int getP_CostAdjustment_Acct();

    /** Get Product Expense. Account for Product Expense */
  int getP_Expense_Acct();

  /** Set Product Expense. Account for Product Expense */
  void setP_Expense_Acct(int P_Expense_Acct);

    /** Get Inventory Clearing. Product Inventory Clearing Account */
  int getP_InventoryClearing_Acct();

    /** Get Invoice Price Variance. Difference between Costs and Invoice Price (IPV) */
  int getP_InvoicePriceVariance_Acct();

    /** Get Landed Cost Clearing. Product Landed Cost Clearing Account */
  int getP_LandedCostClearing_Acct();

    /** Get Purchase Price Variance. Difference between Standard Cost and Purchase Price (PPV) */
  int getP_PurchasePriceVariance_Acct();

    /** Get Rate Variance. The Rate Variance account is the account used Manufacturing Order */
  int getP_RateVariance_Acct();

    /** Get Product Revenue. Account for Product Revenue (Sales Account) */
  int getP_Revenue_Acct();

  /** Set Product Revenue. Account for Product Revenue (Sales Account) */
  void setP_Revenue_Acct(int P_Revenue_Acct);

    /** Get Trade Discount Granted. Trade Discount Granted Account */
  int getP_TradeDiscountGrant_Acct();

    /** Get Trade Discount Received. Trade Discount Receivable Account */
  int getP_TradeDiscountRec_Acct();

}
