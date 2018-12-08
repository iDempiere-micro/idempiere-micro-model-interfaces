package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Scheduler_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Scheduler_Para {

  /** TableName=AD_Scheduler_Para */
  String Table_Name = "AD_Scheduler_Para";

  /** AD_Table_ID=698 */
  int Table_ID = 698;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_Para_ID */
  String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
  /** Column name AD_Scheduler_ID */
  String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
  /** Column name AD_Scheduler_Para_UU */
  String COLUMNNAME_AD_Scheduler_Para_UU = "AD_Scheduler_Para_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ParameterDefault */
  String COLUMNNAME_ParameterDefault = "ParameterDefault";
  /** Column name ParameterToDefault */
  String COLUMNNAME_ParameterToDefault = "ParameterToDefault";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Parameter */
  int getAD_Process_Para_ID();

  /** Set Process Parameter */
  void setAD_Process_Para_ID(int AD_Process_Para_ID);

  I_AD_Process_Para getAD_Process_Para() throws RuntimeException;

  /** Get Scheduler. Schedule Processes */
  int getAD_Scheduler_ID();

  /** Set Scheduler. Schedule Processes */
  void setAD_Scheduler_ID(int AD_Scheduler_ID);

  I_AD_Scheduler getAD_Scheduler() throws RuntimeException;

  /** Get AD_Scheduler_Para_UU */
  String getAD_Scheduler_Para_UU();

  /** Set AD_Scheduler_Para_UU */
  void setAD_Scheduler_Para_UU(String AD_Scheduler_Para_UU);

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

  /** Get Default Parameter. Default value of the parameter */
  String getParameterDefault();

  /** Set Default Parameter. Default value of the parameter */
  void setParameterDefault(String ParameterDefault);

  /** Get Default To Parameter. Default value of the to parameter */
  String getParameterToDefault();

  /** Set Default To Parameter. Default value of the to parameter */
  void setParameterToDefault(String ParameterToDefault);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
