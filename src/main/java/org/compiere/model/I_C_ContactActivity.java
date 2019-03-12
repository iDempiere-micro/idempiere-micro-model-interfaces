package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_ContactActivity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ContactActivity {

    /**
     * AD_Table_ID=53354
     */
    int Table_ID = 53354;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Email = EM */
    String CONTACTACTIVITYTYPE_Email = "EM";
    /** Phone call = PC */
    String CONTACTACTIVITYTYPE_PhoneCall = "PC";
    /** Meeting = ME */
    String CONTACTACTIVITYTYPE_Meeting = "ME";
    /** Task = TA */
    String CONTACTACTIVITYTYPE_Task = "TA";

    /**
     * Column name C_ContactActivity_ID
     */
    String COLUMNNAME_C_ContactActivity_ID = "C_ContactActivity_ID";
    /**
     * Column name C_Opportunity_ID
     */
    String COLUMNNAME_C_Opportunity_ID = "C_Opportunity_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
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

    /** Column name ContactActivityType */
    String COLUMNNAME_ContactActivityType = "ContactActivityType";

    /** Set Activity Type.
     * Type of activity, e.g. task, email, phone call
     */
    void setContactActivityType (String ContactActivityType);

    /** Get Activity Type.
     * Type of activity, e.g. task, email, phone call
     */
    String getContactActivityType();


    /**
     * Get Contact Activity. Events, tasks, communications related to a contact
     */
    int getContactActivityId();

    /**
     * Get Sales Opportunity
     */
    int getOpportunityId();

    I_C_Opportunity getOpportunity() throws RuntimeException;

    /**
     * Get Description. Short description of the record
     */
    String getDescription();

    /** Set Description.
     * Short description of the record
     */
    void setDescription (String Description);


    /**
     * Get Complete. It is complete
     */
    boolean isComplete();

    /**
     * Get Sales Representative Id. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative Id. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int salesRepresentativeId);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    I_AD_User getSalesRepresentative() throws RuntimeException;

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentative(I_AD_User salesRepresentative) throws RuntimeException;

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

}
