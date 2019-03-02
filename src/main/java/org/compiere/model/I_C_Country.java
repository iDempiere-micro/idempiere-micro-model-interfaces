package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Country
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Country {

    /**
     * TableName=C_Country
     */
    String Table_Name = "C_Country";

    /**
     * AD_Table_ID=170
     */
    int Table_ID = 170;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AllowCitiesOutOfList
     */
    String COLUMNNAME_AllowCitiesOutOfList = "AllowCitiesOutOfList";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CountryCode
     */
    String COLUMNNAME_CountryCode = "CountryCode";
    /**
     * Column name DisplaySequence
     */
    String COLUMNNAME_DisplaySequence = "DisplaySequence";
    /**
     * Column name DisplaySequenceLocal
     */
    String COLUMNNAME_DisplaySequenceLocal = "DisplaySequenceLocal";
    /**
     * Column name HasPostal_Add
     */
    String COLUMNNAME_HasPostal_Add = "HasPostal_Add";
    /**
     * Column name HasRegion
     */
    String COLUMNNAME_HasRegion = "HasRegion";
    /**
     * Column name IsAddressLinesLocalReverse
     */
    String COLUMNNAME_IsAddressLinesLocalReverse = "IsAddressLinesLocalReverse";
    /**
     * Column name IsAddressLinesReverse
     */
    String COLUMNNAME_IsAddressLinesReverse = "IsAddressLinesReverse";

    /**
     * Get Allow Cities out of List. A flag to allow cities, currently not in the list, to be entered
     */
    boolean isAllowCitiesOutOfList();

    /**
     * Get Country. Country
     */
    int getCountryId();

    /**
     * Get ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    String getCountryCode();

    /**
     * Get Address Print Format. Format for printing this Address
     */
    String getDisplaySequence();

    /**
     * Set Address Print Format. Format for printing this Address
     */
    void setDisplaySequence(String DisplaySequence);

    /**
     * Get Local Address Format. Format for printing this Address locally
     */
    String getDisplaySequenceLocal();

    /**
     * Set Additional Postal code. Has Additional Postal Code
     */
    void setHasPostal_Add(boolean HasPostal_Add);

    /**
     * Get Country has Region. Country contains Regions
     */
    boolean isHasRegion();

    /**
     * Set Country has Region. Country contains Regions
     */
    void setHasRegion(boolean HasRegion);

    /**
     * Set Reverse Local Address Lines. Print Local Address in reverse Order
     */
    void setIsAddressLinesLocalReverse(boolean IsAddressLinesLocalReverse);

    /**
     * Get Reverse Local Address Lines. Print Local Address in reverse Order
     */
    boolean isAddressLinesLocalReverse();

    /**
     * Set Reverse Address Lines. Print Address in reverse Order
     */
    void setIsAddressLinesReverse(boolean IsAddressLinesReverse);

    /**
     * Get Reverse Address Lines. Print Address in reverse Order
     */
    boolean isAddressLinesReverse();

}
