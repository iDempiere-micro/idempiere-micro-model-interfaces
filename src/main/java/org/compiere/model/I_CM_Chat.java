package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Chat
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Chat {

  /** TableName=CM_Chat */
  String Table_Name = "CM_Chat";

  /** AD_Table_ID=876 */
  int Table_ID = 876;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name CM_Chat_ID */
  String COLUMNNAME_CM_Chat_ID = "CM_Chat_ID";
  /** Column name CM_ChatType_ID */
  String COLUMNNAME_CM_ChatType_ID = "CM_ChatType_ID";
  /** Column name CM_Chat_UU */
  String COLUMNNAME_CM_Chat_UU = "CM_Chat_UU";
  /** Column name ConfidentialType */
  String COLUMNNAME_ConfidentialType = "ConfidentialType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ModerationType */
  String COLUMNNAME_ModerationType = "ModerationType";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Chat. Chat or discussion thread */
  int getCM_Chat_ID();

  /** Set Chat. Chat or discussion thread */
  void setCM_Chat_ID(int CM_Chat_ID);

  /** Get Chat Type. Type of discussion / chat */
  int getCM_ChatType_ID();

  /** Set Chat Type. Type of discussion / chat */
  void setCM_ChatType_ID(int CM_ChatType_ID);

  I_CM_ChatType getCM_ChatType() throws RuntimeException;

  /** Get CM_Chat_UU */
  String getCM_Chat_UU();

  /** Set CM_Chat_UU */
  void setCM_Chat_UU(String CM_Chat_UU);

  /** Get Confidentiality. Type of Confidentiality */
  String getConfidentialType();

  /** Set Confidentiality. Type of Confidentiality */
  void setConfidentialType(String ConfidentialType);

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

  /** Get Moderation Type. Type of moderation */
  String getModerationType();

  /** Set Moderation Type. Type of moderation */
  void setModerationType(String ModerationType);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
