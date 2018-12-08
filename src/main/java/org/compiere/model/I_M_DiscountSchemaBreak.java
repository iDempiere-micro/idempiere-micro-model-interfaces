package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DiscountSchemaBreak
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchemaBreak {

  /** TableName=M_DiscountSchemaBreak */
  String Table_Name = "M_DiscountSchemaBreak";

  /** AD_Table_ID=476 */
  int Table_ID = 476;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BreakDiscount */
  String COLUMNNAME_BreakDiscount = "BreakDiscount";
  /** Column name BreakValue */
  String COLUMNNAME_BreakValue = "BreakValue";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBPartnerFlatDiscount */
  String COLUMNNAME_IsBPartnerFlatDiscount = "IsBPartnerFlatDiscount";
  /** Column name M_DiscountSchemaBreak_ID */
  String COLUMNNAME_M_DiscountSchemaBreak_ID = "M_DiscountSchemaBreak_ID";
  /** Column name M_DiscountSchemaBreak_UU */
  String COLUMNNAME_M_DiscountSchemaBreak_UU = "M_DiscountSchemaBreak_UU";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Break Discount %. Trade Discount in Percent for the break level */
  BigDecimal getBreakDiscount();

  /** Set Break Discount %. Trade Discount in Percent for the break level */
  void setBreakDiscount(BigDecimal BreakDiscount);

  /** Get Break Value. Low Value of trade discount break level */
  BigDecimal getBreakValue();

  /** Set Break Value. Low Value of trade discount break level */
  void setBreakValue(BigDecimal BreakValue);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  void setIsBPartnerFlatDiscount(boolean IsBPartnerFlatDiscount);

  /** Get B.Partner Flat Discount. Use flat discount defined on Business Partner Level */
  boolean isBPartnerFlatDiscount();

  /** Get Discount Schema Break. Trade Discount Break */
  int getM_DiscountSchemaBreak_ID();

  /** Set Discount Schema Break. Trade Discount Break */
  void setM_DiscountSchemaBreak_ID(int M_DiscountSchemaBreak_ID);

  /** Get M_DiscountSchemaBreak_UU */
  String getM_DiscountSchemaBreak_UU();

  /** Set M_DiscountSchemaBreak_UU */
  void setM_DiscountSchemaBreak_UU(String M_DiscountSchemaBreak_UU);

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

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

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
