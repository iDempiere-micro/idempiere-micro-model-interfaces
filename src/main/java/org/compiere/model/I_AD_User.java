package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for AD_User
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User extends IPO {

    /**
     * TableName=AD_User
     */
    String Table_Name = "AD_User";

    /**
     * AD_Table_ID=114
     */
    int Table_ID = 114;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_User_UU
     */
    String COLUMNNAME_AD_User_UU = "AD_User_UU";
    /**
     * Column name Answer
     */
    String COLUMNNAME_Answer = "Answer";
    /**
     * Column name Birthday
     */
    String COLUMNNAME_Birthday = "Birthday";
    /**
     * Column name BP_Location_ID
     */
    String COLUMNNAME_BP_Location_ID = "BP_Location_ID";
    /**
     * Column name BPName
     */
    String COLUMNNAME_BPName = "BPName";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name C_Job_ID
     */
    String COLUMNNAME_C_Job_ID = "C_Job_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateAccountLocked
     */
    String COLUMNNAME_DateAccountLocked = "DateAccountLocked";
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
     * Column name EMailUser
     */
    String COLUMNNAME_EMailUser = "EMailUser";
    /**
     * Column name EMailUserPW
     */
    String COLUMNNAME_EMailUserPW = "EMailUserPW";
    /**
     * Column name EMailVerify
     */
    String COLUMNNAME_EMailVerify = "EMailVerify";
    /**
     * Column name EMailVerifyDate
     */
    String COLUMNNAME_EMailVerifyDate = "EMailVerifyDate";
    /**
     * Column name FailedLoginCount
     */
    String COLUMNNAME_FailedLoginCount = "FailedLoginCount";
    /**
     * Column name Fax
     */
    String COLUMNNAME_Fax = "Fax";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAddMailTextAutomatically
     */
    String COLUMNNAME_IsAddMailTextAutomatically = "IsAddMailTextAutomatically";
    /**
     * Column name IsExpired
     */
    String COLUMNNAME_IsExpired = "IsExpired";
    /**
     * Column name IsFullBPAccess
     */
    String COLUMNNAME_IsFullBPAccess = "IsFullBPAccess";
    /**
     * Column name IsInPayroll
     */
    String COLUMNNAME_IsInPayroll = "IsInPayroll";
    /**
     * Column name IsLocked
     */
    String COLUMNNAME_IsLocked = "IsLocked";
    /**
     * Column name IsMenuAutoExpand
     */
    String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";
    /**
     * Column name IsNoPasswordReset
     */
    String COLUMNNAME_IsNoPasswordReset = "IsNoPasswordReset";
    /**
     * Column name IsSalesLead
     */
    String COLUMNNAME_IsSalesLead = "IsSalesLead";
    /**
     * Column name LastContact
     */
    String COLUMNNAME_LastContact = "LastContact";
    /**
     * Column name LastResult
     */
    String COLUMNNAME_LastResult = "LastResult";
    /**
     * Column name LDAPUser
     */
    String COLUMNNAME_LDAPUser = "LDAPUser";
    /**
     * Column name LeadSource
     */
    String COLUMNNAME_LeadSource = "LeadSource";
    /**
     * Column name LeadSourceDescription
     */
    String COLUMNNAME_LeadSourceDescription = "LeadSourceDescription";
    /**
     * Column name LeadStatus
     */
    String COLUMNNAME_LeadStatus = "LeadStatus";
    /**
     * Column name LeadStatusDescription
     */
    String COLUMNNAME_LeadStatusDescription = "LeadStatusDescription";
    /**
     * Column name NotificationType
     */
    String COLUMNNAME_NotificationType = "NotificationType";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name Phone2
     */
    String COLUMNNAME_Phone2 = "Phone2";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name R_DefaultMailText_ID
     */
    String COLUMNNAME_R_DefaultMailText_ID = "R_DefaultMailText_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Salt
     */
    String COLUMNNAME_Salt = "Salt";
    /**
     * Column name SecurityQuestion
     */
    String COLUMNNAME_SecurityQuestion = "SecurityQuestion";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
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
     * Column name UserPIN
     */
    String COLUMNNAME_UserPIN = "UserPIN";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

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
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    /**
     * Get AD_User_UU
     */
    String getAD_User_UU();

    /**
     * Set AD_User_UU
     */
    void setAD_User_UU(String AD_User_UU);

    /**
     * Get Answer
     */
    String getAnswer();

    /**
     * Set Answer
     */
    void setAnswer(String Answer);

    /**
     * Get Birthday. Birthday or Anniversary day
     */
    Timestamp getBirthday();

    /**
     * Set Birthday. Birthday or Anniversary day
     */
    void setBirthday(Timestamp Birthday);

    /**
     * Get BP Address. Address of the Business Partner
     */
    int getBP_Location_ID();

    /**
     * Set BP Address. Address of the Business Partner
     */
    void setBP_Location_ID(int BP_Location_ID);

    I_C_Location getBP_Location() throws RuntimeException;

    /**
     * Get BP Name
     */
    String getBPName();

    /**
     * Set BP Name
     */
    void setBPName(String BPName);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Greeting. Greeting to print on correspondence
     */
    int getC_Greeting_ID();

    /**
     * Set Greeting. Greeting to print on correspondence
     */
    void setC_Greeting_ID(int C_Greeting_ID);

    I_C_Greeting getC_Greeting() throws RuntimeException;

    /**
     * Get Position. Job Position
     */
    int getC_Job_ID();

    /**
     * Set Position. Job Position
     */
    void setC_Job_ID(int C_Job_ID);

    I_C_Job getC_Job() throws RuntimeException;

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Set Address. Location or Address
     */
    void setC_Location_ID(int C_Location_ID);

    I_C_Location getC_Location() throws RuntimeException;

    /**
     * Get Comments. Comments or additional information
     */
    String getComments();

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date Account Locked
     */
    Timestamp getDateAccountLocked();

    /**
     * Set Date Account Locked
     */
    void setDateAccountLocked(Timestamp DateAccountLocked);

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
     * Get EMail User ID. User Name (ID) in the Mail System
     */
    String getEMailUser();

    /**
     * Set EMail User ID. User Name (ID) in the Mail System
     */
    void setEMailUser(String EMailUser);

    /**
     * Get EMail User Password. Password of your email user id
     */
    String getEMailUserPW();

    /**
     * Set EMail User Password. Password of your email user id
     */
    void setEMailUserPW(String EMailUserPW);

    /**
     * Get Verification Info. Verification information of EMail Address
     */
    String getEMailVerify();

    /**
     * Set Verification Info. Verification information of EMail Address
     */
    void setEMailVerify(String EMailVerify);

    /**
     * Get EMail Verify. Date Email was verified
     */
    Timestamp getEMailVerifyDate();

    /**
     * Set EMail Verify. Date Email was verified
     */
    void setEMailVerifyDate(Timestamp EMailVerifyDate);

    /**
     * Get Failed Login Count
     */
    int getFailedLoginCount();

    /**
     * Set Failed Login Count
     */
    void setFailedLoginCount(int FailedLoginCount);

    /**
     * Get Fax. Facsimile number
     */
    String getFax();

    /**
     * Set Fax. Facsimile number
     */
    void setFax(String Fax);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Add Mail Text Automatically. The selected mail template will be automatically inserted when
     * creating an email
     */
    void setIsAddMailTextAutomatically(boolean IsAddMailTextAutomatically);

    /**
     * Get Add Mail Text Automatically. The selected mail template will be automatically inserted when
     * creating an email
     */
    boolean isAddMailTextAutomatically();

    /**
     * Set Expired
     */
    void setIsExpired(boolean IsExpired);

    /**
     * Get Expired
     */
    boolean isExpired();

    /**
     * Set Full BP Access. The user/contact has full access to Business Partner information and
     * resources
     */
    void setIsFullBPAccess(boolean IsFullBPAccess);

    /**
     * Get Full BP Access. The user/contact has full access to Business Partner information and
     * resources
     */
    boolean isFullBPAccess();

    /**
     * Set Is In Payroll. Defined if any User Contact will be used for Calculate Payroll
     */
    void setIsInPayroll(boolean IsInPayroll);

    /**
     * Get Is In Payroll. Defined if any User Contact will be used for Calculate Payroll
     */
    boolean isInPayroll();

    /**
     * Set Locked
     */
    void setIsLocked(boolean IsLocked);

    /**
     * Get Locked
     */
    boolean isLocked();

    /**
     * Get Auto expand menu. If ticked, the menu is automatically expanded
     */
    String getIsMenuAutoExpand();

    /**
     * Set Auto expand menu. If ticked, the menu is automatically expanded
     */
    void setIsMenuAutoExpand(String IsMenuAutoExpand);

    /**
     * Set No Password Reset
     */
    void setIsNoPasswordReset(boolean IsNoPasswordReset);

    /**
     * Get No Password Reset
     */
    boolean isNoPasswordReset();

    /**
     * Set Sales Lead. This contact is a sales lead
     */
    void setIsSalesLead(boolean IsSalesLead);

    /**
     * Get Sales Lead. This contact is a sales lead
     */
    boolean isSalesLead();

    /**
     * Get Last Contact. Date this individual was last contacted
     */
    Timestamp getLastContact();

    /**
     * Set Last Contact. Date this individual was last contacted
     */
    void setLastContact(Timestamp LastContact);

    /**
     * Get Last Result. Result of last contact
     */
    String getLastResult();

    /**
     * Set Last Result. Result of last contact
     */
    void setLastResult(String LastResult);

    /**
     * Get LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    String getLDAPUser();

    /**
     * Set LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    void setLDAPUser(String LDAPUser);

    /**
     * Get Lead Source. The source of this lead/opportunity
     */
    String getLeadSource();

    /**
     * Set Lead Source. The source of this lead/opportunity
     */
    void setLeadSource(String LeadSource);

    /**
     * Get Lead Source Description. Additional information on the source of this lead/opportunity
     */
    String getLeadSourceDescription();

    /**
     * Set Lead Source Description. Additional information on the source of this lead/opportunity
     */
    void setLeadSourceDescription(String LeadSourceDescription);

    /**
     * Get Lead Status. The status of this lead/opportunity in the sales cycle
     */
    String getLeadStatus();

    /**
     * Set Lead Status. The status of this lead/opportunity in the sales cycle
     */
    void setLeadStatus(String LeadStatus);

    /**
     * Get Lead Status Description. Additional information on the status of this lead/opportunity
     */
    String getLeadStatusDescription();

    /**
     * Set Lead Status Description. Additional information on the status of this lead/opportunity
     */
    void setLeadStatusDescription(String LeadStatusDescription);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Notification Type. Type of Notifications
     */
    String getNotificationType();

    /**
     * Set Notification Type. Type of Notifications
     */
    void setNotificationType(String NotificationType);

    /**
     * Get Password. Password of any length (case sensitive)
     */
    String getPassword();

    /**
     * Set Password. Password of any length (case sensitive)
     */
    void setPassword(String Password);

    /**
     * Get Phone. Identifies a telephone number
     */
    String getPhone();

    /**
     * Set Phone. Identifies a telephone number
     */
    void setPhone(String Phone);

    /**
     * Get 2nd Phone. Identifies an alternate telephone number.
     */
    String getPhone2();

    /**
     * Set 2nd Phone. Identifies an alternate telephone number.
     */
    void setPhone2(String Phone2);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Default mail template
     */
    int getR_DefaultMailText_ID();

    /**
     * Set Default mail template
     */
    void setR_DefaultMailText_ID(int R_DefaultMailText_ID);

    I_R_MailText getR_DefaultMailText() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Salt. Random data added to improve password hash effectiveness
     */
    String getSalt();

    /**
     * Set Salt. Random data added to improve password hash effectiveness
     */
    void setSalt(String Salt);

    /**
     * Get Security Question
     */
    String getSecurityQuestion();

    /**
     * Set Security Question
     */
    void setSecurityQuestion(String SecurityQuestion);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisor_ID();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisor_ID(int Supervisor_ID);

    I_AD_User getSupervisor() throws RuntimeException;

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
