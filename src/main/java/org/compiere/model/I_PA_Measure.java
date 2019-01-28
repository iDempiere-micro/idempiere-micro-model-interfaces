package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Measure
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Measure {

  /** TableName=PA_Measure */
  String Table_Name = "PA_Measure";

  /** AD_Table_ID=441 */
  int Table_ID = 441;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name CalculationClass */
  String COLUMNNAME_CalculationClass = "CalculationClass";
  /** Column name C_ProjectType_ID */
  String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name ManualActual */
  String COLUMNNAME_ManualActual = "ManualActual";
  /** Column name ManualNote */
  String COLUMNNAME_ManualNote = "ManualNote";
  /** Column name MeasureDataType */
  String COLUMNNAME_MeasureDataType = "MeasureDataType";
  /** Column name MeasureType */
  String COLUMNNAME_MeasureType = "MeasureType";
  /** Column name PA_Benchmark_ID */
  String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
  /** Column name PA_Hierarchy_ID */
  String COLUMNNAME_PA_Hierarchy_ID = "PA_Hierarchy_ID";
  /** Column name PA_MeasureCalc_ID */
  String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
  /** Column name PA_Measure_ID */
  String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
  /** Column name PA_Measure_UU */
  String COLUMNNAME_PA_Measure_UU = "PA_Measure_UU";
  /** Column name PA_Ratio_ID */
  String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
  /** Column name R_RequestType_ID */
  String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";

    /** Get Calculation Class. Java Class for calculation, implementing Interface Measure */
  String getCalculationClass();

    /** Get Project Type. Type of the project */
  int getC_ProjectType_ID();

    /** Get Manual Actual. Manually entered actual value */
  BigDecimal getManualActual();

    /** Get Measure Data Type. Type of data - Status or in Time */
  String getMeasureDataType();

    /** Get Measure Type. Determines how the actual performance is derived */
  String getMeasureType();

    /** Get Benchmark. Performance Benchmark */
  int getPA_Benchmark_ID();

    /**
   * Get Reporting Hierarchy. Optional Reporting Hierarchy - If not selected the default hierarchy
   * trees are used.
   */
  int getPA_Hierarchy_ID();

    /** Get Measure Calculation. Calculation method for measuring performance */
  int getPA_MeasureCalc_ID();

    /** Get Measure. Concrete Performance Measurement */
  int getPA_Measure_ID();

    /** Get Ratio. Performance Ratio */
  int getPA_Ratio_ID();

    /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

}
