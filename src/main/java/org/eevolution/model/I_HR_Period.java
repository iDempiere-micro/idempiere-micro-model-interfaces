package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for HR_Period
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Period {

  /** TableName=HR_Period */
  public static final String Table_Name = "HR_Period";

  /** AD_Table_ID=53094 */
  public static final int Table_ID = 53094;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Period_ID */
  public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Year_ID */
  public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
  /** Column name DateAcct */
  public static final String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name EndDate */
  public static final String COLUMNNAME_EndDate = "EndDate";
  /** Column name HR_Payroll_ID */
  public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
  /** Column name HR_Period_ID */
  public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
  /** Column name HR_Period_UU */
  public static final String COLUMNNAME_HR_Period_UU = "HR_Period_UU";
  /** Column name HR_Year_ID */
  public static final String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
  /** Column name PeriodAction */
  public static final String COLUMNNAME_PeriodAction = "PeriodAction";
  /** Column name PeriodNo */
  public static final String COLUMNNAME_PeriodNo = "PeriodNo";
  /** Column name PeriodStatus */
  public static final String COLUMNNAME_PeriodStatus = "PeriodStatus";
  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";
  /** Column name StartDate */
  public static final String COLUMNNAME_StartDate = "StartDate";
  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Get Period. Period of the Calendar */
  public int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  public void setC_Period_ID(int C_Period_ID);

  public org.compiere.model.I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Get Year. Calendar Year */
  public int getC_Year_ID();

  /** Set Year. Calendar Year */
  public void setC_Year_ID(int C_Year_ID);

  public org.compiere.model.I_C_Year getC_Year() throws RuntimeException;

  /** Get Account Date. Accounting Date */
  public Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  public void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get End Date. Last effective date (inclusive) */
  public Timestamp getEndDate();

  /** Set End Date. Last effective date (inclusive) */
  public void setEndDate(Timestamp EndDate);

  /** Get Payroll */
  public int getHR_Payroll_ID();

  /** Set Payroll */
  public void setHR_Payroll_ID(int HR_Payroll_ID);

  public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

  /** Get Payroll Period */
  public int getHR_Period_ID();

  /** Set Payroll Period */
  public void setHR_Period_ID(int HR_Period_ID);

  /** Get HR_Period_UU */
  public String getHR_Period_UU();

  /** Set HR_Period_UU */
  public void setHR_Period_UU(String HR_Period_UU);

  /** Get Payroll Year */
  public int getHR_Year_ID();

  /** Set Payroll Year */
  public void setHR_Year_ID(int HR_Year_ID);

  public org.eevolution.model.I_HR_Year getHR_Year() throws RuntimeException;

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Period Action. Action taken for this period */
  public String getPeriodAction();

  /** Set Period Action. Action taken for this period */
  public void setPeriodAction(String PeriodAction);

  /** Get Period No. Unique Period Number */
  public int getPeriodNo();

  /** Set Period No. Unique Period Number */
  public void setPeriodNo(int PeriodNo);

  /** Get Period Status. Current state of this period */
  public String getPeriodStatus();

  /** Set Period Status. Current state of this period */
  public void setPeriodStatus(String PeriodStatus);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Process Now */
  public boolean isProcessing();

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Start Date. First effective day (inclusive) */
  public Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  public void setStartDate(Timestamp StartDate);

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}