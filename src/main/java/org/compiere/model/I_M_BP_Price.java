package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_BP_Price
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_BP_Price {

  /** TableName=M_BP_Price */
  String Table_Name = "M_BP_Price";

  /** AD_Table_ID=53325 */
  int Table_ID = 53325;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BreakValue */
  String COLUMNNAME_BreakValue = "BreakValue";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Comments */
  String COLUMNNAME_Comments = "Comments";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Discount */
  String COLUMNNAME_Discount = "Discount";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsNetPrice */
  String COLUMNNAME_IsNetPrice = "IsNetPrice";
  /** Column name M_BP_Price_ID */
  String COLUMNNAME_M_BP_Price_ID = "M_BP_Price_ID";
  /** Column name M_BP_Price_UU */
  String COLUMNNAME_M_BP_Price_UU = "M_BP_Price_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name PriceOverrideType */
  String COLUMNNAME_PriceOverrideType = "PriceOverrideType";
  /** Column name PriceStd */
  String COLUMNNAME_PriceStd = "PriceStd";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Break Value. Low Value of trade discount break level */
  BigDecimal getBreakValue();

  /** Set Break Value. Low Value of trade discount break level */
  void setBreakValue(BigDecimal BreakValue);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Comments. Comments or additional information */
  String getComments();

  /** Set Comments. Comments or additional information */
  void setComments(String Comments);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Discount %. Discount in percent */
  BigDecimal getDiscount();

  /** Set Discount %. Discount in percent */
  void setDiscount(BigDecimal Discount);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Net Price. Net Price including all discounts */
  void setIsNetPrice(boolean IsNetPrice);

  /** Get Net Price. Net Price including all discounts */
  boolean isNetPrice();

  /** Get Business Partner Price */
  int getM_BP_Price_ID();

  /** Set Business Partner Price */
  void setM_BP_Price_ID(int M_BP_Price_ID);

  /** Get M_BP_Price_UU */
  String getM_BP_Price_UU();

  /** Set M_BP_Price_UU */
  void setM_BP_Price_UU(String M_BP_Price_UU);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

  /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

  /** Get List Price. List Price */
  BigDecimal getPriceList();

  /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

  /** Get Price Override Type. Type of price override, fixed price or discount off list */
  String getPriceOverrideType();

  /** Set Price Override Type. Type of price override, fixed price or discount off list */
  void setPriceOverrideType(String PriceOverrideType);

  /** Get Standard Price. Standard Price */
  BigDecimal getPriceStd();

  /** Set Standard Price. Standard Price */
  void setPriceStd(BigDecimal PriceStd);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);

  /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

  /** Set Valid to. Valid to including this date (last day) */
  void setValidTo(Timestamp ValidTo);
}
