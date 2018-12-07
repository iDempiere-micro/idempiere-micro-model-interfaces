package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Benchmark
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Benchmark {

    /**
     * TableName=PA_Benchmark
     */
    String Table_Name = "PA_Benchmark";

    /**
     * AD_Table_ID=833
     */
    int Table_ID = 833;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AccumulationType
     */
    String COLUMNNAME_AccumulationType = "AccumulationType";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PA_Benchmark_ID
     */
    String COLUMNNAME_PA_Benchmark_ID = "PA_Benchmark_ID";
    /**
     * Column name PA_Benchmark_UU
     */
    String COLUMNNAME_PA_Benchmark_UU = "PA_Benchmark_UU";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Accumulation Type. How to accumulate data on time axis
     */
    String getAccumulationType();

    /**
     * Set Accumulation Type. How to accumulate data on time axis
     */
    void setAccumulationType(String AccumulationType);

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

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
     * Get Benchmark. Performance Benchmark
     */
    int getPA_Benchmark_ID();

    /**
     * Set Benchmark. Performance Benchmark
     */
    void setPA_Benchmark_ID(int PA_Benchmark_ID);

    /**
     * Get PA_Benchmark_UU
     */
    String getPA_Benchmark_UU();

    /**
     * Set PA_Benchmark_UU
     */
    void setPA_Benchmark_UU(String PA_Benchmark_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
