package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CommissionRun
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CommissionRun {

    /**
     * TableName=C_CommissionRun
     */
    String Table_Name = "C_CommissionRun";

    /**
     * AD_Table_ID=436
     */
    int Table_ID = 436;

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
     * Column name C_Commission_ID
     */
    String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
    /**
     * Column name C_CommissionRun_ID
     */
    String COLUMNNAME_C_CommissionRun_ID = "C_CommissionRun_ID";
    /**
     * Column name C_CommissionRun_UU
     */
    String COLUMNNAME_C_CommissionRun_UU = "C_CommissionRun_UU";
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
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name GrandTotal
     */
    String COLUMNNAME_GrandTotal = "GrandTotal";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
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
     * Get Commission. Commission
     */
    int getC_Commission_ID();

    /**
     * Set Commission. Commission
     */
    void setC_Commission_ID(int C_Commission_ID);

    I_C_Commission getC_Commission() throws RuntimeException;

    /**
     * Get Commission Run. Commission Run or Process
     */
    int getC_CommissionRun_ID();

    /**
     * Set Commission Run. Commission Run or Process
     */
    void setC_CommissionRun_ID(int C_CommissionRun_ID);

    /**
     * Get C_CommissionRun_UU
     */
    String getC_CommissionRun_UU();

    /**
     * Set C_CommissionRun_UU
     */
    void setC_CommissionRun_UU(String C_CommissionRun_UU);

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
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Grand Total. Total amount of document
     */
    BigDecimal getGrandTotal();

    /**
     * Set Grand Total. Total amount of document
     */
    void setGrandTotal(BigDecimal GrandTotal);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
