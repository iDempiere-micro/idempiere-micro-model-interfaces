package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_MediaDeploy
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_MediaDeploy {

    /**
     * TableName=CM_MediaDeploy
     */
    String Table_Name = "CM_MediaDeploy";

    /**
     * AD_Table_ID=892
     */
    int Table_ID = 892;

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
     * Column name CM_MediaDeploy_ID
     */
    String COLUMNNAME_CM_MediaDeploy_ID = "CM_MediaDeploy_ID";
    /**
     * Column name CM_MediaDeploy_UU
     */
    String COLUMNNAME_CM_MediaDeploy_UU = "CM_MediaDeploy_UU";
    /**
     * Column name CM_Media_ID
     */
    String COLUMNNAME_CM_Media_ID = "CM_Media_ID";
    /**
     * Column name CM_Media_Server_ID
     */
    String COLUMNNAME_CM_Media_Server_ID = "CM_Media_Server_ID";
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
     * Column name IsDeployed
     */
    String COLUMNNAME_IsDeployed = "IsDeployed";
    /**
     * Column name LastSynchronized
     */
    String COLUMNNAME_LastSynchronized = "LastSynchronized";
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
     * Get Media Deploy. Media Deployment Log
     */
    int getCM_MediaDeploy_ID();

    /**
     * Set Media Deploy. Media Deployment Log
     */
    void setCM_MediaDeploy_ID(int CM_MediaDeploy_ID);

    /**
     * Get CM_MediaDeploy_UU
     */
    String getCM_MediaDeploy_UU();

    /**
     * Set CM_MediaDeploy_UU
     */
    void setCM_MediaDeploy_UU(String CM_MediaDeploy_UU);

    /**
     * Get Media Item. Contains media content like images, flash movies etc.
     */
    int getCM_Media_ID();

    /**
     * Set Media Item. Contains media content like images, flash movies etc.
     */
    void setCM_Media_ID(int CM_Media_ID);

    I_CM_Media getCM_Media() throws RuntimeException;

    /**
     * Get Media Server. Media Server list to which content should get transfered
     */
    int getCM_Media_Server_ID();

    /**
     * Set Media Server. Media Server list to which content should get transfered
     */
    void setCM_Media_Server_ID(int CM_Media_Server_ID);

    I_CM_Media_Server getCM_Media_Server() throws RuntimeException;

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
     * Set Deployed. Entity is deployed
     */
    void setIsDeployed(boolean IsDeployed);

    /**
     * Get Deployed. Entity is deployed
     */
    boolean isDeployed();

    /**
     * Get Last Synchronized. Date when last synchronized
     */
    Timestamp getLastSynchronized();

    /**
     * Set Last Synchronized. Date when last synchronized
     */
    void setLastSynchronized(Timestamp LastSynchronized);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
