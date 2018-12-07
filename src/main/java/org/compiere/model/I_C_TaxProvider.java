package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

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
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CompanyCode
     */
    String COLUMNNAME_CompanyCode = "CompanyCode";
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
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /**
     * Column name C_TaxProvider_UU
     */
    String COLUMNNAME_C_TaxProvider_UU = "C_TaxProvider_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name License
     */
    String COLUMNNAME_License = "License";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidateConnection
     */
    String COLUMNNAME_ValidateConnection = "ValidateConnection";

    /**
     * Get Account
     */
    String getAccount();

    /**
     * Set Account
     */
    void setAccount(String Account);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Company Code
     */
    String getCompanyCode();

    /**
     * Set Company Code
     */
    void setCompanyCode(String CompanyCode);

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

    I_C_TaxProviderCfg getC_TaxProviderCfg() throws RuntimeException;

    /**
     * Get Tax Provider
     */
    int getC_TaxProvider_ID();

    /**
     * Set Tax Provider
     */
    void setC_TaxProvider_ID(int C_TaxProvider_ID);

    /**
     * Get C_TaxProvider_UU
     */
    String getC_TaxProvider_UU();

    /**
     * Set C_TaxProvider_UU
     */
    void setC_TaxProvider_UU(String C_TaxProvider_UU);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get License
     */
    String getLicense();

    /**
     * Set License
     */
    void setLicense(String License);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Validate Connection
     */
    String getValidateConnection();

    /**
     * Set Validate Connection
     */
    void setValidateConnection(String ValidateConnection);

    Properties getCtx();
}
