package org.compiere.model;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Generated Interface for C_AcctSchema_GL
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema_GL extends IPO {

    /**
     * TableName=C_AcctSchema_GL
     */
    String Table_Name = "C_AcctSchema_GL";

    /**
     * AD_Table_ID=266
     */
    int Table_ID = 266;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


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
     * Column name PPVOffset_Acct
     */
    String COLUMNNAME_PPVOffset_Acct = "PPVOffset_Acct";
    /**
     * Column name SuspenseBalancing_Acct
     */
    String COLUMNNAME_SuspenseBalancing_Acct = "SuspenseBalancing_Acct";
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
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    /**
     * Get Currency Balancing Acct. Account used when a currency is out of balance
     */
    int getCurrencyBalancingAccount();

    /**
     * Get Intercompany Due From Acct. Intercompany Due From / Receivables Account
     */
    int getIntercompanyDueFromAccount();

    /**
     * Get Intercompany Due To Acct. Intercompany Due To / Payable Account
     */
    int getIntercompanyDueToAccount();

    /**
     * Get Suspense Balancing Acct
     */
    int getSuspenseBalancingAccount();

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
     * Set Use Suspense Error
     */
    void setUseSuspenseError(boolean UseSuspenseError);

    ArrayList<KeyNamePair> getAcctInfo();
}
