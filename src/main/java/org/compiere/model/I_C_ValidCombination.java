package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsFullyQualified
     */
    String COLUMNNAME_IsFullyQualified = "IsFullyQualified";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
    int getAccountId();

    /**
     * Set Account. Account used
     */
    void setAccountId(int Account_ID);

    I_C_ElementValue getAccount() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

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
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    /**
     * Get Location From. Location that inventory was moved from
     */
    int getLocationFromId();

    /**
     * Set Location From. Location that inventory was moved from
     */
    void setLocationFromId(int C_LocFrom_ID);

    /**
     * Get Location To. Location that inventory was moved to
     */
    int getLocationToId();

    /**
     * Set Location To. Location that inventory was moved to
     */
    void setLocationToId(int C_LocTo_ID);

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
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    /**
     * Get Sales Region. Sales coverage region
     */
    int getSalesRegionId();

    /**
     * Set Sales Region. Sales coverage region
     */
    void setSalesRegionId(int C_SalesRegion_ID);

    /**
     * Get Sub Account. Sub account for Element Value
     */
    int getSubAccountId();

    /**
     * Set Sub Account. Sub account for Element Value
     */
    void setSubAccountId(int C_SubAcct_ID);

    /**
     * Get Combination. Valid Account Combination
     */
    int getValidAccountCombinationId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    /**
     * Get User Column 1. User defined accounting Element
     */
    int getUserElement1Id();

    /**
     * Set User Column 1. User defined accounting Element
     */
    void setUserElement1Id(int UserElement1_ID);

    /**
     * Get User Column 2. User defined accounting Element
     */
    int getUserElement2Id();

    /**
     * Set User Column 2. User defined accounting Element
     */
    void setUserElement2Id(int UserElement2_ID);
}
