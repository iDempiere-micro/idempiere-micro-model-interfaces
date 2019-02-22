package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for R_ContactInterest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_ContactInterest {

    /**
     * TableName=R_ContactInterest
     */
    String Table_Name = "R_ContactInterest";

    /**
     * AD_Table_ID=528
     */
    int Table_ID = 528;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name OptOutDate
     */
    String COLUMNNAME_OptOutDate = "OptOutDate";
    /**
     * Column name R_ContactInterest_UU
     */
    String COLUMNNAME_R_ContactInterest_UU = "R_ContactInterest_UU";
    /**
     * Column name R_InterestArea_ID
     */
    String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
    /**
     * Column name SubscribeDate
     */
    String COLUMNNAME_SubscribeDate = "SubscribeDate";

    /**
     * Get Opt-out Date. Date the contact opted out
     */
    Timestamp getOptOutDate();

    /**
     * Set Opt-out Date. Date the contact opted out
     */
    void setOptOutDate(Timestamp OptOutDate);

    /**
     * Get Interest Area. Interest Area or Topic
     */
    int getR_InterestArea_ID();

    /**
     * Set Interest Area. Interest Area or Topic
     */
    void setR_InterestArea_ID(int R_InterestArea_ID);

    /**
     * Set Subscribe Date. Date the contact actively subscribed
     */
    void setSubscribeDate(Timestamp SubscribeDate);

}
