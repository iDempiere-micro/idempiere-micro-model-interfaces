package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserPreference
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserPreference {

    /**
     * TableName=AD_UserPreference
     */
    String Table_Name = "AD_UserPreference";

    /**
     * AD_Table_ID=200174
     */
    int Table_ID = 200174;

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
     * Column name AD_UserPreference_ID
     */
    String COLUMNNAME_AD_UserPreference_ID = "AD_UserPreference_ID";
    /**
     * Column name AD_UserPreference_UU
     */
    String COLUMNNAME_AD_UserPreference_UU = "AD_UserPreference_UU";
    /**
     * Column name AutoCommit
     */
    String COLUMNNAME_AutoCommit = "AutoCommit";
    /**
     * Column name AutomaticDecimalPlacesForAmoun
     */
    String COLUMNNAME_AutomaticDecimalPlacesForAmoun =
            "AutomaticDecimalPlacesForAmoun";
    /**
     * Column name AutoNew
     */
    String COLUMNNAME_AutoNew = "AutoNew";
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
     * Column name IsDetailedZoomAcross
     */
    String COLUMNNAME_IsDetailedZoomAcross = "IsDetailedZoomAcross";
    /**
     * Column name ToggleOnDoubleClick
     */
    String COLUMNNAME_ToggleOnDoubleClick = "ToggleOnDoubleClick";
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
     * Get AD_UserPreference_ID
     */
    int getAD_UserPreference_ID();

    /**
     * Set AD_UserPreference_ID
     */
    void setAD_UserPreference_ID(int AD_UserPreference_ID);

    /**
     * Get AD_UserPreference_UU
     */
    String getAD_UserPreference_UU();

    /**
     * Set AD_UserPreference_UU
     */
    void setAD_UserPreference_UU(String AD_UserPreference_UU);

    /**
     * Get Automatic Commit
     */
    boolean isAutoCommit();

    /**
     * Set Automatic Commit
     */
    void setAutoCommit(boolean AutoCommit);

    /**
     * Get Automatic Decimal Places For Amounts. Automatically insert a decimal point
     */
    int getAutomaticDecimalPlacesForAmoun();

    /**
     * Set Automatic Decimal Places For Amounts. Automatically insert a decimal point
     */
    void setAutomaticDecimalPlacesForAmoun(int AutomaticDecimalPlacesForAmoun);

    /**
     * Get Automatic New Record
     */
    boolean isAutoNew();

    /**
     * Set Automatic New Record
     */
    void setAutoNew(boolean AutoNew);

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
     * Set Detailed Zoom Across
     */
    void setIsDetailedZoomAcross(boolean IsDetailedZoomAcross);

    /**
     * Get Detailed Zoom Across
     */
    boolean isDetailedZoomAcross();

    /**
     * Get Toggle on Double Click. Defines if double click in a field on grid mode switch to form view
     */
    boolean isToggleOnDoubleClick();

    /**
     * Set Toggle on Double Click. Defines if double click in a field on grid mode switch to form view
     */
    void setToggleOnDoubleClick(boolean ToggleOnDoubleClick);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
