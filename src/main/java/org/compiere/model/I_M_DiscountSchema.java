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

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name CumulativeLevel */
  String COLUMNNAME_CumulativeLevel = "CumulativeLevel";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DiscountType */
  String COLUMNNAME_DiscountType = "DiscountType";
  /** Column name FlatDiscount */
  String COLUMNNAME_FlatDiscount = "FlatDiscount";
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
    /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

    /** Get Accumulation Level. Level for accumulative calculations */
  String getCumulativeLevel();

  /** Set Accumulation Level. Level for accumulative calculations */
  void setCumulativeLevel(String CumulativeLevel);

    /** Get Discount Type. Type of trade discount calculation */
  String getDiscountType();

  /** Set Discount Type. Type of trade discount calculation */
  void setDiscountType(String DiscountType);

  /** Get Flat Discount %. Flat discount percentage */
  BigDecimal getFlatDiscount();

  /** Set Flat Discount %. Flat discount percentage */
  void setFlatDiscount(BigDecimal FlatDiscount);

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

    /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);
}
