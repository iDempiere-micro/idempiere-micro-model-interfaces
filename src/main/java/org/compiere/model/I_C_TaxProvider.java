package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_TaxProvider
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxProvider {

    /**
     * AD_Table_ID=200099
     */
    int Table_ID = 200099;

    /**
     * TableName=C_TaxProvider
     */
    String Table_Name = "C_TaxProvider";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_TaxProviderCfg_ID
     */
    String COLUMNNAME_C_TaxProviderCfg_ID = "C_TaxProviderCfg_ID";
    /**
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";

    /**
     * Get Tax Provider Configuration
     */
    int getTaxProviderConfigurationId();

    I_C_TaxProviderCfg getTaxProviderConfiguration() throws RuntimeException;

    /**
     * Get Tax Provider
     */
    int getTaxProviderId();

}
