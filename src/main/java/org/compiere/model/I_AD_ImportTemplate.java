package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ImportTemplate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ImportTemplate {

  /** TableName=AD_ImportTemplate */
  String Table_Name = "AD_ImportTemplate";

  /** AD_Table_ID=200153 */
  int Table_ID = 200153;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_ImportTemplate_ID */
  String COLUMNNAME_AD_ImportTemplate_ID = "AD_ImportTemplate_ID";
  /** Column name AD_ImportTemplate_UU */
  String COLUMNNAME_AD_ImportTemplate_UU = "AD_ImportTemplate_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name CharacterSet */
  String COLUMNNAME_CharacterSet = "CharacterSet";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CSVAliasHeader */
  String COLUMNNAME_CSVAliasHeader = "CSVAliasHeader";
  /** Column name CSVHeader */
  String COLUMNNAME_CSVHeader = "CSVHeader";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Import Template */
  int getAD_ImportTemplate_ID();

  /** Set Import Template */
  void setAD_ImportTemplate_ID(int AD_ImportTemplate_ID);

  /** Get AD_ImportTemplate_UU */
  String getAD_ImportTemplate_UU();

  /** Set AD_ImportTemplate_UU */
  void setAD_ImportTemplate_UU(String AD_ImportTemplate_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Character Set */
  String getCharacterSet();

  /** Set Character Set */
  void setCharacterSet(String CharacterSet);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get CSV Alias Header */
  String getCSVAliasHeader();

  /** Set CSV Alias Header */
  void setCSVAliasHeader(String CSVAliasHeader);

  /** Get CSV Header */
  String getCSVHeader();

  /** Set CSV Header */
  void setCSVHeader(String CSVHeader);

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
