package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Media_Server
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Media_Server {

  /** TableName=CM_Media_Server */
  String Table_Name = "CM_Media_Server";

  /** AD_Table_ID=859 */
  int Table_ID = 859;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_Media_Server_ID */
  String COLUMNNAME_CM_Media_Server_ID = "CM_Media_Server_ID";
  /** Column name CM_Media_Server_UU */
  String COLUMNNAME_CM_Media_Server_UU = "CM_Media_Server_UU";
  /** Column name CM_WebProject_ID */
  String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Folder */
  String COLUMNNAME_Folder = "Folder";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IP_Address */
  String COLUMNNAME_IP_Address = "IP_Address";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPassive */
  String COLUMNNAME_IsPassive = "IsPassive";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name URL */
  String COLUMNNAME_URL = "URL";
  /** Column name UserName */
  String COLUMNNAME_UserName = "UserName";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Media Server. Media Server list to which content should get transfered */
  int getCM_Media_Server_ID();

  /** Set Media Server. Media Server list to which content should get transfered */
  void setCM_Media_Server_ID(int CM_Media_Server_ID);

  /** Get CM_Media_Server_UU */
  String getCM_Media_Server_UU();

  /** Set CM_Media_Server_UU */
  void setCM_Media_Server_UU(String CM_Media_Server_UU);

  /**
   * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  int getCM_WebProject_ID();

  /**
   * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  void setCM_WebProject_ID(int CM_WebProject_ID);

  I_CM_WebProject getCM_WebProject() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Folder. A folder on a local or remote system to store data into */
  String getFolder();

  /** Set Folder. A folder on a local or remote system to store data into */
  void setFolder(String Folder);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get IP Address. Defines the IP address to transfer data to */
  String getIP_Address();

  /** Set IP Address. Defines the IP address to transfer data to */
  void setIP_Address(String IP_Address);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Transfer passive. FTP passive transfer */
  void setIsPassive(boolean IsPassive);

  /** Get Transfer passive. FTP passive transfer */
  boolean isPassive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get URL. Full URL address - e.g. http://www.idempiere.org */
  String getURL();

  /** Set URL. Full URL address - e.g. http://www.idempiere.org */
  void setURL(String URL);

  /** Get User Name */
  String getUserName();

  /** Set User Name */
  void setUserName(String UserName);
}
