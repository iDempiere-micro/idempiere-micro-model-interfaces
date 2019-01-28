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

  /** TableName=C_BPartner */
  String Table_Name = "C_BPartner";

  /** AD_Table_ID=291 */
  int Table_ID = 291;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AcqusitionCost */
  String COLUMNNAME_AcqusitionCost = "AcqusitionCost";
  /** Column name ActualLifeTimeValue */
  String COLUMNNAME_ActualLifeTimeValue = "ActualLifeTimeValue";
  /** Column name AD_Language */
  String COLUMNNAME_AD_Language = "AD_Language";
  /** Column name AD_OrgBP_ID */
  String COLUMNNAME_AD_OrgBP_ID = "AD_OrgBP_ID";
    /** Column name BPartner_Parent_ID */
  String COLUMNNAME_BPartner_Parent_ID = "BPartner_Parent_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_UU */
  String COLUMNNAME_C_BPartner_UU = "C_BPartner_UU";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_Dunning_ID */
  String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
  /** Column name C_Greeting_ID */
  String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
  /** Column name C_InvoiceSchedule_ID */
  String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /** Column name C_TaxGroup_ID */
  String COLUMNNAME_C_TaxGroup_ID = "C_TaxGroup_ID";
  /** Column name CustomerProfileID */
  String COLUMNNAME_CustomerProfileID = "CustomerProfileID";
  /** Column name Default1099Box_ID */
  String COLUMNNAME_Default1099Box_ID = "Default1099Box_ID";
  /** Column name DeliveryRule */
  String COLUMNNAME_DeliveryRule = "DeliveryRule";
  /** Column name DeliveryViaRule */
  String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocumentCopies */
  String COLUMNNAME_DocumentCopies = "DocumentCopies";
  /** Column name DunningGrace */
  String COLUMNNAME_DunningGrace = "DunningGrace";
  /** Column name DUNS */
  String COLUMNNAME_DUNS = "DUNS";
  /** Column name FirstSale */
  String COLUMNNAME_FirstSale = "FirstSale";
  /** Column name FlatDiscount */
  String COLUMNNAME_FlatDiscount = "FlatDiscount";
  /** Column name FreightCostRule */
  String COLUMNNAME_FreightCostRule = "FreightCostRule";
  /** Column name Invoice_PrintFormat_ID */
  String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
  /** Column name InvoiceRule */
  String COLUMNNAME_InvoiceRule = "InvoiceRule";
  /** Column name Is1099Vendor */
  String COLUMNNAME_Is1099Vendor = "Is1099Vendor";
    /** Column name IsCustomer */
  String COLUMNNAME_IsCustomer = "IsCustomer";
  /** Column name IsDiscountPrinted */
  String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
  /** Column name IsEmployee */
  String COLUMNNAME_IsEmployee = "IsEmployee";
  /** Column name IsManufacturer */
  String COLUMNNAME_IsManufacturer = "IsManufacturer";
  /** Column name IsOneTime */
  String COLUMNNAME_IsOneTime = "IsOneTime";
  /** Column name IsPOTaxExempt */
  String COLUMNNAME_IsPOTaxExempt = "IsPOTaxExempt";
  /** Column name IsProspect */
  String COLUMNNAME_IsProspect = "IsProspect";
  /** Column name IsSalesRep */
  String COLUMNNAME_IsSalesRep = "IsSalesRep";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name IsTaxExempt */
  String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
  /** Column name IsVendor */
  String COLUMNNAME_IsVendor = "IsVendor";
  /** Column name Logo_ID */
  String COLUMNNAME_Logo_ID = "Logo_ID";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name NAICS */
  String COLUMNNAME_NAICS = "NAICS";
  /** Column name NumberEmployees */
  String COLUMNNAME_NumberEmployees = "NumberEmployees";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name PaymentRulePO */
  String COLUMNNAME_PaymentRulePO = "PaymentRulePO";
  /** Column name PO_DiscountSchema_ID */
  String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
  /** Column name PO_PaymentTerm_ID */
  String COLUMNNAME_PO_PaymentTerm_ID = "PO_PaymentTerm_ID";
  /** Column name PO_PriceList_ID */
  String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name PotentialLifeTimeValue */
  String COLUMNNAME_PotentialLifeTimeValue = "PotentialLifeTimeValue";
  /** Column name Rating */
  String COLUMNNAME_Rating = "Rating";
  /** Column name ReferenceNo */
  String COLUMNNAME_ReferenceNo = "ReferenceNo";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name SalesVolume */
  String COLUMNNAME_SalesVolume = "SalesVolume";
  /** Column name SendEMail */
  String COLUMNNAME_SendEMail = "SendEMail";
  /** Column name ShareOfCustomer */
  String COLUMNNAME_ShareOfCustomer = "ShareOfCustomer";
  /** Column name ShelfLifeMinPct */
  String COLUMNNAME_ShelfLifeMinPct = "ShelfLifeMinPct";
  /** Column name SO_CreditLimit */
  String COLUMNNAME_SO_CreditLimit = "SO_CreditLimit";
  /** Column name SOCreditStatus */
  String COLUMNNAME_SOCreditStatus = "SOCreditStatus";
  /** Column name SO_CreditUsed */
  String COLUMNNAME_SO_CreditUsed = "SO_CreditUsed";
  /** Column name SO_Description */
  String COLUMNNAME_SO_Description = "SO_Description";
  /** Column name TaxID */
  String COLUMNNAME_TaxID = "TaxID";
  /** Column name TotalOpenBalance */
  String COLUMNNAME_TotalOpenBalance = "TotalOpenBalance";
    /** Column name URL */
  String COLUMNNAME_URL = "URL";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

    /** Set Acquisition Cost. The cost of gaining the prospect as a customer */
  void setAcqusitionCost(BigDecimal AcqusitionCost);

    /** Set Actual Life Time Value. Actual Life Time Revenue */
  void setActualLifeTimeValue(BigDecimal ActualLifeTimeValue);

    /** Get Organization. Organizational entity within client */
  int getOrgId();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

    /** Get Delivery Rule. Defines the timing of Delivery */
  String getDeliveryRule();

    /** Get Delivery Via. How the order will be delivered */
  String getDeliveryViaRule();

    /** Set D-U-N-S. Dun & Bradstreet Number */
  void setDUNS(String DUNS);

    /** Set First Sale. Date of First Sale */
  void setFirstSale(Timestamp FirstSale);

    /** Get Invoice Rule. Frequency and method of invoicing */
  String getInvoiceRule();

    /** Set Employee. Indicates if this Business Partner is an employee */
  void setIsEmployee(boolean IsEmployee);

    /**
   * Set Sales Representative. Indicates if the business partner is a sales representative or
   * company agent
   */
  void setIsSalesRep(boolean IsSalesRep);

    /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

    /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

    /** Set Name 2. Additional Name */
  void setName2(String Name2);

    /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

    /** Get PO Payment Term. Payment rules for a purchase order */
  int getPO_PaymentTerm_ID();

    /** Get Purchase Pricelist. Price List used by this Business Partner */
  int getPO_PriceList_ID();

    /** Set Potential Life Time Value. Total Revenue expected */
  void setPotentialLifeTimeValue(BigDecimal PotentialLifeTimeValue);

    /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

    /** Set Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency */
  void setSalesVolume(int SalesVolume);

    /** Set Share. Share of Customer's business as a percentage */
  void setShareOfCustomer(int ShareOfCustomer);

    /** Set Credit Limit. Total outstanding invoice amounts allowed */
  void setSO_CreditLimit(BigDecimal SO_CreditLimit);

    /** Set Credit Used. Current open balance */
  void setSO_CreditUsed(BigDecimal SO_CreditUsed);

    /** Set Open Balance. Total Open Balance Amount in primary Accounting Currency */
  void setTotalOpenBalance(BigDecimal TotalOpenBalance);

    /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  Properties getCtx();

    I_C_BPartner_Location[] getLocations();

  boolean save();

  boolean set_ValueNoCheck(String ColumnName, Object value);

  void saveEx();

  boolean delete(boolean force);

  I_AD_User[] getContacts();
}
