package org.eevolution.model;

import org.compiere.model.I_C_ValidCombination;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Attribute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Attribute {

    /**
     * TableName=HR_Attribute
     */
    public static final String Table_Name = "HR_Attribute";

    /**
     * AD_Table_ID=53087
     */
    public static final int Table_ID = 53087;

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
     * Column name AD_Rule_ID
     */
    public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name Amount
     */
    public static final String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name ColumnType
     */
    public static final String COLUMNNAME_ColumnType = "ColumnType";
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
     * Column name HR_Attribute_Acct
     */
    public static final String COLUMNNAME_HR_Attribute_Acct = "HR_Attribute_Acct";
    /**
     * Column name HR_Attribute_ID
     */
    public static final String COLUMNNAME_HR_Attribute_ID = "HR_Attribute_ID";
    /**
     * Column name HR_Attribute_UU
     */
    public static final String COLUMNNAME_HR_Attribute_UU = "HR_Attribute_UU";
    /**
     * Column name HR_Concept_ID
     */
    public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_Job_ID
     */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPrinted
     */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name MaxValue
     */
    public static final String COLUMNNAME_MaxValue = "MaxValue";
    /**
     * Column name MinValue
     */
    public static final String COLUMNNAME_MinValue = "MinValue";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name ServiceDate
     */
    public static final String COLUMNNAME_ServiceDate = "ServiceDate";
    /**
     * Column name TextMsg
     */
    public static final String COLUMNNAME_TextMsg = "TextMsg";
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
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Rule
     */
    public int getAD_Rule_ID();

    /**
     * Set Rule
     */
    public void setAD_Rule_ID(int AD_Rule_ID);

    public org.compiere.model.I_AD_Rule getAD_Rule() throws RuntimeException;

    /**
     * Get Amount. Amount in a defined currency
     */
    public BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    public void setAmount(BigDecimal Amount);

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
     * Get Column Type
     */
    public String getColumnType();

    /**
     * Set Column Type
     */
    public void setColumnType(String ColumnType);

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
     * Get Payroll Attribute Account
     */
    public int getHR_Attribute_Acct();

    /**
     * Set Payroll Attribute Account
     */
    public void setHR_Attribute_Acct(int HR_Attribute_Acct);

    public I_C_ValidCombination getHR_Attribute_A() throws RuntimeException;

    /**
     * Get Payroll Employee Attribute
     */
    public int getHR_Attribute_ID();

    /**
     * Set Payroll Employee Attribute
     */
    public void setHR_Attribute_ID(int HR_Attribute_ID);

    /**
     * Get HR_Attribute_UU
     */
    public String getHR_Attribute_UU();

    /**
     * Set HR_Attribute_UU
     */
    public void setHR_Attribute_UU(String HR_Attribute_UU);

    /**
     * Get Payroll Concept
     */
    public int getHR_Concept_ID();

    /**
     * Set Payroll Concept
     */
    public void setHR_Concept_ID(int HR_Concept_ID);

    public org.eevolution.model.I_HR_Concept getHR_Concept() throws RuntimeException;

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
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    public void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    public boolean isPrinted();

    /**
     * Get Max Value
     */
    public int getMaxValue();

    /**
     * Set Max Value
     */
    public void setMaxValue(int MaxValue);

    /**
     * Get Min Value
     */
    public int getMinValue();

    /**
     * Set Min Value
     */
    public void setMinValue(int MinValue);

    /**
     * Get Quantity. Quantity
     */
    public BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(BigDecimal Qty);

    /**
     * Get Service date. Date service was provided
     */
    public Timestamp getServiceDate();

    /**
     * Set Service date. Date service was provided
     */
    public void setServiceDate(Timestamp ServiceDate);

    /**
     * Get Text Message. Text Message
     */
    public String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    public void setTextMsg(String TextMsg);

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
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);
}
