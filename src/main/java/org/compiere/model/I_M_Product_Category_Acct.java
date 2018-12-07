package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_Category_Acct_UU
     */
    String COLUMNNAME_M_Product_Category_Acct_UU = "M_Product_Category_Acct_UU";
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
    String COLUMNNAME_P_PurchasePriceVariance_Acct =
            "P_PurchasePriceVariance_Acct";
    /**
     * Column name P_RateVariance_Acct
     */
    String COLUMNNAME_P_RateVariance_Acct = "P_RateVariance_Acct";
    /**
     * Column name P_Revenue_Acct
     */
    String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name P_TradeDiscountGrant_Acct
     */
    String COLUMNNAME_P_TradeDiscountGrant_Acct = "P_TradeDiscountGrant_Acct";
    /**
     * Column name P_TradeDiscountRec_Acct
     */
    String COLUMNNAME_P_TradeDiscountRec_Acct = "P_TradeDiscountRec_Acct";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /**
     * Get Costing Level. The lowest level to accumulate Costing Information
     */
    String getCostingLevel();

    /**
     * Set Costing Level. The lowest level to accumulate Costing Information
     */
    void setCostingLevel(String CostingLevel);

    /**
     * Get Costing Method. Indicates how Costs will be calculated
     */
    String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    void setCostingMethod(String CostingMethod);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get M_Product_Category_Acct_UU
     */
    String getM_Product_Category_Acct_UU();

    /**
     * Set M_Product_Category_Acct_UU
     */
    void setM_Product_Category_Acct_UU(String M_Product_Category_Acct_UU);

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /**
     * Get Product Asset. Account for Product Asset (Inventory)
     */
    int getP_Asset_Acct();

    /**
     * Set Product Asset. Account for Product Asset (Inventory)
     */
    void setP_Asset_Acct(int P_Asset_Acct);

    I_C_ValidCombination getP_Asset_A() throws RuntimeException;

    /**
     * Get Average Cost Variance. Average Cost Variance
     */
    int getP_AverageCostVariance_Acct();

    /**
     * Set Average Cost Variance. Average Cost Variance
     */
    void setP_AverageCostVariance_Acct(int P_AverageCostVariance_Acct);

    I_C_ValidCombination getP_AverageCostVariance_A() throws RuntimeException;

    /**
     * Get Product COGS. Account for Cost of Goods Sold
     */
    int getP_COGS_Acct();

    /**
     * Set Product COGS. Account for Cost of Goods Sold
     */
    void setP_COGS_Acct(int P_COGS_Acct);

    I_C_ValidCombination getP_COGS_A() throws RuntimeException;

    /**
     * Get Cost Adjustment. Product Cost Adjustment Account
     */
    int getP_CostAdjustment_Acct();

    /**
     * Set Cost Adjustment. Product Cost Adjustment Account
     */
    void setP_CostAdjustment_Acct(int P_CostAdjustment_Acct);

    I_C_ValidCombination getP_CostAdjustment_A() throws RuntimeException;

    /**
     * Get Product Expense. Account for Product Expense
     */
    int getP_Expense_Acct();

    /**
     * Set Product Expense. Account for Product Expense
     */
    void setP_Expense_Acct(int P_Expense_Acct);

    I_C_ValidCombination getP_Expense_A() throws RuntimeException;

    /**
     * Get Inventory Clearing. Product Inventory Clearing Account
     */
    int getP_InventoryClearing_Acct();

    /**
     * Set Inventory Clearing. Product Inventory Clearing Account
     */
    void setP_InventoryClearing_Acct(int P_InventoryClearing_Acct);

    I_C_ValidCombination getP_InventoryClearing_A() throws RuntimeException;

    /**
     * Get Invoice Price Variance. Difference between Costs and Invoice Price (IPV)
     */
    int getP_InvoicePriceVariance_Acct();

    /**
     * Set Invoice Price Variance. Difference between Costs and Invoice Price (IPV)
     */
    void setP_InvoicePriceVariance_Acct(int P_InvoicePriceVariance_Acct);

    I_C_ValidCombination getP_InvoicePriceVariance_A() throws RuntimeException;

    /**
     * Get Landed Cost Clearing. Product Landed Cost Clearing Account
     */
    int getP_LandedCostClearing_Acct();

    /**
     * Set Landed Cost Clearing. Product Landed Cost Clearing Account
     */
    void setP_LandedCostClearing_Acct(int P_LandedCostClearing_Acct);

    I_C_ValidCombination getP_LandedCostClearing_A() throws RuntimeException;

    /**
     * Get Purchase Price Variance. Difference between Standard Cost and Purchase Price (PPV)
     */
    int getP_PurchasePriceVariance_Acct();

    /**
     * Set Purchase Price Variance. Difference between Standard Cost and Purchase Price (PPV)
     */
    void setP_PurchasePriceVariance_Acct(int P_PurchasePriceVariance_Acct);

    I_C_ValidCombination getP_PurchasePriceVariance_A() throws RuntimeException;

    /**
     * Get Rate Variance. The Rate Variance account is the account used Manufacturing Order
     */
    int getP_RateVariance_Acct();

    /**
     * Set Rate Variance. The Rate Variance account is the account used Manufacturing Order
     */
    void setP_RateVariance_Acct(int P_RateVariance_Acct);

    I_C_ValidCombination getP_RateVariance_A() throws RuntimeException;

    /**
     * Get Product Revenue. Account for Product Revenue (Sales Account)
     */
    int getP_Revenue_Acct();

    /**
     * Set Product Revenue. Account for Product Revenue (Sales Account)
     */
    void setP_Revenue_Acct(int P_Revenue_Acct);

    I_C_ValidCombination getP_Revenue_A() throws RuntimeException;

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Trade Discount Granted. Trade Discount Granted Account
     */
    int getP_TradeDiscountGrant_Acct();

    /**
     * Set Trade Discount Granted. Trade Discount Granted Account
     */
    void setP_TradeDiscountGrant_Acct(int P_TradeDiscountGrant_Acct);

    I_C_ValidCombination getP_TradeDiscountGrant_A() throws RuntimeException;

    /**
     * Get Trade Discount Received. Trade Discount Receivable Account
     */
    int getP_TradeDiscountRec_Acct();

    /**
     * Set Trade Discount Received. Trade Discount Receivable Account
     */
    void setP_TradeDiscountRec_Acct(int P_TradeDiscountRec_Acct);

    I_C_ValidCombination getP_TradeDiscountRec_A() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
