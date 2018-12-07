package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ForecastLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ForecastLine {

  /** TableName=M_ForecastLine */
  String Table_Name = "M_ForecastLine";

  /** AD_Table_ID=722 */
  int Table_ID = 722;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DatePromised */
  String COLUMNNAME_DatePromised = "DatePromised";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Forecast_ID */
  String COLUMNNAME_M_Forecast_ID = "M_Forecast_ID";
  /** Column name M_ForecastLine_ID */
  String COLUMNNAME_M_ForecastLine_ID = "M_ForecastLine_ID";
  /** Column name M_ForecastLine_UU */
  String COLUMNNAME_M_ForecastLine_UU = "M_ForecastLine_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name QtyCalculated */
  String COLUMNNAME_QtyCalculated = "QtyCalculated";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date Promised. Date Order was promised */
  Timestamp getDatePromised();

  /** Set Date Promised. Date Order was promised */
  void setDatePromised(Timestamp DatePromised);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Forecast. Material Forecast */
  int getM_Forecast_ID();

  /** Set Forecast. Material Forecast */
  void setM_Forecast_ID(int M_Forecast_ID);

  I_M_Forecast getM_Forecast() throws RuntimeException;

  /** Get Forecast Line. Forecast Line */
  int getM_ForecastLine_ID();

  /** Set Forecast Line. Forecast Line */
  void setM_ForecastLine_ID(int M_ForecastLine_ID);

  /** Get M_ForecastLine_UU */
  String getM_ForecastLine_UU();

  /** Set M_ForecastLine_UU */
  void setM_ForecastLine_UU(String M_ForecastLine_UU);

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

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Calculated Quantity. Calculated Quantity */
  BigDecimal getQtyCalculated();

  /** Set Calculated Quantity. Calculated Quantity */
  void setQtyCalculated(BigDecimal QtyCalculated);

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
