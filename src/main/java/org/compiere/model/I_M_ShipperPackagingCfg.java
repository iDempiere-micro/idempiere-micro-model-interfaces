package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperPackagingCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPackagingCfg {

    /**
     * TableName=M_ShipperPackagingCfg
     */
    String Table_Name = "M_ShipperPackagingCfg";

    /**
     * AD_Table_ID=200049
     */
    int Table_ID = 200049;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name M_ShipperCfg_ID
     */
    String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";
    /**
     * Column name M_ShipperPackagingCfg_ID
     */
    String COLUMNNAME_M_ShipperPackagingCfg_ID = "M_ShipperPackagingCfg_ID";
    /**
     * Column name M_ShipperPackagingCfg_UU
     */
    String COLUMNNAME_M_ShipperPackagingCfg_UU = "M_ShipperPackagingCfg_UU";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Get Shipper Configuration
     */
    int getM_ShipperCfg_ID();

    /**
     * Set Shipper Configuration
     */
    void setM_ShipperCfg_ID(int M_ShipperCfg_ID);

    I_M_ShipperCfg getM_ShipperCfg() throws RuntimeException;

    /**
     * Get Shipper Packaging Configuration
     */
    int getM_ShipperPackagingCfg_ID();

    /**
     * Set Shipper Packaging Configuration
     */
    void setM_ShipperPackagingCfg_ID(int M_ShipperPackagingCfg_ID);

    /**
     * Get M_ShipperPackagingCfg_UU
     */
    String getM_ShipperPackagingCfg_UU();

    /**
     * Set M_ShipperPackagingCfg_UU
     */
    void setM_ShipperPackagingCfg_UU(String M_ShipperPackagingCfg_UU);

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);
}
