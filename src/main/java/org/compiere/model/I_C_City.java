package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_City
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_City {

    /**
     * TableName=C_City
     */
    String Table_Name = "C_City";

    /**
     * AD_Table_ID=186
     */
    int Table_ID = 186;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AreaCode
     */
    String COLUMNNAME_AreaCode = "AreaCode";
    /**
     * Column name C_City_ID
     */
    String COLUMNNAME_C_City_ID = "C_City_ID";
    /**
     * Column name C_City_UU
     */
    String COLUMNNAME_C_City_UU = "C_City_UU";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name Coordinates
     */
    String COLUMNNAME_Coordinates = "Coordinates";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name Locode
     */
    String COLUMNNAME_Locode = "Locode";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";

    /**
     * Get City. City
     */
    int getC_City_ID();

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Get Region. Identifies a geographical Region
     */
    int getC_Region_ID();

    /**
     * Set Region. Identifies a geographical Region
     */
    void setC_Region_ID(int C_Region_ID);

}
