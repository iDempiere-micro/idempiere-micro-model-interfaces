package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_AccessStage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_AccessStage {

    /**
     * TableName=CM_AccessStage
     */
    String Table_Name = "CM_AccessStage";

    /**
     * AD_Table_ID=889
     */
    int Table_ID = 889;

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
     * Column name CM_AccessProfile_ID
     */
    String COLUMNNAME_CM_AccessProfile_ID = "CM_AccessProfile_ID";
    /**
     * Column name CM_AccessStage_UU
     */
    String COLUMNNAME_CM_AccessStage_UU = "CM_AccessStage_UU";
    /**
     * Column name CM_CStage_ID
     */
    String COLUMNNAME_CM_CStage_ID = "CM_CStage_ID";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Web Access Profile. Web Access Profile
     */
    int getCM_AccessProfile_ID();

    /**
     * Set Web Access Profile. Web Access Profile
     */
    void setCM_AccessProfile_ID(int CM_AccessProfile_ID);

    I_CM_AccessProfile getCM_AccessProfile() throws RuntimeException;

    /**
     * Get CM_AccessStage_UU
     */
    String getCM_AccessStage_UU();

    /**
     * Set CM_AccessStage_UU
     */
    void setCM_AccessStage_UU(String CM_AccessStage_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
