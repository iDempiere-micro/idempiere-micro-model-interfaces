package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperPickupTypes
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPickupTypes {

    /**
     * TableName=M_ShipperPickupTypes
     */
    String Table_Name = "M_ShipperPickupTypes";

    /**
     * AD_Table_ID=200042
     */
    int Table_ID = 200042;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperPickupTypesCfg_ID
     */
    String COLUMNNAME_M_ShipperPickupTypesCfg_ID = "M_ShipperPickupTypesCfg_ID";
    /**
     * Column name M_ShipperPickupTypes_ID
     */
    String COLUMNNAME_M_ShipperPickupTypes_ID = "M_ShipperPickupTypes_ID";
    /**
     * Column name M_ShipperPickupTypes_UU
     */
    String COLUMNNAME_M_ShipperPickupTypes_UU = "M_ShipperPickupTypes_UU";
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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Get Shipper. Method or manner of product delivery
     */
    int getM_Shipper_ID();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setM_Shipper_ID(int M_Shipper_ID);

    I_M_Shipper getM_Shipper() throws RuntimeException;

    /**
     * Get Shipper Pickup Types Configuration
     */
    int getM_ShipperPickupTypesCfg_ID();

    /**
     * Set Shipper Pickup Types Configuration
     */
    void setM_ShipperPickupTypesCfg_ID(int M_ShipperPickupTypesCfg_ID);

    I_M_ShipperPickupTypesCfg getM_ShipperPickupTypesCfg() throws RuntimeException;

    /**
     * Get Shipper Pickup Types
     */
    int getM_ShipperPickupTypes_ID();

    /**
     * Set Shipper Pickup Types
     */
    void setM_ShipperPickupTypes_ID(int M_ShipperPickupTypes_ID);

    /**
     * Get M_ShipperPickupTypes_UU
     */
    String getM_ShipperPickupTypes_UU();

    /**
     * Set M_ShipperPickupTypes_UU
     */
    void setM_ShipperPickupTypes_UU(String M_ShipperPickupTypes_UU);

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
