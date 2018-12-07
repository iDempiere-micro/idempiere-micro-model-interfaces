package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueSystem
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueSystem {

    /**
     * TableName=R_IssueSystem
     */
    String Table_Name = "R_IssueSystem";

    /**
     * AD_Table_ID=843
     */
    int Table_ID = 843;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
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
     * Column name DBAddress
     */
    String COLUMNNAME_DBAddress = "DBAddress";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ProfileInfo
     */
    String COLUMNNAME_ProfileInfo = "ProfileInfo";
    /**
     * Column name R_IssueSystem_ID
     */
    String COLUMNNAME_R_IssueSystem_ID = "R_IssueSystem_ID";
    /**
     * Column name R_IssueSystem_UU
     */
    String COLUMNNAME_R_IssueSystem_UU = "R_IssueSystem_UU";
    /**
     * Column name StatisticsInfo
     */
    String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
    /**
     * Column name SystemStatus
     */
    String COLUMNNAME_SystemStatus = "SystemStatus";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

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
     * Get DB Address. JDBC URL of the database server
     */
    String getDBAddress();

    /**
     * Set DB Address. JDBC URL of the database server
     */
    void setDBAddress(String DBAddress);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Profile. Information to help profiling the system for solving support issues
     */
    String getProfileInfo();

    /**
     * Set Profile. Information to help profiling the system for solving support issues
     */
    void setProfileInfo(String ProfileInfo);

    /**
     * Get Issue System. System creating the issue
     */
    int getR_IssueSystem_ID();

    /**
     * Set Issue System. System creating the issue
     */
    void setR_IssueSystem_ID(int R_IssueSystem_ID);

    /**
     * Get R_IssueSystem_UU
     */
    String getR_IssueSystem_UU();

    /**
     * Set R_IssueSystem_UU
     */
    void setR_IssueSystem_UU(String R_IssueSystem_UU);

    /**
     * Get Statistics. Information to help profiling the system for solving support issues
     */
    String getStatisticsInfo();

    /**
     * Set Statistics. Information to help profiling the system for solving support issues
     */
    void setStatisticsInfo(String StatisticsInfo);

    /**
     * Get System Status. Status of the system - Support priority depends on system status
     */
    String getSystemStatus();

    /**
     * Set System Status. Status of the system - Support priority depends on system status
     */
    void setSystemStatus(String SystemStatus);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
