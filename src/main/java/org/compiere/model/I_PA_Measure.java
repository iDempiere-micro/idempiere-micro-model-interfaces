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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CalculationClass */
  String COLUMNNAME_CalculationClass = "CalculationClass";
  /** Column name C_ProjectType_ID */
  String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Calculation Class. Java Class for calculation, implementing Interface Measure */
  String getCalculationClass();

  /** Set Calculation Class. Java Class for calculation, implementing Interface Measure */
  void setCalculationClass(String CalculationClass);

  /** Get Project Type. Type of the project */
  int getC_ProjectType_ID();

  /** Set Project Type. Type of the project */
  void setC_ProjectType_ID(int C_ProjectType_ID);

  I_C_ProjectType getC_ProjectType() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Manual Actual. Manually entered actual value */
  BigDecimal getManualActual();

  /** Set Manual Actual. Manually entered actual value */
  void setManualActual(BigDecimal ManualActual);

  /** Get Note. Note for manual entry */
  String getManualNote();

  /** Set Note. Note for manual entry */
  void setManualNote(String ManualNote);

  /** Get Measure Data Type. Type of data - Status or in Time */
  String getMeasureDataType();

  /** Set Measure Data Type. Type of data - Status or in Time */
  void setMeasureDataType(String MeasureDataType);

  /** Get Measure Type. Determines how the actual performance is derived */
  String getMeasureType();

  /** Set Measure Type. Determines how the actual performance is derived */
  void setMeasureType(String MeasureType);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Benchmark. Performance Benchmark */
  int getPA_Benchmark_ID();

  /** Set Benchmark. Performance Benchmark */
  void setPA_Benchmark_ID(int PA_Benchmark_ID);

  I_PA_Benchmark getPA_Benchmark() throws RuntimeException;

  /**
   * Get Reporting Hierarchy. Optional Reporting Hierarchy - If not selected the default hierarchy
   * trees are used.
   */
  int getPA_Hierarchy_ID();

  /**
   * Set Reporting Hierarchy. Optional Reporting Hierarchy - If not selected the default hierarchy
   * trees are used.
   */
  void setPA_Hierarchy_ID(int PA_Hierarchy_ID);

  I_PA_Hierarchy getPA_Hierarchy() throws RuntimeException;

  /** Get Measure Calculation. Calculation method for measuring performance */
  int getPA_MeasureCalc_ID();

  /** Set Measure Calculation. Calculation method for measuring performance */
  void setPA_MeasureCalc_ID(int PA_MeasureCalc_ID);

  I_PA_MeasureCalc getPA_MeasureCalc() throws RuntimeException;

  /** Get Measure. Concrete Performance Measurement */
  int getPA_Measure_ID();

  /** Set Measure. Concrete Performance Measurement */
  void setPA_Measure_ID(int PA_Measure_ID);

  /** Get PA_Measure_UU */
  String getPA_Measure_UU();

  /** Set PA_Measure_UU */
  void setPA_Measure_UU(String PA_Measure_UU);

  /** Get Ratio. Performance Ratio */
  int getPA_Ratio_ID();

  /** Set Ratio. Performance Ratio */
  void setPA_Ratio_ID(int PA_Ratio_ID);

  I_PA_Ratio getPA_Ratio() throws RuntimeException;

  /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

  /** Set Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  void setR_RequestType_ID(int R_RequestType_ID);

  I_R_RequestType getR_RequestType() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
