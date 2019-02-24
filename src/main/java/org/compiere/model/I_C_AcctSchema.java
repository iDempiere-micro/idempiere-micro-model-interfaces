package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_AcctSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema {

    /**
     * TableName=C_AcctSchema
     */
    String Table_Name = "C_AcctSchema";

    /**
     * AD_Table_ID=265
     */
    int Table_ID = 265;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name AD_OrgOnly_ID
     */
    String COLUMNNAME_AD_OrgOnly_ID = "AD_OrgOnly_ID";
    /**
     * Column name AutoPeriodControl
     */
    String COLUMNNAME_AutoPeriodControl = "AutoPeriodControl";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CommitmentType
     */
    String COLUMNNAME_CommitmentType = "CommitmentType";
    /**
     * Column name CostingLevel
     */
    String COLUMNNAME_CostingLevel = "CostingLevel";
    /**
     * Column name CostingMethod
     */
    String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name GAAP
     */
    String COLUMNNAME_GAAP = "GAAP";
    /**
     * Column name HasAlias
     */
    String COLUMNNAME_HasAlias = "HasAlias";
    /**
     * Column name HasCombination
     */
    String COLUMNNAME_HasCombination = "HasCombination";
    /**
     * Column name IsAccrual
     */
    String COLUMNNAME_IsAccrual = "IsAccrual";
    /**
     * Column name IsAdjustCOGS
     */
    String COLUMNNAME_IsAdjustCOGS = "IsAdjustCOGS";
    /**
     * Column name IsAllowNegativePosting
     */
    String COLUMNNAME_IsAllowNegativePosting = "IsAllowNegativePosting";
    /**
     * Column name IsDiscountCorrectsTax
     */
    String COLUMNNAME_IsDiscountCorrectsTax = "IsDiscountCorrectsTax";
    /**
     * Column name IsExplicitCostAdjustment
     */
    String COLUMNNAME_IsExplicitCostAdjustment = "IsExplicitCostAdjustment";
    /**
     * Column name IsPostIfClearingEqual
     */
    String COLUMNNAME_IsPostIfClearingEqual = "IsPostIfClearingEqual";
    /**
     * Column name IsPostServices
     */
    String COLUMNNAME_IsPostServices = "IsPostServices";
    /**
     * Column name IsTradeDiscountPosted
     */
    String COLUMNNAME_IsTradeDiscountPosted = "IsTradeDiscountPosted";
    /**
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name Period_OpenFuture
     */
    String COLUMNNAME_Period_OpenFuture = "Period_OpenFuture";
    /**
     * Column name Period_OpenHistory
     */
    String COLUMNNAME_Period_OpenHistory = "Period_OpenHistory";
    /**
     * Column name Separator
     */
    String COLUMNNAME_Separator = "Separator";
    /**
     * Column name TaxCorrectionType
     */
    String COLUMNNAME_TaxCorrectionType = "TaxCorrectionType";

    /**
     * Get Only Organization. Create posting entries only for this organization
     */
    int getAD_OrgOnly_ID();

    /**
     * Set Only Organization. Create posting entries only for this organization
     */
    void setAD_OrgOnly_ID(int AD_OrgOnly_ID);

    /**
     * Get Automatic Period Control. If selected, the periods are automatically opened and closed
     */
    boolean isAutoPeriodControl();

    /**
     * Set Automatic Period Control. If selected, the periods are automatically opened and closed
     */
    void setAutoPeriodControl(boolean AutoPeriodControl);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Commitment Type. Create Commitment and/or Reservations for Budget Control
     */
    String getCommitmentType();

    /**
     * Set Commitment Type. Create Commitment and/or Reservations for Budget Control
     */
    void setCommitmentType(String CommitmentType);

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
     * Set Period. Period of the Calendar
     */
    void setC_Period_ID(int C_Period_ID);

    /**
     * Get GAAP. Generally Accepted Accounting Principles
     */
    String getGAAP();

    /**
     * Set GAAP. Generally Accepted Accounting Principles
     */
    void setGAAP(String GAAP);

    /**
     * Set Use Account Alias. Ability to select (partial) account combinations by an Alias
     */
    void setHasAlias(boolean HasAlias);

    /**
     * Set Use Account Combination Control. Combination of account elements are checked
     */
    void setHasCombination(boolean HasCombination);

    /**
     * Set Accrual. Indicates if Accrual or Cash Based accounting will be used
     */
    void setIsAccrual(boolean IsAccrual);

    /**
     * Get Accrual. Indicates if Accrual or Cash Based accounting will be used
     */
    boolean isAccrual();

    /**
     * Set Adjust COGS. Adjust Cost of Good Sold
     */
    void setIsAdjustCOGS(boolean IsAdjustCOGS);

    /**
     * Get Allow Negative Posting. Allow to post negative accounting values
     */
    boolean isAllowNegativePosting();

    /**
     * Set Correct tax for Discounts/Charges. Correct the tax for payment discount and charges
     */
    void setIsDiscountCorrectsTax(boolean IsDiscountCorrectsTax);

    /**
     * Get Correct tax for Discounts/Charges. Correct the tax for payment discount and charges
     */
    boolean isDiscountCorrectsTax();

    /**
     * Set Explicit Cost Adjustment. Post the cost adjustment explicitly
     */
    void setIsExplicitCostAdjustment(boolean IsExplicitCostAdjustment);

    /**
     * Get Explicit Cost Adjustment. Post the cost adjustment explicitly
     */
    boolean isExplicitCostAdjustment();

    /**
     * Get Post if Clearing Equal. This flag controls if Adempiere must post when clearing (transit)
     * and final accounts are the same
     */
    boolean isPostIfClearingEqual();

    /**
     * Set Post Services Separately. Differentiate between Services and Product Receivable/Payables
     */
    void setIsPostServices(boolean IsPostServices);

    /**
     * Get Post Services Separately. Differentiate between Services and Product Receivable/Payables
     */
    boolean isPostServices();

    /**
     * Set Post Trade Discount. Generate postings for trade discounts
     */
    void setIsTradeDiscountPosted(boolean IsTradeDiscountPosted);

    /**
     * Get Post Trade Discount. Generate postings for trade discounts
     */
    boolean isTradeDiscountPosted();

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    int getM_CostType_ID();

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    void setM_CostType_ID(int M_CostType_ID);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Future Days. Number of days to be able to post to a future date (based on system date)
     */
    int getPeriod_OpenFuture();

    /**
     * Set Future Days. Number of days to be able to post to a future date (based on system date)
     */
    void setPeriod_OpenFuture(int Period_OpenFuture);

    /**
     * Get History Days. Number of days to be able to post in the past (based on system date)
     */
    int getPeriod_OpenHistory();

    /**
     * Set History Days. Number of days to be able to post in the past (based on system date)
     */
    void setPeriod_OpenHistory(int Period_OpenHistory);

    /**
     * Get Element Separator. Element Separator
     */
    String getSeparator();

    /**
     * Set Element Separator. Element Separator
     */
    void setSeparator(String Separator);

    /**
     * Get Tax Correction. Type of Tax Correction
     */
    String getTaxCorrectionType();

    /**
     * Set Tax Correction. Type of Tax Correction
     */
    void setTaxCorrectionType(String TaxCorrectionType);

}
