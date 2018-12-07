package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset extends HasName {

    /**
     * TableName=A_Asset
     */
    String Table_Name = "A_Asset";

    /**
     * AD_Table_ID=539
     */
    int Table_ID = 539;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Action
     */
    String COLUMNNAME_A_Asset_Action = "A_Asset_Action";
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
     * Column name A_Asset_RevalDate
     */
    String COLUMNNAME_A_Asset_RevalDate = "A_Asset_RevalDate";
    /**
     * Column name A_Asset_Status
     */
    String COLUMNNAME_A_Asset_Status = "A_Asset_Status";
    /**
     * Column name A_AssetType
     */
    String COLUMNNAME_A_AssetType = "A_AssetType";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name A_Asset_UU
     */
    String COLUMNNAME_A_Asset_UU = "A_Asset_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name A_Parent_Asset_ID
     */
    String COLUMNNAME_A_Parent_Asset_ID = "A_Parent_Asset_ID";
    /**
     * Column name A_QTY_Current
     */
    String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
    /**
     * Column name A_QTY_Original
     */
    String COLUMNNAME_A_QTY_Original = "A_QTY_Original";
    /**
     * Column name AssetActivationDate
     */
    String COLUMNNAME_AssetActivationDate = "AssetActivationDate";
    /**
     * Column name AssetDepreciationDate
     */
    String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
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
     * Column name GuaranteeDate
     */
    String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name InventoryNo
     */
    String COLUMNNAME_InventoryNo = "InventoryNo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name LastMaintenanceDate
     */
    String COLUMNNAME_LastMaintenanceDate = "LastMaintenanceDate";
    /**
     * Column name LastMaintenanceNote
     */
    String COLUMNNAME_LastMaintenanceNote = "LastMaintenanceNote";
    /**
     * Column name LastMaintenanceUnit
     */
    String COLUMNNAME_LastMaintenanceUnit = "LastMaintenanceUnit";
    /**
     * Column name Lease_BPartner_ID
     */
    String COLUMNNAME_Lease_BPartner_ID = "Lease_BPartner_ID";
    /**
     * Column name LeaseTerminationDate
     */
    String COLUMNNAME_LeaseTerminationDate = "LeaseTerminationDate";
    /**
     * Column name LifeUseUnits
     */
    String COLUMNNAME_LifeUseUnits = "LifeUseUnits";
    /**
     * Column name LocationComment
     */
    String COLUMNNAME_LocationComment = "LocationComment";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name ManufacturedYear
     */
    String COLUMNNAME_ManufacturedYear = "ManufacturedYear";
    /**
     * Column name Manufacturer
     */
    String COLUMNNAME_Manufacturer = "Manufacturer";
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
     * Column name NextMaintenenceDate
     */
    String COLUMNNAME_NextMaintenenceDate = "NextMaintenenceDate";
    /**
     * Column name NextMaintenenceUnit
     */
    String COLUMNNAME_NextMaintenenceUnit = "NextMaintenenceUnit";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name UseLifeYears
     */
    String COLUMNNAME_UseLifeYears = "UseLifeYears";
    /**
     * Column name UseUnits
     */
    String COLUMNNAME_UseUnits = "UseUnits";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name VersionNo
     */
    String COLUMNNAME_VersionNo = "VersionNo";

    /**
     * Get Asset Action
     */
    String getA_Asset_Action();

    /**
     * Set Asset Action
     */
    void setA_Asset_Action(String A_Asset_Action);

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
     * Get Create Date
     */
    Timestamp getA_Asset_CreateDate();

    /**
     * Set Create Date
     */
    void setA_Asset_CreateDate(Timestamp A_Asset_CreateDate);

    /**
     * Get Asset Group. Group of Assets
     */
    int getA_Asset_Group_ID();

    /**
     * Set Asset Group. Group of Assets
     */
    void setA_Asset_Group_ID(int A_Asset_Group_ID);

    I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    /**
     * Get Revaluation Date
     */
    Timestamp getA_Asset_RevalDate();

    /**
     * Set Revaluation Date
     */
    void setA_Asset_RevalDate(Timestamp A_Asset_RevalDate);

    /**
     * Get Asset Status
     */
    String getA_Asset_Status();

    /**
     * Set Asset Status
     */
    void setA_Asset_Status(String A_Asset_Status);

    /**
     * Get Asset Type
     */
    String getA_AssetType();

    /**
     * Set Asset Type
     */
    void setA_AssetType(String A_AssetType);

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
     * Get A_Asset_UU
     */
    String getA_Asset_UU();

    /**
     * Set A_Asset_UU
     */
    void setA_Asset_UU(String A_Asset_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Parent Asset
     */
    int getA_Parent_Asset_ID();

    /**
     * Set Parent Asset
     */
    void setA_Parent_Asset_ID(int A_Parent_Asset_ID);

    I_A_Asset getA_Parent_Asset() throws RuntimeException;

    /**
     * Get Current Qty
     */
    BigDecimal getA_QTY_Current();

    /**
     * Set Current Qty
     */
    void setA_QTY_Current(BigDecimal A_QTY_Current);

    /**
     * Get A_QTY_Original
     */
    BigDecimal getA_QTY_Original();

    /**
     * Set A_QTY_Original
     */
    void setA_QTY_Original(BigDecimal A_QTY_Original);

    /**
     * Get Activation Date
     */
    Timestamp getAssetActivationDate();

    /**
     * Set Activation Date
     */
    void setAssetActivationDate(Timestamp AssetActivationDate);

    /**
     * Get Asset Depreciation Date. Date of last depreciation
     */
    Timestamp getAssetDepreciationDate();

    /**
     * Set Asset Depreciation Date. Date of last depreciation
     */
    void setAssetDepreciationDate(Timestamp AssetDepreciationDate);

    /**
     * Get Asset Disposal Date. Date when the asset is/was disposed
     */
    Timestamp getAssetDisposalDate();

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
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get BPartner (Agent). Business Partner (Agent or Sales Rep)
     */
    int getC_BPartnerSR_ID();

    /**
     * Set BPartner (Agent). Business Partner (Agent or Sales Rep)
     */
    void setC_BPartnerSR_ID(int C_BPartnerSR_ID);

    I_C_BPartner getC_BPartnerSR() throws RuntimeException;

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Set Address. Location or Address
     */
    void setC_Location_ID(int C_Location_ID);

    I_C_Location getC_Location() throws RuntimeException;

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Guarantee Date. Date when guarantee expires
     */
    Timestamp getGuaranteeDate();

    /**
     * Set Guarantee Date. Date when guarantee expires
     */
    void setGuaranteeDate(Timestamp GuaranteeDate);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Disposed. The asset is disposed
     */
    boolean isDisposed();

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
     * Get In Possession. The asset is in the possession of the organization
     */
    boolean isInPosession();

    /**
     * Set Owned. The asset is owned by the organization
     */
    void setIsOwned(boolean IsOwned);

    /**
     * Get Owned. The asset is owned by the organization
     */
    boolean isOwned();

    /**
     * Get Last Maintenance. Last Maintenance Date
     */
    Timestamp getLastMaintenanceDate();

    /**
     * Set Last Maintenance. Last Maintenance Date
     */
    void setLastMaintenanceDate(Timestamp LastMaintenanceDate);

    /**
     * Get Last Note. Last Maintenance Note
     */
    String getLastMaintenanceNote();

    /**
     * Set Last Note. Last Maintenance Note
     */
    void setLastMaintenanceNote(String LastMaintenanceNote);

    /**
     * Get Last Unit. Last Maintenance Unit
     */
    int getLastMaintenanceUnit();

    /**
     * Set Last Unit. Last Maintenance Unit
     */
    void setLastMaintenanceUnit(int LastMaintenanceUnit);

    /**
     * Get Lessor. The Business Partner who rents or leases
     */
    int getLease_BPartner_ID();

    /**
     * Set Lessor. The Business Partner who rents or leases
     */
    void setLease_BPartner_ID(int Lease_BPartner_ID);

    I_C_BPartner getLease_BPartner() throws RuntimeException;

    /**
     * Get Lease Termination. Lease Termination Date
     */
    Timestamp getLeaseTerminationDate();

    /**
     * Set Lease Termination. Lease Termination Date
     */
    void setLeaseTerminationDate(Timestamp LeaseTerminationDate);

    /**
     * Get Life use. Units of use until the asset is not usable anymore
     */
    int getLifeUseUnits();

    /**
     * Set Life use. Units of use until the asset is not usable anymore
     */
    void setLifeUseUnits(int LifeUseUnits);

    /**
     * Get Location comment. Additional comments or remarks concerning the location
     */
    String getLocationComment();

    /**
     * Set Location comment. Additional comments or remarks concerning the location
     */
    void setLocationComment(String LocationComment);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

    /**
     * Get Manufactured Year
     */
    int getManufacturedYear();

    /**
     * Set Manufactured Year
     */
    void setManufacturedYear(int ManufacturedYear);

    /**
     * Get Manufacturer. Manufacturer of the Product
     */
    String getManufacturer();

    /**
     * Set Manufacturer. Manufacturer of the Product
     */
    void setManufacturer(String Manufacturer);

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setM_InOutLine_ID(int M_InOutLine_ID);

    I_M_InOutLine getM_InOutLine() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

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
     * Get Next Maintenence. Next Maintenence Date
     */
    Timestamp getNextMaintenenceDate();

    /**
     * Set Next Maintenence. Next Maintenence Date
     */
    void setNextMaintenenceDate(Timestamp NextMaintenenceDate);

    /**
     * Get Next Unit. Next Maintenence Unit
     */
    int getNextMaintenenceUnit();

    /**
     * Set Next Unit. Next Maintenence Unit
     */
    void setNextMaintenenceUnit(int NextMaintenenceUnit);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Usable Life - Months. Months of the usable life of the asset
     */
    int getUseLifeMonths();

    /**
     * Set Usable Life - Months. Months of the usable life of the asset
     */
    void setUseLifeMonths(int UseLifeMonths);

    /**
     * Get Usable Life - Years. Years of the usable life of the asset
     */
    int getUseLifeYears();

    /**
     * Set Usable Life - Years. Years of the usable life of the asset
     */
    void setUseLifeYears(int UseLifeYears);

    /**
     * Get Use units. Currently used units of the assets
     */
    int getUseUnits();

    /**
     * Set Use units. Currently used units of the assets
     */
    void setUseUnits(int UseUnits);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Version No. Version Number
     */
    String getVersionNo();

    /**
     * Set Version No. Version Number
     */
    void setVersionNo(String VersionNo);
}
