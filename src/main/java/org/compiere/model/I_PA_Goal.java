package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PA_Goal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Goal {

    /**
     * AD_Table_ID=440
     */
    int Table_ID = 440;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GoalPerformance
     */
    String COLUMNNAME_GoalPerformance = "GoalPerformance";
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
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

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
     * Get Goal. Performance Goal
     */
    int getPA_Goal_ID();

    /**
     * Get Measure. Concrete Performance Measurement
     */
    int getPA_Measure_ID();

    /**
     * Set Measure. Concrete Performance Measurement
     */
    void setPA_Measure_ID(int PA_Measure_ID);

    /**
     * Set Relative Weight. Relative weight of this step (0 = ignored)
     */
    void setRelativeWeight(BigDecimal RelativeWeight);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
