package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

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

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

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
    /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

    /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

    /** Get Activity. Business Activity */
  int getC_Activity_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

    /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

    /** Get Order. Order */
  int getC_Order_ID();

    I_C_Order getC_Order() throws RuntimeException;

    /** Get Project. Financial Project */
  int getC_Project_ID();

    /** Get Tax. Tax identifier */
  int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  void setC_Tax_ID(int C_Tax_ID);

    /** Get Date Ordered. Date of Order */
  Timestamp getDateOrdered();

    /** Get Date Promised. Date Order was promised */
  Timestamp getDatePromised();

    /** Get Description Only. if true, the line is just description and no transaction */
  boolean isDescription();

    /** Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
  BigDecimal getLineNetAmt();

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

    /** Set Unit Price. Actual Price */
  void setPriceActual(BigDecimal PriceActual);

    /** Get Delivered Quantity. Delivered Quantity */
  BigDecimal getQtyDelivered();

    /** Get Quantity. The Quantity Entered is based on the selected UoM */
  BigDecimal getQtyEntered();

  /** Set Quantity. The Quantity Entered is based on the selected UoM */
  void setQtyEntered(BigDecimal QtyEntered);

    /** Get Ordered Quantity. Ordered Quantity */
  BigDecimal getQtyOrdered();

  /** Set Ordered Quantity. Ordered Quantity */
  void setQtyOrdered(BigDecimal QtyOrdered);

    /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

    /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

    boolean isTaxIncluded();

  void clearParent();

  Properties getCtx();

  boolean updateOrderTax(boolean b);

  boolean is_ValueChanged(String columnname_c_tax_id);

  I_C_Order getParent();

  boolean updateHeaderTax();

  Object get_ValueOld(String columnname_c_tax_id);
}
