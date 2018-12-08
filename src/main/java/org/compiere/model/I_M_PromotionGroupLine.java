package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionGroupLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionGroupLine {

  /** TableName=M_PromotionGroupLine */
  String Table_Name = "M_PromotionGroupLine";

  /** AD_Table_ID=53177 */
  int Table_ID = 53177;

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
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_PromotionGroup_ID */
  String COLUMNNAME_M_PromotionGroup_ID = "M_PromotionGroup_ID";
  /** Column name M_PromotionGroupLine_ID */
  String COLUMNNAME_M_PromotionGroupLine_ID = "M_PromotionGroupLine_ID";
  /** Column name M_PromotionGroupLine_UU */
  String COLUMNNAME_M_PromotionGroupLine_UU = "M_PromotionGroupLine_UU";
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

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Promotion Group */
  int getM_PromotionGroup_ID();

  /** Set Promotion Group */
  void setM_PromotionGroup_ID(int M_PromotionGroup_ID);

  I_M_PromotionGroup getM_PromotionGroup() throws RuntimeException;

  /** Get Promotion Group Line */
  int getM_PromotionGroupLine_ID();

  /** Set Promotion Group Line */
  void setM_PromotionGroupLine_ID(int M_PromotionGroupLine_ID);

  /** Get M_PromotionGroupLine_UU */
  String getM_PromotionGroupLine_UU();

  /** Set M_PromotionGroupLine_UU */
  void setM_PromotionGroupLine_UU(String M_PromotionGroupLine_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
