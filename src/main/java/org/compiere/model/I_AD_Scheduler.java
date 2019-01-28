package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Scheduler
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Scheduler {

  /** TableName=AD_Scheduler */
  String Table_Name = "AD_Scheduler";

  /** AD_Table_ID=688 */
  int Table_ID = 688;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Schedule_ID */
  String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
  /** Column name AD_Scheduler_ID */
  String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
  /** Column name AD_Scheduler_UU */
  String COLUMNNAME_AD_Scheduler_UU = "AD_Scheduler_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /** Column name DateLastRun */
  String COLUMNNAME_DateLastRun = "DateLastRun";
  /** Column name DateNextRun */
  String COLUMNNAME_DateNextRun = "DateNextRun";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name KeepLogDays */
  String COLUMNNAME_KeepLogDays = "KeepLogDays";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name R_MailText_ID */
  String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

    /** Get Process. Process or Report */
  int getAD_Process_ID();

    /** Get Schedule */
  int getAD_Schedule_ID();

    /** Get Scheduler. Schedule Processes */
  int getAD_Scheduler_ID();

    /** Get Table. Database Table information */
  int getAD_Table_ID();

    /** Get Date next run. Date the process will run next */
  Timestamp getDateNextRun();

  /** Set Date next run. Date the process will run next */
  void setDateNextRun(Timestamp DateNextRun);

  /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Days to keep Log. Number of days to keep the log entries */
  int getKeepLogDays();

  /** Set Days to keep Log. Number of days to keep the log entries */
  void setKeepLogDays(int KeepLogDays);

    /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Mail Template. Text templates for mailings */
  int getR_MailText_ID();

    /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

}
