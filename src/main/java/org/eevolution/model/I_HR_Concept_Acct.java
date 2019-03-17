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
@SuppressWarnings("all")
public interface I_HR_Concept_Acct {

    /**
     * TableName=HR_Concept_Acct
     */
    public static final String Table_Name = "HR_Concept_Acct";

    /**
     * AD_Table_ID=53091
     */
    public static final int Table_ID = 53091;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_BP_Group_ID
     */
    public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_Concept_Acct_ID
     */
    public static final String COLUMNNAME_HR_Concept_Acct_ID = "HR_Concept_Acct_ID";
    /**
     * Column name HR_Concept_Acct_UU
     */
    public static final String COLUMNNAME_HR_Concept_Acct_UU = "HR_Concept_Acct_UU";
    /**
     * Column name HR_Concept_ID
     */
    public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Expense_Acct
     */
    public static final String COLUMNNAME_HR_Expense_Acct = "HR_Expense_Acct";
    /**
     * Column name HR_Revenue_Acct
     */
    public static final String COLUMNNAME_HR_Revenue_Acct = "HR_Revenue_Acct";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBalancing
     */
    public static final String COLUMNNAME_IsBalancing = "IsBalancing";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    public static final String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    public static final String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    public int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    public void setAccountingSchemaId(int C_AcctSchema_ID);

    public org.compiere.model.I_C_AcctSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Business Partner Group. Business Partner Group
     */
    public int getBPGroupId();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    public void setBPGroupId(int C_BP_Group_ID);

    public org.compiere.model.I_C_BP_Group getBP_Group() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Payroll Concept Account
     */
    public int getHR_Concept_AcctId();

    /**
     * Set Payroll Concept Account
     */
    public void setHR_Concept_AcctId(int HR_Concept_Acct_ID);

    /**
     * Get HR_Concept_Acct_UU
     */
    public String getHR_Concept_Acct_UU();

    /**
     * Set HR_Concept_Acct_UU
     */
    public void setHR_Concept_Acct_UU(String HR_Concept_Acct_UU);

    /**
     * Get Payroll Concept
     */
    public int getHR_ConceptId();

    /**
     * Set Payroll Concept
     */
    public void setHR_ConceptId(int HR_Concept_ID);

    public org.eevolution.model.I_HR_Concept getHR_Concept() throws RuntimeException;

    /**
     * Get Payroll Expense Account
     */
    public int getHR_Expense_Acct();

    /**
     * Set Payroll Expense Account
     */
    public void setHR_Expense_Acct(int HR_Expense_Acct);

    public I_C_ValidCombination getHR_Expense_A() throws RuntimeException;

    /**
     * Get Payroll Revenue Account
     */
    public int getHR_Revenue_Acct();

    /**
     * Set Payroll Revenue Account
     */
    public void setHR_Revenue_Acct(int HR_Revenue_Acct);

    public I_C_ValidCombination getHR_Revenue_A() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Balancing. All transactions within an element value must balance (e.g. cost centers)
     */
    public void setIsBalancing(boolean IsBalancing);

    /**
     * Get Balancing. All transactions within an element value must balance (e.g. cost centers)
     */
    public boolean isBalancing();

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    public int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(int User1_ID);

    public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    public int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(int User2_ID);

    public I_C_ValidCombination getUser2() throws RuntimeException;
}
