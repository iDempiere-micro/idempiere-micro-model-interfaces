package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Region
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Region {

    /**
     * TableName=C_Region
     */
    String Table_Name = "C_Region";

    /**
     * AD_Table_ID=164
     */
    int Table_ID = 164;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";

    /**
     * Get Country. Country
     */
    int getCountryId();

    /**
     * Set Country. Country
     */
    void setCountryId(int C_Country_ID);

    /**
     * Get Region. Identifies a geographical Region
     */
    int getRegionId();

    /**
     * Get Default. Default value
     */
    boolean isDefault();

}
