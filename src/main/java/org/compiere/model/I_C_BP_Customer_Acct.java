package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Customer_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Customer_Acct {

    /**
     * TableName=C_BP_Customer_Acct
     */
    String Table_Name = "C_BP_Customer_Acct";

    /**
     * AD_Table_ID=183
     */
    int Table_ID = 183;

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
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_Customer_Acct_UU
     */
    String COLUMNNAME_C_BP_Customer_Acct_UU = "C_BP_Customer_Acct_UU";
    /**
     * Column name C_Prepayment_Acct
     */
    String COLUMNNAME_C_Prepayment_Acct = "C_Prepayment_Acct";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Receivable_Acct
     */
    String COLUMNNAME_C_Receivable_Acct = "C_Receivable_Acct";
    /**
     * Column name C_Receivable_Services_Acct
     */
    String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";
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
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get C_BP_Customer_Acct_UU
     */
    String getC_BP_Customer_Acct_UU();

    /**
     * Set C_BP_Customer_Acct_UU
     */
    void setC_BP_Customer_Acct_UU(String C_BP_Customer_Acct_UU);

    /**
     * Get Customer Prepayment. Account for customer prepayments
     */
    int getC_Prepayment_Acct();

    /**
     * Set Customer Prepayment. Account for customer prepayments
     */
    void setC_Prepayment_Acct(int C_Prepayment_Acct);

    I_C_ValidCombination getC_Prepayment_A() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Customer Receivables. Account for Customer Receivables
     */
    int getC_Receivable_Acct();

    /**
     * Set Customer Receivables. Account for Customer Receivables
     */
    void setC_Receivable_Acct(int C_Receivable_Acct);

    I_C_ValidCombination getC_Receivable_A() throws RuntimeException;

    /**
     * Get Receivable Services. Customer Accounts Receivables Services Account
     */
    int getC_Receivable_Services_Acct();

    /**
     * Set Receivable Services. Customer Accounts Receivables Services Account
     */
    void setC_Receivable_Services_Acct(int C_Receivable_Services_Acct);

    I_C_ValidCombination getC_Receivable_Services_A() throws RuntimeException;

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
