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
     * AD_Table_ID=533
     */
    int Table_ID = 533;

    /** TableName=I_BPartner */
    String Table_Name = "I_BPartner";

    String COLUMNNAME_I_IsShipTo = "IsShipTo";
    String COLUMNNAME_I_IsBillTo = "IsBillTo";

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Column name I_BPartner_ID */
    String COLUMNNAME_I_BPartner_ID = "I_BPartner_ID";


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
     * Column name ContactName
     */
    String COLUMNNAME_ContactName = "ContactName";
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
     * Column name NAICS
     */
    String COLUMNNAME_NAICS = "NAICS";
    /**
     * Column name R_InterestArea_ID
     */
    String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
    /**
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getBPGroupId();

    /**
     * Get Contact Name. Business Partner Contact Name
     */
    String getContactName();

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
     * Get Tax ID. Tax Identification
     */
    String getTaxID();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

}
