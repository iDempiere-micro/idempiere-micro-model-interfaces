package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Process
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Process {

    /**
     * TableName=ASP_Process
     */
    String Table_Name = "ASP_Process";

    /**
     * AD_Table_ID=53049
     */
    int Table_ID = 53049;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name ASP_Level_ID
     */
    String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";
    /**
     * Column name ASP_Process_ID
     */
    String COLUMNNAME_ASP_Process_ID = "ASP_Process_ID";
    /**
     * Column name ASP_Process_UU
     */
    String COLUMNNAME_ASP_Process_UU = "ASP_Process_UU";
    /**
     * Column name ASP_Status
     */
    String COLUMNNAME_ASP_Status = "ASP_Status";
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
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

    /**
     * Get ASP Level
     */
    int getASP_Level_ID();

    /**
     * Set ASP Level
     */
    void setASP_Level_ID(int ASP_Level_ID);

    I_ASP_Level getASP_Level() throws RuntimeException;

    /**
     * Get ASP Process
     */
    int getASP_Process_ID();

    /**
     * Set ASP Process
     */
    void setASP_Process_ID(int ASP_Process_ID);

    /**
     * Get ASP_Process_UU
     */
    String getASP_Process_UU();

    /**
     * Set ASP_Process_UU
     */
    void setASP_Process_UU(String ASP_Process_UU);

    /**
     * Get ASP Status
     */
    String getASP_Status();

    /**
     * Set ASP Status
     */
    void setASP_Status(String ASP_Status);

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
