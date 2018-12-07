package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperCfg {

    /**
     * TableName=M_ShipperCfg
     */
    String Table_Name = "M_ShipperCfg";

    /**
     * AD_Table_ID=200047
     */
    int Table_ID = 200047;

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
     * Column name CopyFrom
     */
    String COLUMNNAME_CopyFrom = "CopyFrom";
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
     * Column name IsInternational
     */
    String COLUMNNAME_IsInternational = "IsInternational";
    /**
     * Column name IsOnline
     */
    String COLUMNNAME_IsOnline = "IsOnline";
    /**
     * Column name IsResidential
     */
    String COLUMNNAME_IsResidential = "IsResidential";
    /**
     * Column name IsSaturdayDelivery
     */
    String COLUMNNAME_IsSaturdayDelivery = "IsSaturdayDelivery";
    /**
     * Column name M_ShipperCfg_ID
     */
    String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";
    /**
     * Column name M_ShipperCfg_UU
     */
    String COLUMNNAME_M_ShipperCfg_UU = "M_ShipperCfg_UU";
    /**
     * Column name M_ShippingProcessorCfg_ID
     */
    String COLUMNNAME_M_ShippingProcessorCfg_ID = "M_ShippingProcessorCfg_ID";
    /**
     * Column name ShippingServiceCode
     */
    String COLUMNNAME_ShippingServiceCode = "ShippingServiceCode";
    /**
     * Column name TrackingURL
     */
    String COLUMNNAME_TrackingURL = "TrackingURL";
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
     * Get Copy From. Copy From Record
     */
    String getCopyFrom();

    /**
     * Set Copy From. Copy From Record
     */
    void setCopyFrom(String CopyFrom);

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
     * Set International
     */
    void setIsInternational(boolean IsInternational);

    /**
     * Get International
     */
    boolean isInternational();

    /**
     * Set Online Access. Can be accessed online
     */
    void setIsOnline(boolean IsOnline);

    /**
     * Get Online Access. Can be accessed online
     */
    boolean isOnline();

    /**
     * Set Residential
     */
    void setIsResidential(boolean IsResidential);

    /**
     * Get Residential
     */
    boolean isResidential();

    /**
     * Set Saturday Delivery
     */
    void setIsSaturdayDelivery(boolean IsSaturdayDelivery);

    /**
     * Get Saturday Delivery
     */
    boolean isSaturdayDelivery();

    /**
     * Get Shipper Configuration
     */
    int getM_ShipperCfg_ID();

    /**
     * Set Shipper Configuration
     */
    void setM_ShipperCfg_ID(int M_ShipperCfg_ID);

    /**
     * Get M_ShipperCfg_UU
     */
    String getM_ShipperCfg_UU();

    /**
     * Set M_ShipperCfg_UU
     */
    void setM_ShipperCfg_UU(String M_ShipperCfg_UU);

    /**
     * Get Shipping Processor Configuration
     */
    int getM_ShippingProcessorCfg_ID();

    /**
     * Set Shipping Processor Configuration
     */
    void setM_ShippingProcessorCfg_ID(int M_ShippingProcessorCfg_ID);

    I_M_ShippingProcessorCfg getM_ShippingProcessorCfg() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Service Code
     */
    String getShippingServiceCode();

    /**
     * Set Service Code
     */
    void setShippingServiceCode(String ShippingServiceCode);

    /**
     * Get Tracking URL. URL of the shipper to track shipments
     */
    String getTrackingURL();

    /**
     * Set Tracking URL. URL of the shipper to track shipments
     */
    void setTrackingURL(String TrackingURL);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
