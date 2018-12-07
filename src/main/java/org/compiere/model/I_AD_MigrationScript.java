package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_MigrationScript
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_MigrationScript {

    /**
     * TableName=AD_MigrationScript
     */
    String Table_Name = "AD_MigrationScript";

    /**
     * AD_Table_ID=53064
     */
    int Table_ID = 53064;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_MigrationScript_ID
     */
    String COLUMNNAME_AD_MigrationScript_ID = "AD_MigrationScript_ID";
    /**
     * Column name AD_MigrationScript_UU
     */
    String COLUMNNAME_AD_MigrationScript_UU = "AD_MigrationScript_UU";
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
     * Column name DeveloperName
     */
    String COLUMNNAME_DeveloperName = "DeveloperName";
    /**
     * Column name FileName
     */
    String COLUMNNAME_FileName = "FileName";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name isApply
     */
    String COLUMNNAME_isApply = "isApply";
    /**
     * Column name ProjectName
     */
    String COLUMNNAME_ProjectName = "ProjectName";
    /**
     * Column name Reference
     */
    String COLUMNNAME_Reference = "Reference";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name Script
     */
    String COLUMNNAME_Script = "Script";
    /**
     * Column name ScriptRoll
     */
    String COLUMNNAME_ScriptRoll = "ScriptRoll";
    /**
     * Column name Status
     */
    String COLUMNNAME_Status = "Status";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";

    /**
     * Get Migration Script. Table to check whether the migration script has been applied
     */
    int getAD_MigrationScript_ID();

    /**
     * Set Migration Script. Table to check whether the migration script has been applied
     */
    void setAD_MigrationScript_ID(int AD_MigrationScript_ID);

    /**
     * Get AD_MigrationScript_UU
     */
    String getAD_MigrationScript_UU();

    /**
     * Set AD_MigrationScript_UU
     */
    void setAD_MigrationScript_UU(String AD_MigrationScript_UU);

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
     * Get Developer Name
     */
    String getDeveloperName();

    /**
     * Set Developer Name
     */
    void setDeveloperName(String DeveloperName);

    /**
     * Get File Name. Name of the local file or URL
     */
    String getFileName();

    /**
     * Set File Name. Name of the local file or URL
     */
    void setFileName(String FileName);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Apply Script
     */
    void setisApply(boolean isApply);

    /**
     * Get Apply Script
     */
    boolean isApply();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Project. Name of the Project
     */
    String getProjectName();

    /**
     * Set Project. Name of the Project
     */
    void setProjectName(String ProjectName);

    /**
     * Get Reference. Reference for this record
     */
    String getReference();

    /**
     * Set Reference. Reference for this record
     */
    void setReference(String Reference);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get Script. Dynamic Java Language Script to calculate result
     */
    byte[] getScript();

    /**
     * Set Script. Dynamic Java Language Script to calculate result
     */
    void setScript(byte[] Script);

    /**
     * Get Roll the Script
     */
    String getScriptRoll();

    /**
     * Set Roll the Script
     */
    void setScriptRoll(String ScriptRoll);

    /**
     * Get Status. Status of the currently running check
     */
    String getStatus();

    /**
     * Set Status. Status of the currently running check
     */
    void setStatus(String Status);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get URL. Full URL address - e.g. http://www.idempiere.org
     */
    String getURL();

    /**
     * Set URL. Full URL address - e.g. http://www.idempiere.org
     */
    void setURL(String URL);
}
