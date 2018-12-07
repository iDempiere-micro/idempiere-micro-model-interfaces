package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_ActivityApprover
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_ActivityApprover {

    /**
     * TableName=AD_WF_ActivityApprover
     */
    String Table_Name = "AD_WF_ActivityApprover";

    /**
     * AD_Table_ID=200226
     */
    int Table_ID = 200226;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_WF_ActivityApprover_ID
     */
    String COLUMNNAME_AD_WF_ActivityApprover_ID = "AD_WF_ActivityApprover_ID";
    /**
     * Column name AD_WF_ActivityApprover_UU
     */
    String COLUMNNAME_AD_WF_ActivityApprover_UU = "AD_WF_ActivityApprover_UU";
    /**
     * Column name AD_WF_Activity_ID
     */
    String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Workflow Activity Approver
     */
    int getAD_WF_ActivityApprover_ID();

    /**
     * Set Workflow Activity Approver
     */
    void setAD_WF_ActivityApprover_ID(int AD_WF_ActivityApprover_ID);

    /**
     * Get AD_WF_ActivityApprover_UU
     */
    String getAD_WF_ActivityApprover_UU();

    /**
     * Set AD_WF_ActivityApprover_UU
     */
    void setAD_WF_ActivityApprover_UU(String AD_WF_ActivityApprover_UU);

    /**
     * Get Workflow Activity. Workflow Activity
     */
    int getAD_WF_Activity_ID();

    /**
     * Set Workflow Activity. Workflow Activity
     */
    void setAD_WF_Activity_ID(int AD_WF_Activity_ID);

    I_AD_WF_Activity getAD_WF_Activity() throws RuntimeException;

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
