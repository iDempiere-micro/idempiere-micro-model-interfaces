package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PackageLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PackageLine {

    /**
     * TableName=M_PackageLine
     */
    String Table_Name = "M_PackageLine";

    /**
     * AD_Table_ID=663
     */
    int Table_ID = 663;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

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
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Package_ID
     */
    String COLUMNNAME_M_Package_ID = "M_Package_ID";
    /**
     * Column name M_PackageLine_ID
     */
    String COLUMNNAME_M_PackageLine_ID = "M_PackageLine_ID";
    /**
     * Column name M_PackageLine_UU
     */
    String COLUMNNAME_M_PackageLine_UU = "M_PackageLine_UU";
    /**
     * Column name M_PackageMPS_ID
     */
    String COLUMNNAME_M_PackageMPS_ID = "M_PackageMPS_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
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
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setM_InOutLine_ID(int M_InOutLine_ID);

    I_M_InOutLine getM_InOutLine() throws RuntimeException;

    /**
     * Get Package. Shipment Package
     */
    int getM_Package_ID();

    /**
     * Set Package. Shipment Package
     */
    void setM_Package_ID(int M_Package_ID);

    I_M_Package getM_Package() throws RuntimeException;

    /**
     * Get Package Line. The detail content of the Package
     */
    int getM_PackageLine_ID();

    /**
     * Set Package Line. The detail content of the Package
     */
    void setM_PackageLine_ID(int M_PackageLine_ID);

    /**
     * Get M_PackageLine_UU
     */
    String getM_PackageLine_UU();

    /**
     * Set M_PackageLine_UU
     */
    void setM_PackageLine_UU(String M_PackageLine_UU);

    /**
     * Get Package MPS
     */
    int getM_PackageMPS_ID();

    /**
     * Set Package MPS
     */
    void setM_PackageMPS_ID(int M_PackageMPS_ID);

    I_M_PackageMPS getM_PackageMPS() throws RuntimeException;

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
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
