package org.compiere.model;

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
     * Get Host Address. Host Address URL or DNS
     */
    String getHostAddress();

    /**
     * Get Host port. Host Communication Port
     */
    int getHostPort();

    /**
     * Get Proxy address. Address of your proxy server
     */
    String getProxyAddress();

    /**
     * Get Proxy logon. Logon of your proxy server
     */
    String getProxyLogon();

    /**
     * Get Proxy password. Password of your proxy server
     */
    String getProxyPassword();

    /**
     * Get Proxy port. Port of your proxy server
     */
    int getProxyPort();

    /**
     * Get Service Path
     */
    String getServicePath();

    /**
     * Get Shipping Processor Class
     */
    String getShippingProcessorClass();

}
