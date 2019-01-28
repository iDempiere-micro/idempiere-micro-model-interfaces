package org.compiere.model;

import org.idempiere.icommon.model.INamedPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_User
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User extends INamedPO {

  /** TableName=AD_User */
  String Table_Name = "AD_User";

  /** AD_Table_ID=114 */
  int Table_ID = 114;

    /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_User_UU */
  String COLUMNNAME_AD_User_UU = "AD_User_UU";
  /** Column name Answer */
  String COLUMNNAME_Answer = "Answer";
  /** Column name Birthday */
  String COLUMNNAME_Birthday = "Birthday";
  /** Column name BP_Location_ID */
  String COLUMNNAME_BP_Location_ID = "BP_Location_ID";
  /** Column name BPName */
  String COLUMNNAME_BPName = "BPName";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Greeting_ID */
  String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
  /** Column name C_Job_ID */
  String COLUMNNAME_C_Job_ID = "C_Job_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Comments */
  String COLUMNNAME_Comments = "Comments";
    /** Column name DateAccountLocked */
  String COLUMNNAME_DateAccountLocked = "DateAccountLocked";
  /** Column name DateLastLogin */
  String COLUMNNAME_DateLastLogin = "DateLastLogin";
  /** Column name DatePasswordChanged */
  String COLUMNNAME_DatePasswordChanged = "DatePasswordChanged";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name EMailUser */
  String COLUMNNAME_EMailUser = "EMailUser";
  /** Column name EMailUserPW */
  String COLUMNNAME_EMailUserPW = "EMailUserPW";
  /** Column name EMailVerify */
  String COLUMNNAME_EMailVerify = "EMailVerify";
  /** Column name EMailVerifyDate */
  String COLUMNNAME_EMailVerifyDate = "EMailVerifyDate";
  /** Column name FailedLoginCount */
  String COLUMNNAME_FailedLoginCount = "FailedLoginCount";
  /** Column name Fax */
  String COLUMNNAME_Fax = "Fax";
    /** Column name IsAddMailTextAutomatically */
  String COLUMNNAME_IsAddMailTextAutomatically = "IsAddMailTextAutomatically";
  /** Column name IsExpired */
  String COLUMNNAME_IsExpired = "IsExpired";
  /** Column name IsFullBPAccess */
  String COLUMNNAME_IsFullBPAccess = "IsFullBPAccess";
  /** Column name IsInPayroll */
  String COLUMNNAME_IsInPayroll = "IsInPayroll";
  /** Column name IsLocked */
  String COLUMNNAME_IsLocked = "IsLocked";
  /** Column name IsMenuAutoExpand */
  String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";
  /** Column name IsNoPasswordReset */
  String COLUMNNAME_IsNoPasswordReset = "IsNoPasswordReset";
  /** Column name IsSalesLead */
  String COLUMNNAME_IsSalesLead = "IsSalesLead";
  /** Column name LastContact */
  String COLUMNNAME_LastContact = "LastContact";
  /** Column name LastResult */
  String COLUMNNAME_LastResult = "LastResult";
  /** Column name LDAPUser */
  String COLUMNNAME_LDAPUser = "LDAPUser";
  /** Column name LeadSource */
  String COLUMNNAME_LeadSource = "LeadSource";
  /** Column name LeadSourceDescription */
  String COLUMNNAME_LeadSourceDescription = "LeadSourceDescription";
  /** Column name LeadStatus */
  String COLUMNNAME_LeadStatus = "LeadStatus";
  /** Column name LeadStatusDescription */
  String COLUMNNAME_LeadStatusDescription = "LeadStatusDescription";
  /** Column name NotificationType */
  String COLUMNNAME_NotificationType = "NotificationType";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name Phone */
  String COLUMNNAME_Phone = "Phone";
  /** Column name Phone2 */
  String COLUMNNAME_Phone2 = "Phone2";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name R_DefaultMailText_ID */
  String COLUMNNAME_R_DefaultMailText_ID = "R_DefaultMailText_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name Salt */
  String COLUMNNAME_Salt = "Salt";
  /** Column name SecurityQuestion */
  String COLUMNNAME_SecurityQuestion = "SecurityQuestion";
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
  /** Column name Title */
  String COLUMNNAME_Title = "Title";
    /** Column name UserPIN */
  String COLUMNNAME_UserPIN = "UserPIN";

    /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

    /** Get BP Address. Address of the Business Partner */
  int getBP_Location_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

    /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

    /** Get Greeting. Greeting to print on correspondence */
  int getC_Greeting_ID();

    /** Get Position. Job Position */
  int getC_Job_ID();

    /** Get Address. Location or Address */
  int getC_Location_ID();

    /** Set Date Password Changed */
  void setDatePasswordChanged(Timestamp DatePasswordChanged);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Get EMail User ID. User Name (ID) in the Mail System */
  String getEMailUser();

  /** Set EMail User ID. User Name (ID) in the Mail System */
  void setEMailUser(String EMailUser);

  /** Get EMail User Password. Password of your email user id */
  String getEMailUserPW();

  /** Set EMail User Password. Password of your email user id */
  void setEMailUserPW(String EMailUserPW);

  /** Get Verification Info. Verification information of EMail Address */
  String getEMailVerify();

  /** Set Verification Info. Verification information of EMail Address */
  void setEMailVerify(String EMailVerify);

  /** Get EMail Verify. Date Email was verified */
  Timestamp getEMailVerifyDate();

  /** Set EMail Verify. Date Email was verified */
  void setEMailVerifyDate(Timestamp EMailVerifyDate);

    /**
   * Set Full BP Access. The user/contact has full access to Business Partner information and
   * resources
   */
  void setIsFullBPAccess(boolean IsFullBPAccess);

    /** Get Auto expand menu. If ticked, the menu is automatically expanded */
  String getIsMenuAutoExpand();

    /** Set Last Contact. Date this individual was last contacted */
  void setLastContact(Timestamp LastContact);

    /** Set Last Result. Result of last contact */
  void setLastResult(String LastResult);

  /** Get LDAP User Name. User Name used for authorization via LDAP (directory) services */
  String getLDAPUser();

    /** Get Notification Type. Type of Notifications */
  String getNotificationType();

  /** Set Notification Type. Type of Notifications */
  void setNotificationType(String NotificationType);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Phone. Identifies a telephone number */
  String getPhone();

  /** Set Phone. Identifies a telephone number */
  void setPhone(String Phone);

    /** Get Default mail template */
  int getR_DefaultMailText_ID();

    /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

    /** Get Salt. Random data added to improve password hash effectiveness */
  String getSalt();

  /** Set Salt. Random data added to improve password hash effectiveness */
  void setSalt(String Salt);

    /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

    /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
