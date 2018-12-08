package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserMail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserMail {

  /** TableName=AD_UserMail */
  String Table_Name = "AD_UserMail";

  /** AD_Table_ID=782 */
  int Table_ID = 782;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_UserMail_ID */
  String COLUMNNAME_AD_UserMail_ID = "AD_UserMail_ID";
  /** Column name AD_UserMail_UU */
  String COLUMNNAME_AD_UserMail_UU = "AD_UserMail_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DeliveryConfirmation */
  String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
  /** Column name EMailFrom */
  String COLUMNNAME_EMailFrom = "EMailFrom";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDelivered */
  String COLUMNNAME_IsDelivered = "IsDelivered";
  /** Column name MailText */
  String COLUMNNAME_MailText = "MailText";
  /** Column name MessageID */
  String COLUMNNAME_MessageID = "MessageID";
  /** Column name RecipientBcc */
  String COLUMNNAME_RecipientBcc = "RecipientBcc";
  /** Column name RecipientCc */
  String COLUMNNAME_RecipientCc = "RecipientCc";
  /** Column name RecipientTo */
  String COLUMNNAME_RecipientTo = "RecipientTo";
  /** Column name R_MailText_ID */
  String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
  /** Column name Subject */
  String COLUMNNAME_Subject = "Subject";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name W_MailMsg_ID */
  String COLUMNNAME_W_MailMsg_ID = "W_MailMsg_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get User Mail. Mail sent to the user */
  int getAD_UserMail_ID();

  /** Set User Mail. Mail sent to the user */
  void setAD_UserMail_ID(int AD_UserMail_ID);

  /** Get AD_UserMail_UU */
  String getAD_UserMail_UU();

  /** Set AD_UserMail_UU */
  void setAD_UserMail_UU(String AD_UserMail_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Delivery Confirmation. EMail Delivery confirmation */
  String getDeliveryConfirmation();

  /** Set Delivery Confirmation. EMail Delivery confirmation */
  void setDeliveryConfirmation(String DeliveryConfirmation);

  /** Get EMail sent from */
  String getEMailFrom();

  /** Set EMail sent from */
  void setEMailFrom(String EMailFrom);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Delivered */
  String getIsDelivered();

  /** Set Delivered */
  void setIsDelivered(String IsDelivered);

  /** Get Mail Text. Text used for Mail message */
  String getMailText();

  /** Set Mail Text. Text used for Mail message */
  void setMailText(String MailText);

  /** Get Message ID. EMail Message ID */
  String getMessageID();

  /** Set Message ID. EMail Message ID */
  void setMessageID(String MessageID);

  /** Get Bcc */
  String getRecipientBcc();

  /** Set Bcc */
  void setRecipientBcc(String RecipientBcc);

  /** Get Cc */
  String getRecipientCc();

  /** Set Cc */
  void setRecipientCc(String RecipientCc);

  /** Get To */
  String getRecipientTo();

  /** Set To */
  void setRecipientTo(String RecipientTo);

  /** Get Mail Template. Text templates for mailings */
  int getR_MailText_ID();

  /** Set Mail Template. Text templates for mailings */
  void setR_MailText_ID(int R_MailText_ID);

  I_R_MailText getR_MailText() throws RuntimeException;

  /** Get Subject. Email Message Subject */
  String getSubject();

  /** Set Subject. Email Message Subject */
  void setSubject(String Subject);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Mail Message. Web Store Mail Message Template */
  int getW_MailMsg_ID();

  /** Set Mail Message. Web Store Mail Message Template */
  void setW_MailMsg_ID(int W_MailMsg_ID);

  I_W_MailMsg getW_MailMsg() throws RuntimeException;
}
