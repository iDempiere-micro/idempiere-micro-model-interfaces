package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Class_ID
     */
    String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_Group_UU
     */
    String COLUMNNAME_A_Asset_Group_UU = "A_Asset_Group_UU";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCreateAsActive
     */
    String COLUMNNAME_IsCreateAsActive = "IsCreateAsActive";
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
     * Column name IsTrackIssues
     */
    String COLUMNNAME_IsTrackIssues = "IsTrackIssues";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset class
     */
    int getA_Asset_Class_ID();

    /**
     * Set Asset class
     */
    void setA_Asset_Class_ID(int A_Asset_Class_ID);

    I_A_Asset_Class getA_Asset_Class() throws RuntimeException;

    /**
     * Get Asset Group. Group of Assets
     */
    int getA_Asset_Group_ID();

    /**
     * Set Asset Group. Group of Assets
     */
    void setA_Asset_Group_ID(int A_Asset_Group_ID);

    /**
     * Get A_Asset_Group_UU
     */
    String getA_Asset_Group_UU();

    /**
     * Set A_Asset_Group_UU
     */
    void setA_Asset_Group_UU(String A_Asset_Group_UU);

    /**
     * Get Asset Type
     */
    int getA_Asset_Type_ID();

    /**
     * Set Asset Type
     */
    void setA_Asset_Type_ID(int A_Asset_Type_ID);

    I_A_Asset_Type getA_Asset_Type() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Create As Active. Create Asset and activate it
     */
    void setIsCreateAsActive(boolean IsCreateAsActive);

    /**
     * Get Create As Active. Create Asset and activate it
     */
    boolean isCreateAsActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Depreciate. The asset will be depreciated
     */
    void setIsDepreciated(boolean IsDepreciated);

    /**
     * Get Depreciate. The asset will be depreciated
     */
    boolean isDepreciated();

    /**
     * Set IsFixedAsset
     */
    void setIsFixedAsset(boolean IsFixedAsset);

    /**
     * Get IsFixedAsset
     */
    boolean isFixedAsset();

    /**
     * Set One Asset Per UOM. Create one asset per UOM
     */
    void setIsOneAssetPerUOM(boolean IsOneAssetPerUOM);

    /**
     * Get One Asset Per UOM. Create one asset per UOM
     */
    boolean isOneAssetPerUOM();

    /**
     * Set Owned. The asset is owned by the organization
     */
    void setIsOwned(boolean IsOwned);

    /**
     * Get Owned. The asset is owned by the organization
     */
    boolean isOwned();

    /**
     * Set Track Issues. Enable tracking issues for this asset
     */
    void setIsTrackIssues(boolean IsTrackIssues);

    /**
     * Get Track Issues. Enable tracking issues for this asset
     */
    boolean isTrackIssues();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
