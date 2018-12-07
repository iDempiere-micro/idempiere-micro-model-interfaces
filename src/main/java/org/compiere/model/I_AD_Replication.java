package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Replication
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Replication {

  /** TableName=AD_Replication */
  String Table_Name = "AD_Replication";

  /** AD_Table_ID=605 */
  int Table_ID = 605;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Replication_ID */
  String COLUMNNAME_AD_Replication_ID = "AD_Replication_ID";
  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";
  /** Column name AD_Replication_UU */
  String COLUMNNAME_AD_Replication_UU = "AD_Replication_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateLastRun */
  String COLUMNNAME_DateLastRun = "DateLastRun";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name HostAddress */
  String COLUMNNAME_HostAddress = "HostAddress";
  /** Column name HostPort */
  String COLUMNNAME_HostPort = "HostPort";
  /** Column name IDRangeEnd */
  String COLUMNNAME_IDRangeEnd = "IDRangeEnd";
  /** Column name IDRangeStart */
  String COLUMNNAME_IDRangeStart = "IDRangeStart";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsRMIoverHTTP */
  String COLUMNNAME_IsRMIoverHTTP = "IsRMIoverHTTP";
  /** Column name Prefix */
  String COLUMNNAME_Prefix = "Prefix";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Remote_Client_ID */
  String COLUMNNAME_Remote_Client_ID = "Remote_Client_ID";
  /** Column name Remote_Org_ID */
  String COLUMNNAME_Remote_Org_ID = "Remote_Org_ID";
  /** Column name Suffix */
  String COLUMNNAME_Suffix = "Suffix";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Replication. Data Replication Target */
  int getAD_Replication_ID();

  /** Set Replication. Data Replication Target */
  void setAD_Replication_ID(int AD_Replication_ID);

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  I_AD_ReplicationStrategy getADReplicationStrategy() throws RuntimeException;

  /** Get AD_Replication_UU */
  String getAD_Replication_UU();

  /** Set AD_Replication_UU */
  void setAD_Replication_UU(String AD_Replication_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date last run. Date the process was last run. */
  Timestamp getDateLastRun();

  /** Set Date last run. Date the process was last run. */
  void setDateLastRun(Timestamp DateLastRun);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Host Address. Host Address URL or DNS */
  String getHostAddress();

  /** Set Host Address. Host Address URL or DNS */
  void setHostAddress(String HostAddress);

  /** Get Host port. Host Communication Port */
  int getHostPort();

  /** Set Host port. Host Communication Port */
  void setHostPort(int HostPort);

  /** Get ID Range End. End if the ID Range used */
  BigDecimal getIDRangeEnd();

  /** Set ID Range End. End if the ID Range used */
  void setIDRangeEnd(BigDecimal IDRangeEnd);

  /** Get ID Range Start. Start of the ID Range used */
  BigDecimal getIDRangeStart();

  /** Set ID Range Start. Start of the ID Range used */
  void setIDRangeStart(BigDecimal IDRangeStart);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Tunnel via HTTP. Connect to Server via HTTP Tunnel */
  void setIsRMIoverHTTP(boolean IsRMIoverHTTP);

  /** Get Tunnel via HTTP. Connect to Server via HTTP Tunnel */
  boolean isRMIoverHTTP();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Prefix. Prefix before the sequence number */
  String getPrefix();

  /** Set Prefix. Prefix before the sequence number */
  void setPrefix(String Prefix);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Remote Client. Remote Client to be used to replicate / synchronize data with. */
  int getRemote_Client_ID();

  /** Set Remote Client. Remote Client to be used to replicate / synchronize data with. */
  void setRemote_Client_ID(int Remote_Client_ID);

  /**
   * Get Remote Organization. Remote Organization to be used to replicate / synchronize data with.
   */
  int getRemote_Org_ID();

  /**
   * Set Remote Organization. Remote Organization to be used to replicate / synchronize data with.
   */
  void setRemote_Org_ID(int Remote_Org_ID);

  /** Get Suffix. Suffix after the number */
  String getSuffix();

  /** Set Suffix. Suffix after the number */
  void setSuffix(String Suffix);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
