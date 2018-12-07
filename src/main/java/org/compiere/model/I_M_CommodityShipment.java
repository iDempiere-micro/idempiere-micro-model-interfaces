package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CommodityShipment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CommodityShipment {

    /**
     * TableName=M_CommodityShipment
     */
    String Table_Name = "M_CommodityShipment";

    /**
     * AD_Table_ID=200045
     */
    int Table_ID = 200045;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CountryOfManufacture_ID
     */
    String COLUMNNAME_CountryOfManufacture_ID = "CountryOfManufacture_ID";
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
     * Column name ExportLicenseNum
     */
    String COLUMNNAME_ExportLicenseNum = "ExportLicenseNum";
    /**
     * Column name HarmonizedCode
     */
    String COLUMNNAME_HarmonizedCode = "HarmonizedCode";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_CommodityShipment_ID
     */
    String COLUMNNAME_M_CommodityShipment_ID = "M_CommodityShipment_ID";
    /**
     * Column name M_CommodityShipment_UU
     */
    String COLUMNNAME_M_CommodityShipment_UU = "M_CommodityShipment_UU";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Country Of Manufacture
     */
    int getCountryOfManufacture_ID();

    /**
     * Set Country Of Manufacture
     */
    void setCountryOfManufacture_ID(int CountryOfManufacture_ID);

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
     * Get Export License Number
     */
    String getExportLicenseNum();

    /**
     * Set Export License Number
     */
    void setExportLicenseNum(String ExportLicenseNum);

    /**
     * Get Harmonized Code
     */
    String getHarmonizedCode();

    /**
     * Set Harmonized Code
     */
    void setHarmonizedCode(String HarmonizedCode);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Commodity Shipment
     */
    int getM_CommodityShipment_ID();

    /**
     * Set Commodity Shipment
     */
    void setM_CommodityShipment_ID(int M_CommodityShipment_ID);

    /**
     * Get M_CommodityShipment_UU
     */
    String getM_CommodityShipment_UU();

    /**
     * Set M_CommodityShipment_UU
     */
    void setM_CommodityShipment_UU(String M_CommodityShipment_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
