package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Exp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Exp {

    /**
     * TableName=AD_Package_Exp
     */
    String Table_Name = "AD_Package_Exp";

    /**
     * AD_Table_ID=50005
     */
    int Table_ID = 50005;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Package_Exp_ID
     */
    String COLUMNNAME_AD_Package_Exp_ID = "AD_Package_Exp_ID";
    /**
     * Column name AD_Package_Exp_UU
     */
    String COLUMNNAME_AD_Package_Exp_UU = "AD_Package_Exp_UU";
    /**
     * Column name AD_Package_Type
     */
    String COLUMNNAME_AD_Package_Type = "AD_Package_Type";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateFrom
     */
    String COLUMNNAME_DateFrom = "DateFrom";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name File_Directory
     */
    String COLUMNNAME_File_Directory = "File_Directory";
    /**
     * Column name Instructions
     */
    String COLUMNNAME_Instructions = "Instructions";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsExportDictionaryEntity
     */
    String COLUMNNAME_IsExportDictionaryEntity = "IsExportDictionaryEntity";
    /**
     * Column name PK_Version
     */
    String COLUMNNAME_PK_Version = "PK_Version";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserName
     */
    String COLUMNNAME_UserName = "UserName";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Package Exp.
     */
    int getAD_Package_Exp_ID();

    /**
     * Set Package Exp.
     */
    void setAD_Package_Exp_ID(int AD_Package_Exp_ID);

    /**
     * Get AD_Package_Exp_UU
     */
    String getAD_Package_Exp_UU();

    /**
     * Set AD_Package_Exp_UU
     */
    void setAD_Package_Exp_UU(String AD_Package_Exp_UU);

    /**
     * Get Package Type
     */
    String getAD_Package_Type();

    /**
     * Set Package Type
     */
    void setAD_Package_Type(String AD_Package_Type);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date From. Starting date for a range
     */
    Timestamp getDateFrom();

    /**
     * Set Date From. Starting date for a range
     */
    void setDateFrom(Timestamp DateFrom);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Get File_Directory
     */
    String getFile_Directory();

    /**
     * Set File_Directory
     */
    void setFile_Directory(String File_Directory);

    /**
     * Get Instructions
     */
    String getInstructions();

    /**
     * Set Instructions
     */
    void setInstructions(String Instructions);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Export Dictionary Entity
     */
    void setIsExportDictionaryEntity(boolean IsExportDictionaryEntity);

    /**
     * Get Export Dictionary Entity
     */
    boolean isExportDictionaryEntity();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Package Version
     */
    String getPK_Version();

    /**
     * Set Package Version
     */
    void setPK_Version(String PK_Version);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Name
     */
    String getUserName();

    /**
     * Set User Name
     */
    void setUserName(String UserName);

    /**
     * Get Version. Version of the table definition
     */
    String getVersion();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(String Version);
}
