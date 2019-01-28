package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_Resource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_Resource {

  /** TableName=S_Resource */
  String Table_Name = "S_Resource";

  /** AD_Table_ID=487 */
  int Table_ID = 487;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name ChargeableQty */
  String COLUMNNAME_ChargeableQty = "ChargeableQty";
    /** Column name DailyCapacity */
  String COLUMNNAME_DailyCapacity = "DailyCapacity";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsAvailable */
  String COLUMNNAME_IsAvailable = "IsAvailable";
  /** Column name IsManufacturingResource */
  String COLUMNNAME_IsManufacturingResource = "IsManufacturingResource";
  /** Column name ManufacturingResourceType */
  String COLUMNNAME_ManufacturingResourceType = "ManufacturingResourceType";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name PercentUtilization */
  String COLUMNNAME_PercentUtilization = "PercentUtilization";
  /** Column name PlanningHorizon */
  String COLUMNNAME_PlanningHorizon = "PlanningHorizon";
  /** Column name QueuingTime */
  String COLUMNNAME_QueuingTime = "QueuingTime";
  /** Column name S_Resource_ID */
  String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
  /** Column name S_ResourceType_ID */
  String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
  /** Column name S_Resource_UU */
  String COLUMNNAME_S_Resource_UU = "S_Resource_UU";
    /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name WaitingTime */
  String COLUMNNAME_WaitingTime = "WaitingTime";

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Manufacturing Resource */
  boolean isManufacturingResource();

  /** Get Manufacturing Resource Type */
  String getManufacturingResourceType();

    /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

    /**
   * Get Planning Horizon. The planning horizon is the amount of time (Days) an organisation will
   * look into the future when preparing a strategic plan.
   */
  int getPlanningHorizon();

    /** Get Resource. Resource */
  int getS_Resource_ID();

    /** Get Resource Type */
  int getS_ResourceType_ID();

    /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

}
