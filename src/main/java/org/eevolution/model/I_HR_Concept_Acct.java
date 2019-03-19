package org.eevolution.model;

import org.compiere.model.I_C_ValidCombination;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Concept_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Concept_Acct {

    /**
     * TableName=HR_Concept_Acct
     */
    String Table_Name = "HR_Concept_Acct";

    /**
     * AD_Table_ID=53091
     */
    int Table_ID = 53091;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_Concept_Acct_ID
     */
    String COLUMNNAME_HR_Concept_Acct_ID = "HR_Concept_Acct_ID";
    /**
     * Column name HR_Concept_Acct_UU
     */
    String COLUMNNAME_HR_Concept_Acct_UU = "HR_Concept_Acct_UU";
    /**
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Expense_Acct
     */
    String COLUMNNAME_HR_Expense_Acct = "HR_Expense_Acct";
    /**
     * Column name HR_Revenue_Acct
     */
    String COLUMNNAME_HR_Revenue_Acct = "HR_Revenue_Acct";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBalancing
     */
    String COLUMNNAME_IsBalancing = "IsBalancing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    org.compiere.model.I_C_AcctSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getBPGroupId();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    void setBPGroupId(int C_BP_Group_ID);

    org.compiere.model.I_C_BP_Group getBusinessPartnerGroup() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Payroll Concept Account
     */
    int getPayrollConceptAccountId();

    /**
     * Set Payroll Concept Account
     */
    void setPayrollConceptAccountId(int HR_Concept_Acct_ID);

    /**
     * Get Payroll Concept
     */
    int getPayrollConceptId();

    /**
     * Set Payroll Concept
     */
    void setPayrollConceptId(int HR_Concept_ID);

    org.eevolution.model.I_HR_Concept getPayrollConcept() throws RuntimeException;

    /**
     * Get Payroll Expense Account
     */
    int getPayrollExpenseAccountId();

    /**
     * Set Payroll Expense Account
     */
    void setPayrollExpenseAccountId(int HR_Expense_Acct);

    I_C_ValidCombination getPayrollExpenseAccount() throws RuntimeException;

    /**
     * Get Payroll Revenue Account
     */
    int getPayrollRevenueAccountId();

    /**
     * Set Payroll Revenue Account
     */
    void setPayrollRevenueAccountId(int HR_Revenue_Acct);

    I_C_ValidCombination getPayrollRevenueAccount() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Balancing. All transactions within an element value must balance (e.g. cost centers)
     */
    void setIsBalancing(boolean IsBalancing);

    /**
     * Get Balancing. All transactions within an element value must balance (e.g. cost centers)
     */
    boolean isBalancing();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    I_C_ValidCombination getUser2() throws RuntimeException;
}
