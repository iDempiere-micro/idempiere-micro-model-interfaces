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
@SuppressWarnings("all")
public interface I_HR_Year {

    /**
     * TableName=HR_Year
     */
    public static final String Table_Name = "HR_Year";

    /**
     * AD_Table_ID=53095
     */
    public static final int Table_ID = 53095;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Year_ID
     */
    public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name HR_Year_ID
     */
    public static final String COLUMNNAME_HR_Year_ID = "HR_Year_ID";
    /**
     * Column name HR_Year_UU
     */
    public static final String COLUMNNAME_HR_Year_UU = "HR_Year_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name NetDays
     */
    public static final String COLUMNNAME_NetDays = "NetDays";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name StartDate
     */
    public static final String COLUMNNAME_StartDate = "StartDate";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Year. Calendar Year
     */
    public int getYearId();

    /**
     * Set Year. Calendar Year
     */
    public void setYearId(int C_Year_ID);

    public org.compiere.model.I_C_Year getYear() throws RuntimeException;

    /**
     * Get Payroll
     */
    public int getHR_PayrollId();

    /**
     * Set Payroll
     */
    public void setHR_PayrollId(int HR_Payroll_ID);

    public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

    /**
     * Get Payroll Year
     */
    public int getHR_YearId();

    /**
     * Set Payroll Year
     */
    public void setHR_YearId(int HR_Year_ID);

    /**
     * Get HR_Year_UU
     */
    public String getHR_Year_UU();

    /**
     * Set HR_Year_UU
     */
    public void setHR_Year_UU(String HR_Year_UU);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Net Days. Net Days in which payment is due
     */
    public int getNetDays();

    /**
     * Set Net Days. Net Days in which payment is due
     */
    public void setNetDays(int NetDays);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Quantity. Quantity
     */
    public int getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(int Qty);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    public Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    public void setStartDate(Timestamp StartDate);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
