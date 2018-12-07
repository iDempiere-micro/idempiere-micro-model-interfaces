package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DiscountSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchema {

  /** TableName=M_DiscountSchema */
  String Table_Name = "M_DiscountSchema";

  /** AD_Table_ID=475 */
  int Table_ID = 475;

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
  /** Column name CumulativeLevel */
  String COLUMNNAME_CumulativeLevel = "CumulativeLevel";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DiscountType */
  String COLUMNNAME_DiscountType = "DiscountType";
  /** Column name FlatDiscount */
  String COLUMNNAME_FlatDiscount = "FlatDiscount";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBPartnerFlatDiscount */
  String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";
  /** Column name IsQuantityBased */
  String COLUMNNAME_IsQuantityBased = "IsQuantityBased";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_DiscountSchema_UU */
  String COLUMNNAME_M_DiscountSchema_UU = "M_DiscountSchema_UU";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Script */
  String COLUMNNAME_Script = "Script";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Accumulation Level. Level for accumulative calculations */
  String getCumulativeLevel();

  /** Set Accumulation Level. Level for accumulative calculations */
  void setCumulativeLevel(String CumulativeLevel);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Discount Type. Type of trade discount calculation */
  String getDiscountType();

  /** Set Discount Type. Type of trade discount calculation */
  void setDiscountType(String DiscountType);

  /** Get Flat Discount %. Flat discount percentage */
  BigDecimal getFlatDiscount();

  /** Set Flat Discount %. Flat discount percentage */
  void setFlatDiscount(BigDecimal FlatDiscount);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  void setIsBPartnerFlatDiscount(boolean IsBPartnerFlatDiscount);

  /** Get B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  boolean isBPartnerFlatDiscount();

  /** Set Quantity based. Trade discount break level based on Quantity (not value) */
  void setIsQuantityBased(boolean IsQuantityBased);

  /** Get Quantity based. Trade discount break level based on Quantity (not value) */
  boolean isQuantityBased();

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  /** Get M_DiscountSchema_UU */
  String getM_DiscountSchema_UU();

  /** Set M_DiscountSchema_UU */
  void setM_DiscountSchema_UU(String M_DiscountSchema_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Script. Dynamic Java Language Script to calculate result */
  String getScript();

  /** Set Script. Dynamic Java Language Script to calculate result */
  void setScript(String Script);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);
}
