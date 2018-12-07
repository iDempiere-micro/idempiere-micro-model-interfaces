package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CycleStep
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CycleStep {

    /**
     * TableName=C_CycleStep
     */
    String Table_Name = "C_CycleStep";

    /**
     * AD_Table_ID=590
     */
    int Table_ID = 590;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Cycle_ID
     */
    String COLUMNNAME_C_Cycle_ID = "C_Cycle_ID";
    /**
     * Column name C_CycleStep_ID
     */
    String COLUMNNAME_C_CycleStep_ID = "C_CycleStep_ID";
    /**
     * Column name C_CycleStep_UU
     */
    String COLUMNNAME_C_CycleStep_UU = "C_CycleStep_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Project Cycle. Identifier for this Project Reporting Cycle
     */
    int getC_Cycle_ID();

    /**
     * Set Project Cycle. Identifier for this Project Reporting Cycle
     */
    void setC_Cycle_ID(int C_Cycle_ID);

    I_C_Cycle getC_Cycle() throws RuntimeException;

    /**
     * Get Cycle Step. The step for this Cycle
     */
    int getC_CycleStep_ID();

    /**
     * Set Cycle Step. The step for this Cycle
     */
    void setC_CycleStep_ID(int C_CycleStep_ID);

    /**
     * Get C_CycleStep_UU
     */
    String getC_CycleStep_UU();

    /**
     * Set C_CycleStep_UU
     */
    void setC_CycleStep_UU(String C_CycleStep_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
