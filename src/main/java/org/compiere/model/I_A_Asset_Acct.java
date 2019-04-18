package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for A_Asset_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Acct extends IPO {

    /**
     * TableName=A_Asset_Acct
     */
    String Table_Name = "A_Asset_Acct";

    /**
     * AD_Table_ID=53123
     */
    int Table_ID = 53123;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
    String COLUMNNAME_A_Depreciation_Table_Header_ID = "A_Depreciation_Table_Header_ID";
    /**
     * Column name A_Depreciation_Variable_Perc
     */
    String COLUMNNAME_A_Depreciation_Variable_Perc = "A_Depreciation_Variable_Perc";
    /**
     * Column name A_Depreciation_Variable_Perc_F
     */
    String COLUMNNAME_A_Depreciation_Variable_Perc_F = "A_Depreciation_Variable_Perc_F";
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
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

    /**
     * Get Accumulated Depreciation Account
     */
    int getAccumdepreciationAcct();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setAssetId(int A_Asset_ID);

    /**
     * Get Depreciation Account
     */
    int getDepreciationAcct();

    /**
     * Set Depreciation (fiscal)
     */
    void setDepreciationFiscalId(int A_Depreciation_F_ID);

    /**
     * Set Depreciation
     */
    void setDepreciationId(int A_Depreciation_ID);

    /**
     * Get Variable Percent
     */
    BigDecimal getDepreciationVariablePercent();

    /**
     * Get Variable Percent (fiscal)
     */
    BigDecimal getDepreciationVariablePercentFiscal();

    /**
     * Set A_Period_End
     */
    void setPeriodEnd(int A_Period_End);

    /**
     * Set A_Period_Start
     */
    void setPeriodStart(int A_Period_Start);

    /**
     * Set Asset Salvage Value
     */
    void setSalvageValue(BigDecimal A_Salvage_Value);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAcctSchemaId();

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);
}
