package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ValidCombination
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ValidCombination {

    /**
     * TableName=C_ValidCombination
     */
    String Table_Name = "C_ValidCombination";

    /**
     * AD_Table_ID=176
     */
    int Table_ID = 176;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name Alias
     */
    String COLUMNNAME_Alias = "Alias";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_LocFrom_ID
     */
    String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
    /**
     * Column name C_LocTo_ID
     */
    String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
    /**
     * Column name Combination
     */
    String COLUMNNAME_Combination = "Combination";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name C_SubAcct_ID
     */
    String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
    /**
     * Column name C_ValidCombination_ID
     */
    String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
    /**
     * Column name C_ValidCombination_UU
     */
    String COLUMNNAME_C_ValidCombination_UU = "C_ValidCombination_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsFullyQualified
     */
    String COLUMNNAME_IsFullyQualified = "IsFullyQualified";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
     * Column name UserElement1_ID
     */
    String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
    /**
     * Column name UserElement2_ID
     */
    String COLUMNNAME_UserElement2_ID = "UserElement2_ID";

    /**
     * Get Account. Account used
     */
    int getAccount_ID();

    /**
     * Set Account. Account used
     */
    void setAccount_ID(int Account_ID);

    I_C_ElementValue getAccount() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get Alias. Defines an alternate method of indicating an account combination.
     */
    String getAlias();

    /**
     * Set Alias. Defines an alternate method of indicating an account combination.
     */
    void setAlias(String Alias);

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
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

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
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Location From. Location that inventory was moved from
     */
    int getC_LocFrom_ID();

    /**
     * Set Location From. Location that inventory was moved from
     */
    void setC_LocFrom_ID(int C_LocFrom_ID);

    I_C_Location getC_LocFrom() throws RuntimeException;

    /**
     * Get Location To. Location that inventory was moved to
     */
    int getC_LocTo_ID();

    /**
     * Set Location To. Location that inventory was moved to
     */
    void setC_LocTo_ID(int C_LocTo_ID);

    I_C_Location getC_LocTo() throws RuntimeException;

    /**
     * Get Combination. Unique combination of account elements
     */
    String getCombination();

    /**
     * Set Combination. Unique combination of account elements
     */
    void setCombination(String Combination);

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Sales Region. Sales coverage region
     */
    int getC_SalesRegion_ID();

    /**
     * Set Sales Region. Sales coverage region
     */
    void setC_SalesRegion_ID(int C_SalesRegion_ID);

    I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

    /**
     * Get Sub Account. Sub account for Element Value
     */
    int getC_SubAcct_ID();

    /**
     * Set Sub Account. Sub account for Element Value
     */
    void setC_SubAcct_ID(int C_SubAcct_ID);

    I_C_SubAcct getC_SubAcct() throws RuntimeException;

    /**
     * Get Combination. Valid Account Combination
     */
    int getC_ValidCombination_ID();

    /**
     * Set Combination. Valid Account Combination
     */
    void setC_ValidCombination_ID(int C_ValidCombination_ID);

    /**
     * Get C_ValidCombination_UU
     */
    String getC_ValidCombination_UU();

    /**
     * Set C_ValidCombination_UU
     */
    void setC_ValidCombination_UU(String C_ValidCombination_UU);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Fully Qualified. This account is fully qualified
     */
    void setIsFullyQualified(boolean IsFullyQualified);

    /**
     * Get Fully Qualified. This account is fully qualified
     */
    boolean isFullyQualified();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

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
    int getUser1_ID();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1_ID(int User1_ID);

    I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2_ID();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2_ID(int User2_ID);

    I_C_ElementValue getUser2() throws RuntimeException;

    /**
     * Get User Column 1. User defined accounting Element
     */
    int getUserElement1_ID();

    /**
     * Set User Column 1. User defined accounting Element
     */
    void setUserElement1_ID(int UserElement1_ID);

    /**
     * Get User Column 2. User defined accounting Element
     */
    int getUserElement2_ID();

    /**
     * Set User Column 2. User defined accounting Element
     */
    void setUserElement2_ID(int UserElement2_ID);
}
