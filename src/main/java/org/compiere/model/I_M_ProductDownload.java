package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductDownload
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductDownload {

    /**
     * TableName=M_ProductDownload
     */
    String Table_Name = "M_ProductDownload";

    /**
     * AD_Table_ID=777
     */
    int Table_ID = 777;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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
     * Column name DownloadURL
     */
    String COLUMNNAME_DownloadURL = "DownloadURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_ProductDownload_ID
     */
    String COLUMNNAME_M_ProductDownload_ID = "M_ProductDownload_ID";
    /**
     * Column name M_ProductDownload_UU
     */
    String COLUMNNAME_M_ProductDownload_UU = "M_ProductDownload_UU";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
     * Get Download URL. URL of the Download files
     */
    String getDownloadURL();

    /**
     * Set Download URL. URL of the Download files
     */
    void setDownloadURL(String DownloadURL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Product Download. Product downloads
     */
    int getM_ProductDownload_ID();

    /**
     * Set Product Download. Product downloads
     */
    void setM_ProductDownload_ID(int M_ProductDownload_ID);

    /**
     * Get M_ProductDownload_UU
     */
    String getM_ProductDownload_UU();

    /**
     * Set M_ProductDownload_UU
     */
    void setM_ProductDownload_UU(String M_ProductDownload_UU);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
