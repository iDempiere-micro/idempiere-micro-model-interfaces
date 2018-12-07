package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_Training_Class
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_Training_Class {

    /**
     * TableName=S_Training_Class
     */
    String Table_Name = "S_Training_Class";

    /**
     * AD_Table_ID=537
     */
    int Table_ID = 537;

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
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
    /**
     * Column name S_Training_Class_ID
     */
    String COLUMNNAME_S_Training_Class_ID = "S_Training_Class_ID";
    /**
     * Column name S_Training_Class_UU
     */
    String COLUMNNAME_S_Training_Class_UU = "S_Training_Class_UU";
    /**
     * Column name S_Training_ID
     */
    String COLUMNNAME_S_Training_ID = "S_Training_ID";
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
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

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
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Training Class. The actual training class instance
     */
    int getS_Training_Class_ID();

    /**
     * Set Training Class. The actual training class instance
     */
    void setS_Training_Class_ID(int S_Training_Class_ID);

    /**
     * Get S_Training_Class_UU
     */
    String getS_Training_Class_UU();

    /**
     * Set S_Training_Class_UU
     */
    void setS_Training_Class_UU(String S_Training_Class_UU);

    /**
     * Get Training. Repeated Training
     */
    int getS_Training_ID();

    /**
     * Set Training. Repeated Training
     */
    void setS_Training_ID(int S_Training_ID);

    I_S_Training getS_Training() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
