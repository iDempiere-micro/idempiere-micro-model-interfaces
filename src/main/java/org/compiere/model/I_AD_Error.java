package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Error
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Error {

    /**
     * TableName=AD_Error
     */
    String Table_Name = "AD_Error";

    /**
     * AD_Table_ID=380
     */
    int Table_ID = 380;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Error_ID
     */
    String COLUMNNAME_AD_Error_ID = "AD_Error_ID";
    /**
     * Column name AD_Error_UU
     */
    String COLUMNNAME_AD_Error_UU = "AD_Error_UU";
    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Code
     */
    String COLUMNNAME_Code = "Code";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Error
     */
    int getAD_Error_ID();

    /**
     * Set Error
     */
    void setAD_Error_ID(int AD_Error_ID);

    /**
     * Get AD_Error_UU
     */
    String getAD_Error_UU();

    /**
     * Set AD_Error_UU
     */
    void setAD_Error_UU(String AD_Error_UU);

    /**
     * Get Language. Language for this entity
     */
    String getADLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setADLanguage(String AD_Language);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Validation code. Validation Code
     */
    String getCode();

    /**
     * Set Validation code. Validation Code
     */
    void setCode(String Code);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
