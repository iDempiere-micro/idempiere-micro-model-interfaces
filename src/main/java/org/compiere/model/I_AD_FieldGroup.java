package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_FieldGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_FieldGroup {

    /**
     * TableName=AD_FieldGroup
     */
    String Table_Name = "AD_FieldGroup";

    /**
     * AD_Table_ID=414
     */
    int Table_ID = 414;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_FieldGroup_ID
     */
    String COLUMNNAME_AD_FieldGroup_ID = "AD_FieldGroup_ID";
    /**
     * Column name AD_FieldGroup_UU
     */
    String COLUMNNAME_AD_FieldGroup_UU = "AD_FieldGroup_UU";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FieldGroupType
     */
    String COLUMNNAME_FieldGroupType = "FieldGroupType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCollapsedByDefault
     */
    String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Field Group. Logical grouping of fields
     */
    int getAD_FieldGroup_ID();

    /**
     * Set Field Group. Logical grouping of fields
     */
    void setAD_FieldGroup_ID(int AD_FieldGroup_ID);

    /**
     * Get AD_FieldGroup_UU
     */
    String getAD_FieldGroup_UU();

    /**
     * Set AD_FieldGroup_UU
     */
    void setAD_FieldGroup_UU(String AD_FieldGroup_UU);

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Field Group Type
     */
    String getFieldGroupType();

    /**
     * Set Field Group Type
     */
    void setFieldGroupType(String FieldGroupType);

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
