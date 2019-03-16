package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Order {

    /**
     * AD_Table_ID=591
     */
    int Table_ID = 591;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name Address1
     */
    String COLUMNNAME_Address1 = "Address1";
    /**
     * Column name Address2
     */
    String COLUMNNAME_Address2 = "Address2";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BillTo_ID
     */
    String COLUMNNAME_BillTo_ID = "BillTo_ID";
    /**
     * Column name BPartnerValue
     */
    String COLUMNNAME_BPartnerValue = "BPartnerValue";
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
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_OrderSource_ID
     */
    String COLUMNNAME_C_OrderSource_ID = "C_OrderSource_ID";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateOrdered
     */
    String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DeliveryRule
     */
    String COLUMNNAME_DeliveryRule = "DeliveryRule";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name FreightAmt
     */
    String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
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
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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
     * Column name QtyOrdered
     */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

    /**
     * Get Address 1. Address line 1 for this location
     */
    String getAddress1();

    /**
     * Get Address 2. Address line 2 for this location
     */
    String getAddress2();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Get Invoice To. Bill to Address
     */
    int getBillToId();

    /**
     * Set Invoice To. Bill to Address
     */
    void setBillToId(int BillTo_ID);

    /**
     * Get Business Partner Key. Key of the Business Partner
     */
    String getBPartnerValue();

    /**
     * Set Business Partner Key. Key of the Business Partner
     */
    void setBPartnerValue(String BPartnerValue);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getBusinessPartnerLocationId();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setBusinessPartnerLocationId(int C_BPartner_Location_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Get Country. Country
     */
    int getCountryId();

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Get City. Identifies a City
     */
    String getCity();

    /**
     * Get Address. Location or Address
     */
    int getLocationId();

    /**
     * Set Address. Location or Address
     */
    void setLocationId(int C_Location_ID);

    /**
     * Get Contact Name. Business Partner Contact Name
     */
    String getContactName();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    /**
     * Get Order Source
     */
    int getOrderSourceId();

    I_C_OrderSource getOrderSource() throws RuntimeException;

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getPaymentTermId();

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Get Region. Identifies a geographical Region
     */
    int getRegionId();

    /**
     * Get Tax. Tax identifier
     */
    int getTaxId();

    /**
     * Set Tax. Tax identifier
     */
    void setTaxId(int C_Tax_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    String getDeliveryRule();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Get Freight Amount. Freight Amount
     */
    BigDecimal getFreightAmt();

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(boolean I_IsImported);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Line Description. Description of the Line
     */
    String getLineDescription();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Get Phone. Identifies a telephone number
     */
    String getPhone();

    /**
     * Get ZIP. Postal code
     */
    String getPostal();

    /**
     * Get Unit Price. Actual Price
     */
    BigDecimal getPriceActual();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    BigDecimal getQtyOrdered();

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

}
