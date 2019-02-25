package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for A_Depreciation_Workfile
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Workfile {

    /**
     * TableName=A_Depreciation_Workfile
     */
    String Table_Name = "A_Depreciation_Workfile";

    /**
     * AD_Table_ID=53116
     */
    int Table_ID = 53116;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);



    /**
     * Column name A_Accumulated_Depr
     */
    String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
    /**
     * Column name A_Accumulated_Depr_F
     */
    String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
    /**
     * Column name A_Asset_Cost
     */
    String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Life_Years
     */
    String COLUMNNAME_A_Asset_Life_Years = "A_Asset_Life_Years";
    /**
     * Column name A_Asset_Life_Years_F
     */
    String COLUMNNAME_A_Asset_Life_Years_F = "A_Asset_Life_Years_F";
    /**
     * Column name A_Asset_Remaining
     */
    String COLUMNNAME_A_Asset_Remaining = "A_Asset_Remaining";
    /**
     * Column name A_Asset_Remaining_F
     */
    String COLUMNNAME_A_Asset_Remaining_F = "A_Asset_Remaining_F";
    /**
     * Column name A_Current_Period
     */
    String COLUMNNAME_A_Current_Period = "A_Current_Period";
    /**
     * Column name A_Depreciation_Workfile_ID
     */
    String COLUMNNAME_A_Depreciation_Workfile_ID = "A_Depreciation_Workfile_ID";
    /**
     * Column name A_FundingMode_ID
     */
    String COLUMNNAME_A_FundingMode_ID = "A_FundingMode_ID";
    /**
     * Column name A_Life_Period
     */
    String COLUMNNAME_A_Life_Period = "A_Life_Period";
    /**
     * Column name A_Life_Period_F
     */
    String COLUMNNAME_A_Life_Period_F = "A_Life_Period_F";
    /**
     * Column name A_Period_Posted
     */
    String COLUMNNAME_A_Period_Posted = "A_Period_Posted";
    /**
     * Column name A_QTY_Current
     */
    String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
    /**
     * Column name A_Salvage_Value
     */
    String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
    /**
     * Column name AssetDepreciationDate
     */
    String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
    /**
     * Column name A_Tip_Finantare
     */
    String COLUMNNAME_A_Tip_Finantare = "A_Tip_Finantare";
    /**
     * Column name A_Valoare_Cofinantare
     */
    String COLUMNNAME_A_Valoare_Cofinantare = "A_Valoare_Cofinantare";
    /**
     * Column name A_Valoare_Tert
     */
    String COLUMNNAME_A_Valoare_Tert = "A_Valoare_Tert";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name IsDepreciated
     */
    String COLUMNNAME_IsDepreciated = "IsDepreciated";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name UseLifeMonths_F
     */
    String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";
    /**
     * Column name UseLifeYears
     */
    String COLUMNNAME_UseLifeYears = "UseLifeYears";
    /**
     * Column name UseLifeYears_F
     */
    String COLUMNNAME_UseLifeYears_F = "UseLifeYears_F";

    /**
     * Get Accumulated Depreciation
     */
    BigDecimal getAccumulatedDepreciation();

    /**
     * Set Accumulated Depreciation
     */
    void setAccumulatedDepreciation(BigDecimal A_Accumulated_Depr);

    /**
     * Get Accumulated Depreciation (fiscal)
     */
    BigDecimal getAccumulatedDepreciationFiscal();

    /**
     * Set Accumulated Depreciation (fiscal)
     */
    void setAccumulatedDepreciationFiscal(BigDecimal A_Accumulated_Depr_F);

    /**
     * Get Asset Cost
     */
    BigDecimal getAssetCost();

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

    I_A_Asset getAAsset() throws RuntimeException;

    /**
     * Set Life Years
     */
    void setAssetLifeYears(int A_Asset_Life_Years);

    /**
     * Set Life Years (fiscal)
     */
    void setAssetLifeYearsFiscal(int A_Asset_Life_Years_F);

    /**
     * Get Remaining Amt
     */
    BigDecimal getAssetRemaining();

    /**
     * Set Remaining Amt
     */
    void setAssetRemaining(BigDecimal A_Asset_Remaining);

    /**
     * Get Remaining Amt (fiscal)
     */
    BigDecimal getAssetRemainingFiscal();

    /**
     * Set Remaining Amt (fiscal)
     */
    void setAssetRemainingFiscal(BigDecimal A_Asset_Remaining_F);

    /**
     * Get Current Period
     */
    int getCurrentPeriod();

    /**
     * Set Current Period
     */
    void setCurrentPeriod(int A_Current_Period);

    /**
     * Get Life Periods
     */
    int getLifePeriod();

    /**
     * Set Life Periods
     */
    void setLifePeriod(int A_Life_Period);

    /**
     * Set Life Period (fiscal)
     */
    void setLifePeriodFiscal(int A_Life_Period_F);

    /**
     * Set A_Period_Posted
     */
    void setPeriodPosted(int A_Period_Posted);

    /**
     * Set Current Qty
     */
    void setQtyCurrent(BigDecimal A_QTY_Current);

    /**
     * Get Asset Salvage Value
     */
    BigDecimal getSalvageValue();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

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
     * Get Usable Life - Months. Months of the usable life of the asset
     */
    int getUseLifeMonths();

    /**
     * Set Usable Life - Months. Months of the usable life of the asset
     */
    void setUseLifeMonths(int UseLifeMonths);

    /**
     * Get Use Life - Months (fiscal)
     */
    int getUseLifeMonths_F();

    /**
     * Set Use Life - Months (fiscal)
     */
    void setUseLifeMonths_F(int UseLifeMonths_F);

    /**
     * Get Usable Life - Years. Years of the usable life of the asset
     */
    int getUseLifeYears();

    /**
     * Set Usable Life - Years. Years of the usable life of the asset
     */
    void setUseLifeYears(int UseLifeYears);

    /**
     * Get Use Life - Years (fiscal)
     */
    int getUseLifeYearsFiscal();

    /**
     * Set Use Life - Years (fiscal)
     */
    void setUseLifeYearsFiscal(int UseLifeYears_F);
}
