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

public interface I_HR_PayrollConcept {

    /**
     * TableName=HR_PayrollConcept
     */
    String Table_Name = "HR_PayrollConcept";

    /**
     * AD_Table_ID=53096
     */
    int Table_ID = 53096;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_PayrollConcept_ID
     */
    String COLUMNNAME_HR_PayrollConcept_ID = "HR_PayrollConcept_ID";
    /**
     * Column name HR_PayrollConcept_UU
     */
    String COLUMNNAME_HR_PayrollConcept_UU = "HR_PayrollConcept_UU";
    /**
     * Column name HR_Payroll_ID
     */
    String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDisplayed
     */
    String COLUMNNAME_IsDisplayed = "IsDisplayed";
    /**
     * Column name IsInclude
     */
    String COLUMNNAME_IsInclude = "IsInclude";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Rule
     */
    int getRuleId();

    /**
     * Set Rule
     */
    void setRuleId(int AD_Rule_ID);

    org.compiere.model.I_AD_Rule getRule() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Get Payroll Concept
     */
    int getPayrollPayrollConceptId();

    /**
     * Set Payroll Concept
     */
    void setPayrollPayrollConceptId(int HR_PayrollConcept_ID);

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
     * Set Displayed. Determines, if this field is displayed
     */
    void setIsDisplayed(boolean IsDisplayed);

    /**
     * Get Displayed. Determines, if this field is displayed
     */
    boolean isDisplayed();

    /**
     * Set Included. Defines whether this content / template is included into another one
     */
    void setIsInclude(boolean IsInclude);

    /**
     * Get Included. Defines whether this content / template is included into another one
     */
    boolean isInclude();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
