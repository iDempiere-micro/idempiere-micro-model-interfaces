package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_UOM_Conversion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_UOM_Conversion {

    /**
     * TableName=C_UOM_Conversion
     */
    String Table_Name = "C_UOM_Conversion";

    /**
     * AD_Table_ID=175
     */
    int Table_ID = 175;

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
     * Column name C_UOM_Conversion_ID
     */
    String COLUMNNAME_C_UOM_Conversion_ID = "C_UOM_Conversion_ID";
    /**
     * Column name C_UOM_Conversion_UU
     */
    String COLUMNNAME_C_UOM_Conversion_UU = "C_UOM_Conversion_UU";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name C_UOM_To_ID
     */
    String COLUMNNAME_C_UOM_To_ID = "C_UOM_To_ID";
    /**
     * Column name DivideRate
     */
    String COLUMNNAME_DivideRate = "DivideRate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";
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
     * Get UOM Conversion. Unit of Measure Conversion
     */
    int getC_UOM_Conversion_ID();

    /**
     * Set UOM Conversion. Unit of Measure Conversion
     */
    void setC_UOM_Conversion_ID(int C_UOM_Conversion_ID);

    /**
     * Get C_UOM_Conversion_UU
     */
    String getC_UOM_Conversion_UU();

    /**
     * Set C_UOM_Conversion_UU
     */
    void setC_UOM_Conversion_UU(String C_UOM_Conversion_UU);

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
     * Get UoM To. Target or destination Unit of Measure
     */
    int getC_UOM_To_ID();

    /**
     * Set UoM To. Target or destination Unit of Measure
     */
    void setC_UOM_To_ID(int C_UOM_To_ID);

    I_C_UOM getC_UOM_To() throws RuntimeException;

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Divide Rate. To convert Source number to Target number, the Source is divided
     */
    void setDivideRate(BigDecimal DivideRate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
