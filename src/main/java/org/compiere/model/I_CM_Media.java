package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Media
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Media {

    /**
     * TableName=CM_Media
     */
    String Table_Name = "CM_Media";

    /**
     * AD_Table_ID=857
     */
    int Table_ID = 857;

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
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CM_Media_ID
     */
    String COLUMNNAME_CM_Media_ID = "CM_Media_ID";
    /**
     * Column name CM_Media_UU
     */
    String COLUMNNAME_CM_Media_UU = "CM_Media_UU";
    /**
     * Column name CM_WebProject_ID
     */
    String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
    /**
     * Column name ContentText
     */
    String COLUMNNAME_ContentText = "ContentText";
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
     * Column name DirectDeploy
     */
    String COLUMNNAME_DirectDeploy = "DirectDeploy";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name MediaType
     */
    String COLUMNNAME_MediaType = "MediaType";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Media Item. Contains media content like images, flash movies etc.
     */
    int getCM_Media_ID();

    /**
     * Set Media Item. Contains media content like images, flash movies etc.
     */
    void setCM_Media_ID(int CM_Media_ID);

    /**
     * Get CM_Media_UU
     */
    String getCM_Media_UU();

    /**
     * Set CM_Media_UU
     */
    void setCM_Media_UU(String CM_Media_UU);

    /**
     * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    int getCM_WebProject_ID();

    /**
     * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    void setCM_WebProject_ID(int CM_WebProject_ID);

    I_CM_WebProject getCM_WebProject() throws RuntimeException;

    /**
     * Get Content
     */
    String getContentText();

    /**
     * Set Content
     */
    void setContentText(String ContentText);

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
     * Get Direct Deploy
     */
    String getDirectDeploy();

    /**
     * Set Direct Deploy
     */
    void setDirectDeploy(String DirectDeploy);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Media Type. Defines the media type for the browser
     */
    String getMediaType();

    /**
     * Set Media Type. Defines the media type for the browser
     */
    void setMediaType(String MediaType);

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
