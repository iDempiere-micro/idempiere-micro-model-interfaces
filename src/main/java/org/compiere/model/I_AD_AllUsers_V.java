package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AllUsers_V
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AllUsers_V {

    /**
     * TableName=AD_AllUsers_V
     */
    String Table_Name = "AD_AllUsers_V";

    /**
     * AD_Table_ID=200224
     */
    int Table_ID = 200224;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_AllClients_V_ID
     */
    String COLUMNNAME_AD_AllClients_V_ID = "AD_AllClients_V_ID";
    /**
     * Column name AD_AllUsers_V_ID
     */
    String COLUMNNAME_AD_AllUsers_V_ID = "AD_AllUsers_V_ID";
    /**
     * Column name AD_AllUsers_V_UU
     */
    String COLUMNNAME_AD_AllUsers_V_UU = "AD_AllUsers_V_UU";
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
     * Column name DateLastLogin
     */
    String COLUMNNAME_DateLastLogin = "DateLastLogin";
    /**
     * Column name DatePasswordChanged
     */
    String COLUMNNAME_DatePasswordChanged = "DatePasswordChanged";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name FailedLoginCount
     */
    String COLUMNNAME_FailedLoginCount = "FailedLoginCount";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsExpired
     */
    String COLUMNNAME_IsExpired = "IsExpired";
    /**
     * Column name IsLocked
     */
    String COLUMNNAME_IsLocked = "IsLocked";
    /**
     * Column name IsNoPasswordReset
     */
    String COLUMNNAME_IsNoPasswordReset = "IsNoPasswordReset";
    /**
     * Column name LDAPUser
     */
    String COLUMNNAME_LDAPUser = "LDAPUser";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name Salt
     */
    String COLUMNNAME_Salt = "Salt";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserPIN
     */
    String COLUMNNAME_UserPIN = "UserPIN";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get All Clients
     */
    int getAD_AllClients_V_ID();

    /**
     * Set All Clients
     */
    void setAD_AllClients_V_ID(int AD_AllClients_V_ID);

    I_AD_AllClients_V getAD_AllClients_V() throws RuntimeException;

    /**
     * Get All Users
     */
    int getAD_AllUsers_V_ID();

    /**
     * Set All Users
     */
    void setAD_AllUsers_V_ID(int AD_AllUsers_V_ID);

    /**
     * Get AD_AllUsers_V_UU
     */
    String getAD_AllUsers_V_UU();

    /**
     * Set AD_AllUsers_V_UU
     */
    void setAD_AllUsers_V_UU(String AD_AllUsers_V_UU);

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
     * Get Date Last Login
     */
    Timestamp getDateLastLogin();

    /**
     * Set Date Last Login
     */
    void setDateLastLogin(Timestamp DateLastLogin);

    /**
     * Get Date Password Changed
     */
    Timestamp getDatePasswordChanged();

    /**
     * Set Date Password Changed
     */
    void setDatePasswordChanged(Timestamp DatePasswordChanged);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Get Failed Login Count
     */
    int getFailedLoginCount();

    /**
     * Set Failed Login Count
     */
    void setFailedLoginCount(int FailedLoginCount);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Expired
     */
    void setIsExpired(boolean IsExpired);

    /**
     * Get Expired
     */
    boolean isExpired();

    /**
     * Set Locked
     */
    void setIsLocked(boolean IsLocked);

    /**
     * Get Locked
     */
    boolean isLocked();

    /**
     * Set No Password Reset
     */
    void setIsNoPasswordReset(boolean IsNoPasswordReset);

    /**
     * Get No Password Reset
     */
    boolean isNoPasswordReset();

    /**
     * Get LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    String getLDAPUser();

    /**
     * Set LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    void setLDAPUser(String LDAPUser);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Password. Password of any length (case sensitive)
     */
    String getPassword();

    /**
     * Set Password. Password of any length (case sensitive)
     */
    void setPassword(String Password);

    /**
     * Get Salt. Random data added to improve password hash effectiveness
     */
    String getSalt();

    /**
     * Set Salt. Random data added to improve password hash effectiveness
     */
    void setSalt(String Salt);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User PIN
     */
    String getUserPIN();

    /**
     * Set User PIN
     */
    void setUserPIN(String UserPIN);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
