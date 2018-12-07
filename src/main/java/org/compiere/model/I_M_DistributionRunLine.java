package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionRunLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionRunLine {

    /**
     * TableName=M_DistributionRunLine
     */
    String Table_Name = "M_DistributionRunLine";

    /**
     * AD_Table_ID=713
     */
    int Table_ID = 713;

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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_DistributionList_ID
     */
    String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
    /**
     * Column name M_DistributionRun_ID
     */
    String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
    /**
     * Column name M_DistributionRunLine_ID
     */
    String COLUMNNAME_M_DistributionRunLine_ID = "M_DistributionRunLine_ID";
    /**
     * Column name M_DistributionRunLine_UU
     */
    String COLUMNNAME_M_DistributionRunLine_UU = "M_DistributionRunLine_UU";
    /**
     * Column name MinQty
     */
    String COLUMNNAME_MinQty = "MinQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name TotalQty
     */
    String COLUMNNAME_TotalQty = "TotalQty";
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
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Distribution List. Distribution Lists allow to distribute products to a selected list of
     * partners
     */
    int getM_DistributionList_ID();

    /**
     * Set Distribution List. Distribution Lists allow to distribute products to a selected list of
     * partners
     */
    void setM_DistributionList_ID(int M_DistributionList_ID);

    I_M_DistributionList getM_DistributionList() throws RuntimeException;

    /**
     * Get Distribution Run. Distribution Run create Orders to distribute products to a selected list
     * of partners
     */
    int getM_DistributionRun_ID();

    /**
     * Set Distribution Run. Distribution Run create Orders to distribute products to a selected list
     * of partners
     */
    void setM_DistributionRun_ID(int M_DistributionRun_ID);

    I_M_DistributionRun getM_DistributionRun() throws RuntimeException;

    /**
     * Get Distribution Run Line. Distribution Run Lines define Distribution List, the Product and
     * Quantities
     */
    int getM_DistributionRunLine_ID();

    /**
     * Set Distribution Run Line. Distribution Run Lines define Distribution List, the Product and
     * Quantities
     */
    void setM_DistributionRunLine_ID(int M_DistributionRunLine_ID);

    /**
     * Get M_DistributionRunLine_UU
     */
    String getM_DistributionRunLine_UU();

    /**
     * Set M_DistributionRunLine_UU
     */
    void setM_DistributionRunLine_UU(String M_DistributionRunLine_UU);

    /**
     * Get Minimum Quantity. Minimum quantity for the business partner
     */
    BigDecimal getMinQty();

    /**
     * Set Minimum Quantity. Minimum quantity for the business partner
     */
    void setMinQty(BigDecimal MinQty);

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
     * Get Total Quantity. Total Quantity
     */
    BigDecimal getTotalQty();

    /**
     * Set Total Quantity. Total Quantity
     */
    void setTotalQty(BigDecimal TotalQty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
