package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Campaign
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Campaign {

    /**
     * TableName=C_Campaign
     */
    String Table_Name = "C_Campaign";

    /**
     * AD_Table_ID=274
     */
    int Table_ID = 274;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Campaign_UU
     */
    String COLUMNNAME_C_Campaign_UU = "C_Campaign_UU";
    /**
     * Column name C_Channel_ID
     */
    String COLUMNNAME_C_Channel_ID = "C_Channel_ID";
    /**
     * Column name Costs
     */
    String COLUMNNAME_Costs = "Costs";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";

    /**
     * Get Channel. Sales Channel
     */
    int getC_Channel_ID();

}
