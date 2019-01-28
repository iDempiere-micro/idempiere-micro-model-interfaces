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

  /** TableName=A_Asset */
  String Table_Name = "A_Asset";

  /** AD_Table_ID=539 */
  int Table_ID = 539;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_Action */
  String COLUMNNAME_A_Asset_Action = "A_Asset_Action";
  /** Column name A_Asset_Class_ID */
  String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
  /** Column name A_Asset_CreateDate */
  String COLUMNNAME_A_Asset_CreateDate = "A_Asset_CreateDate";
  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_RevalDate */
  String COLUMNNAME_A_Asset_RevalDate = "A_Asset_RevalDate";
  /** Column name A_Asset_Status */
  String COLUMNNAME_A_Asset_Status = "A_Asset_Status";
  /** Column name A_AssetType */
  String COLUMNNAME_A_AssetType = "A_AssetType";
  /** Column name A_Asset_Type_ID */
  String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
  /** Column name A_Asset_UU */
  String COLUMNNAME_A_Asset_UU = "A_Asset_UU";
    /** Column name A_Parent_Asset_ID */
  String COLUMNNAME_A_Parent_Asset_ID = "A_Parent_Asset_ID";
  /** Column name A_QTY_Current */
  String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
  /** Column name A_QTY_Original */
  String COLUMNNAME_A_QTY_Original = "A_QTY_Original";
  /** Column name AssetActivationDate */
  String COLUMNNAME_AssetActivationDate = "AssetActivationDate";
  /** Column name AssetDepreciationDate */
  String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
  /** Column name AssetDisposalDate */
  String COLUMNNAME_AssetDisposalDate = "AssetDisposalDate";
  /** Column name AssetServiceDate */
  String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BPartnerSR_ID */
  String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GuaranteeDate */
  String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name InventoryNo */
  String COLUMNNAME_InventoryNo = "InventoryNo";
    /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name IsDisposed */
  String COLUMNNAME_IsDisposed = "IsDisposed";
  /** Column name IsFullyDepreciated */
  String COLUMNNAME_IsFullyDepreciated = "IsFullyDepreciated";
  /** Column name IsInPosession */
  String COLUMNNAME_IsInPosession = "IsInPosession";
  /** Column name IsOwned */
  String COLUMNNAME_IsOwned = "IsOwned";
  /** Column name LastMaintenanceDate */
  String COLUMNNAME_LastMaintenanceDate = "LastMaintenanceDate";
  /** Column name LastMaintenanceNote */
  String COLUMNNAME_LastMaintenanceNote = "LastMaintenanceNote";
  /** Column name LastMaintenanceUnit */
  String COLUMNNAME_LastMaintenanceUnit = "LastMaintenanceUnit";
  /** Column name Lease_BPartner_ID */
  String COLUMNNAME_Lease_BPartner_ID = "Lease_BPartner_ID";
  /** Column name LeaseTerminationDate */
  String COLUMNNAME_LeaseTerminationDate = "LeaseTerminationDate";
  /** Column name LifeUseUnits */
  String COLUMNNAME_LifeUseUnits = "LifeUseUnits";
  /** Column name LocationComment */
  String COLUMNNAME_LocationComment = "LocationComment";
  /** Column name Lot */
  String COLUMNNAME_Lot = "Lot";
  /** Column name ManufacturedYear */
  String COLUMNNAME_ManufacturedYear = "ManufacturedYear";
  /** Column name Manufacturer */
  String COLUMNNAME_Manufacturer = "Manufacturer";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name NextMaintenenceDate */
  String COLUMNNAME_NextMaintenenceDate = "NextMaintenenceDate";
  /** Column name NextMaintenenceUnit */
  String COLUMNNAME_NextMaintenenceUnit = "NextMaintenenceUnit";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SerNo */
  String COLUMNNAME_SerNo = "SerNo";
    /** Column name UseLifeMonths */
  String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
  /** Column name UseLifeYears */
  String COLUMNNAME_UseLifeYears = "UseLifeYears";
  /** Column name UseUnits */
  String COLUMNNAME_UseUnits = "UseUnits";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name VersionNo */
  String COLUMNNAME_VersionNo = "VersionNo";

    /** Get Asset class */
  int getA_Asset_Class_ID();

    /** Set Create Date */
  void setA_Asset_CreateDate(Timestamp A_Asset_CreateDate);

  /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

  /** Set Asset Group. Group of Assets */
  void setA_Asset_Group_ID(int A_Asset_Group_ID);

    /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

    /** Get Asset Status */
  String getA_Asset_Status();

  /** Set Asset Status */
  void setA_Asset_Status(String A_Asset_Status);

    /** Get Asset Type */
  int getA_Asset_Type_ID();

    I_A_Asset_Type getA_Asset_Type() throws RuntimeException;

    /** Get Organization. Organizational entity within client */
  int getOrgId();

    /** Get Parent Asset */
  int getA_Parent_Asset_ID();

  /** Set Parent Asset */
  void setA_Parent_Asset_ID(int A_Parent_Asset_ID);

    /** Get Activation Date */
  Timestamp getAssetActivationDate();

  /** Set Activation Date */
  void setAssetActivationDate(Timestamp AssetActivationDate);

    /** Set Asset Disposal Date. Date when the asset is/was disposed */
  void setAssetDisposalDate(Timestamp AssetDisposalDate);

  /** Get In Service Date. Date when Asset was put into service */
  Timestamp getAssetServiceDate();

  /** Set In Service Date. Date when Asset was put into service */
  void setAssetServiceDate(Timestamp AssetServiceDate);

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

    /** Get BPartner (Agent). Business Partner (Agent or Sales Rep) */
  int getC_BPartnerSR_ID();

    /** Get Address. Location or Address */
  int getC_Location_ID();

    /** Get Project. Financial Project */
  int getC_Project_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

    /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Inventory No */
  String getInventoryNo();

  /** Set Inventory No */
  void setInventoryNo(String InventoryNo);

    /** Set Depreciate. The asset will be depreciated */
  void setIsDepreciated(boolean IsDepreciated);

  /** Get Depreciate. The asset will be depreciated */
  boolean isDepreciated();

  /** Set Disposed. The asset is disposed */
  void setIsDisposed(boolean IsDisposed);

    /** Set Fully depreciated. The asset is fully depreciated */
  void setIsFullyDepreciated(boolean IsFullyDepreciated);

  /** Get Fully depreciated. The asset is fully depreciated */
  boolean isFullyDepreciated();

  /** Set In Possession. The asset is in the possession of the organization */
  void setIsInPosession(boolean IsInPosession);

    /** Set Owned. The asset is owned by the organization */
  void setIsOwned(boolean IsOwned);

    /** Get Lessor. The Business Partner who rents or leases */
  int getLease_BPartner_ID();

    /** Set Lot No. Lot number (alphanumeric) */
  void setLot(String Lot);

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

    /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Serial No. Product Serial Number */
  String getSerNo();

  /** Set Serial No. Product Serial Number */
  void setSerNo(String SerNo);

    /** Get Usable Life - Months. Months of the usable life of the asset */
  int getUseLifeMonths();

    /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

    /** Set Version No. Version Number */
  void setVersionNo(String VersionNo);
}
