package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Concept
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Concept {

    /**
     * TableName=HR_Concept
     */
    String Table_Name = "HR_Concept";

    /**
     * AD_Table_ID=53090
     */
    int Table_ID = 53090;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name AccountSign
     */
    String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name ColumnType
     */
    String COLUMNNAME_ColumnType = "ColumnType";
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
     * Column name HR_Concept_Category_ID
     */
    String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
    /**
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Concept_UU
     */
    String COLUMNNAME_HR_Concept_UU = "HR_Concept_UU";
    /**
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Job_ID
     */
    String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name IsPaid
     */
    String COLUMNNAME_IsPaid = "IsPaid";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsReadWrite
     */
    String COLUMNNAME_IsReadWrite = "IsReadWrite";
    /**
     * Column name IsReceipt
     */
    String COLUMNNAME_IsReceipt = "IsReceipt";
    /**
     * Column name IsRegistered
     */
    String COLUMNNAME_IsRegistered = "IsRegistered";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Type
     */
    String COLUMNNAME_Type = "Type";
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
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    String getAccountSign();

    /**
     * Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    void setAccountSign(String AccountSign);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Reference. System Reference and Validation
     */
    int getReferenceId();

    /**
     * Set Reference. System Reference and Validation
     */
    void setReferenceId(int AD_Reference_ID);

    org.compiere.model.I_AD_Reference getReference() throws RuntimeException;

    /**
     * Get Column Type
     */
    String getColumnType();

    /**
     * Set Column Type
     */
    void setColumnType(String ColumnType);

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
     * Get Payroll Concept Category
     */
    int getPayrollConceptCategoryId();

    /**
     * Set Payroll Concept Category
     */
    void setPayrollConceptCategoryId(int HR_Concept_Category_ID);

    org.eevolution.model.I_HR_Concept_Category getPayrollConceptCategory()
            throws RuntimeException;

    /**
     * Get Payroll Concept
     */
    int getPayrollConceptId();

    /**
     * Set Payroll Concept
     */
    void setPayrollConceptId(int HR_Concept_ID);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    void setIsEmployee(boolean IsEmployee);

    /**
     * Get Employee. Indicates if this Business Partner is an employee
     */
    boolean isEmployee();

    /**
     * Set Paid. The document is paid
     */
    void setIsPaid(boolean IsPaid);

    /**
     * Get Paid. The document is paid
     */
    boolean isPaid();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Set Read Write. Field is read / write
     */
    void setIsReadWrite(boolean IsReadWrite);

    /**
     * Get Read Write. Field is read / write
     */
    boolean isReadWrite();

    /**
     * Set Receipt. This is a sales transaction (receipt)
     */
    void setIsReceipt(boolean IsReceipt);

    /**
     * Get Receipt. This is a sales transaction (receipt)
     */
    boolean isReceipt();

    /**
     * Set Registered. The application is registered.
     */
    void setIsRegistered(boolean IsRegistered);

    /**
     * Get Registered. The application is registered.
     */
    boolean isRegistered();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Type. Type of Validation (SQL, Java Script, Java Language)
     */
    String getType();

    /**
     * Set Type. Type of Validation (SQL, Java Script, Java Language)
     */
    void setType(String Type);

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
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
