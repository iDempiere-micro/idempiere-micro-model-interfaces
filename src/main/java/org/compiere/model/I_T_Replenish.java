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

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

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

    /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

    /** Get Source Warehouse. Optional Warehouse to replenish from */
  int getM_WarehouseSource_ID();

    /** Get Quantity to Order */
  BigDecimal getQtyToOrder();

  /** Set Quantity to Order */
  void setQtyToOrder(BigDecimal QtyToOrder);

    /** Get Replenish Type. Method for re-ordering a product */
  String getReplenishType();

}
