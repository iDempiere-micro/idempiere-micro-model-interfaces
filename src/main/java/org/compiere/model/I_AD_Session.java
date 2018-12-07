package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Session
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Session {

    /**
     * TableName=AD_Session
     */
    String Table_Name = "AD_Session";

    /**
     * AD_Table_ID=566
     */
    int Table_ID = 566;

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
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Session_ID
     */
    String COLUMNNAME_AD_Session_ID = "AD_Session_ID";
    /**
     * Column name AD_Session_UU
     */
    String COLUMNNAME_AD_Session_UU = "AD_Session_UU";
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
     * Column name LoginDate
     */
    String COLUMNNAME_LoginDate = "LoginDate";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Remote_Addr
     */
    String COLUMNNAME_Remote_Addr = "Remote_Addr";
    /**
     * Column name Remote_Host
     */
    String COLUMNNAME_Remote_Host = "Remote_Host";
    /**
     * Column name ServerName
     */
    String COLUMNNAME_ServerName = "ServerName";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WebSession
     */
    String COLUMNNAME_WebSession = "WebSession";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get Session. User Session Online or Web
     */
    int getAD_Session_ID();

    /**
     * Set Session. User Session Online or Web
     */
    void setAD_Session_ID(int AD_Session_ID);

    /**
     * Get AD_Session_UU
     */
    String getAD_Session_UU();

    /**
     * Set AD_Session_UU
     */
    void setAD_Session_UU(String AD_Session_UU);

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
     * Get Login date
     */
    Timestamp getLoginDate();

    /**
     * Set Login date
     */
    void setLoginDate(Timestamp LoginDate);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Remote Addr. Remote Address
     */
    String getRemote_Addr();

    /**
     * Set Remote Addr. Remote Address
     */
    void setRemote_Addr(String Remote_Addr);

    /**
     * Get Remote Host. Remote host Info
     */
    String getRemote_Host();

    /**
     * Set Remote Host. Remote host Info
     */
    void setRemote_Host(String Remote_Host);

    /**
     * Get Server Name
     */
    String getServerName();

    /**
     * Set Server Name
     */
    void setServerName(String ServerName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Web Session. Web Session ID
     */
    String getWebSession();

    /**
     * Set Web Session. Web Session ID
     */
    void setWebSession(String WebSession);
}
