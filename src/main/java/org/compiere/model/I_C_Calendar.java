package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Calendar
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Calendar {

    /**
     * TableName=C_Calendar
     */
    String Table_Name = "C_Calendar";

    /**
     * AD_Table_ID=139
     */
    int Table_ID = 139;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name C_Calendar_UU
     */
    String COLUMNNAME_C_Calendar_UU = "C_Calendar_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

}
