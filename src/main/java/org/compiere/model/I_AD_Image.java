package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Image
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Image {

    /**
     * TableName=AD_Image
     */
    String Table_Name = "AD_Image";

    /**
     * AD_Table_ID=461
     */
    int Table_ID = 461;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Image_ID
     */
    String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /**
     * Column name AD_Image_UU
     */
    String COLUMNNAME_AD_Image_UU = "AD_Image_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
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
     * Get Image. Image or Icon
     */
    int getAD_Image_ID();

    /**
     * Set Image. Image or Icon
     */
    void setAD_Image_ID(int AD_Image_ID);

    /**
     * Get AD_Image_UU
     */
    String getAD_Image_UU();

    /**
     * Set AD_Image_UU
     */
    void setAD_Image_UU(String AD_Image_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Binary Data. Binary Data
     */
    byte[] getBinaryData();

    /**
     * Set Binary Data. Binary Data
     */
    void setBinaryData(byte[] BinaryData);

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
