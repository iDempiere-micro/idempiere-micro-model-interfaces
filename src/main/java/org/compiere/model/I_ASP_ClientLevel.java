package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_ClientLevel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_ClientLevel {

    /**
     * TableName=ASP_ClientLevel
     */
    String Table_Name = "ASP_ClientLevel";

    /**
     * AD_Table_ID=53056
     */
    int Table_ID = 53056;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name ASP_ClientLevel_ID
     */
    String COLUMNNAME_ASP_ClientLevel_ID = "ASP_ClientLevel_ID";
    /**
     * Column name ASP_ClientLevel_UU
     */
    String COLUMNNAME_ASP_ClientLevel_UU = "ASP_ClientLevel_UU";
    /**
     * Column name ASP_Level_ID
     */
    String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";
    /**
     * Column name ASP_Module_ID
     */
    String COLUMNNAME_ASP_Module_ID = "ASP_Module_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
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
     * Get Client Level
     */
    int getASP_ClientLevel_ID();

    /**
     * Set Client Level
     */
    void setASP_ClientLevel_ID(int ASP_ClientLevel_ID);

    /**
     * Get ASP_ClientLevel_UU
     */
    String getASP_ClientLevel_UU();

    /**
     * Set ASP_ClientLevel_UU
     */
    void setASP_ClientLevel_UU(String ASP_ClientLevel_UU);

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
     * Get ASP Module
     */
    int getASP_Module_ID();

    /**
     * Set ASP Module
     */
    void setASP_Module_ID(int ASP_Module_ID);

    I_ASP_Module getASP_Module() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

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
