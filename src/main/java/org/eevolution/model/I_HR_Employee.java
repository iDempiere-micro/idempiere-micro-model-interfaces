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

public interface I_HR_Employee {

    /**
     * TableName=HR_Employee
     */
    String Table_Name = "HR_Employee";

    /**
     * AD_Table_ID=53086
     */
    int Table_ID = 53086;

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
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Code
     */
    String COLUMNNAME_Code = "Code";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_Employee_UU
     */
    String COLUMNNAME_HR_Employee_UU = "HR_Employee_UU";
    /**
     * Column name HR_Job_ID
     */
    String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name NationalCode
     */
    String COLUMNNAME_NationalCode = "NationalCode";
    /**
     * Column name SSCode
     */
    String COLUMNNAME_SSCode = "SSCode";
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
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    org.compiere.model.I_C_BPartner getBPartner() throws RuntimeException;

    /**
     * Get Validation code. Validation Code
     */
    String getCode();

    /**
     * Set Validation code. Validation Code
     */
    void setCode(String Code);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

    /**
     * Get Payroll Department
     */
    int getPayrollDepartmentId();

    /**
     * Set Payroll Department
     */
    void setPayrollDepartmentId(int HR_Department_ID);

    org.eevolution.model.I_HR_Department getPayrollDepartment() throws RuntimeException;

    /**
     * Get Payroll Employee
     */
    int getPayrollEmployeeId();

    /**
     * Set Payroll Employee
     */
    void setPayrollEmployeeId(int HR_Employee_ID);

    /**
     * Get Payroll Job
     */
    int getPayrollJobId();

    /**
     * Set Payroll Job
     */
    void setPayrollJobId(int HR_Job_ID);

    org.eevolution.model.I_HR_Job getPayrollJob() throws RuntimeException;

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
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

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
     * Get Name 2. Additional Name
     */
    String getName2();

    /**
     * Set Name 2. Additional Name
     */
    void setName2(String Name2);

    /**
     * Get National Code
     */
    String getNationalCode();

    /**
     * Set National Code
     */
    void setNationalCode(String NationalCode);

    /**
     * Get Social Security Code
     */
    String getSSCode();

    /**
     * Set Social Security Code
     */
    void setSSCode(String SSCode);

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
