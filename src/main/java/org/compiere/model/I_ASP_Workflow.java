package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Workflow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Workflow {

    /**
     * TableName=ASP_Workflow
     */
    String Table_Name = "ASP_Workflow";

    /**
     * AD_Table_ID=53053
     */
    int Table_ID = 53053;

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
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name ASP_Level_ID
     */
    String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";
    /**
     * Column name ASP_Status
     */
    String COLUMNNAME_ASP_Status = "ASP_Status";
    /**
     * Column name ASP_Workflow_ID
     */
    String COLUMNNAME_ASP_Workflow_ID = "ASP_Workflow_ID";
    /**
     * Column name ASP_Workflow_UU
     */
    String COLUMNNAME_ASP_Workflow_UU = "ASP_Workflow_UU";
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
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_Workflow_ID(int AD_Workflow_ID);

    I_AD_Workflow getAD_Workflow() throws RuntimeException;

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
     * Get ASP Workflow
     */
    int getASP_Workflow_ID();

    /**
     * Set ASP Workflow
     */
    void setASP_Workflow_ID(int ASP_Workflow_ID);

    /**
     * Get ASP_Workflow_UU
     */
    String getASP_Workflow_UU();

    /**
     * Set ASP_Workflow_UU
     */
    void setASP_Workflow_UU(String ASP_Workflow_UU);

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
