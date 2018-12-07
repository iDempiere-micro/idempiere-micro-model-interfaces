package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Warehouse
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Warehouse {

  /** TableName=M_Warehouse */
  String Table_Name = "M_Warehouse";

  /** AD_Table_ID=190 */
  int Table_ID = 190;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDisallowNegativeInv */
  String COLUMNNAME_IsDisallowNegativeInv = "IsDisallowNegativeInv";
  /** Column name IsInTransit */
  String COLUMNNAME_IsInTransit = "IsInTransit";
  /** Column name M_ReserveLocator_ID */
  String COLUMNNAME_M_ReserveLocator_ID = "M_ReserveLocator_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name M_WarehouseSource_ID */
  String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
  /** Column name M_Warehouse_UU */
  String COLUMNNAME_M_Warehouse_UU = "M_Warehouse_UU";
  /** Column name ReplenishmentClass */
  String COLUMNNAME_ReplenishmentClass = "ReplenishmentClass";
  /** Column name Separator */
  String COLUMNNAME_Separator = "Separator";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Disallow Negative Inventory. Negative Inventory is not allowed in this warehouse */
  void setIsDisallowNegativeInv(boolean IsDisallowNegativeInv);

  /** Get Disallow Negative Inventory. Negative Inventory is not allowed in this warehouse */
  boolean isDisallowNegativeInv();

  /** Set In Transit. Movement is in transit */
  void setIsInTransit(boolean IsInTransit);

  /** Get In Transit. Movement is in transit */
  boolean isInTransit();

  /** Get Reservation Locator. Reservation Locator (just for reporting purposes) */
  int getM_ReserveLocator_ID();

  /** Set Reservation Locator. Reservation Locator (just for reporting purposes) */
  void setM_ReserveLocator_ID(int M_ReserveLocator_ID);

  I_M_Locator getM_ReserveLocator() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  /** Get Source Warehouse. Optional Warehouse to replenish from */
  int getM_WarehouseSource_ID();

  /** Set Source Warehouse. Optional Warehouse to replenish from */
  void setM_WarehouseSource_ID(int M_WarehouseSource_ID);

  I_M_Warehouse getM_WarehouseSource() throws RuntimeException;

  /** Get M_Warehouse_UU */
  String getM_Warehouse_UU();

  /** Set M_Warehouse_UU */
  void setM_Warehouse_UU(String M_Warehouse_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Replenishment Class. Custom class to calculate Quantity to Order */
  String getReplenishmentClass();

  /** Set Replenishment Class. Custom class to calculate Quantity to Order */
  void setReplenishmentClass(String ReplenishmentClass);

  /** Get Element Separator. Element Separator */
  String getSeparator();

  /** Set Element Separator. Element Separator */
  void setSeparator(String Separator);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  Properties getCtx();
}
