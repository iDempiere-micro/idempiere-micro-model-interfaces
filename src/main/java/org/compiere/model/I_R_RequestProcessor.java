package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessor {

  /** TableName=R_RequestProcessor */
  String Table_Name = "R_RequestProcessor";

  /** AD_Table_ID=420 */
  int Table_ID = 420;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

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
  /** Column name InactivityAlertDays */
  String COLUMNNAME_InactivityAlertDays = "InactivityAlertDays";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name KeepLogDays */
  String COLUMNNAME_KeepLogDays = "KeepLogDays";
  /** Column name OverdueAlertDays */
  String COLUMNNAME_OverdueAlertDays = "OverdueAlertDays";
  /** Column name OverdueAssignDays */
  String COLUMNNAME_OverdueAssignDays = "OverdueAssignDays";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name RemindDays */
  String COLUMNNAME_RemindDays = "RemindDays";
  /** Column name R_RequestProcessor_ID */
  String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
  /** Column name R_RequestProcessor_UU */
  String COLUMNNAME_R_RequestProcessor_UU = "R_RequestProcessor_UU";
  /** Column name R_RequestType_ID */
  String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

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

  /** Get Inactivity Alert Days. Send Alert when there is no activity after days (0= no alert) */
  int getInactivityAlertDays();

  /** Set Inactivity Alert Days. Send Alert when there is no activity after days (0= no alert) */
  void setInactivityAlertDays(int InactivityAlertDays);

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

  /** Get Alert after Days Due. Send email alert after number of days due (0=no alerts) */
  int getOverdueAlertDays();

  /** Set Alert after Days Due. Send email alert after number of days due (0=no alerts) */
  void setOverdueAlertDays(int OverdueAlertDays);

  /** Get Escalate after Days Due. Escalation to superior after number of due days (0 = no) */
  int getOverdueAssignDays();

  /** Set Escalate after Days Due. Escalation to superior after number of due days (0 = no) */
  void setOverdueAssignDays(int OverdueAssignDays);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Reminder Days. Days between sending Reminder Emails for a due or inactive Document */
  int getRemindDays();

  /** Set Reminder Days. Days between sending Reminder Emails for a due or inactive Document */
  void setRemindDays(int RemindDays);

  /** Get Request Processor. Processor for Requests */
  int getR_RequestProcessor_ID();

  /** Set Request Processor. Processor for Requests */
  void setR_RequestProcessor_ID(int R_RequestProcessor_ID);

  /** Get R_RequestProcessor_UU */
  String getR_RequestProcessor_UU();

  /** Set R_RequestProcessor_UU */
  void setR_RequestProcessor_UU(String R_RequestProcessor_UU);

  /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

  /** Set Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  void setR_RequestType_ID(int R_RequestType_ID);

  I_R_RequestType getR_RequestType() throws RuntimeException;

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
