package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_MailMsg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_MailMsg {

  /** TableName=W_MailMsg */
  String Table_Name = "W_MailMsg";

  /** AD_Table_ID=780 */
  int Table_ID = 780;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name MailMsgType */
  String COLUMNNAME_MailMsgType = "MailMsgType";
  /** Column name Message */
  String COLUMNNAME_Message = "Message";
  /** Column name Message2 */
  String COLUMNNAME_Message2 = "Message2";
  /** Column name Message3 */
  String COLUMNNAME_Message3 = "Message3";
  /** Column name Subject */
  String COLUMNNAME_Subject = "Subject";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name W_MailMsg_ID */
  String COLUMNNAME_W_MailMsg_ID = "W_MailMsg_ID";
  /** Column name W_MailMsg_UU */
  String COLUMNNAME_W_MailMsg_UU = "W_MailMsg_UU";
  /** Column name W_Store_ID */
  String COLUMNNAME_W_Store_ID = "W_Store_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Message Type. Mail Message Type */
  String getMailMsgType();

  /** Set Message Type. Mail Message Type */
  void setMailMsgType(String MailMsgType);

  /** Get Message. EMail Message */
  String getMessage();

  /** Set Message. EMail Message */
  void setMessage(String Message);

  /** Get Message 2. Optional second part of the EMail Message */
  String getMessage2();

  /** Set Message 2. Optional second part of the EMail Message */
  void setMessage2(String Message2);

  /** Get Message 3. Optional third part of the EMail Message */
  String getMessage3();

  /** Set Message 3. Optional third part of the EMail Message */
  void setMessage3(String Message3);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

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

  /** Get W_MailMsg_UU */
  String getW_MailMsg_UU();

  /** Set W_MailMsg_UU */
  void setW_MailMsg_UU(String W_MailMsg_UU);

  /** Get Web Store. A Web Store of the Client */
  int getW_Store_ID();

  /** Set Web Store. A Web Store of the Client */
  void setW_Store_ID(int W_Store_ID);

  I_W_Store getW_Store() throws RuntimeException;
}
