package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_HouseKeeping
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_HouseKeeping {

    /**
     * TableName=AD_HouseKeeping
     */
    String Table_Name = "AD_HouseKeeping";

    /**
     * AD_Table_ID=53147
     */
    int Table_ID = 53147;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_HouseKeeping_ID
     */
    String COLUMNNAME_AD_HouseKeeping_ID = "AD_HouseKeeping_ID";
    /**
     * Column name AD_HouseKeeping_UU
     */
    String COLUMNNAME_AD_HouseKeeping_UU = "AD_HouseKeeping_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name BackupFolder
     */
    String COLUMNNAME_BackupFolder = "BackupFolder";
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
     * Column name IsExportXMLBackup
     */
    String COLUMNNAME_IsExportXMLBackup = "IsExportXMLBackup";
    /**
     * Column name IsSaveInHistoric
     */
    String COLUMNNAME_IsSaveInHistoric = "IsSaveInHistoric";
    /**
     * Column name LastDeleted
     */
    String COLUMNNAME_LastDeleted = "LastDeleted";
    /**
     * Column name LastRun
     */
    String COLUMNNAME_LastRun = "LastRun";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get House Keeping Configuration
     */
    int getAD_HouseKeeping_ID();

    /**
     * Set House Keeping Configuration
     */
    void setAD_HouseKeeping_ID(int AD_HouseKeeping_ID);

    /**
     * Get AD_HouseKeeping_UU
     */
    String getAD_HouseKeeping_UU();

    /**
     * Set AD_HouseKeeping_UU
     */
    void setAD_HouseKeeping_UU(String AD_HouseKeeping_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Backup Folder. Backup Folder
     */
    String getBackupFolder();

    /**
     * Set Backup Folder. Backup Folder
     */
    void setBackupFolder(String BackupFolder);

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
     * Set Export XML Backup
     */
    void setIsExportXMLBackup(boolean IsExportXMLBackup);

    /**
     * Get Export XML Backup
     */
    boolean isExportXMLBackup();

    /**
     * Set Save In Historic
     */
    void setIsSaveInHistoric(boolean IsSaveInHistoric);

    /**
     * Get Save In Historic
     */
    boolean isSaveInHistoric();

    /**
     * Get Last Deleted
     */
    int getLastDeleted();

    /**
     * Set Last Deleted
     */
    void setLastDeleted(int LastDeleted);

    /**
     * Get Last Run
     */
    Timestamp getLastRun();

    /**
     * Set Last Run
     */
    void setLastRun(Timestamp LastRun);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

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

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

    /**
     * Set Sql WHERE. Fully qualified SQL WHERE clause
     */
    void setWhereClause(String WhereClause);
}
