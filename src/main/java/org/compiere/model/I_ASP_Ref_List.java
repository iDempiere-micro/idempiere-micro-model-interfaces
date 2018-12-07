package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Ref_List
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Ref_List {

    /**
     * TableName=ASP_Ref_List
     */
    String Table_Name = "ASP_Ref_List";

    /**
     * AD_Table_ID=200011
     */
    int Table_ID = 200011;

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
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Ref_List_ID
     */
    String COLUMNNAME_AD_Ref_List_ID = "AD_Ref_List_ID";
    /**
     * Column name ASP_Level_ID
     */
    String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";
    /**
     * Column name ASP_Ref_List_ID
     */
    String COLUMNNAME_ASP_Ref_List_ID = "ASP_Ref_List_ID";
    /**
     * Column name ASP_Ref_List_UU
     */
    String COLUMNNAME_ASP_Ref_List_UU = "ASP_Ref_List_UU";
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
     * Get Reference. System Reference and Validation
     */
    int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    void setAD_Reference_ID(int AD_Reference_ID);

    I_AD_Reference getAD_Reference() throws RuntimeException;

    /**
     * Get Reference List. Reference List based on Table
     */
    int getAD_Ref_List_ID();

    /**
     * Set Reference List. Reference List based on Table
     */
    void setAD_Ref_List_ID(int AD_Ref_List_ID);

    I_AD_Ref_List getAD_Ref_List() throws RuntimeException;

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
     * Get ASP_Ref_List
     */
    int getASP_Ref_List_ID();

    /**
     * Set ASP_Ref_List
     */
    void setASP_Ref_List_ID(int ASP_Ref_List_ID);

    /**
     * Get ASP_Ref_List_UU
     */
    String getASP_Ref_List_UU();

    /**
     * Set ASP_Ref_List_UU
     */
    void setASP_Ref_List_UU(String ASP_Ref_List_UU);

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
