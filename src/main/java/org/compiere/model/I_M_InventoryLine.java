package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_InventoryLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InventoryLine {

  /** TableName=M_InventoryLine */
  String Table_Name = "M_InventoryLine";

  /** AD_Table_ID=322 */
  int Table_ID = 322;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /** Column name CurrentCostPrice */
  String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name InventoryType */
  String COLUMNNAME_InventoryType = "InventoryType";
    /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_Inventory_ID */
  String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
  /** Column name M_InventoryLine_ID */
  String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
  /** Column name M_InventoryLine_UU */
  String COLUMNNAME_M_InventoryLine_UU = "M_InventoryLine_UU";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name NewCostPrice */
  String COLUMNNAME_NewCostPrice = "NewCostPrice";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name QtyBook */
  String COLUMNNAME_QtyBook = "QtyBook";
  /** Column name QtyCount */
  String COLUMNNAME_QtyCount = "QtyCount";
  /** Column name QtyCsv */
  String COLUMNNAME_QtyCsv = "QtyCsv";
  /** Column name QtyInternalUse */
  String COLUMNNAME_QtyInternalUse = "QtyInternalUse";
  /** Column name ReversalLine_ID */
  String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
  /** Column name UPC */
  String COLUMNNAME_UPC = "UPC";
    /** Column name Value */
  String COLUMNNAME_Value = "Value";

    /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

    /** Get Current Cost Price. The currently used cost price */
  BigDecimal getCurrentCostPrice();

  /** Set Current Cost Price. The currently used cost price */
  void setCurrentCostPrice(BigDecimal CurrentCostPrice);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Inventory Type. Type of inventory difference */
  String getInventoryType();

  /** Set Inventory Type. Type of inventory difference */
  void setInventoryType(String InventoryType);

    /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Phys.Inventory. Parameters for a Physical Inventory */
  int getM_Inventory_ID();

  /** Set Phys.Inventory. Parameters for a Physical Inventory */
  void setM_Inventory_ID(int M_Inventory_ID);

  I_M_Inventory getM_Inventory() throws RuntimeException;

  /** Get Phys.Inventory Line. Unique line in an Inventory document */
  int getM_InventoryLine_ID();

    /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get New Cost Price. New current cost price after processing of M_CostDetail */
  BigDecimal getNewCostPrice();

  /** Set New Cost Price. New current cost price after processing of M_CostDetail */
  void setNewCostPrice(BigDecimal NewCostPrice);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity book. Book Quantity */
  BigDecimal getQtyBook();

  /** Set Quantity book. Book Quantity */
  void setQtyBook(BigDecimal QtyBook);

  /** Get Quantity count. Counted Quantity */
  BigDecimal getQtyCount();

  /** Set Quantity count. Counted Quantity */
  void setQtyCount(BigDecimal QtyCount);

    /** Get Internal Use Qty. Internal Use Quantity removed from Inventory */
  BigDecimal getQtyInternalUse();

  /** Set Internal Use Qty. Internal Use Quantity removed from Inventory */
  void setQtyInternalUse(BigDecimal QtyInternalUse);

  /** Get Reversal Line. Use to keep the reversal line ID for reversing costing purpose */
  int getReversalLine_ID();

  /** Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose */
  void setReversalLine_ID(int ReversalLine_ID);

}
