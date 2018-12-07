package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for RV_BPartner
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_RV_BPartner extends HasName, HasName2 {

    /**
     * TableName=RV_BPartner
     */
    String Table_Name = "RV_BPartner";

    /**
     * AD_Table_ID=520
     */
    int Table_ID = 520;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AcqusitionCost
     */
    String COLUMNNAME_AcqusitionCost = "AcqusitionCost";
    /**
     * Column name ActualLifeTimeValue
     */
    String COLUMNNAME_ActualLifeTimeValue = "ActualLifeTimeValue";
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
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_OrgBP_ID
     */
    String COLUMNNAME_AD_OrgBP_ID = "AD_OrgBP_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_AD_Org_ID
     */
    String COLUMNNAME_AD_User_AD_Org_ID = "AD_User_AD_Org_ID";
    /**
     * Column name AD_User_C_BPartner_ID
     */
    String COLUMNNAME_AD_User_C_BPartner_ID = "AD_User_C_BPartner_ID";
    /**
     * Column name AD_User_C_BPartner_Location_ID
     */
    String COLUMNNAME_AD_User_C_BPartner_Location_ID =
            "AD_User_C_BPartner_Location_ID";
    /**
     * Column name ad_user_created
     */
    String COLUMNNAME_ad_user_created = "ad_user_created";
    /**
     * Column name AD_User_CreatedBy
     */
    String COLUMNNAME_AD_User_CreatedBy = "AD_User_CreatedBy";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name ad_user_isactive
     */
    String COLUMNNAME_ad_user_isactive = "ad_user_isactive";
    /**
     * Column name ad_user_updated
     */
    String COLUMNNAME_ad_user_updated = "ad_user_updated";
    /**
     * Column name AD_User_UpdatedBy
     */
    String COLUMNNAME_AD_User_UpdatedBy = "AD_User_UpdatedBy";
    /**
     * Column name ad_user_value
     */
    String COLUMNNAME_ad_user_value = "ad_user_value";
    /**
     * Column name Birthday
     */
    String COLUMNNAME_Birthday = "Birthday";
    /**
     * Column name BPartner_Parent_ID
     */
    String COLUMNNAME_BPartner_Parent_ID = "BPartner_Parent_ID";
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
     * Column name C_BP_C_TaxGroup_ID
     */
    String COLUMNNAME_C_BP_C_TaxGroup_ID = "C_BP_C_TaxGroup_ID";
    /**
     * Column name c_bp_dunninggrace
     */
    String COLUMNNAME_c_bp_dunninggrace = "c_bp_dunninggrace";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name c_bp_ismanufacturer
     */
    String COLUMNNAME_c_bp_ismanufacturer = "c_bp_ismanufacturer";
    /**
     * Column name c_bp_ispotaxexempt
     */
    String COLUMNNAME_c_bp_ispotaxexempt = "c_bp_ispotaxexempt";
    /**
     * Column name C_BP_Location_AD_Org_ID
     */
    String COLUMNNAME_C_BP_Location_AD_Org_ID = "C_BP_Location_AD_Org_ID";
    /**
     * Column name C_BP_Location_C_BPartner_ID
     */
    String COLUMNNAME_C_BP_Location_C_BPartner_ID = "C_BP_Location_C_BPartner_ID";
    /**
     * Column name C_BP_Location_C_Location_ID
     */
    String COLUMNNAME_C_BP_Location_C_Location_ID = "C_BP_Location_C_Location_ID";
    /**
     * Column name c_bp_location_created
     */
    String COLUMNNAME_c_bp_location_created = "c_bp_location_created";
    /**
     * Column name C_BP_Location_CreatedBy
     */
    String COLUMNNAME_C_BP_Location_CreatedBy = "C_BP_Location_CreatedBy";
    /**
     * Column name c_bp_location_fax
     */
    String COLUMNNAME_c_bp_location_fax = "c_bp_location_fax";
    /**
     * Column name c_bp_location_isactive
     */
    String COLUMNNAME_c_bp_location_isactive = "c_bp_location_isactive";
    /**
     * Column name c_bp_location_isbillto
     */
    String COLUMNNAME_c_bp_location_isbillto = "c_bp_location_isbillto";
    /**
     * Column name c_bp_location_isdn
     */
    String COLUMNNAME_c_bp_location_isdn = "c_bp_location_isdn";
    /**
     * Column name c_bp_location_ispayfrom
     */
    String COLUMNNAME_c_bp_location_ispayfrom = "c_bp_location_ispayfrom";
    /**
     * Column name c_bp_location_isremitto
     */
    String COLUMNNAME_c_bp_location_isremitto = "c_bp_location_isremitto";
    /**
     * Column name c_bp_location_isshipto
     */
    String COLUMNNAME_c_bp_location_isshipto = "c_bp_location_isshipto";
    /**
     * Column name c_bp_location_name
     */
    String COLUMNNAME_c_bp_location_name = "c_bp_location_name";
    /**
     * Column name c_bp_location_phone
     */
    String COLUMNNAME_c_bp_location_phone = "c_bp_location_phone";
    /**
     * Column name c_bp_location_phone2
     */
    String COLUMNNAME_c_bp_location_phone2 = "c_bp_location_phone2";
    /**
     * Column name C_BP_Location_SalesRegion_ID
     */
    String COLUMNNAME_C_BP_Location_SalesRegion_ID =
            "C_BP_Location_SalesRegion_ID";
    /**
     * Column name c_bp_location_updated
     */
    String COLUMNNAME_c_bp_location_updated = "c_bp_location_updated";
    /**
     * Column name C_BP_Location_UpdatedBy
     */
    String COLUMNNAME_C_BP_Location_UpdatedBy = "C_BP_Location_UpdatedBy";
    /**
     * Column name C_BP_Logo_ID
     */
    String COLUMNNAME_C_BP_Logo_ID = "C_BP_Logo_ID";
    /**
     * Column name C_City_ID
     */
    String COLUMNNAME_C_City_ID = "C_City_ID";
    /**
     * Column name c_country_ad_language
     */
    String COLUMNNAME_c_country_ad_language = "c_country_ad_language";
    /**
     * Column name C_Country_C_Currency_ID
     */
    String COLUMNNAME_C_Country_C_Currency_ID = "C_Country_C_Currency_ID";
    /**
     * Column name c_country_description
     */
    String COLUMNNAME_c_country_description = "c_country_description";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name c_country_isactive
     */
    String COLUMNNAME_c_country_isactive = "c_country_isactive";
    /**
     * Column name C_Dunning_ID
     */
    String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
    /**
     * Column name C_Greeting_ID
     */
    String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
    /**
     * Column name C_InvoiceSchedule_ID
     */
    String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
    /**
     * Column name City
     */
    String COLUMNNAME_City = "City";
    /**
     * Column name C_Location_AD_Org_ID
     */
    String COLUMNNAME_C_Location_AD_Org_ID = "C_Location_AD_Org_ID";
    /**
     * Column name c_location_created
     */
    String COLUMNNAME_c_location_created = "c_location_created";
    /**
     * Column name C_Location_CreatedBy
     */
    String COLUMNNAME_C_Location_CreatedBy = "C_Location_CreatedBy";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name c_location_isactive
     */
    String COLUMNNAME_c_location_isactive = "c_location_isactive";
    /**
     * Column name c_location_updated
     */
    String COLUMNNAME_c_location_updated = "c_location_updated";
    /**
     * Column name C_Location_UpdatedBy
     */
    String COLUMNNAME_C_Location_UpdatedBy = "C_Location_UpdatedBy";
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
     * Column name CountryName
     */
    String COLUMNNAME_CountryName = "CountryName";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Region_AD_Org_ID
     */
    String COLUMNNAME_C_Region_AD_Org_ID = "C_Region_AD_Org_ID";
    /**
     * Column name C_Region_C_Country_ID
     */
    String COLUMNNAME_C_Region_C_Country_ID = "C_Region_C_Country_ID";
    /**
     * Column name c_region_description
     */
    String COLUMNNAME_c_region_description = "c_region_description";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name c_region_isactive
     */
    String COLUMNNAME_c_region_isactive = "c_region_isactive";
    /**
     * Column name DeliveryRule
     */
    String COLUMNNAME_DeliveryRule = "DeliveryRule";
    /**
     * Column name DeliveryViaRule
     */
    String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentCopies
     */
    String COLUMNNAME_DocumentCopies = "DocumentCopies";
    /**
     * Column name DUNS
     */
    String COLUMNNAME_DUNS = "DUNS";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name EMailUser
     */
    String COLUMNNAME_EMailUser = "EMailUser";
    /**
     * Column name EMailVerify
     */
    String COLUMNNAME_EMailVerify = "EMailVerify";
    /**
     * Column name EMailVerifyDate
     */
    String COLUMNNAME_EMailVerifyDate = "EMailVerifyDate";
    /**
     * Column name Fax
     */
    String COLUMNNAME_Fax = "Fax";
    /**
     * Column name FirstSale
     */
    String COLUMNNAME_FirstSale = "FirstSale";
    /**
     * Column name FlatDiscount
     */
    String COLUMNNAME_FlatDiscount = "FlatDiscount";
    /**
     * Column name FreightCostRule
     */
    String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name Invoice_PrintFormat_ID
     */
    String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
    /**
     * Column name InvoiceRule
     */
    String COLUMNNAME_InvoiceRule = "InvoiceRule";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCustomer
     */
    String COLUMNNAME_IsCustomer = "IsCustomer";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsDiscountPrinted
     */
    String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name IsOneTime
     */
    String COLUMNNAME_IsOneTime = "IsOneTime";
    /**
     * Column name IsProspect
     */
    String COLUMNNAME_IsProspect = "IsProspect";
    /**
     * Column name IsSalesRep
     */
    String COLUMNNAME_IsSalesRep = "IsSalesRep";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name IsTaxExempt
     */
    String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
    /**
     * Column name IsVendor
     */
    String COLUMNNAME_IsVendor = "IsVendor";
    /**
     * Column name LastContact
     */
    String COLUMNNAME_LastContact = "LastContact";
    /**
     * Column name LastResult
     */
    String COLUMNNAME_LastResult = "LastResult";
    /**
     * Column name LDAPUser
     */
    String COLUMNNAME_LDAPUser = "LDAPUser";
    /**
     * Column name M_DiscountSchema_ID
     */
    String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name NAICS
     */
    String COLUMNNAME_NAICS = "NAICS";
    /**
     * Column name NotificationType
     */
    String COLUMNNAME_NotificationType = "NotificationType";
    /**
     * Column name NumberEmployees
     */
    String COLUMNNAME_NumberEmployees = "NumberEmployees";
    /**
     * Column name PaymentRule
     */
    String COLUMNNAME_PaymentRule = "PaymentRule";
    /**
     * Column name PaymentRulePO
     */
    String COLUMNNAME_PaymentRulePO = "PaymentRulePO";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name Phone2
     */
    String COLUMNNAME_Phone2 = "Phone2";
    /**
     * Column name PO_DiscountSchema_ID
     */
    String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
    /**
     * Column name PO_PaymentTerm_ID
     */
    String COLUMNNAME_PO_PaymentTerm_ID = "PO_PaymentTerm_ID";
    /**
     * Column name PO_PriceList_ID
     */
    String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
    /**
     * Column name POReference
     */
    String COLUMNNAME_POReference = "POReference";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Postal_Add
     */
    String COLUMNNAME_Postal_Add = "Postal_Add";
    /**
     * Column name PotentialLifeTimeValue
     */
    String COLUMNNAME_PotentialLifeTimeValue = "PotentialLifeTimeValue";
    /**
     * Column name Rating
     */
    String COLUMNNAME_Rating = "Rating";
    /**
     * Column name ReferenceNo
     */
    String COLUMNNAME_ReferenceNo = "ReferenceNo";
    /**
     * Column name RegionName
     */
    String COLUMNNAME_RegionName = "RegionName";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name SalesVolume
     */
    String COLUMNNAME_SalesVolume = "SalesVolume";
    /**
     * Column name SendEMail
     */
    String COLUMNNAME_SendEMail = "SendEMail";
    /**
     * Column name ShareOfCustomer
     */
    String COLUMNNAME_ShareOfCustomer = "ShareOfCustomer";
    /**
     * Column name ShelfLifeMinPct
     */
    String COLUMNNAME_ShelfLifeMinPct = "ShelfLifeMinPct";
    /**
     * Column name SO_CreditAvailable
     */
    String COLUMNNAME_SO_CreditAvailable = "SO_CreditAvailable";
    /**
     * Column name SO_CreditLimit
     */
    String COLUMNNAME_SO_CreditLimit = "SO_CreditLimit";
    /**
     * Column name SOCreditStatus
     */
    String COLUMNNAME_SOCreditStatus = "SOCreditStatus";
    /**
     * Column name SO_CreditUsed
     */
    String COLUMNNAME_SO_CreditUsed = "SO_CreditUsed";
    /**
     * Column name SO_Description
     */
    String COLUMNNAME_SO_Description = "SO_Description";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
    /**
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";
    /**
     * Column name Title
     */
    String COLUMNNAME_Title = "Title";
    /**
     * Column name TotalOpenBalance
     */
    String COLUMNNAME_TotalOpenBalance = "TotalOpenBalance";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Acquisition Cost. The cost of gaining the prospect as a customer
     */
    BigDecimal getAcqusitionCost();

    /**
     * Set Acquisition Cost. The cost of gaining the prospect as a customer
     */
    void setAcqusitionCost(BigDecimal AcqusitionCost);

    /**
     * Get Actual Life Time Value. Actual Life Time Revenue
     */
    BigDecimal getActualLifeTimeValue();

    /**
     * Set Actual Life Time Value. Actual Life Time Revenue
     */
    void setActualLifeTimeValue(BigDecimal ActualLifeTimeValue);

    /**
     * Get Address 1. Address line 1 for this location
     */
    String getAddress1();

    /**
     * Set Address 1. Address line 1 for this location
     */
    void setAddress1(String Address1);

    /**
     * Get Address 2. Address line 2 for this location
     */
    String getAddress2();

    /**
     * Set Address 2. Address line 2 for this location
     */
    void setAddress2(String Address2);

    /**
     * Get Address 3. Address Line 3 for the location
     */
    String getAddress3();

    /**
     * Set Address 3. Address Line 3 for the location
     */
    void setAddress3(String Address3);

    /**
     * Get Address 4. Address Line 4 for the location
     */
    String getAddress4();

    /**
     * Set Address 4. Address Line 4 for the location
     */
    void setAddress4(String Address4);

    /**
     * Get Language. Language for this entity
     */
    String getADLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setADLanguage(String AD_Language);

    /**
     * Get Linked Organization. The Business Partner is another Organization for explicit Inter-Org
     * transactions
     */
    int getAD_OrgBP_ID();

    /**
     * Set Linked Organization. The Business Partner is another Organization for explicit Inter-Org
     * transactions
     */
    void setAD_OrgBP_ID(int AD_OrgBP_ID);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get AD_User_AD_Org_ID
     */
    int getAD_User_AD_Org_ID();

    /**
     * Set AD_User_AD_Org_ID
     */
    void setAD_User_AD_Org_ID(int AD_User_AD_Org_ID);

    /**
     * Get AD_User_C_BPartner_ID
     */
    int getAD_User_C_BPartner_ID();

    /**
     * Set AD_User_C_BPartner_ID
     */
    void setAD_User_C_BPartner_ID(int AD_User_C_BPartner_ID);

    I_C_BPartner getAD_User_C_BPartner() throws RuntimeException;

    /**
     * Get AD_User_C_BPartner_Location_ID
     */
    int getAD_User_C_BPartner_Location_ID();

    /**
     * Set AD_User_C_BPartner_Location_ID
     */
    void setAD_User_C_BPartner_Location_ID(int AD_User_C_BPartner_Location_ID);

    I_C_BPartner_Location getAD_User_C_BPartner_Location() throws RuntimeException;

    /**
     * Set ad_user_created
     */
    void setad_user_created(Timestamp ad_user_created);

    /**
     * Get ad_user_created
     */
    Timestamp getad_user_created();

    /**
     * Get ad_user_createdby
     */
    int getAD_User_CreatedBy();

    /**
     * Set ad_user_createdby
     */
    void setAD_User_CreatedBy(int AD_User_CreatedBy);

    I_AD_User getAD_User_Create() throws RuntimeException;

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Set ad_user_isactive
     */
    void setad_user_isactive(boolean ad_user_isactive);

    /**
     * Get ad_user_isactive
     */
    boolean isad_user_isactive();

    /**
     * Set ad_user_updated
     */
    void setad_user_updated(Timestamp ad_user_updated);

    /**
     * Get ad_user_updated
     */
    Timestamp getad_user_updated();

    /**
     * Get ad_user_updatedby
     */
    int getAD_User_UpdatedBy();

    /**
     * Set ad_user_updatedby
     */
    void setAD_User_UpdatedBy(int AD_User_UpdatedBy);

    I_AD_User getAD_User_Update() throws RuntimeException;

    /**
     * Set ad_user_value
     */
    void setad_user_value(String ad_user_value);

    /**
     * Get ad_user_value
     */
    String getad_user_value();

    /**
     * Get Birthday. Birthday or Anniversary day
     */
    Timestamp getBirthday();

    /**
     * Set Birthday. Birthday or Anniversary day
     */
    void setBirthday(Timestamp Birthday);

    /**
     * Get Partner Parent. Business Partner Parent
     */
    int getBPartner_Parent_ID();

    /**
     * Set Partner Parent. Business Partner Parent
     */
    void setBPartner_Parent_ID(int BPartner_Parent_ID);

    I_C_BPartner getBPartner_Parent() throws RuntimeException;

    /**
     * Get BP Contact Greeting. Greeting for Business Partner Contact
     */
    int getBPContactGreeting();

    /**
     * Set BP Contact Greeting. Greeting for Business Partner Contact
     */
    void setBPContactGreeting(int BPContactGreeting);

    I_C_Greeting getBPContactGreet() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get c_bp_c_taxgroup_id
     */
    int getC_BP_C_TaxGroup_ID();

    /**
     * Set c_bp_c_taxgroup_id
     */
    void setC_BP_C_TaxGroup_ID(int C_BP_C_TaxGroup_ID);

    org.eevolution.model.I_C_TaxGroup getC_BP_C_TaxGroup() throws RuntimeException;

    /**
     * Get c_bp_dunninggrace
     */
    Timestamp getc_bp_dunninggrace();

    /**
     * Set c_bp_dunninggrace
     */
    void setc_bp_dunninggrace(Timestamp c_bp_dunninggrace);

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getC_BP_Group_ID();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    void setC_BP_Group_ID(int C_BP_Group_ID);

    I_C_BP_Group getC_BP_Group() throws RuntimeException;

    /**
     * Get c_bp_ismanufacturer
     */
    boolean isc_bp_ismanufacturer();

    /**
     * Set c_bp_ismanufacturer
     */
    void setc_bp_ismanufacturer(boolean c_bp_ismanufacturer);

    /**
     * Get c_bp_ispotaxexempt
     */
    boolean isc_bp_ispotaxexempt();

    /**
     * Set c_bp_ispotaxexempt
     */
    void setc_bp_ispotaxexempt(boolean c_bp_ispotaxexempt);

    /**
     * Get c_bp_location_ad_org_id
     */
    int getC_BP_Location_AD_Org_ID();

    /**
     * Set c_bp_location_ad_org_id
     */
    void setC_BP_Location_AD_Org_ID(int C_BP_Location_AD_Org_ID);

    /**
     * Get c_bpartner_location_c_bpartner_id
     */
    int getC_BP_Location_C_BPartner_ID();

    /**
     * Set c_bpartner_location_c_bpartner_id
     */
    void setC_BP_Location_C_BPartner_ID(int C_BP_Location_C_BPartner_ID);

    I_C_BPartner getC_BP_Location_C_BPartner() throws RuntimeException;

    /**
     * Get c_bp_location_c_location_id
     */
    int getC_BP_Location_C_Location_ID();

    /**
     * Set c_bp_location_c_location_id
     */
    void setC_BP_Location_C_Location_ID(int C_BP_Location_C_Location_ID);

    I_C_Location getC_BP_Location_C_Location() throws RuntimeException;

    /**
     * Get c_bp_location_created
     */
    Timestamp getc_bp_location_created();

    /**
     * Set c_bp_location_created
     */
    void setc_bp_location_created(Timestamp c_bp_location_created);

    /**
     * Get c_bp_location_createdby
     */
    int getC_BP_Location_CreatedBy();

    /**
     * Set c_bp_location_createdby
     */
    void setC_BP_Location_CreatedBy(int C_BP_Location_CreatedBy);

    I_AD_User getC_BP_Location_Create() throws RuntimeException;

    /**
     * Get c_bp_location_fax
     */
    String getc_bp_location_fax();

    /**
     * Set c_bp_location_fax
     */
    void setc_bp_location_fax(String c_bp_location_fax);

    /**
     * Get c_bp_location_isactive
     */
    boolean isc_bp_location_isactive();

    /**
     * Set c_bp_location_isactive
     */
    void setc_bp_location_isactive(boolean c_bp_location_isactive);

    /**
     * Get c_bp_location_isbillto
     */
    boolean isc_bp_location_isbillto();

    /**
     * Set c_bp_location_isbillto
     */
    void setc_bp_location_isbillto(boolean c_bp_location_isbillto);

    /**
     * Get c_bp_location_isdn
     */
    String getc_bp_location_isdn();

    /**
     * Set c_bp_location_isdn
     */
    void setc_bp_location_isdn(String c_bp_location_isdn);

    /**
     * Get c_bp_location_ispayfrom
     */
    boolean isc_bp_location_ispayfrom();

    /**
     * Set c_bp_location_ispayfrom
     */
    void setc_bp_location_ispayfrom(boolean c_bp_location_ispayfrom);

    /**
     * Get c_bp_location_isremitto
     */
    boolean isc_bp_location_isremitto();

    /**
     * Set c_bp_location_isremitto
     */
    void setc_bp_location_isremitto(boolean c_bp_location_isremitto);

    /**
     * Get c_bp_location_isshipto
     */
    boolean isc_bp_location_isshipto();

    /**
     * Set c_bp_location_isshipto
     */
    void setc_bp_location_isshipto(boolean c_bp_location_isshipto);

    /**
     * Get c_bp_location_name
     */
    String getc_bp_location_name();

    /**
     * Set c_bp_location_name
     */
    void setc_bp_location_name(String c_bp_location_name);

    /**
     * Get c_bp_location_phone
     */
    String getc_bp_location_phone();

    /**
     * Set c_bp_location_phone
     */
    void setc_bp_location_phone(String c_bp_location_phone);

    /**
     * Get c_bp_location_phone2
     */
    String getc_bp_location_phone2();

    /**
     * Set c_bp_location_phone2
     */
    void setc_bp_location_phone2(String c_bp_location_phone2);

    /**
     * Get c_bp_location_salesregion_id
     */
    int getC_BP_Location_SalesRegion_ID();

    /**
     * Set c_bp_location_salesregion_id
     */
    void setC_BP_Location_SalesRegion_ID(int C_BP_Location_SalesRegion_ID);

    I_C_SalesRegion getC_BP_Location_SalesRegion() throws RuntimeException;

    /**
     * Get c_bp_location_updated
     */
    Timestamp getc_bp_location_updated();

    /**
     * Set c_bp_location_updated
     */
    void setc_bp_location_updated(Timestamp c_bp_location_updated);

    /**
     * Get c_bp_location_updatedby
     */
    int getC_BP_Location_UpdatedBy();

    /**
     * Set c_bp_location_updatedby
     */
    void setC_BP_Location_UpdatedBy(int C_BP_Location_UpdatedBy);

    I_AD_User getC_BP_Location_Update() throws RuntimeException;

    /**
     * Get c_bp_logo_id
     */
    int getC_BP_Logo_ID();

    /**
     * Set c_bp_logo_id
     */
    void setC_BP_Logo_ID(int C_BP_Logo_ID);

    /**
     * Get City. City
     */
    int getC_City_ID();

    /**
     * Set City. City
     */
    void setC_City_ID(int C_City_ID);

    I_C_City getC_City() throws RuntimeException;

    /**
     * Get c_country_ad_language
     */
    String getc_country_ad_language();

    /**
     * Set c_country_ad_language
     */
    void setc_country_ad_language(String c_country_ad_language);

    /**
     * Get c_country_c_currency_id
     */
    int getC_Country_C_Currency_ID();

    /**
     * Set c_country_c_currency_id
     */
    void setC_Country_C_Currency_ID(int C_Country_C_Currency_ID);

    I_C_Currency getC_Country_C_Currency() throws RuntimeException;

    /**
     * Get c_country_description
     */
    String getc_country_description();

    /**
     * Set c_country_description
     */
    void setc_country_description(String c_country_description);

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Set Country. Country
     */
    void setC_Country_ID(int C_Country_ID);

    I_C_Country getC_Country() throws RuntimeException;

    /**
     * Get c_country_isactive
     */
    boolean isc_country_isactive();

    /**
     * Set c_country_isactive
     */
    void setc_country_isactive(boolean c_country_isactive);

    /**
     * Get Dunning. Dunning Rules for overdue invoices
     */
    int getC_Dunning_ID();

    /**
     * Set Dunning. Dunning Rules for overdue invoices
     */
    void setC_Dunning_ID(int C_Dunning_ID);

    I_C_Dunning getC_Dunning() throws RuntimeException;

    /**
     * Get Greeting. Greeting to print on correspondence
     */
    int getC_Greeting_ID();

    /**
     * Set Greeting. Greeting to print on correspondence
     */
    void setC_Greeting_ID(int C_Greeting_ID);

    I_C_Greeting getC_Greeting() throws RuntimeException;

    /**
     * Get Invoice Schedule. Schedule for generating Invoices
     */
    int getC_InvoiceSchedule_ID();

    /**
     * Set Invoice Schedule. Schedule for generating Invoices
     */
    void setC_InvoiceSchedule_ID(int C_InvoiceSchedule_ID);

    I_C_InvoiceSchedule getC_InvoiceSchedule() throws RuntimeException;

    /**
     * Get City. Identifies a City
     */
    String getCity();

    /**
     * Set City. Identifies a City
     */
    void setCity(String City);

    /**
     * Get c_location_ad_org_id
     */
    int getC_Location_AD_Org_ID();

    /**
     * Set c_location_ad_org_id
     */
    void setC_Location_AD_Org_ID(int C_Location_AD_Org_ID);

    /**
     * Get c_location_created
     */
    Timestamp getc_location_created();

    /**
     * Set c_location_created
     */
    void setc_location_created(Timestamp c_location_created);

    /**
     * Get c_location_createdby
     */
    int getC_Location_CreatedBy();

    /**
     * Set c_location_createdby
     */
    void setC_Location_CreatedBy(int C_Location_CreatedBy);

    I_AD_User getC_Location_Create() throws RuntimeException;

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Set Address. Location or Address
     */
    void setC_Location_ID(int C_Location_ID);

    I_C_Location getC_Location() throws RuntimeException;

    /**
     * Get c_location_isactive
     */
    boolean isc_location_isactive();

    /**
     * Set c_location_isactive
     */
    void setc_location_isactive(boolean c_location_isactive);

    /**
     * Get c_location_updated
     */
    Timestamp getc_location_updated();

    /**
     * Set c_location_updated
     */
    void setc_location_updated(Timestamp c_location_updated);

    /**
     * Get c_location_updatedby
     */
    int getC_Location_UpdatedBy();

    /**
     * Set c_location_updatedby
     */
    void setC_Location_UpdatedBy(int C_Location_UpdatedBy);

    I_AD_User getC_Location_Update() throws RuntimeException;

    /**
     * Get Comments. Comments or additional information
     */
    String getComments();

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Get Contact Description. Description of Contact
     */
    String getContactDescription();

    /**
     * Set Contact Description. Description of Contact
     */
    void setContactDescription(String ContactDescription);

    /**
     * Get Contact Name. Business Partner Contact Name
     */
    String getContactName();

    /**
     * Set Contact Name. Business Partner Contact Name
     */
    void setContactName(String ContactName);

    /**
     * Get ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    String getCountryCode();

    /**
     * Set ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    void setCountryCode(String CountryCode);

    /**
     * Get Country. Country Name
     */
    String getCountryName();

    /**
     * Set Country. Country Name
     */
    void setCountryName(String CountryName);

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getC_PaymentTerm_ID();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

    I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get c_region_ad_org_id
     */
    int getC_Region_AD_Org_ID();

    /**
     * Set c_region_ad_org_id
     */
    void setC_Region_AD_Org_ID(int C_Region_AD_Org_ID);

    /**
     * Get c_region_c_country_id
     */
    int getC_Region_C_Country_ID();

    /**
     * Set c_region_c_country_id
     */
    void setC_Region_C_Country_ID(int C_Region_C_Country_ID);

    /**
     * Get c_region_description
     */
    String getc_region_description();

    /**
     * Set c_region_description
     */
    void setc_region_description(String c_region_description);

    /**
     * Get Region. Identifies a geographical Region
     */
    int getC_Region_ID();

    /**
     * Set Region. Identifies a geographical Region
     */
    void setC_Region_ID(int C_Region_ID);

    I_C_Region getC_Region() throws RuntimeException;

    /**
     * Get c_region_isactive
     */
    boolean isc_region_isactive();

    /**
     * Set c_region_isactive
     */
    void setc_region_isactive(boolean c_region_isactive);

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    String getDeliveryRule();

    /**
     * Set Delivery Rule. Defines the timing of Delivery
     */
    void setDeliveryRule(String DeliveryRule);

    /**
     * Get Delivery Via. How the order will be delivered
     */
    String getDeliveryViaRule();

    /**
     * Set Delivery Via. How the order will be delivered
     */
    void setDeliveryViaRule(String DeliveryViaRule);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Copies. Number of copies to be printed
     */
    int getDocumentCopies();

    /**
     * Set Document Copies. Number of copies to be printed
     */
    void setDocumentCopies(int DocumentCopies);

    /**
     * Get D-U-N-S. Dun & Bradstreet Number
     */
    String getDUNS();

    /**
     * Set D-U-N-S. Dun & Bradstreet Number
     */
    void setDUNS(String DUNS);

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Get EMail User ID. User Name (ID) in the Mail System
     */
    String getEMailUser();

    /**
     * Set EMail User ID. User Name (ID) in the Mail System
     */
    void setEMailUser(String EMailUser);

    /**
     * Get Verification Info. Verification information of EMail Address
     */
    String getEMailVerify();

    /**
     * Set Verification Info. Verification information of EMail Address
     */
    void setEMailVerify(String EMailVerify);

    /**
     * Get EMail Verify. Date Email was verified
     */
    Timestamp getEMailVerifyDate();

    /**
     * Set EMail Verify. Date Email was verified
     */
    void setEMailVerifyDate(Timestamp EMailVerifyDate);

    /**
     * Get Fax. Facsimile number
     */
    String getFax();

    /**
     * Set Fax. Facsimile number
     */
    void setFax(String Fax);

    /**
     * Get First Sale. Date of First Sale
     */
    Timestamp getFirstSale();

    /**
     * Set First Sale. Date of First Sale
     */
    void setFirstSale(Timestamp FirstSale);

    /**
     * Get Flat Discount %. Flat discount percentage
     */
    BigDecimal getFlatDiscount();

    /**
     * Set Flat Discount %. Flat discount percentage
     */
    void setFlatDiscount(BigDecimal FlatDiscount);

    /**
     * Get Freight Cost Rule. Method for charging Freight
     */
    String getFreightCostRule();

    /**
     * Set Freight Cost Rule. Method for charging Freight
     */
    void setFreightCostRule(String FreightCostRule);

    /**
     * Get Invoice Print Format. Print Format for printing Invoices
     */
    int getInvoice_PrintFormat_ID();

    /**
     * Set Invoice Print Format. Print Format for printing Invoices
     */
    void setInvoice_PrintFormat_ID(int Invoice_PrintFormat_ID);

    I_AD_PrintFormat getInvoice_PrintFormat() throws RuntimeException;

    /**
     * Get Invoice Rule. Frequency and method of invoicing
     */
    String getInvoiceRule();

    /**
     * Set Invoice Rule. Frequency and method of invoicing
     */
    void setInvoiceRule(String InvoiceRule);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Customer. Indicates if this Business Partner is a Customer
     */
    void setIsCustomer(boolean IsCustomer);

    /**
     * Get Customer. Indicates if this Business Partner is a Customer
     */
    boolean isCustomer();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Discount Printed. Print Discount on Invoice and Order
     */
    void setIsDiscountPrinted(boolean IsDiscountPrinted);

    /**
     * Get Discount Printed. Print Discount on Invoice and Order
     */
    boolean isDiscountPrinted();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    void setIsEmployee(boolean IsEmployee);

    /**
     * Get Employee. Indicates if this Business Partner is an employee
     */
    boolean isEmployee();

    /**
     * Set One time transaction
     */
    void setIsOneTime(boolean IsOneTime);

    /**
     * Get One time transaction
     */
    boolean isOneTime();

    /**
     * Set Prospect. Indicates this is a Prospect
     */
    void setIsProspect(boolean IsProspect);

    /**
     * Get Prospect. Indicates this is a Prospect
     */
    boolean isProspect();

    /**
     * Set Sales Representative. Indicates if the business partner is a sales representative or
     * company agent
     */
    void setIsSalesRep(boolean IsSalesRep);

    /**
     * Get Sales Representative. Indicates if the business partner is a sales representative or
     * company agent
     */
    boolean isSalesRep();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Set SO Tax exempt. Business partner is exempt from tax on sales
     */
    void setIsTaxExempt(boolean IsTaxExempt);

    /**
     * Get SO Tax exempt. Business partner is exempt from tax on sales
     */
    boolean isTaxExempt();

    /**
     * Set Vendor. Indicates if this Business Partner is a Vendor
     */
    void setIsVendor(boolean IsVendor);

    /**
     * Get Vendor. Indicates if this Business Partner is a Vendor
     */
    boolean isVendor();

    /**
     * Get Last Contact. Date this individual was last contacted
     */
    Timestamp getLastContact();

    /**
     * Set Last Contact. Date this individual was last contacted
     */
    void setLastContact(Timestamp LastContact);

    /**
     * Get Last Result. Result of last contact
     */
    String getLastResult();

    /**
     * Set Last Result. Result of last contact
     */
    void setLastResult(String LastResult);

    /**
     * Get LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    boolean isLDAPUser();

    /**
     * Set LDAP User Name. User Name used for authorization via LDAP (directory) services
     */
    void setLDAPUser(boolean LDAPUser);

    /**
     * Get Discount Schema. Schema to calculate the trade discount percentage
     */
    int getM_DiscountSchema_ID();

    /**
     * Set Discount Schema. Schema to calculate the trade discount percentage
     */
    void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

    I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getM_PriceList_ID();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setM_PriceList_ID(int M_PriceList_ID);

    I_M_PriceList getM_PriceList() throws RuntimeException;

    /**
     * Get NAICS/SIC. Standard Industry Code or its successor NAIC -
     * http://www.osha.gov/oshstats/sicser.html
     */
    String getNAICS();

    /**
     * Set NAICS/SIC. Standard Industry Code or its successor NAIC -
     * http://www.osha.gov/oshstats/sicser.html
     */
    void setNAICS(String NAICS);

    /**
     * Get Notification Type. Type of Notifications
     */
    String getNotificationType();

    /**
     * Set Notification Type. Type of Notifications
     */
    void setNotificationType(String NotificationType);

    /**
     * Get Employees. Number of employees
     */
    int getNumberEmployees();

    /**
     * Set Employees. Number of employees
     */
    void setNumberEmployees(int NumberEmployees);

    /**
     * Get Payment Rule. How you pay the invoice
     */
    String getPaymentRule();

    /**
     * Set Payment Rule. How you pay the invoice
     */
    void setPaymentRule(String PaymentRule);

    /**
     * Get Payment Rule. Purchase payment option
     */
    String getPaymentRulePO();

    /**
     * Set Payment Rule. Purchase payment option
     */
    void setPaymentRulePO(String PaymentRulePO);

    /**
     * Get Phone. Identifies a telephone number
     */
    String getPhone();

    /**
     * Set Phone. Identifies a telephone number
     */
    void setPhone(String Phone);

    /**
     * Get 2nd Phone. Identifies an alternate telephone number.
     */
    String getPhone2();

    /**
     * Set 2nd Phone. Identifies an alternate telephone number.
     */
    void setPhone2(String Phone2);

    /**
     * Get PO Discount Schema. Schema to calculate the purchase trade discount percentage
     */
    int getPO_DiscountSchema_ID();

    /**
     * Set PO Discount Schema. Schema to calculate the purchase trade discount percentage
     */
    void setPO_DiscountSchema_ID(int PO_DiscountSchema_ID);

    I_M_DiscountSchema getPO_DiscountSchema() throws RuntimeException;

    /**
     * Get PO Payment Term. Payment rules for a purchase order
     */
    int getPO_PaymentTerm_ID();

    /**
     * Set PO Payment Term. Payment rules for a purchase order
     */
    void setPO_PaymentTerm_ID(int PO_PaymentTerm_ID);

    I_C_PaymentTerm getPO_PaymentTerm() throws RuntimeException;

    /**
     * Get Purchase Pricelist. Price List used by this Business Partner
     */
    int getPO_PriceList_ID();

    /**
     * Set Purchase Pricelist. Price List used by this Business Partner
     */
    void setPO_PriceList_ID(int PO_PriceList_ID);

    I_M_PriceList getPO_PriceList() throws RuntimeException;

    /**
     * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    String getPOReference();

    /**
     * Set Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    void setPOReference(String POReference);

    /**
     * Get ZIP. Postal code
     */
    String getPostal();

    /**
     * Set ZIP. Postal code
     */
    void setPostal(String Postal);

    /**
     * Get Additional Zip. Additional ZIP or Postal code
     */
    String getPostal_Add();

    /**
     * Set Additional Zip. Additional ZIP or Postal code
     */
    void setPostal_Add(String Postal_Add);

    /**
     * Get Potential Life Time Value. Total Revenue expected
     */
    BigDecimal getPotentialLifeTimeValue();

    /**
     * Set Potential Life Time Value. Total Revenue expected
     */
    void setPotentialLifeTimeValue(BigDecimal PotentialLifeTimeValue);

    /**
     * Get Rating. Classification or Importance
     */
    String getRating();

    /**
     * Set Rating. Classification or Importance
     */
    void setRating(String Rating);

    /**
     * Get Reference No. Your customer or vendor number at the Business Partner's site
     */
    String getReferenceNo();

    /**
     * Set Reference No. Your customer or vendor number at the Business Partner's site
     */
    void setReferenceNo(String ReferenceNo);

    /**
     * Get Region. Name of the Region
     */
    String getRegionName();

    /**
     * Set Region. Name of the Region
     */
    void setRegionName(String RegionName);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency
     */
    BigDecimal getSalesVolume();

    /**
     * Set Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency
     */
    void setSalesVolume(BigDecimal SalesVolume);

    /**
     * Get Send EMail. Enable sending Document EMail
     */
    boolean isSendEMail();

    /**
     * Set Send EMail. Enable sending Document EMail
     */
    void setSendEMail(boolean SendEMail);

    /**
     * Get Share. Share of Customer's business as a percentage
     */
    int getShareOfCustomer();

    /**
     * Set Share. Share of Customer's business as a percentage
     */
    void setShareOfCustomer(int ShareOfCustomer);

    /**
     * Get Min Shelf Life %. Minimum Shelf Life in percent based on Product Instance Guarantee Date
     */
    int getShelfLifeMinPct();

    /**
     * Set Min Shelf Life %. Minimum Shelf Life in percent based on Product Instance Guarantee Date
     */
    void setShelfLifeMinPct(int ShelfLifeMinPct);

    /**
     * Get Credit Available. Available Credit based on Credit Limit (not Total Open Balance) and
     * Credit Used
     */
    BigDecimal getSO_CreditAvailable();

    /**
     * Set Credit Available. Available Credit based on Credit Limit (not Total Open Balance) and
     * Credit Used
     */
    void setSO_CreditAvailable(BigDecimal SO_CreditAvailable);

    /**
     * Get Credit Limit. Total outstanding invoice amounts allowed
     */
    BigDecimal getSO_CreditLimit();

    /**
     * Set Credit Limit. Total outstanding invoice amounts allowed
     */
    void setSO_CreditLimit(BigDecimal SO_CreditLimit);

    /**
     * Get Credit Status. Business Partner Credit Status
     */
    String getSOCreditStatus();

    /**
     * Set Credit Status. Business Partner Credit Status
     */
    void setSOCreditStatus(String SOCreditStatus);

    /**
     * Get Credit Used. Current open balance
     */
    BigDecimal getSO_CreditUsed();

    /**
     * Set Credit Used. Current open balance
     */
    void setSO_CreditUsed(BigDecimal SO_CreditUsed);

    /**
     * Get Order Description. Description to be used on orders
     */
    String getSO_Description();

    /**
     * Set Order Description. Description to be used on orders
     */
    void setSO_Description(String SO_Description);

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisor_ID();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisor_ID(int Supervisor_ID);

    I_AD_User getSupervisor() throws RuntimeException;

    /**
     * Get Tax ID. Tax Identification
     */
    String getTaxID();

    /**
     * Set Tax ID. Tax Identification
     */
    void setTaxID(String TaxID);

    /**
     * Get Title. Name this entity is referred to as
     */
    String getTitle();

    /**
     * Set Title. Name this entity is referred to as
     */
    void setTitle(String Title);

    /**
     * Get Open Balance. Total Open Balance Amount in primary Accounting Currency
     */
    BigDecimal getTotalOpenBalance();

    /**
     * Set Open Balance. Total Open Balance Amount in primary Accounting Currency
     */
    void setTotalOpenBalance(BigDecimal TotalOpenBalance);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get URL. Full URL address - e.g. http://www.idempiere.org
     */
    String getURL();

    /**
     * Set URL. Full URL address - e.g. http://www.idempiere.org
     */
    void setURL(String URL);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
