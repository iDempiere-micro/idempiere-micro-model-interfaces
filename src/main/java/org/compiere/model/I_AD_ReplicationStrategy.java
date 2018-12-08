package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReplicationStrategy
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReplicationStrategy {

  /** TableName=AD_ReplicationStrategy */
  String Table_Name = "AD_ReplicationStrategy";

  /** AD_Table_ID=602 */
  int Table_ID = 602;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";
  /** Column name AD_ReplicationStrategy_UU */
  String COLUMNNAME_AD_ReplicationStrategy_UU = "AD_ReplicationStrategy_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name EXP_Processor_ID */
  String COLUMNNAME_EXP_Processor_ID = "EXP_Processor_ID";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get AD_ReplicationStrategy_UU */
  String getAD_ReplicationStrategy_UU();

  /** Set AD_ReplicationStrategy_UU */
  void setAD_ReplicationStrategy_UU(String AD_ReplicationStrategy_UU);

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

  /** Get Export Processor */
  int getEXP_Processor_ID();

  /** Set Export Processor */
  void setEXP_Processor_ID(int EXP_Processor_ID);

  I_EXP_Processor getEXP_Processor() throws RuntimeException;

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
