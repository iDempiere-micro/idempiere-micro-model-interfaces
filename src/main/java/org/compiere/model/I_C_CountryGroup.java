package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CountryGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CountryGroup {

  /** TableName=C_CountryGroup */
  String Table_Name = "C_CountryGroup";

  /** AD_Table_ID=200146 */
  int Table_ID = 200146;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_CountryGroup_ID */
  String COLUMNNAME_C_CountryGroup_ID = "C_CountryGroup_ID";
  /** Column name C_CountryGroup_UU */
  String COLUMNNAME_C_CountryGroup_UU = "C_CountryGroup_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
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

  /** Get Country Group */
  int getC_CountryGroup_ID();

  /** Set Country Group */
  void setC_CountryGroup_ID(int C_CountryGroup_ID);

  /** Get C_CountryGroup_UU */
  String getC_CountryGroup_UU();

  /** Set C_CountryGroup_UU */
  void setC_CountryGroup_UU(String C_CountryGroup_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date From. Starting date for a range */
  Timestamp getDateFrom();

  /** Set Date From. Starting date for a range */
  void setDateFrom(Timestamp DateFrom);

  /** Get Date To. End date of a date range */
  Timestamp getDateTo();

  /** Set Date To. End date of a date range */
  void setDateTo(Timestamp DateTo);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

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
