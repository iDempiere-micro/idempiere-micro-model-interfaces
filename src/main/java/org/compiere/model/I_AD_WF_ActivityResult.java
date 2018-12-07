package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_ActivityResult
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_ActivityResult {

    /**
     * TableName=AD_WF_ActivityResult
     */
    String Table_Name = "AD_WF_ActivityResult";

    /**
     * AD_Table_ID=650
     */
    int Table_ID = 650;

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
     * Column name AD_WF_Activity_ID
     */
    String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
    /**
     * Column name AD_WF_ActivityResult_ID
     */
    String COLUMNNAME_AD_WF_ActivityResult_ID = "AD_WF_ActivityResult_ID";
    /**
     * Column name AD_WF_ActivityResult_UU
     */
    String COLUMNNAME_AD_WF_ActivityResult_UU = "AD_WF_ActivityResult_UU";
    /**
     * Column name AttributeName
     */
    String COLUMNNAME_AttributeName = "AttributeName";
    /**
     * Column name AttributeValue
     */
    String COLUMNNAME_AttributeValue = "AttributeValue";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
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
     * Get Workflow Activity. Workflow Activity
     */
    int getAD_WF_Activity_ID();

    /**
     * Set Workflow Activity. Workflow Activity
     */
    void setAD_WF_Activity_ID(int AD_WF_Activity_ID);

    I_AD_WF_Activity getAD_WF_Activity() throws RuntimeException;

    /**
     * Get Workflow Activity Result. Result of the Workflow Process Activity
     */
    int getAD_WF_ActivityResult_ID();

    /**
     * Set Workflow Activity Result. Result of the Workflow Process Activity
     */
    void setAD_WF_ActivityResult_ID(int AD_WF_ActivityResult_ID);

    /**
     * Get AD_WF_ActivityResult_UU
     */
    String getAD_WF_ActivityResult_UU();

    /**
     * Set AD_WF_ActivityResult_UU
     */
    void setAD_WF_ActivityResult_UU(String AD_WF_ActivityResult_UU);

    /**
     * Get Attribute Name. Name of the Attribute
     */
    String getAttributeName();

    /**
     * Set Attribute Name. Name of the Attribute
     */
    void setAttributeName(String AttributeName);

    /**
     * Get Attribute Value. Value of the Attribute
     */
    String getAttributeValue();

    /**
     * Set Attribute Value. Value of the Attribute
     */
    void setAttributeValue(String AttributeValue);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
