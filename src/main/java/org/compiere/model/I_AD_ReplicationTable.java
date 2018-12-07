package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReplicationTable
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReplicationTable {

  /** TableName=AD_ReplicationTable */
  String Table_Name = "AD_ReplicationTable";

  /** AD_Table_ID=601 */
  int Table_ID = 601;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";
  /** Column name AD_ReplicationTable_ID */
  String COLUMNNAME_AD_ReplicationTable_ID = "AD_ReplicationTable_ID";
  /** Column name AD_ReplicationTable_UU */
  String COLUMNNAME_AD_ReplicationTable_UU = "AD_ReplicationTable_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ReplicationType */
  String COLUMNNAME_ReplicationType = "ReplicationType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  I_AD_ReplicationStrategy getADReplicationStrategy() throws RuntimeException;

  /** Get Replication Table. Data Replication Strategy Table Info */
  int getAD_ReplicationTable_ID();

  /** Set Replication Table. Data Replication Strategy Table Info */
  void setAD_ReplicationTable_ID(int AD_ReplicationTable_ID);

  /** Get AD_ReplicationTable_UU */
  String getAD_ReplicationTable_UU();

  /** Set AD_ReplicationTable_UU */
  void setAD_ReplicationTable_UU(String AD_ReplicationTable_UU);

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

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Replication Type. Type of Data Replication */
  String getReplicationType();

  /** Set Replication Type. Type of Data Replication */
  void setReplicationType(String ReplicationType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
