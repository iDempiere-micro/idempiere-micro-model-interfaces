package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RevenueRecognition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RevenueRecognition {

    /**
     * TableName=C_RevenueRecognition
     */
    String Table_Name = "C_RevenueRecognition";

    /**
     * AD_Table_ID=336
     */
    int Table_ID = 336;

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
     * Column name C_RevenueRecognition_ID
     */
    String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
    /**
     * Column name C_RevenueRecognition_UU
     */
    String COLUMNNAME_C_RevenueRecognition_UU = "C_RevenueRecognition_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsTimeBased
     */
    String COLUMNNAME_IsTimeBased = "IsTimeBased";
    /**
     * Column name NoMonths
     */
    String COLUMNNAME_NoMonths = "NoMonths";
    /**
     * Column name RecognitionFrequency
     */
    String COLUMNNAME_RecognitionFrequency = "RecognitionFrequency";
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
     * Get Revenue Recognition. Method for recording revenue
     */
    int getC_RevenueRecognition_ID();

    /**
     * Set Revenue Recognition. Method for recording revenue
     */
    void setC_RevenueRecognition_ID(int C_RevenueRecognition_ID);

    /**
     * Get C_RevenueRecognition_UU
     */
    String getC_RevenueRecognition_UU();

    /**
     * Set C_RevenueRecognition_UU
     */
    void setC_RevenueRecognition_UU(String C_RevenueRecognition_UU);

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
     * Set Time based. Time based Revenue Recognition rather than Service Level based
     */
    void setIsTimeBased(boolean IsTimeBased);

    /**
     * Get Time based. Time based Revenue Recognition rather than Service Level based
     */
    boolean isTimeBased();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Number of Months
     */
    int getNoMonths();

    /**
     * Set Number of Months
     */
    void setNoMonths(int NoMonths);

    /**
     * Get Recognition frequency
     */
    String getRecognitionFrequency();

    /**
     * Set Recognition frequency
     */
    void setRecognitionFrequency(String RecognitionFrequency);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
