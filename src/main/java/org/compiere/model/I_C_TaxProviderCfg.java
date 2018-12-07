package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxProviderCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxProviderCfg {

    /**
     * TableName=C_TaxProviderCfg
     */
    String Table_Name = "C_TaxProviderCfg";

    /**
     * AD_Table_ID=200098
     */
    int Table_ID = 200098;

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
     * Column name C_TaxProviderCfg_ID
     */
    String COLUMNNAME_C_TaxProviderCfg_ID = "C_TaxProviderCfg_ID";
    /**
     * Column name C_TaxProviderCfg_UU
     */
    String COLUMNNAME_C_TaxProviderCfg_UU = "C_TaxProviderCfg_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name TaxProviderClass
     */
    String COLUMNNAME_TaxProviderClass = "TaxProviderClass";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";

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
     * Get Tax Provider Configuration
     */
    int getC_TaxProviderCfg_ID();

    /**
     * Set Tax Provider Configuration
     */
    void setC_TaxProviderCfg_ID(int C_TaxProviderCfg_ID);

    /**
     * Get C_TaxProviderCfg_UU
     */
    String getC_TaxProviderCfg_UU();

    /**
     * Set C_TaxProviderCfg_UU
     */
    void setC_TaxProviderCfg_UU(String C_TaxProviderCfg_UU);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Tax Provider Class
     */
    String getTaxProviderClass();

    /**
     * Set Tax Provider Class
     */
    void setTaxProviderClass(String TaxProviderClass);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get URL. Full URL address - e.g. http://www.idempiere.org
     */
    String getURL();

    /**
     * Set URL. Full URL address - e.g. http://www.idempiere.org
     */
    void setURL(String URL);
}
