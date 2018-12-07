package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankAccount_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccount_Acct {

    /**
     * TableName=C_BankAccount_Acct
     */
    String Table_Name = "C_BankAccount_Acct";

    /**
     * AD_Table_ID=391
     */
    int Table_ID = 391;

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
     * Column name B_Asset_Acct
     */
    String COLUMNNAME_B_Asset_Acct = "B_Asset_Acct";
    /**
     * Column name B_InterestExp_Acct
     */
    String COLUMNNAME_B_InterestExp_Acct = "B_InterestExp_Acct";
    /**
     * Column name B_InterestRev_Acct
     */
    String COLUMNNAME_B_InterestRev_Acct = "B_InterestRev_Acct";
    /**
     * Column name B_InTransit_Acct
     */
    String COLUMNNAME_B_InTransit_Acct = "B_InTransit_Acct";
    /**
     * Column name B_PaymentSelect_Acct
     */
    String COLUMNNAME_B_PaymentSelect_Acct = "B_PaymentSelect_Acct";
    /**
     * Column name B_UnallocatedCash_Acct
     */
    String COLUMNNAME_B_UnallocatedCash_Acct = "B_UnallocatedCash_Acct";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_BankAccount_Acct_UU
     */
    String COLUMNNAME_C_BankAccount_Acct_UU = "C_BankAccount_Acct_UU";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
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
     * Get Bank Asset. Bank Asset Account
     */
    int getB_Asset_Acct();

    /**
     * Set Bank Asset. Bank Asset Account
     */
    void setB_Asset_Acct(int B_Asset_Acct);

    I_C_ValidCombination getB_Asset_A() throws RuntimeException;

    /**
     * Get Bank Interest Expense. Bank Interest Expense Account
     */
    int getB_InterestExp_Acct();

    /**
     * Set Bank Interest Expense. Bank Interest Expense Account
     */
    void setB_InterestExp_Acct(int B_InterestExp_Acct);

    I_C_ValidCombination getB_InterestExp_A() throws RuntimeException;

    /**
     * Get Bank Interest Revenue. Bank Interest Revenue Account
     */
    int getB_InterestRev_Acct();

    /**
     * Set Bank Interest Revenue. Bank Interest Revenue Account
     */
    void setB_InterestRev_Acct(int B_InterestRev_Acct);

    I_C_ValidCombination getB_InterestRev_A() throws RuntimeException;

    /**
     * Get Bank In Transit. Bank In Transit Account
     */
    int getB_InTransit_Acct();

    /**
     * Set Bank In Transit. Bank In Transit Account
     */
    void setB_InTransit_Acct(int B_InTransit_Acct);

    I_C_ValidCombination getB_InTransit_A() throws RuntimeException;

    /**
     * Get Payment Selection. AP Payment Selection Clearing Account
     */
    int getB_PaymentSelect_Acct();

    /**
     * Set Payment Selection. AP Payment Selection Clearing Account
     */
    void setB_PaymentSelect_Acct(int B_PaymentSelect_Acct);

    I_C_ValidCombination getB_PaymentSelect_A() throws RuntimeException;

    /**
     * Get Unallocated Cash. Unallocated Cash Clearing Account
     */
    int getB_UnallocatedCash_Acct();

    /**
     * Set Unallocated Cash. Unallocated Cash Clearing Account
     */
    void setB_UnallocatedCash_Acct(int B_UnallocatedCash_Acct);

    I_C_ValidCombination getB_UnallocatedCash_A() throws RuntimeException;

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
     * Get C_BankAccount_Acct_UU
     */
    String getC_BankAccount_Acct_UU();

    /**
     * Set C_BankAccount_Acct_UU
     */
    void setC_BankAccount_Acct_UU(String C_BankAccount_Acct_UU);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    I_C_BankAccount getC_BankAccount() throws RuntimeException;

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
