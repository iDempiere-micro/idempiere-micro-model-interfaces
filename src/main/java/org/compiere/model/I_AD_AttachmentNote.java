package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AttachmentNote
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AttachmentNote {

    /**
     * TableName=AD_AttachmentNote
     */
    String Table_Name = "AD_AttachmentNote";

    /**
     * AD_Table_ID=705
     */
    int Table_ID = 705;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Attachment_ID
     */
    String COLUMNNAME_AD_Attachment_ID = "AD_Attachment_ID";
    /**
     * Column name AD_AttachmentNote_ID
     */
    String COLUMNNAME_AD_AttachmentNote_ID = "AD_AttachmentNote_ID";
    /**
     * Column name AD_AttachmentNote_UU
     */
    String COLUMNNAME_AD_AttachmentNote_UU = "AD_AttachmentNote_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
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
     * Get Attachment. Attachment for the document
     */
    int getAD_Attachment_ID();

    /**
     * Set Attachment. Attachment for the document
     */
    void setAD_Attachment_ID(int AD_Attachment_ID);

    I_AD_Attachment getAD_Attachment() throws RuntimeException;

    /**
     * Get Attachment Note. Personal Attachment Note
     */
    int getAD_AttachmentNote_ID();

    /**
     * Set Attachment Note. Personal Attachment Note
     */
    void setAD_AttachmentNote_ID(int AD_AttachmentNote_ID);

    /**
     * Get AD_AttachmentNote_UU
     */
    String getAD_AttachmentNote_UU();

    /**
     * Set AD_AttachmentNote_UU
     */
    void setAD_AttachmentNote_UU(String AD_AttachmentNote_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

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
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

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
