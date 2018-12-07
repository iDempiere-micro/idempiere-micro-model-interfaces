package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WorkbenchWindow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WorkbenchWindow {

    /**
     * TableName=AD_WorkbenchWindow
     */
    String Table_Name = "AD_WorkbenchWindow";

    /**
     * AD_Table_ID=469
     */
    int Table_ID = 469;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Task_ID
     */
    String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Workbench_ID
     */
    String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
    /**
     * Column name AD_WorkbenchWindow_ID
     */
    String COLUMNNAME_AD_WorkbenchWindow_ID = "AD_WorkbenchWindow_ID";
    /**
     * Column name AD_WorkbenchWindow_UU
     */
    String COLUMNNAME_AD_WorkbenchWindow_UU = "AD_WorkbenchWindow_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPrimary
     */
    String COLUMNNAME_IsPrimary = "IsPrimary";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Special Form. Special Form
     */
    int getAD_Form_ID();

    /**
     * Set Special Form. Special Form
     */
    void setAD_Form_ID(int AD_Form_ID);

    I_AD_Form getAD_Form() throws RuntimeException;

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
     * Get OS Task. Operation System Task
     */
    int getAD_Task_ID();

    /**
     * Set OS Task. Operation System Task
     */
    void setAD_Task_ID(int AD_Task_ID);

    I_AD_Task getAD_Task() throws RuntimeException;

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
     * Get Workbench. Collection of windows, reports
     */
    int getAD_Workbench_ID();

    /**
     * Set Workbench. Collection of windows, reports
     */
    void setAD_Workbench_ID(int AD_Workbench_ID);

    I_AD_Workbench getAD_Workbench() throws RuntimeException;

    /**
     * Get Workbench Window
     */
    int getAD_WorkbenchWindow_ID();

    /**
     * Set Workbench Window
     */
    void setAD_WorkbenchWindow_ID(int AD_WorkbenchWindow_ID);

    /**
     * Get AD_WorkbenchWindow_UU
     */
    String getAD_WorkbenchWindow_UU();

    /**
     * Set AD_WorkbenchWindow_UU
     */
    void setAD_WorkbenchWindow_UU(String AD_WorkbenchWindow_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Primary. Indicates if this is the primary budget
     */
    void setIsPrimary(boolean IsPrimary);

    /**
     * Get Primary. Indicates if this is the primary budget
     */
    boolean isPrimary();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
