package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PerpetualInv
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PerpetualInv {

    /**
     * TableName=M_PerpetualInv
     */
    String Table_Name = "M_PerpetualInv";

    /**
     * AD_Table_ID=342
     */
    int Table_ID = 342;

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
     * Column name CountHighMovement
     */
    String COLUMNNAME_CountHighMovement = "CountHighMovement";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name DateNextRun
     */
    String COLUMNNAME_DateNextRun = "DateNextRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_PerpetualInv_ID
     */
    String COLUMNNAME_M_PerpetualInv_ID = "M_PerpetualInv_ID";
    /**
     * Column name M_PerpetualInv_UU
     */
    String COLUMNNAME_M_PerpetualInv_UU = "M_PerpetualInv_UU";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name NoInventoryCount
     */
    String COLUMNNAME_NoInventoryCount = "NoInventoryCount";
    /**
     * Column name NoProductCount
     */
    String COLUMNNAME_NoProductCount = "NoProductCount";
    /**
     * Column name NumberOfRuns
     */
    String COLUMNNAME_NumberOfRuns = "NumberOfRuns";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Get Count high turnover items. Count High Movement products
     */
    boolean isCountHighMovement();

    /**
     * Set Count high turnover items. Count High Movement products
     */
    void setCountHighMovement(boolean CountHighMovement);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

    /**
     * Get Date next run. Date the process will run next
     */
    Timestamp getDateNextRun();

    /**
     * Set Date next run. Date the process will run next
     */
    void setDateNextRun(Timestamp DateNextRun);

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
     * Get Perpetual Inventory. Rules for generating physical inventory
     */
    int getM_PerpetualInv_ID();

    /**
     * Set Perpetual Inventory. Rules for generating physical inventory
     */
    void setM_PerpetualInv_ID(int M_PerpetualInv_ID);

    /**
     * Get M_PerpetualInv_UU
     */
    String getM_PerpetualInv_UU();

    /**
     * Set M_PerpetualInv_UU
     */
    void setM_PerpetualInv_UU(String M_PerpetualInv_UU);

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Number of Inventory counts. Frequency of inventory counts per year
     */
    int getNoInventoryCount();

    /**
     * Set Number of Inventory counts. Frequency of inventory counts per year
     */
    void setNoInventoryCount(int NoInventoryCount);

    /**
     * Get Number of Product counts. Frequency of product counts per year
     */
    int getNoProductCount();

    /**
     * Set Number of Product counts. Frequency of product counts per year
     */
    void setNoProductCount(int NoProductCount);

    /**
     * Get Number of runs. Frequency of processing Perpetual Inventory
     */
    int getNumberOfRuns();

    /**
     * Set Number of runs. Frequency of processing Perpetual Inventory
     */
    void setNumberOfRuns(int NumberOfRuns);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
