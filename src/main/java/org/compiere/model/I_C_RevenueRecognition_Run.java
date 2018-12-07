package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RevenueRecognition_Run
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RevenueRecognition_Run {

    /**
     * TableName=C_RevenueRecognition_Run
     */
    String Table_Name = "C_RevenueRecognition_Run";

    /**
     * AD_Table_ID=444
     */
    int Table_ID = 444;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

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
     * Column name C_RevenueRecognition_Plan_ID
     */
    String COLUMNNAME_C_RevenueRecognition_Plan_ID =
            "C_RevenueRecognition_Plan_ID";
    /**
     * Column name C_RevenueRecognition_Run_ID
     */
    String COLUMNNAME_C_RevenueRecognition_Run_ID = "C_RevenueRecognition_Run_ID";
    /**
     * Column name C_RevenueRecognition_Run_UU
     */
    String COLUMNNAME_C_RevenueRecognition_Run_UU = "C_RevenueRecognition_Run_UU";
    /**
     * Column name GL_Journal_ID
     */
    String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name RecognizedAmt
     */
    String COLUMNNAME_RecognizedAmt = "RecognizedAmt";
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
     * Get Revenue Recognition Plan. Plan for recognizing or recording revenue
     */
    int getC_RevenueRecognition_Plan_ID();

    /**
     * Set Revenue Recognition Plan. Plan for recognizing or recording revenue
     */
    void setC_RevenueRecognition_Plan_ID(int C_RevenueRecognition_Plan_ID);

    I_C_RevenueRecognition_Plan getC_RevenueRecognition_Plan() throws RuntimeException;

    /**
     * Get Revenue Recognition Run. Revenue Recognition Run or Process
     */
    int getC_RevenueRecognition_Run_ID();

    /**
     * Set Revenue Recognition Run. Revenue Recognition Run or Process
     */
    void setC_RevenueRecognition_Run_ID(int C_RevenueRecognition_Run_ID);

    /**
     * Get C_RevenueRecognition_Run_UU
     */
    String getC_RevenueRecognition_Run_UU();

    /**
     * Set C_RevenueRecognition_Run_UU
     */
    void setC_RevenueRecognition_Run_UU(String C_RevenueRecognition_Run_UU);

    /**
     * Get Journal. General Ledger Journal
     */
    int getGL_Journal_ID();

    /**
     * Set Journal. General Ledger Journal
     */
    void setGL_Journal_ID(int GL_Journal_ID);

    I_GL_Journal getGL_Journal() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Recognized Amount
     */
    BigDecimal getRecognizedAmt();

    /**
     * Set Recognized Amount
     */
    void setRecognizedAmt(BigDecimal RecognizedAmt);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
