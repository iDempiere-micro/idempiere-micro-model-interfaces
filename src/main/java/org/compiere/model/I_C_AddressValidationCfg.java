package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AddressValidationCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AddressValidationCfg {

    /**
     * TableName=C_AddressValidationCfg
     */
    String Table_Name = "C_AddressValidationCfg";

    /**
     * AD_Table_ID=200100
     */
    int Table_ID = 200100;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AddressValidationClass
     */
    String COLUMNNAME_AddressValidationClass = "AddressValidationClass";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AddressValidationCfg_ID
     */
    String COLUMNNAME_C_AddressValidationCfg_ID = "C_AddressValidationCfg_ID";
    /**
     * Column name C_AddressValidationCfg_UU
     */
    String COLUMNNAME_C_AddressValidationCfg_UU = "C_AddressValidationCfg_UU";
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
     * Column name HostAddress
     */
    String COLUMNNAME_HostAddress = "HostAddress";
    /**
     * Column name HostPort
     */
    String COLUMNNAME_HostPort = "HostPort";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ProxyAddress
     */
    String COLUMNNAME_ProxyAddress = "ProxyAddress";
    /**
     * Column name ProxyLogon
     */
    String COLUMNNAME_ProxyLogon = "ProxyLogon";
    /**
     * Column name ProxyPassword
     */
    String COLUMNNAME_ProxyPassword = "ProxyPassword";
    /**
     * Column name ProxyPort
     */
    String COLUMNNAME_ProxyPort = "ProxyPort";
    /**
     * Column name ServicePath
     */
    String COLUMNNAME_ServicePath = "ServicePath";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Address Validation Class
     */
    String getAddressValidationClass();

    /**
     * Set Address Validation Class
     */
    void setAddressValidationClass(String AddressValidationClass);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Address Validation Configuration
     */
    int getC_AddressValidationCfg_ID();

    /**
     * Set Address Validation Configuration
     */
    void setC_AddressValidationCfg_ID(int C_AddressValidationCfg_ID);

    /**
     * Get C_AddressValidationCfg_UU
     */
    String getC_AddressValidationCfg_UU();

    /**
     * Set C_AddressValidationCfg_UU
     */
    void setC_AddressValidationCfg_UU(String C_AddressValidationCfg_UU);

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
     * Get Host Address. Host Address URL or DNS
     */
    String getHostAddress();

    /**
     * Set Host Address. Host Address URL or DNS
     */
    void setHostAddress(String HostAddress);

    /**
     * Get Host port. Host Communication Port
     */
    int getHostPort();

    /**
     * Set Host port. Host Communication Port
     */
    void setHostPort(int HostPort);

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
     * Get Proxy address. Address of your proxy server
     */
    String getProxyAddress();

    /**
     * Set Proxy address. Address of your proxy server
     */
    void setProxyAddress(String ProxyAddress);

    /**
     * Get Proxy logon. Logon of your proxy server
     */
    String getProxyLogon();

    /**
     * Set Proxy logon. Logon of your proxy server
     */
    void setProxyLogon(String ProxyLogon);

    /**
     * Get Proxy password. Password of your proxy server
     */
    String getProxyPassword();

    /**
     * Set Proxy password. Password of your proxy server
     */
    void setProxyPassword(String ProxyPassword);

    /**
     * Get Proxy port. Port of your proxy server
     */
    int getProxyPort();

    /**
     * Set Proxy port. Port of your proxy server
     */
    void setProxyPort(int ProxyPort);

    /**
     * Get Service Path
     */
    String getServicePath();

    /**
     * Set Service Path
     */
    void setServicePath(String ServicePath);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
