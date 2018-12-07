package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_SearchDefinition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_SearchDefinition {

    /**
     * TableName=AD_SearchDefinition
     */
    String Table_Name = "AD_SearchDefinition";

    /**
     * AD_Table_ID=53169
     */
    int Table_ID = 53169;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

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
     * Column name AD_SearchDefinition_ID
     */
    String COLUMNNAME_AD_SearchDefinition_ID = "AD_SearchDefinition_ID";
    /**
     * Column name AD_SearchDefinition_UU
     */
    String COLUMNNAME_AD_SearchDefinition_UU = "AD_SearchDefinition_UU";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DataType
     */
    String COLUMNNAME_DataType = "DataType";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name PO_Window_ID
     */
    String COLUMNNAME_PO_Window_ID = "PO_Window_ID";
    /**
     * Column name Query
     */
    String COLUMNNAME_Query = "Query";
    /**
     * Column name SearchType
     */
    String COLUMNNAME_SearchType = "SearchType";
    /**
     * Column name TransactionCode
     */
    String COLUMNNAME_TransactionCode = "TransactionCode";
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
     * Get Search Definition
     */
    int getAD_SearchDefinition_ID();

    /**
     * Set Search Definition
     */
    void setAD_SearchDefinition_ID(int AD_SearchDefinition_ID);

    /**
     * Get AD_SearchDefinition_UU
     */
    String getAD_SearchDefinition_UU();

    /**
     * Set AD_SearchDefinition_UU
     */
    void setAD_SearchDefinition_UU(String AD_SearchDefinition_UU);

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
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Data Type. Type of data
     */
    String getDataType();

    /**
     * Set Data Type. Type of data
     */
    void setDataType(String DataType);

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get PO Window. Purchase Order Window
     */
    int getPO_Window_ID();

    /**
     * Set PO Window. Purchase Order Window
     */
    void setPO_Window_ID(int PO_Window_ID);

    I_AD_Window getPO_Window() throws RuntimeException;

    /**
     * Get Query. SQL
     */
    String getQuery();

    /**
     * Set Query. SQL
     */
    void setQuery(String Query);

    /**
     * Get Search Type. Which kind of search is used (Query or Table)
     */
    String getSearchType();

    /**
     * Set Search Type. Which kind of search is used (Query or Table)
     */
    void setSearchType(String SearchType);

    /**
     * Get Transaction Code. The transaction code represents the search definition
     */
    String getTransactionCode();

    /**
     * Set Transaction Code. The transaction code represents the search definition
     */
    void setTransactionCode(String TransactionCode);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
