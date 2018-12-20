package org.compiere.model;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

/**
 * Generated Interface for C_OrderLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLine extends IPO {

  /** TableName=C_OrderLine */
  String Table_Name = "C_OrderLine";

  /** AD_Table_ID=260 */
  int Table_ID = 260;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_OrderLine_UU */
  String COLUMNNAME_C_OrderLine_UU = "C_OrderLine_UU";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectTask_ID */
  String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateProduction */
  String COLUMNNAME_CreateProduction = "CreateProduction";
  /** Column name CreateShipment */
  String COLUMNNAME_CreateShipment = "CreateShipment";
  /** Column name C_Tax_ID */
  String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name DateDelivered */
  String COLUMNNAME_DateDelivered = "DateDelivered";
  /** Column name DateInvoiced */
  String COLUMNNAME_DateInvoiced = "DateInvoiced";
  /** Column name DateOrdered */
  String COLUMNNAME_DateOrdered = "DateOrdered";
  /** Column name DatePromised */
  String COLUMNNAME_DatePromised = "DatePromised";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Discount */
  String COLUMNNAME_Discount = "Discount";
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDescription */
  String COLUMNNAME_IsDescription = "IsDescription";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name LineNetAmt */
  String COLUMNNAME_LineNetAmt = "LineNetAmt";
  /** Column name Link_OrderLine_ID */
  String COLUMNNAME_Link_OrderLine_ID = "Link_OrderLine_ID";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Promotion_ID */
  String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name PP_Cost_Collector_ID */
  String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
  /** Column name PriceActual */
  String COLUMNNAME_PriceActual = "PriceActual";
  /** Column name PriceCost */
  String COLUMNNAME_PriceCost = "PriceCost";
  /** Column name PriceEntered */
  String COLUMNNAME_PriceEntered = "PriceEntered";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name QtyDelivered */
  String COLUMNNAME_QtyDelivered = "QtyDelivered";
  /** Column name QtyEntered */
  String COLUMNNAME_QtyEntered = "QtyEntered";
  /** Column name QtyInvoiced */
  String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
  /** Column name QtyLostSales */
  String COLUMNNAME_QtyLostSales = "QtyLostSales";
  /** Column name QtyOrdered */
  String COLUMNNAME_QtyOrdered = "QtyOrdered";
  /** Column name QtyReserved */
  String COLUMNNAME_QtyReserved = "QtyReserved";
  /** Column name Ref_OrderLine_ID */
  String COLUMNNAME_Ref_OrderLine_ID = "Ref_OrderLine_ID";
  /** Column name RRAmt */
  String COLUMNNAME_RRAmt = "RRAmt";
  /** Column name RRStartDate */
  String COLUMNNAME_RRStartDate = "RRStartDate";
  /** Column name S_ResourceAssignment_ID */
  String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

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

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

  /** Get C_OrderLine_UU */
  String getC_OrderLine_UU();

  /** Set C_OrderLine_UU */
  void setC_OrderLine_UU(String C_OrderLine_UU);

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Project Phase. Phase of a Project */
  int getC_ProjectPhase_ID();

  /** Set Project Phase. Phase of a Project */
  void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

  I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

  /** Get Project Task. Actual Project Task in a Phase */
  int getC_ProjectTask_ID();

  /** Set Project Task. Actual Project Task in a Phase */
  void setC_ProjectTask_ID(int C_ProjectTask_ID);

  I_C_ProjectTask getC_ProjectTask() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Create Production */
  String getCreateProduction();

  /** Set Create Production */
  void setCreateProduction(String CreateProduction);

  /** Get Create Shipment */
  String getCreateShipment();

  /** Set Create Shipment */
  void setCreateShipment(String CreateShipment);

  /** Get Tax. Tax identifier */
  int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  void setC_Tax_ID(int C_Tax_ID);

  I_C_Tax getC_Tax() throws RuntimeException;

  /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  void setC_UOM_ID(int C_UOM_ID);

  I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Date Delivered. Date when the product was delivered */
  Timestamp getDateDelivered();

  /** Set Date Delivered. Date when the product was delivered */
  void setDateDelivered(Timestamp DateDelivered);

  /** Get Date Invoiced. Date printed on Invoice */
  Timestamp getDateInvoiced();

  /** Set Date Invoiced. Date printed on Invoice */
  void setDateInvoiced(Timestamp DateInvoiced);

  /** Get Date Ordered. Date of Order */
  Timestamp getDateOrdered();

  /** Set Date Ordered. Date of Order */
  void setDateOrdered(Timestamp DateOrdered);

  /** Get Date Promised. Date Order was promised */
  Timestamp getDatePromised();

  /** Set Date Promised. Date Order was promised */
  void setDatePromised(Timestamp DatePromised);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Get Discount %. Discount in percent */
  BigDecimal getDiscount();

  /** Set Discount %. Discount in percent */
  void setDiscount(BigDecimal Discount);

  /** Get Freight Amount. Freight Amount */
  BigDecimal getFreightAmt();

  /** Set Freight Amount. Freight Amount */
  void setFreightAmt(BigDecimal FreightAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Description Only. if true, the line is just description and no transaction */
  void setIsDescription(boolean IsDescription);

  /** Get Description Only. if true, the line is just description and no transaction */
  boolean isDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
  BigDecimal getLineNetAmt();

  /** Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
  void setLineNetAmt(BigDecimal LineNetAmt);

  /**
   * Get Linked Order Line. This field links a sales order line to the purchase order line that is
   * generated from it.
   */
  int getLink_OrderLine_ID();

  /**
   * Set Linked Order Line. This field links a sales order line to the purchase order line that is
   * generated from it.
   */
  void setLink_OrderLine_ID(int Link_OrderLine_ID);

  I_C_OrderLine getLink_OrderLine() throws RuntimeException;

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Promotion */
  int getM_Promotion_ID();

  /** Set Promotion */
  void setM_Promotion_ID(int M_Promotion_ID);

  I_M_Promotion getM_Promotion() throws RuntimeException;

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

  /** Get Manufacturing Cost Collector */
  int getPP_Cost_Collector_ID();

  /** Set Manufacturing Cost Collector */
  void setPP_Cost_Collector_ID(int PP_Cost_Collector_ID);

  org.eevolution.model.I_PP_Cost_Collector getPP_Cost_Collector() throws RuntimeException;

  /** Get Unit Price. Actual Price */
  BigDecimal getPriceActual();

  /** Set Unit Price. Actual Price */
  void setPriceActual(BigDecimal PriceActual);

  /** Get Cost Price. Price per Unit of Measure including all indirect costs (Freight, etc.) */
  BigDecimal getPriceCost();

  /** Set Cost Price. Price per Unit of Measure including all indirect costs (Freight, etc.) */
  void setPriceCost(BigDecimal PriceCost);

  /** Get Price. Price Entered - the price based on the selected/base UoM */
  BigDecimal getPriceEntered();

  /** Set Price. Price Entered - the price based on the selected/base UoM */
  void setPriceEntered(BigDecimal PriceEntered);

  /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

  /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

  /** Get List Price. List Price */
  BigDecimal getPriceList();

  /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Delivered Quantity. Delivered Quantity */
  BigDecimal getQtyDelivered();

  /** Set Delivered Quantity. Delivered Quantity */
  void setQtyDelivered(BigDecimal QtyDelivered);

  /** Get Quantity. The Quantity Entered is based on the selected UoM */
  BigDecimal getQtyEntered();

  /** Set Quantity. The Quantity Entered is based on the selected UoM */
  void setQtyEntered(BigDecimal QtyEntered);

  /** Get Quantity Invoiced. Invoiced Quantity */
  BigDecimal getQtyInvoiced();

  /** Set Quantity Invoiced. Invoiced Quantity */
  void setQtyInvoiced(BigDecimal QtyInvoiced);

  /** Get Lost Sales Qty. Quantity of potential sales */
  BigDecimal getQtyLostSales();

  /** Set Lost Sales Qty. Quantity of potential sales */
  void setQtyLostSales(BigDecimal QtyLostSales);

  /** Get Ordered Quantity. Ordered Quantity */
  BigDecimal getQtyOrdered();

  /** Set Ordered Quantity. Ordered Quantity */
  void setQtyOrdered(BigDecimal QtyOrdered);

  /** Get Reserved Quantity. Reserved Quantity */
  BigDecimal getQtyReserved();

  /** Set Reserved Quantity. Reserved Quantity */
  void setQtyReserved(BigDecimal QtyReserved);

  /** Get Referenced Order Line. Reference to corresponding Sales/Purchase Order */
  int getRef_OrderLine_ID();

  /** Set Referenced Order Line. Reference to corresponding Sales/Purchase Order */
  void setRef_OrderLine_ID(int Ref_OrderLine_ID);

  I_C_OrderLine getRef_OrderLine() throws RuntimeException;

  /** Get Revenue Recognition Amt. Revenue Recognition Amount */
  BigDecimal getRRAmt();

  /** Set Revenue Recognition Amt. Revenue Recognition Amount */
  void setRRAmt(BigDecimal RRAmt);

  /** Get Revenue Recognition Start. Revenue Recognition Start Date */
  Timestamp getRRStartDate();

  /** Set Revenue Recognition Start. Revenue Recognition Start Date */
  void setRRStartDate(Timestamp RRStartDate);

  /** Get Resource Assignment. Resource Assignment */
  int getS_ResourceAssignment_ID();

  /** Set Resource Assignment. Resource Assignment */
  void setS_ResourceAssignment_ID(int S_ResourceAssignment_ID);

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

  boolean isTaxIncluded();

  void clearParent();

  Properties getCtx();

  boolean updateOrderTax(boolean b);

  boolean is_ValueChanged(String columnname_c_tax_id);

  I_C_Order getParent();

  boolean updateHeaderTax();

  Object get_ValueOld(String columnname_c_tax_id);
}
