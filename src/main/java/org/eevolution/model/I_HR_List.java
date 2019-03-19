package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_List
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_List {

    /**
     * TableName=HR_List
     */
    String Table_Name = "HR_List";

    /**
     * AD_Table_ID=53099
     */
    int Table_ID = 53099;

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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_List_ID
     */
    String COLUMNNAME_HR_List_ID = "HR_List_ID";
    /**
     * Column name HR_ListType_ID
     */
    String COLUMNNAME_HR_ListType_ID = "HR_ListType_ID";
    /**
     * Column name HR_List_UU
     */
    String COLUMNNAME_HR_List_UU = "HR_List_UU";
    /**
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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

    org.eevolution.model.I_HR_Employee getPayrollEmployee() throws RuntimeException;

    /**
     * Get Payroll List
     */
    int getPayrollListId();

    /**
     * Set Payroll List
     */
    void setPayrollListId(int HR_List_ID);

    /**
     * Get Payroll List Type
     */
    int getPayrollListTypeId();

    /**
     * Set Payroll List Type
     */
    void setPayrollListTypeId(int HR_ListType_ID);

    org.eevolution.model.I_HR_ListType getPayrollListType() throws RuntimeException;

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    void setIsEmployee(boolean IsEmployee);

    /**
     * Get Employee. Indicates if this Business Partner is an employee
     */
    boolean isEmployee();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
