package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Template_Ad_Cat
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Template_Ad_Cat {

    /**
     * TableName=CM_Template_Ad_Cat
     */
    String Table_Name = "CM_Template_Ad_Cat";

    /**
     * AD_Table_ID=872
     */
    int Table_ID = 872;

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
     * Column name CM_Ad_Cat_ID
     */
    String COLUMNNAME_CM_Ad_Cat_ID = "CM_Ad_Cat_ID";
    /**
     * Column name CM_Template_Ad_Cat_UU
     */
    String COLUMNNAME_CM_Template_Ad_Cat_UU = "CM_Template_Ad_Cat_UU";
    /**
     * Column name CM_Template_ID
     */
    String COLUMNNAME_CM_Template_ID = "CM_Template_ID";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Advertisement Category. Advertisement Category like Banner Homepage
     */
    int getCM_Ad_Cat_ID();

    /**
     * Set Advertisement Category. Advertisement Category like Banner Homepage
     */
    void setCM_Ad_Cat_ID(int CM_Ad_Cat_ID);

    I_CM_Ad_Cat getCM_Ad_Cat() throws RuntimeException;

    /**
     * Get CM_Template_Ad_Cat_UU
     */
    String getCM_Template_Ad_Cat_UU();

    /**
     * Set CM_Template_Ad_Cat_UU
     */
    void setCM_Template_Ad_Cat_UU(String CM_Template_Ad_Cat_UU);

    /**
     * Get Template. Template defines how content is displayed
     */
    int getCM_Template_ID();

    /**
     * Set Template. Template defines how content is displayed
     */
    void setCM_Template_ID(int CM_Template_ID);

    I_CM_Template getCM_Template() throws RuntimeException;

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
