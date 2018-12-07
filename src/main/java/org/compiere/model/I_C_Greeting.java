package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Greeting
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Greeting {

    /**
     * TableName=C_Greeting
     */
    String Table_Name = "C_Greeting";

    /**
     * AD_Table_ID=346
     */
    int Table_ID = 346;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name C_Greeting_UU
     */
    String COLUMNNAME_C_Greeting_UU = "C_Greeting_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Greeting
     */
    String COLUMNNAME_Greeting = "Greeting";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsFirstNameOnly
     */
    String COLUMNNAME_IsFirstNameOnly = "IsFirstNameOnly";
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
     * Get Greeting. Greeting to print on correspondence
     */
    int getC_Greeting_ID();

    /**
     * Set Greeting. Greeting to print on correspondence
     */
    void setC_Greeting_ID(int C_Greeting_ID);

    /**
     * Get C_Greeting_UU
     */
    String getC_Greeting_UU();

    /**
     * Set C_Greeting_UU
     */
    void setC_Greeting_UU(String C_Greeting_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Greeting. For letters, e.g. "Dear { 0} " or "Dear Mr. { 0} " - At runtime, " { 0} " is
     * replaced by the name
     */
    String getGreeting();

    /**
     * Set Greeting. For letters, e.g. "Dear { 0} " or "Dear Mr. { 0} " - At runtime, " { 0} " is
     * replaced by the name
     */
    void setGreeting(String Greeting);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set First name only. Print only the first name in greetings
     */
    void setIsFirstNameOnly(boolean IsFirstNameOnly);

    /**
     * Get First name only. Print only the first name in greetings
     */
    boolean isFirstNameOnly();

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
