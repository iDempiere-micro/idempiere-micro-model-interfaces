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
@SuppressWarnings("all")
public interface I_DD_Order {

    /**
     * TableName=DD_Order
     */
    public static final String Table_Name = "DD_Order";

    /**
     * AD_Table_ID=53037
     */
    public static final int Table_ID = 53037;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Campaign_ID
     */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Charge_ID
     */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_DocType_ID
     */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name ChargeAmt
     */
    public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name C_Invoice_ID
     */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Project_ID
     */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name CreateConfirm
     */
    public static final String COLUMNNAME_CreateConfirm = "CreateConfirm";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreateFrom
     */
    public static final String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name CreatePackage
     */
    public static final String COLUMNNAME_CreatePackage = "CreatePackage";
    /**
     * Column name DateOrdered
     */
    public static final String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePrinted
     */
    public static final String COLUMNNAME_DatePrinted = "DatePrinted";
    /**
     * Column name DatePromised
     */
    public static final String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DateReceived
     */
    public static final String COLUMNNAME_DateReceived = "DateReceived";
    /**
     * Column name DD_Order_ID
     */
    public static final String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
    /**
     * Column name DD_Order_UU
     */
    public static final String COLUMNNAME_DD_Order_UU = "DD_Order_UU";
    /**
     * Column name DeliveryRule
     */
    public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
    /**
     * Column name DeliveryViaRule
     */
    public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    public static final String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    public static final String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name FreightAmt
     */
    public static final String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name FreightCostRule
     */
    public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name GenerateTo
     */
    public static final String COLUMNNAME_GenerateTo = "GenerateTo";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    public static final String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsDelivered
     */
    public static final String COLUMNNAME_IsDelivered = "IsDelivered";
    /**
     * Column name IsDropShip
     */
    public static final String COLUMNNAME_IsDropShip = "IsDropShip";
    /**
     * Column name IsInDispute
     */
    public static final String COLUMNNAME_IsInDispute = "IsInDispute";
    /**
     * Column name IsInTransit
     */
    public static final String COLUMNNAME_IsInTransit = "IsInTransit";
    /**
     * Column name IsPrinted
     */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsSelected
     */
    public static final String COLUMNNAME_IsSelected = "IsSelected";
    /**
     * Column name IsSOTrx
     */
    public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_Shipper_ID
     */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name NoPackages
     */
    public static final String COLUMNNAME_NoPackages = "NoPackages";
    /**
     * Column name PickDate
     */
    public static final String COLUMNNAME_PickDate = "PickDate";
    /**
     * Column name POReference
     */
    public static final String COLUMNNAME_POReference = "POReference";
    /**
     * Column name Posted
     */
    public static final String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PriorityRule
     */
    public static final String COLUMNNAME_PriorityRule = "PriorityRule";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ref_Order_ID
     */
    public static final String COLUMNNAME_Ref_Order_ID = "Ref_Order_ID";
    /**
     * Column name SalesRep_ID
     */
    public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name SendEMail
     */
    public static final String COLUMNNAME_SendEMail = "SendEMail";
    /**
     * Column name ShipDate
     */
    public static final String COLUMNNAME_ShipDate = "ShipDate";
    /**
     * Column name TrackingNo
     */
    public static final String COLUMNNAME_TrackingNo = "TrackingNo";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    public static final String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    public static final String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name Volume
     */
    public static final String COLUMNNAME_Volume = "Volume";
    /**
     * Column name Weight
     */
    public static final String COLUMNNAME_Weight = "Weight";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    public int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    public void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    public int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    public void setUserId(int AD_User_ID);

    public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setBusinessPartnerId(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    public int getBusinessPartnerLocationId();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    public void setBusinessPartnerLocationId(int C_BPartner_Location_ID);

    public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    public int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    public void setCampaignId(int C_Campaign_ID);

    public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    public int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    public void setChargeId(int C_Charge_ID);

    public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    public int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    public void setDocumentTypeId(int C_DocType_ID);

    public org.compiere.model.I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Charge amount. Charge Amount
     */
    public BigDecimal getChargeAmt();

    /**
     * Set Charge amount. Charge Amount
     */
    public void setChargeAmt(BigDecimal ChargeAmt);

    /**
     * Get Invoice. Invoice Identifier
     */
    public int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    public void setInvoiceId(int C_Invoice_ID);

    public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Order. Order
     */
    public int getOrderId();

    /**
     * Set Order. Order
     */
    public void setOrderId(int C_Order_ID);

    public org.compiere.model.I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    public int getProjectId();

    /**
     * Set Project. Financial Project
     */
    public void setProjectId(int C_Project_ID);

    public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Create Confirm
     */
    public String getCreateConfirm();

    /**
     * Set Create Confirm
     */
    public void setCreateConfirm(String CreateConfirm);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    public String getCreateFrom();

    /**
     * Set Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    public void setCreateFrom(String CreateFrom);

    /**
     * Get Create Package
     */
    public String getCreatePackage();

    /**
     * Set Create Package
     */
    public void setCreatePackage(String CreatePackage);

    /**
     * Get Date Ordered. Date of Order
     */
    public Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    public void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date printed. Date the document was printed.
     */
    public Timestamp getDatePrinted();

    /**
     * Set Date printed. Date the document was printed.
     */
    public void setDatePrinted(Timestamp DatePrinted);

    /**
     * Get Date Promised. Date Order was promised
     */
    public Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    public void setDatePromised(Timestamp DatePromised);

    /**
     * Get Date received. Date a product was received
     */
    public Timestamp getDateReceived();

    /**
     * Set Date received. Date a product was received
     */
    public void setDateReceived(Timestamp DateReceived);

    /**
     * Get Distribution Order
     */
    public int getDD_Order_ID();

    /**
     * Set Distribution Order
     */
    public void setDD_Order_ID(int DD_Order_ID);

    /**
     * Get DD_Order_UU
     */
    public String getDD_Order_UU();

    /**
     * Set DD_Order_UU
     */
    public void setDD_Order_UU(String DD_Order_UU);

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    public String getDeliveryRule();

    /**
     * Set Delivery Rule. Defines the timing of Delivery
     */
    public void setDeliveryRule(String DeliveryRule);

    /**
     * Get Delivery Via. How the order will be delivered
     */
    public String getDeliveryViaRule();

    /**
     * Set Delivery Via. How the order will be delivered
     */
    public void setDeliveryViaRule(String DeliveryViaRule);

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    public String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    public void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    public String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    public void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

    /**
     * Get Freight Amount. Freight Amount
     */
    public BigDecimal getFreightAmt();

    /**
     * Set Freight Amount. Freight Amount
     */
    public void setFreightAmt(BigDecimal FreightAmt);

    /**
     * Get Freight Cost Rule. Method for charging Freight
     */
    public String getFreightCostRule();

    /**
     * Set Freight Cost Rule. Method for charging Freight
     */
    public void setFreightCostRule(String FreightCostRule);

    /**
     * Get Generate To. Generate To
     */
    public String getGenerateTo();

    /**
     * Set Generate To. Generate To
     */
    public void setGenerateTo(String GenerateTo);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    public void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    public boolean isApproved();

    /**
     * Set Delivered
     */
    public void setIsDelivered(boolean IsDelivered);

    /**
     * Get Delivered
     */
    public boolean isDelivered();

    /**
     * Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    public void setIsDropShip(boolean IsDropShip);

    /**
     * Get Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    public boolean isDropShip();

    /**
     * Set In Dispute. Document is in dispute
     */
    public void setIsInDispute(boolean IsInDispute);

    /**
     * Get In Dispute. Document is in dispute
     */
    public boolean isInDispute();

    /**
     * Set In Transit. Movement is in transit
     */
    public void setIsInTransit(boolean IsInTransit);

    /**
     * Get In Transit. Movement is in transit
     */
    public boolean isInTransit();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    public void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    public boolean isPrinted();

    /**
     * Set Selected
     */
    public void setIsSelected(boolean IsSelected);

    /**
     * Get Selected
     */
    public boolean isSelected();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    public void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    public boolean isSOTrx();

    /**
     * Get Shipper. Method or manner of product delivery
     */
    public int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    public void setShipperId(int M_Shipper_ID);

    public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    public int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    public void setWarehouseId(int M_Warehouse_ID);

    public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get No Packages. Number of packages shipped
     */
    public int getNoPackages();

    /**
     * Set No Packages. Number of packages shipped
     */
    public void setNoPackages(int NoPackages);

    /**
     * Get Pick Date. Date/Time when picked for Shipment
     */
    public Timestamp getPickDate();

    /**
     * Set Pick Date. Date/Time when picked for Shipment
     */
    public void setPickDate(Timestamp PickDate);

    /**
     * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    public String getPOReference();

    /**
     * Set Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    public void setPOReference(String POReference);

    /**
     * Get Posted. Posting status
     */
    public boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    public void setPosted(boolean Posted);

    /**
     * Get Priority. Priority of a document
     */
    public String getPriorityRule();

    /**
     * Set Priority. Priority of a document
     */
    public void setPriorityRule(String PriorityRule);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Referenced Order. Reference to corresponding Sales/Purchase Order
     */
    public int getRef_Order_ID();

    /**
     * Set Referenced Order. Reference to corresponding Sales/Purchase Order
     */
    public void setRef_Order_ID(int Ref_Order_ID);

    public org.compiere.model.I_C_Order getRef_Order() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    public int getSalesRepresentativeId();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    public void setSalesRepresentativeId(int SalesRep_ID);

    public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Send EMail. Enable sending Document EMail
     */
    public boolean isSendEMail();

    /**
     * Set Send EMail. Enable sending Document EMail
     */
    public void setSendEMail(boolean SendEMail);

    /**
     * Get Ship Date. Shipment Date/Time
     */
    public Timestamp getShipDate();

    /**
     * Set Ship Date. Shipment Date/Time
     */
    public void setShipDate(Timestamp ShipDate);

    /**
     * Get Tracking No. Number to track the shipment
     */
    public String getTrackingNo();

    /**
     * Set Tracking No. Number to track the shipment
     */
    public void setTrackingNo(String TrackingNo);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    public int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(int User1_ID);

    public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    public int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(int User2_ID);

    public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

    /**
     * Get Volume. Volume of a product
     */
    public BigDecimal getVolume();

    /**
     * Set Volume. Volume of a product
     */
    public void setVolume(BigDecimal Volume);

    /**
     * Get Weight. Weight of a product
     */
    public BigDecimal getWeight();

    /**
     * Set Weight. Weight of a product
     */
    public void setWeight(BigDecimal Weight);
}
