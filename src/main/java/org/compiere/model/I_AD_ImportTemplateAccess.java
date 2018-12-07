package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ImportTemplateAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ImportTemplateAccess {

    /**
     * TableName=AD_ImportTemplateAccess
     */
    String Table_Name = "AD_ImportTemplateAccess";

    /**
     * AD_Table_ID=200154
     */
    int Table_ID = 200154;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_ImportTemplateAccess_ID
     */
    String COLUMNNAME_AD_ImportTemplateAccess_ID = "AD_ImportTemplateAccess_ID";
    /**
     * Column name AD_ImportTemplateAccess_UU
     */
    String COLUMNNAME_AD_ImportTemplateAccess_UU = "AD_ImportTemplateAccess_UU";
    /**
     * Column name AD_ImportTemplate_ID
     */
    String COLUMNNAME_AD_ImportTemplate_ID = "AD_ImportTemplate_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
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
     * Column name IsAllowInsert
     */
    String COLUMNNAME_IsAllowInsert = "IsAllowInsert";
    /**
     * Column name IsAllowMerge
     */
    String COLUMNNAME_IsAllowMerge = "IsAllowMerge";
    /**
     * Column name IsAllowUpdate
     */
    String COLUMNNAME_IsAllowUpdate = "IsAllowUpdate";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Import Template Access
     */
    int getAD_ImportTemplateAccess_ID();

    /**
     * Set Import Template Access
     */
    void setAD_ImportTemplateAccess_ID(int AD_ImportTemplateAccess_ID);

    /**
     * Get AD_ImportTemplateAccess_UU
     */
    String getAD_ImportTemplateAccess_UU();

    /**
     * Set AD_ImportTemplateAccess_UU
     */
    void setAD_ImportTemplateAccess_UU(String AD_ImportTemplateAccess_UU);

    /**
     * Get Import Template
     */
    int getAD_ImportTemplate_ID();

    /**
     * Set Import Template
     */
    void setAD_ImportTemplate_ID(int AD_ImportTemplate_ID);

    I_AD_ImportTemplate getAD_ImportTemplate() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

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
     * Set Allow Insert
     */
    void setIsAllowInsert(boolean IsAllowInsert);

    /**
     * Get Allow Insert
     */
    boolean isAllowInsert();

    /**
     * Set Allow Merge
     */
    void setIsAllowMerge(boolean IsAllowMerge);

    /**
     * Get Allow Merge
     */
    boolean isAllowMerge();

    /**
     * Set Allow Update
     */
    void setIsAllowUpdate(boolean IsAllowUpdate);

    /**
     * Get Allow Update
     */
    boolean isAllowUpdate();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
