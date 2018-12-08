package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostQueue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostQueue {

  /** TableName=M_CostQueue */
  String Table_Name = "M_CostQueue";

  /** AD_Table_ID=817 */
  int Table_ID = 817;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrentCostPrice */
  String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
  /** Column name CurrentQty */
  String COLUMNNAME_CurrentQty = "CurrentQty";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_CostQueue_ID */
  String COLUMNNAME_M_CostQueue_ID = "M_CostQueue_ID";
  /** Column name M_CostQueue_UU */
  String COLUMNNAME_M_CostQueue_UU = "M_CostQueue_UU";
  /** Column name M_CostType_ID */
  String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Current Cost Price. The currently used cost price */
  BigDecimal getCurrentCostPrice();

  /** Set Current Cost Price. The currently used cost price */
  void setCurrentCostPrice(BigDecimal CurrentCostPrice);

  /** Get Current Quantity. Current Quantity */
  BigDecimal getCurrentQty();

  /** Set Current Quantity. Current Quantity */
  void setCurrentQty(BigDecimal CurrentQty);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

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

  /** Get Cost Queue. FiFo/LiFo Cost Queue */
  int getM_CostQueue_ID();

  /** Set Cost Queue. FiFo/LiFo Cost Queue */
  void setM_CostQueue_ID(int M_CostQueue_ID);

  /** Get M_CostQueue_UU */
  String getM_CostQueue_UU();

  /** Set M_CostQueue_UU */
  void setM_CostQueue_UU(String M_CostQueue_UU);

  /** Get Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  int getM_CostType_ID();

  /** Set Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  void setM_CostType_ID(int M_CostType_ID);

  I_M_CostType getM_CostType() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
