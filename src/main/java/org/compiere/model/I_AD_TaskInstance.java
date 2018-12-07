package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TaskInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TaskInstance {

    /**
     * TableName=AD_TaskInstance
     */
    String Table_Name = "AD_TaskInstance";

    /**
     * AD_Table_ID=125
     */
    int Table_ID = 125;

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
     * Column name AD_Task_ID
     */
    String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
    /**
     * Column name AD_TaskInstance_ID
     */
    String COLUMNNAME_AD_TaskInstance_ID = "AD_TaskInstance_ID";
    /**
     * Column name AD_TaskInstance_UU
     */
    String COLUMNNAME_AD_TaskInstance_UU = "AD_TaskInstance_UU";
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
     * Get OS Task. Operation System Task
     */
    int getAD_Task_ID();

    /**
     * Set OS Task. Operation System Task
     */
    void setAD_Task_ID(int AD_Task_ID);

    /**
     * Get Task Instance
     */
    int getAD_TaskInstance_ID();

    /**
     * Set Task Instance
     */
    void setAD_TaskInstance_ID(int AD_TaskInstance_ID);

    /**
     * Get AD_TaskInstance_UU
     */
    String getAD_TaskInstance_UU();

    /**
     * Set AD_TaskInstance_UU
     */
    void setAD_TaskInstance_UU(String AD_TaskInstance_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
