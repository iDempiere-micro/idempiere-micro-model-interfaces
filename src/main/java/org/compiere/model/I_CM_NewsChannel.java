package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_NewsChannel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_NewsChannel {

    /**
     * TableName=CM_NewsChannel
     */
    String Table_Name = "CM_NewsChannel";

    /**
     * AD_Table_ID=870
     */
    int Table_ID = 870;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CM_NewsChannel_ID
     */
    String COLUMNNAME_CM_NewsChannel_ID = "CM_NewsChannel_ID";
    /**
     * Column name CM_NewsChannel_UU
     */
    String COLUMNNAME_CM_NewsChannel_UU = "CM_NewsChannel_UU";
    /**
     * Column name CM_WebProject_ID
     */
    String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Link
     */
    String COLUMNNAME_Link = "Link";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Language. Language for this entity
     */
    String getADLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setADLanguage(String AD_Language);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get News Channel. News channel for rss feed
     */
    int getCM_NewsChannel_ID();

    /**
     * Set News Channel. News channel for rss feed
     */
    void setCM_NewsChannel_ID(int CM_NewsChannel_ID);

    /**
     * Get CM_NewsChannel_UU
     */
    String getCM_NewsChannel_UU();

    /**
     * Set CM_NewsChannel_UU
     */
    void setCM_NewsChannel_UU(String CM_NewsChannel_UU);

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
     * Get Link. Contains URL to a target
     */
    String getLink();

    /**
     * Set Link. Contains URL to a target
     */
    void setLink(String Link);

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
