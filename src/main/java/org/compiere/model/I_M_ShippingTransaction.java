package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShippingTransaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingTransaction {

  /** TableName=M_ShippingTransaction */
  String Table_Name = "M_ShippingTransaction";

  /** AD_Table_ID=200051 */
  int Table_ID = 200051;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name Action */
  String COLUMNNAME_Action = "Action";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Bill_Location_ID */
  String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";
  /** Column name BoxCount */
  String COLUMNNAME_BoxCount = "BoxCount";
  /** Column name CashOnDelivery */
  String COLUMNNAME_CashOnDelivery = "CashOnDelivery";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BP_ShippingAcct_ID */
  String COLUMNNAME_C_BP_ShippingAcct_ID = "C_BP_ShippingAcct_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name CODAmount */
  String COLUMNNAME_CODAmount = "CODAmount";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_UOM_Length_ID */
  String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
  /** Column name C_UOM_Weight_ID */
  String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
  /** Column name CustomsValue */
  String COLUMNNAME_CustomsValue = "CustomsValue";
  /** Column name DateReceived */
  String COLUMNNAME_DateReceived = "DateReceived";
  /** Column name DeliveryConfirmation */
  String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
  /** Column name DeliveryConfirmationType */
  String COLUMNNAME_DeliveryConfirmationType = "DeliveryConfirmationType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DotHazardClassOrDivision */
  String COLUMNNAME_DotHazardClassOrDivision = "DotHazardClassOrDivision";
  /** Column name DryIceWeight */
  String COLUMNNAME_DryIceWeight = "DryIceWeight";
  /** Column name DutiesShipperAccount */
  String COLUMNNAME_DutiesShipperAccount = "DutiesShipperAccount";
  /** Column name FOB */
  String COLUMNNAME_FOB = "FOB";
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name FreightCharges */
  String COLUMNNAME_FreightCharges = "FreightCharges";
  /** Column name HandlingCharge */
  String COLUMNNAME_HandlingCharge = "HandlingCharge";
  /** Column name Height */
  String COLUMNNAME_Height = "Height";
  /** Column name HoldAddress_ID */
  String COLUMNNAME_HoldAddress_ID = "HoldAddress_ID";
  /** Column name HomeDeliveryPremiumDate */
  String COLUMNNAME_HomeDeliveryPremiumDate = "HomeDeliveryPremiumDate";
  /** Column name HomeDeliveryPremiumPhone */
  String COLUMNNAME_HomeDeliveryPremiumPhone = "HomeDeliveryPremiumPhone";
  /** Column name HomeDeliveryPremiumType */
  String COLUMNNAME_HomeDeliveryPremiumType = "HomeDeliveryPremiumType";
  /** Column name Insurance */
  String COLUMNNAME_Insurance = "Insurance";
  /** Column name InsuredAmount */
  String COLUMNNAME_InsuredAmount = "InsuredAmount";
  /** Column name IsAccessible */
  String COLUMNNAME_IsAccessible = "IsAccessible";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAddedHandling */
  String COLUMNNAME_IsAddedHandling = "IsAddedHandling";
  /** Column name IsAlternateReturnAddress */
  String COLUMNNAME_IsAlternateReturnAddress = "IsAlternateReturnAddress";
  /** Column name IsCargoAircraftOnly */
  String COLUMNNAME_IsCargoAircraftOnly = "IsCargoAircraftOnly";
  /** Column name IsDryIce */
  String COLUMNNAME_IsDryIce = "IsDryIce";
  /** Column name IsDutiable */
  String COLUMNNAME_IsDutiable = "IsDutiable";
  /** Column name IsFutureDayShipment */
  String COLUMNNAME_IsFutureDayShipment = "IsFutureDayShipment";
  /** Column name IsHazMat */
  String COLUMNNAME_IsHazMat = "IsHazMat";
  /** Column name IsHoldAtLocation */
  String COLUMNNAME_IsHoldAtLocation = "IsHoldAtLocation";
  /** Column name IsIgnoreZipNotFound */
  String COLUMNNAME_IsIgnoreZipNotFound = "IsIgnoreZipNotFound";
  /** Column name IsIgnoreZipStateNotMatch */
  String COLUMNNAME_IsIgnoreZipStateNotMatch = "IsIgnoreZipStateNotMatch";
  /** Column name IsPriviledgedRate */
  String COLUMNNAME_IsPriviledgedRate = "IsPriviledgedRate";
  /** Column name IsResidential */
  String COLUMNNAME_IsResidential = "IsResidential";
  /** Column name IsSaturdayDelivery */
  String COLUMNNAME_IsSaturdayDelivery = "IsSaturdayDelivery";
  /** Column name IsSaturdayPickup */
  String COLUMNNAME_IsSaturdayPickup = "IsSaturdayPickup";
  /** Column name IsVerbalConfirmation */
  String COLUMNNAME_IsVerbalConfirmation = "IsVerbalConfirmation";
  /** Column name LatestPickupTime */
  String COLUMNNAME_LatestPickupTime = "LatestPickupTime";
  /** Column name Length */
  String COLUMNNAME_Length = "Length";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_Package_ID */
  String COLUMNNAME_M_Package_ID = "M_Package_ID";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_ShipperLabels_ID */
  String COLUMNNAME_M_ShipperLabels_ID = "M_ShipperLabels_ID";
  /** Column name M_ShipperPackaging_ID */
  String COLUMNNAME_M_ShipperPackaging_ID = "M_ShipperPackaging_ID";
  /** Column name M_ShipperPickupTypes_ID */
  String COLUMNNAME_M_ShipperPickupTypes_ID = "M_ShipperPickupTypes_ID";
  /** Column name M_ShippingProcessor_ID */
  String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
  /** Column name M_ShippingTransaction_ID */
  String COLUMNNAME_M_ShippingTransaction_ID = "M_ShippingTransaction_ID";
  /** Column name M_ShippingTransaction_UU */
  String COLUMNNAME_M_ShippingTransaction_UU = "M_ShippingTransaction_UU";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name NotificationMessage */
  String COLUMNNAME_NotificationMessage = "NotificationMessage";
  /** Column name NotificationType */
  String COLUMNNAME_NotificationType = "NotificationType";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name Price */
  String COLUMNNAME_Price = "Price";
  /** Column name PriceActual */
  String COLUMNNAME_PriceActual = "PriceActual";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ReceivedInfo */
  String COLUMNNAME_ReceivedInfo = "ReceivedInfo";
  /** Column name ReturnBPartner_ID */
  String COLUMNNAME_ReturnBPartner_ID = "ReturnBPartner_ID";
  /** Column name ReturnLocation_ID */
  String COLUMNNAME_ReturnLocation_ID = "ReturnLocation_ID";
  /** Column name ReturnUser_ID */
  String COLUMNNAME_ReturnUser_ID = "ReturnUser_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name ShipDate */
  String COLUMNNAME_ShipDate = "ShipDate";
  /** Column name ShipperAccount */
  String COLUMNNAME_ShipperAccount = "ShipperAccount";
  /** Column name ShippingRespMessage */
  String COLUMNNAME_ShippingRespMessage = "ShippingRespMessage";
  /** Column name Surcharges */
  String COLUMNNAME_Surcharges = "Surcharges";
  /** Column name TrackingInfo */
  String COLUMNNAME_TrackingInfo = "TrackingInfo";
  /** Column name TrackingNo */
  String COLUMNNAME_TrackingNo = "TrackingNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Weight */
  String COLUMNNAME_Weight = "Weight";
  /** Column name Width */
  String COLUMNNAME_Width = "Width";

  /** Get Action. Indicates the Action to be performed */
  String getAction();

  /** Set Action. Indicates the Action to be performed */
  void setAction(String Action);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Invoice Location. Business Partner Location for invoicing */
  int getBill_Location_ID();

  /** Set Invoice Location. Business Partner Location for invoicing */
  void setBill_Location_ID(int Bill_Location_ID);

  I_C_BPartner_Location getBill_Location() throws RuntimeException;

  /** Get Box Count */
  int getBoxCount();

  /** Set Box Count */
  void setBoxCount(int BoxCount);

  /** Get COD */
  boolean isCashOnDelivery();

  /** Set COD */
  void setCashOnDelivery(boolean CashOnDelivery);

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

  /** Get Business Partner Shipping Account */
  int getC_BP_ShippingAcct_ID();

  /** Set Business Partner Shipping Account */
  void setC_BP_ShippingAcct_ID(int C_BP_ShippingAcct_ID);

  I_C_BP_ShippingAcct getC_BP_ShippingAcct() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get COD Amount */
  BigDecimal getCODAmount();

  /** Set COD Amount */
  void setCODAmount(BigDecimal CODAmount);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get UOM for Length. Standard Unit of Measure for Length */
  int getC_UOM_Length_ID();

  /** Set UOM for Length. Standard Unit of Measure for Length */
  void setC_UOM_Length_ID(int C_UOM_Length_ID);

  I_C_UOM getC_UOM_Length() throws RuntimeException;

  /** Get UOM for Weight. Standard Unit of Measure for Weight */
  int getC_UOM_Weight_ID();

  /** Set UOM for Weight. Standard Unit of Measure for Weight */
  void setC_UOM_Weight_ID(int C_UOM_Weight_ID);

  I_C_UOM getC_UOM_Weight() throws RuntimeException;

  /** Get Customs Value */
  BigDecimal getCustomsValue();

  /** Set Customs Value */
  void setCustomsValue(BigDecimal CustomsValue);

  /** Get Date received. Date a product was received */
  Timestamp getDateReceived();

  /** Set Date received. Date a product was received */
  void setDateReceived(Timestamp DateReceived);

  /** Get Delivery Confirmation. EMail Delivery confirmation */
  boolean isDeliveryConfirmation();

  /** Set Delivery Confirmation. EMail Delivery confirmation */
  void setDeliveryConfirmation(boolean DeliveryConfirmation);

  /** Get Delivery Confirmation Type */
  String getDeliveryConfirmationType();

  /** Set Delivery Confirmation Type */
  void setDeliveryConfirmationType(String DeliveryConfirmationType);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Dot Hazard Class or Division */
  String getDotHazardClassOrDivision();

  /** Set Dot Hazard Class or Division */
  void setDotHazardClassOrDivision(String DotHazardClassOrDivision);

  /** Get Dry Ice Weight */
  BigDecimal getDryIceWeight();

  /** Set Dry Ice Weight */
  void setDryIceWeight(BigDecimal DryIceWeight);

  /** Get Duties Shipper Account */
  String getDutiesShipperAccount();

  /** Set Duties Shipper Account */
  void setDutiesShipperAccount(String DutiesShipperAccount);

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

  /** Get Handling Charge */
  BigDecimal getHandlingCharge();

  /** Set Handling Charge */
  void setHandlingCharge(BigDecimal HandlingCharge);

  /** Get Height */
  BigDecimal getHeight();

  /** Set Height */
  void setHeight(BigDecimal Height);

  /** Get Hold Address */
  int getHoldAddress_ID();

  /** Set Hold Address */
  void setHoldAddress_ID(int HoldAddress_ID);

  I_C_BPartner_Location getHoldAddress() throws RuntimeException;

  /** Get Date */
  Timestamp getHomeDeliveryPremiumDate();

  /** Set Date */
  void setHomeDeliveryPremiumDate(Timestamp HomeDeliveryPremiumDate);

  /** Get Phone Number */
  String getHomeDeliveryPremiumPhone();

  /** Set Phone Number */
  void setHomeDeliveryPremiumPhone(String HomeDeliveryPremiumPhone);

  /** Get Home Delivery Premium Type */
  String getHomeDeliveryPremiumType();

  /** Set Home Delivery Premium Type */
  void setHomeDeliveryPremiumType(String HomeDeliveryPremiumType);

  /** Get Insurance */
  String getInsurance();

  /** Set Insurance */
  void setInsurance(String Insurance);

  /** Get Insured Amount */
  BigDecimal getInsuredAmount();

  /** Set Insured Amount */
  void setInsuredAmount(BigDecimal InsuredAmount);

  /** Set Accessible */
  void setIsAccessible(boolean IsAccessible);

  /** Get Accessible */
  boolean isAccessible();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Added Handling */
  void setIsAddedHandling(boolean IsAddedHandling);

  /** Get Added Handling */
  boolean isAddedHandling();

  /** Set Alternate Return Address */
  void setIsAlternateReturnAddress(boolean IsAlternateReturnAddress);

  /** Get Alternate Return Address */
  boolean isAlternateReturnAddress();

  /** Set Cargo Aircraft Only */
  void setIsCargoAircraftOnly(boolean IsCargoAircraftOnly);

  /** Get Cargo Aircraft Only */
  boolean isCargoAircraftOnly();

  /** Set Dry Ice */
  void setIsDryIce(boolean IsDryIce);

  /** Get Dry Ice */
  boolean isDryIce();

  /** Set Dutiable */
  void setIsDutiable(boolean IsDutiable);

  /** Get Dutiable */
  boolean isDutiable();

  /** Set Future Day Shipment */
  void setIsFutureDayShipment(boolean IsFutureDayShipment);

  /** Get Future Day Shipment */
  boolean isFutureDayShipment();

  /** Set Hazardous Materials */
  void setIsHazMat(boolean IsHazMat);

  /** Get Hazardous Materials */
  boolean isHazMat();

  /** Set Hold At Location */
  void setIsHoldAtLocation(boolean IsHoldAtLocation);

  /** Get Hold At Location */
  boolean isHoldAtLocation();

  /** Set Ignore Zip Not Found */
  void setIsIgnoreZipNotFound(boolean IsIgnoreZipNotFound);

  /** Get Ignore Zip Not Found */
  boolean isIgnoreZipNotFound();

  /** Set Ignore Zip State Not Match */
  void setIsIgnoreZipStateNotMatch(boolean IsIgnoreZipStateNotMatch);

  /** Get Ignore Zip State Not Match */
  boolean isIgnoreZipStateNotMatch();

  /** Set Priviledged Rate */
  void setIsPriviledgedRate(boolean IsPriviledgedRate);

  /** Get Priviledged Rate */
  boolean isPriviledgedRate();

  /** Set Residential */
  void setIsResidential(boolean IsResidential);

  /** Get Residential */
  boolean isResidential();

  /** Set Saturday Delivery */
  void setIsSaturdayDelivery(boolean IsSaturdayDelivery);

  /** Get Saturday Delivery */
  boolean isSaturdayDelivery();

  /** Set Saturday Pickup */
  void setIsSaturdayPickup(boolean IsSaturdayPickup);

  /** Get Saturday Pickup */
  boolean isSaturdayPickup();

  /** Set Verbal Confirmation */
  void setIsVerbalConfirmation(boolean IsVerbalConfirmation);

  /** Get Verbal Confirmation */
  boolean isVerbalConfirmation();

  /** Get Latest Pickup Time */
  Timestamp getLatestPickupTime();

  /** Set Latest Pickup Time */
  void setLatestPickupTime(Timestamp LatestPickupTime);

  /** Get Length */
  BigDecimal getLength();

  /** Set Length */
  void setLength(BigDecimal Length);

  /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

  /** Set Shipment/Receipt. Material Shipment Document */
  void setM_InOut_ID(int M_InOut_ID);

  I_M_InOut getM_InOut() throws RuntimeException;

  /** Get Package. Shipment Package */
  int getM_Package_ID();

  /** Set Package. Shipment Package */
  void setM_Package_ID(int M_Package_ID);

  I_M_Package getM_Package() throws RuntimeException;

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

  /** Set Shipper. Method or manner of product delivery */
  void setM_Shipper_ID(int M_Shipper_ID);

  I_M_Shipper getM_Shipper() throws RuntimeException;

  /** Get Shipper Labels */
  int getM_ShipperLabels_ID();

  /** Set Shipper Labels */
  void setM_ShipperLabels_ID(int M_ShipperLabels_ID);

  I_M_ShipperLabels getM_ShipperLabels() throws RuntimeException;

  /** Get Shipper Packaging */
  int getM_ShipperPackaging_ID();

  /** Set Shipper Packaging */
  void setM_ShipperPackaging_ID(int M_ShipperPackaging_ID);

  I_M_ShipperPackaging getM_ShipperPackaging() throws RuntimeException;

  /** Get Shipper Pickup Types */
  int getM_ShipperPickupTypes_ID();

  /** Set Shipper Pickup Types */
  void setM_ShipperPickupTypes_ID(int M_ShipperPickupTypes_ID);

  I_M_ShipperPickupTypes getM_ShipperPickupTypes() throws RuntimeException;

  /** Get Shipping Processor */
  int getM_ShippingProcessor_ID();

  /** Set Shipping Processor */
  void setM_ShippingProcessor_ID(int M_ShippingProcessor_ID);

  I_M_ShippingProcessor getM_ShippingProcessor() throws RuntimeException;

  /** Get Shipping Transaction */
  int getM_ShippingTransaction_ID();

  /** Set Shipping Transaction */
  void setM_ShippingTransaction_ID(int M_ShippingTransaction_ID);

  /** Get M_ShippingTransaction_UU */
  String getM_ShippingTransaction_UU();

  /** Set M_ShippingTransaction_UU */
  void setM_ShippingTransaction_UU(String M_ShippingTransaction_UU);

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Notification Message */
  String getNotificationMessage();

  /** Set Notification Message */
  void setNotificationMessage(String NotificationMessage);

  /** Get Notification Type. Type of Notifications */
  String getNotificationType();

  /** Set Notification Type. Type of Notifications */
  void setNotificationType(String NotificationType);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

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

  /** Get Price. Price */
  BigDecimal getPrice();

  /** Set Price. Price */
  void setPrice(BigDecimal Price);

  /** Get Unit Price. Actual Price */
  BigDecimal getPriceActual();

  /** Set Unit Price. Actual Price */
  void setPriceActual(BigDecimal PriceActual);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Info Received. Information of the receipt of the package (acknowledgement) */
  String getReceivedInfo();

  /** Set Info Received. Information of the receipt of the package (acknowledgement) */
  void setReceivedInfo(String ReceivedInfo);

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

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Ship Date. Shipment Date/Time */
  Timestamp getShipDate();

  /** Set Ship Date. Shipment Date/Time */
  void setShipDate(Timestamp ShipDate);

  /** Get Shipper Account Number */
  String getShipperAccount();

  /** Set Shipper Account Number */
  void setShipperAccount(String ShipperAccount);

  /** Get Response Message */
  String getShippingRespMessage();

  /** Set Response Message */
  void setShippingRespMessage(String ShippingRespMessage);

  /** Get Surcharges */
  BigDecimal getSurcharges();

  /** Set Surcharges */
  void setSurcharges(BigDecimal Surcharges);

  /** Get Tracking Info */
  String getTrackingInfo();

  /** Set Tracking Info */
  void setTrackingInfo(String TrackingInfo);

  /** Get Tracking No. Number to track the shipment */
  String getTrackingNo();

  /** Set Tracking No. Number to track the shipment */
  void setTrackingNo(String TrackingNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Weight. Weight of a product */
  BigDecimal getWeight();

  /** Set Weight. Weight of a product */
  void setWeight(BigDecimal Weight);

  /** Get Width */
  BigDecimal getWidth();

  /** Set Width */
  void setWidth(BigDecimal Width);
}
