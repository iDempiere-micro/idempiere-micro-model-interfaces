package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctProcessor {

  /** TableName=C_AcctProcessor */
  String Table_Name = "C_AcctProcessor";

  /** AD_Table_ID=695 */
  int Table_ID = 695;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name AD_Schedule_ID */
  String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name C_AcctProcessor_ID */
  String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
  /** Column name C_AcctProcessor_UU */
  String COLUMNNAME_C_AcctProcessor_UU = "C_AcctProcessor_UU";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

    /** Get Schedule */
  int getAD_Schedule_ID();

  /** Set Schedule */
  void setAD_Schedule_ID(int AD_Schedule_ID);

    /** Get Table. Database Table information */
  int getAD_Table_ID();

    /** Get Accounting Processor. Accounting Processor/Server Parameters */
  int getC_AcctProcessor_ID();

    /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

    /** Get Date next run. Date the process will run next */
  Timestamp getDateNextRun();

  /** Set Date next run. Date the process will run next */
  void setDateNextRun(Timestamp DateNextRun);

    /** Get Days to keep Log. Number of days to keep the log entries */
  int getKeepLogDays();

  /** Set Days to keep Log. Number of days to keep the log entries */
  void setKeepLogDays(int KeepLogDays);

    /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  void setSupervisor_ID(int Supervisor_ID);

}
