package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ChangeLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ChangeLog {

  /** TableName=AD_ChangeLog */
  String Table_Name = "AD_ChangeLog";

  /** AD_Table_ID=580 */
  int Table_ID = 580;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_ChangeLog_ID */
  String COLUMNNAME_AD_ChangeLog_ID = "AD_ChangeLog_ID";
  /** Column name AD_ChangeLog_UU */
  String COLUMNNAME_AD_ChangeLog_UU = "AD_ChangeLog_UU";
  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Session_ID */
  String COLUMNNAME_AD_Session_ID = "AD_Session_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EventChangeLog */
  String COLUMNNAME_EventChangeLog = "EventChangeLog";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCustomization */
  String COLUMNNAME_IsCustomization = "IsCustomization";
  /** Column name NewValue */
  String COLUMNNAME_NewValue = "NewValue";
  /** Column name OldValue */
  String COLUMNNAME_OldValue = "OldValue";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name Redo */
  String COLUMNNAME_Redo = "Redo";
  /** Column name TrxName */
  String COLUMNNAME_TrxName = "TrxName";
  /** Column name Undo */
  String COLUMNNAME_Undo = "Undo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Change Log. Log of data changes */
  int getAD_ChangeLog_ID();

  /** Set Change Log. Log of data changes */
  void setAD_ChangeLog_ID(int AD_ChangeLog_ID);

  /** Get AD_ChangeLog_UU */
  String getAD_ChangeLog_UU();

  /** Set AD_ChangeLog_UU */
  void setAD_ChangeLog_UU(String AD_ChangeLog_UU);

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Session. User Session Online or Web */
  int getAD_Session_ID();

  /** Set Session. User Session Online or Web */
  void setAD_Session_ID(int AD_Session_ID);

  I_AD_Session getAD_Session() throws RuntimeException;

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

  /** Get Event Change Log. Type of Event in Change Log */
  String getEventChangeLog();

  /** Set Event Change Log. Type of Event in Change Log */
  void setEventChangeLog(String EventChangeLog);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Set Customization. The change is a customization of the data dictionary and can be applied
   * after Migration
   */
  void setIsCustomization(boolean IsCustomization);

  /**
   * Get Customization. The change is a customization of the data dictionary and can be applied
   * after Migration
   */
  boolean isCustomization();

  /** Get New Value. New field value */
  String getNewValue();

  /** Set New Value. New field value */
  void setNewValue(String NewValue);

  /** Get Old Value. The old file data */
  String getOldValue();

  /** Set Old Value. The old file data */
  void setOldValue(String OldValue);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Redo */
  String getRedo();

  /** Set Redo */
  void setRedo(String Redo);

  /** Get Transaction. Name of the transaction */
  String getTrxName();

  /** Set Transaction. Name of the transaction */
  void setTrxName(String TrxName);

  /** Get Undo */
  String getUndo();

  /** Set Undo */
  void setUndo(String Undo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
