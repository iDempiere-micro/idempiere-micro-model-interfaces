package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PeriodControl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PeriodControl {

  /** TableName=C_PeriodControl */
  String Table_Name = "C_PeriodControl";

  /** AD_Table_ID=229 */
  int Table_ID = 229;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_PeriodControl_ID */
  String COLUMNNAME_C_PeriodControl_ID = "C_PeriodControl_ID";
  /** Column name C_PeriodControl_UU */
  String COLUMNNAME_C_PeriodControl_UU = "C_PeriodControl_UU";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DocBaseType */
  String COLUMNNAME_DocBaseType = "DocBaseType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PeriodAction */
  String COLUMNNAME_PeriodAction = "PeriodAction";
  /** Column name PeriodStatus */
  String COLUMNNAME_PeriodStatus = "PeriodStatus";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Period Control */
  int getC_PeriodControl_ID();

  /** Set Period Control */
  void setC_PeriodControl_ID(int C_PeriodControl_ID);

  /** Get C_PeriodControl_UU */
  String getC_PeriodControl_UU();

  /** Set C_PeriodControl_UU */
  void setC_PeriodControl_UU(String C_PeriodControl_UU);

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Document BaseType. Logical type of document */
  String getDocBaseType();

  /** Set Document BaseType. Logical type of document */
  void setDocBaseType(String DocBaseType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Period Action. Action taken for this period */
  String getPeriodAction();

  /** Set Period Action. Action taken for this period */
  void setPeriodAction(String PeriodAction);

  /** Get Period Status. Current state of this period */
  String getPeriodStatus();

  /** Set Period Status. Current state of this period */
  void setPeriodStatus(String PeriodStatus);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
