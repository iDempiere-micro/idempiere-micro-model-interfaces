package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for A_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface Asset extends PersistentObject, HasName {

    /**
     * TableName=A_Asset
     */
    String Table_Name = "A_Asset";

    /**
     * AD_Table_ID=539
     */
    int Table_ID = 539;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Asset_Class_ID
     */
    String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
    /**
     * Column name A_Asset_CreateDate
     */
    String COLUMNNAME_A_Asset_CreateDate = "A_Asset_CreateDate";
    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Status
     */
    String COLUMNNAME_A_Asset_Status = "A_Asset_Status";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name A_Parent_Asset_ID
     */
    String COLUMNNAME_A_Parent_Asset_ID = "A_Parent_Asset_ID";
    /**
     * Column name AssetActivationDate
     */
    String COLUMNNAME_AssetActivationDate = "AssetActivationDate";
    /**
     * Column name AssetDisposalDate
     */
    String COLUMNNAME_AssetDisposalDate = "AssetDisposalDate";
    /**
     * Column name AssetServiceDate
     */
    String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_BPartnerSR_ID
     */
    String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name InventoryNo
     */
    String COLUMNNAME_InventoryNo = "InventoryNo";
    /**
     * Column name IsDepreciated
     */
    String COLUMNNAME_IsDepreciated = "IsDepreciated";
    /**
     * Column name IsDisposed
     */
    String COLUMNNAME_IsDisposed = "IsDisposed";
    /**
     * Column name IsFullyDepreciated
     */
    String COLUMNNAME_IsFullyDepreciated = "IsFullyDepreciated";
    /**
     * Column name IsInPosession
     */
    String COLUMNNAME_IsInPosession = "IsInPosession";
    /**
     * Column name IsOwned
     */
    String COLUMNNAME_IsOwned = "IsOwned";
    /**
     * Column name Lease_BPartner_ID
     */
    String COLUMNNAME_Lease_BPartner_ID = "Lease_BPartner_ID";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name VersionNo
     */
    String COLUMNNAME_VersionNo = "VersionNo";

    /**
     * Set Create Date
     */
    void setAssetCreateDate(Timestamp A_Asset_CreateDate);

    /**
     * Get Asset Group. Group of Assets
     */
    int getAssetGroupId();

    /**
     * Set Asset Group. Group of Assets
     */
    void setAssetGroupId(int A_Asset_Group_ID);

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getAssetId();

    /**
     * Get Asset Status
     */
    String getAssetStatus();

    /**
     * Set Asset Status
     */
    void setAssetStatus(String A_Asset_Status);

    /**
     * Get Asset Type
     */
    int getAssetTypeId();

    AssetType getAssetType() throws RuntimeException;

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Parent Asset
     */
    int getParentAssetId();

    /**
     * Set Parent Asset
     */
    void setParentAssetId(int A_Parent_Asset_ID);

    /**
     * Get Activation Date
     */
    Timestamp getAssetActivationDate();

    /**
     * Set Activation Date
     */
    void setAssetActivationDate(Timestamp AssetActivationDate);

    /**
     * Set Asset Disposal Date. Date when the asset is/was disposed
     */
    void setAssetDisposalDate(Timestamp AssetDisposalDate);

    /**
     * Get In Service Date. Date when Asset was put into service
     */
    Timestamp getAssetServiceDate();

    /**
     * Set In Service Date. Date when Asset was put into service
     */
    void setAssetServiceDate(Timestamp AssetServiceDate);

    /**
     * Set Activity. Business Activity
     */
    void setActivityId(int C_Activity_ID);

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getBPartnerLocationId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Inventory No
     */
    String getInventoryNo();

    /**
     * Set Inventory No
     */
    void setInventoryNo(String InventoryNo);

    /**
     * Set Depreciate. The asset will be depreciated
     */
    void setIsDepreciated(boolean IsDepreciated);

    /**
     * Get Depreciate. The asset will be depreciated
     */
    boolean isDepreciated();

    /**
     * Set Disposed. The asset is disposed
     */
    void setIsDisposed(boolean IsDisposed);

    /**
     * Set Fully depreciated. The asset is fully depreciated
     */
    void setIsFullyDepreciated(boolean IsFullyDepreciated);

    /**
     * Get Fully depreciated. The asset is fully depreciated
     */
    boolean isFullyDepreciated();

    /**
     * Set In Possession. The asset is in the possession of the organization
     */
    void setIsInPosession(boolean IsInPosession);

    /**
     * Set Owned. The asset is owned by the organization
     */
    void setIsOwned(boolean IsOwned);

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

    /**
     * Set Serial No. Product Serial Number
     */
    void setSerNo(String SerNo);

    /**
     * Get Usable Life - Months. Months of the usable life of the asset
     */
    int getUseLifeMonths();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Set Version No. Version Number
     */
    void setVersionNo(String VersionNo);
}
