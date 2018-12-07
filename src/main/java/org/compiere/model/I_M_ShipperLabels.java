package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperLabels
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabels {

    /**
     * TableName=M_ShipperLabels
     */
    String Table_Name = "M_ShipperLabels";

    /**
     * AD_Table_ID=200040
     */
    int Table_ID = 200040;

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
     * Column name LabelPrintMethod
     */
    String COLUMNNAME_LabelPrintMethod = "LabelPrintMethod";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperLabelsCfg_ID
     */
    String COLUMNNAME_M_ShipperLabelsCfg_ID = "M_ShipperLabelsCfg_ID";
    /**
     * Column name M_ShipperLabels_ID
     */
    String COLUMNNAME_M_ShipperLabels_ID = "M_ShipperLabels_ID";
    /**
     * Column name M_ShipperLabels_UU
     */
    String COLUMNNAME_M_ShipperLabels_UU = "M_ShipperLabels_UU";
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
     * Get Label Print Method
     */
    String getLabelPrintMethod();

    /**
     * Set Label Print Method
     */
    void setLabelPrintMethod(String LabelPrintMethod);

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
     * Get Shipper Labels Configuration
     */
    int getM_ShipperLabelsCfg_ID();

    /**
     * Set Shipper Labels Configuration
     */
    void setM_ShipperLabelsCfg_ID(int M_ShipperLabelsCfg_ID);

    I_M_ShipperLabelsCfg getM_ShipperLabelsCfg() throws RuntimeException;

    /**
     * Get Shipper Labels
     */
    int getM_ShipperLabels_ID();

    /**
     * Set Shipper Labels
     */
    void setM_ShipperLabels_ID(int M_ShipperLabels_ID);

    /**
     * Get M_ShipperLabels_UU
     */
    String getM_ShipperLabels_UU();

    /**
     * Set M_ShipperLabels_UU
     */
    void setM_ShipperLabels_UU(String M_ShipperLabels_UU);

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
