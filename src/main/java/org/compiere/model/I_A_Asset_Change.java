package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for A_Asset_Change
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Change {

    /**
     * TableName=A_Asset_Change
     */
    String Table_Name = "A_Asset_Change";

    /**
     * AD_Table_ID=53133
     */
    int Table_ID = 53133;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Accumdepreciation_Acct
     */
    String COLUMNNAME_A_Accumdepreciation_Acct = "A_Accumdepreciation_Acct";
    /**
     * Column name A_Asset_Acct
     */
    String COLUMNNAME_A_Asset_Acct = "A_Asset_Acct";
    /**
     * Column name A_Asset_Acct_ID
     */
    String COLUMNNAME_A_Asset_Acct_ID = "A_Asset_Acct_ID";
    /**
     * Column name A_Asset_Addition_ID
     */
    String COLUMNNAME_A_Asset_Addition_ID = "A_Asset_Addition_ID";
    /**
     * Column name A_Asset_Change_ID
     */
    String COLUMNNAME_A_Asset_Change_ID = "A_Asset_Change_ID";
    /**
     * Column name A_Asset_Change_UU
     */
    String COLUMNNAME_A_Asset_Change_UU = "A_Asset_Change_UU";
    /**
     * Column name A_Asset_CreateDate
     */
    String COLUMNNAME_A_Asset_CreateDate = "A_Asset_CreateDate";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Retirement_ID
     */
    String COLUMNNAME_A_Asset_Retirement_ID = "A_Asset_Retirement_ID";
    /**
     * Column name A_Asset_RevalDate
     */
    String COLUMNNAME_A_Asset_RevalDate = "A_Asset_RevalDate";
    /**
     * Column name A_Asset_Spread_Type
     */
    String COLUMNNAME_A_Asset_Spread_Type = "A_Asset_Spread_Type";
    /**
     * Column name A_Depreciation_Acct
     */
    String COLUMNNAME_A_Depreciation_Acct = "A_Depreciation_Acct";
    /**
     * Column name A_Depreciation_Calc_Type
     */
    String COLUMNNAME_A_Depreciation_Calc_Type = "A_Depreciation_Calc_Type";
    /**
     * Column name A_Depreciation_Manual_Amount
     */
    String COLUMNNAME_A_Depreciation_Manual_Amount = "A_Depreciation_Manual_Amount";
    /**
     * Column name A_Depreciation_Manual_Period
     */
    String COLUMNNAME_A_Depreciation_Manual_Period = "A_Depreciation_Manual_Period";
    /**
     * Column name A_Depreciation_Table_Header_ID
     */
    String COLUMNNAME_A_Depreciation_Table_Header_ID = "A_Depreciation_Table_Header_ID";
    /**
     * Column name A_Depreciation_Variable_Perc
     */
    String COLUMNNAME_A_Depreciation_Variable_Perc = "A_Depreciation_Variable_Perc";
    /**
     * Column name A_Disposal_Loss
     */
    String COLUMNNAME_A_Disposal_Loss = "A_Disposal_Loss";
    /**
     * Column name A_Disposal_Loss_Acct
     */
    String COLUMNNAME_A_Disposal_Loss_Acct = "A_Disposal_Loss_Acct";
    /**
     * Column name A_Disposal_Revenue
     */
    String COLUMNNAME_A_Disposal_Revenue = "A_Disposal_Revenue";
    /**
     * Column name A_Disposal_Revenue_Acct
     */
    String COLUMNNAME_A_Disposal_Revenue_Acct = "A_Disposal_Revenue_Acct";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name A_Parent_Asset_ID
     */
    String COLUMNNAME_A_Parent_Asset_ID = "A_Parent_Asset_ID";
    /**
     * Column name A_Period_End
     */
    String COLUMNNAME_A_Period_End = "A_Period_End";
    /**
     * Column name A_Period_Start
     */
    String COLUMNNAME_A_Period_Start = "A_Period_Start";
    /**
     * Column name A_QTY_Current
     */
    String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
    /**
     * Column name A_QTY_Original
     */
    String COLUMNNAME_A_QTY_Original = "A_QTY_Original";
    /**
     * Column name A_Reval_Accumdep_Offset_Cur
     */
    String COLUMNNAME_A_Reval_Accumdep_Offset_Cur = "A_Reval_Accumdep_Offset_Cur";
    /**
     * Column name A_Reval_Accumdep_Offset_Prior
     */
    String COLUMNNAME_A_Reval_Accumdep_Offset_Prior = "A_Reval_Accumdep_Offset_Prior";
    /**
     * Column name A_Reval_Adep_Offset_Cur_Acct
     */
    String COLUMNNAME_A_Reval_Adep_Offset_Cur_Acct = "A_Reval_Adep_Offset_Cur_Acct";
    /**
     * Column name A_Reval_Adep_Offset_Prior_Acct
     */
    String COLUMNNAME_A_Reval_Adep_Offset_Prior_Acct = "A_Reval_Adep_Offset_Prior_Acct";
    /**
     * Column name A_Reval_Cal_Method
     */
    String COLUMNNAME_A_Reval_Cal_Method = "A_Reval_Cal_Method";
    /**
     * Column name A_Reval_Cost_Offset
     */
    String COLUMNNAME_A_Reval_Cost_Offset = "A_Reval_Cost_Offset";
    /**
     * Column name A_Reval_Cost_Offset_Acct
     */
    String COLUMNNAME_A_Reval_Cost_Offset_Acct = "A_Reval_Cost_Offset_Acct";
    /**
     * Column name A_Reval_Cost_Offset_Prior
     */
    String COLUMNNAME_A_Reval_Cost_Offset_Prior = "A_Reval_Cost_Offset_Prior";
    /**
     * Column name A_Reval_Cost_Offset_Prior_Acct
     */
    String COLUMNNAME_A_Reval_Cost_Offset_Prior_Acct = "A_Reval_Cost_Offset_Prior_Acct";
    /**
     * Column name A_Reval_Depexp_Offset
     */
    String COLUMNNAME_A_Reval_Depexp_Offset = "A_Reval_Depexp_Offset";
    /**
     * Column name A_Reval_Depexp_Offset_Acct
     */
    String COLUMNNAME_A_Reval_Depexp_Offset_Acct = "A_Reval_Depexp_Offset_Acct";
    /**
     * Column name A_Salvage_Value
     */
    String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
    /**
     * Column name A_Split_Percent
     */
    String COLUMNNAME_A_Split_Percent = "A_Split_Percent";
    /**
     * Column name AssetAccumDepreciationAmt
     */
    String COLUMNNAME_AssetAccumDepreciationAmt = "AssetAccumDepreciationAmt";
    /**
     * Column name AssetBookValueAmt
     */
    String COLUMNNAME_AssetBookValueAmt = "AssetBookValueAmt";
    /**
     * Column name AssetDepreciationDate
     */
    String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
    /**
     * Column name AssetDisposalDate
     */
    String COLUMNNAME_AssetDisposalDate = "AssetDisposalDate";
    /**
     * Column name AssetMarketValueAmt
     */
    String COLUMNNAME_AssetMarketValueAmt = "AssetMarketValueAmt";
    /**
     * Column name AssetServiceDate
     */
    String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
    /**
     * Column name AssetValueAmt
     */
    String COLUMNNAME_AssetValueAmt = "AssetValueAmt";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name ChangeAmt
     */
    String COLUMNNAME_ChangeAmt = "ChangeAmt";
    /**
     * Column name ChangeDate
     */
    String COLUMNNAME_ChangeDate = "ChangeDate";
    /**
     * Column name ChangeType
     */
    String COLUMNNAME_ChangeType = "ChangeType";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name ConventionType
     */
    String COLUMNNAME_ConventionType = "ConventionType";
    /**
     * Column name C_ValidCombination_ID
     */
    String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DepreciationType
     */
    String COLUMNNAME_DepreciationType = "DepreciationType";
    /**
     * Column name IsDepreciated
     */
    String COLUMNNAME_IsDepreciated = "IsDepreciated";
    /**
     * Column name IsDisposed
     */
    String COLUMNNAME_IsDisposed = "IsDisposed";
    /**
     * Column name IsFullyDepreciated
     */
    String COLUMNNAME_IsFullyDepreciated = "IsFullyDepreciated";
    /**
     * Column name IsInPosession
     */
    String COLUMNNAME_IsInPosession = "IsInPosession";
    /**
     * Column name IsOwned
     */
    String COLUMNNAME_IsOwned = "IsOwned";
    /**
     * Column name LifeUseUnits
     */
    String COLUMNNAME_LifeUseUnits = "LifeUseUnits";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";
    /**
     * Column name TextDetails
     */
    String COLUMNNAME_TextDetails = "TextDetails";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name UseLifeYears
     */
    String COLUMNNAME_UseLifeYears = "UseLifeYears";
    /**
     * Column name UseUnits
     */
    String COLUMNNAME_UseUnits = "UseUnits";
    /**
     * Column name VersionNo
     */
    String COLUMNNAME_VersionNo = "VersionNo";

    /**
     * Get Accumulated Depreciation Account
     */
    int getA_Accumdepreciation_Acct();

    /**
     * Get Asset Acct
     */
    int getA_Asset_Acct();

    /**
     * Get A_Asset_Change_ID
     */
    int getA_Asset_Change_ID();

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Get Spread Type
     */
    int getA_Asset_Spread_Type();

    /**
     * Get Depreciation Account
     */
    int getA_Depreciation_Acct();

    /**
     * Get Calculation Type
     */
    int getA_Depreciation_Calc_Type();

    /**
     * Get A_Depreciation_Table_Header_ID
     */
    int getA_Depreciation_Table_Header_ID();

    /**
     * Get Loss on Disposal
     */
    int getA_Disposal_Loss();

    /**
     * Get Disposal Loss Acct
     */
    int getA_Disposal_Loss_Acct();

    /**
     * Get Disposal Revenue
     */
    int getA_Disposal_Revenue();

    /**
     * Get Disposal Revenue Acct
     */
    int getA_Disposal_Revenue_Acct();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Get Parent Asset
     */
    int getA_Parent_Asset_ID();

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set ChangeType
     */
    void setChangeType(String ChangeType);

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Get ConventionType
     */
    int getConventionType();

    /**
     * Get Combination. Valid Account Combination
     */
    int getC_ValidCombination_ID();

    /**
     * Get DepreciationType
     */
    int getDepreciationType();

}
