package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_BroadcastServer
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_BroadcastServer {

    /**
     * TableName=CM_BroadcastServer
     */
    String Table_Name = "CM_BroadcastServer";

    /**
     * AD_Table_ID=893
     */
    int Table_ID = 893;

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
     * Column name CM_BroadcastServer_ID
     */
    String COLUMNNAME_CM_BroadcastServer_ID = "CM_BroadcastServer_ID";
    /**
     * Column name CM_BroadcastServer_UU
     */
    String COLUMNNAME_CM_BroadcastServer_UU = "CM_BroadcastServer_UU";
    /**
     * Column name CM_WebProject_ID
     */
    String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IP_Address
     */
    String COLUMNNAME_IP_Address = "IP_Address";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Broadcast Server. Web Broadcast Server
     */
    int getCM_BroadcastServer_ID();

    /**
     * Set Broadcast Server. Web Broadcast Server
     */
    void setCM_BroadcastServer_ID(int CM_BroadcastServer_ID);

    /**
     * Get CM_BroadcastServer_UU
     */
    String getCM_BroadcastServer_UU();

    /**
     * Set CM_BroadcastServer_UU
     */
    void setCM_BroadcastServer_UU(String CM_BroadcastServer_UU);

    /**
     * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    int getCM_WebProject_ID();

    /**
     * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    void setCM_WebProject_ID(int CM_WebProject_ID);

    I_CM_WebProject getCM_WebProject() throws RuntimeException;

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get IP Address. Defines the IP address to transfer data to
     */
    String getIP_Address();

    /**
     * Set IP Address. Defines the IP address to transfer data to
     */
    void setIP_Address(String IP_Address);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Last Synchronized. Date when last synchronized
     */
    Timestamp getLastSynchronized();

    /**
     * Set Last Synchronized. Date when last synchronized
     */
    void setLastSynchronized(Timestamp LastSynchronized);

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
