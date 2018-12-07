package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_QualityTest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_QualityTest {

    /**
     * TableName=M_Product_QualityTest
     */
    String Table_Name = "M_Product_QualityTest";

    /**
     * AD_Table_ID=53333
     */
    int Table_ID = 53333;

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
     * Column name ExpectedResult
     */
    String COLUMNNAME_ExpectedResult = "ExpectedResult";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Product_QualityTest_ID
     */
    String COLUMNNAME_M_Product_QualityTest_ID = "M_Product_QualityTest_ID";
    /**
     * Column name M_Product_QualityTest_UU
     */
    String COLUMNNAME_M_Product_QualityTest_UU = "M_Product_QualityTest_UU";
    /**
     * Column name M_QualityTest_ID
     */
    String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";
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
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Product Quality Test
     */
    int getM_Product_QualityTest_ID();

    /**
     * Set Product Quality Test
     */
    void setM_Product_QualityTest_ID(int M_Product_QualityTest_ID);

    /**
     * Get M_Product_QualityTest_UU
     */
    String getM_Product_QualityTest_UU();

    /**
     * Set M_Product_QualityTest_UU
     */
    void setM_Product_QualityTest_UU(String M_Product_QualityTest_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
