package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_FixedAsset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_FixedAsset {

    /**
     * AD_Table_ID=53277
     */
    int Table_ID = 53277;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name A_Asset_Cost
     */
    String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name A_Remaining_Period
     */
    String COLUMNNAME_A_Remaining_Period = "A_Remaining_Period";
    /**
     * Column name AssetDepreciationDate
     */
    String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
    /**
     * Column name AssetServiceDate
     */
    String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
    /**
     * Column name C_BPartnerSR_ID
     */
    String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
    /**
     * Column name C_City_ID
     */
    String COLUMNNAME_C_City_ID = "C_City_ID";
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
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name InventoryNo
     */
    String COLUMNNAME_InventoryNo = "InventoryNo";
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
     * Column name ProductValue
     */
    String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name UseLifeMonths
     */
    String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
    /**
     * Column name UseLifeMonths_F
     */
    String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

    /**
     * Get Asset Group. Group of Assets
     */
    int getAssetGroupId();

    /**
     * Get In Service Date. Date when Asset was put into service
     */
    Timestamp getAssetServiceDate();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Inventory No
     */
    String getInventoryNo();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Set Product Key. Key of the Product
     */
    void setProductValue(String ProductValue);

}
