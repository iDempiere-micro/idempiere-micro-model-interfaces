package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_NewsItem
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_NewsItem {

    /**
     * TableName=CM_NewsItem
     */
    String Table_Name = "CM_NewsItem";

    /**
     * AD_Table_ID=871
     */
    int Table_ID = 871;

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
     * Column name Author
     */
    String COLUMNNAME_Author = "Author";
    /**
     * Column name CM_NewsChannel_ID
     */
    String COLUMNNAME_CM_NewsChannel_ID = "CM_NewsChannel_ID";
    /**
     * Column name CM_NewsItem_ID
     */
    String COLUMNNAME_CM_NewsItem_ID = "CM_NewsItem_ID";
    /**
     * Column name CM_NewsItem_UU
     */
    String COLUMNNAME_CM_NewsItem_UU = "CM_NewsItem_UU";
    /**
     * Column name ContentHTML
     */
    String COLUMNNAME_ContentHTML = "ContentHTML";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LinkURL
     */
    String COLUMNNAME_LinkURL = "LinkURL";
    /**
     * Column name PubDate
     */
    String COLUMNNAME_PubDate = "PubDate";
    /**
     * Column name Title
     */
    String COLUMNNAME_Title = "Title";
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
     * Get Author. Author/Creator of the Entity
     */
    String getAuthor();

    /**
     * Set Author. Author/Creator of the Entity
     */
    void setAuthor(String Author);

    /**
     * Get News Channel. News channel for rss feed
     */
    int getCM_NewsChannel_ID();

    /**
     * Set News Channel. News channel for rss feed
     */
    void setCM_NewsChannel_ID(int CM_NewsChannel_ID);

    I_CM_NewsChannel getCM_NewsChannel() throws RuntimeException;

    /**
     * Get News Item / Article. News item or article defines base content
     */
    int getCM_NewsItem_ID();

    /**
     * Set News Item / Article. News item or article defines base content
     */
    void setCM_NewsItem_ID(int CM_NewsItem_ID);

    /**
     * Get CM_NewsItem_UU
     */
    String getCM_NewsItem_UU();

    /**
     * Set CM_NewsItem_UU
     */
    void setCM_NewsItem_UU(String CM_NewsItem_UU);

    /**
     * Get Content HTML. Contains the content itself
     */
    String getContentHTML();

    /**
     * Set Content HTML. Contains the content itself
     */
    void setContentHTML(String ContentHTML);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get LinkURL. Contains URL to a target
     */
    String getLinkURL();

    /**
     * Set LinkURL. Contains URL to a target
     */
    void setLinkURL(String LinkURL);

    /**
     * Get Publication Date. Date on which this article will / should get published
     */
    Timestamp getPubDate();

    /**
     * Set Publication Date. Date on which this article will / should get published
     */
    void setPubDate(Timestamp PubDate);

    /**
     * Get Title. Name this entity is referred to as
     */
    String getTitle();

    /**
     * Set Title. Name this entity is referred to as
     */
    void setTitle(String Title);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
