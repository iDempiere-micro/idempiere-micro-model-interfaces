package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Container_URL
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Container_URL {

    /**
     * TableName=CM_Container_URL
     */
    String Table_Name = "CM_Container_URL";

    /**
     * AD_Table_ID=865
     */
    int Table_ID = 865;

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
     * Column name Checked
     */
    String COLUMNNAME_Checked = "Checked";
    /**
     * Column name CM_Container_ID
     */
    String COLUMNNAME_CM_Container_ID = "CM_Container_ID";
    /**
     * Column name CM_Container_URL_ID
     */
    String COLUMNNAME_CM_Container_URL_ID = "CM_Container_URL_ID";
    /**
     * Column name CM_Container_URL_UU
     */
    String COLUMNNAME_CM_Container_URL_UU = "CM_Container_URL_UU";
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
     * Column name Last_Result
     */
    String COLUMNNAME_Last_Result = "Last_Result";
    /**
     * Column name Status
     */
    String COLUMNNAME_Status = "Status";
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
     * Get Last Checked. Info when we did the last check
     */
    Timestamp getChecked();

    /**
     * Set Last Checked. Info when we did the last check
     */
    void setChecked(Timestamp Checked);

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
     * Get Container URL. Contains info on used URLs
     */
    int getCM_Container_URL_ID();

    /**
     * Set Container URL. Contains info on used URLs
     */
    void setCM_Container_URL_ID(int CM_Container_URL_ID);

    /**
     * Get CM_Container_URL_UU
     */
    String getCM_Container_URL_UU();

    /**
     * Set CM_Container_URL_UU
     */
    void setCM_Container_URL_UU(String CM_Container_URL_UU);

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
     * Get Last Result. Contains data on the last check result
     */
    String getLast_Result();

    /**
     * Set Last Result. Contains data on the last check result
     */
    void setLast_Result(String Last_Result);

    /**
     * Get Status. Status of the currently running check
     */
    String getStatus();

    /**
     * Set Status. Status of the currently running check
     */
    void setStatus(String Status);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
