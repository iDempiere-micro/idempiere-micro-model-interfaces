package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Task
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Task {

    /**
     * TableName=ASP_Task
     */
    String Table_Name = "ASP_Task";

    /**
     * AD_Table_ID=53052
     */
    int Table_ID = 53052;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

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
     * Column name ASP_Level_ID
     */
    String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";
    /**
     * Column name ASP_Status
     */
    String COLUMNNAME_ASP_Status = "ASP_Status";
    /**
     * Column name ASP_Task_ID
     */
    String COLUMNNAME_ASP_Task_ID = "ASP_Task_ID";
    /**
     * Column name ASP_Task_UU
     */
    String COLUMNNAME_ASP_Task_UU = "ASP_Task_UU";
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

    I_AD_Task getAD_Task() throws RuntimeException;

    /**
     * Get ASP Level
     */
    int getASP_Level_ID();

    /**
     * Set ASP Level
     */
    void setASP_Level_ID(int ASP_Level_ID);

    I_ASP_Level getASP_Level() throws RuntimeException;

    /**
     * Get ASP Status
     */
    String getASP_Status();

    /**
     * Set ASP Status
     */
    void setASP_Status(String ASP_Status);

    /**
     * Get ASP Task
     */
    int getASP_Task_ID();

    /**
     * Set ASP Task
     */
    void setASP_Task_ID(int ASP_Task_ID);

    /**
     * Get ASP_Task_UU
     */
    String getASP_Task_UU();

    /**
     * Set ASP_Task_UU
     */
    void setASP_Task_UU(String ASP_Task_UU);

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
