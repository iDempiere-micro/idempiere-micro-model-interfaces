package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserDef_Win
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserDef_Win {

    /**
     * TableName=AD_UserDef_Win
     */
    String Table_Name = "AD_UserDef_Win";

    /**
     * AD_Table_ID=467
     */
    int Table_ID = 467;

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
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_UserDef_Win_ID
     */
    String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";
    /**
     * Column name AD_UserDef_Win_UU
     */
    String COLUMNNAME_AD_UserDef_Win_UU = "AD_UserDef_Win_UU";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
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
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsReadOnly
     */
    String COLUMNNAME_IsReadOnly = "IsReadOnly";
    /**
     * Column name IsUserUpdateable
     */
    String COLUMNNAME_IsUserUpdateable = "IsUserUpdateable";
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
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get User defined Window
     */
    int getAD_UserDef_Win_ID();

    /**
     * Set User defined Window
     */
    void setAD_UserDef_Win_ID(int AD_UserDef_Win_ID);

    /**
     * Get AD_UserDef_Win_UU
     */
    String getAD_UserDef_Win_UU();

    /**
     * Set AD_UserDef_Win_UU
     */
    void setAD_UserDef_Win_UU(String AD_UserDef_Win_UU);

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
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Read Only. Field is read only
     */
    void setIsReadOnly(boolean IsReadOnly);

    /**
     * Get Read Only. Field is read only
     */
    boolean isReadOnly();

    /**
     * Set User updatable. The field can be updated by the user
     */
    void setIsUserUpdateable(boolean IsUserUpdateable);

    /**
     * Get User updatable. The field can be updated by the user
     */
    boolean isUserUpdateable();

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
