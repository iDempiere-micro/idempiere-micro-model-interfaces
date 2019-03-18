package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Period
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Period {

    /**
     * TableName=HR_Period
     */
    String Table_Name = "HR_Period";

    /**
     * AD_Table_ID=53094
     */
    int Table_ID = 53094;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Year_ID
     */
    String COLUMNNAME_C_Year_ID = "C_Year_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name HR_Period_ID
     */
    String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
    /**
     * Column name HR_Period_UU
     */
    String COLUMNNAME_HR_Period_UU = "HR_Period_UU";
    /**
     * Column name HR_Year_ID
     */
    String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PeriodAction
     */
    String COLUMNNAME_PeriodAction = "PeriodAction";
    /**
     * Column name PeriodNo
     */
    String COLUMNNAME_PeriodNo = "PeriodNo";
    /**
     * Column name PeriodStatus
     */
    String COLUMNNAME_PeriodStatus = "PeriodStatus";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Period. Period of the Calendar
     */
    int getPeriodId();

    /**
     * Set Period. Period of the Calendar
     */
    void setPeriodId(int C_Period_ID);

    org.compiere.model.I_C_Period getPeriod() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Year. Calendar Year
     */
    int getYearId();

    /**
     * Set Year. Calendar Year
     */
    void setYearId(int C_Year_ID);

    org.compiere.model.I_C_Year getYear() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

    /**
     * Get Payroll
     */
    int getPayrollPayrollId();

    /**
     * Set Payroll
     */
    void setPayrollPayrollId(int HR_Payroll_ID);

    org.eevolution.model.I_HR_Payroll getPayrollPayroll() throws RuntimeException;

    /**
     * Get Payroll Period
     */
    int getPayrollPeriodId();

    /**
     * Set Payroll Period
     */
    void setPayrollPeriodId(int HR_Period_ID);

    /**
     * Get Payroll Year
     */
    int getPayrollYearId();

    /**
     * Set Payroll Year
     */
    void setPayrollYearId(int HR_Year_ID);

    org.eevolution.model.I_HR_Year getPayrollYear() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Period Action. Action taken for this period
     */
    String getPeriodAction();

    /**
     * Set Period Action. Action taken for this period
     */
    void setPeriodAction(String PeriodAction);

    /**
     * Get Period No. Unique Period Number
     */
    int getPeriodNo();

    /**
     * Set Period No. Unique Period Number
     */
    void setPeriodNo(int PeriodNo);

    /**
     * Get Period Status. Current state of this period
     */
    String getPeriodStatus();

    /**
     * Set Period Status. Current state of this period
     */
    void setPeriodStatus(String PeriodStatus);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
