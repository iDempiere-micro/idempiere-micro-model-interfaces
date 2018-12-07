package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_Transaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Transaction {

  /** TableName=T_Transaction */
  String Table_Name = "T_Transaction";

  /** AD_Table_ID=758 */
  int Table_ID = 758;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectIssue_ID */
  String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Inventory_ID */
  String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
  /** Column name M_InventoryLine_ID */
  String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Movement_ID */
  String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
  /** Column name M_MovementLine_ID */
  String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name MovementQty */
  String COLUMNNAME_MovementQty = "MovementQty";
  /** Column name MovementType */
  String COLUMNNAME_MovementType = "MovementType";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Production_ID */
  String COLUMNNAME_M_Production_ID = "M_Production_ID";
  /** Column name M_ProductionLine_ID */
  String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
  /** Column name M_Transaction_ID */
  String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
  /** Column name Search_InOut_ID */
  String COLUMNNAME_Search_InOut_ID = "Search_InOut_ID";
  /** Column name Search_Invoice_ID */
  String COLUMNNAME_Search_Invoice_ID = "Search_Invoice_ID";
  /** Column name Search_Order_ID */
  String COLUMNNAME_Search_Order_ID = "Search_Order_ID";
  /** Column name T_Transaction_UU */
  String COLUMNNAME_T_Transaction_UU = "T_Transaction_UU";
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

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Project Issue. Project Issues (Material, Labor) */
  int getC_ProjectIssue_ID();

  /** Set Project Issue. Project Issues (Material, Labor) */
  void setC_ProjectIssue_ID(int C_ProjectIssue_ID);

  I_C_ProjectIssue getC_ProjectIssue() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

  /** Set Shipment/Receipt. Material Shipment Document */
  void setM_InOut_ID(int M_InOut_ID);

  I_M_InOut getM_InOut() throws RuntimeException;

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Phys.Inventory. Parameters for a Physical Inventory */
  int getM_Inventory_ID();

  /** Set Phys.Inventory. Parameters for a Physical Inventory */
  void setM_Inventory_ID(int M_Inventory_ID);

  I_M_Inventory getM_Inventory() throws RuntimeException;

  /** Get Phys.Inventory Line. Unique line in an Inventory document */
  int getM_InventoryLine_ID();

  /** Set Phys.Inventory Line. Unique line in an Inventory document */
  void setM_InventoryLine_ID(int M_InventoryLine_ID);

  I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

  I_M_Locator getM_Locator() throws RuntimeException;

  /** Get Inventory Move. Movement of Inventory */
  int getM_Movement_ID();

  /** Set Inventory Move. Movement of Inventory */
  void setM_Movement_ID(int M_Movement_ID);

  I_M_Movement getM_Movement() throws RuntimeException;

  /** Get Move Line. Inventory Move document Line */
  int getM_MovementLine_ID();

  /** Set Move Line. Inventory Move document Line */
  void setM_MovementLine_ID(int M_MovementLine_ID);

  I_M_MovementLine getM_MovementLine() throws RuntimeException;

  /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

  /** Set Movement Date. Date a product was moved in or out of inventory */
  void setMovementDate(Timestamp MovementDate);

  /** Get Movement Quantity. Quantity of a product moved. */
  BigDecimal getMovementQty();

  /** Set Movement Quantity. Quantity of a product moved. */
  void setMovementQty(BigDecimal MovementQty);

  /** Get Movement Type. Method of moving the inventory */
  String getMovementType();

  /** Set Movement Type. Method of moving the inventory */
  void setMovementType(String MovementType);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Production. Plan for producing a product */
  int getM_Production_ID();

  /** Set Production. Plan for producing a product */
  void setM_Production_ID(int M_Production_ID);

  I_M_Production getM_Production() throws RuntimeException;

  /** Get Production Line. Document Line representing a production */
  int getM_ProductionLine_ID();

  /** Set Production Line. Document Line representing a production */
  void setM_ProductionLine_ID(int M_ProductionLine_ID);

  I_M_ProductionLine getM_ProductionLine() throws RuntimeException;

  /** Get Inventory Transaction */
  int getM_Transaction_ID();

  /** Set Inventory Transaction */
  void setM_Transaction_ID(int M_Transaction_ID);

  I_M_Transaction getM_Transaction() throws RuntimeException;

  /** Get Search Shipment/Receipt. Material Shipment Document */
  int getSearch_InOut_ID();

  /** Set Search Shipment/Receipt. Material Shipment Document */
  void setSearch_InOut_ID(int Search_InOut_ID);

  I_M_InOutLine getSearch_InOut() throws RuntimeException;

  /** Get Search Invoice. Search Invoice Identifier */
  int getSearch_Invoice_ID();

  /** Set Search Invoice. Search Invoice Identifier */
  void setSearch_Invoice_ID(int Search_Invoice_ID);

  I_C_Invoice getSearch_Invoice() throws RuntimeException;

  /** Get Search Order. Order Identifier */
  int getSearch_Order_ID();

  /** Set Search Order. Order Identifier */
  void setSearch_Order_ID(int Search_Order_ID);

  I_C_Order getSearch_Order() throws RuntimeException;

  /** Get T_Transaction_UU */
  String getT_Transaction_UU();

  /** Set T_Transaction_UU */
  void setT_Transaction_UU(String T_Transaction_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
