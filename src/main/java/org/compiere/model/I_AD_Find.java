package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Find
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Find {

    /**
     * TableName=AD_Find
     */
    String Table_Name = "AD_Find";

    /**
     * AD_Table_ID=404
     */
    int Table_ID = 404;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Find_ID
     */
    String COLUMNNAME_AD_Find_ID = "AD_Find_ID";
    /**
     * Column name AD_Find_UU
     */
    String COLUMNNAME_AD_Find_UU = "AD_Find_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AndOr
     */
    String COLUMNNAME_AndOr = "AndOr";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Find_ID
     */
    String COLUMNNAME_Find_ID = "Find_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Operation
     */
    String COLUMNNAME_Operation = "Operation";
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
     * Column name Value2
     */
    String COLUMNNAME_Value2 = "Value2";

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
     * Get Find
     */
    int getAD_Find_ID();

    /**
     * Set Find
     */
    void setAD_Find_ID(int AD_Find_ID);

    /**
     * Get AD_Find_UU
     */
    String getAD_Find_UU();

    /**
     * Set AD_Find_UU
     */
    void setAD_Find_UU(String AD_Find_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get And/Or. Logical operation: AND or OR
     */
    String getAndOr();

    /**
     * Set And/Or. Logical operation: AND or OR
     */
    void setAndOr(String AndOr);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Find
     */
    BigDecimal getFind_ID();

    /**
     * Set Find
     */
    void setFind_ID(BigDecimal Find_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Operation. Compare Operation
     */
    String getOperation();

    /**
     * Set Operation. Compare Operation
     */
    void setOperation(String Operation);

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
     * Get Value To. Value To
     */
    String getValue2();

    /**
     * Set Value To. Value To
     */
    void setValue2(String Value2);
}
