package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for M_Locator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Locator extends IPO {

  /** TableName=M_Locator */
  String Table_Name = "M_Locator";

  /** AD_Table_ID=207 */
  int Table_ID = 207;

    /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_LocatorType_ID */
  String COLUMNNAME_M_LocatorType_ID = "M_LocatorType_ID";
  /** Column name M_Locator_UU */
  String COLUMNNAME_M_Locator_UU = "M_Locator_UU";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name PriorityNo */
  String COLUMNNAME_PriorityNo = "PriorityNo";
    /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name X */
  String COLUMNNAME_X = "X";
  /** Column name Y */
  String COLUMNNAME_Y = "Y";
  /** Column name Z */
  String COLUMNNAME_Z = "Z";

    /** Get Organization. Organizational entity within client */
  int getOrgId();

    /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

    /** Get Locator Type */
  int getM_LocatorType_ID();

  /** Set Locator Type */
  void setM_LocatorType_ID(int M_LocatorType_ID);

    /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

    /** Set Relative Priority. Where inventory should be picked from first */
  void setPriorityNo(int PriorityNo);

    /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

    /** Set Aisle (X). X dimension, e.g., Aisle */
  void setX(String X);

    /** Set Bin (Y). Y dimension, e.g., Bin */
  void setY(String Y);

    /** Set Level (Z). Z dimension, e.g., Level */
  void setZ(String Z);

  void saveEx(String trxName);
}
