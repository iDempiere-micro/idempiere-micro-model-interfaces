package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_ChatEntry
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_ChatEntry {

    /**
     * TableName=CM_ChatEntry
     */
    String Table_Name = "CM_ChatEntry";

    /**
     * AD_Table_ID=877
     */
    int Table_ID = 877;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name CharacterData
     */
    String COLUMNNAME_CharacterData = "CharacterData";
    /**
     * Column name ChatEntryType
     */
    String COLUMNNAME_ChatEntryType = "ChatEntryType";
    /**
     * Column name CM_ChatEntryGrandParent_ID
     */
    String COLUMNNAME_CM_ChatEntryGrandParent_ID = "CM_ChatEntryGrandParent_ID";
    /**
     * Column name CM_ChatEntry_ID
     */
    String COLUMNNAME_CM_ChatEntry_ID = "CM_ChatEntry_ID";
    /**
     * Column name CM_ChatEntryParent_ID
     */
    String COLUMNNAME_CM_ChatEntryParent_ID = "CM_ChatEntryParent_ID";
    /**
     * Column name CM_ChatEntry_UU
     */
    String COLUMNNAME_CM_ChatEntry_UU = "CM_ChatEntry_UU";
    /**
     * Column name CM_Chat_ID
     */
    String COLUMNNAME_CM_Chat_ID = "CM_Chat_ID";
    /**
     * Column name ConfidentialType
     */
    String COLUMNNAME_ConfidentialType = "ConfidentialType";
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
     * Column name ModeratorStatus
     */
    String COLUMNNAME_ModeratorStatus = "ModeratorStatus";
    /**
     * Column name Subject
     */
    String COLUMNNAME_Subject = "Subject";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Character Data. Long Character Field
     */
    String getCharacterData();

    /**
     * Set Character Data. Long Character Field
     */
    void setCharacterData(String CharacterData);

    /**
     * Get Chat Entry Type. Type of Chat/Forum Entry
     */
    String getChatEntryType();

    /**
     * Set Chat Entry Type. Type of Chat/Forum Entry
     */
    void setChatEntryType(String ChatEntryType);

    /**
     * Get Chat Entry Grandparent. Link to Grand Parent (root level)
     */
    int getCM_ChatEntryGrandParent_ID();

    /**
     * Set Chat Entry Grandparent. Link to Grand Parent (root level)
     */
    void setCM_ChatEntryGrandParent_ID(int CM_ChatEntryGrandParent_ID);

    I_CM_ChatEntry getCM_ChatEntryGrandParent() throws RuntimeException;

    /**
     * Get Chat Entry. Individual Chat / Discussion Entry
     */
    int getCM_ChatEntry_ID();

    /**
     * Set Chat Entry. Individual Chat / Discussion Entry
     */
    void setCM_ChatEntry_ID(int CM_ChatEntry_ID);

    /**
     * Get Chat Entry Parent. Link to direct Parent
     */
    int getCM_ChatEntryParent_ID();

    /**
     * Set Chat Entry Parent. Link to direct Parent
     */
    void setCM_ChatEntryParent_ID(int CM_ChatEntryParent_ID);

    I_CM_ChatEntry getCM_ChatEntryParent() throws RuntimeException;

    /**
     * Get CM_ChatEntry_UU
     */
    String getCM_ChatEntry_UU();

    /**
     * Set CM_ChatEntry_UU
     */
    void setCM_ChatEntry_UU(String CM_ChatEntry_UU);

    /**
     * Get Chat. Chat or discussion thread
     */
    int getCM_Chat_ID();

    /**
     * Set Chat. Chat or discussion thread
     */
    void setCM_Chat_ID(int CM_Chat_ID);

    I_CM_Chat getCM_Chat() throws RuntimeException;

    /**
     * Get Confidentiality. Type of Confidentiality
     */
    String getConfidentialType();

    /**
     * Set Confidentiality. Type of Confidentiality
     */
    void setConfidentialType(String ConfidentialType);

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
     * Get Moderation Status. Status of Moderation
     */
    String getModeratorStatus();

    /**
     * Set Moderation Status. Status of Moderation
     */
    void setModeratorStatus(String ModeratorStatus);

    /**
     * Get Subject. Email Message Subject
     */
    String getSubject();

    /**
     * Set Subject. Email Message Subject
     */
    void setSubject(String Subject);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
