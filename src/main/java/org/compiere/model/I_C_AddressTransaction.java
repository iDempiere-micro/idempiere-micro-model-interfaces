package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_AddressTransaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AddressTransaction {

    /**
     * AD_Table_ID=200102
     */
    int Table_ID = 200102;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



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
     * Column name Country
     */
    String COLUMNNAME_Country = "Country";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Region
     */
    String COLUMNNAME_Region = "Region";

    /**
     * Set Address 1. Address line 1 for this location
     */
    void setAddress1(String Address1);

    /**
     * Set Address 2. Address line 2 for this location
     */
    void setAddress2(String Address2);

    /**
     * Set Address 3. Address Line 3 for the location
     */
    void setAddress3(String Address3);

    /**
     * Set Address 4. Address Line 4 for the location
     */
    void setAddress4(String Address4);

    /**
     * Set Address 5. Address Line 5 for the location
     */
    void setAddress5(String Address5);

    /**
     * Set Address Validation
     */
    void setC_AddressValidation_ID(int C_AddressValidation_ID);

    /**
     * Get City. Identifies a City
     */
    String getCity();

    /**
     * Set City. Identifies a City
     */
    void setCity(String City);

    /**
     * Set Address. Location or Address
     */
    void setLocationId(int C_Location_ID);

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Set Country
     */
    void setCountry(String Country);

    /**
     * Set ZIP. Postal code
     */
    void setPostal(String Postal);

    /**
     * Set Region
     */
    void setRegion(String Region);

}
