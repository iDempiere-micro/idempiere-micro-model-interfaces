package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Generated Interface for M_InOut
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOut {

    /**
     * TableName=M_InOut
     */
    String Table_Name = "M_InOut";

    /**
     * AD_Table_ID=319
     */
    int Table_ID = 319;

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
     * Column name DateReceived
     */
    String COLUMNNAME_DateReceived = "DateReceived";
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
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
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
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name MovementType
     */
    String COLUMNNAME_MovementType = "MovementType";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
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
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ref_InOut_ID
     */
    String COLUMNNAME_Ref_InOut_ID = "Ref_InOut_ID";
    /**
     * Column name ReturnBPartner_ID
     */
    String COLUMNNAME_ReturnBPartner_ID = "ReturnBPartner_ID";
    /**
     * Column name ReturnLocation_ID
     */
    String COLUMNNAME_ReturnLocation_ID = "ReturnLocation_ID";
    /**
     * Column name ReturnUser_ID
     */
    String COLUMNNAME_ReturnUser_ID = "ReturnUser_ID";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";
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

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

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
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    void setChargeId(int C_Charge_ID);

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    I_C_DocType getDocumentType() throws RuntimeException;

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

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    void setDateOrdered(Timestamp DateOrdered);

    /**
     * Set Date printed. Date the document was printed.
     */
    void setDatePrinted(Timestamp DatePrinted);

    /**
     * Set Date received. Date a product was received
     */
    void setDateReceived(Timestamp DateReceived);

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
     * Get Drop Ship Business Partner. Business Partner to ship to
     */
    int getDropShip_BPartner_ID();

    /**
     * Set Drop Ship Business Partner. Business Partner to ship to
     */
    void setDropShip_BPartner_ID(int DropShip_BPartner_ID);

    /**
     * Get Drop Shipment Location. Business Partner Location for shipping to
     */
    int getDropShip_Location_ID();

    /**
     * Set Drop Shipment Location. Business Partner Location for shipping to
     */
    void setDropShip_Location_ID(int DropShip_Location_ID);

    /**
     * Get Drop Shipment Contact. Business Partner Contact for drop shipment
     */
    int getDropShip_User_ID();

    /**
     * Set Drop Shipment Contact. Business Partner Contact for drop shipment
     */
    void setDropShip_User_ID(int DropShip_User_ID);

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
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

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
     * Set In Transit. Movement is in transit
     */
    void setIsInTransit(boolean IsInTransit);

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getM_InOut_ID();

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

    /**
     * Get Movement Type. Method of moving the inventory
     */
    String getMovementType();

    /**
     * Set Movement Type. Method of moving the inventory
     */
    void setMovementType(String MovementType);

    /**
     * Get RMA. Return Material Authorization
     */
    int getM_RMA_ID();

    /**
     * Set RMA. Return Material Authorization
     */
    void setM_RMA_ID(int M_RMA_ID);

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    /**
     * Get No Packages. Number of packages shipped
     */
    int getNoPackages();

    /**
     * Set No Packages. Number of packages shipped
     */
    void setNoPackages(int NoPackages);

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
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Referenced Shipment
     */
    int getRef_InOut_ID();

    /**
     * Set Referenced Shipment
     */
    void setRef_InOut_ID(int Ref_InOut_ID);

    /**
     * Get Reversal ID. ID of document reversal
     */
    int getReversal_ID();

    /**
     * Set Reversal ID. ID of document reversal
     */
    void setReversal_ID(int Reversal_ID);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);

    /**
     * Get Send EMail. Enable sending Document EMail
     */
    boolean isSendEMail();

    /**
     * Set Send EMail. Enable sending Document EMail
     */
    void setSendEMail(boolean SendEMail);

    /**
     * Set Ship Date. Shipment Date/Time
     */
    void setShipDate(Timestamp ShipDate);

    /**
     * Set Tracking No. Number to track the shipment
     */
    void setTrackingNo(String TrackingNo);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    /**
     * Set Volume. Volume of a product
     */
    void setVolume(BigDecimal Volume);

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);

    ArrayList<IPODoc> getDocsPostProcess();
}
