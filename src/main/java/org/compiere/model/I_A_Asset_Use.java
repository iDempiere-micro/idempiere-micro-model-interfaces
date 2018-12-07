package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Use
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Use {

    /**
     * TableName=A_Asset_Use
     */
    String Table_Name = "A_Asset_Use";

    /**
     * AD_Table_ID=53138
     */
    int Table_ID = 53138;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Use_ID
     */
    String COLUMNNAME_A_Asset_Use_ID = "A_Asset_Use_ID";
    /**
     * Column name A_Asset_Use_UU
     */
    String COLUMNNAME_A_Asset_Use_UU = "A_Asset_Use_UU";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UseDate
     */
    String COLUMNNAME_UseDate = "UseDate";
    /**
     * Column name UseUnits
     */
    String COLUMNNAME_UseUnits = "UseUnits";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Get A_Asset_Use_ID
     */
    int getA_Asset_Use_ID();

    /**
     * Set A_Asset_Use_ID
     */
    void setA_Asset_Use_ID(int A_Asset_Use_ID);

    /**
     * Get A_Asset_Use_UU
     */
    String getA_Asset_Use_UU();

    /**
     * Set A_Asset_Use_UU
     */
    void setA_Asset_Use_UU(String A_Asset_Use_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get UseDate
     */
    Timestamp getUseDate();

    /**
     * Set UseDate
     */
    void setUseDate(Timestamp UseDate);

    /**
     * Get Use units. Currently used units of the assets
     */
    int getUseUnits();

    /**
     * Set Use units. Currently used units of the assets
     */
    void setUseUnits(int UseUnits);
}
