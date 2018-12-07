package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_JobAssignment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_JobAssignment {

  /** TableName=C_JobAssignment */
  String Table_Name = "C_JobAssignment";

  /** AD_Table_ID=791 */
  int Table_ID = 791;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_JobAssignment_ID */
  String COLUMNNAME_C_JobAssignment_ID = "C_JobAssignment_ID";
  /** Column name C_JobAssignment_UU */
  String COLUMNNAME_C_JobAssignment_UU = "C_JobAssignment_UU";
  /** Column name C_Job_ID */
  String COLUMNNAME_C_Job_ID = "C_Job_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
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

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Position Assignment. Assignment of Employee (User) to Job Position */
  int getC_JobAssignment_ID();

  /** Set Position Assignment. Assignment of Employee (User) to Job Position */
  void setC_JobAssignment_ID(int C_JobAssignment_ID);

  /** Get C_JobAssignment_UU */
  String getC_JobAssignment_UU();

  /** Set C_JobAssignment_UU */
  void setC_JobAssignment_UU(String C_JobAssignment_UU);

  /** Get Position. Job Position */
  int getC_Job_ID();

  /** Set Position. Job Position */
  void setC_Job_ID(int C_Job_ID);

  I_C_Job getC_Job() throws RuntimeException;

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
