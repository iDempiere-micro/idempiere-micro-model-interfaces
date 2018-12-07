package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_UOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_UOM {

    /**
     * TableName=C_UOM
     */
    String Table_Name = "C_UOM";

    /**
     * AD_Table_ID=146
     */
    int Table_ID = 146;

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
     * Column name CostingPrecision
     */
    String COLUMNNAME_CostingPrecision = "CostingPrecision";
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
     * Column name C_UOM_UU
     */
    String COLUMNNAME_C_UOM_UU = "C_UOM_UU";
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
     * Column name StdPrecision
     */
    String COLUMNNAME_StdPrecision = "StdPrecision";
    /**
     * Column name UOMSymbol
     */
    String COLUMNNAME_UOMSymbol = "UOMSymbol";
    /**
     * Column name UOMType
     */
    String COLUMNNAME_UOMType = "UOMType";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name X12DE355
     */
    String COLUMNNAME_X12DE355 = "X12DE355";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Costing Precision. Rounding used costing calculations
     */
    int getCostingPrecision();

    /**
     * Set Costing Precision. Rounding used costing calculations
     */
    void setCostingPrecision(int CostingPrecision);

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

    /**
     * Get C_UOM_UU
     */
    String getC_UOM_UU();

    /**
     * Set C_UOM_UU
     */
    void setC_UOM_UU(String C_UOM_UU);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Standard Precision. Rule for rounding calculated amounts
     */
    int getStdPrecision();

    /**
     * Set Standard Precision. Rule for rounding calculated amounts
     */
    void setStdPrecision(int StdPrecision);

    /**
     * Get Symbol. Symbol for a Unit of Measure
     */
    String getUOMSymbol();

    /**
     * Set Symbol. Symbol for a Unit of Measure
     */
    void setUOMSymbol(String UOMSymbol);

    /**
     * Get UOM Type
     */
    String getUOMType();

    /**
     * Set UOM Type
     */
    void setUOMType(String UOMType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get UOM Code. UOM EDI X12 Code
     */
    String getX12DE355();

    /**
     * Set UOM Code. UOM EDI X12 Code
     */
    void setX12DE355(String X12DE355);
}
