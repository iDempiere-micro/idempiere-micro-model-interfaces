package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_Period
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Period {

    /**
     * TableName=C_Period
     */
    String Table_Name = "C_Period";

    /**
     * AD_Table_ID=145
     */
    int Table_ID = 145;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name C_Year_ID
     */
    String COLUMNNAME_C_Year_ID = "C_Year_ID";
    /**
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name PeriodNo
     */
    String COLUMNNAME_PeriodNo = "PeriodNo";
    /**
     * Column name PeriodType
     */
    String COLUMNNAME_PeriodType = "PeriodType";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";

    /**
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Get Year. Calendar Year
     */
    int getC_Year_ID();

    /**
     * Set Year. Calendar Year
     */
    void setC_Year_ID(int C_Year_ID);

    I_C_Year getC_Year() throws RuntimeException;

    /**
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

    /**
     * Set Period No. Unique Period Number
     */
    void setPeriodNo(int PeriodNo);

    /**
     * Get Period Type. Period Type
     */
    String getPeriodType();

    /**
     * Set Period Type. Period Type
     */
    void setPeriodType(String PeriodType);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

}
