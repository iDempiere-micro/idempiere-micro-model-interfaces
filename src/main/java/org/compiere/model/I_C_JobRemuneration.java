package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_JobRemuneration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_JobRemuneration {

  /** TableName=C_JobRemuneration */
  String Table_Name = "C_JobRemuneration";

  /** AD_Table_ID=793 */
  int Table_ID = 793;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Job_ID */
  String COLUMNNAME_C_Job_ID = "C_Job_ID";
  /** Column name C_JobRemuneration_ID */
  String COLUMNNAME_C_JobRemuneration_ID = "C_JobRemuneration_ID";
  /** Column name C_JobRemuneration_UU */
  String COLUMNNAME_C_JobRemuneration_UU = "C_JobRemuneration_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Remuneration_ID */
  String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Position. Job Position */
  int getC_Job_ID();

  /** Set Position. Job Position */
  void setC_Job_ID(int C_Job_ID);

  I_C_Job getC_Job() throws RuntimeException;

  /** Get Position Remuneration. Remuneration for the Position */
  int getC_JobRemuneration_ID();

  /** Set Position Remuneration. Remuneration for the Position */
  void setC_JobRemuneration_ID(int C_JobRemuneration_ID);

  /** Get C_JobRemuneration_UU */
  String getC_JobRemuneration_UU();

  /** Set C_JobRemuneration_UU */
  void setC_JobRemuneration_UU(String C_JobRemuneration_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Remuneration. Wage or Salary */
  int getC_Remuneration_ID();

  /** Set Remuneration. Wage or Salary */
  void setC_Remuneration_ID(int C_Remuneration_ID);

  I_C_Remuneration getC_Remuneration() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);

  /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

  /** Set Valid to. Valid to including this date (last day) */
  void setValidTo(Timestamp ValidTo);
}
