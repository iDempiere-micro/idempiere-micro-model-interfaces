package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for IMP_Processor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_IMP_Processor {

  /** TableName=IMP_Processor */
  String Table_Name = "IMP_Processor";

  /** AD_Table_ID=53077 */
  int Table_ID = 53077;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name Account */
  String COLUMNNAME_Account = "Account";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
  /** Column name Frequency */
  String COLUMNNAME_Frequency = "Frequency";
  /** Column name FrequencyType */
  String COLUMNNAME_FrequencyType = "FrequencyType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name Host */
  String COLUMNNAME_Host = "Host";
  /** Column name IMP_Processor_ID */
  String COLUMNNAME_IMP_Processor_ID = "IMP_Processor_ID";
  /** Column name IMP_Processor_Type_ID */
  String COLUMNNAME_IMP_Processor_Type_ID = "IMP_Processor_Type_ID";
  /** Column name IMP_Processor_UU */
  String COLUMNNAME_IMP_Processor_UU = "IMP_Processor_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name KeepLogDays */
  String COLUMNNAME_KeepLogDays = "KeepLogDays";
  /** Column name PasswordInfo */
  String COLUMNNAME_PasswordInfo = "PasswordInfo";
  /** Column name Port */
  String COLUMNNAME_Port = "Port";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Get Account */
  String getAccount();

  /** Set Account */
  void setAccount(String Account);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

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

  /** Get Frequency. Frequency of events */
  int getFrequency();

  /** Set Frequency. Frequency of events */
  void setFrequency(int Frequency);

  /** Get Frequency Type. Frequency of event */
  String getFrequencyType();

  /** Set Frequency Type. Frequency of event */
  void setFrequencyType(String FrequencyType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Host */
  String getHost();

  /** Set Host */
  void setHost(String Host);

  /** Get Import Processor */
  int getIMP_Processor_ID();

  /** Set Import Processor */
  void setIMP_Processor_ID(int IMP_Processor_ID);

  /** Get Import Processor Type */
  int getIMP_Processor_Type_ID();

  /** Set Import Processor Type */
  void setIMP_Processor_Type_ID(int IMP_Processor_Type_ID);

  I_IMP_Processor_Type getIMP_Processor_Type() throws RuntimeException;

  /** Get IMP_Processor_UU */
  String getIMP_Processor_UU();

  /** Set IMP_Processor_UU */
  void setIMP_Processor_UU(String IMP_Processor_UU);

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

  /** Get Password Info */
  String getPasswordInfo();

  /** Set Password Info */
  void setPasswordInfo(String PasswordInfo);

  /** Get Port */
  int getPort();

  /** Set Port */
  void setPort(int Port);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
