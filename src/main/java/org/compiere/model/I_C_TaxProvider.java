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
    int getTaxProviderConfiguration_ID();

    I_C_TaxProviderCfg getTaxProviderConfiguration() throws RuntimeException;

    /**
     * Get Tax Provider
     */
    int getTaxProviderId();

}
