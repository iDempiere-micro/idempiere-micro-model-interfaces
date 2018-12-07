package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_GoalRestriction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_GoalRestriction {

  /** TableName=PA_GoalRestriction */
  String Table_Name = "PA_GoalRestriction";

  /** AD_Table_ID=832 */
  int Table_ID = 832;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name GoalRestrictionType */
  String COLUMNNAME_GoalRestrictionType = "GoalRestrictionType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name PA_Goal_ID */
  String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";
  /** Column name PA_GoalRestriction_ID */
  String COLUMNNAME_PA_GoalRestriction_ID = "PA_GoalRestriction_ID";
  /** Column name PA_GoalRestriction_UU */
  String COLUMNNAME_PA_GoalRestriction_UU = "PA_GoalRestriction_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Restriction Type. Goal Restriction Type */
  String getGoalRestrictionType();

  /** Set Restriction Type. Goal Restriction Type */
  void setGoalRestrictionType(String GoalRestrictionType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  void setM_Product_Category_ID(int M_Product_Category_ID);

  I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Goal. Performance Goal */
  int getPA_Goal_ID();

  /** Set Goal. Performance Goal */
  void setPA_Goal_ID(int PA_Goal_ID);

  I_PA_Goal getPA_Goal() throws RuntimeException;

  /** Get Goal Restriction. Performance Goal Restriction */
  int getPA_GoalRestriction_ID();

  /** Set Goal Restriction. Performance Goal Restriction */
  void setPA_GoalRestriction_ID(int PA_GoalRestriction_ID);

  /** Get PA_GoalRestriction_UU */
  String getPA_GoalRestriction_UU();

  /** Set PA_GoalRestriction_UU */
  void setPA_GoalRestriction_UU(String PA_GoalRestriction_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
