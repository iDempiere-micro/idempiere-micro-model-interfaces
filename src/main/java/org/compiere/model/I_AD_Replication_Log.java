package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Replication_Log
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Replication_Log {

  /** TableName=AD_Replication_Log */
  String Table_Name = "AD_Replication_Log";

  /** AD_Table_ID=604 */
  int Table_ID = 604;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Replication_Log_ID */
  String COLUMNNAME_AD_Replication_Log_ID = "AD_Replication_Log_ID";
  /** Column name AD_Replication_Log_UU */
  String COLUMNNAME_AD_Replication_Log_UU = "AD_Replication_Log_UU";
  /** Column name AD_Replication_Run_ID */
  String COLUMNNAME_AD_Replication_Run_ID = "AD_Replication_Run_ID";
  /** Column name AD_ReplicationTable_ID */
  String COLUMNNAME_AD_ReplicationTable_ID = "AD_ReplicationTable_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsReplicated */
  String COLUMNNAME_IsReplicated = "IsReplicated";
  /** Column name P_Msg */
  String COLUMNNAME_P_Msg = "P_Msg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Replication Log. Data Replication Log Details */
  int getAD_Replication_Log_ID();

  /** Set Replication Log. Data Replication Log Details */
  void setAD_Replication_Log_ID(int AD_Replication_Log_ID);

  /** Get AD_Replication_Log_UU */
  String getAD_Replication_Log_UU();

  /** Set AD_Replication_Log_UU */
  void setAD_Replication_Log_UU(String AD_Replication_Log_UU);

  /** Get Replication Run. Data Replication Run */
  int getAD_Replication_Run_ID();

  /** Set Replication Run. Data Replication Run */
  void setAD_Replication_Run_ID(int AD_Replication_Run_ID);

  I_AD_Replication_Run getAD_Replication_Run() throws RuntimeException;

  /** Get Replication Table. Data Replication Strategy Table Info */
  int getAD_ReplicationTable_ID();

  /** Set Replication Table. Data Replication Strategy Table Info */
  void setAD_ReplicationTable_ID(int AD_ReplicationTable_ID);

  I_AD_ReplicationTable getAD_ReplicationTable() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Replicated. The data is successfully replicated */
  void setIsReplicated(boolean IsReplicated);

  /** Get Replicated. The data is successfully replicated */
  boolean isReplicated();

  /** Get Process Message */
  String getP_Msg();

  /** Set Process Message */
  void setP_Msg(String P_Msg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
