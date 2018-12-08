package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Job
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Job {

  /** TableName=C_Job */
  String Table_Name = "C_Job";

  /** AD_Table_ID=789 */
  int Table_ID = 789;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_JobCategory_ID */
  String COLUMNNAME_C_JobCategory_ID = "C_JobCategory_ID";
  /** Column name C_Job_ID */
  String COLUMNNAME_C_Job_ID = "C_Job_ID";
  /** Column name C_Job_UU */
  String COLUMNNAME_C_Job_UU = "C_Job_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsEmployee */
  String COLUMNNAME_IsEmployee = "IsEmployee";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Position Category. Job Position Category */
  int getC_JobCategory_ID();

  /** Set Position Category. Job Position Category */
  void setC_JobCategory_ID(int C_JobCategory_ID);

  I_C_JobCategory getC_JobCategory() throws RuntimeException;

  /** Get Position. Job Position */
  int getC_Job_ID();

  /** Set Position. Job Position */
  void setC_Job_ID(int C_Job_ID);

  /** Get C_Job_UU */
  String getC_Job_UU();

  /** Set C_Job_UU */
  void setC_Job_UU(String C_Job_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Set Employee. Indicates if this Business Partner is an employee */
  void setIsEmployee(boolean IsEmployee);

  /** Get Employee. Indicates if this Business Partner is an employee */
  boolean isEmployee();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
