package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for DD_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_DD_Order {

    /**
     * TableName=DD_Order
     */
    String Table_Name = "DD_Order";

    /**
     * AD_Table_ID=53037
     */
    int Table_ID = 53037;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name CreateConfirm
     */
    String COLUMNNAME_CreateConfirm = "CreateConfirm";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreateFrom
     */
    String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name CreatePackage
     */
    String COLUMNNAME_CreatePackage = "CreatePackage";
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
     * Column name DateReceived
     */
    String COLUMNNAME_DateReceived = "DateReceived";
    /**
     * Column name DD_Order_ID
     */
    String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
    /**
     * Column name DD_Order_UU
     */
    String COLUMNNAME_DD_Order_UU = "DD_Order_UU";
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
     * Column name FreightAmt
     */
    String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name FreightCostRule
     */
    String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name GenerateTo
     */
    String COLUMNNAME_GenerateTo = "GenerateTo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsDelivered
     */
    String COLUMNNAME_IsDelivered = "IsDelivered";
    /**
     * Column name IsDropShip
     */
    String COLUMNNAME_IsDropShip = "IsDropShip";
    /**
     * Column name IsInDispute
     */
    String COLUMNNAME_IsInDispute = "IsInDispute";
    /**
     * Column name IsInTransit
     */
    String COLUMNNAME_IsInTransit = "IsInTransit";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsSelected
     */
    String COLUMNNAME_IsSelected = "IsSelected";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name NoPackages
     */
    String COLUMNNAME_NoPackages = "NoPackages";
    /**
     * Column name PickDate
     */
    String COLUMNNAME_PickDate = "PickDate";
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
     * Column name ShipDate
     */
    String COLUMNNAME_ShipDate = "ShipDate";
    /**
     * Column name TrackingNo
     */
    String COLUMNNAME_TrackingNo = "TrackingNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
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
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    org.compiere.model.I_AD_User getUser() throws RuntimeException;

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    org.compiere.model.I_C_BPartner getBPartner() throws RuntimeException;

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getBusinessPartnerLocationId();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setBusinessPartnerLocationId(int C_BPartner_Location_ID);

    org.compiere.model.I_C_BPartner_Location getBPartnerLocation() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    void setChargeId(int C_Charge_ID);

    org.compiere.model.I_C_Charge getCharge() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    org.compiere.model.I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Set Charge amount. Charge Amount
     */
    void setChargeAmt(BigDecimal ChargeAmt);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    org.compiere.model.I_C_Invoice getInvoice() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    org.compiere.model.I_C_Order getOrder() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Create Confirm
     */
    String getCreateConfirm();

    /**
     * Set Create Confirm
     */
    void setCreateConfirm(String CreateConfirm);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    String getCreateFrom();

    /**
     * Set Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    void setCreateFrom(String CreateFrom);

    /**
     * Get Create Package
     */
    String getCreatePackage();

    /**
     * Set Create Package
     */
    void setCreatePackage(String CreatePackage);

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date printed. Date the document was printed.
     */
    Timestamp getDatePrinted();

    /**
     * Set Date printed. Date the document was printed.
     */
    void setDatePrinted(Timestamp DatePrinted);

    /**
     * Get Date Promised. Date Order was promised
     */
    Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    void setDatePromised(Timestamp DatePromised);

    /**
     * Get Date received. Date a product was received
     */
    Timestamp getDateReceived();

    /**
     * Set Date received. Date a product was received
     */
    void setDateReceived(Timestamp DateReceived);

    /**
     * Get Distribution Order
     */
    int getDistributionOrderId();

    /**
     * Set Distribution Order
     */
    void setDistributionOrderId(int DD_Order_ID);

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
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Freight Amount. Freight Amount
     */
    BigDecimal getFreightAmt();

    /**
     * Set Freight Amount. Freight Amount
     */
    void setFreightAmt(BigDecimal FreightAmt);

    /**
     * Get Freight Cost Rule. Method for charging Freight
     */
    String getFreightCostRule();

    /**
     * Set Freight Cost Rule. Method for charging Freight
     */
    void setFreightCostRule(String FreightCostRule);

    /**
     * Get Generate To. Generate To
     */
    String getGenerateTo();

    /**
     * Set Generate To. Generate To
     */
    void setGenerateTo(String GenerateTo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Delivered
     */
    void setIsDelivered(boolean IsDelivered);

    /**
     * Get Delivered
     */
    boolean isDelivered();

    /**
     * Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    void setIsDropShip(boolean IsDropShip);

    /**
     * Get Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    boolean isDropShip();

    /**
     * Set In Dispute. Document is in dispute
     */
    void setIsInDispute(boolean IsInDispute);

    /**
     * Get In Dispute. Document is in dispute
     */
    boolean isInDispute();

    /**
     * Set In Transit. Movement is in transit
     */
    void setIsInTransit(boolean IsInTransit);

    /**
     * Get In Transit. Movement is in transit
     */
    boolean isInTransit();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Set Selected
     */
    void setIsSelected(boolean IsSelected);

    /**
     * Get Selected
     */
    boolean isSelected();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    org.compiere.model.I_M_Shipper getShipper() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get No Packages. Number of packages shipped
     */
    int getNoPackages();

    /**
     * Set No Packages. Number of packages shipped
     */
    void setNoPackages(int NoPackages);

    /**
     * Get Pick Date. Date/Time when picked for Shipment
     */
    Timestamp getPickDate();

    /**
     * Set Pick Date. Date/Time when picked for Shipment
     */
    void setPickDate(Timestamp PickDate);

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
     * Get Posted. Posting status
     */
    boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Priority. Priority of a document
     */
    String getPriorityRule();

    /**
     * Set Priority. Priority of a document
     */
    void setPriorityRule(String PriorityRule);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Referenced Order. Reference to corresponding Sales/Purchase Order
     */
    int getReferencedOrderId();

    /**
     * Set Referenced Order. Reference to corresponding Sales/Purchase Order
     */
    void setReferencedOrderId(int Ref_Order_ID);

    org.compiere.model.I_C_Order getReferencedOrder() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);

    org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Send EMail. Enable sending Document EMail
     */
    boolean isSendEMail();

    /**
     * Set Send EMail. Enable sending Document EMail
     */
    void setSendEMail(boolean SendEMail);

    /**
     * Get Ship Date. Shipment Date/Time
     */
    Timestamp getShipDate();

    /**
     * Set Ship Date. Shipment Date/Time
     */
    void setShipDate(Timestamp ShipDate);

    /**
     * Get Tracking No. Number to track the shipment
     */
    String getTrackingNo();

    /**
     * Set Tracking No. Number to track the shipment
     */
    void setTrackingNo(String TrackingNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

    /**
     * Get Volume. Volume of a product
     */
    BigDecimal getVolume();

    /**
     * Set Volume. Volume of a product
     */
    void setVolume(BigDecimal Volume);

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);
}
