package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_CtxHelpSuggestion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_CtxHelpSuggestion {

    /**
     * TableName=AD_CtxHelpSuggestion
     */
    String Table_Name = "AD_CtxHelpSuggestion";

    /**
     * AD_Table_ID=200210
     */
    int Table_ID = 200210;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AcceptSuggestion
     */
    String COLUMNNAME_AcceptSuggestion = "AcceptSuggestion";
    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_CtxHelpMsg_ID
     */
    String COLUMNNAME_AD_CtxHelpMsg_ID = "AD_CtxHelpMsg_ID";
    /**
     * Column name AD_CtxHelpSuggestion_ID
     */
    String COLUMNNAME_AD_CtxHelpSuggestion_ID = "AD_CtxHelpSuggestion_ID";
    /**
     * Column name AD_CtxHelpSuggestion_UU
     */
    String COLUMNNAME_AD_CtxHelpSuggestion_UU = "AD_CtxHelpSuggestion_UU";
    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_UserClient_ID
     */
    String COLUMNNAME_AD_UserClient_ID = "AD_UserClient_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name CompareSuggestion
     */
    String COLUMNNAME_CompareSuggestion = "CompareSuggestion";
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
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsSaveAsTenantCustomization
     */
    String COLUMNNAME_IsSaveAsTenantCustomization = "IsSaveAsTenantCustomization";
    /**
     * Column name MsgText
     */
    String COLUMNNAME_MsgText = "MsgText";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name RejectSuggestion
     */
    String COLUMNNAME_RejectSuggestion = "RejectSuggestion";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Accept. Accept suggested changes
     */
    String getAcceptSuggestion();

    /**
     * Set Accept. Accept suggested changes
     */
    void setAcceptSuggestion(String AcceptSuggestion);

    /**
     * Get Context Help
     */
    int getAD_CtxHelp_ID();

    /**
     * Set Context Help
     */
    void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

    I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

    /**
     * Get Context Help Message
     */
    int getAD_CtxHelpMsg_ID();

    /**
     * Set Context Help Message
     */
    void setAD_CtxHelpMsg_ID(int AD_CtxHelpMsg_ID);

    I_AD_CtxHelpMsg getAD_CtxHelpMsg() throws RuntimeException;

    /**
     * Get Context Help Suggestion
     */
    int getAD_CtxHelpSuggestion_ID();

    /**
     * Set Context Help Suggestion
     */
    void setAD_CtxHelpSuggestion_ID(int AD_CtxHelpSuggestion_ID);

    /**
     * Get Context Help Suggestion UUID
     */
    String getAD_CtxHelpSuggestion_UU();

    /**
     * Set Context Help Suggestion UUID
     */
    void setAD_CtxHelpSuggestion_UU(String AD_CtxHelpSuggestion_UU);

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
     * Get Tenant of User
     */
    int getAD_UserClient_ID();

    /**
     * Set Tenant of User
     */
    void setAD_UserClient_ID(int AD_UserClient_ID);

    I_AD_AllClients_V getAD_UserClient() throws RuntimeException;

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_AllUsers_V getAD_User() throws RuntimeException;

    /**
     * Get Compare. Compare suggested text with original text
     */
    String getCompareSuggestion();

    /**
     * Set Compare. Compare suggested text with original text
     */
    void setCompareSuggestion(String CompareSuggestion);

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
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Save As Tenant Customization. Apply changes as tenant customization
     */
    void setIsSaveAsTenantCustomization(boolean IsSaveAsTenantCustomization);

    /**
     * Get Save As Tenant Customization. Apply changes as tenant customization
     */
    boolean isSaveAsTenantCustomization();

    /**
     * Get Message Text. Textual Informational, Menu or Error Message
     */
    String getMsgText();

    /**
     * Set Message Text. Textual Informational, Menu or Error Message
     */
    void setMsgText(String MsgText);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Reject. Reject suggested changes
     */
    String getRejectSuggestion();

    /**
     * Set Reject. Reject suggested changes
     */
    void setRejectSuggestion(String RejectSuggestion);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
