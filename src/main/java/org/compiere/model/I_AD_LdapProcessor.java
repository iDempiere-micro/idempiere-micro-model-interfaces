package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_LdapProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_LdapProcessor {

    /**
     * TableName=AD_LdapProcessor
     */
    String Table_Name = "AD_LdapProcessor";

    /**
     * AD_Table_ID=902
     */
    int Table_ID = 902;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_LdapProcessor_ID
     */
    String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
    /**
     * Column name AD_LdapProcessor_UU
     */
    String COLUMNNAME_AD_LdapProcessor_UU = "AD_LdapProcessor_UU";
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
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name DateNextRun
     */
    String COLUMNNAME_DateNextRun = "DateNextRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name KeepLogDays
     */
    String COLUMNNAME_KeepLogDays = "KeepLogDays";
    /**
     * Column name LdapPort
     */
    String COLUMNNAME_LdapPort = "LdapPort";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Ldap Processor. LDAP Server to authenticate and authorize external systems based on
     * iDempiere
     */
    int getAD_LdapProcessor_ID();

    /**
     * Set Ldap Processor. LDAP Server to authenticate and authorize external systems based on
     * iDempiere
     */
    void setAD_LdapProcessor_ID(int AD_LdapProcessor_ID);

    /**
     * Get AD_LdapProcessor_UU
     */
    String getAD_LdapProcessor_UU();

    /**
     * Set AD_LdapProcessor_UU
     */
    void setAD_LdapProcessor_UU(String AD_LdapProcessor_UU);

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
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

    /**
     * Get Date next run. Date the process will run next
     */
    Timestamp getDateNextRun();

    /**
     * Set Date next run. Date the process will run next
     */
    void setDateNextRun(Timestamp DateNextRun);

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
     * Get Days to keep Log. Number of days to keep the log entries
     */
    int getKeepLogDays();

    /**
     * Set Days to keep Log. Number of days to keep the log entries
     */
    void setKeepLogDays(int KeepLogDays);

    /**
     * Get Ldap Port. The port the server is listening
     */
    int getLdapPort();

    /**
     * Set Ldap Port. The port the server is listening
     */
    void setLdapPort(int LdapPort);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisor_ID();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisor_ID(int Supervisor_ID);

    I_AD_User getSupervisor() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
