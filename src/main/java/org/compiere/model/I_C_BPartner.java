package org.compiere.model;

import org.idempiere.icommon.model.NamedPersistentObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.hsharp.core.models.CanSetSearchKey;
import software.hsharp.models.HasCategories;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Generated Interface for C_BPartner
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner extends CanSetSearchKey, Serializable, NamedPersistentObject, HasCategories {

    /**
     * TableName=C_BPartner
     */
    String Table_Name = "C_BPartner";

    /**
     * AD_Table_ID=291
     */
    int Table_ID = 291;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
     * Column name C_TaxGroup_ID
     */
    String COLUMNNAME_C_TaxGroup_ID = "C_TaxGroup_ID";
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
     * Column name DUNS
     */
    String COLUMNNAME_DUNS = "DUNS";
    /**
     * Column name FirstSale
     */
    String COLUMNNAME_FirstSale = "FirstSale";
    /**
     * Column name Invoice_PrintFormat_ID
     */
    String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
    /**
     * Column name InvoiceRule
     */
    String COLUMNNAME_InvoiceRule = "InvoiceRule";
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
     * Column name PaymentRule
     */
    String COLUMNNAME_PaymentRule = "PaymentRule";
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
     * Column name PotentialLifeTimeValue
     */
    String COLUMNNAME_PotentialLifeTimeValue = "PotentialLifeTimeValue";
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
     * Column name TaxID
     */
    String COLUMNNAME_TaxID = "TaxID";
    /**
     * Column name TotalOpenBalance
     */
    String COLUMNNAME_TotalOpenBalance = "TotalOpenBalance";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";

    /**
     * Column name FlatDiscount
     */
    String COLUMNNAME_FlatDiscount = "FlatDiscount";

    /**
     * Set Acquisition Cost. The cost of gaining the prospect as a customer
     */
    void setAcqusitionCost(BigDecimal AcqusitionCost);

    /**
     * Set Actual Life Time Value. Actual Life Time Revenue
     */
    void setActualLifeTimeValue(BigDecimal ActualLifeTimeValue);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getPaymentTermId();

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    String getDeliveryRule();

    /**
     * Get Delivery Via. How the order will be delivered
     */
    String getDeliveryViaRule();

    /**
     * Get D-U-N-S. Dun & Bradstreet Number
     */
    String getDUNS();

    /**
     * Set D-U-N-S. Dun & Bradstreet Number
     */
    void setDUNS(String DUNS);

    /**
     * Set First Sale. Date of First Sale
     */
    void setFirstSale(Timestamp FirstSale);

    /**
     * Get Invoice Rule. Frequency and method of invoicing
     */
    String getInvoiceRule();

    /**
     * Set Employee. Indicates if this Business Partner is an employee
     */
    void setIsEmployee(boolean IsEmployee);

    /**
     * Set Sales Representative. Indicates if the business partner is a sales representative or
     * company agent
     */
    void setIsSalesRep(boolean IsSalesRep);

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Set Name 2. Additional Name
     */
    void setName2(String Name2);

    /**
     * Get Payment Rule. How you pay the invoice
     */
    String getPaymentRule();

    /**
     * Get PO Payment Term. Payment rules for a purchase order
     */
    int getPurchaseOrderPaymentTermId();

    /**
     * Get Purchase Pricelist. Price List used by this Business Partner
     */
    int getPurchaseOrderPriceListId();

    /**
     * Set Potential Life Time Value. Total Revenue expected
     */
    void setPotentialLifeTimeValue(BigDecimal PotentialLifeTimeValue);

    /**
     * Get Sales Representative Id. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative Id.
     * Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);


    /**
     * Set Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency
     */
    void setSalesVolume(int SalesVolume);

    /**
     * Set Share. Share of Customer's business as a percentage
     */
    void setShareOfCustomer(int ShareOfCustomer);

    /**
     * Set Credit Limit. Total outstanding invoice amounts allowed
     */
    void setSalesOrderCreditLimit(BigDecimal SO_CreditLimit);

    /**
     * Set Credit Used. Current open balance
     */
    void setSalesOrderCreditUsed(BigDecimal SO_CreditUsed);

    /**
     * Set Open Balance. Total Open Balance Amount in primary Accounting Currency
     */
    void setTotalOpenBalance(BigDecimal TotalOpenBalance);

    List<I_C_BPartner_Location> getLocations();

    boolean setValueNoCheck(String ColumnName, Object value);

    void saveEx();

    boolean delete(boolean force);

    List<User> getContacts();

    /**
     * Get URL.
     * Full URL address - e.g. http://www.idempiere.org
     */
    String getURL();

    /**
     * Set URL.
     * Full URL address - e.g. http://www.idempiere.org
     */
    void setURL(String URL);

    /**
     * Get Description.
     * Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description.
     * Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Tax ID.
     * Tax Identification
     */
    String getTaxID();

    /**
     * Set Tax ID.
     * Tax Identification
     */
    void setTaxID(String TaxID);

    /**
     * Get Customer.
     * Indicates if this Business Partner is a Customer
     */
    boolean getIsCustomer();

    /**
     * Set Customer.
     * Indicates if this Business Partner is a Customer
     */
    void setIsCustomer(boolean IsCustomer);

    /**
     * Get Flat Discount %.
     * Flat discount percentage
     */
    BigDecimal getFlatDiscount();

    /**
     * Set Flat Discount %.
     * Flat discount percentage
     */
    void setFlatDiscount(BigDecimal FlatDiscount);

    void setTotalOpenBalance();

    void setActualLifeTimeValue();

    BigDecimal getSalesOrderCreditUsed();

    BigDecimal getTotalOpenBalance();

    BigDecimal getActualLifeTimeValue();

    void setSOCreditStatus();

    String getSOCreditStatus();

    BigDecimal getSalesOrderCreditLimit();

    int getLinkedOrganizationId();

    @Nullable
    String getSOCreditStatus(@Nullable BigDecimal grandTotal);

    Timestamp getFirstSale();

    int getBPGroupId();

    void setBPGroup(@Nullable I_C_BP_Group bpg);
}
