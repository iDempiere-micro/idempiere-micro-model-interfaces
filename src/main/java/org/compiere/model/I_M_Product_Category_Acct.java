package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Product_Category_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_Category_Acct {

    /**
     * TableName=M_Product_Category_Acct
     */
    String Table_Name = "M_Product_Category_Acct";

    /**
     * AD_Table_ID=401
     */
    int Table_ID = 401;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CostingLevel
     */
    String COLUMNNAME_CostingLevel = "CostingLevel";
    /**
     * Column name CostingMethod
     */
    String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name P_Asset_Acct
     */
    String COLUMNNAME_P_Asset_Acct = "P_Asset_Acct";
    /**
     * Column name P_AverageCostVariance_Acct
     */
    String COLUMNNAME_P_AverageCostVariance_Acct = "P_AverageCostVariance_Acct";
    /**
     * Column name P_COGS_Acct
     */
    String COLUMNNAME_P_COGS_Acct = "P_COGS_Acct";
    /**
     * Column name P_CostAdjustment_Acct
     */
    String COLUMNNAME_P_CostAdjustment_Acct = "P_CostAdjustment_Acct";
    /**
     * Column name P_Expense_Acct
     */
    String COLUMNNAME_P_Expense_Acct = "P_Expense_Acct";
    /**
     * Column name P_InventoryClearing_Acct
     */
    String COLUMNNAME_P_InventoryClearing_Acct = "P_InventoryClearing_Acct";
    /**
     * Column name P_InvoicePriceVariance_Acct
     */
    String COLUMNNAME_P_InvoicePriceVariance_Acct = "P_InvoicePriceVariance_Acct";
    /**
     * Column name P_LandedCostClearing_Acct
     */
    String COLUMNNAME_P_LandedCostClearing_Acct = "P_LandedCostClearing_Acct";
    /**
     * Column name P_PurchasePriceVariance_Acct
     */
    String COLUMNNAME_P_PurchasePriceVariance_Acct = "P_PurchasePriceVariance_Acct";
    /**
     * Column name P_RateVariance_Acct
     */
    String COLUMNNAME_P_RateVariance_Acct = "P_RateVariance_Acct";
    /**
     * Column name P_Revenue_Acct
     */
    String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
    /**
     * Column name P_TradeDiscountGrant_Acct
     */
    String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
    /**
     * Column name P_TradeDiscountRec_Acct
     */
    String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Get Costing Level. The lowest level to accumulate Costing Information
     */
    String getCostingLevel();

    /**
     * Get Costing Method. Indicates how Costs will be calculated
     */
    String getCostingMethod();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

}
