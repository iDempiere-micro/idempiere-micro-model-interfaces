package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Goal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Goal {

    /**
     * TableName=PA_Goal
     */
    String Table_Name = "PA_Goal";

    /**
     * AD_Table_ID=440
     */
    int Table_ID = 440;

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
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name ChartType
     */
    String COLUMNNAME_ChartType = "ChartType";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateFrom
     */
    String COLUMNNAME_DateFrom = "DateFrom";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name DateTo
     */
    String COLUMNNAME_DateTo = "DateTo";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GoalPerformance
     */
    String COLUMNNAME_GoalPerformance = "GoalPerformance";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name MeasureActual
     */
    String COLUMNNAME_MeasureActual = "MeasureActual";
    /**
     * Column name MeasureDisplay
     */
    String COLUMNNAME_MeasureDisplay = "MeasureDisplay";
    /**
     * Column name MeasureScope
     */
    String COLUMNNAME_MeasureScope = "MeasureScope";
    /**
     * Column name MeasureTarget
     */
    String COLUMNNAME_MeasureTarget = "MeasureTarget";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name PA_ColorSchema_ID
     */
    String COLUMNNAME_PA_ColorSchema_ID = "PA_ColorSchema_ID";
    /**
     * Column name PA_Goal_ID
     */
    String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";
    /**
     * Column name PA_GoalParent_ID
     */
    String COLUMNNAME_PA_GoalParent_ID = "PA_GoalParent_ID";
    /**
     * Column name PA_Goal_UU
     */
    String COLUMNNAME_PA_Goal_UU = "PA_Goal_UU";
    /**
     * Column name PA_Measure_ID
     */
    String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
    /**
     * Column name RelativeWeight
     */
    String COLUMNNAME_RelativeWeight = "RelativeWeight";
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
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Chart Type. Type of chart to render
     */
    String getChartType();

    /**
     * Set Chart Type. Type of chart to render
     */
    void setChartType(String ChartType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date From. Starting date for a range
     */
    Timestamp getDateFrom();

    /**
     * Set Date From. Starting date for a range
     */
    void setDateFrom(Timestamp DateFrom);

    /**
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

    /**
     * Get Date To. End date of a date range
     */
    Timestamp getDateTo();

    /**
     * Set Date To. End date of a date range
     */
    void setDateTo(Timestamp DateTo);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Performance Goal. Target achievement from 0..1
     */
    BigDecimal getGoalPerformance();

    /**
     * Set Performance Goal. Target achievement from 0..1
     */
    void setGoalPerformance(BigDecimal GoalPerformance);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Measure Actual. Actual value that has been measured.
     */
    BigDecimal getMeasureActual();

    /**
     * Set Measure Actual. Actual value that has been measured.
     */
    void setMeasureActual(BigDecimal MeasureActual);

    /**
     * Get Measure Display. Measure Scope initially displayed
     */
    String getMeasureDisplay();

    /**
     * Set Measure Display. Measure Scope initially displayed
     */
    void setMeasureDisplay(String MeasureDisplay);

    /**
     * Get Measure Scope. Performance Measure Scope
     */
    String getMeasureScope();

    /**
     * Set Measure Scope. Performance Measure Scope
     */
    void setMeasureScope(String MeasureScope);

    /**
     * Get Measure Target. Target value for measure
     */
    BigDecimal getMeasureTarget();

    /**
     * Set Measure Target. Target value for measure
     */
    void setMeasureTarget(BigDecimal MeasureTarget);

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
     * Get Color Schema. Performance Color Schema
     */
    int getPA_ColorSchema_ID();

    /**
     * Set Color Schema. Performance Color Schema
     */
    void setPA_ColorSchema_ID(int PA_ColorSchema_ID);

    I_PA_ColorSchema getPA_ColorSchema() throws RuntimeException;

    /**
     * Get Goal. Performance Goal
     */
    int getPA_Goal_ID();

    /**
     * Set Goal. Performance Goal
     */
    void setPA_Goal_ID(int PA_Goal_ID);

    /**
     * Get Parent Goal. Parent Goal
     */
    int getPA_GoalParent_ID();

    /**
     * Set Parent Goal. Parent Goal
     */
    void setPA_GoalParent_ID(int PA_GoalParent_ID);

    I_PA_Goal getPA_GoalParent() throws RuntimeException;

    /**
     * Get PA_Goal_UU
     */
    String getPA_Goal_UU();

    /**
     * Set PA_Goal_UU
     */
    void setPA_Goal_UU(String PA_Goal_UU);

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
     * Get Relative Weight. Relative weight of this step (0 = ignored)
     */
    BigDecimal getRelativeWeight();

    /**
     * Set Relative Weight. Relative weight of this step (0 = ignored)
     */
    void setRelativeWeight(BigDecimal RelativeWeight);

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
