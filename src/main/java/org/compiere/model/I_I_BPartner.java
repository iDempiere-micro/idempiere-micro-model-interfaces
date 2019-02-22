package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for I_BPartner
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_BPartner {

    /**
     * TableName=I_BPartner
     */
    String Table_Name = "I_BPartner";

    /**
     * AD_Table_ID=533
     */
    int Table_ID = 533;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name Address1
     */
    String COLUMNNAME_Address1 = "Address1";
    /**
     * Column name Address2
     */
    String COLUMNNAME_Address2 = "Address2";
    /**
     * Column name Birthday
     */
    String COLUMNNAME_Birthday = "Birthday";
    /**
     * Column name BPContactGreeting
     */
    String COLUMNNAME_BPContactGreeting = "BPContactGreeting";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name City
     */
    String COLUMNNAME_City = "City";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name ContactDescription
     */
    String COLUMNNAME_ContactDescription = "ContactDescription";
    /**
     * Column name ContactName
     */
    String COLUMNNAME_ContactName = "ContactName";
    /**
     * Column name CountryCode
     */
    String COLUMNNAME_CountryCode = "CountryCode";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DUNS
     */
    String COLUMNNAME_DUNS = "DUNS";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name Fax
     */
    String COLUMNNAME_Fax = "Fax";
    /**
     * Column name GroupValue
     */
    String COLUMNNAME_GroupValue = "GroupValue";
    /**
     * Column name I_BPartner_ID
     */
    String COLUMNNAME_I_BPartner_ID = "I_BPartner_ID";
    /**
     * Column name I_BPartner_UU
     */
    String COLUMNNAME_I_BPartner_UU = "I_BPartner_UU";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name InterestAreaName
     */
    String COLUMNNAME_InterestAreaName = "InterestAreaName";
    /**
     * Column name IsCustomer
     */
    String COLUMNNAME_IsCustomer = "IsCustomer";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name IsVendor
     */
    String COLUMNNAME_IsVendor = "IsVendor";
    /**
     * Column name NAICS
     */
    String COLUMNNAME_NAICS = "NAICS";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name Phone2
     */
    String COLUMNNAME_Phone2 = "Phone2";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Postal_Add
     */
    String COLUMNNAME_Postal_Add = "Postal_Add";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name RegionName
     */
    String COLUMNNAME_RegionName = "RegionName";
    /**
     * Column name R_InterestArea_ID
     */
    String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
    /**
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";
    /**
     * Column name Title
     */
    String COLUMNNAME_Title = "Title";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    String COLUMNNAME_I_IsShipTo = "IsShipTo";
    String COLUMNNAME_I_IsBillTo = "IsBillTo";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getC_BP_Group_ID();

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Get Greeting. Greeting to print on correspondence
     */
    int getC_Greeting_ID();

    /**
     * Get Contact Name. Business Partner Contact Name
     */
    String getContactName();

    /**
     * Get Region. Identifies a geographical Region
     */
    int getC_Region_ID();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get D-U-N-S. Dun & Bradstreet Number
     */
    String getDUNS();

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Get NAICS/SIC. Standard Industry Code or its successor NAIC -
     * http://www.osha.gov/oshstats/sicser.html
     */
    String getNAICS();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Name 2. Additional Name
     */
    String getName2();

    /**
     * Get Interest Area. Interest Area or Topic
     */
    int getR_InterestArea_ID();

    /**
     * Get Tax ID. Tax Identification
     */
    String getTaxID();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

}
