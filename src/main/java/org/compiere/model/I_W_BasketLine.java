package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_BasketLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_BasketLine {

  /** TableName=W_BasketLine */
  String Table_Name = "W_BasketLine";

  /** AD_Table_ID=549 */
  int Table_ID = 549;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Price */
  String COLUMNNAME_Price = "Price";
  /** Column name Product */
  String COLUMNNAME_Product = "Product";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name W_Basket_ID */
  String COLUMNNAME_W_Basket_ID = "W_Basket_ID";
  /** Column name W_BasketLine_ID */
  String COLUMNNAME_W_BasketLine_ID = "W_BasketLine_ID";
  /** Column name W_BasketLine_UU */
  String COLUMNNAME_W_BasketLine_UU = "W_BasketLine_UU";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Price. Price */
  BigDecimal getPrice();

  /** Set Price. Price */
  void setPrice(BigDecimal Price);

  /** Get Product */
  String getProduct();

  /** Set Product */
  void setProduct(String Product);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Basket. Web Basket */
  int getW_Basket_ID();

  /** Set Basket. Web Basket */
  void setW_Basket_ID(int W_Basket_ID);

  I_W_Basket getW_Basket() throws RuntimeException;

  /** Get Basket Line. Web Basket Line */
  int getW_BasketLine_ID();

  /** Set Basket Line. Web Basket Line */
  void setW_BasketLine_ID(int W_BasketLine_ID);

  /** Get W_BasketLine_UU */
  String getW_BasketLine_UU();

  /** Set W_BasketLine_UU */
  void setW_BasketLine_UU(String W_BasketLine_UU);
}
