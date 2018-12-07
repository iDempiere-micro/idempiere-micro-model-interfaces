package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQResponseLineQty
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQResponseLineQty {

  /** TableName=C_RfQResponseLineQty */
  String Table_Name = "C_RfQResponseLineQty";

  /** AD_Table_ID=672 */
  int Table_ID = 672;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_RfQLineQty_ID */
  String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";
  /** Column name C_RfQResponseLine_ID */
  String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";
  /** Column name C_RfQResponseLineQty_ID */
  String COLUMNNAME_C_RfQResponseLineQty_ID = "C_RfQResponseLineQty_ID";
  /** Column name C_RfQResponseLineQty_UU */
  String COLUMNNAME_C_RfQResponseLineQty_UU = "C_RfQResponseLineQty_UU";
  /** Column name Discount */
  String COLUMNNAME_Discount = "Discount";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Price */
  String COLUMNNAME_Price = "Price";
  /** Column name Ranking */
  String COLUMNNAME_Ranking = "Ranking";
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

  /** Get RfQ Line Quantity. Request for Quotation Line Quantity */
  int getC_RfQLineQty_ID();

  /** Set RfQ Line Quantity. Request for Quotation Line Quantity */
  void setC_RfQLineQty_ID(int C_RfQLineQty_ID);

  I_C_RfQLineQty getC_RfQLineQty() throws RuntimeException;

  /** Get RfQ Response Line. Request for Quotation Response Line */
  int getC_RfQResponseLine_ID();

  /** Set RfQ Response Line. Request for Quotation Response Line */
  void setC_RfQResponseLine_ID(int C_RfQResponseLine_ID);

  I_C_RfQResponseLine getC_RfQResponseLine() throws RuntimeException;

  /** Get RfQ Response Line Qty. Request for Quotation Response Line Quantity */
  int getC_RfQResponseLineQty_ID();

  /** Set RfQ Response Line Qty. Request for Quotation Response Line Quantity */
  void setC_RfQResponseLineQty_ID(int C_RfQResponseLineQty_ID);

  /** Get C_RfQResponseLineQty_UU */
  String getC_RfQResponseLineQty_UU();

  /** Set C_RfQResponseLineQty_UU */
  void setC_RfQResponseLineQty_UU(String C_RfQResponseLineQty_UU);

  /** Get Discount %. Discount in percent */
  BigDecimal getDiscount();

  /** Set Discount %. Discount in percent */
  void setDiscount(BigDecimal Discount);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Price. Price */
  BigDecimal getPrice();

  /** Set Price. Price */
  void setPrice(BigDecimal Price);

  /** Get Ranking. Relative Rank Number */
  int getRanking();

  /** Set Ranking. Relative Rank Number */
  void setRanking(int Ranking);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
