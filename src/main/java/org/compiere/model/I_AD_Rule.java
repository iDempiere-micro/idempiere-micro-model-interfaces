package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Rule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Rule {

    /**
     * TableName=AD_Rule
     */
    String Table_Name = "AD_Rule";

    /**
     * AD_Table_ID=53058
     */
    int Table_ID = 53058;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AccessLevel
     */
    String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Rule_ID
     */
    String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name AD_Rule_UU
     */
    String COLUMNNAME_AD_Rule_UU = "AD_Rule_UU";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name EventType
     */
    String COLUMNNAME_EventType = "EventType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name RuleType
     */
    String COLUMNNAME_RuleType = "RuleType";
    /**
     * Column name Script
     */
    String COLUMNNAME_Script = "Script";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Data Access Level. Access Level required
     */
    String getRuleAccessLevel();

    /**
     * Set Data Access Level. Access Level required
     */
    void setRuleAccessLevel(String AccessLevel);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Rule
     */
    int getAD_Rule_ID();

    /**
     * Set Rule
     */
    void setAD_Rule_ID(int AD_Rule_ID);

    /**
     * Get AD_Rule_UU
     */
    String getAD_Rule_UU();

    /**
     * Set AD_Rule_UU
     */
    void setAD_Rule_UU(String AD_Rule_UU);

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Event Type. Type of Event
     */
    String getEventType();

    /**
     * Set Event Type. Type of Event
     */
    void setEventType(String EventType);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Rule Type
     */
    String getRuleType();

    /**
     * Set Rule Type
     */
    void setRuleType(String RuleType);

    /**
     * Get Script. Dynamic Java Language Script to calculate result
     */
    String getScript();

    /**
     * Set Script. Dynamic Java Language Script to calculate result
     */
    void setScript(String Script);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
