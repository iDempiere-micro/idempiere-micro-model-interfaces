package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_OrgType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_OrgType {

    /**
     * TableName=AD_OrgType
     */
    String Table_Name = "AD_OrgType";

    /**
     * AD_Table_ID=689
     */
    int Table_ID = 689;

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
     * Column name AD_OrgType_ID
     */
    String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";
    /**
     * Column name AD_OrgType_UU
     */
    String COLUMNNAME_AD_OrgType_UU = "AD_OrgType_UU";
    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Organization Type. Organization Type
     */
    int getAD_OrgType_ID();

    /**
     * Set Organization Type. Organization Type
     */
    void setAD_OrgType_ID(int AD_OrgType_ID);

    /**
     * Get AD_OrgType_UU
     */
    String getAD_OrgType_UU();

    /**
     * Set AD_OrgType_UU
     */
    void setAD_OrgType_UU(String AD_OrgType_UU);

    /**
     * Get Print Color. Color used for printing and display
     */
    int getAD_PrintColor_ID();

    /**
     * Set Print Color. Color used for printing and display
     */
    void setAD_PrintColor_ID(int AD_PrintColor_ID);

    I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

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
