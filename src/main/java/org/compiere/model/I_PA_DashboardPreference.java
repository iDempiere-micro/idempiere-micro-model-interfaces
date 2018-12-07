package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_DashboardPreference
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_DashboardPreference {

    /**
     * TableName=PA_DashboardPreference
     */
    String Table_Name = "PA_DashboardPreference";

    /**
     * AD_Table_ID=200013
     */
    int Table_ID = 200013;

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
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name ColumnNo
     */
    String COLUMNNAME_ColumnNo = "ColumnNo";
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
     * Column name IsCollapsedByDefault
     */
    String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";
    /**
     * Column name IsShowInDashboard
     */
    String COLUMNNAME_IsShowInDashboard = "IsShowInDashboard";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name PA_DashboardContent_ID
     */
    String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";
    /**
     * Column name PA_DashboardPreference_ID
     */
    String COLUMNNAME_PA_DashboardPreference_ID = "PA_DashboardPreference_ID";
    /**
     * Column name PA_DashboardPreference_UU
     */
    String COLUMNNAME_PA_DashboardPreference_UU = "PA_DashboardPreference_UU";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Column No. Dashboard content column number
     */
    int getColumnNo();

    /**
     * Set Column No. Dashboard content column number
     */
    void setColumnNo(int ColumnNo);

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
     * Set Collapsed By Default. Flag to set the initial state of collapsible field group.
     */
    void setIsCollapsedByDefault(boolean IsCollapsedByDefault);

    /**
     * Get Collapsed By Default. Flag to set the initial state of collapsible field group.
     */
    boolean isCollapsedByDefault();

    /**
     * Set Show in Dashboard. Show the dashlet in the dashboard
     */
    void setIsShowInDashboard(boolean IsShowInDashboard);

    /**
     * Get Show in Dashboard. Show the dashlet in the dashboard
     */
    boolean isShowInDashboard();

    /**
     * Get Line No. Unique line for this document
     */
    BigDecimal getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(BigDecimal Line);

    /**
     * Get Dashboard Content
     */
    int getPA_DashboardContent_ID();

    /**
     * Set Dashboard Content
     */
    void setPA_DashboardContent_ID(int PA_DashboardContent_ID);

    I_PA_DashboardContent getPA_DashboardContent() throws RuntimeException;

    /**
     * Get Dashboard Preference
     */
    int getPA_DashboardPreference_ID();

    /**
     * Set Dashboard Preference
     */
    void setPA_DashboardPreference_ID(int PA_DashboardPreference_ID);

    /**
     * Get PA_DashboardPreference_UU
     */
    String getPA_DashboardPreference_UU();

    /**
     * Set PA_DashboardPreference_UU
     */
    void setPA_DashboardPreference_UU(String PA_DashboardPreference_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
