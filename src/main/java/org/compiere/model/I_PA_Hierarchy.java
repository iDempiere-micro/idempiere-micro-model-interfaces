package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for PA_Hierarchy
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Hierarchy {

    /**
     * TableName=PA_Hierarchy
     */
    String Table_Name = "PA_Hierarchy";

    /**
     * AD_Table_ID=821
     */
    int Table_ID = 821;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AD_Tree_Account_ID
     */
    String COLUMNNAME_AD_Tree_Account_ID = "AD_Tree_Account_ID";
    /**
     * Column name AD_Tree_Activity_ID
     */
    String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";
    /**
     * Column name AD_Tree_BPartner_ID
     */
    String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";
    /**
     * Column name AD_Tree_Campaign_ID
     */
    String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";
    /**
     * Column name AD_Tree_Org_ID
     */
    String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
    /**
     * Column name AD_Tree_Product_ID
     */
    String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";
    /**
     * Column name AD_Tree_Project_ID
     */
    String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";
    /**
     * Column name AD_Tree_SalesRegion_ID
     */
    String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";

    /**
     * Get Account Tree. Tree for Natural Account Tree
     */
    int getTreeAccountId();

    /**
     * Get Activity Tree. Trees are used for (financial) reporting
     */
    int getTreeActivityId();

    /**
     * Get BPartner Tree. Trees are used for (financial) reporting
     */
    int getTreeBPartnerId();

    /**
     * Get Campaign Tree. Trees are used for (financial) reporting
     */
    int getTreeCampaignId();

    /**
     * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
     */
    int getTreeOrgId();

    /**
     * Get Product Tree. Trees are used for (financial) reporting
     */
    int getTreeProductId();

    /**
     * Get Project Tree. Trees are used for (financial) reporting
     */
    int getTreeProjectId();

    /**
     * Get Sales Region Tree. Trees are used for (financial) reporting
     */
    int getTreeSalesRegionId();

}
