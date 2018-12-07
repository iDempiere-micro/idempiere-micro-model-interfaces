package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReplicationDocument
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReplicationDocument {

  /** TableName=AD_ReplicationDocument */
  String Table_Name = "AD_ReplicationDocument";

  /** AD_Table_ID=53071 */
  int Table_ID = 53071;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_ReplicationDocument_ID */
  String COLUMNNAME_AD_ReplicationDocument_ID = "AD_ReplicationDocument_ID";
  /** Column name AD_ReplicationDocument_UU */
  String COLUMNNAME_AD_ReplicationDocument_UU = "AD_ReplicationDocument_UU";
  /** Column name AD_ReplicationStrategy_ID */
  String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
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

  /** Get Replication Document */
  int getAD_ReplicationDocument_ID();

  /** Set Replication Document */
  void setAD_ReplicationDocument_ID(int AD_ReplicationDocument_ID);

  /** Get AD_ReplicationDocument_UU */
  String getAD_ReplicationDocument_UU();

  /** Set AD_ReplicationDocument_UU */
  void setAD_ReplicationDocument_UU(String AD_ReplicationDocument_UU);

  /** Get Replication Strategy. Data Replication Strategy */
  int getADReplicationStrategyID();

  /** Set Replication Strategy. Data Replication Strategy */
  void setADReplicationStrategyID(int AD_ReplicationStrategy_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

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
