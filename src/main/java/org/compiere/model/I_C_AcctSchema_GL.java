package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctSchema_GL
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema_GL {

    /**
     * TableName=C_AcctSchema_GL
     */
    String Table_Name = "C_AcctSchema_GL";

    /**
     * AD_Table_ID=266
     */
    int Table_ID = 266;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AcctSchema_GL_UU
     */
    String COLUMNNAME_C_AcctSchema_GL_UU = "C_AcctSchema_GL_UU";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CommitmentOffset_Acct
     */
    String COLUMNNAME_CommitmentOffset_Acct = "CommitmentOffset_Acct";
    /**
     * Column name CommitmentOffsetSales_Acct
     */
    String COLUMNNAME_CommitmentOffsetSales_Acct = "CommitmentOffsetSales_Acct";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CurrencyBalancing_Acct
     */
    String COLUMNNAME_CurrencyBalancing_Acct = "CurrencyBalancing_Acct";
    /**
     * Column name IntercompanyDueFrom_Acct
     */
    String COLUMNNAME_IntercompanyDueFrom_Acct = "IntercompanyDueFrom_Acct";
    /**
     * Column name IntercompanyDueTo_Acct
     */
    String COLUMNNAME_IntercompanyDueTo_Acct = "IntercompanyDueTo_Acct";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PPVOffset_Acct
     */
    String COLUMNNAME_PPVOffset_Acct = "PPVOffset_Acct";
    /**
     * Column name SuspenseBalancing_Acct
     */
    String COLUMNNAME_SuspenseBalancing_Acct = "SuspenseBalancing_Acct";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UseCurrencyBalancing
     */
    String COLUMNNAME_UseCurrencyBalancing = "UseCurrencyBalancing";
    /**
     * Column name UseSuspenseBalancing
     */
    String COLUMNNAME_UseSuspenseBalancing = "UseSuspenseBalancing";
    /**
     * Column name UseSuspenseError
     */
    String COLUMNNAME_UseSuspenseError = "UseSuspenseError";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get C_AcctSchema_GL_UU
     */
    String getC_AcctSchema_GL_UU();

    /**
     * Set C_AcctSchema_GL_UU
     */
    void setC_AcctSchema_GL_UU(String C_AcctSchema_GL_UU);

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
     * Get Commitment Offset. Budgetary Commitment Offset Account
     */
    int getCommitmentOffset_Acct();

    /**
     * Set Commitment Offset. Budgetary Commitment Offset Account
     */
    void setCommitmentOffset_Acct(int CommitmentOffset_Acct);

    I_C_ValidCombination getCommitmentOffset_A() throws RuntimeException;

    /**
     * Get Commitment Offset Sales. Budgetary Commitment Offset Account for Sales
     */
    int getCommitmentOffsetSales_Acct();

    /**
     * Set Commitment Offset Sales. Budgetary Commitment Offset Account for Sales
     */
    void setCommitmentOffsetSales_Acct(int CommitmentOffsetSales_Acct);

    I_C_ValidCombination getCommitmentOffsetSales_A() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Currency Balancing Acct. Account used when a currency is out of balance
     */
    int getCurrencyBalancing_Acct();

    /**
     * Set Currency Balancing Acct. Account used when a currency is out of balance
     */
    void setCurrencyBalancing_Acct(int CurrencyBalancing_Acct);

    I_C_ValidCombination getCurrencyBalancing_A() throws RuntimeException;

    /**
     * Get Intercompany Due From Acct. Intercompany Due From / Receivables Account
     */
    int getIntercompanyDueFrom_Acct();

    /**
     * Set Intercompany Due From Acct. Intercompany Due From / Receivables Account
     */
    void setIntercompanyDueFrom_Acct(int IntercompanyDueFrom_Acct);

    I_C_ValidCombination getIntercompanyDueFrom_A() throws RuntimeException;

    /**
     * Get Intercompany Due To Acct. Intercompany Due To / Payable Account
     */
    int getIntercompanyDueTo_Acct();

    /**
     * Set Intercompany Due To Acct. Intercompany Due To / Payable Account
     */
    void setIntercompanyDueTo_Acct(int IntercompanyDueTo_Acct);

    I_C_ValidCombination getIntercompanyDueTo_A() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get PPV Offset. Purchase Price Variance Offset Account
     */
    int getPPVOffset_Acct();

    /**
     * Set PPV Offset. Purchase Price Variance Offset Account
     */
    void setPPVOffset_Acct(int PPVOffset_Acct);

    I_C_ValidCombination getPPVOffset_A() throws RuntimeException;

    /**
     * Get Suspense Balancing Acct
     */
    int getSuspenseBalancing_Acct();

    /**
     * Set Suspense Balancing Acct
     */
    void setSuspenseBalancing_Acct(int SuspenseBalancing_Acct);

    I_C_ValidCombination getSuspenseBalancing_A() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Use Currency Balancing
     */
    boolean isUseCurrencyBalancing();

    /**
     * Set Use Currency Balancing
     */
    void setUseCurrencyBalancing(boolean UseCurrencyBalancing);

    /**
     * Get Use Suspense Balancing
     */
    boolean isUseSuspenseBalancing();

    /**
     * Set Use Suspense Balancing
     */
    void setUseSuspenseBalancing(boolean UseSuspenseBalancing);

    /**
     * Get Use Suspense Error
     */
    boolean isUseSuspenseError();

    /**
     * Set Use Suspense Error
     */
    void setUseSuspenseError(boolean UseSuspenseError);
}
