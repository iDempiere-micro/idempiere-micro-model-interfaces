package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_Replenish
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Replenish {

  /** TableName=T_Replenish */
  String Table_Name = "T_Replenish";

  /** AD_Table_ID=364 */
  int Table_ID = 364;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name Level_Max */
  String COLUMNNAME_Level_Max = "Level_Max";
  /** Column name Level_Min */
  String COLUMNNAME_Level_Min = "Level_Min";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name M_WarehouseSource_ID */
  String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
  /** Column name Order_Min */
  String COLUMNNAME_Order_Min = "Order_Min";
  /** Column name Order_Pack */
  String COLUMNNAME_Order_Pack = "Order_Pack";
  /** Column name QtyOnHand */
  String COLUMNNAME_QtyOnHand = "QtyOnHand";
  /** Column name QtyOrdered */
  String COLUMNNAME_QtyOrdered = "QtyOrdered";
  /** Column name QtyReserved */
  String COLUMNNAME_QtyReserved = "QtyReserved";
  /** Column name QtyToOrder */
  String COLUMNNAME_QtyToOrder = "QtyToOrder";
  /** Column name ReplenishmentCreate */
  String COLUMNNAME_ReplenishmentCreate = "ReplenishmentCreate";
  /** Column name ReplenishType */
  String COLUMNNAME_ReplenishType = "ReplenishType";
  /** Column name T_Replenish_UU */
  String COLUMNNAME_T_Replenish_UU = "T_Replenish_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Maximum Level. Maximum Inventory level for this product */
  BigDecimal getLevel_Max();

  /** Set Maximum Level. Maximum Inventory level for this product */
  void setLevel_Max(BigDecimal Level_Max);

  /** Get Minimum Level. Minimum Inventory level for this product */
  BigDecimal getLevel_Min();

  /** Set Minimum Level. Minimum Inventory level for this product */
  void setLevel_Min(BigDecimal Level_Min);

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

  /** Get Source Warehouse. Optional Warehouse to replenish from */
  int getM_WarehouseSource_ID();

  /** Set Source Warehouse. Optional Warehouse to replenish from */
  void setM_WarehouseSource_ID(int M_WarehouseSource_ID);

  I_M_Warehouse getM_WarehouseSource() throws RuntimeException;

  /** Get Minimum Order Qty. Minimum order quantity in UOM */
  BigDecimal getOrder_Min();

  /** Set Minimum Order Qty. Minimum order quantity in UOM */
  void setOrder_Min(BigDecimal Order_Min);

  /** Get Order Pack Qty. Package order size in UOM (e.g. order set of 5 units) */
  BigDecimal getOrder_Pack();

  /** Set Order Pack Qty. Package order size in UOM (e.g. order set of 5 units) */
  void setOrder_Pack(BigDecimal Order_Pack);

  /** Get On Hand Quantity. On Hand Quantity */
  BigDecimal getQtyOnHand();

  /** Set On Hand Quantity. On Hand Quantity */
  void setQtyOnHand(BigDecimal QtyOnHand);

  /** Get Ordered Quantity. Ordered Quantity */
  BigDecimal getQtyOrdered();

  /** Set Ordered Quantity. Ordered Quantity */
  void setQtyOrdered(BigDecimal QtyOrdered);

  /** Get Reserved Quantity. Reserved Quantity */
  BigDecimal getQtyReserved();

  /** Set Reserved Quantity. Reserved Quantity */
  void setQtyReserved(BigDecimal QtyReserved);

  /** Get Quantity to Order */
  BigDecimal getQtyToOrder();

  /** Set Quantity to Order */
  void setQtyToOrder(BigDecimal QtyToOrder);

  /** Get Create. Create from Replenishment */
  String getReplenishmentCreate();

  /** Set Create. Create from Replenishment */
  void setReplenishmentCreate(String ReplenishmentCreate);

  /** Get Replenish Type. Method for re-ordering a product */
  String getReplenishType();

  /** Set Replenish Type. Method for re-ordering a product */
  void setReplenishType(String ReplenishType);

  /** Get T_Replenish_UU */
  String getT_Replenish_UU();

  /** Set T_Replenish_UU */
  void setT_Replenish_UU(String T_Replenish_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
