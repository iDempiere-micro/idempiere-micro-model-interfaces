package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ContactActivity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ContactActivity {

    /**
     * TableName=C_ContactActivity
     */
    String Table_Name = "C_ContactActivity";

    /**
     * AD_Table_ID=53354
     */
    int Table_ID = 53354;

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
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_ContactActivity_ID
     */
    String COLUMNNAME_C_ContactActivity_ID = "C_ContactActivity_ID";
    /**
     * Column name C_ContactActivity_UU
     */
    String COLUMNNAME_C_ContactActivity_UU = "C_ContactActivity_UU";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name ContactActivityType
     */
    String COLUMNNAME_ContactActivityType = "ContactActivityType";
    /**
     * Column name C_Opportunity_ID
     */
    String COLUMNNAME_C_Opportunity_ID = "C_Opportunity_ID";
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
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsComplete
     */
    String COLUMNNAME_IsComplete = "IsComplete";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Contact Activity. Events, tasks, communications related to a contact
     */
    int getC_ContactActivity_ID();

    /**
     * Set Contact Activity. Events, tasks, communications related to a contact
     */
    void setC_ContactActivity_ID(int C_ContactActivity_ID);

    /**
     * Get C_ContactActivity_UU
     */
    String getC_ContactActivity_UU();

    /**
     * Set C_ContactActivity_UU
     */
    void setC_ContactActivity_UU(String C_ContactActivity_UU);

    /**
     * Get Comments. Comments or additional information
     */
    String getComments();

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Get Activity Type. Type of activity, e.g. task, email, phone call
     */
    String getContactActivityType();

    /**
     * Set Activity Type. Type of activity, e.g. task, email, phone call
     */
    void setContactActivityType(String ContactActivityType);

    /**
     * Get Sales Opportunity
     */
    int getC_Opportunity_ID();

    /**
     * Set Sales Opportunity
     */
    void setC_Opportunity_ID(int C_Opportunity_ID);

    I_C_Opportunity getC_Opportunity() throws RuntimeException;

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
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Complete. It is complete
     */
    void setIsComplete(boolean IsComplete);

    /**
     * Get Complete. It is complete
     */
    boolean isComplete();

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
