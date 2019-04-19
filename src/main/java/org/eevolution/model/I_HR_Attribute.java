package org.eevolution.model;

import org.compiere.model.I_C_ValidCombination;
import org.compiere.model.Rule;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Attribute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Attribute {

    /**
     * TableName=HR_Attribute
     */
    String Table_Name = "HR_Attribute";

    /**
     * AD_Table_ID=53087
     */
    int Table_ID = 53087;

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
     * Column name AD_Rule_ID
     */
    String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
     * Column name HR_Attribute_Acct
     */
    String COLUMNNAME_HR_Attribute_Acct = "HR_Attribute_Acct";
    /**
     * Column name HR_Attribute_ID
     */
    String COLUMNNAME_HR_Attribute_ID = "HR_Attribute_ID";
    /**
     * Column name HR_Attribute_UU
     */
    String COLUMNNAME_HR_Attribute_UU = "HR_Attribute_UU";
    /**
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
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
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name MaxValue
     */
    String COLUMNNAME_MaxValue = "MaxValue";
    /**
     * Column name MinValue
     */
    String COLUMNNAME_MinValue = "MinValue";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name ServiceDate
     */
    String COLUMNNAME_ServiceDate = "ServiceDate";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
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
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Rule
     */
    int getRuleId();

    /**
     * Set Rule
     */
    void setRuleId(int AD_Rule_ID);

    Rule getRule() throws RuntimeException;

    /**
     * Get Amount. Amount in a defined currency
     */
    BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    void setAmount(BigDecimal Amount);

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
     * Get Payroll Attribute Account
     */
    int getPayrollAttributeAccountId();

    /**
     * Set Payroll Attribute Account
     */
    void setPayrollAttributeAccountId(int HR_Attribute_Acct);

    I_C_ValidCombination getPayrollAttributeAccount() throws RuntimeException;

    /**
     * Get Payroll Employee Attribute
     */
    int getPayrollEmployeeAttributeId();

    /**
     * Set Payroll Employee Attribute
     */
    void setPayrollEmployeeAttributeId(int HR_Attribute_ID);

    /**
     * Get Payroll Concept
     */
    int getPayrollConceptId();

    /**
     * Set Payroll Concept
     */
    void setPayrollConceptId(int HR_Concept_ID);

    org.eevolution.model.I_HR_Concept getPayrollConcept() throws RuntimeException;

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
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Get Max Value
     */
    int getMaxValue();

    /**
     * Set Max Value
     */
    void setMaxValue(int MaxValue);

    /**
     * Get Min Value
     */
    int getMinValue();

    /**
     * Set Min Value
     */
    void setMinValue(int MinValue);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Service date. Date service was provided
     */
    Timestamp getServiceDate();

    /**
     * Set Service date. Date service was provided
     */
    void setServiceDate(Timestamp ServiceDate);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

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
}
