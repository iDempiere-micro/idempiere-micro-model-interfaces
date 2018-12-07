package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_LdapProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_LdapProcessorLog {

    /**
     * TableName=AD_LdapProcessorLog
     */
    String Table_Name = "AD_LdapProcessorLog";

    /**
     * AD_Table_ID=903
     */
    int Table_ID = 903;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_LdapProcessor_ID
     */
    String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
    /**
     * Column name AD_LdapProcessorLog_ID
     */
    String COLUMNNAME_AD_LdapProcessorLog_ID = "AD_LdapProcessorLog_ID";
    /**
     * Column name AD_LdapProcessorLog_UU
     */
    String COLUMNNAME_AD_LdapProcessorLog_UU = "AD_LdapProcessorLog_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
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
     * Column name Reference
     */
    String COLUMNNAME_Reference = "Reference";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

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
     * Get Ldap Processor Log. LDAP Server Log
     */
    int getAD_LdapProcessorLog_ID();

    /**
     * Set Ldap Processor Log. LDAP Server Log
     */
    void setAD_LdapProcessorLog_ID(int AD_LdapProcessorLog_ID);

    /**
     * Get AD_LdapProcessorLog_UU
     */
    String getAD_LdapProcessorLog_UU();

    /**
     * Set AD_LdapProcessorLog_UU
     */
    void setAD_LdapProcessorLog_UU(String AD_LdapProcessorLog_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Binary Data. Binary Data
     */
    byte[] getBinaryData();

    /**
     * Set Binary Data. Binary Data
     */
    void setBinaryData(byte[] BinaryData);

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
     * Get Reference. Reference for this record
     */
    String getReference();

    /**
     * Set Reference. Reference for this record
     */
    void setReference(String Reference);

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
