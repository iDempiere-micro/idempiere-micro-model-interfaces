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

    /**
     * Get Contact Activity. Events, tasks, communications related to a contact
     */
    int getC_ContactActivity_ID();

    /**
     * Get Sales Opportunity
     */
    int getC_Opportunity_ID();

    I_C_Opportunity getC_Opportunity() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Complete. It is complete
     */
    boolean isComplete();

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

}
