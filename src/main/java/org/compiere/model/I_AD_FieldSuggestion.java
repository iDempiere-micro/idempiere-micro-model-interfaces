package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_FieldSuggestion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_FieldSuggestion {

    /**
     * TableName=AD_FieldSuggestion
     */
    String Table_Name = "AD_FieldSuggestion";

    /**
     * AD_Table_ID=200209
     */
    int Table_ID = 200209;

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
     * Column name AD_Field_ID
     */
    String COLUMNNAME_AD_Field_ID = "AD_Field_ID";
    /**
     * Column name AD_FieldSuggestion_ID
     */
    String COLUMNNAME_AD_FieldSuggestion_ID = "AD_FieldSuggestion_ID";
    /**
     * Column name AD_FieldSuggestion_UU
     */
    String COLUMNNAME_AD_FieldSuggestion_UU = "AD_FieldSuggestion_UU";
    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Tab_ID
     */
    String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
    /**
     * Column name AD_UserClient_ID
     */
    String COLUMNNAME_AD_UserClient_ID = "AD_UserClient_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name FieldSuggestionTarget
     */
    String COLUMNNAME_FieldSuggestionTarget = "FieldSuggestionTarget";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsUpdateBaseLanguage
     */
    String COLUMNNAME_IsUpdateBaseLanguage = "IsUpdateBaseLanguage";
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
     * Get Field. Field on a database table
     */
    int getAD_Field_ID();

    /**
     * Set Field. Field on a database table
     */
    void setAD_Field_ID(int AD_Field_ID);

    I_AD_Field getAD_Field() throws RuntimeException;

    /**
     * Get Field Suggestions
     */
    int getAD_FieldSuggestion_ID();

    /**
     * Set Field Suggestions
     */
    void setAD_FieldSuggestion_ID(int AD_FieldSuggestion_ID);

    /**
     * Get Field Suggestions UUID
     */
    String getAD_FieldSuggestion_UU();

    /**
     * Set Field Suggestions UUID
     */
    void setAD_FieldSuggestion_UU(String AD_FieldSuggestion_UU);

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
     * Get Tab. Tab within a Window
     */
    int getAD_Tab_ID();

    /**
     * Set Tab. Tab within a Window
     */
    void setAD_Tab_ID(int AD_Tab_ID);

    I_AD_Tab getAD_Tab() throws RuntimeException;

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
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Apply Suggestion To
     */
    String getFieldSuggestionTarget();

    /**
     * Set Apply Suggestion To
     */
    void setFieldSuggestionTarget(String FieldSuggestionTarget);

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
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Update Base Language
     */
    void setIsUpdateBaseLanguage(boolean IsUpdateBaseLanguage);

    /**
     * Get Update Base Language
     */
    boolean isUpdateBaseLanguage();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

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
