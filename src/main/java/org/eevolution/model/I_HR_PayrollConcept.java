package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_PayrollConcept
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_PayrollConcept {

    /**
     * TableName=HR_PayrollConcept
     */
    public static final String Table_Name = "HR_PayrollConcept";

    /**
     * AD_Table_ID=53096
     */
    public static final int Table_ID = 53096;

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
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_Concept_ID
     */
    public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_PayrollConcept_ID
     */
    public static final String COLUMNNAME_HR_PayrollConcept_ID = "HR_PayrollConcept_ID";
    /**
     * Column name HR_PayrollConcept_UU
     */
    public static final String COLUMNNAME_HR_PayrollConcept_UU = "HR_PayrollConcept_UU";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDisplayed
     */
    public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";
    /**
     * Column name IsInclude
     */
    public static final String COLUMNNAME_IsInclude = "IsInclude";
    /**
     * Column name IsPrinted
     */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name SeqNo
     */
    public static final String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

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
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

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
     * Get Payroll Concept
     */
    public int getHR_PayrollConcept_ID();

    /**
     * Set Payroll Concept
     */
    public void setHR_PayrollConcept_ID(int HR_PayrollConcept_ID);

    /**
     * Get HR_PayrollConcept_UU
     */
    public String getHR_PayrollConcept_UU();

    /**
     * Set HR_PayrollConcept_UU
     */
    public void setHR_PayrollConcept_UU(String HR_PayrollConcept_UU);

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
     * Set Displayed. Determines, if this field is displayed
     */
    public void setIsDisplayed(boolean IsDisplayed);

    /**
     * Get Displayed. Determines, if this field is displayed
     */
    public boolean isDisplayed();

    /**
     * Set Included. Defines whether this content / template is included into another one
     */
    public void setIsInclude(boolean IsInclude);

    /**
     * Get Included. Defines whether this content / template is included into another one
     */
    public boolean isInclude();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    public void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    public boolean isPrinted();

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
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
