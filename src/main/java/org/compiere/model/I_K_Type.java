package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Type {

    /**
     * TableName=K_Type
     */
    String Table_Name = "K_Type";

    /**
     * AD_Table_ID=606
     */
    int Table_ID = 606;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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
     * Column name IsPublic
     */
    String COLUMNNAME_IsPublic = "IsPublic";
    /**
     * Column name IsPublicWrite
     */
    String COLUMNNAME_IsPublicWrite = "IsPublicWrite";
    /**
     * Column name K_Type_ID
     */
    String COLUMNNAME_K_Type_ID = "K_Type_ID";
    /**
     * Column name K_Type_UU
     */
    String COLUMNNAME_K_Type_UU = "K_Type_UU";
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
     * Set Public. Public can read entry
     */
    void setIsPublic(boolean IsPublic);

    /**
     * Get Public. Public can read entry
     */
    boolean isPublic();

    /**
     * Set Public Write. Public can write entries
     */
    void setIsPublicWrite(boolean IsPublicWrite);

    /**
     * Get Public Write. Public can write entries
     */
    boolean isPublicWrite();

    /**
     * Get Knowledge Type. Knowledge Type
     */
    int getK_Type_ID();

    /**
     * Set Knowledge Type. Knowledge Type
     */
    void setK_Type_ID(int K_Type_ID);

    /**
     * Get K_Type_UU
     */
    String getK_Type_UU();

    /**
     * Set K_Type_UU
     */
    void setK_Type_UU(String K_Type_UU);

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
