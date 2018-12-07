package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AlertRecipient
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AlertRecipient {

    /**
     * TableName=AD_AlertRecipient
     */
    String Table_Name = "AD_AlertRecipient";

    /**
     * AD_Table_ID=592
     */
    int Table_ID = 592;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Alert_ID
     */
    String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";
    /**
     * Column name AD_AlertRecipient_ID
     */
    String COLUMNNAME_AD_AlertRecipient_ID = "AD_AlertRecipient_ID";
    /**
     * Column name AD_AlertRecipient_UU
     */
    String COLUMNNAME_AD_AlertRecipient_UU = "AD_AlertRecipient_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
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
     * Get Alert. iDempiere Alert
     */
    int getAD_Alert_ID();

    /**
     * Set Alert. iDempiere Alert
     */
    void setAD_Alert_ID(int AD_Alert_ID);

    I_AD_Alert getAD_Alert() throws RuntimeException;

    /**
     * Get Alert Recipient. Recipient of the Alert Notification
     */
    int getAD_AlertRecipient_ID();

    /**
     * Set Alert Recipient. Recipient of the Alert Notification
     */
    void setAD_AlertRecipient_ID(int AD_AlertRecipient_ID);

    /**
     * Get AD_AlertRecipient_UU
     */
    String getAD_AlertRecipient_UU();

    /**
     * Set AD_AlertRecipient_UU
     */
    void setAD_AlertRecipient_UU(String AD_AlertRecipient_UU);

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
