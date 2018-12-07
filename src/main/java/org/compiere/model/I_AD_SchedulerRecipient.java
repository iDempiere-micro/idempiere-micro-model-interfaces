package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_SchedulerRecipient
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_SchedulerRecipient {

    /**
     * TableName=AD_SchedulerRecipient
     */
    String Table_Name = "AD_SchedulerRecipient";

    /**
     * AD_Table_ID=704
     */
    int Table_ID = 704;

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
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Scheduler_ID
     */
    String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
    /**
     * Column name AD_SchedulerRecipient_ID
     */
    String COLUMNNAME_AD_SchedulerRecipient_ID = "AD_SchedulerRecipient_ID";
    /**
     * Column name AD_SchedulerRecipient_UU
     */
    String COLUMNNAME_AD_SchedulerRecipient_UU = "AD_SchedulerRecipient_UU";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get Scheduler. Schedule Processes
     */
    int getAD_Scheduler_ID();

    /**
     * Set Scheduler. Schedule Processes
     */
    void setAD_Scheduler_ID(int AD_Scheduler_ID);

    I_AD_Scheduler getAD_Scheduler() throws RuntimeException;

    /**
     * Get Scheduler Recipient. Recipient of the Scheduler Notification
     */
    int getAD_SchedulerRecipient_ID();

    /**
     * Set Scheduler Recipient. Recipient of the Scheduler Notification
     */
    void setAD_SchedulerRecipient_ID(int AD_SchedulerRecipient_ID);

    /**
     * Get AD_SchedulerRecipient_UU
     */
    String getAD_SchedulerRecipient_UU();

    /**
     * Set AD_SchedulerRecipient_UU
     */
    void setAD_SchedulerRecipient_UU(String AD_SchedulerRecipient_UU);

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
