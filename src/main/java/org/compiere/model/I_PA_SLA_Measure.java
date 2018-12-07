package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_SLA_Measure
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_SLA_Measure {

    /**
     * TableName=PA_SLA_Measure
     */
    String Table_Name = "PA_SLA_Measure";

    /**
     * AD_Table_ID=743
     */
    int Table_ID = 743;

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
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MeasureActual
     */
    String COLUMNNAME_MeasureActual = "MeasureActual";
    /**
     * Column name PA_SLA_Goal_ID
     */
    String COLUMNNAME_PA_SLA_Goal_ID = "PA_SLA_Goal_ID";
    /**
     * Column name PA_SLA_Measure_ID
     */
    String COLUMNNAME_PA_SLA_Measure_ID = "PA_SLA_Measure_ID";
    /**
     * Column name PA_SLA_Measure_UU
     */
    String COLUMNNAME_PA_SLA_Measure_UU = "PA_SLA_Measure_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
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
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Transaction Date. Transaction Date
     */
    Timestamp getDateTrx();

    /**
     * Set Transaction Date. Transaction Date
     */
    void setDateTrx(Timestamp DateTrx);

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
     * Get Measure Actual. Actual value that has been measured.
     */
    BigDecimal getMeasureActual();

    /**
     * Set Measure Actual. Actual value that has been measured.
     */
    void setMeasureActual(BigDecimal MeasureActual);

    /**
     * Get SLA Goal. Service Level Agreement Goal
     */
    int getPA_SLA_Goal_ID();

    /**
     * Set SLA Goal. Service Level Agreement Goal
     */
    void setPA_SLA_Goal_ID(int PA_SLA_Goal_ID);

    I_PA_SLA_Goal getPA_SLA_Goal() throws RuntimeException;

    /**
     * Get SLA Measure. Service Level Agreement Measure
     */
    int getPA_SLA_Measure_ID();

    /**
     * Set SLA Measure. Service Level Agreement Measure
     */
    void setPA_SLA_Measure_ID(int PA_SLA_Measure_ID);

    /**
     * Get PA_SLA_Measure_UU
     */
    String getPA_SLA_Measure_UU();

    /**
     * Set PA_SLA_Measure_UU
     */
    void setPA_SLA_Measure_UU(String PA_SLA_Measure_UU);

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
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
