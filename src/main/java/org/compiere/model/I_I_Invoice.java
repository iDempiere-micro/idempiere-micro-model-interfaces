package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_Invoice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Invoice {

    /**
     * TableName=I_Invoice
     */
    String Table_Name = "I_Invoice";

    /**
     * AD_Table_ID=598
     */
    int Table_ID = 598;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name ActivityValue
     */
    String COLUMNNAME_ActivityValue = "ActivityValue";
    /**
     * Column name Address1
     */
    String COLUMNNAME_Address1 = "Address1";
    /**
     * Column name Address2
     */
    String COLUMNNAME_Address2 = "Address2";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BPartnerValue
     */
    String COLUMNNAME_BPartnerValue = "BPartnerValue";
    /**
     * Column name C_1099Box_ID
     */
    String COLUMNNAME_C_1099Box_ID = "C_1099Box_ID";
    /**
     * Column name C_1099Box_Value
     */
    String COLUMNNAME_C_1099Box_Value = "C_1099Box_Value";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name ChargeName
     */
    String COLUMNNAME_ChargeName = "ChargeName";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name City
     */
    String COLUMNNAME_City = "City";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name ContactName
     */
    String COLUMNNAME_ContactName = "ContactName";
    /**
     * Column name CountryCode
     */
    String COLUMNNAME_CountryCode = "CountryCode";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateInvoiced
     */
    String COLUMNNAME_DateInvoiced = "DateInvoiced";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocTypeName
     */
    String COLUMNNAME_DocTypeName = "DocTypeName";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_Invoice_ID
     */
    String COLUMNNAME_I_Invoice_ID = "I_Invoice_ID";
    /**
     * Column name I_Invoice_UU
     */
    String COLUMNNAME_I_Invoice_UU = "I_Invoice_UU";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name LineDescription
     */
    String COLUMNNAME_LineDescription = "LineDescription";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PaymentTermValue
     */
    String COLUMNNAME_PaymentTermValue = "PaymentTermValue";
    /**
     * Column name Phone
     */
    String COLUMNNAME_Phone = "Phone";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name PriceActual
     */
    String COLUMNNAME_PriceActual = "PriceActual";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductValue
     */
    String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name ProjectValue
     */
    String COLUMNNAME_ProjectValue = "ProjectValue";
    /**
     * Column name QtyOrdered
     */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name RegionName
     */
    String COLUMNNAME_RegionName = "RegionName";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name SKU
     */
    String COLUMNNAME_SKU = "SKU";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
    /**
     * Column name TaxIndicator
     */
    String COLUMNNAME_TaxIndicator = "TaxIndicator";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Activity Key. Text key for Activity
     */
    String getActivityValue();

    /**
     * Set Activity Key. Text key for Activity
     */
    void setActivityValue(String ActivityValue);

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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Business Partner Key. Key of the Business Partner
     */
    String getBPartnerValue();

    /**
     * Set Business Partner Key. Key of the Business Partner
     */
    void setBPartnerValue(String BPartnerValue);

    /**
     * Get 1099 Box
     */
    int getC_1099Box_ID();

    /**
     * Set 1099 Box
     */
    void setC_1099Box_ID(int C_1099Box_ID);

    I_C_1099Box getC_1099Box() throws RuntimeException;

    /**
     * Get 1099 Box Value
     */
    String getC_1099Box_Value();

    /**
     * Set 1099 Box Value
     */
    void setC_1099Box_Value(String C_1099Box_Value);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

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
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    I_C_Charge getC_Charge() throws RuntimeException;

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
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Set Document Type. Document type or rules
     */
    void setC_DocType_ID(int C_DocType_ID);

    I_C_DocType getC_DocType() throws RuntimeException;

    /**
     * Get Charge Name. Name of the Charge
     */
    String getChargeName();

    /**
     * Set Charge Name. Name of the Charge
     */
    void setChargeName(String ChargeName);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /**
     * Get City. Identifies a City
     */
    String getCity();

    /**
     * Set City. Identifies a City
     */
    void setCity(String City);

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
    boolean isCountryCode();

    /**
     * Set ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    void setCountryCode(boolean CountryCode);

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
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    I_C_Tax getC_Tax() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Date Invoiced. Date printed on Invoice
     */
    Timestamp getDateInvoiced();

    /**
     * Set Date Invoiced. Date printed on Invoice
     */
    void setDateInvoiced(Timestamp DateInvoiced);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Type Name. Name of the Document Type
     */
    String getDocTypeName();

    /**
     * Set Document Type Name. Name of the Document Type
     */
    void setDocTypeName(String DocTypeName);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Import Invoice. Import Invoice
     */
    int getI_Invoice_ID();

    /**
     * Set Import Invoice. Import Invoice
     */
    void setI_Invoice_ID(int I_Invoice_ID);

    /**
     * Get I_Invoice_UU
     */
    String getI_Invoice_UU();

    /**
     * Set I_Invoice_UU
     */
    void setI_Invoice_UU(String I_Invoice_UU);

    /**
     * Get Imported. Has this import been processed
     */
    boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Line Description. Description of the Line
     */
    String getLineDescription();

    /**
     * Set Line Description. Description of the Line
     */
    void setLineDescription(String LineDescription);

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
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Payment Term Key. Key of the Payment Term
     */
    String getPaymentTermValue();

    /**
     * Set Payment Term Key. Key of the Payment Term
     */
    void setPaymentTermValue(String PaymentTermValue);

    /**
     * Get Phone. Identifies a telephone number
     */
    String getPhone();

    /**
     * Set Phone. Identifies a telephone number
     */
    void setPhone(String Phone);

    /**
     * Get ZIP. Postal code
     */
    String getPostal();

    /**
     * Set ZIP. Postal code
     */
    void setPostal(String Postal);

    /**
     * Get Unit Price. Actual Price
     */
    BigDecimal getPriceActual();

    /**
     * Set Unit Price. Actual Price
     */
    void setPriceActual(BigDecimal PriceActual);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Product Key. Key of the Product
     */
    String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    void setProductValue(String ProductValue);

    /**
     * Get Project Key. Key of the Project
     */
    String getProjectValue();

    /**
     * Set Project Key. Key of the Project
     */
    void setProjectValue(String ProjectValue);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    BigDecimal getQtyOrdered();

    /**
     * Set Ordered Quantity. Ordered Quantity
     */
    void setQtyOrdered(BigDecimal QtyOrdered);

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
     * Get SKU. Stock Keeping Unit
     */
    String getSKU();

    /**
     * Set SKU. Stock Keeping Unit
     */
    void setSKU(String SKU);

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Set Tax Amount. Tax Amount for a document
     */
    void setTaxAmt(BigDecimal TaxAmt);

    /**
     * Get Tax Indicator. Short form for Tax to be printed on documents
     */
    String getTaxIndicator();

    /**
     * Set Tax Indicator. Short form for Tax to be printed on documents
     */
    void setTaxIndicator(String TaxIndicator);

    /**
     * Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    String getUPC();

    /**
     * Set UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    void setUPC(String UPC);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
