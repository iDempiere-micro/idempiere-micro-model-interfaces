package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CyclePhase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CyclePhase {

  /** TableName=C_CyclePhase */
  String Table_Name = "C_CyclePhase";

  /** AD_Table_ID=433 */
  int Table_ID = 433;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_CyclePhase_UU */
  String COLUMNNAME_C_CyclePhase_UU = "C_CyclePhase_UU";
  /** Column name C_CycleStep_ID */
  String COLUMNNAME_C_CycleStep_ID = "C_CycleStep_ID";
  /** Column name C_Phase_ID */
  String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get C_CyclePhase_UU */
  String getC_CyclePhase_UU();

  /** Set C_CyclePhase_UU */
  void setC_CyclePhase_UU(String C_CyclePhase_UU);

  /** Get Cycle Step. The step for this Cycle */
  int getC_CycleStep_ID();

  /** Set Cycle Step. The step for this Cycle */
  void setC_CycleStep_ID(int C_CycleStep_ID);

  I_C_CycleStep getC_CycleStep() throws RuntimeException;

  /** Get Standard Phase. Standard Phase of the Project Type */
  int getC_Phase_ID();

  /** Set Standard Phase. Standard Phase of the Project Type */
  void setC_Phase_ID(int C_Phase_ID);

  I_C_Phase getC_Phase() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
