package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ServiceLevelLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ServiceLevelLine {

    /**
     * TableName=C_ServiceLevelLine
     */
    String Table_Name = "C_ServiceLevelLine";

    /**
     * AD_Table_ID=338
     */
    int Table_ID = 338;

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
     * Column name C_ServiceLevel_ID
     */
    String COLUMNNAME_C_ServiceLevel_ID = "C_ServiceLevel_ID";
    /**
     * Column name C_ServiceLevelLine_ID
     */
    String COLUMNNAME_C_ServiceLevelLine_ID = "C_ServiceLevelLine_ID";
    /**
     * Column name C_ServiceLevelLine_UU
     */
    String COLUMNNAME_C_ServiceLevelLine_UU = "C_ServiceLevelLine_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ServiceDate
     */
    String COLUMNNAME_ServiceDate = "ServiceDate";
    /**
     * Column name ServiceLevelProvided
     */
    String COLUMNNAME_ServiceLevelProvided = "ServiceLevelProvided";
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
     * Get Service Level. Product Revenue Recognition Service Level
     */
    int getC_ServiceLevel_ID();

    /**
     * Set Service Level. Product Revenue Recognition Service Level
     */
    void setC_ServiceLevel_ID(int C_ServiceLevel_ID);

    I_C_ServiceLevel getC_ServiceLevel() throws RuntimeException;

    /**
     * Get Service Level Line. Product Revenue Recognition Service Level Line
     */
    int getC_ServiceLevelLine_ID();

    /**
     * Set Service Level Line. Product Revenue Recognition Service Level Line
     */
    void setC_ServiceLevelLine_ID(int C_ServiceLevelLine_ID);

    /**
     * Get C_ServiceLevelLine_UU
     */
    String getC_ServiceLevelLine_UU();

    /**
     * Set C_ServiceLevelLine_UU
     */
    void setC_ServiceLevelLine_UU(String C_ServiceLevelLine_UU);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Get Service date. Date service was provided
     */
    Timestamp getServiceDate();

    /**
     * Set Service date. Date service was provided
     */
    void setServiceDate(Timestamp ServiceDate);

    /**
     * Get Quantity Provided. Quantity of service or product provided
     */
    BigDecimal getServiceLevelProvided();

    /**
     * Set Quantity Provided. Quantity of service or product provided
     */
    void setServiceLevelProvided(BigDecimal ServiceLevelProvided);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
