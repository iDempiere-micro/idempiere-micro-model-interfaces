package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Package
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Package {

  /** TableName=M_Package */
  String Table_Name = "M_Package";

  /** AD_Table_ID=664 */
  int Table_ID = 664;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BoxCount */
  String COLUMNNAME_BoxCount = "BoxCount";
  /** Column name CashOnDelivery */
  String COLUMNNAME_CashOnDelivery = "CashOnDelivery";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BP_ShippingAcct_ID */
  String COLUMNNAME_C_BP_ShippingAcct_ID = "C_BP_ShippingAcct_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_UOM_Length_ID */
  String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
  /** Column name C_UOM_Weight_ID */
  String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
  /** Column name DateReceived */
  String COLUMNNAME_DateReceived = "DateReceived";
  /** Column name DeliveryConfirmation */
  String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
  /** Column name DeliveryConfirmationType */
  String COLUMNNAME_DeliveryConfirmationType = "DeliveryConfirmationType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name DotHazardClassOrDivision */
  String COLUMNNAME_DotHazardClassOrDivision = "DotHazardClassOrDivision";
  /** Column name DryIceWeight */
  String COLUMNNAME_DryIceWeight = "DryIceWeight";
  /** Column name DutiesShipperAccount */
  String COLUMNNAME_DutiesShipperAccount = "DutiesShipperAccount";
  /** Column name EstimatedWeight */
  String COLUMNNAME_EstimatedWeight = "EstimatedWeight";
  /** Column name FOB */
  String COLUMNNAME_FOB = "FOB";
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
  /** Column name IsResidential */
  String COLUMNNAME_IsResidential = "IsResidential";
  /** Column name IsSaturdayDelivery */
  String COLUMNNAME_IsSaturdayDelivery = "IsSaturdayDelivery";
  /** Column name IsSaturdayPickup */
  String COLUMNNAME_IsSaturdayPickup = "IsSaturdayPickup";
  /** Column name IsVerbalConfirmation */
  String COLUMNNAME_IsVerbalConfirmation = "IsVerbalConfirmation";
  /** Column name LabelPrint */
  String COLUMNNAME_LabelPrint = "LabelPrint";
  /** Column name LatestPickupTime */
  String COLUMNNAME_LatestPickupTime = "LatestPickupTime";
  /** Column name Length */
  String COLUMNNAME_Length = "Length";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_Package_ID */
  String COLUMNNAME_M_Package_ID = "M_Package_ID";
  /** Column name M_Package_UU */
  String COLUMNNAME_M_Package_UU = "M_Package_UU";
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
  /** Column name NotificationMessage */
  String COLUMNNAME_NotificationMessage = "NotificationMessage";
  /** Column name NotificationType */
  String COLUMNNAME_NotificationType = "NotificationType";
  /** Column name OProcessing */
  String COLUMNNAME_OProcessing = "OProcessing";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name Price */
  String COLUMNNAME_Price = "Price";
  /** Column name PriceActual */
  String COLUMNNAME_PriceActual = "PriceActual";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name RateInquiryMessage */
  String COLUMNNAME_RateInquiryMessage = "RateInquiryMessage";
  /** Column name ReceivedInfo */
  String COLUMNNAME_ReceivedInfo = "ReceivedInfo";
  /** Column name ShipDate */
  String COLUMNNAME_ShipDate = "ShipDate";
  /** Column name ShipperAccount */
  String COLUMNNAME_ShipperAccount = "ShipperAccount";
  /** Column name ShippingRateInquiry */
  String COLUMNNAME_ShippingRateInquiry = "ShippingRateInquiry";
  /** Column name ShippingRespMessage */
  String COLUMNNAME_ShippingRespMessage = "ShippingRespMessage";
  /** Column name Surcharges */
  String COLUMNNAME_Surcharges = "Surcharges";
  /** Column name TotalPrice */
  String COLUMNNAME_TotalPrice = "TotalPrice";
  /** Column name TrackingInfo */
  String COLUMNNAME_TrackingInfo = "TrackingInfo";
  /** Column name TrackingNo */
  String COLUMNNAME_TrackingNo = "TrackingNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VoidIt */
  String COLUMNNAME_VoidIt = "VoidIt";
  /** Column name Weight */
  String COLUMNNAME_Weight = "Weight";
  /** Column name Width */
  String COLUMNNAME_Width = "Width";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Box Count */
  int getBoxCount();

  /** Set Box Count */
  void setBoxCount(int BoxCount);

  /** Get COD */
  boolean isCashOnDelivery();

  /** Set COD */
  void setCashOnDelivery(boolean CashOnDelivery);

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

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

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

  /** Get Estimated Weight */
  BigDecimal getEstimatedWeight();

  /** Set Estimated Weight */
  void setEstimatedWeight(BigDecimal EstimatedWeight);

  /** Get Freight Terms */
  String getFOB();

  /** Set Freight Terms */
  void setFOB(String FOB);

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

  /** Get Label Print */
  String getLabelPrint();

  /** Set Label Print */
  void setLabelPrint(String LabelPrint);

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

  /** Get M_Package_UU */
  String getM_Package_UU();

  /** Set M_Package_UU */
  void setM_Package_UU(String M_Package_UU);

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

  /** Get Notification Message */
  String getNotificationMessage();

  /** Set Notification Message */
  void setNotificationMessage(String NotificationMessage);

  /** Get Notification Type. Type of Notifications */
  String getNotificationType();

  /** Set Notification Type. Type of Notifications */
  void setNotificationType(String NotificationType);

  /** Get Online Processing. This payment can be processed online */
  String getOProcessing();

  /** Set Online Processing. This payment can be processed online */
  void setOProcessing(String OProcessing);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

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

  /** Get Rate Inquiry Message */
  String getRateInquiryMessage();

  /** Set Rate Inquiry Message */
  void setRateInquiryMessage(String RateInquiryMessage);

  /** Get Info Received. Information of the receipt of the package (acknowledgement) */
  String getReceivedInfo();

  /** Set Info Received. Information of the receipt of the package (acknowledgement) */
  void setReceivedInfo(String ReceivedInfo);

  /** Get Ship Date. Shipment Date/Time */
  Timestamp getShipDate();

  /** Set Ship Date. Shipment Date/Time */
  void setShipDate(Timestamp ShipDate);

  /** Get Shipper Account Number */
  String getShipperAccount();

  /** Set Shipper Account Number */
  void setShipperAccount(String ShipperAccount);

  /** Get Rate Inquiry */
  String getShippingRateInquiry();

  /** Set Rate Inquiry */
  void setShippingRateInquiry(String ShippingRateInquiry);

  /** Get Response Message */
  String getShippingRespMessage();

  /** Set Response Message */
  void setShippingRespMessage(String ShippingRespMessage);

  /** Get Surcharges */
  BigDecimal getSurcharges();

  /** Set Surcharges */
  void setSurcharges(BigDecimal Surcharges);

  /** Get Total Price */
  BigDecimal getTotalPrice();

  /** Set Total Price */
  void setTotalPrice(BigDecimal TotalPrice);

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

  /** Get Void It */
  String getVoidIt();

  /** Set Void It */
  void setVoidIt(String VoidIt);

  /** Get Weight. Weight of a product */
  BigDecimal getWeight();

  /** Set Weight. Weight of a product */
  void setWeight(BigDecimal Weight);

  /** Get Width */
  BigDecimal getWidth();

  /** Set Width */
  void setWidth(BigDecimal Width);
}
