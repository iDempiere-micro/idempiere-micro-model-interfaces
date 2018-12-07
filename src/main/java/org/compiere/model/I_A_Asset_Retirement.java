package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Retirement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Retirement {

    /**
     * TableName=A_Asset_Retirement
     */
    String Table_Name = "A_Asset_Retirement";

    /**
     * AD_Table_ID=540
     */
    int Table_ID = 540;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Retirement_ID
     */
    String COLUMNNAME_A_Asset_Retirement_ID = "A_Asset_Retirement_ID";
    /**
     * Column name A_Asset_Retirement_UU
     */
    String COLUMNNAME_A_Asset_Retirement_UU = "A_Asset_Retirement_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AssetMarketValueAmt
     */
    String COLUMNNAME_AssetMarketValueAmt = "AssetMarketValueAmt";
    /**
     * Column name AssetValueAmt
     */
    String COLUMNNAME_AssetValueAmt = "AssetValueAmt";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Get Asset Retirement. Internally used asset is not longer used.
     */
    int getA_Asset_Retirement_ID();

    /**
     * Set Asset Retirement. Internally used asset is not longer used.
     */
    void setA_Asset_Retirement_ID(int A_Asset_Retirement_ID);

    /**
     * Get A_Asset_Retirement_UU
     */
    String getA_Asset_Retirement_UU();

    /**
     * Set A_Asset_Retirement_UU
     */
    void setA_Asset_Retirement_UU(String A_Asset_Retirement_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Market value Amount. Market value of the asset
     */
    BigDecimal getAssetMarketValueAmt();

    /**
     * Set Market value Amount. Market value of the asset
     */
    void setAssetMarketValueAmt(BigDecimal AssetMarketValueAmt);

    /**
     * Get Asset value. Book Value of the asset
     */
    BigDecimal getAssetValueAmt();

    /**
     * Set Asset value. Book Value of the asset
     */
    void setAssetValueAmt(BigDecimal AssetValueAmt);

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
