package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_LdapAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_LdapAccess {

    /**
     * TableName=AD_LdapAccess
     */
    String Table_Name = "AD_LdapAccess";

    /**
     * AD_Table_ID=904
     */
    int Table_ID = 904;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_LdapAccess_ID
     */
    String COLUMNNAME_AD_LdapAccess_ID = "AD_LdapAccess_ID";
    /**
     * Column name AD_LdapAccess_UU
     */
    String COLUMNNAME_AD_LdapAccess_UU = "AD_LdapAccess_UU";
    /**
     * Column name AD_LdapProcessor_ID
     */
    String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name R_InterestArea_ID
     */
    String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Ldap Access. Ldap Access Log
     */
    int getAD_LdapAccess_ID();

    /**
     * Set Ldap Access. Ldap Access Log
     */
    void setAD_LdapAccess_ID(int AD_LdapAccess_ID);

    /**
     * Get AD_LdapAccess_UU
     */
    String getAD_LdapAccess_UU();

    /**
     * Set AD_LdapAccess_UU
     */
    void setAD_LdapAccess_UU(String AD_LdapAccess_UU);

    /**
     * Get Ldap Processor. LDAP Server to authenticate and authorize external systems based on
     * iDempiere
     */
    int getAD_LdapProcessor_ID();

    /**
     * Set Ldap Processor. LDAP Server to authenticate and authorize external systems based on
     * iDempiere
     */
    void setAD_LdapProcessor_ID(int AD_LdapProcessor_ID);

    I_AD_LdapProcessor getAD_LdapProcessor() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

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
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Get Error. An Error occurred in the execution
     */
    boolean isError();

    /**
     * Get Interest Area. Interest Area or Topic
     */
    int getR_InterestArea_ID();

    /**
     * Set Interest Area. Interest Area or Topic
     */
    void setR_InterestArea_ID(int R_InterestArea_ID);

    I_R_InterestArea getR_InterestArea() throws RuntimeException;

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
