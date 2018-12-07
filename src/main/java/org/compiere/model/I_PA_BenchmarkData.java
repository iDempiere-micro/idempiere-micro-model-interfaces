package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_BenchmarkData
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_BenchmarkData {

    /**
     * TableName=PA_BenchmarkData
     */
    String Table_Name = "PA_BenchmarkData";

    /**
     * AD_Table_ID=834
     */
    int Table_ID = 834;

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
     * Column name BenchmarkDate
     */
    String COLUMNNAME_BenchmarkDate = "BenchmarkDate";
    /**
     * Column name BenchmarkValue
     */
    String COLUMNNAME_BenchmarkValue = "BenchmarkValue";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PA_BenchmarkData_ID
     */
    String COLUMNNAME_PA_BenchmarkData_ID = "PA_BenchmarkData_ID";
    /**
     * Column name PA_BenchmarkData_UU
     */
    String COLUMNNAME_PA_BenchmarkData_UU = "PA_BenchmarkData_UU";
    /**
     * Column name PA_Benchmark_ID
     */
    String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
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
     * Get Date. Benchmark Date
     */
    Timestamp getBenchmarkDate();

    /**
     * Set Date. Benchmark Date
     */
    void setBenchmarkDate(Timestamp BenchmarkDate);

    /**
     * Get Value. Benchmark Value
     */
    BigDecimal getBenchmarkValue();

    /**
     * Set Value. Benchmark Value
     */
    void setBenchmarkValue(BigDecimal BenchmarkValue);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Benchmark Data. Performance Benchmark Data Point
     */
    int getPA_BenchmarkData_ID();

    /**
     * Set Benchmark Data. Performance Benchmark Data Point
     */
    void setPA_BenchmarkData_ID(int PA_BenchmarkData_ID);

    /**
     * Get PA_BenchmarkData_UU
     */
    String getPA_BenchmarkData_UU();

    /**
     * Set PA_BenchmarkData_UU
     */
    void setPA_BenchmarkData_UU(String PA_BenchmarkData_UU);

    /**
     * Get Benchmark. Performance Benchmark
     */
    int getPA_Benchmark_ID();

    /**
     * Set Benchmark. Performance Benchmark
     */
    void setPA_Benchmark_ID(int PA_Benchmark_ID);

    I_PA_Benchmark getPA_Benchmark() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
