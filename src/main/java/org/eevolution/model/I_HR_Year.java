package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Year
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Year {

    /**
     * TableName=HR_Year
     */
    String Table_Name = "HR_Year";

    /**
     * AD_Table_ID=53095
     */
    int Table_ID = 53095;

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
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name HR_Year_ID
     */
    String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
    /**
     * Column name HR_Year_UU
     */
    String COLUMNNAME_HR_Year_UU = "HR_Year_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name NetDays
     */
    String COLUMNNAME_NetDays = "NetDays";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
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
     * Get Payroll
     */
    int getPayrollPayrollId();

    /**
     * Set Payroll
     */
    void setPayrollPayrollId(int HR_Payroll_ID);

    org.eevolution.model.I_HR_Payroll getPayrollPayroll() throws RuntimeException;

    /**
     * Get Payroll Year
     */
    int getPayrollYearId();

    /**
     * Set Payroll Year
     */
    void setPayrollYearId(int HR_Year_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Net Days. Net Days in which payment is due
     */
    int getNetDays();

    /**
     * Set Net Days. Net Days in which payment is due
     */
    void setNetDays(int NetDays);

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
     * Get Quantity. Quantity
     */
    int getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(int Qty);

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
