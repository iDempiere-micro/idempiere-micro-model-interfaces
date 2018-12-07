package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShippingProcessorCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingProcessorCfg {

    /**
     * TableName=M_ShippingProcessorCfg
     */
    String Table_Name = "M_ShippingProcessorCfg";

    /**
     * AD_Table_ID=200046
     */
    int Table_ID = 200046;

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
     * Column name M_ShippingProcessorCfg_ID
     */
    String COLUMNNAME_M_ShippingProcessorCfg_ID = "M_ShippingProcessorCfg_ID";
    /**
     * Column name M_ShippingProcessorCfg_UU
     */
    String COLUMNNAME_M_ShippingProcessorCfg_UU = "M_ShippingProcessorCfg_UU";
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
     * Column name ShippingProcessorClass
     */
    String COLUMNNAME_ShippingProcessorClass = "ShippingProcessorClass";
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
     * Get Shipping Processor Configuration
     */
    int getM_ShippingProcessorCfg_ID();

    /**
     * Set Shipping Processor Configuration
     */
    void setM_ShippingProcessorCfg_ID(int M_ShippingProcessorCfg_ID);

    /**
     * Get M_ShippingProcessorCfg_UU
     */
    String getM_ShippingProcessorCfg_UU();

    /**
     * Set M_ShippingProcessorCfg_UU
     */
    void setM_ShippingProcessorCfg_UU(String M_ShippingProcessorCfg_UU);

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
     * Get Shipping Processor Class
     */
    String getShippingProcessorClass();

    /**
     * Set Shipping Processor Class
     */
    void setShippingProcessorClass(String ShippingProcessorClass);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
