package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Generated Interface for C_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Order extends PersistentObject, DocProps {

    /**
     * TableName=C_Order
     */
    String Table_Name = "C_Order";

    /**
     * AD_Table_ID=259
     */
    int Table_ID = 259;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Bill_BPartner_ID
     */
    String COLUMNNAME_Bill_BPartner_ID = "Bill_BPartner_ID";
    /**
     * Column name Bill_Location_ID
     */
    String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";
    /**
     * Column name Bill_User_ID
     */
    String COLUMNNAME_Bill_User_ID = "Bill_User_ID";
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
     * Column name C_CashLine_ID
     */
    String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
    /**
     * Column name C_CashPlanLine_ID
     */
    String COLUMNNAME_C_CashPlanLine_ID = "C_CashPlanLine_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_DocTypeTarget_ID
     */
    String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderSource_ID
     */
    String COLUMNNAME_C_OrderSource_ID = "C_OrderSource_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_POS_ID
     */
    String COLUMNNAME_C_POS_ID = "C_POS_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateOrdered
     */
    String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePrinted
     */
    String COLUMNNAME_DatePrinted = "DatePrinted";
    /**
     * Column name DatePromised
     */
    String COLUMNNAME_DatePromised = "DatePromised";
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
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name DropShip_BPartner_ID
     */
    String COLUMNNAME_DropShip_BPartner_ID = "DropShip_BPartner_ID";
    /**
     * Column name DropShip_Location_ID
     */
    String COLUMNNAME_DropShip_Location_ID = "DropShip_Location_ID";
    /**
     * Column name DropShip_User_ID
     */
    String COLUMNNAME_DropShip_User_ID = "DropShip_User_ID";
    /**
     * Column name FreightAmt
     */
    String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name FreightCostRule
     */
    String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name GrandTotal
     */
    String COLUMNNAME_GrandTotal = "GrandTotal";
    /**
     * Column name InvoiceRule
     */
    String COLUMNNAME_InvoiceRule = "InvoiceRule";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsCreditApproved
     */
    String COLUMNNAME_IsCreditApproved = "IsCreditApproved";
    /**
     * Column name IsDelivered
     */
    String COLUMNNAME_IsDelivered = "IsDelivered";
    /**
     * Column name IsDiscountPrinted
     */
    String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
    /**
     * Column name IsDropShip
     */
    String COLUMNNAME_IsDropShip = "IsDropShip";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name IsPayScheduleValid
     */
    String COLUMNNAME_IsPayScheduleValid = "IsPayScheduleValid";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsPriviledgedRate
     */
    String COLUMNNAME_IsPriviledgedRate = "IsPriviledgedRate";
    /**
     * Column name IsSelected
     */
    String COLUMNNAME_IsSelected = "IsSelected";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name IsTransferred
     */
    String COLUMNNAME_IsTransferred = "IsTransferred";
    /**
     * Column name Link_Order_ID
     */
    String COLUMNNAME_Link_Order_ID = "Link_Order_ID";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name PaymentRule
     */
    String COLUMNNAME_PaymentRule = "PaymentRule";
    /**
     * Column name POReference
     */
    String COLUMNNAME_POReference = "POReference";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PriorityRule
     */
    String COLUMNNAME_PriorityRule = "PriorityRule";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name QuotationOrder_ID
     */
    String COLUMNNAME_QuotationOrder_ID = "QuotationOrder_ID";
    /**
     * Column name Ref_Order_ID
     */
    String COLUMNNAME_Ref_Order_ID = "Ref_Order_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name SendEMail
     */
    String COLUMNNAME_SendEMail = "SendEMail";
    /**
     * Column name TotalLines
     */
    String COLUMNNAME_TotalLines = "TotalLines";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name Volume
     */
    String COLUMNNAME_Volume = "Volume";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Transaction Organization. Performing or initiating organization
     * see https://www.chuckboecking.com/idempiere-adempiere-trx-organization-transaction-org-ad_orgtrx_id/
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
     * Get Invoice Location. Business Partner Location for invoicing
     */
    int getBusinessPartnerInvoicingLocationId();

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Get customer.
     */
    I_C_BPartner getCustomer();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Partner Location Id. Identifies the (ship to) address for this Business Partner
     */
    int getBusinessPartnerLocationId();

    /**
     * Set Partner Location Id. Identifies the (ship to) address for this Business Partner
     */
    void setBusinessPartnerLocationId(int C_BPartner_Location_ID);

    /**
     * Get Partner Location Id. Identifies the (ship to) address for this Business Partner
     */
    I_C_BPartner_Location getBusinessPartnerLocation();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    I_C_Currency getCurrency() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    DocumentType getDocumentType() throws RuntimeException;

    /**
     * Set Target Document Type. Target document type for conversing documents
     */
    void setTargetDocumentTypeId(int C_DocTypeTarget_ID);

    DocumentType getTargetDocumentType() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setPaymentTermId(int C_PaymentTerm_ID);

    /**
     * Get POS Terminal. Point of Sales Terminal
     */
    int getPOSId();

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Get Date Ordered in ISO 8601 format. Date of Order in ISO 8601 format
     */
    String getDateOrderedISOFormat();

    /**
     * Get Accounting Date in ISO 8601 format. Date of Accounting in ISO 8601 format
     */
    String getDateAccountingISOFormat();

    /**
     * Get Date Promised. Date Order was promised
     */
    Timestamp getDatePromised();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Grand Total. Total amount of document
     */
    BigDecimal getGrandTotal();

    /**
     * Set Grand Total. Total amount of document
     */
    void setGrandTotal(BigDecimal GrandTotal);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    void setIsDropShip(boolean IsDropShip);

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setPriceListId(int M_PriceList_ID);

    I_M_PriceList getPriceList() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    /**
     * Get Payment Rule. How you pay the invoice
     */
    String getPaymentRule();

    /**
     * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    String getPOReference();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);

    /**
     * Set Total Lines. Total of all document lines
     */
    void setTotalLines(BigDecimal TotalLines);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    List<I_C_OrderLine> getLines();


    int getPrecision();

    I_C_OrderTax[] getTaxes(boolean b);

    /**
     * Set Document No.
     * Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

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

    boolean isComplete();
}
