package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostHistory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostHistory {

  /** TableName=M_CostHistory */
  String Table_Name = "M_CostHistory";

  /** AD_Table_ID=200001 */
  int Table_ID = 200001;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_CostDetail_ID */
  String COLUMNNAME_M_CostDetail_ID = "M_CostDetail_ID";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_CostHistory_ID */
  String COLUMNNAME_M_CostHistory_ID = "M_CostHistory_ID";
  /** Column name M_CostHistory_UU */
  String COLUMNNAME_M_CostHistory_UU = "M_CostHistory_UU";
  /** Column name M_CostType_ID */
  String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
  /** Column name NewCAmt */
  String COLUMNNAME_NewCAmt = "NewCAmt";
  /** Column name NewCostPrice */
  String COLUMNNAME_NewCostPrice = "NewCostPrice";
  /** Column name NewCQty */
  String COLUMNNAME_NewCQty = "NewCQty";
  /** Column name NewQty */
  String COLUMNNAME_NewQty = "NewQty";
  /** Column name OldCAmt */
  String COLUMNNAME_OldCAmt = "OldCAmt";
  /** Column name OldCostPrice */
  String COLUMNNAME_OldCostPrice = "OldCostPrice";
  /** Column name OldCQty */
  String COLUMNNAME_OldCQty = "OldCQty";
  /** Column name OldQty */
  String COLUMNNAME_OldQty = "OldQty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

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

  /** Get Cost Detail. Cost Detail Information */
  int getM_CostDetail_ID();

  /** Set Cost Detail. Cost Detail Information */
  void setM_CostDetail_ID(int M_CostDetail_ID);

  I_M_CostDetail getM_CostDetail() throws RuntimeException;

  /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

  /** Set Cost Element. Product Cost Element */
  void setM_CostElement_ID(int M_CostElement_ID);

  I_M_CostElement getM_CostElement() throws RuntimeException;

  /** Get Cost History. Movement history for M_Cost */
  int getM_CostHistory_ID();

  /** Set Cost History. Movement history for M_Cost */
  void setM_CostHistory_ID(int M_CostHistory_ID);

  /** Get Cost History UUID */
  String getM_CostHistory_UU();

  /** Set Cost History UUID */
  void setM_CostHistory_UU(String M_CostHistory_UU);

  /** Get Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  int getM_CostType_ID();

  /** Set Cost Type. Type of Cost (e.g. Current, Plan, Future) */
  void setM_CostType_ID(int M_CostType_ID);

  I_M_CostType getM_CostType() throws RuntimeException;

  /** Get New Accumulated Amt. Accumulated Amt after processing of M_CostDetail */
  BigDecimal getNewCAmt();

  /** Set New Accumulated Amt. Accumulated Amt after processing of M_CostDetail */
  void setNewCAmt(BigDecimal NewCAmt);

  /** Get New Cost Price. New current cost price after processing of M_CostDetail */
  BigDecimal getNewCostPrice();

  /** Set New Cost Price. New current cost price after processing of M_CostDetail */
  void setNewCostPrice(BigDecimal NewCostPrice);

  /** Get New Accumulated Qty. New Accumulated Qty after processing of M_CostDetail */
  BigDecimal getNewCQty();

  /** Set New Accumulated Qty. New Accumulated Qty after processing of M_CostDetail */
  void setNewCQty(BigDecimal NewCQty);

  /** Get New Current Quantity. New current quantity after processing of M_CostDetail */
  BigDecimal getNewQty();

  /** Set New Current Quantity. New current quantity after processing of M_CostDetail */
  void setNewQty(BigDecimal NewQty);

  /** Get Old Accumulated Amt. Old accumulated amt before the processing of M_CostDetail */
  BigDecimal getOldCAmt();

  /** Set Old Accumulated Amt. Old accumulated amt before the processing of M_CostDetail */
  void setOldCAmt(BigDecimal OldCAmt);

  /** Get Old Current Cost Price. Old current cost price before the processing of M_CostDetail */
  BigDecimal getOldCostPrice();

  /** Set Old Current Cost Price. Old current cost price before the processing of M_CostDetail */
  void setOldCostPrice(BigDecimal OldCostPrice);

  /** Get Old Accumulated Qty. Old accumulated qty before the processing of M_CostDetail */
  BigDecimal getOldCQty();

  /** Set Old Accumulated Qty. Old accumulated qty before the processing of M_CostDetail */
  void setOldCQty(BigDecimal OldCQty);

  /** Get Old Current Quantity. Old current quantity before the processing of M_CostDetail */
  BigDecimal getOldQty();

  /** Set Old Current Quantity. Old current quantity before the processing of M_CostDetail */
  void setOldQty(BigDecimal OldQty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
