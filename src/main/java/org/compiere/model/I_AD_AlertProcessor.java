package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AlertProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AlertProcessor {

  /** TableName=AD_AlertProcessor */
  String Table_Name = "AD_AlertProcessor";

  /** AD_Table_ID=700 */
  int Table_ID = 700;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_AlertProcessor_ID */
  String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
  /** Column name AD_AlertProcessor_UU */
  String COLUMNNAME_AD_AlertProcessor_UU = "AD_AlertProcessor_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Schedule_ID */
  String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateLastRun */
  String COLUMNNAME_DateLastRun = "DateLastRun";
  /** Column name DateNextRun */
  String COLUMNNAME_DateNextRun = "DateNextRun";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name KeepLogDays */
  String COLUMNNAME_KeepLogDays = "KeepLogDays";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Alert Processor. Alert Processor/Server Parameter */
  int getAD_AlertProcessor_ID();

  /** Set Alert Processor. Alert Processor/Server Parameter */
  void setAD_AlertProcessor_ID(int AD_AlertProcessor_ID);

  /** Get AD_AlertProcessor_UU */
  String getAD_AlertProcessor_UU();

  /** Set AD_AlertProcessor_UU */
  void setAD_AlertProcessor_UU(String AD_AlertProcessor_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Schedule */
  int getAD_Schedule_ID();

  /** Set Schedule */
  void setAD_Schedule_ID(int AD_Schedule_ID);

  I_AD_Schedule getAD_Schedule() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date last run. Date the process was last run. */
  Timestamp getDateLastRun();

  /** Set Date last run. Date the process was last run. */
  void setDateLastRun(Timestamp DateLastRun);

  /** Get Date next run. Date the process will run next */
  Timestamp getDateNextRun();

  /** Set Date next run. Date the process will run next */
  void setDateNextRun(Timestamp DateNextRun);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Days to keep Log. Number of days to keep the log entries */
  int getKeepLogDays();

  /** Set Days to keep Log. Number of days to keep the log entries */
  void setKeepLogDays(int KeepLogDays);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  void setSupervisor_ID(int Supervisor_ID);

  I_AD_User getSupervisor() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
