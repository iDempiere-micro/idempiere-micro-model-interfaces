package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Location
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Location {
    /**
     * TableName=C_Location
     */
    String Table_Name = "C_Location";

    /**
     * AD_Table_ID=162
     */
    int Table_ID = 162;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);



    /**
     * Column name Address1
     */
    String COLUMNNAME_Address1 = "Address1";
    /**
     * Column name Address2
     */
    String COLUMNNAME_Address2 = "Address2";
    /**
     * Column name Address3
     */
    String COLUMNNAME_Address3 = "Address3";
    /**
     * Column name Address4
     */
    String COLUMNNAME_Address4 = "Address4";
    /**
     * Column name Address5
     */
    String COLUMNNAME_Address5 = "Address5";
    /**
     * Column name C_AddressValidation_ID
     */
    String COLUMNNAME_C_AddressValidation_ID = "C_AddressValidation_ID";
    /**
     * Column name C_City_ID
     */
    String COLUMNNAME_C_City_ID = "C_City_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name City
     */
    String COLUMNNAME_City = "City";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Postal_Add
     */
    String COLUMNNAME_Postal_Add = "Postal_Add";
    /**
     * Column name RegionName
     */
    String COLUMNNAME_RegionName = "RegionName";

    /**
     * Set Country. Country
     */
    void setCountryId(int C_Country_ID);

    /**
     * Get Address. Location or Address
     */
    int getLocationId();

    /**
     * Set Region. Identifies a geographical Region
     */
    void setRegionId(int C_Region_ID);

    /**
     * Set ZIP. Postal code
     */
    void setPostal(String Postal);

    /**
     * Get Region. Name of the Region
     */
    String getRegionName();

    boolean equals(
            int c_country_id,
            int c_region_id,
            String postal,
            String s,
            String city,
            String address1,
            String address2);

    /**
     * Set Address 1. Address line 1 for this location
     */
    void setAddress1(String Address1);

    /**
     * Set Address 2. Address line 2 for this location
     */
    void setAddress2(String Address2);

    /**
     * Set City. Identifies a City
     */
    void setCity(String City);

    String getAddress1();

    String getAddress2();

    String getAddress3();

    String getAddress4();

    String getAddress5();

    String getCity();

    String getCountryName();
}
