package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WizardProcess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WizardProcess {

    /**
     * TableName=AD_WizardProcess
     */
    String Table_Name = "AD_WizardProcess";

    /**
     * AD_Table_ID=200012
     */
    int Table_ID = 200012;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

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
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WizardProcess_ID
     */
    String COLUMNNAME_AD_WizardProcess_ID = "AD_WizardProcess_ID";
    /**
     * Column name AD_WizardProcess_UU
     */
    String COLUMNNAME_AD_WizardProcess_UU = "AD_WizardProcess_UU";
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
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WizardStatus
     */
    String COLUMNNAME_WizardStatus = "WizardStatus";

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
     * Get Node. Workflow Node (activity), step or process
     */
    int getAD_WF_Node_ID();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setAD_WF_Node_ID(int AD_WF_Node_ID);

    I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

    /**
     * Get Wizard Process
     */
    int getAD_WizardProcess_ID();

    /**
     * Set Wizard Process
     */
    void setAD_WizardProcess_ID(int AD_WizardProcess_ID);

    /**
     * Get AD_WizardProcess_UU
     */
    String getAD_WizardProcess_UU();

    /**
     * Set AD_WizardProcess_UU
     */
    void setAD_WizardProcess_UU(String AD_WizardProcess_UU);

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
     * Get Note. Optional additional user defined information
     */
    String getNote();

    /**
     * Set Note. Optional additional user defined information
     */
    void setNote(String Note);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Wizard Status
     */
    String getWizardStatus();

    /**
     * Set Wizard Status
     */
    void setWizardStatus(String WizardStatus);
}
