package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Product_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_Category {

    /**
     * TableName=M_Product_Category
     */
    String Table_Name = "M_Product_Category";

    /**
     * AD_Table_ID=209
     */
    int Table_ID = 209;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name MMPolicy
     */
    String COLUMNNAME_MMPolicy = "MMPolicy";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_Category_Parent_ID
     */
    String COLUMNNAME_M_Product_Category_Parent_ID = "M_Product_Category_Parent_ID";
    /**
     * Column name PlannedMargin
     */
    String COLUMNNAME_PlannedMargin = "PlannedMargin";

    /**
     * Get Asset Group. Group of Assets
     */
    int getAssetGroupId();

    AssetGroup getAssetGroup() throws RuntimeException;

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Material Policy. Material Movement Policy
     */
    String getMMPolicy();

    /**
     * Set Material Policy. Material Movement Policy
     */
    void setMMPolicy(String MMPolicy);

    /**
     * Get Product Category. Category of a Product
     */
    int getProductCategoryId();

    /**
     * Get Parent Product Category
     */
    int getProductCategoryParentId();

    /**
     * Get Planned Margin %. Project's planned margin as a percentage
     */
    BigDecimal getPlannedMargin();

    /**
     * Set Planned Margin %. Project's planned margin as a percentage
     */
    void setPlannedMargin(BigDecimal PlannedMargin);

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setSearchKey(String Value);
}
