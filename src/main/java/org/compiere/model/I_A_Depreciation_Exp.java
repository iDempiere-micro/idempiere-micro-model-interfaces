package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for A_Depreciation_Exp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Exp extends IPO {

    /**
     * TableName=A_Depreciation_Exp
     */
    String Table_Name = "A_Depreciation_Exp";

    /**
     * AD_Table_ID=53115
     */
    int Table_ID = 53115;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Account_Number_Acct
     */
    String COLUMNNAME_A_Account_Number_Acct = "A_Account_Number_Acct";
    /**
     * Column name A_Accumulated_Depr
     */
    String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
    /**
     * Column name A_Accumulated_Depr_Delta
     */
    String COLUMNNAME_A_Accumulated_Depr_Delta = "A_Accumulated_Depr_Delta";
    /**
     * Column name A_Accumulated_Depr_F
     */
    String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
    /**
     * Column name A_Accumulated_Depr_F_Delta
     */
    String COLUMNNAME_A_Accumulated_Depr_F_Delta = "A_Accumulated_Depr_F_Delta";
    /**
     * Column name A_Asset_Addition_ID
     */
    String COLUMNNAME_A_Asset_Addition_ID = "A_Asset_Addition_ID";
    /**
     * Column name A_Asset_Cost
     */
    String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
    /**
     * Column name A_Asset_Disposed_ID
     */
    String COLUMNNAME_A_Asset_Disposed_ID = "A_Asset_Disposed_ID";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Remaining
     */
    String COLUMNNAME_A_Asset_Remaining = "A_Asset_Remaining";
    /**
     * Column name A_Asset_Remaining_F
     */
    String COLUMNNAME_A_Asset_Remaining_F = "A_Asset_Remaining_F";
    /**
     * Column name A_Depreciation_Entry_ID
     */
    String COLUMNNAME_A_Depreciation_Entry_ID = "A_Depreciation_Entry_ID";
    /**
     * Column name A_Depreciation_Exp_ID
     */
    String COLUMNNAME_A_Depreciation_Exp_ID = "A_Depreciation_Exp_ID";
    /**
     * Column name A_Entry_Type
     */
    String COLUMNNAME_A_Entry_Type = "A_Entry_Type";
    /**
     * Column name A_Period
     */
    String COLUMNNAME_A_Period = "A_Period";
    /**
     * Column name CR_Account_ID
     */
    String COLUMNNAME_CR_Account_ID = "CR_Account_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DR_Account_ID
     */
    String COLUMNNAME_DR_Account_ID = "DR_Account_ID";
    /**
     * Column name Expense
     */
    String COLUMNNAME_Expense = "Expense";
    /**
     * Column name Expense_F
     */
    String COLUMNNAME_Expense_F = "Expense_F";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsDepreciated
     */
    String COLUMNNAME_IsDepreciated = "IsDepreciated";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name UseLifeMonths_F
     */
    String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

    /**
     * Set A_Account_Number_Acct
     */
    void setAccountNumberAcct(int A_Account_Number_Acct);

    /**
     * Get Accumulated Depreciation
     */
    BigDecimal getAccumulatedDepreciation();

    /**
     * Set Accumulated Depreciation
     */
    void setAccumulatedDepreciation(BigDecimal A_Accumulated_Depr);

    /**
     * Set Accumulated Depreciation (delta)
     */
    void setAccumulatedDepreciationDelta(BigDecimal A_Accumulated_Depr_Delta);

    /**
     * Get Accumulated Depreciation (fiscal)
     */
    BigDecimal getAccumulatedDepreciationFiscal();

    /**
     * Set Accumulated Depreciation (fiscal)
     */
    void setAccumulatedDepreciationFiscal(BigDecimal A_Accumulated_Depr_F);

    /**
     * Set Accumulated Depreciation - fiscal (delta)
     */
    void setAccumulatedDepreciationFiscalDelta(BigDecimal A_Accumulated_Depr_F_Delta);

    /**
     * Set Asset Cost
     */
    void setAssetCost(BigDecimal A_Asset_Cost);

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getAssetId();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setAssetId(int A_Asset_ID);

    /**
     * Set Remaining Amt
     */
    void setAssetRemaining(BigDecimal A_Asset_Remaining);

    /**
     * Set Remaining Amt (fiscal)
     */
    void setAssetRemainingFiscal(BigDecimal A_Asset_Remaining_F);

    /**
     * Get Depreciation Entry
     */
    int getDepreciationEntryId();

    /**
     * Get Entry Type
     */
    String getEntryType();

    /**
     * Set Entry Type
     */
    void setEntryType(String A_Entry_Type);

    /**
     * Get Asset Period
     */
    int getPeriod();

    /**
     * Set Asset Period
     */
    void setPeriod(int A_Period);

    /**
     * Set Account (credit). Account used
     */
    void setCRAccountId(int CR_Account_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Account (debit). Account used
     */
    void setDRAccountId(int DR_Account_ID);

    /**
     * Get Expense
     */
    BigDecimal getExpense();

    /**
     * Set Expense
     */
    void setExpense(BigDecimal Expense);

    /**
     * Get Expense (fiscal)
     */
    BigDecimal getFiscalExpense();

    /**
     * Set Expense (fiscal)
     */
    void setFiscalExpense(BigDecimal Expense_F);

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Depreciate. The asset will be depreciated
     */
    void setIsDepreciated(boolean IsDepreciated);

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Usable Life - Months. Months of the usable life of the asset
     */
    void setUseLifeMonths(int UseLifeMonths);

    /**
     * Set Use Life - Months (fiscal)
     */
    void setUseLifeMonthsFiscal(int UseLifeMonths_F);
}
