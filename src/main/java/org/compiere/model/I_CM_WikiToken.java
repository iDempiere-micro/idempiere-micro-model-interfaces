package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_WikiToken
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_WikiToken {

    /**
     * TableName=CM_WikiToken
     */
    String Table_Name = "CM_WikiToken";

    /**
     * AD_Table_ID=905
     */
    int Table_ID = 905;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name CM_WikiToken_ID
     */
    String COLUMNNAME_CM_WikiToken_ID = "CM_WikiToken_ID";
    /**
     * Column name CM_WikiToken_UU
     */
    String COLUMNNAME_CM_WikiToken_UU = "CM_WikiToken_UU";
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
     * Column name Macro
     */
    String COLUMNNAME_Macro = "Macro";
    /**
     * Column name SelectClause
     */
    String COLUMNNAME_SelectClause = "SelectClause";
    /**
     * Column name TokenType
     */
    String COLUMNNAME_TokenType = "TokenType";
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
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Wiki Token. Wiki Token
     */
    int getCM_WikiToken_ID();

    /**
     * Set Wiki Token. Wiki Token
     */
    void setCM_WikiToken_ID(int CM_WikiToken_ID);

    /**
     * Get CM_WikiToken_UU
     */
    String getCM_WikiToken_UU();

    /**
     * Set CM_WikiToken_UU
     */
    void setCM_WikiToken_UU(String CM_WikiToken_UU);

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
     * Get Macro. Macro
     */
    String getMacro();

    /**
     * Set Macro. Macro
     */
    void setMacro(String Macro);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sql SELECT. SQL SELECT clause
     */
    String getSelectClause();

    /**
     * Set Sql SELECT. SQL SELECT clause
     */
    void setSelectClause(String SelectClause);

    /**
     * Get TokenType. Wiki Token Type
     */
    String getTokenType();

    /**
     * Set TokenType. Wiki Token Type
     */
    void setTokenType(String TokenType);

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
