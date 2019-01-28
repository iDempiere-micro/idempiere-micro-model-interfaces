package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductPriceVendorBreak
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductPriceVendorBreak {

  /** TableName=M_ProductPriceVendorBreak */
  String Table_Name = "M_ProductPriceVendorBreak";

  /** AD_Table_ID=53172 */
  int Table_ID = 53172;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name BreakValue */
  String COLUMNNAME_BreakValue = "BreakValue";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /** Column name M_PriceList_Version_ID */
  String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_ProductPriceVendorBreak_ID */
  String COLUMNNAME_M_ProductPriceVendorBreak_ID = "M_ProductPriceVendorBreak_ID";
  /** Column name M_ProductPriceVendorBreak_UU */
  String COLUMNNAME_M_ProductPriceVendorBreak_UU = "M_ProductPriceVendorBreak_UU";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name PriceStd */
  String COLUMNNAME_PriceStd = "PriceStd";

    /** Set Break Value. Low Value of trade discount break level */
  void setBreakValue(BigDecimal BreakValue);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Get Price List Version. Identifies a unique instance of a Price List */
  int getM_PriceList_Version_ID();

  /** Set Price List Version. Identifies a unique instance of a Price List */
  void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

    /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

    /** Set Standard Price. Standard Price */
  void setPriceStd(BigDecimal PriceStd);

}
