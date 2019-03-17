package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_CountryGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CountryGroup {

    /**
     * TableName=C_CountryGroup
     */
    String Table_Name = "C_CountryGroup";

    /**
     * AD_Table_ID=200146
     */
    int Table_ID = 200146;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name C_CountryGroup_ID
     */
    String COLUMNNAME_C_CountryGroup_ID = "C_CountryGroup_ID";

    /**
     * Get Country Group
     */
    int getCountryGroupId();

}
