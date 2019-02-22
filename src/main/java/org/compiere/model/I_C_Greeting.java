package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name C_Greeting_UU
     */
    String COLUMNNAME_C_Greeting_UU = "C_Greeting_UU";
    /**
     * Column name Greeting
     */
    String COLUMNNAME_Greeting = "Greeting";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsFirstNameOnly
     */
    String COLUMNNAME_IsFirstNameOnly = "IsFirstNameOnly";

}
