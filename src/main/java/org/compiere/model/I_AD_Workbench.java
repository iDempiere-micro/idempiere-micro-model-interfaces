package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Workbench
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Workbench {

    /**
     * TableName=AD_Workbench
     */
    String Table_Name = "AD_Workbench";

    /**
     * AD_Table_ID=468
     */
    int Table_ID = 468;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Color_ID
     */
    String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Image_ID
     */
    String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Workbench_ID
     */
    String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
    /**
     * Column name AD_Workbench_UU
     */
    String COLUMNNAME_AD_Workbench_UU = "AD_Workbench_UU";
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
     * Get System Color. Color for backgrounds or indicators
     */
    String getAD_Color_ID();

    /**
     * Set System Color. Color for backgrounds or indicators
     */
    void setAD_Color_ID(String AD_Color_ID);

    /**
     * Get Column. Column in the table
     */
    int getAD_Column_ID();

    /**
     * Set Column. Column in the table
     */
    void setAD_Column_ID(int AD_Column_ID);

    I_AD_Column getAD_Column() throws RuntimeException;

    /**
     * Get Image. Image or Icon
     */
    int getAD_Image_ID();

    /**
     * Set Image. Image or Icon
     */
    void setAD_Image_ID(int AD_Image_ID);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Workbench. Collection of windows, reports
     */
    int getAD_Workbench_ID();

    /**
     * Set Workbench. Collection of windows, reports
     */
    void setAD_Workbench_ID(int AD_Workbench_ID);

    /**
     * Get AD_Workbench_UU
     */
    String getAD_Workbench_UU();

    /**
     * Set AD_Workbench_UU
     */
    void setAD_Workbench_UU(String AD_Workbench_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
