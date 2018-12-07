package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Alert
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Alert {

    /**
     * TableName=AD_Alert
     */
    String Table_Name = "AD_Alert";

    /**
     * AD_Table_ID=594
     */
    int Table_ID = 594;

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
     * Column name AD_AlertProcessor_ID
     */
    String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
    /**
     * Column name AD_Alert_UU
     */
    String COLUMNNAME_AD_Alert_UU = "AD_Alert_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AlertMessage
     */
    String COLUMNNAME_AlertMessage = "AlertMessage";
    /**
     * Column name AlertSubject
     */
    String COLUMNNAME_AlertSubject = "AlertSubject";
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
     * Column name EnforceClientSecurity
     */
    String COLUMNNAME_EnforceClientSecurity = "EnforceClientSecurity";
    /**
     * Column name EnforceRoleSecurity
     */
    String COLUMNNAME_EnforceRoleSecurity = "EnforceRoleSecurity";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
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

    /**
     * Get Alert Processor. Alert Processor/Server Parameter
     */
    int getAD_AlertProcessor_ID();

    /**
     * Set Alert Processor. Alert Processor/Server Parameter
     */
    void setAD_AlertProcessor_ID(int AD_AlertProcessor_ID);

    I_AD_AlertProcessor getAD_AlertProcessor() throws RuntimeException;

    /**
     * Get AD_Alert_UU
     */
    String getAD_Alert_UU();

    /**
     * Set AD_Alert_UU
     */
    void setAD_Alert_UU(String AD_Alert_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Alert Message. Message of the Alert
     */
    String getAlertMessage();

    /**
     * Set Alert Message. Message of the Alert
     */
    void setAlertMessage(String AlertMessage);

    /**
     * Get Alert Subject. Subject of the Alert
     */
    String getAlertSubject();

    /**
     * Set Alert Subject. Subject of the Alert
     */
    void setAlertSubject(String AlertSubject);

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
     * Get Enforce Client Security. Send alerts to recipient only if the client security rules of the
     * role allows
     */
    boolean isEnforceClientSecurity();

    /**
     * Set Enforce Client Security. Send alerts to recipient only if the client security rules of the
     * role allows
     */
    void setEnforceClientSecurity(boolean EnforceClientSecurity);

    /**
     * Get Enforce Role Security. Send alerts to recipient only if the data security rules of the role
     * allows
     */
    boolean isEnforceRoleSecurity();

    /**
     * Set Enforce Role Security. Send alerts to recipient only if the data security rules of the role
     * allows
     */
    void setEnforceRoleSecurity(boolean EnforceRoleSecurity);

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
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

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
