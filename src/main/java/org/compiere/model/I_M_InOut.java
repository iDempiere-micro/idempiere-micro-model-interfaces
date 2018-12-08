package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_InOut
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOut {

  /** TableName=M_InOut */
  String Table_Name = "M_InOut";

  /** AD_Table_ID=319 */
  int Table_ID = 319;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name CreateConfirm */
  String COLUMNNAME_CreateConfirm = "CreateConfirm";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name CreatePackage */
  String COLUMNNAME_CreatePackage = "CreatePackage";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateOrdered */
  String COLUMNNAME_DateOrdered = "DateOrdered";
  /** Column name DatePrinted */
  String COLUMNNAME_DatePrinted = "DatePrinted";
  /** Column name DateReceived */
  String COLUMNNAME_DateReceived = "DateReceived";
  /** Column name DeliveryRule */
  String COLUMNNAME_DeliveryRule = "DeliveryRule";
  /** Column name DeliveryViaRule */
  String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name DropShip_BPartner_ID */
  String COLUMNNAME_DropShip_BPartner_ID = "DropShip_BPartner_ID";
  /** Column name DropShip_Location_ID */
  String COLUMNNAME_DropShip_Location_ID = "DropShip_Location_ID";
  /** Column name DropShip_User_ID */
  String COLUMNNAME_DropShip_User_ID = "DropShip_User_ID";
  /** Column name FOB */
  String COLUMNNAME_FOB = "FOB";
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name FreightCharges */
  String COLUMNNAME_FreightCharges = "FreightCharges";
  /** Column name FreightCostRule */
  String COLUMNNAME_FreightCostRule = "FreightCostRule";
  /** Column name GenerateTo */
  String COLUMNNAME_GenerateTo = "GenerateTo";
  /** Column name Insurance */
  String COLUMNNAME_Insurance = "Insurance";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAlternateReturnAddress */
  String COLUMNNAME_IsAlternateReturnAddress = "IsAlternateReturnAddress";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsDropShip */
  String COLUMNNAME_IsDropShip = "IsDropShip";
  /** Column name IsInDispute */
  String COLUMNNAME_IsInDispute = "IsInDispute";
  /** Column name IsInTransit */
  String COLUMNNAME_IsInTransit = "IsInTransit";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_InOut_UU */
  String COLUMNNAME_M_InOut_UU = "M_InOut_UU";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name MovementType */
  String COLUMNNAME_MovementType = "MovementType";
  /** Column name M_RMA_ID */
  String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name NoPackages */
  String COLUMNNAME_NoPackages = "NoPackages";
  /** Column name PickDate */
  String COLUMNNAME_PickDate = "PickDate";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name PriorityRule */
  String COLUMNNAME_PriorityRule = "PriorityRule";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Ref_InOut_ID */
  String COLUMNNAME_Ref_InOut_ID = "Ref_InOut_ID";
  /** Column name ReturnBPartner_ID */
  String COLUMNNAME_ReturnBPartner_ID = "ReturnBPartner_ID";
  /** Column name ReturnLocation_ID */
  String COLUMNNAME_ReturnLocation_ID = "ReturnLocation_ID";
  /** Column name ReturnUser_ID */
  String COLUMNNAME_ReturnUser_ID = "ReturnUser_ID";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name SendEMail */
  String COLUMNNAME_SendEMail = "SendEMail";
  /** Column name ShipDate */
  String COLUMNNAME_ShipDate = "ShipDate";
  /** Column name ShipperAccount */
  String COLUMNNAME_ShipperAccount = "ShipperAccount";
  /** Column name TrackingNo */
  String COLUMNNAME_TrackingNo = "TrackingNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";
  /** Column name Volume */
  String COLUMNNAME_Volume = "Volume";
  /** Column name Weight */
  String COLUMNNAME_Weight = "Weight";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Create Confirm */
  String getCreateConfirm();

  /** Set Create Confirm */
  void setCreateConfirm(String CreateConfirm);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
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

  /** Get Create Package */
  String getCreatePackage();

  /** Set Create Package */
  void setCreatePackage(String CreatePackage);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Date Ordered. Date of Order */
  Timestamp getDateOrdered();

  /** Set Date Ordered. Date of Order */
  void setDateOrdered(Timestamp DateOrdered);

  /** Get Date printed. Date the document was printed. */
  Timestamp getDatePrinted();

  /** Set Date printed. Date the document was printed. */
  void setDatePrinted(Timestamp DatePrinted);

  /** Get Date received. Date a product was received */
  Timestamp getDateReceived();

  /** Set Date received. Date a product was received */
  void setDateReceived(Timestamp DateReceived);

  /** Get Delivery Rule. Defines the timing of Delivery */
  String getDeliveryRule();

  /** Set Delivery Rule. Defines the timing of Delivery */
  void setDeliveryRule(String DeliveryRule);

  /** Get Delivery Via. How the order will be delivered */
  String getDeliveryViaRule();

  /** Set Delivery Via. How the order will be delivered */
  void setDeliveryViaRule(String DeliveryViaRule);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Drop Ship Business Partner. Business Partner to ship to */
  int getDropShip_BPartner_ID();

  /** Set Drop Ship Business Partner. Business Partner to ship to */
  void setDropShip_BPartner_ID(int DropShip_BPartner_ID);

  I_C_BPartner getDropShip_BPartner() throws RuntimeException;

  /** Get Drop Shipment Location. Business Partner Location for shipping to */
  int getDropShip_Location_ID();

  /** Set Drop Shipment Location. Business Partner Location for shipping to */
  void setDropShip_Location_ID(int DropShip_Location_ID);

  I_C_BPartner_Location getDropShip_Location() throws RuntimeException;

  /** Get Drop Shipment Contact. Business Partner Contact for drop shipment */
  int getDropShip_User_ID();

  /** Set Drop Shipment Contact. Business Partner Contact for drop shipment */
  void setDropShip_User_ID(int DropShip_User_ID);

  I_AD_User getDropShip_User() throws RuntimeException;

  /** Get Freight Terms */
  String getFOB();

  /** Set Freight Terms */
  void setFOB(String FOB);

  /** Get Freight Amount. Freight Amount */
  BigDecimal getFreightAmt();

  /** Set Freight Amount. Freight Amount */
  void setFreightAmt(BigDecimal FreightAmt);

  /** Get Freight Charges */
  String getFreightCharges();

  /** Set Freight Charges */
  void setFreightCharges(String FreightCharges);

  /** Get Freight Cost Rule. Method for charging Freight */
  String getFreightCostRule();

  /** Set Freight Cost Rule. Method for charging Freight */
  void setFreightCostRule(String FreightCostRule);

  /** Get Generate To. Generate To */
  String getGenerateTo();

  /** Set Generate To. Generate To */
  void setGenerateTo(String GenerateTo);

  /** Get Insurance */
  String getInsurance();

  /** Set Insurance */
  void setInsurance(String Insurance);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Alternate Return Address */
  void setIsAlternateReturnAddress(boolean IsAlternateReturnAddress);

  /** Get Alternate Return Address */
  boolean isAlternateReturnAddress();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer */
  void setIsDropShip(boolean IsDropShip);

  /** Get Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer */
  boolean isDropShip();

  /** Set In Dispute. Document is in dispute */
  void setIsInDispute(boolean IsInDispute);

  /** Get In Dispute. Document is in dispute */
  boolean isInDispute();

  /** Set In Transit. Movement is in transit */
  void setIsInTransit(boolean IsInTransit);

  /** Get In Transit. Movement is in transit */
  boolean isInTransit();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

  /** Set Shipment/Receipt. Material Shipment Document */
  void setM_InOut_ID(int M_InOut_ID);

  /** Get M_InOut_UU */
  String getM_InOut_UU();

  /** Set M_InOut_UU */
  void setM_InOut_UU(String M_InOut_UU);

  /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

  /** Set Movement Date. Date a product was moved in or out of inventory */
  void setMovementDate(Timestamp MovementDate);

  /** Get Movement Type. Method of moving the inventory */
  String getMovementType();

  /** Set Movement Type. Method of moving the inventory */
  void setMovementType(String MovementType);

  /** Get RMA. Return Material Authorization */
  int getM_RMA_ID();

  /** Set RMA. Return Material Authorization */
  void setM_RMA_ID(int M_RMA_ID);

  I_M_RMA getM_RMA() throws RuntimeException;

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

  /** Set Shipper. Method or manner of product delivery */
  void setM_Shipper_ID(int M_Shipper_ID);

  I_M_Shipper getM_Shipper() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get No Packages. Number of packages shipped */
  int getNoPackages();

  /** Set No Packages. Number of packages shipped */
  void setNoPackages(int NoPackages);

  /** Get Pick Date. Date/Time when picked for Shipment */
  Timestamp getPickDate();

  /** Set Pick Date. Date/Time when picked for Shipment */
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

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get Priority. Priority of a document */
  String getPriorityRule();

  /** Set Priority. Priority of a document */
  void setPriorityRule(String PriorityRule);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
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

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Referenced Shipment */
  int getRef_InOut_ID();

  /** Set Referenced Shipment */
  void setRef_InOut_ID(int Ref_InOut_ID);

  /** Get Return Partner */
  int getReturnBPartner_ID();

  /** Set Return Partner */
  void setReturnBPartner_ID(int ReturnBPartner_ID);

  I_C_BPartner getReturnBPartner() throws RuntimeException;

  /** Get Return Location */
  int getReturnLocation_ID();

  /** Set Return Location */
  void setReturnLocation_ID(int ReturnLocation_ID);

  I_C_BPartner_Location getReturnLocation() throws RuntimeException;

  /** Get Return User/Contact */
  int getReturnUser_ID();

  /** Set Return User/Contact */
  void setReturnUser_ID(int ReturnUser_ID);

  I_AD_User getReturnUser() throws RuntimeException;

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

  I_M_InOut getReversal() throws RuntimeException;

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Send EMail. Enable sending Document EMail */
  boolean isSendEMail();

  /** Set Send EMail. Enable sending Document EMail */
  void setSendEMail(boolean SendEMail);

  /** Get Ship Date. Shipment Date/Time */
  Timestamp getShipDate();

  /** Set Ship Date. Shipment Date/Time */
  void setShipDate(Timestamp ShipDate);

  /** Get Shipper Account Number */
  String getShipperAccount();

  /** Set Shipper Account Number */
  void setShipperAccount(String ShipperAccount);

  /** Get Tracking No. Number to track the shipment */
  String getTrackingNo();

  /** Set Tracking No. Number to track the shipment */
  void setTrackingNo(String TrackingNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;

  /** Get Volume. Volume of a product */
  BigDecimal getVolume();

  /** Set Volume. Volume of a product */
  void setVolume(BigDecimal Volume);

  /** Get Weight. Weight of a product */
  BigDecimal getWeight();

  /** Set Weight. Weight of a product */
  void setWeight(BigDecimal Weight);

  ArrayList<IPODoc> getDocsPostProcess();
}
