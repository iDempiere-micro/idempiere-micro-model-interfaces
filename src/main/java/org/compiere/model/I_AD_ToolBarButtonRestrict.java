package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ToolBarButtonRestrict
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ToolBarButtonRestrict {

    /**
     * TableName=AD_ToolBarButtonRestrict
     */
    String Table_Name = "AD_ToolBarButtonRestrict";

    /**
     * AD_Table_ID=200004
     */
    int Table_ID = 200004;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name Action
     */
    String COLUMNNAME_Action = "Action";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Tab_ID
     */
    String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
    /**
     * Column name AD_ToolBarButton_ID
     */
    String COLUMNNAME_AD_ToolBarButton_ID = "AD_ToolBarButton_ID";
    /**
     * Column name AD_ToolBarButtonRestrict_ID
     */
    String COLUMNNAME_AD_ToolBarButtonRestrict_ID = "AD_ToolBarButtonRestrict_ID";
    /**
     * Column name AD_ToolBarButtonRestrict_UU
     */
    String COLUMNNAME_AD_ToolBarButtonRestrict_UU = "AD_ToolBarButtonRestrict_UU";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
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
     * Column name IsExclude
     */
    String COLUMNNAME_IsExclude = "IsExclude";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Action. Indicates the Action to be performed
     */
    String getAction();

    /**
     * Set Action. Indicates the Action to be performed
     */
    void setAction(String Action);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

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
     * Get Tab. Tab within a Window
     */
    int getAD_Tab_ID();

    /**
     * Set Tab. Tab within a Window
     */
    void setAD_Tab_ID(int AD_Tab_ID);

    I_AD_Tab getAD_Tab() throws RuntimeException;

    /**
     * Get ToolBar Button
     */
    int getAD_ToolBarButton_ID();

    /**
     * Set ToolBar Button
     */
    void setAD_ToolBarButton_ID(int AD_ToolBarButton_ID);

    I_AD_ToolBarButton getAD_ToolBarButton() throws RuntimeException;

    /**
     * Get ToolBar Button Restrict
     */
    int getAD_ToolBarButtonRestrict_ID();

    /**
     * Set ToolBar Button Restrict
     */
    void setAD_ToolBarButtonRestrict_ID(int AD_ToolBarButtonRestrict_ID);

    /**
     * Get AD_ToolBarButtonRestrict_UU
     */
    String getAD_ToolBarButtonRestrict_UU();

    /**
     * Set AD_ToolBarButtonRestrict_UU
     */
    void setAD_ToolBarButtonRestrict_UU(String AD_ToolBarButtonRestrict_UU);

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

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
     * Set Exclude. Exclude access to the data - if not selected Include access to the data
     */
    void setIsExclude(boolean IsExclude);

    /**
     * Get Exclude. Exclude access to the data - if not selected Include access to the data
     */
    boolean isExclude();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
