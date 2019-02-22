package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_SchedulerRecipient
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_SchedulerRecipient {

    /**
     * TableName=AD_SchedulerRecipient
     */
    String Table_Name = "AD_SchedulerRecipient";

    /**
     * AD_Table_ID=704
     */
    int Table_ID = 704;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Scheduler_ID
     */
    String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
    /**
     * Column name AD_SchedulerRecipient_ID
     */
    String COLUMNNAME_AD_SchedulerRecipient_ID = "AD_SchedulerRecipient_ID";
    /**
     * Column name AD_SchedulerRecipient_UU
     */
    String COLUMNNAME_AD_SchedulerRecipient_UU = "AD_SchedulerRecipient_UU";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Get Scheduler. Schedule Processes
     */
    int getAD_Scheduler_ID();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

}
