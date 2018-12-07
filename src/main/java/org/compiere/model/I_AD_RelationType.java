package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_RelationType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_RelationType {

  /** TableName=AD_RelationType */
  String Table_Name = "AD_RelationType";

  /** AD_Table_ID=53246 */
  int Table_ID = 53246;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Reference_Source_ID */
  String COLUMNNAME_AD_Reference_Source_ID = "AD_Reference_Source_ID";
  /** Column name AD_Reference_Target_ID */
  String COLUMNNAME_AD_Reference_Target_ID = "AD_Reference_Target_ID";
  /** Column name AD_RelationType_ID */
  String COLUMNNAME_AD_RelationType_ID = "AD_RelationType_ID";
  /** Column name AD_RelationType_UU */
  String COLUMNNAME_AD_RelationType_UU = "AD_RelationType_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDirected */
  String COLUMNNAME_IsDirected = "IsDirected";
  /** Column name Role_Source */
  String COLUMNNAME_Role_Source = "Role_Source";
  /** Column name Role_Target */
  String COLUMNNAME_Role_Target = "Role_Target";
  /** Column name Type */
  String COLUMNNAME_Type = "Type";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Source Reference */
  int getAD_Reference_Source_ID();

  /** Set Source Reference */
  void setAD_Reference_Source_ID(int AD_Reference_Source_ID);

  I_AD_Reference getAD_Reference_Source() throws RuntimeException;

  /** Get Target Reference */
  int getAD_Reference_Target_ID();

  /** Set Target Reference */
  void setAD_Reference_Target_ID(int AD_Reference_Target_ID);

  I_AD_Reference getAD_Reference_Target() throws RuntimeException;

  /** Get Relation Type */
  int getAD_RelationType_ID();

  /** Set Relation Type */
  void setAD_RelationType_ID(int AD_RelationType_ID);

  /** Get AD_RelationType_UU */
  String getAD_RelationType_UU();

  /** Set AD_RelationType_UU */
  void setAD_RelationType_UU(String AD_RelationType_UU);

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

  /**
   * Set Directed. Tells whether one "sees" the other end of the relation from each end or just from
   * the source
   */
  void setIsDirected(boolean IsDirected);

  /**
   * Get Directed. Tells whether one "sees" the other end of the relation from each end or just from
   * the source
   */
  boolean isDirected();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /**
   * Get Source Role. If set, this role will be used as label for the zoom destination instead of
   * the destinations's window name
   */
  String getRole_Source();

  /**
   * Set Source Role. If set, this role will be used as label for the zoom destination instead of
   * the destinations's window name
   */
  void setRole_Source(String Role_Source);

  /**
   * Get Target Role. If set, this role will be used as label for the zoom destination instead of
   * the destinations's window name
   */
  String getRole_Target();

  /**
   * Set Target Role. If set, this role will be used as label for the zoom destination instead of
   * the destinations's window name
   */
  void setRole_Target(String Role_Target);

  /** Get Type. Type of Validation (SQL, Java Script, Java Language) */
  String getType();

  /** Set Type. Type of Validation (SQL, Java Script, Java Language) */
  void setType(String Type);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
