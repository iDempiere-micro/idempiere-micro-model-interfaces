package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for GL_DistributionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_DistributionLine extends PersistentObject {

    /**
     * TableName=GL_DistributionLine
     */
    String Table_Name = "GL_DistributionLine";

    /**
     * AD_Table_ID=707
     */
    int Table_ID = 707;

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
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GL_Distribution_ID
     */
    String COLUMNNAME_GL_Distribution_ID = "GL_Distribution_ID";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Org_ID
     */
    String COLUMNNAME_Org_ID = "Org_ID";
    /**
     * Column name OverwriteAcct
     */
    String COLUMNNAME_OverwriteAcct = "OverwriteAcct";
    /**
     * Column name OverwriteActivity
     */
    String COLUMNNAME_OverwriteActivity = "OverwriteActivity";
    /**
     * Column name OverwriteBPartner
     */
    String COLUMNNAME_OverwriteBPartner = "OverwriteBPartner";
    /**
     * Column name OverwriteCampaign
     */
    String COLUMNNAME_OverwriteCampaign = "OverwriteCampaign";
    /**
     * Column name OverwriteLocFrom
     */
    String COLUMNNAME_OverwriteLocFrom = "OverwriteLocFrom";
    /**
     * Column name OverwriteLocTo
     */
    String COLUMNNAME_OverwriteLocTo = "OverwriteLocTo";
    /**
     * Column name OverwriteOrg
     */
    String COLUMNNAME_OverwriteOrg = "OverwriteOrg";
    /**
     * Column name OverwriteOrgTrx
     */
    String COLUMNNAME_OverwriteOrgTrx = "OverwriteOrgTrx";
    /**
     * Column name OverwriteProduct
     */
    String COLUMNNAME_OverwriteProduct = "OverwriteProduct";
    /**
     * Column name OverwriteProject
     */
    String COLUMNNAME_OverwriteProject = "OverwriteProject";
    /**
     * Column name OverwriteSalesRegion
     */
    String COLUMNNAME_OverwriteSalesRegion = "OverwriteSalesRegion";
    /**
     * Column name OverwriteUser1
     */
    String COLUMNNAME_OverwriteUser1 = "OverwriteUser1";
    /**
     * Column name OverwriteUser2
     */
    String COLUMNNAME_OverwriteUser2 = "OverwriteUser2";
    /**
     * Column name Percent
     */
    String COLUMNNAME_Percent = "Percent";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Account. Account used
     */
    int getAccountId();

    /**
     * Set Account. Account used
     */
    void setAccountId(int Account_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get GL Distribution. General Ledger Distribution
     */
    int getGLDistributionId();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int Org_ID);

    /**
     * Get Overwrite Account. Overwrite the account segment Account with the value specified
     */
    boolean isOverwriteAcct();

    /**
     * Set Overwrite Account. Overwrite the account segment Account with the value specified
     */
    void setOverwriteAcct(boolean OverwriteAcct);

    /**
     * Get Overwrite Activity. Overwrite the account segment Activity with the value specified
     */
    boolean isOverwriteActivity();

    /**
     * Set Overwrite Activity. Overwrite the account segment Activity with the value specified
     */
    void setOverwriteActivity(boolean OverwriteActivity);

    /**
     * Get Overwrite Bus.Partner. Overwrite the account segment Business Partner with the value
     * specified
     */
    boolean isOverwriteBPartner();

    /**
     * Set Overwrite Bus.Partner. Overwrite the account segment Business Partner with the value
     * specified
     */
    void setOverwriteBPartner(boolean OverwriteBPartner);

    /**
     * Get Overwrite Campaign. Overwrite the account segment Campaign with the value specified
     */
    boolean isOverwriteCampaign();

    /**
     * Set Overwrite Campaign. Overwrite the account segment Campaign with the value specified
     */
    void setOverwriteCampaign(boolean OverwriteCampaign);

    /**
     * Get Overwrite Location From. Overwrite the account segment Location From with the value
     * specified
     */
    boolean isOverwriteLocFrom();

    /**
     * Set Overwrite Location From. Overwrite the account segment Location From with the value
     * specified
     */
    void setOverwriteLocFrom(boolean OverwriteLocFrom);

    /**
     * Get Overwrite Location To. Overwrite the account segment Location From with the value specified
     */
    boolean isOverwriteLocTo();

    /**
     * Set Overwrite Location To. Overwrite the account segment Location From with the value specified
     */
    void setOverwriteLocTo(boolean OverwriteLocTo);

    /**
     * Get Overwrite Organization. Overwrite the account segment Organization with the value specified
     */
    boolean isOverwriteOrg();

    /**
     * Set Overwrite Organization. Overwrite the account segment Organization with the value specified
     */
    void setOverwriteOrg(boolean OverwriteOrg);

    /**
     * Get Overwrite Trx Organuzation. Overwrite the account segment Transaction Organization with the
     * value specified
     */
    boolean isOverwriteOrgTrx();

    /**
     * Set Overwrite Trx Organuzation. Overwrite the account segment Transaction Organization with the
     * value specified
     */
    void setOverwriteOrgTrx(boolean OverwriteOrgTrx);

    /**
     * Get Overwrite Product. Overwrite the account segment Product with the value specified
     */
    boolean isOverwriteProduct();

    /**
     * Set Overwrite Product. Overwrite the account segment Product with the value specified
     */
    void setOverwriteProduct(boolean OverwriteProduct);

    /**
     * Get Overwrite Project. Overwrite the account segment Project with the value specified
     */
    boolean isOverwriteProject();

    /**
     * Set Overwrite Project. Overwrite the account segment Project with the value specified
     */
    void setOverwriteProject(boolean OverwriteProject);

    /**
     * Get Overwrite Sales Region. Overwrite the account segment Sales Region with the value specified
     */
    boolean isOverwriteSalesRegion();

    /**
     * Set Overwrite Sales Region. Overwrite the account segment Sales Region with the value specified
     */
    void setOverwriteSalesRegion(boolean OverwriteSalesRegion);

    /**
     * Get Overwrite User1. Overwrite the account segment User 1 with the value specified
     */
    boolean isOverwriteUser1();

    /**
     * Set Overwrite User1. Overwrite the account segment User 1 with the value specified
     */
    void setOverwriteUser1(boolean OverwriteUser1);

    /**
     * Get Overwrite User2. Overwrite the account segment User 2 with the value specified
     */
    boolean isOverwriteUser2();

    /**
     * Set Overwrite User2. Overwrite the account segment User 2 with the value specified
     */
    void setOverwriteUser2(boolean OverwriteUser2);

    /**
     * Get Percent. Percentage
     */
    BigDecimal getPercent();

    /**
     * Set Percent. Percentage
     */
    void setPercent(BigDecimal Percent);

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

    void setParent(I_GL_Distribution mDistribution);

    void setAccount(I_C_ValidCombination acct);

    void calculateAmt(BigDecimal amt, int precision);

    void calculateQty(BigDecimal qty);

    BigDecimal getAmt();

    BigDecimal getQty();

    void setAmt(BigDecimal difference);

    void setQty(BigDecimal differenceQty);

    I_C_ValidCombination getAccount();
}
