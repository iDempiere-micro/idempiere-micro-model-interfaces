package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_Block
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Block {

    /**
     * TableName=AD_WF_Block
     */
    String Table_Name = "AD_WF_Block";

    /**
     * AD_Table_ID=647
     */
    int Table_ID = 647;

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
     * Column name AD_WF_Block_ID
     */
    String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
    /**
     * Column name AD_WF_Block_UU
     */
    String COLUMNNAME_AD_WF_Block_UU = "AD_WF_Block_UU";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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
     * Get Workflow Block. Workflow Transaction Execution Block
     */
    int getAD_WF_Block_ID();

    /**
     * Set Workflow Block. Workflow Transaction Execution Block
     */
    void setAD_WF_Block_ID(int AD_WF_Block_ID);

    /**
     * Get AD_WF_Block_UU
     */
    String getAD_WF_Block_UU();

    /**
     * Set AD_WF_Block_UU
     */
    void setAD_WF_Block_UU(String AD_WF_Block_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
