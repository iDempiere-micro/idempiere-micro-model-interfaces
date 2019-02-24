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
@SuppressWarnings("all")
public interface I_HR_List {

    /**
     * TableName=HR_List
     */
    public static final String Table_Name = "HR_List";

    /**
     * AD_Table_ID=53099
     */
    public static final int Table_ID = 53099;

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
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_List_ID
     */
    public static final String COLUMNNAME_HR_List_ID = "HR_List_ID";
    /**
     * Column name HR_ListType_ID
     */
    public static final String COLUMNNAME_HR_ListType_ID = "HR_ListType_ID";
    /**
     * Column name HR_List_UU
     */
    public static final String COLUMNNAME_HR_List_UU = "HR_List_UU";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsEmployee
     */
    public static final String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

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

    public org.eevolution.model.I_HR_Employee getHR_Employee() throws RuntimeException;

    /**
     * Get Payroll List
     */
    public int getHR_List_ID();

    /**
     * Set Payroll List
     */
    public void setHR_List_ID(int HR_List_ID);

    /**
     * Get Payroll List Type
     */
    public int getHR_ListType_ID();

    /**
     * Set Payroll List Type
     */
    public void setHR_ListType_ID(int HR_ListType_ID);

    public org.eevolution.model.I_HR_ListType getHR_ListType() throws RuntimeException;

    /**
     * Get HR_List_UU
     */
    public String getHR_List_UU();

    /**
     * Set HR_List_UU
     */
    public void setHR_List_UU(String HR_List_UU);

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
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    public void setIsEmployee(boolean IsEmployee);

    /**
     * Get Employee. Indicates if this Business Partner is an employee
     */
    public boolean isEmployee();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);
}
