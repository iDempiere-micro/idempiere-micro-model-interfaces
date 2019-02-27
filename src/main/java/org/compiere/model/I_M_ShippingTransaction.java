package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_ShippingTransaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingTransaction {

    /**
     * AD_Table_ID=200051
     */
    int Table_ID = 200051;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name Action
     */
    String COLUMNNAME_Action = "Action";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Bill_Location_ID
     */
    String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";
    /**
     * Column name BoxCount
     */
    String COLUMNNAME_BoxCount = "BoxCount";
    /**
     * Column name CashOnDelivery
     */
    String COLUMNNAME_CashOnDelivery = "CashOnDelivery";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_BP_ShippingAcct_ID
     */
    String COLUMNNAME_C_BP_ShippingAcct_ID = "C_BP_ShippingAcct_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name CODAmount
     */
    String COLUMNNAME_CODAmount = "CODAmount";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_UOM_Length_ID
     */
    String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
    /**
     * Column name C_UOM_Weight_ID
     */
    String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
    /**
     * Column name CustomsValue
     */
    String COLUMNNAME_CustomsValue = "CustomsValue";
    /**
     * Column name DutiesShipperAccount
     */
    String COLUMNNAME_DutiesShipperAccount = "DutiesShipperAccount";
    /**
     * Column name FreightAmt
     */
    String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name FreightCharges
     */
    String COLUMNNAME_FreightCharges = "FreightCharges";
    /**
     * Column name HoldAddress_ID
     */
    String COLUMNNAME_HoldAddress_ID = "HoldAddress_ID";
    /**
     * Column name IsPriviledgedRate
     */
    String COLUMNNAME_IsPriviledgedRate = "IsPriviledgedRate";
    /**
     * Column name IsResidential
     */
    String COLUMNNAME_IsResidential = "IsResidential";
    /**
     * Column name IsSaturdayDelivery
     */
    String COLUMNNAME_IsSaturdayDelivery = "IsSaturdayDelivery";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_Package_ID
     */
    String COLUMNNAME_M_Package_ID = "M_Package_ID";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperLabels_ID
     */
    String COLUMNNAME_M_ShipperLabels_ID = "M_ShipperLabels_ID";
    /**
     * Column name M_ShipperPackaging_ID
     */
    String COLUMNNAME_M_ShipperPackaging_ID = "M_ShipperPackaging_ID";
    /**
     * Column name M_ShipperPickupTypes_ID
     */
    String COLUMNNAME_M_ShipperPickupTypes_ID = "M_ShipperPickupTypes_ID";
    /**
     * Column name M_ShippingProcessor_ID
     */
    String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
    /**
     * Column name M_ShippingTransaction_ID
     */
    String COLUMNNAME_M_ShippingTransaction_ID = "M_ShippingTransaction_ID";
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
     * Column name Price
     */
    String COLUMNNAME_Price = "Price";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name ShipDate
     */
    String COLUMNNAME_ShipDate = "ShipDate";
    /**
     * Column name ShipperAccount
     */
    String COLUMNNAME_ShipperAccount = "ShipperAccount";
    /**
     * Column name ShippingRespMessage
     */
    String COLUMNNAME_ShippingRespMessage = "ShippingRespMessage";
    /**
     * Column name TrackingInfo
     */
    String COLUMNNAME_TrackingInfo = "TrackingInfo";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

    /**
     * Get Action. Indicates the Action to be performed
     */
    String getAction();

    /**
     * Set Action. Indicates the Action to be performed
     */
    void setAction(String Action);

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Set Invoice Location. Business Partner Location for invoicing
     */
    void setBusinessPartnerInvoicingLocationId(int Bill_Location_ID);

    /**
     * Set Box Count
     */
    void setBoxCount(int BoxCount);

    /**
     * Get COD
     */
    boolean isCashOnDelivery();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setBusinessPartnerLocationId(int C_BPartner_Location_ID);

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Set COD Amount
     */
    void setCODAmount(BigDecimal CODAmount);

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Set UOM for Length. Standard Unit of Measure for Length
     */
    void setC_UOM_Length_ID(int C_UOM_Length_ID);

    /**
     * Set UOM for Weight. Standard Unit of Measure for Weight
     */
    void setC_UOM_Weight_ID(int C_UOM_Weight_ID);

    /**
     * Set Customs Value
     */
    void setCustomsValue(BigDecimal CustomsValue);

    /**
     * Set Duties Shipper Account
     */
    void setDutiesShipperAccount(String DutiesShipperAccount);

    /**
     * Set Freight Amount. Freight Amount
     */
    void setFreightAmt(BigDecimal FreightAmt);

    /**
     * Get Freight Charges
     */
    String getFreightCharges();

    /**
     * Set Freight Charges
     */
    void setFreightCharges(String FreightCharges);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Set Priviledged Rate
     */
    void setIsPriviledgedRate(boolean IsPriviledgedRate);

    /**
     * Get Priviledged Rate
     */
    boolean isPriviledgedRate();

    /**
     * Set Residential
     */
    void setIsResidential(boolean IsResidential);

    /**
     * Set Saturday Delivery
     */
    void setIsSaturdayDelivery(boolean IsSaturdayDelivery);

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    /**
     * Set Shipper Labels
     */
    void setM_ShipperLabels_ID(int M_ShipperLabels_ID);

    /**
     * Set Shipper Packaging
     */
    void setM_ShipperPackaging_ID(int M_ShipperPackaging_ID);

    /**
     * Set Shipper Pickup Types
     */
    void setM_ShipperPickupTypes_ID(int M_ShipperPickupTypes_ID);

    /**
     * Set Shipping Processor
     */
    void setM_ShippingProcessor_ID(int M_ShippingProcessor_ID);

    /**
     * Get Shipping Transaction
     */
    int getM_ShippingTransaction_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    /**
     * Set Payment Rule. How you pay the invoice
     */
    void setPaymentRule(String PaymentRule);

    /**
     * Set Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    void setPOReference(String POReference);

    /**
     * Get Price. Price
     */
    BigDecimal getPrice();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);

    /**
     * Set Ship Date. Shipment Date/Time
     */
    void setShipDate(Timestamp ShipDate);

    /**
     * Set Shipper Account Number
     */
    void setShipperAccount(String ShipperAccount);

    /**
     * Get Response Message
     */
    String getShippingRespMessage();

    /**
     * Set Tracking Info
     */
    void setTrackingInfo(String TrackingInfo);

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);

}
