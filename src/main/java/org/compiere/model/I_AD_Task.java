package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Task
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Task {

  /** TableName=AD_Task */
  String Table_Name = "AD_Task";

  /** AD_Table_ID=118 */
  int Table_ID = 118;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";
  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Task_ID */
  String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
  /** Column name AD_Task_UU */
  String COLUMNNAME_AD_Task_UU = "AD_Task_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsServerProcess */
  String COLUMNNAME_IsServerProcess = "IsServerProcess";
  /** Column name OS_Command */
  String COLUMNNAME_OS_Command = "OS_Command";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Data Access Level. Access Level required */
  String getAccessLevel();

  /** Set Data Access Level. Access Level required */
  void setAccessLevel(String AccessLevel);

  /** Get Context Help */
  int getAD_CtxHelp_ID();

  /** Set Context Help */
  void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get OS Task. Operation System Task */
  int getAD_Task_ID();

  /** Set OS Task. Operation System Task */
  void setAD_Task_ID(int AD_Task_ID);

  /** Get AD_Task_UU */
  String getAD_Task_UU();

  /** Set AD_Task_UU */
  void setAD_Task_UU(String AD_Task_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Server Process. Run this Process on Server only */
  void setIsServerProcess(boolean IsServerProcess);

  /** Get Server Process. Run this Process on Server only */
  boolean isServerProcess();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get OS Command. Operating System Command */
  String getOS_Command();

  /** Set OS Command. Operating System Command */
  void setOS_Command(String OS_Command);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
