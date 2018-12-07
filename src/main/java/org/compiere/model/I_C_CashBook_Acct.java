package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CashBook_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CashBook_Acct {

    /**
     * TableName=C_CashBook_Acct
     */
    String Table_Name = "C_CashBook_Acct";

    /**
     * AD_Table_ID=409
     */
    int Table_ID = 409;

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
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CB_Asset_Acct
     */
    String COLUMNNAME_CB_Asset_Acct = "CB_Asset_Acct";
    /**
     * Column name CB_CashTransfer_Acct
     */
    String COLUMNNAME_CB_CashTransfer_Acct = "CB_CashTransfer_Acct";
    /**
     * Column name CB_Differences_Acct
     */
    String COLUMNNAME_CB_Differences_Acct = "CB_Differences_Acct";
    /**
     * Column name CB_Expense_Acct
     */
    String COLUMNNAME_CB_Expense_Acct = "CB_Expense_Acct";
    /**
     * Column name CB_Receipt_Acct
     */
    String COLUMNNAME_CB_Receipt_Acct = "CB_Receipt_Acct";
    /**
     * Column name C_CashBook_Acct_UU
     */
    String COLUMNNAME_C_CashBook_Acct_UU = "C_CashBook_Acct_UU";
    /**
     * Column name C_CashBook_ID
     */
    String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
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
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /**
     * Get Cash Book Asset. Cash Book Asset Account
     */
    int getCB_Asset_Acct();

    /**
     * Set Cash Book Asset. Cash Book Asset Account
     */
    void setCB_Asset_Acct(int CB_Asset_Acct);

    I_C_ValidCombination getCB_Asset_A() throws RuntimeException;

    /**
     * Get Cash Transfer. Cash Transfer Clearing Account
     */
    int getCB_CashTransfer_Acct();

    /**
     * Set Cash Transfer. Cash Transfer Clearing Account
     */
    void setCB_CashTransfer_Acct(int CB_CashTransfer_Acct);

    I_C_ValidCombination getCB_CashTransfer_A() throws RuntimeException;

    /**
     * Get Cash Book Differences. Cash Book Differences Account
     */
    int getCB_Differences_Acct();

    /**
     * Set Cash Book Differences. Cash Book Differences Account
     */
    void setCB_Differences_Acct(int CB_Differences_Acct);

    I_C_ValidCombination getCB_Differences_A() throws RuntimeException;

    /**
     * Get Cash Book Expense. Cash Book Expense Account
     */
    int getCB_Expense_Acct();

    /**
     * Set Cash Book Expense. Cash Book Expense Account
     */
    void setCB_Expense_Acct(int CB_Expense_Acct);

    I_C_ValidCombination getCB_Expense_A() throws RuntimeException;

    /**
     * Get Cash Book Receipt. Cash Book Receipts Account
     */
    int getCB_Receipt_Acct();

    /**
     * Set Cash Book Receipt. Cash Book Receipts Account
     */
    void setCB_Receipt_Acct(int CB_Receipt_Acct);

    I_C_ValidCombination getCB_Receipt_A() throws RuntimeException;

    /**
     * Get C_CashBook_Acct_UU
     */
    String getC_CashBook_Acct_UU();

    /**
     * Set C_CashBook_Acct_UU
     */
    void setC_CashBook_Acct_UU(String C_CashBook_Acct_UU);

    /**
     * Get Cash Book. Cash Book for recording petty cash transactions
     */
    int getC_CashBook_ID();

    /**
     * Set Cash Book. Cash Book for recording petty cash transactions
     */
    void setC_CashBook_ID(int C_CashBook_ID);

    I_C_CashBook getC_CashBook() throws RuntimeException;

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
