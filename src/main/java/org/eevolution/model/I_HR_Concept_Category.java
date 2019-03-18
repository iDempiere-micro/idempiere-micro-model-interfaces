package org.eevolution.model;

import org.compiere.model.I_C_ValidCombination;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Concept_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Concept_Category {

    /**
     * TableName=HR_Concept_Category
     */
    String Table_Name = "HR_Concept_Category";

    /**
     * AD_Table_ID=53097
     */
    int Table_ID = 53097;

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
     * Column name HR_Concept_Acct
     */
    String COLUMNNAME_HR_Concept_Acct = "HR_Concept_Acct";
    /**
     * Column name HR_Concept_Category_ID
     */
    String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
    /**
     * Column name HR_Concept_Category_UU
     */
    String COLUMNNAME_HR_Concept_Category_UU = "HR_Concept_Category_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
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
     * Get Payroll Concept Account
     */
    int getPayrollConceptAccountId();

    /**
     * Set Payroll Concept Account
     */
    void setPayrollConceptAccountId(int HR_Concept_Acct);

    I_C_ValidCombination getPayrollConceptAccount() throws RuntimeException;

    /**
     * Get Payroll Concept Category
     */
    int getPayrollConceptCategoryId();

    /**
     * Set Payroll Concept Category
     */
    void setPayrollConceptCategoryId(int HR_Concept_Category_ID);

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
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
