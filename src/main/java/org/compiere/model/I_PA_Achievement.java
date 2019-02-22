package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

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

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

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
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Achieved. The goal is achieved
     */
    boolean isAchieved();

    /**
     * Get Manual Actual. Manually entered actual value
     */
    BigDecimal getManualActual();

    /**
     * Set Manual Actual. Manually entered actual value
     */
    void setManualActual(BigDecimal ManualActual);

    /**
     * Get Measure. Concrete Performance Measurement
     */
    int getPA_Measure_ID();

}
