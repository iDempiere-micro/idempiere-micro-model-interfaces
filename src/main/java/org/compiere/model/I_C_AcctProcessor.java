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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Schedule */
  int getAD_Schedule_ID();

  /** Set Schedule */
  void setAD_Schedule_ID(int AD_Schedule_ID);

  I_AD_Schedule getAD_Schedule() throws RuntimeException;

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Accounting Processor. Accounting Processor/Server Parameters */
  int getC_AcctProcessor_ID();

  /** Set Accounting Processor. Accounting Processor/Server Parameters */
  void setC_AcctProcessor_ID(int C_AcctProcessor_ID);

  /** Get C_AcctProcessor_UU */
  String getC_AcctProcessor_UU();

  /** Set C_AcctProcessor_UU */
  void setC_AcctProcessor_UU(String C_AcctProcessor_UU);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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
