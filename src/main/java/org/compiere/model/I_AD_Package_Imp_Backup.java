package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Imp_Backup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Imp_Backup {

    /**
     * TableName=AD_Package_Imp_Backup
     */
    String Table_Name = "AD_Package_Imp_Backup";

    /**
     * AD_Table_ID=50002
     */
    int Table_ID = 50002;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Package_Imp_Backup_ID
     */
    String COLUMNNAME_AD_Package_Imp_Backup_ID = "AD_Package_Imp_Backup_ID";
    /**
     * Column name AD_Package_Imp_Backup_UU
     */
    String COLUMNNAME_AD_Package_Imp_Backup_UU = "AD_Package_Imp_Backup_UU";
    /**
     * Column name AD_Package_Imp_Bck_Dir
     */
    String COLUMNNAME_AD_Package_Imp_Bck_Dir = "AD_Package_Imp_Bck_Dir";
    /**
     * Column name AD_Package_Imp_Detail_ID
     */
    String COLUMNNAME_AD_Package_Imp_Detail_ID = "AD_Package_Imp_Detail_ID";
    /**
     * Column name AD_Package_Imp_ID
     */
    String COLUMNNAME_AD_Package_Imp_ID = "AD_Package_Imp_ID";
    /**
     * Column name AD_Package_Imp_Org_Dir
     */
    String COLUMNNAME_AD_Package_Imp_Org_Dir = "AD_Package_Imp_Org_Dir";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name ColValue
     */
    String COLUMNNAME_ColValue = "ColValue";
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
     * Column name Uninstall
     */
    String COLUMNNAME_Uninstall = "Uninstall";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Imp. Package Backup
     */
    int getAD_Package_Imp_Backup_ID();

    /**
     * Set Imp. Package Backup
     */
    void setAD_Package_Imp_Backup_ID(int AD_Package_Imp_Backup_ID);

    /**
     * Get AD_Package_Imp_Backup_UU
     */
    String getAD_Package_Imp_Backup_UU();

    /**
     * Set AD_Package_Imp_Backup_UU
     */
    void setAD_Package_Imp_Backup_UU(String AD_Package_Imp_Backup_UU);

    /**
     * Get Package Imp. Bck. Directory
     */
    String getAD_Package_Imp_Bck_Dir();

    /**
     * Set Package Imp. Bck. Directory
     */
    void setAD_Package_Imp_Bck_Dir(String AD_Package_Imp_Bck_Dir);

    /**
     * Get Imp. Package Detail
     */
    int getAD_Package_Imp_Detail_ID();

    /**
     * Set Imp. Package Detail
     */
    void setAD_Package_Imp_Detail_ID(int AD_Package_Imp_Detail_ID);

    /**
     * Get Package Imp.
     */
    int getAD_Package_Imp_ID();

    /**
     * Set Package Imp.
     */
    void setAD_Package_Imp_ID(int AD_Package_Imp_ID);

    /**
     * Get Package Imp. Org. Dir.
     */
    String getAD_Package_Imp_Org_Dir();

    /**
     * Set Package Imp. Org. Dir.
     */
    void setAD_Package_Imp_Org_Dir(String AD_Package_Imp_Org_Dir);

    /**
     * Get Reference. System Reference and Validation
     */
    int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    void setAD_Reference_ID(int AD_Reference_ID);

    I_AD_Reference getAD_Reference() throws RuntimeException;

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Get ColValue
     */
    String getColValue();

    /**
     * Set ColValue
     */
    void setColValue(String ColValue);

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
     * Get Uninstall
     */
    boolean isUninstall();

    /**
     * Set Uninstall
     */
    void setUninstall(boolean Uninstall);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
