package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Acct {

    /**
     * TableName=A_Asset_Acct
     */
    String Table_Name = "A_Asset_Acct";

    /**
     * AD_Table_ID=53123
     */
    int Table_ID = 53123;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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
     * Column name A_Asset_Acct_UU
     */
    String COLUMNNAME_A_Asset_Acct_UU = "A_Asset_Acct_UU";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Spread_ID
     */
    String COLUMNNAME_A_Asset_Spread_ID = "A_Asset_Spread_ID";
    /**
     * Column name A_Depreciation_Acct
     */
    String COLUMNNAME_A_Depreciation_Acct = "A_Depreciation_Acct";
    /**
     * Column name A_Depreciation_Conv_F_ID
     */
    String COLUMNNAME_A_Depreciation_Conv_F_ID = "A_Depreciation_Conv_F_ID";
    /**
     * Column name A_Depreciation_Conv_ID
     */
    String COLUMNNAME_A_Depreciation_Conv_ID = "A_Depreciation_Conv_ID";
    /**
     * Column name A_Depreciation_F_ID
     */
    String COLUMNNAME_A_Depreciation_F_ID = "A_Depreciation_F_ID";
    /**
     * Column name A_Depreciation_ID
     */
    String COLUMNNAME_A_Depreciation_ID = "A_Depreciation_ID";
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
     * Column name A_Depreciation_Method_F_ID
     */
    String COLUMNNAME_A_Depreciation_Method_F_ID = "A_Depreciation_Method_F_ID";
    /**
     * Column name A_Depreciation_Method_ID
     */
    String COLUMNNAME_A_Depreciation_Method_ID = "A_Depreciation_Method_ID";
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
     * Column name A_Depreciation_Variable_Perc_F
     */
    String COLUMNNAME_A_Depreciation_Variable_Perc_F =
            "A_Depreciation_Variable_Perc_F";
    /**
     * Column name A_Disposal_Gain
     */
    String COLUMNNAME_A_Disposal_Gain = "A_Disposal_Gain";
    /**
     * Column name A_Disposal_Gain_Acct
     */
    String COLUMNNAME_A_Disposal_Gain_Acct = "A_Disposal_Gain_Acct";
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
     * Column name A_Period_End
     */
    String COLUMNNAME_A_Period_End = "A_Period_End";
    /**
     * Column name A_Period_Start
     */
    String COLUMNNAME_A_Period_Start = "A_Period_Start";
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
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

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
     * Get A_Asset_Acct_UU
     */
    String getA_Asset_Acct_UU();

    /**
     * Set A_Asset_Acct_UU
     */
    void setA_Asset_Acct_UU(String A_Asset_Acct_UU);

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
     * Get A_Asset_Spread_ID
     */
    int getA_Asset_Spread_ID();

    /**
     * Set A_Asset_Spread_ID
     */
    void setA_Asset_Spread_ID(int A_Asset_Spread_ID);

    I_A_Asset_Spread getA_Asset_Spread() throws RuntimeException;

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
     * Get Depreciation Convention (fiscal)
     */
    int getA_Depreciation_Conv_F_ID();

    /**
     * Set Depreciation Convention (fiscal)
     */
    void setA_Depreciation_Conv_F_ID(int A_Depreciation_Conv_F_ID);

    I_A_Depreciation_Convention getA_Depreciation_Conv_F() throws RuntimeException;

    /**
     * Get Convention Type
     */
    int getA_Depreciation_Conv_ID();

    /**
     * Set Convention Type
     */
    void setA_Depreciation_Conv_ID(int A_Depreciation_Conv_ID);

    I_A_Depreciation_Convention getA_Depreciation_Conv() throws RuntimeException;

    /**
     * Get Depreciation (fiscal)
     */
    int getA_Depreciation_F_ID();

    /**
     * Set Depreciation (fiscal)
     */
    void setA_Depreciation_F_ID(int A_Depreciation_F_ID);

    I_A_Depreciation getA_Depreciation_F() throws RuntimeException;

    /**
     * Get Depreciation
     */
    int getA_Depreciation_ID();

    /**
     * Set Depreciation
     */
    void setA_Depreciation_ID(int A_Depreciation_ID);

    I_A_Depreciation getA_Depreciation() throws RuntimeException;

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
     * Get Depreciation Method (fiscal)
     */
    int getA_Depreciation_Method_F_ID();

    /**
     * Set Depreciation Method (fiscal)
     */
    void setA_Depreciation_Method_F_ID(int A_Depreciation_Method_F_ID);

    I_A_Depreciation_Method getA_Depreciation_Method_F() throws RuntimeException;

    /**
     * Get Depreciation Method
     */
    int getA_Depreciation_Method_ID();

    /**
     * Set Depreciation Method
     */
    void setA_Depreciation_Method_ID(int A_Depreciation_Method_ID);

    I_A_Depreciation_Method getA_Depreciation_Method() throws RuntimeException;

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
     * Get Variable Percent (fiscal)
     */
    BigDecimal getA_Depreciation_Variable_Perc_F();

    /**
     * Set Variable Percent (fiscal)
     */
    void setA_Depreciation_Variable_Perc_F(BigDecimal A_Depreciation_Variable_Perc_F);

    /**
     * Get Disposal Gain
     */
    int getA_Disposal_Gain();

    /**
     * Set Disposal Gain
     */
    void setA_Disposal_Gain(int A_Disposal_Gain);

    I_C_ValidCombination getA_Disposal_G() throws RuntimeException;

    /**
     * Get Disposal Gain Acct
     */
    int getA_Disposal_Gain_Acct();

    /**
     * Set Disposal Gain Acct
     */
    void setA_Disposal_Gain_Acct(int A_Disposal_Gain_Acct);

    I_C_ValidCombination getA_Disposal_Gain_A() throws RuntimeException;

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
     * Get Revaluation Accumulated Depreciation Offset for Current Year
     */
    int getA_Reval_Accumdep_Offset_Cur();

    /**
     * Set Revaluation Accumulated Depreciation Offset for Current Year
     */
    void setA_Reval_Accumdep_Offset_Cur(int A_Reval_Accumdep_Offset_Cur);

    I_C_ValidCombination getA_Reval_Accumdep_Offset_() throws RuntimeException;

    /**
     * Get Revaluation Accumulated Depreciation Offset for Prior Year
     */
    int getA_Reval_Accumdep_Offset_Prior();

    /**
     * Set Revaluation Accumulated Depreciation Offset for Prior Year
     */
    void setA_Reval_Accumdep_Offset_Prior(int A_Reval_Accumdep_Offset_Prior);

    I_C_ValidCombination getA_Reval_Accumdep_Offset_Pr() throws RuntimeException;

    /**
     * Get A_Reval_Accumdep_Offset_Cur
     */
    int getA_Reval_Adep_Offset_Cur_Acct();

    /**
     * Set A_Reval_Accumdep_Offset_Cur
     */
    void setA_Reval_Adep_Offset_Cur_Acct(int A_Reval_Adep_Offset_Cur_Acct);

    I_C_ValidCombination getA_Reval_Adep_Offset_Cur_A() throws RuntimeException;

    /**
     * Get A_Reval_Accumdep_Offset_Prior
     */
    int getA_Reval_Adep_Offset_Prior_Acct();

    /**
     * Set A_Reval_Accumdep_Offset_Prior
     */
    void setA_Reval_Adep_Offset_Prior_Acct(int A_Reval_Adep_Offset_Prior_Acct);

    I_C_ValidCombination getA_Reval_Adep_Offset_Prior_A() throws RuntimeException;

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

    I_C_ValidCombination getA_Reval_Cost_Off() throws RuntimeException;

    /**
     * Get Reval Cost Offset Acct
     */
    int getA_Reval_Cost_Offset_Acct();

    /**
     * Set Reval Cost Offset Acct
     */
    void setA_Reval_Cost_Offset_Acct(int A_Reval_Cost_Offset_Acct);

    I_C_ValidCombination getA_Reval_Cost_Offset_A() throws RuntimeException;

    /**
     * Get Revaluation Cost Offset for Prior Year
     */
    int getA_Reval_Cost_Offset_Prior();

    /**
     * Set Revaluation Cost Offset for Prior Year
     */
    void setA_Reval_Cost_Offset_Prior(int A_Reval_Cost_Offset_Prior);

    I_C_ValidCombination getA_Reval_Cost_Offset_Pr() throws RuntimeException;

    /**
     * Get Reval Cost Offset Prior Acct
     */
    int getA_Reval_Cost_Offset_Prior_Acct();

    /**
     * Set Reval Cost Offset Prior Acct
     */
    void setA_Reval_Cost_Offset_Prior_Acct(int A_Reval_Cost_Offset_Prior_Acct);

    I_C_ValidCombination getA_Reval_Cost_Offset_Prior_A() throws RuntimeException;

    /**
     * Get Revaluation Expense Offs
     */
    int getA_Reval_Depexp_Offset();

    /**
     * Set Revaluation Expense Offs
     */
    void setA_Reval_Depexp_Offset(int A_Reval_Depexp_Offset);

    I_C_ValidCombination getA_Reval_Depexp_Off() throws RuntimeException;

    /**
     * Get Reval Depexp Offset Acct
     */
    int getA_Reval_Depexp_Offset_Acct();

    /**
     * Set Reval Depexp Offset Acct
     */
    void setA_Reval_Depexp_Offset_Acct(int A_Reval_Depexp_Offset_Acct);

    I_C_ValidCombination getA_Reval_Depexp_Offset_A() throws RuntimeException;

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
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);
}
