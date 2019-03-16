package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for PA_GoalRestriction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_GoalRestriction {

    /**
     * AD_Table_ID=832
     */
    int Table_ID = 832;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name GoalRestrictionType
     */
    String COLUMNNAME_GoalRestrictionType = "GoalRestrictionType";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Org_ID
     */
    String COLUMNNAME_Org_ID = "Org_ID";
    /**
     * Column name PA_Goal_ID
     */
    String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getBPGroupId();

    /**
     * Get Restriction Type. Goal Restriction Type
     */
    String getGoalRestrictionType();

    /**
     * Get Product Category. Category of a Product
     */
    int getProductCategoryId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

}
