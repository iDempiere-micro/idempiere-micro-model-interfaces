package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for PA_Measure
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Measure {

    /**
     * TableName=PA_Measure
     */
    String Table_Name = "PA_Measure";

    /**
     * AD_Table_ID=441
     */
    int Table_ID = 441;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name CalculationClass
     */
    String COLUMNNAME_CalculationClass = "CalculationClass";
    /**
     * Column name C_ProjectType_ID
     */
    String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /**
     * Column name ManualActual
     */
    String COLUMNNAME_ManualActual = "ManualActual";
    /**
     * Column name MeasureDataType
     */
    String COLUMNNAME_MeasureDataType = "MeasureDataType";
    /**
     * Column name MeasureType
     */
    String COLUMNNAME_MeasureType = "MeasureType";
    /**
     * Column name PA_Benchmark_ID
     */
    String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
    /**
     * Column name PA_Hierarchy_ID
     */
    String COLUMNNAME_PA_Hierarchy_ID = "PA_Hierarchy_ID";
    /**
     * Column name PA_MeasureCalc_ID
     */
    String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
    /**
     * Column name PA_Measure_ID
     */
    String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
    /**
     * Column name PA_Ratio_ID
     */
    String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";

    /**
     * Get Calculation Class. Java Class for calculation, implementing Interface Measure
     */
    String getCalculationClass();

    /**
     * Get Project Type. Type of the project
     */
    int getProjectTypeId();

    /**
     * Get Manual Actual. Manually entered actual value
     */
    BigDecimal getManualActual();

    /**
     * Get Measure Data Type. Type of data - Status or in Time
     */
    String getMeasureDataType();

    /**
     * Get Measure Type. Determines how the actual performance is derived
     */
    String getMeasureType();

    /**
     * Get Measure Calculation. Calculation method for measuring performance
     */
    int getMeasureCalcId();

    /**
     * Get Measure. Concrete Performance Measurement
     */
    int getMeasureId();

    /**
     * Get Ratio. Performance Ratio
     */
    int getRatioId();

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getRequestTypeId();

}
