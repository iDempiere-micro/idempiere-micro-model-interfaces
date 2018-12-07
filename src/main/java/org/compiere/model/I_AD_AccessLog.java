package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AccessLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AccessLog {

  /** TableName=AD_AccessLog */
  String Table_Name = "AD_AccessLog";

  /** AD_Table_ID=717 */
  int Table_ID = 717;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_AccessLog_ID */
  String COLUMNNAME_AD_AccessLog_ID = "AD_AccessLog_ID";
  /** Column name AD_AccessLog_UU */
  String COLUMNNAME_AD_AccessLog_UU = "AD_AccessLog_UU";
  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name Remote_Addr */
  String COLUMNNAME_Remote_Addr = "Remote_Addr";
  /** Column name Remote_Host */
  String COLUMNNAME_Remote_Host = "Remote_Host";
  /** Column name Reply */
  String COLUMNNAME_Reply = "Reply";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Access Log. Log of Access to the System */
  int getAD_AccessLog_ID();

  /** Set Access Log. Log of Access to the System */
  void setAD_AccessLog_ID(int AD_AccessLog_ID);

  /** Get AD_AccessLog_UU */
  String getAD_AccessLog_UU();

  /** Set AD_AccessLog_UU */
  void setAD_AccessLog_UU(String AD_AccessLog_UU);

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

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

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Remote Addr. Remote Address */
  String getRemote_Addr();

  /** Set Remote Addr. Remote Address */
  void setRemote_Addr(String Remote_Addr);

  /** Get Remote Host. Remote host Info */
  String getRemote_Host();

  /** Set Remote Host. Remote host Info */
  void setRemote_Host(String Remote_Host);

  /** Get Reply. Reply or Answer */
  String getReply();

  /** Set Reply. Reply or Answer */
  void setReply(String Reply);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
