package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_FundingMode_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_FundingMode_Acct {

    /**
     * TableName=A_FundingMode_Acct
     */
    String Table_Name = "A_FundingMode_Acct";

    /**
     * AD_Table_ID=53274
     */
    int Table_ID = 53274;

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
     * Column name A_FundingMode_Acct
     */
    String COLUMNNAME_A_FundingMode_Acct = "A_FundingMode_Acct";
    /**
     * Column name A_FundingMode_Acct_UU
     */
    String COLUMNNAME_A_FundingMode_Acct_UU = "A_FundingMode_Acct_UU";
    /**
     * Column name A_FundingMode_ID
     */
    String COLUMNNAME_A_FundingMode_ID = "A_FundingMode_ID";
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
     * Get Funding Mode Account
     */
    int getA_FundingMode_Acct();

    /**
     * Set Funding Mode Account
     */
    void setA_FundingMode_Acct(int A_FundingMode_Acct);

    I_C_ValidCombination getA_FundingMode_A() throws RuntimeException;

    /**
     * Get A_FundingMode_Acct_UU
     */
    String getA_FundingMode_Acct_UU();

    /**
     * Set A_FundingMode_Acct_UU
     */
    void setA_FundingMode_Acct_UU(String A_FundingMode_Acct_UU);

    /**
     * Get Asset Funding Mode
     */
    int getA_FundingMode_ID();

    /**
     * Set Asset Funding Mode
     */
    void setA_FundingMode_ID(int A_FundingMode_ID);

    I_A_FundingMode getA_FundingMode() throws RuntimeException;

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
