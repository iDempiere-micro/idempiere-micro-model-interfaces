package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

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
    String COLUMNNAME_A_Depreciation_Manual_Amount =
            "A_Depreciation_Manual_Amount";
    /**
     * Column name A_Depreciation_Manual_Period
     */
    String COLUMNNAME_A_Depreciation_Manual_Period =
            "A_Depreciation_Manual_Period";
    /**
     * Column name A_Depreciation_Table_Header_ID
     */
    String COLUMNNAME_A_Depreciation_Table_Header_ID =
            "A_Depreciation_Table_Header_ID";
    /**
     * Column name A_Depreciation_Variable_Perc
     */
    String COLUMNNAME_A_Depreciation_Variable_Perc =
            "A_Depreciation_Variable_Perc";
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
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
    String COLUMNNAME_A_Reval_Accumdep_Offset_Prior =
            "A_Reval_Accumdep_Offset_Prior";
    /**
     * Column name A_Reval_Adep_Offset_Cur_Acct
     */
    String COLUMNNAME_A_Reval_Adep_Offset_Cur_Acct =
            "A_Reval_Adep_Offset_Cur_Acct";
    /**
     * Column name A_Reval_Adep_Offset_Prior_Acct
     */
    String COLUMNNAME_A_Reval_Adep_Offset_Prior_Acct =
            "A_Reval_Adep_Offset_Prior_Acct";
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
    String COLUMNNAME_A_Reval_Cost_Offset_Prior_Acct =
            "A_Reval_Cost_Offset_Prior_Acct";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
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
     * Set Accumulated Depreciation Account
     */
    void setA_Accumdepreciation_Acct(int A_Accumdepreciation_Acct);

    I_C_ValidCombination getA_Accumdepreciation_A() throws RuntimeException;

    /**
     * Get Asset Acct
     */
    int getA_Asset_Acct();

    /**
     * Set Asset Acct
     */
    void setA_Asset_Acct(int A_Asset_Acct);

    I_C_ValidCombination getA_Asset_A() throws RuntimeException;

    /**
     * Get A_Asset_Acct_ID
     */
    int getA_Asset_Acct_ID();

    /**
     * Set A_Asset_Acct_ID
     */
    void setA_Asset_Acct_ID(int A_Asset_Acct_ID);

    /**
     * Get Asset Addition
     */
    int getA_Asset_Addition_ID();

    /**
     * Set Asset Addition
     */
    void setA_Asset_Addition_ID(int A_Asset_Addition_ID);

    /**
     * Get A_Asset_Change_ID
     */
    int getA_Asset_Change_ID();

    /**
     * Set A_Asset_Change_ID
     */
    void setA_Asset_Change_ID(int A_Asset_Change_ID);

    /**
     * Get A_Asset_Change_UU
     */
    String getA_Asset_Change_UU();

    /**
     * Set A_Asset_Change_UU
     */
    void setA_Asset_Change_UU(String A_Asset_Change_UU);

    /**
     * Get Create Date
     */
    Timestamp getA_Asset_CreateDate();

    /**
     * Set Create Date
     */
    void setA_Asset_CreateDate(Timestamp A_Asset_CreateDate);

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Get Asset Retirement. Internally used asset is not longer used.
     */
    int getA_Asset_Retirement_ID();

    /**
     * Set Asset Retirement. Internally used asset is not longer used.
     */
    void setA_Asset_Retirement_ID(int A_Asset_Retirement_ID);

    /**
     * Get Revaluation Date
     */
    Timestamp getA_Asset_RevalDate();

    /**
     * Set Revaluation Date
     */
    void setA_Asset_RevalDate(Timestamp A_Asset_RevalDate);

    /**
     * Get Spread Type
     */
    int getA_Asset_Spread_Type();

    /**
     * Set Spread Type
     */
    void setA_Asset_Spread_Type(int A_Asset_Spread_Type);

    I_A_Asset_Spread getA_Asset_Spread_T() throws RuntimeException;

    /**
     * Get Depreciation Account
     */
    int getA_Depreciation_Acct();

    /**
     * Set Depreciation Account
     */
    void setA_Depreciation_Acct(int A_Depreciation_Acct);

    I_C_ValidCombination getA_Depreciation_A() throws RuntimeException;

    /**
     * Get Calculation Type
     */
    int getA_Depreciation_Calc_Type();

    /**
     * Set Calculation Type
     */
    void setA_Depreciation_Calc_Type(int A_Depreciation_Calc_Type);

    I_A_Depreciation_Method getA_Depreciation_Calc_T() throws RuntimeException;

    /**
     * Get A_Depreciation_Manual_Amount
     */
    BigDecimal getA_Depreciation_Manual_Amount();

    /**
     * Set A_Depreciation_Manual_Amount
     */
    void setA_Depreciation_Manual_Amount(BigDecimal A_Depreciation_Manual_Amount);

    /**
     * Get A_Depreciation_Manual_Period
     */
    String getA_Depreciation_Manual_Period();

    /**
     * Set A_Depreciation_Manual_Period
     */
    void setA_Depreciation_Manual_Period(String A_Depreciation_Manual_Period);

    /**
     * Get A_Depreciation_Table_Header_ID
     */
    int getA_Depreciation_Table_Header_ID();

    /**
     * Set A_Depreciation_Table_Header_ID
     */
    void setA_Depreciation_Table_Header_ID(int A_Depreciation_Table_Header_ID);

    I_A_Depreciation_Table_Header getA_Depreciation_Table_Header() throws RuntimeException;

    /**
     * Get Variable Percent
     */
    BigDecimal getA_Depreciation_Variable_Perc();

    /**
     * Set Variable Percent
     */
    void setA_Depreciation_Variable_Perc(BigDecimal A_Depreciation_Variable_Perc);

    /**
     * Get Loss on Disposal
     */
    int getA_Disposal_Loss();

    /**
     * Set Loss on Disposal
     */
    void setA_Disposal_Loss(int A_Disposal_Loss);

    I_C_ValidCombination getA_Disposal_L() throws RuntimeException;

    /**
     * Get Disposal Loss Acct
     */
    int getA_Disposal_Loss_Acct();

    /**
     * Set Disposal Loss Acct
     */
    void setA_Disposal_Loss_Acct(int A_Disposal_Loss_Acct);

    I_C_ValidCombination getA_Disposal_Loss_A() throws RuntimeException;

    /**
     * Get Disposal Revenue
     */
    int getA_Disposal_Revenue();

    /**
     * Set Disposal Revenue
     */
    void setA_Disposal_Revenue(int A_Disposal_Revenue);

    I_C_ValidCombination getA_Disposal_Reve() throws RuntimeException;

    /**
     * Get Disposal Revenue Acct
     */
    int getA_Disposal_Revenue_Acct();

    /**
     * Set Disposal Revenue Acct
     */
    void setA_Disposal_Revenue_Acct(int A_Disposal_Revenue_Acct);

    I_C_ValidCombination getA_Disposal_Revenue_A() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Parent Asset
     */
    int getA_Parent_Asset_ID();

    /**
     * Set Parent Asset
     */
    void setA_Parent_Asset_ID(int A_Parent_Asset_ID);

    I_A_Asset getA_Parent_Asset() throws RuntimeException;

    /**
     * Get A_Period_End
     */
    int getA_Period_End();

    /**
     * Set A_Period_End
     */
    void setA_Period_End(int A_Period_End);

    /**
     * Get A_Period_Start
     */
    int getA_Period_Start();

    /**
     * Set A_Period_Start
     */
    void setA_Period_Start(int A_Period_Start);

    /**
     * Get Current Qty
     */
    BigDecimal getA_QTY_Current();

    /**
     * Set Current Qty
     */
    void setA_QTY_Current(BigDecimal A_QTY_Current);

    /**
     * Get A_QTY_Original
     */
    BigDecimal getA_QTY_Original();

    /**
     * Set A_QTY_Original
     */
    void setA_QTY_Original(BigDecimal A_QTY_Original);

    /**
     * Get Revaluation Accumulated Depreciation Offset for Current Year
     */
    int getA_Reval_Accumdep_Offset_Cur();

    /**
     * Set Revaluation Accumulated Depreciation Offset for Current Year
     */
    void setA_Reval_Accumdep_Offset_Cur(int A_Reval_Accumdep_Offset_Cur);

    /**
     * Get Revaluation Accumulated Depreciation Offset for Prior Year
     */
    int getA_Reval_Accumdep_Offset_Prior();

    /**
     * Set Revaluation Accumulated Depreciation Offset for Prior Year
     */
    void setA_Reval_Accumdep_Offset_Prior(int A_Reval_Accumdep_Offset_Prior);

    /**
     * Get A_Reval_Accumdep_Offset_Cur
     */
    int getA_Reval_Adep_Offset_Cur_Acct();

    /**
     * Set A_Reval_Accumdep_Offset_Cur
     */
    void setA_Reval_Adep_Offset_Cur_Acct(int A_Reval_Adep_Offset_Cur_Acct);

    /**
     * Get A_Reval_Accumdep_Offset_Prior
     */
    int getA_Reval_Adep_Offset_Prior_Acct();

    /**
     * Set A_Reval_Accumdep_Offset_Prior
     */
    void setA_Reval_Adep_Offset_Prior_Acct(int A_Reval_Adep_Offset_Prior_Acct);

    /**
     * Get A_Reval_Cal_Method
     */
    String getA_Reval_Cal_Method();

    /**
     * Set A_Reval_Cal_Method
     */
    void setA_Reval_Cal_Method(String A_Reval_Cal_Method);

    /**
     * Get Revaluation Cost Offset for Current Year
     */
    int getA_Reval_Cost_Offset();

    /**
     * Set Revaluation Cost Offset for Current Year
     */
    void setA_Reval_Cost_Offset(int A_Reval_Cost_Offset);

    /**
     * Get Reval Cost Offset Acct
     */
    int getA_Reval_Cost_Offset_Acct();

    /**
     * Set Reval Cost Offset Acct
     */
    void setA_Reval_Cost_Offset_Acct(int A_Reval_Cost_Offset_Acct);

    /**
     * Get Revaluation Cost Offset for Prior Year
     */
    int getA_Reval_Cost_Offset_Prior();

    /**
     * Set Revaluation Cost Offset for Prior Year
     */
    void setA_Reval_Cost_Offset_Prior(int A_Reval_Cost_Offset_Prior);

    /**
     * Get Reval Cost Offset Prior Acct
     */
    int getA_Reval_Cost_Offset_Prior_Acct();

    /**
     * Set Reval Cost Offset Prior Acct
     */
    void setA_Reval_Cost_Offset_Prior_Acct(int A_Reval_Cost_Offset_Prior_Acct);

    /**
     * Get Revaluation Expense Offs
     */
    int getA_Reval_Depexp_Offset();

    /**
     * Set Revaluation Expense Offs
     */
    void setA_Reval_Depexp_Offset(int A_Reval_Depexp_Offset);

    /**
     * Get Reval Depexp Offset Acct
     */
    int getA_Reval_Depexp_Offset_Acct();

    /**
     * Set Reval Depexp Offset Acct
     */
    void setA_Reval_Depexp_Offset_Acct(int A_Reval_Depexp_Offset_Acct);

    /**
     * Get Asset Salvage Value
     */
    BigDecimal getA_Salvage_Value();

    /**
     * Set Asset Salvage Value
     */
    void setA_Salvage_Value(BigDecimal A_Salvage_Value);

    /**
     * Get Split Percent
     */
    BigDecimal getA_Split_Percent();

    /**
     * Set Split Percent
     */
    void setA_Split_Percent(BigDecimal A_Split_Percent);

    /**
     * Get AssetAccumDepreciationAmt
     */
    BigDecimal getAssetAccumDepreciationAmt();

    /**
     * Set AssetAccumDepreciationAmt
     */
    void setAssetAccumDepreciationAmt(BigDecimal AssetAccumDepreciationAmt);

    /**
     * Get AssetBookValueAmt
     */
    BigDecimal getAssetBookValueAmt();

    /**
     * Set AssetBookValueAmt
     */
    void setAssetBookValueAmt(BigDecimal AssetBookValueAmt);

    /**
     * Get Asset Depreciation Date. Date of last depreciation
     */
    Timestamp getAssetDepreciationDate();

    /**
     * Set Asset Depreciation Date. Date of last depreciation
     */
    void setAssetDepreciationDate(Timestamp AssetDepreciationDate);

    /**
     * Get Asset Disposal Date. Date when the asset is/was disposed
     */
    Timestamp getAssetDisposalDate();

    /**
     * Set Asset Disposal Date. Date when the asset is/was disposed
     */
    void setAssetDisposalDate(Timestamp AssetDisposalDate);

    /**
     * Get Market value Amount. Market value of the asset
     */
    BigDecimal getAssetMarketValueAmt();

    /**
     * Set Market value Amount. Market value of the asset
     */
    void setAssetMarketValueAmt(BigDecimal AssetMarketValueAmt);

    /**
     * Get In Service Date. Date when Asset was put into service
     */
    Timestamp getAssetServiceDate();

    /**
     * Set In Service Date. Date when Asset was put into service
     */
    void setAssetServiceDate(Timestamp AssetServiceDate);

    /**
     * Get Asset value. Book Value of the asset
     */
    BigDecimal getAssetValueAmt();

    /**
     * Set Asset value. Book Value of the asset
     */
    void setAssetValueAmt(BigDecimal AssetValueAmt);

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
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get ChangeAmt
     */
    BigDecimal getChangeAmt();

    /**
     * Set ChangeAmt
     */
    void setChangeAmt(BigDecimal ChangeAmt);

    /**
     * Get ChangeDate
     */
    Timestamp getChangeDate();

    /**
     * Set ChangeDate
     */
    void setChangeDate(Timestamp ChangeDate);

    /**
     * Get ChangeType
     */
    String getChangeType();

    /**
     * Set ChangeType
     */
    void setChangeType(String ChangeType);

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Set Address. Location or Address
     */
    void setC_Location_ID(int C_Location_ID);

    I_C_Location getC_Location() throws RuntimeException;

    /**
     * Get ConventionType
     */
    int getConventionType();

    /**
     * Set ConventionType
     */
    void setConventionType(int ConventionType);

    I_A_Depreciation_Convention getConventionT() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Combination. Valid Account Combination
     */
    int getC_ValidCombination_ID();

    /**
     * Set Combination. Valid Account Combination
     */
    void setC_ValidCombination_ID(int C_ValidCombination_ID);

    I_C_ValidCombination getC_ValidCombination() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get DepreciationType
     */
    int getDepreciationType();

    /**
     * Set DepreciationType
     */
    void setDepreciationType(int DepreciationType);

    I_A_Depreciation getDepreciationT() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Depreciate. The asset will be depreciated
     */
    void setIsDepreciated(boolean IsDepreciated);

    /**
     * Get Depreciate. The asset will be depreciated
     */
    boolean isDepreciated();

    /**
     * Set Disposed. The asset is disposed
     */
    void setIsDisposed(boolean IsDisposed);

    /**
     * Get Disposed. The asset is disposed
     */
    boolean isDisposed();

    /**
     * Set Fully depreciated. The asset is fully depreciated
     */
    void setIsFullyDepreciated(boolean IsFullyDepreciated);

    /**
     * Get Fully depreciated. The asset is fully depreciated
     */
    boolean isFullyDepreciated();

    /**
     * Set In Possession. The asset is in the possession of the organization
     */
    void setIsInPosession(boolean IsInPosession);

    /**
     * Get In Possession. The asset is in the possession of the organization
     */
    boolean isInPosession();

    /**
     * Set Owned. The asset is owned by the organization
     */
    void setIsOwned(boolean IsOwned);

    /**
     * Get Owned. The asset is owned by the organization
     */
    boolean isOwned();

    /**
     * Get Life use. Units of use until the asset is not usable anymore
     */
    int getLifeUseUnits();

    /**
     * Set Life use. Units of use until the asset is not usable anymore
     */
    void setLifeUseUnits(int LifeUseUnits);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

    /**
     * Set Serial No. Product Serial Number
     */
    void setSerNo(String SerNo);

    /**
     * Get Details
     */
    String getTextDetails();

    /**
     * Set Details
     */
    void setTextDetails(String TextDetails);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Usable Life - Months. Months of the usable life of the asset
     */
    int getUseLifeMonths();

    /**
     * Set Usable Life - Months. Months of the usable life of the asset
     */
    void setUseLifeMonths(int UseLifeMonths);

    /**
     * Get Usable Life - Years. Years of the usable life of the asset
     */
    int getUseLifeYears();

    /**
     * Set Usable Life - Years. Years of the usable life of the asset
     */
    void setUseLifeYears(int UseLifeYears);

    /**
     * Get Use units. Currently used units of the assets
     */
    int getUseUnits();

    /**
     * Set Use units. Currently used units of the assets
     */
    void setUseUnits(int UseUnits);

    /**
     * Get Version No. Version Number
     */
    String getVersionNo();

    /**
     * Set Version No. Version Number
     */
    void setVersionNo(String VersionNo);
}
