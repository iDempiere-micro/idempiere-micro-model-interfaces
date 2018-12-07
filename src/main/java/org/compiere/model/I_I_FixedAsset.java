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

    /**
     * TableName=I_FixedAsset
     */
    String Table_Name = "I_FixedAsset";

    /**
     * AD_Table_ID=53277
     */
    int Table_ID = 53277;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Accumulated_Depr
     */
    String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
    /**
     * Column name A_Accumulated_Depr_F
     */
    String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
    /**
     * Column name A_Asset_Class_ID
     */
    String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
    /**
     * Column name A_Asset_Class_Value
     */
    String COLUMNNAME_A_Asset_Class_Value = "A_Asset_Class_Value";
    /**
     * Column name A_Asset_Cost
     */
    String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_Group_Value
     */
    String COLUMNNAME_A_Asset_Group_Value = "A_Asset_Group_Value";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name A_Asset_Type_Value
     */
    String COLUMNNAME_A_Asset_Type_Value = "A_Asset_Type_Value";
    /**
     * Column name A_Current_Period
     */
    String COLUMNNAME_A_Current_Period = "A_Current_Period";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Remaining_Period
     */
    String COLUMNNAME_A_Remaining_Period = "A_Remaining_Period";
    /**
     * Column name A_Salvage_Value
     */
    String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
    /**
     * Column name AssetDepreciationDate
     */
    String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
    /**
     * Column name AssetPeriodDepreciationAmt
     */
    String COLUMNNAME_AssetPeriodDepreciationAmt = "AssetPeriodDepreciationAmt";
    /**
     * Column name AssetServiceDate
     */
    String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
    /**
     * Column name BPartner_Value
     */
    String COLUMNNAME_BPartner_Value = "BPartner_Value";
    /**
     * Column name C_BPartnerSR_ID
     */
    String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
    /**
     * Column name C_City_ID
     */
    String COLUMNNAME_C_City_ID = "C_City_ID";
    /**
     * Column name C_City_Value
     */
    String COLUMNNAME_C_City_Value = "C_City_Value";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_FixedAsset_ID
     */
    String COLUMNNAME_I_FixedAsset_ID = "I_FixedAsset_ID";
    /**
     * Column name I_FixedAsset_UU
     */
    String COLUMNNAME_I_FixedAsset_UU = "I_FixedAsset_UU";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name InventoryNo
     */
    String COLUMNNAME_InventoryNo = "InventoryNo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LocatorValue
     */
    String COLUMNNAME_LocatorValue = "LocatorValue";
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
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductValue
     */
    String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name UOMSymbol
     */
    String COLUMNNAME_UOMSymbol = "UOMSymbol";
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
     * Column name UseLifeMonths_F
     */
    String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

    /**
     * Get Accumulated Depreciation
     */
    BigDecimal getA_Accumulated_Depr();

    /**
     * Set Accumulated Depreciation
     */
    void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

    /**
     * Get Accumulated Depreciation (fiscal)
     */
    BigDecimal getA_Accumulated_Depr_F();

    /**
     * Set Accumulated Depreciation (fiscal)
     */
    void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

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
     * Get Asset Class Key
     */
    String getA_Asset_Class_Value();

    /**
     * Set Asset Class Key
     */
    void setA_Asset_Class_Value(String A_Asset_Class_Value);

    /**
     * Get Asset Cost
     */
    BigDecimal getA_Asset_Cost();

    /**
     * Set Asset Cost
     */
    void setA_Asset_Cost(BigDecimal A_Asset_Cost);

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
     * Get Asset Group Key
     */
    String getA_Asset_Group_Value();

    /**
     * Set Asset Group Key
     */
    void setA_Asset_Group_Value(String A_Asset_Group_Value);

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

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
     * Get Asset Type Value
     */
    String getA_Asset_Type_Value();

    /**
     * Set Asset Type Value
     */
    void setA_Asset_Type_Value(String A_Asset_Type_Value);

    /**
     * Get Current Period
     */
    int getA_Current_Period();

    /**
     * Set Current Period
     */
    void setA_Current_Period(int A_Current_Period);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Remaining Period
     */
    int getA_Remaining_Period();

    /**
     * Set Remaining Period
     */
    void setA_Remaining_Period(int A_Remaining_Period);

    /**
     * Get Asset Salvage Value
     */
    BigDecimal getA_Salvage_Value();

    /**
     * Set Asset Salvage Value
     */
    void setA_Salvage_Value(BigDecimal A_Salvage_Value);

    /**
     * Get Asset Depreciation Date. Date of last depreciation
     */
    Timestamp getAssetDepreciationDate();

    /**
     * Set Asset Depreciation Date. Date of last depreciation
     */
    void setAssetDepreciationDate(Timestamp AssetDepreciationDate);

    /**
     * Get Depreciation Amount / Period. Applies to Straight Line depreciation
     */
    BigDecimal getAssetPeriodDepreciationAmt();

    /**
     * Set Depreciation Amount / Period. Applies to Straight Line depreciation
     */
    void setAssetPeriodDepreciationAmt(BigDecimal AssetPeriodDepreciationAmt);

    /**
     * Get In Service Date. Date when Asset was put into service
     */
    Timestamp getAssetServiceDate();

    /**
     * Set In Service Date. Date when Asset was put into service
     */
    void setAssetServiceDate(Timestamp AssetServiceDate);

    /**
     * Get Business Partner Key. The Key of the Business Partner
     */
    String getBPartner_Value();

    /**
     * Set Business Partner Key. The Key of the Business Partner
     */
    void setBPartner_Value(String BPartner_Value);

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
     * Get City. City
     */
    int getC_City_ID();

    /**
     * Set City. City
     */
    void setC_City_ID(int C_City_ID);

    I_C_City getC_City() throws RuntimeException;

    /**
     * Get City Value
     */
    String getC_City_Value();

    /**
     * Set City Value
     */
    void setC_City_Value(String C_City_Value);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported Fixed Asset
     */
    int getI_FixedAsset_ID();

    /**
     * Set Imported Fixed Asset
     */
    void setI_FixedAsset_ID(int I_FixedAsset_ID);

    /**
     * Get I_FixedAsset_UU
     */
    String getI_FixedAsset_UU();

    /**
     * Set I_FixedAsset_UU
     */
    void setI_FixedAsset_UU(String I_FixedAsset_UU);

    /**
     * Get Imported. Has this import been processed
     */
    boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

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
     * Get Locator Key. Key of the Warehouse Locator
     */
    String getLocatorValue();

    /**
     * Set Locator Key. Key of the Warehouse Locator
     */
    void setLocatorValue(String LocatorValue);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

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
     * Get Product Key. Key of the Product
     */
    String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    void setProductValue(String ProductValue);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Symbol. Symbol for a Unit of Measure
     */
    String getUOMSymbol();

    /**
     * Set Symbol. Symbol for a Unit of Measure
     */
    void setUOMSymbol(String UOMSymbol);

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
     * Get Use Life - Months (fiscal)
     */
    int getUseLifeMonths_F();

    /**
     * Set Use Life - Months (fiscal)
     */
    void setUseLifeMonths_F(int UseLifeMonths_F);
}
