package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Achievement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Achievement {

    /**
     * TableName=PA_Achievement
     */
    String Table_Name = "PA_Achievement";

    /**
     * AD_Table_ID=438
     */
    int Table_ID = 438;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsAchieved
     */
    String COLUMNNAME_IsAchieved = "IsAchieved";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ManualActual
     */
    String COLUMNNAME_ManualActual = "ManualActual";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name PA_Achievement_ID
     */
    String COLUMNNAME_PA_Achievement_ID = "PA_Achievement_ID";
    /**
     * Column name PA_Achievement_UU
     */
    String COLUMNNAME_PA_Achievement_UU = "PA_Achievement_UU";
    /**
     * Column name PA_Measure_ID
     */
    String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
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
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Achieved. The goal is achieved
     */
    void setIsAchieved(boolean IsAchieved);

    /**
     * Get Achieved. The goal is achieved
     */
    boolean isAchieved();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Manual Actual. Manually entered actual value
     */
    BigDecimal getManualActual();

    /**
     * Set Manual Actual. Manually entered actual value
     */
    void setManualActual(BigDecimal ManualActual);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Note. Optional additional user defined information
     */
    String getNote();

    /**
     * Set Note. Optional additional user defined information
     */
    void setNote(String Note);

    /**
     * Get Achievement. Performance Achievement
     */
    int getPA_Achievement_ID();

    /**
     * Set Achievement. Performance Achievement
     */
    void setPA_Achievement_ID(int PA_Achievement_ID);

    /**
     * Get PA_Achievement_UU
     */
    String getPA_Achievement_UU();

    /**
     * Set PA_Achievement_UU
     */
    void setPA_Achievement_UU(String PA_Achievement_UU);

    /**
     * Get Measure. Concrete Performance Measurement
     */
    int getPA_Measure_ID();

    /**
     * Set Measure. Concrete Performance Measurement
     */
    void setPA_Measure_ID(int PA_Measure_ID);

    I_PA_Measure getPA_Measure() throws RuntimeException;

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
