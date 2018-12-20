package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Order extends IPO {

  /** TableName=C_Order */
  String Table_Name = "C_Order";

  /** AD_Table_ID=259 */
  int Table_ID = 259;

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
  /** Column name AmountRefunded */
  String COLUMNNAME_AmountRefunded = "AmountRefunded";
  /** Column name AmountTendered */
  String COLUMNNAME_AmountTendered = "AmountTendered";
  /** Column name Bill_BPartner_ID */
  String COLUMNNAME_Bill_BPartner_ID = "Bill_BPartner_ID";
  /** Column name Bill_Location_ID */
  String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";
  /** Column name Bill_User_ID */
  String COLUMNNAME_Bill_User_ID = "Bill_User_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_CashLine_ID */
  String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
  /** Column name C_CashPlanLine_ID */
  String COLUMNNAME_C_CashPlanLine_ID = "C_CashPlanLine_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_DocTypeTarget_ID */
  String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name C_Opportunity_ID */
  String COLUMNNAME_C_Opportunity_ID = "C_Opportunity_ID";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_OrderSource_ID */
  String COLUMNNAME_C_OrderSource_ID = "C_OrderSource_ID";
  /** Column name C_Order_UU */
  String COLUMNNAME_C_Order_UU = "C_Order_UU";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
  /** Column name C_POS_ID */
  String COLUMNNAME_C_POS_ID = "C_POS_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateOrdered */
  String COLUMNNAME_DateOrdered = "DateOrdered";
  /** Column name DatePrinted */
  String COLUMNNAME_DatePrinted = "DatePrinted";
  /** Column name DatePromised */
  String COLUMNNAME_DatePromised = "DatePromised";
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
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name FreightCostRule */
  String COLUMNNAME_FreightCostRule = "FreightCostRule";
  /** Column name GrandTotal */
  String COLUMNNAME_GrandTotal = "GrandTotal";
  /** Column name InvoiceRule */
  String COLUMNNAME_InvoiceRule = "InvoiceRule";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsCreditApproved */
  String COLUMNNAME_IsCreditApproved = "IsCreditApproved";
  /** Column name IsDelivered */
  String COLUMNNAME_IsDelivered = "IsDelivered";
  /** Column name IsDiscountPrinted */
  String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
  /** Column name IsDropShip */
  String COLUMNNAME_IsDropShip = "IsDropShip";
  /** Column name IsInvoiced */
  String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name IsPayScheduleValid */
  String COLUMNNAME_IsPayScheduleValid = "IsPayScheduleValid";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsPriviledgedRate */
  String COLUMNNAME_IsPriviledgedRate = "IsPriviledgedRate";
  /** Column name IsSelected */
  String COLUMNNAME_IsSelected = "IsSelected";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name IsTaxIncluded */
  String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
  /** Column name IsTransferred */
  String COLUMNNAME_IsTransferred = "IsTransferred";
  /** Column name Link_Order_ID */
  String COLUMNNAME_Link_Order_ID = "Link_Order_ID";
  /** Column name M_FreightCategory_ID */
  String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name Pay_BPartner_ID */
  String COLUMNNAME_Pay_BPartner_ID = "Pay_BPartner_ID";
  /** Column name Pay_Location_ID */
  String COLUMNNAME_Pay_Location_ID = "Pay_Location_ID";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
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
  /** Column name PromotionCode */
  String COLUMNNAME_PromotionCode = "PromotionCode";
  /** Column name QuotationOrder_ID */
  String COLUMNNAME_QuotationOrder_ID = "QuotationOrder_ID";
  /** Column name Ref_Order_ID */
  String COLUMNNAME_Ref_Order_ID = "Ref_Order_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name SendEMail */
  String COLUMNNAME_SendEMail = "SendEMail";
  /** Column name ShippingRateInquiry */
  String COLUMNNAME_ShippingRateInquiry = "ShippingRateInquiry";
  /** Column name TotalLines */
  String COLUMNNAME_TotalLines = "TotalLines";
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

  /** Get AmountRefunded */
  BigDecimal getAmountRefunded();

  /** Set AmountRefunded */
  void setAmountRefunded(BigDecimal AmountRefunded);

  /** Get AmountTendered */
  BigDecimal getAmountTendered();

  /** Set AmountTendered */
  void setAmountTendered(BigDecimal AmountTendered);

  /** Get Invoice Partner. Business Partner to be invoiced */
  int getBill_BPartner_ID();

  /** Set Invoice Partner. Business Partner to be invoiced */
  void setBill_BPartner_ID(int Bill_BPartner_ID);

  I_C_BPartner getBill_BPartner() throws RuntimeException;

  /** Get Invoice Location. Business Partner Location for invoicing */
  int getBill_Location_ID();

  /** Set Invoice Location. Business Partner Location for invoicing */
  void setBill_Location_ID(int Bill_Location_ID);

  I_C_BPartner_Location getBill_Location() throws RuntimeException;

  /** Get Invoice Contact. Business Partner Contact for invoicing */
  int getBill_User_ID();

  /** Set Invoice Contact. Business Partner Contact for invoicing */
  void setBill_User_ID(int Bill_User_ID);

  I_AD_User getBill_User() throws RuntimeException;

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

  /** Get Cash Journal Line. Cash Journal Line */
  int getC_CashLine_ID();

  /** Set Cash Journal Line. Cash Journal Line */
  void setC_CashLine_ID(int C_CashLine_ID);

  I_C_CashLine getC_CashLine() throws RuntimeException;

  /** Get Cash Plan Line */
  int getC_CashPlanLine_ID();

  /** Set Cash Plan Line */
  void setC_CashPlanLine_ID(int C_CashPlanLine_ID);

  I_C_CashPlanLine getC_CashPlanLine() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Target Document Type. Target document type for conversing documents */
  int getC_DocTypeTarget_ID();

  /** Set Target Document Type. Target document type for conversing documents */
  void setC_DocTypeTarget_ID(int C_DocTypeTarget_ID);

  I_C_DocType getC_DocTypeTarget() throws RuntimeException;

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Sales Opportunity */
  int getC_Opportunity_ID();

  /** Set Sales Opportunity */
  void setC_Opportunity_ID(int C_Opportunity_ID);

  I_C_Opportunity getC_Opportunity() throws RuntimeException;

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  /** Get Order Source */
  int getC_OrderSource_ID();

  /** Set Order Source */
  void setC_OrderSource_ID(int C_OrderSource_ID);

  I_C_OrderSource getC_OrderSource() throws RuntimeException;

  /** Get C_Order_UU */
  String getC_Order_UU();

  /** Set C_Order_UU */
  void setC_Order_UU(String C_Order_UU);

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

  /** Set Payment Term. The terms of Payment (timing, discount) */
  void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

  I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

  /** Get POS Terminal. Point of Sales Terminal */
  int getC_POS_ID();

  /** Set POS Terminal. Point of Sales Terminal */
  void setC_POS_ID(int C_POS_ID);

  I_C_POS getC_POS() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Get Date Promised. Date Order was promised */
  Timestamp getDatePromised();

  /** Set Date Promised. Date Order was promised */
  void setDatePromised(Timestamp DatePromised);

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

  /** Get Freight Amount. Freight Amount */
  BigDecimal getFreightAmt();

  /** Set Freight Amount. Freight Amount */
  void setFreightAmt(BigDecimal FreightAmt);

  /** Get Freight Cost Rule. Method for charging Freight */
  String getFreightCostRule();

  /** Set Freight Cost Rule. Method for charging Freight */
  void setFreightCostRule(String FreightCostRule);

  /** Get Grand Total. Total amount of document */
  BigDecimal getGrandTotal();

  /** Set Grand Total. Total amount of document */
  void setGrandTotal(BigDecimal GrandTotal);

  /** Get Invoice Rule. Frequency and method of invoicing */
  String getInvoiceRule();

  /** Set Invoice Rule. Frequency and method of invoicing */
  void setInvoiceRule(String InvoiceRule);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Credit Approved. Credit has been approved */
  void setIsCreditApproved(boolean IsCreditApproved);

  /** Get Credit Approved. Credit has been approved */
  boolean isCreditApproved();

  /** Set Delivered */
  void setIsDelivered(boolean IsDelivered);

  /** Get Delivered */
  boolean isDelivered();

  /** Set Discount Printed. Print Discount on Invoice and Order */
  void setIsDiscountPrinted(boolean IsDiscountPrinted);

  /** Get Discount Printed. Print Discount on Invoice and Order */
  boolean isDiscountPrinted();

  /** Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer */
  void setIsDropShip(boolean IsDropShip);

  /** Get Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer */
  boolean isDropShip();

  /** Set Invoiced. Is this invoiced? */
  void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  boolean isInvoiced();

  /** Set Pay Schedule valid. Is the Payment Schedule is valid */
  void setIsPayScheduleValid(boolean IsPayScheduleValid);

  /** Get Pay Schedule valid. Is the Payment Schedule is valid */
  boolean isPayScheduleValid();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Set Priviledged Rate */
  void setIsPriviledgedRate(boolean IsPriviledgedRate);

  /** Get Priviledged Rate */
  boolean isPriviledgedRate();

  /** Set Selected */
  void setIsSelected(boolean IsSelected);

  /** Get Selected */
  boolean isSelected();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Price includes Tax. Tax is included in the price */
  void setIsTaxIncluded(boolean IsTaxIncluded);

  /** Get Price includes Tax. Tax is included in the price */
  boolean isTaxIncluded();

  /** Set Transferred. Transferred to General Ledger (i.e. accounted) */
  void setIsTransferred(boolean IsTransferred);

  /** Get Transferred. Transferred to General Ledger (i.e. accounted) */
  boolean isTransferred();

  /**
   * Get Linked Order. This field links a sales order to the purchase order that is generated from
   * it.
   */
  int getLink_Order_ID();

  /**
   * Set Linked Order. This field links a sales order to the purchase order that is generated from
   * it.
   */
  void setLink_Order_ID(int Link_Order_ID);

  I_C_Order getLink_Order() throws RuntimeException;

  /** Get Freight Category. Category of the Freight */
  int getM_FreightCategory_ID();

  /** Set Freight Category. Category of the Freight */
  void setM_FreightCategory_ID(int M_FreightCategory_ID);

  I_M_FreightCategory getM_FreightCategory() throws RuntimeException;

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

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

  /** Get Payment BPartner. Business Partner responsible for the payment */
  int getPay_BPartner_ID();

  /** Set Payment BPartner. Business Partner responsible for the payment */
  void setPay_BPartner_ID(int Pay_BPartner_ID);

  /** Get Payment Location. Location of the Business Partner responsible for the payment */
  int getPay_Location_ID();

  /** Set Payment Location. Location of the Business Partner responsible for the payment */
  void setPay_Location_ID(int Pay_Location_ID);

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

  /** Get Promotion Code. User entered promotion code at sales time */
  String getPromotionCode();

  /** Set Promotion Code. User entered promotion code at sales time */
  void setPromotionCode(String PromotionCode);

  /** Get Quotation. Quotation used for generating this order */
  int getQuotationOrder_ID();

  /** Set Quotation. Quotation used for generating this order */
  void setQuotationOrder_ID(int QuotationOrder_ID);

  I_C_Order getQuotationOrder() throws RuntimeException;

  /** Get Referenced Order. Reference to corresponding Sales/Purchase Order */
  int getRef_Order_ID();

  /** Set Referenced Order. Reference to corresponding Sales/Purchase Order */
  void setRef_Order_ID(int Ref_Order_ID);

  I_C_Order getRef_Order() throws RuntimeException;

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Send EMail. Enable sending Document EMail */
  boolean isSendEMail();

  /** Set Send EMail. Enable sending Document EMail */
  void setSendEMail(boolean SendEMail);

  /** Get Rate Inquiry */
  String getShippingRateInquiry();

  /** Set Rate Inquiry */
  void setShippingRateInquiry(String ShippingRateInquiry);

  /** Get Total Lines. Total of all document lines */
  BigDecimal getTotalLines();

  /** Set Total Lines. Total of all document lines */
  void setTotalLines(BigDecimal TotalLines);

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

  I_C_OrderLine[] getLines();

  Properties getCtx();



  int getPrecision();

  I_C_OrderTax[] getTaxes(boolean b);

  boolean isComplete();
}
