package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Imp_Detail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Imp_Detail {

    /**
     * TableName=AD_Package_Imp_Detail
     */
    String Table_Name = "AD_Package_Imp_Detail";

    /**
     * AD_Table_ID=50004
     */
    int Table_ID = 50004;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name Action
     */
    String COLUMNNAME_Action = "Action";
    /**
     * Column name AD_Backup_ID
     */
    String COLUMNNAME_AD_Backup_ID = "AD_Backup_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Package_Imp_Detail_ID
     */
    String COLUMNNAME_AD_Package_Imp_Detail_ID = "AD_Package_Imp_Detail_ID";
    /**
     * Column name AD_Package_Imp_Detail_UU
     */
    String COLUMNNAME_AD_Package_Imp_Detail_UU = "AD_Package_Imp_Detail_UU";
    /**
     * Column name AD_Package_Imp_ID
     */
    String COLUMNNAME_AD_Package_Imp_ID = "AD_Package_Imp_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name Success
     */
    String COLUMNNAME_Success = "Success";
    /**
     * Column name TableName
     */
    String COLUMNNAME_TableName = "TableName";
    /**
     * Column name Type
     */
    String COLUMNNAME_Type = "Type";
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
     * Get Action. Indicates the Action to be performed
     */
    String getAction();

    /**
     * Set Action. Indicates the Action to be performed
     */
    void setAction(String Action);

    /**
     * Get Backup
     */
    int getAD_Backup_ID();

    /**
     * Set Backup
     */
    void setAD_Backup_ID(int AD_Backup_ID);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Imp. Package Detail
     */
    int getAD_Package_Imp_Detail_ID();

    /**
     * Set Imp. Package Detail
     */
    void setAD_Package_Imp_Detail_ID(int AD_Package_Imp_Detail_ID);

    /**
     * Get AD_Package_Imp_Detail_UU
     */
    String getAD_Package_Imp_Detail_UU();

    /**
     * Set AD_Package_Imp_Detail_UU
     */
    void setAD_Package_Imp_Detail_UU(String AD_Package_Imp_Detail_UU);

    /**
     * Get Package Imp.
     */
    int getAD_Package_Imp_ID();

    /**
     * Set Package Imp.
     */
    void setAD_Package_Imp_ID(int AD_Package_Imp_ID);

    I_AD_Package_Imp getAD_Package_Imp() throws RuntimeException;

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Success
     */
    String getSuccess();

    /**
     * Set Success
     */
    void setSuccess(String Success);

    /**
     * Get DB Table Name. Name of the table in the database
     */
    String getTableName();

    /**
     * Set DB Table Name. Name of the table in the database
     */
    void setTableName(String TableName);

    /**
     * Get Type. Type of Validation (SQL, Java Script, Java Language)
     */
    String getType();

    /**
     * Set Type. Type of Validation (SQL, Java Script, Java Language)
     */
    void setType(String Type);

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
