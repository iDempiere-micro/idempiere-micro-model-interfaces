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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name ChargeableQty */
  String COLUMNNAME_ChargeableQty = "ChargeableQty";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DailyCapacity */
  String COLUMNNAME_DailyCapacity = "DailyCapacity";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name WaitingTime */
  String COLUMNNAME_WaitingTime = "WaitingTime";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Chargeable Quantity */
  BigDecimal getChargeableQty();

  /** Set Chargeable Quantity */
  void setChargeableQty(BigDecimal ChargeableQty);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Daily Capacity */
  BigDecimal getDailyCapacity();

  /** Set Daily Capacity */
  void setDailyCapacity(BigDecimal DailyCapacity);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Available. Resource is available */
  void setIsAvailable(boolean IsAvailable);

  /** Get Available. Resource is available */
  boolean isAvailable();

  /** Set Manufacturing Resource */
  void setIsManufacturingResource(boolean IsManufacturingResource);

  /** Get Manufacturing Resource */
  boolean isManufacturingResource();

  /** Get Manufacturing Resource Type */
  String getManufacturingResourceType();

  /** Set Manufacturing Resource Type */
  void setManufacturingResourceType(String ManufacturingResourceType);

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get % Utilization */
  BigDecimal getPercentUtilization();

  /** Set % Utilization */
  void setPercentUtilization(BigDecimal PercentUtilization);

  /**
   * Get Planning Horizon. The planning horizon is the amount of time (Days) an organisation will
   * look into the future when preparing a strategic plan.
   */
  int getPlanningHorizon();

  /**
   * Set Planning Horizon. The planning horizon is the amount of time (Days) an organisation will
   * look into the future when preparing a strategic plan.
   */
  void setPlanningHorizon(int PlanningHorizon);

  /** Get Queuing Time. Queue time is the time a job waits at a work center before begin handled. */
  BigDecimal getQueuingTime();

  /** Set Queuing Time. Queue time is the time a job waits at a work center before begin handled. */
  void setQueuingTime(BigDecimal QueuingTime);

  /** Get Resource. Resource */
  int getS_Resource_ID();

  /** Set Resource. Resource */
  void setS_Resource_ID(int S_Resource_ID);

  /** Get Resource Type */
  int getS_ResourceType_ID();

  /** Set Resource Type */
  void setS_ResourceType_ID(int S_ResourceType_ID);

  I_S_ResourceType getS_ResourceType() throws RuntimeException;

  /** Get S_Resource_UU */
  String getS_Resource_UU();

  /** Set S_Resource_UU */
  void setS_Resource_UU(String S_Resource_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Waiting Time. Workflow Simulation Waiting time */
  BigDecimal getWaitingTime();

  /** Set Waiting Time. Workflow Simulation Waiting time */
  void setWaitingTime(BigDecimal WaitingTime);
}
