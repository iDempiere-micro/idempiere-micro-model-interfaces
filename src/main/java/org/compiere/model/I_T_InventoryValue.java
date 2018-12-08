package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_InventoryValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_InventoryValue {

  /** TableName=T_InventoryValue */
  String Table_Name = "T_InventoryValue";

  /** AD_Table_ID=478 */
  int Table_ID = 478;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Cost */
  String COLUMNNAME_Cost = "Cost";
  /** Column name CostAmt */
  String COLUMNNAME_CostAmt = "CostAmt";
  /** Column name CostStandard */
  String COLUMNNAME_CostStandard = "CostStandard";
  /** Column name CostStandardAmt */
  String COLUMNNAME_CostStandardAmt = "CostStandardAmt";
  /** Column name DateValue */
  String COLUMNNAME_DateValue = "DateValue";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_PriceList_Version_ID */
  String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceLimitAmt */
  String COLUMNNAME_PriceLimitAmt = "PriceLimitAmt";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name PriceListAmt */
  String COLUMNNAME_PriceListAmt = "PriceListAmt";
  /** Column name PricePO */
  String COLUMNNAME_PricePO = "PricePO";
  /** Column name PricePOAmt */
  String COLUMNNAME_PricePOAmt = "PricePOAmt";
  /** Column name PriceStd */
  String COLUMNNAME_PriceStd = "PriceStd";
  /** Column name PriceStdAmt */
  String COLUMNNAME_PriceStdAmt = "PriceStdAmt";
  /** Column name QtyOnHand */
  String COLUMNNAME_QtyOnHand = "QtyOnHand";
  /** Column name T_InventoryValue_UU */
  String COLUMNNAME_T_InventoryValue_UU = "T_InventoryValue_UU";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Cost. Cost information */
  BigDecimal getCost();

  /** Set Cost. Cost information */
  void setCost(BigDecimal Cost);

  /** Get Cost Value. Value with Cost */
  BigDecimal getCostAmt();

  /** Set Cost Value. Value with Cost */
  void setCostAmt(BigDecimal CostAmt);

  /** Get Standard Cost. Standard Costs */
  BigDecimal getCostStandard();

  /** Set Standard Cost. Standard Costs */
  void setCostStandard(BigDecimal CostStandard);

  /** Get Standard Cost Value. Value in Standard Costs */
  BigDecimal getCostStandardAmt();

  /** Set Standard Cost Value. Value in Standard Costs */
  void setCostStandardAmt(BigDecimal CostStandardAmt);

  /** Get Valuation Date. Date of valuation */
  Timestamp getDateValue();

  /** Set Valuation Date. Date of valuation */
  void setDateValue(Timestamp DateValue);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

  I_M_CostElement getM_CostElement() throws RuntimeException;

  /** Get Price List Version. Identifies a unique instance of a Price List */
  int getM_PriceList_Version_ID();

  /** Set Price List Version. Identifies a unique instance of a Price List */
  void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

  I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

  /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

  /** Get Limit price Value. Value with limit price */
  BigDecimal getPriceLimitAmt();

  /** Set Limit price Value. Value with limit price */
  void setPriceLimitAmt(BigDecimal PriceLimitAmt);

  /** Get List Price. List Price */
  BigDecimal getPriceList();

  /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

  /** Get List price Value. Valuation with List Price */
  BigDecimal getPriceListAmt();

  /** Set List price Value. Valuation with List Price */
  void setPriceListAmt(BigDecimal PriceListAmt);

  /** Get PO Price. Price based on a purchase order */
  BigDecimal getPricePO();

  /** Set PO Price. Price based on a purchase order */
  void setPricePO(BigDecimal PricePO);

  /** Get PO Price Value. Valuation with PO Price */
  BigDecimal getPricePOAmt();

  /** Set PO Price Value. Valuation with PO Price */
  void setPricePOAmt(BigDecimal PricePOAmt);

  /** Get Standard Price. Standard Price */
  BigDecimal getPriceStd();

  /** Set Standard Price. Standard Price */
  void setPriceStd(BigDecimal PriceStd);

  /** Get Std Price Value. Valuation with standard price */
  BigDecimal getPriceStdAmt();

  /** Set Std Price Value. Valuation with standard price */
  void setPriceStdAmt(BigDecimal PriceStdAmt);

  /** Get On Hand Quantity. On Hand Quantity */
  BigDecimal getQtyOnHand();

  /** Set On Hand Quantity. On Hand Quantity */
  void setQtyOnHand(BigDecimal QtyOnHand);

  /** Get T_InventoryValue_UU */
  String getT_InventoryValue_UU();

  /** Set T_InventoryValue_UU */
  void setT_InventoryValue_UU(String T_InventoryValue_UU);
}
