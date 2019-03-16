package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Employee
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Employee {

    /**
     * TableName=HR_Employee
     */
    public static final String Table_Name = "HR_Employee";

    /**
     * AD_Table_ID=53086
     */
    public static final int Table_ID = 53086;

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
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Code
     */
    public static final String COLUMNNAME_Code = "Code";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EndDate
     */
    public static final String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_Employee_UU
     */
    public static final String COLUMNNAME_HR_Employee_UU = "HR_Employee_UU";
    /**
     * Column name HR_Job_ID
     */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name ImageURL
     */
    public static final String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name NationalCode
     */
    public static final String COLUMNNAME_NationalCode = "NationalCode";
    /**
     * Column name SSCode
     */
    public static final String COLUMNNAME_SSCode = "SSCode";
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
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setBusinessPartnerId(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Validation code. Validation Code
     */
    public String getCode();

    /**
     * Set Validation code. Validation Code
     */
    public void setCode(String Code);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get End Date. Last effective date (inclusive)
     */
    public Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    public void setEndDate(Timestamp EndDate);

    /**
     * Get Payroll Department
     */
    public int getHR_Department_ID();

    /**
     * Set Payroll Department
     */
    public void setHR_Department_ID(int HR_Department_ID);

    public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /**
     * Get Payroll Employee
     */
    public int getHR_Employee_ID();

    /**
     * Set Payroll Employee
     */
    public void setHR_Employee_ID(int HR_Employee_ID);

    /**
     * Get HR_Employee_UU
     */
    public String getHR_Employee_UU();

    /**
     * Set HR_Employee_UU
     */
    public void setHR_Employee_UU(String HR_Employee_UU);

    /**
     * Get Payroll Job
     */
    public int getHR_Job_ID();

    /**
     * Set Payroll Job
     */
    public void setHR_Job_ID(int HR_Job_ID);

    public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

    /**
     * Get Payroll
     */
    public int getHR_Payroll_ID();

    /**
     * Set Payroll
     */
    public void setHR_Payroll_ID(int HR_Payroll_ID);

    public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

    /**
     * Get Image URL. URL of image
     */
    public String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    public void setImageURL(String ImageURL);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Name 2. Additional Name
     */
    public String getName2();

    /**
     * Set Name 2. Additional Name
     */
    public void setName2(String Name2);

    /**
     * Get National Code
     */
    public String getNationalCode();

    /**
     * Set National Code
     */
    public void setNationalCode(String NationalCode);

    /**
     * Get Social Security Code
     */
    public String getSSCode();

    /**
     * Set Social Security Code
     */
    public void setSSCode(String SSCode);

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
