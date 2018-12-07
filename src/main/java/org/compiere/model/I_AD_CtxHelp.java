package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_CtxHelp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_CtxHelp {

  /** TableName=AD_CtxHelp */
  String Table_Name = "AD_CtxHelp";

  /** AD_Table_ID=200063 */
  int Table_ID = 200063;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_CtxHelp_UU */
  String COLUMNNAME_AD_CtxHelp_UU = "AD_CtxHelp_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CtxType */
  String COLUMNNAME_CtxType = "CtxType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Context Help */
  int getAD_CtxHelp_ID();

  /** Set Context Help */
  void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  /** Get AD_CtxHelp_UU */
  String getAD_CtxHelp_UU();

  /** Set AD_CtxHelp_UU */
  void setAD_CtxHelp_UU(String AD_CtxHelp_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Context Type. Type of Context Help */
  String getCtxType();

  /** Set Context Type. Type of Context Help */
  void setCtxType(String CtxType);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

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
}
