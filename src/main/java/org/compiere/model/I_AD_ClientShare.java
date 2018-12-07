package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ClientShare
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ClientShare {

    /**
     * TableName=AD_ClientShare
     */
    String Table_Name = "AD_ClientShare";

    /**
     * AD_Table_ID=827
     */
    int Table_ID = 827;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_ClientShare_ID
     */
    String COLUMNNAME_AD_ClientShare_ID = "AD_ClientShare_ID";
    /**
     * Column name AD_ClientShare_UU
     */
    String COLUMNNAME_AD_ClientShare_UU = "AD_ClientShare_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
     * Column name ShareType
     */
    String COLUMNNAME_ShareType = "ShareType";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Client Share. Force (not) sharing of client/org entities
     */
    int getAD_ClientShare_ID();

    /**
     * Set Client Share. Force (not) sharing of client/org entities
     */
    void setAD_ClientShare_ID(int AD_ClientShare_ID);

    /**
     * Get AD_ClientShare_UU
     */
    String getAD_ClientShare_UU();

    /**
     * Set AD_ClientShare_UU
     */
    void setAD_ClientShare_UU(String AD_ClientShare_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

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
     * Get Share Type. Type of sharing
     */
    String getShareType();

    /**
     * Set Share Type. Type of sharing
     */
    void setShareType(String ShareType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
