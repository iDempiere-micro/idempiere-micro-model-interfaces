package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Period
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Period {

  /** TableName=C_Period */
  String Table_Name = "C_Period";

  /** AD_Table_ID=145 */
  int Table_ID = 145;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name C_Period_UU */
  String COLUMNNAME_C_Period_UU = "C_Period_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Year_ID */
  String COLUMNNAME_C_Year_ID = "C_Year_ID";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PeriodNo */
  String COLUMNNAME_PeriodNo = "PeriodNo";
  /** Column name PeriodType */
  String COLUMNNAME_PeriodType = "PeriodType";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name StartDate */
  String COLUMNNAME_StartDate = "StartDate";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  /** Get C_Period_UU */
  String getC_Period_UU();

  /** Set C_Period_UU */
  void setC_Period_UU(String C_Period_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Year. Calendar Year */
  int getC_Year_ID();

  /** Set Year. Calendar Year */
  void setC_Year_ID(int C_Year_ID);

  I_C_Year getC_Year() throws RuntimeException;

  /** Get End Date. Last effective date (inclusive) */
  Timestamp getEndDate();

  /** Set End Date. Last effective date (inclusive) */
  void setEndDate(Timestamp EndDate);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Period No. Unique Period Number */
  int getPeriodNo();

  /** Set Period No. Unique Period Number */
  void setPeriodNo(int PeriodNo);

  /** Get Period Type. Period Type */
  String getPeriodType();

  /** Set Period Type. Period Type */
  void setPeriodType(String PeriodType);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Start Date. First effective day (inclusive) */
  Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  void setStartDate(Timestamp StartDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
