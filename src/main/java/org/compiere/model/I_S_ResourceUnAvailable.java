package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_ResourceUnAvailable
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ResourceUnAvailable {

  /** TableName=S_ResourceUnAvailable */
  String Table_Name = "S_ResourceUnAvailable";

  /** AD_Table_ID=482 */
  int Table_ID = 482;

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
  /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name S_Resource_ID */
  String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
  /** Column name S_ResourceUnAvailable_ID */
  String COLUMNNAME_S_ResourceUnAvailable_ID = "S_ResourceUnAvailable_ID";
  /** Column name S_ResourceUnAvailable_UU */
  String COLUMNNAME_S_ResourceUnAvailable_UU = "S_ResourceUnAvailable_UU";
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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Resource. Resource */
  int getS_Resource_ID();

  /** Set Resource. Resource */
  void setS_Resource_ID(int S_Resource_ID);

  I_S_Resource getS_Resource() throws RuntimeException;

  /** Get Resource Unavailability */
  int getS_ResourceUnAvailable_ID();

  /** Set Resource Unavailability */
  void setS_ResourceUnAvailable_ID(int S_ResourceUnAvailable_ID);

  /** Get S_ResourceUnAvailable_UU */
  String getS_ResourceUnAvailable_UU();

  /** Set S_ResourceUnAvailable_UU */
  void setS_ResourceUnAvailable_UU(String S_ResourceUnAvailable_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
