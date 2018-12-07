package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceTypeAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceTypeAccess {

    /**
     * TableName=WS_WebServiceTypeAccess
     */
    String Table_Name = "WS_WebServiceTypeAccess";

    /**
     * AD_Table_ID=53168
     */
    int Table_ID = 53168;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsReadWrite
     */
    String COLUMNNAME_IsReadWrite = "IsReadWrite";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WS_WebServiceTypeAccess_UU
     */
    String COLUMNNAME_WS_WebServiceTypeAccess_UU = "WS_WebServiceTypeAccess_UU";
    /**
     * Column name WS_WebServiceType_ID
     */
    String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Read Write. Field is read / write
     */
    void setIsReadWrite(boolean IsReadWrite);

    /**
     * Get Read Write. Field is read / write
     */
    boolean isReadWrite();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get WS_WebServiceTypeAccess_UU
     */
    String getWS_WebServiceTypeAccess_UU();

    /**
     * Set WS_WebServiceTypeAccess_UU
     */
    void setWS_WebServiceTypeAccess_UU(String WS_WebServiceTypeAccess_UU);

    /**
     * Get Web Service Type
     */
    int getWS_WebServiceType_ID();

    /**
     * Set Web Service Type
     */
    void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

    I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
