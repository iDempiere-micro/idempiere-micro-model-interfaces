package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_CStageTTable
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_CStageTTable {

    /**
     * TableName=CM_CStageTTable
     */
    String Table_Name = "CM_CStageTTable";

    /**
     * AD_Table_ID=881
     */
    int Table_ID = 881;

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
     * Column name CM_CStage_ID
     */
    String COLUMNNAME_CM_CStage_ID = "CM_CStage_ID";
    /**
     * Column name CM_CStageTTable_ID
     */
    String COLUMNNAME_CM_CStageTTable_ID = "CM_CStageTTable_ID";
    /**
     * Column name CM_CStageTTable_UU
     */
    String COLUMNNAME_CM_CStageTTable_UU = "CM_CStageTTable_UU";
    /**
     * Column name CM_TemplateTable_ID
     */
    String COLUMNNAME_CM_TemplateTable_ID = "CM_TemplateTable_ID";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name OtherClause
     */
    String COLUMNNAME_OtherClause = "OtherClause";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Web Container Stage. Web Container Stage contains the staging content like images, text
     * etc.
     */
    int getCM_CStage_ID();

    /**
     * Set Web Container Stage. Web Container Stage contains the staging content like images, text
     * etc.
     */
    void setCM_CStage_ID(int CM_CStage_ID);

    I_CM_CStage getCM_CStage() throws RuntimeException;

    /**
     * Get Stage T.Table. Container Stage Template Table
     */
    int getCM_CStageTTable_ID();

    /**
     * Set Stage T.Table. Container Stage Template Table
     */
    void setCM_CStageTTable_ID(int CM_CStageTTable_ID);

    /**
     * Get CM_CStageTTable_UU
     */
    String getCM_CStageTTable_UU();

    /**
     * Set CM_CStageTTable_UU
     */
    void setCM_CStageTTable_UU(String CM_CStageTTable_UU);

    /**
     * Get Template Table. CM Template Table Link
     */
    int getCM_TemplateTable_ID();

    /**
     * Set Template Table. CM Template Table Link
     */
    void setCM_TemplateTable_ID(int CM_TemplateTable_ID);

    I_CM_TemplateTable getCM_TemplateTable() throws RuntimeException;

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
     * Get Other SQL Clause. Other SQL Clause
     */
    String getOtherClause();

    /**
     * Set Other SQL Clause. Other SQL Clause
     */
    void setOtherClause(String OtherClause);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

    /**
     * Set Sql WHERE. Fully qualified SQL WHERE clause
     */
    void setWhereClause(String WhereClause);
}
