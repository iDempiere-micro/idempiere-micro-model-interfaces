package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name BackupFolder
     */
    String COLUMNNAME_BackupFolder = "BackupFolder";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
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
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Get Backup Folder. Backup Folder
     */
    String getBackupFolder();

    /**
     * Get Export XML Backup
     */
    boolean isExportXMLBackup();

    /**
     * Get Save In Historic
     */
    boolean isSaveInHistoric();

    /**
     * Set Last Deleted
     */
    void setLastDeleted(int LastDeleted);

    /**
     * Set Last Run
     */
    void setLastRun(Timestamp LastRun);

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

}
