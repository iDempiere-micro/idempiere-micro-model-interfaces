package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for HR_Concept
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Concept {

    /**
     * TableName=HR_Concept
     */
    public static final String Table_Name = "HR_Concept";

    /**
     * AD_Table_ID=53090
     */
    public static final int Table_ID = 53090;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AccountSign
     */
    public static final String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Reference_ID
     */
    public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
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
     * Column name HR_Concept_Category_ID
     */
    public static final String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
    /**
     * Column name HR_Concept_ID
     */
    public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Concept_UU
     */
    public static final String COLUMNNAME_HR_Concept_UU = "HR_Concept_UU";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
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
     * Column name IsDefault
     */
    public static final String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsEmployee
     */
    public static final String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name IsPaid
     */
    public static final String COLUMNNAME_IsPaid = "IsPaid";
    /**
     * Column name IsPrinted
     */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsReadWrite
     */
    public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
    /**
     * Column name IsReceipt
     */
    public static final String COLUMNNAME_IsReceipt = "IsReceipt";
    /**
     * Column name IsRegistered
     */
    public static final String COLUMNNAME_IsRegistered = "IsRegistered";
    /**
     * Column name SeqNo
     */
    public static final String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Type
     */
    public static final String COLUMNNAME_Type = "Type";
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
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    public String getAccountSign();

    /**
     * Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    public void setAccountSign(String AccountSign);

    /**
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Reference. System Reference and Validation
     */
    public int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    public void setAD_Reference_ID(int AD_Reference_ID);

    public org.compiere.model.I_AD_Reference getAD_Reference() throws RuntimeException;

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
     * Get Payroll Concept Category
     */
    public int getHR_Concept_Category_ID();

    /**
     * Set Payroll Concept Category
     */
    public void setHR_Concept_Category_ID(int HR_Concept_Category_ID);

    public org.eevolution.model.I_HR_Concept_Category getHR_Concept_Category()
            throws RuntimeException;

    /**
     * Get Payroll Concept
     */
    public int getHR_Concept_ID();

    /**
     * Set Payroll Concept
     */
    public void setHR_Concept_ID(int HR_Concept_ID);

    /**
     * Get HR_Concept_UU
     */
    public String getHR_Concept_UU();

    /**
     * Set HR_Concept_UU
     */
    public void setHR_Concept_UU(String HR_Concept_UU);

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
     * Set Default. Default value
     */
    public void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    public boolean isDefault();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    public void setIsEmployee(boolean IsEmployee);

    /**
     * Get Employee. Indicates if this Business Partner is an employee
     */
    public boolean isEmployee();

    /**
     * Set Paid. The document is paid
     */
    public void setIsPaid(boolean IsPaid);

    /**
     * Get Paid. The document is paid
     */
    public boolean isPaid();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    public void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    public boolean isPrinted();

    /**
     * Set Read Write. Field is read / write
     */
    public void setIsReadWrite(boolean IsReadWrite);

    /**
     * Get Read Write. Field is read / write
     */
    public boolean isReadWrite();

    /**
     * Set Receipt. This is a sales transaction (receipt)
     */
    public void setIsReceipt(boolean IsReceipt);

    /**
     * Get Receipt. This is a sales transaction (receipt)
     */
    public boolean isReceipt();

    /**
     * Set Registered. The application is registered.
     */
    public void setIsRegistered(boolean IsRegistered);

    /**
     * Get Registered. The application is registered.
     */
    public boolean isRegistered();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    public int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    public void setSeqNo(int SeqNo);

    /**
     * Get Type. Type of Validation (SQL, Java Script, Java Language)
     */
    public String getType();

    /**
     * Set Type. Type of Validation (SQL, Java Script, Java Language)
     */
    public void setType(String Type);

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);
}
