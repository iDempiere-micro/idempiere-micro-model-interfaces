package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for A_Asset_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Group {

    /**
     * TableName=A_Asset_Group
     */
    String Table_Name = "A_Asset_Group";

    /**
     * AD_Table_ID=542
     */
    int Table_ID = 542;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Asset_Class_ID
     */
    String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsDepreciated
     */
    String COLUMNNAME_IsDepreciated = "IsDepreciated";
    /**
     * Column name IsFixedAsset
     */
    String COLUMNNAME_IsFixedAsset = "IsFixedAsset";
    /**
     * Column name IsOneAssetPerUOM
     */
    String COLUMNNAME_IsOneAssetPerUOM = "IsOneAssetPerUOM";
    /**
     * Column name IsOwned
     */
    String COLUMNNAME_IsOwned = "IsOwned";

    /**
     * Get Asset Group. Group of Assets
     */
    int getAssetGroupId();

    /**
     * Get Depreciate. The asset will be depreciated
     */
    boolean isDepreciated();

    /**
     * Get IsFixedAsset
     */
    boolean isFixedAsset();

    /**
     * Get One Asset Per UOM. Create one asset per UOM
     */
    boolean isOneAssetPerUOM();

    /**
     * Get Owned. The asset is owned by the organization
     */
    boolean isOwned();

}
