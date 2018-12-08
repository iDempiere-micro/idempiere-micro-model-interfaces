package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_SerNoCtl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_SerNoCtl {

  /** TableName=M_SerNoCtl */
  String Table_Name = "M_SerNoCtl";

  /** AD_Table_ID=555 */
  int Table_ID = 555;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IncrementNo */
  String COLUMNNAME_IncrementNo = "IncrementNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_SerNoCtl_ID */
  String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
  /** Column name M_SerNoCtl_UU */
  String COLUMNNAME_M_SerNoCtl_UU = "M_SerNoCtl_UU";
  /** Column name Prefix */
  String COLUMNNAME_Prefix = "Prefix";
  /** Column name StartNo */
  String COLUMNNAME_StartNo = "StartNo";
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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Current Next. The next number to be used */
  int getCurrentNext();

  /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Increment. The number to increment the last document number by */
  int getIncrementNo();

  /** Set Increment. The number to increment the last document number by */
  void setIncrementNo(int IncrementNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Serial No Control. Product Serial Number Control */
  int getM_SerNoCtl_ID();

  /** Set Serial No Control. Product Serial Number Control */
  void setM_SerNoCtl_ID(int M_SerNoCtl_ID);

  /** Get M_SerNoCtl_UU */
  String getM_SerNoCtl_UU();

  /** Set M_SerNoCtl_UU */
  void setM_SerNoCtl_UU(String M_SerNoCtl_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Prefix. Prefix before the sequence number */
  String getPrefix();

  /** Set Prefix. Prefix before the sequence number */
  void setPrefix(String Prefix);

  /** Get Start No. Starting number/position */
  int getStartNo();

  /** Set Start No. Starting number/position */
  void setStartNo(int StartNo);

  /** Get Suffix. Suffix after the number */
  String getSuffix();

  /** Set Suffix. Suffix after the number */
  void setSuffix(String Suffix);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
