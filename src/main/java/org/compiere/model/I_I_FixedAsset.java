package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_FixedAsset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_FixedAsset {

  /** TableName=I_FixedAsset */
  String Table_Name = "I_FixedAsset";

  /** AD_Table_ID=53277 */
  int Table_ID = 53277;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Accumulated_Depr_F */
  String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
  /** Column name A_Asset_Class_ID */
  String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
  /** Column name A_Asset_Class_Value */
  String COLUMNNAME_A_Asset_Class_Value = "A_Asset_Class_Value";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
  /** Column name A_Asset_Group_Value */
  String COLUMNNAME_A_Asset_Group_Value = "A_Asset_Group_Value";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Type_ID */
  String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
  /** Column name A_Asset_Type_Value */
  String COLUMNNAME_A_Asset_Type_Value = "A_Asset_Type_Value";
  /** Column name A_Current_Period */
  String COLUMNNAME_A_Current_Period = "A_Current_Period";
    /** Column name A_Remaining_Period */
  String COLUMNNAME_A_Remaining_Period = "A_Remaining_Period";
  /** Column name A_Salvage_Value */
  String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
  /** Column name AssetDepreciationDate */
  String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
  /** Column name AssetPeriodDepreciationAmt */
  String COLUMNNAME_AssetPeriodDepreciationAmt = "AssetPeriodDepreciationAmt";
  /** Column name AssetServiceDate */
  String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
  /** Column name BPartner_Value */
  String COLUMNNAME_BPartner_Value = "BPartner_Value";
  /** Column name C_BPartnerSR_ID */
  String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
  /** Column name C_City_ID */
  String COLUMNNAME_C_City_ID = "C_City_ID";
  /** Column name C_City_Value */
  String COLUMNNAME_C_City_Value = "C_City_Value";
    /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_FixedAsset_ID */
  String COLUMNNAME_I_FixedAsset_ID = "I_FixedAsset_ID";
  /** Column name I_FixedAsset_UU */
  String COLUMNNAME_I_FixedAsset_UU = "I_FixedAsset_UU";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name InventoryNo */
  String COLUMNNAME_InventoryNo = "InventoryNo";
    /** Column name LocatorValue */
  String COLUMNNAME_LocatorValue = "LocatorValue";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProductValue */
  String COLUMNNAME_ProductValue = "ProductValue";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name UOMSymbol */
  String COLUMNNAME_UOMSymbol = "UOMSymbol";
    /** Column name UseLifeMonths */
  String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
  /** Column name UseLifeMonths_F */
  String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

    /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

    /** Get Asset class */
  int getA_Asset_Class_ID();

    /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

    /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

  /** Set Asset Group. Group of Assets */
  void setA_Asset_Group_ID(int A_Asset_Group_ID);

    /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

    /** Get Asset Type */
  int getA_Asset_Type_ID();

    /** Get Remaining Period */
  int getA_Remaining_Period();

    /** Get Asset Depreciation Date. Date of last depreciation */
  Timestamp getAssetDepreciationDate();

    /** Get In Service Date. Date when Asset was put into service */
  Timestamp getAssetServiceDate();

    /** Get BPartner (Agent). Business Partner (Agent or Sales Rep) */
  int getC_BPartnerSR_ID();

    /** Get City. City */
  int getC_City_ID();

    /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

    /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  String getDescription();

    /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

    /** Get Inventory No */
  String getInventoryNo();

    /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Get Product Key. Key of the Product */
  String getProductValue();

  /** Set Product Key. Key of the Product */
  void setProductValue(String ProductValue);

    /** Get Usable Life - Months. Months of the usable life of the asset */
  int getUseLifeMonths();

    /** Get Use Life - Months (fiscal) */
  int getUseLifeMonths_F();

}
