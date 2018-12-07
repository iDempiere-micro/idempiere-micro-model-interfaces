package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_ContainerTTable
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_ContainerTTable {

    /**
     * TableName=CM_ContainerTTable
     */
    String Table_Name = "CM_ContainerTTable";

    /**
     * AD_Table_ID=880
     */
    int Table_ID = 880;

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
     * Column name CM_Container_ID
     */
    String COLUMNNAME_CM_Container_ID = "CM_Container_ID";
    /**
     * Column name CM_ContainerTTable_ID
     */
    String COLUMNNAME_CM_ContainerTTable_ID = "CM_ContainerTTable_ID";
    /**
     * Column name CM_ContainerTTable_UU
     */
    String COLUMNNAME_CM_ContainerTTable_UU = "CM_ContainerTTable_UU";
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
     * Get Web Container. Web Container contains content like images, text etc.
     */
    int getCM_Container_ID();

    /**
     * Set Web Container. Web Container contains content like images, text etc.
     */
    void setCM_Container_ID(int CM_Container_ID);

    I_CM_Container getCM_Container() throws RuntimeException;

    /**
     * Get Container T.Table. Container Template Table
     */
    int getCM_ContainerTTable_ID();

    /**
     * Set Container T.Table. Container Template Table
     */
    void setCM_ContainerTTable_ID(int CM_ContainerTTable_ID);

    /**
     * Get CM_ContainerTTable_UU
     */
    String getCM_ContainerTTable_UU();

    /**
     * Set CM_ContainerTTable_UU
     */
    void setCM_ContainerTTable_UU(String CM_ContainerTTable_UU);

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
