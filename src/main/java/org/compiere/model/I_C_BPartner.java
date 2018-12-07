package org.compiere.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;
import software.hsharp.core.models.INamedEntity;
import software.hsharp.core.models.ISearchableByKey;

/**
 * Generated Interface for C_BPartner
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner extends ISearchableByKey, INamedEntity, Serializable, IPO {

    /**
     * TableName=C_BPartner
     */
    String Table_Name = "C_BPartner";

    /**
     * AD_Table_ID=291
     */
    int Table_ID = 291;

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
     * Column name BPartner_Parent_ID
     */
    String COLUMNNAME_BPartner_Parent_ID = "BPartner_Parent_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_UU
     */
    String COLUMNNAME_C_BPartner_UU = "C_BPartner_UU";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
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
     * Column name C_TaxGroup_ID
     */
    String COLUMNNAME_C_TaxGroup_ID = "C_TaxGroup_ID";
    /**
     * Column name CustomerProfileID
     */
    String COLUMNNAME_CustomerProfileID = "CustomerProfileID";
    /**
     * Column name Default1099Box_ID
     */
    String COLUMNNAME_Default1099Box_ID = "Default1099Box_ID";
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
     * Column name DunningGrace
     */
    String COLUMNNAME_DunningGrace = "DunningGrace";
    /**
     * Column name DUNS
     */
    String COLUMNNAME_DUNS = "DUNS";
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
     * Column name Is1099Vendor
     */
    String COLUMNNAME_Is1099Vendor = "Is1099Vendor";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCustomer
     */
    String COLUMNNAME_IsCustomer = "IsCustomer";
    /**
     * Column name IsDiscountPrinted
     */
    String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";
    /**
     * Column name IsManufacturer
     */
    String COLUMNNAME_IsManufacturer = "IsManufacturer";
    /**
     * Column name IsOneTime
     */
    String COLUMNNAME_IsOneTime = "IsOneTime";
    /**
     * Column name IsPOTaxExempt
     */
    String COLUMNNAME_IsPOTaxExempt = "IsPOTaxExempt";
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
     * Column name Logo_ID
     */
    String COLUMNNAME_Logo_ID = "Logo_ID";
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
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";
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
    String getAD_OrgBP_ID();

    /**
     * Set Linked Organization. The Business Partner is another Organization for explicit Inter-Org
     * transactions
     */
    void setAD_OrgBP_ID(String AD_OrgBP_ID);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Partner Parent. Business Partner Parent
     */
    int getBPartner_Parent_ID();

    /**
     * Set Partner Parent. Business Partner Parent
     */
    void setBPartner_Parent_ID(int BPartner_Parent_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get C_BPartner_UU
     */
    String getC_BPartner_UU();

    /**
     * Set C_BPartner_UU
     */
    void setC_BPartner_UU(String C_BPartner_UU);

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
     * Get Tax Group
     */
    int getC_TaxGroup_ID();

    /**
     * Set Tax Group
     */
    void setC_TaxGroup_ID(int C_TaxGroup_ID);

    org.eevolution.model.I_C_TaxGroup getC_TaxGroup() throws RuntimeException;

    /**
     * Get Customer Profile ID
     */
    String getCustomerProfileID();

    /**
     * Set Customer Profile ID
     */
    void setCustomerProfileID(String CustomerProfileID);

    /**
     * Get Default 1099 Box
     */
    int getDefault1099Box_ID();

    /**
     * Set Default 1099 Box
     */
    void setDefault1099Box_ID(int Default1099Box_ID);

    I_C_1099Box getDefault1099Box() throws RuntimeException;

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
     * Get Dunning Grace Date
     */
    Timestamp getDunningGrace();

    /**
     * Set Dunning Grace Date
     */
    void setDunningGrace(Timestamp DunningGrace);

    /**
     * Get D-U-N-S. Dun & Bradstreet Number
     */
    String getDUNS();

    /**
     * Set D-U-N-S. Dun & Bradstreet Number
     */
    void setDUNS(String DUNS);

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
     * Set 1099 Vendor
     */
    void setIs1099Vendor(boolean Is1099Vendor);

    /**
     * Get 1099 Vendor
     */
    boolean is1099Vendor();

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
     * Set Is Manufacturer. Indicate role of this Business partner as Manufacturer
     */
    void setIsManufacturer(boolean IsManufacturer);

    /**
     * Get Is Manufacturer. Indicate role of this Business partner as Manufacturer
     */
    boolean isManufacturer();

    /**
     * Set One time transaction
     */
    void setIsOneTime(boolean IsOneTime);

    /**
     * Get One time transaction
     */
    boolean isOneTime();

    /**
     * Set PO Tax exempt. Business partner is exempt from tax on purchases
     */
    void setIsPOTaxExempt(boolean IsPOTaxExempt);

    /**
     * Get PO Tax exempt. Business partner is exempt from tax on purchases
     */
    boolean isPOTaxExempt();

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
     * Get Logo
     */
    int getLogo_ID();

    /**
     * Set Logo
     */
    void setLogo_ID(int Logo_ID);

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
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Name 2. Additional Name
     */
    String getName2();

    /**
     * Set Name 2. Additional Name
     */
    void setName2(String Name2);

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
    int getSalesVolume();

    /**
     * Set Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency
     */
    void setSalesVolume(int SalesVolume);

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
     * Get Tax ID. Tax Identification
     */
    String getTaxID();

    /**
     * Set Tax ID. Tax Identification
     */
    void setTaxID(String TaxID);

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
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    Properties getCtx();

    String get_TrxName();

    void set_TrxName(String trxName);

    I_C_BPartner_Location[] getLocations();

    boolean save();

    boolean set_ValueNoCheck(String ColumnName, Object value);

    void saveEx();

    boolean delete(boolean force);

    I_AD_User[] getContacts();
}
