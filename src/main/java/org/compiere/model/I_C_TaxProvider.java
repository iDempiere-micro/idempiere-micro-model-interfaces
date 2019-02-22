package org.compiere.model;

import java.math.BigDecimal;
import java.util.Properties;

/**
 * Generated Interface for C_TaxProvider
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxProvider {

    /**
     * TableName=C_TaxProvider
     */
    String Table_Name = "C_TaxProvider";

    /**
     * AD_Table_ID=200099
     */
    int Table_ID = 200099;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Account
     */
    String COLUMNNAME_Account = "Account";
    /**
     * Column name CompanyCode
     */
    String COLUMNNAME_CompanyCode = "CompanyCode";
    /**
     * Column name C_TaxProviderCfg_ID
     */
    String COLUMNNAME_C_TaxProviderCfg_ID = "C_TaxProviderCfg_ID";
    /**
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /**
     * Column name C_TaxProvider_UU
     */
    String COLUMNNAME_C_TaxProvider_UU = "C_TaxProvider_UU";
    /**
     * Column name License
     */
    String COLUMNNAME_License = "License";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name ValidateConnection
     */
    String COLUMNNAME_ValidateConnection = "ValidateConnection";

    /**
     * Get Tax Provider Configuration
     */
    int getC_TaxProviderCfg_ID();

    I_C_TaxProviderCfg getC_TaxProviderCfg() throws RuntimeException;

    /**
     * Get Tax Provider
     */
    int getC_TaxProvider_ID();

    Properties getCtx();
}
