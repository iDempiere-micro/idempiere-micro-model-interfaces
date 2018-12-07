package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_QualityTestResult
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_QualityTestResult {

    /**
     * TableName=M_QualityTestResult
     */
    String Table_Name = "M_QualityTestResult";

    /**
     * AD_Table_ID=53331
     */
    int Table_ID = 53331;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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
     * Column name ExpectedResult
     */
    String COLUMNNAME_ExpectedResult = "ExpectedResult";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsQCPass
     */
    String COLUMNNAME_IsQCPass = "IsQCPass";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_QualityTest_ID
     */
    String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";
    /**
     * Column name M_QualityTestResult_ID
     */
    String COLUMNNAME_M_QualityTestResult_ID = "M_QualityTestResult_ID";
    /**
     * Column name M_QualityTestResult_UU
     */
    String COLUMNNAME_M_QualityTestResult_UU = "M_QualityTestResult_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Result
     */
    String COLUMNNAME_Result = "Result";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Get Expected Result
     */
    String getExpectedResult();

    /**
     * Set Expected Result
     */
    void setExpectedResult(String ExpectedResult);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set QC Pass
     */
    void setIsQCPass(boolean IsQCPass);

    /**
     * Get QC Pass
     */
    boolean isQCPass();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Quality Test
     */
    int getM_QualityTest_ID();

    /**
     * Set Quality Test
     */
    void setM_QualityTest_ID(int M_QualityTest_ID);

    I_M_QualityTest getM_QualityTest() throws RuntimeException;

    /**
     * Get Quality Test Result
     */
    int getM_QualityTestResult_ID();

    /**
     * Set Quality Test Result
     */
    void setM_QualityTestResult_ID(int M_QualityTestResult_ID);

    /**
     * Get M_QualityTestResult_UU
     */
    String getM_QualityTestResult_UU();

    /**
     * Set M_QualityTestResult_UU
     */
    void setM_QualityTestResult_UU(String M_QualityTestResult_UU);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Result. Result of the action taken
     */
    String getResult();

    /**
     * Set Result. Result of the action taken
     */
    void setResult(String Result);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
