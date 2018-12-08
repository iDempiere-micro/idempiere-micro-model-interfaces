package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DiscountSchemaLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchemaLine {

  /** TableName=M_DiscountSchemaLine */
  String Table_Name = "M_DiscountSchemaLine";

  /** AD_Table_ID=477 */
  int Table_ID = 477;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name Classification */
  String COLUMNNAME_Classification = "Classification";
  /** Column name ConversionDate */
  String COLUMNNAME_ConversionDate = "ConversionDate";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Group1 */
  String COLUMNNAME_Group1 = "Group1";
  /** Column name Group2 */
  String COLUMNNAME_Group2 = "Group2";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Limit_AddAmt */
  String COLUMNNAME_Limit_AddAmt = "Limit_AddAmt";
  /** Column name Limit_Base */
  String COLUMNNAME_Limit_Base = "Limit_Base";
  /** Column name Limit_Discount */
  String COLUMNNAME_Limit_Discount = "Limit_Discount";
  /** Column name Limit_Fixed */
  String COLUMNNAME_Limit_Fixed = "Limit_Fixed";
  /** Column name Limit_MaxAmt */
  String COLUMNNAME_Limit_MaxAmt = "Limit_MaxAmt";
  /** Column name Limit_MinAmt */
  String COLUMNNAME_Limit_MinAmt = "Limit_MinAmt";
  /** Column name Limit_Rounding */
  String COLUMNNAME_Limit_Rounding = "Limit_Rounding";
  /** Column name List_AddAmt */
  String COLUMNNAME_List_AddAmt = "List_AddAmt";
  /** Column name List_Base */
  String COLUMNNAME_List_Base = "List_Base";
  /** Column name List_Discount */
  String COLUMNNAME_List_Discount = "List_Discount";
  /** Column name List_Fixed */
  String COLUMNNAME_List_Fixed = "List_Fixed";
  /** Column name List_MaxAmt */
  String COLUMNNAME_List_MaxAmt = "List_MaxAmt";
  /** Column name List_MinAmt */
  String COLUMNNAME_List_MinAmt = "List_MinAmt";
  /** Column name List_Rounding */
  String COLUMNNAME_List_Rounding = "List_Rounding";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_DiscountSchemaLine_ID */
  String COLUMNNAME_M_DiscountSchemaLine_ID = "M_DiscountSchemaLine_ID";
  /** Column name M_DiscountSchemaLine_UU */
  String COLUMNNAME_M_DiscountSchemaLine_UU = "M_DiscountSchemaLine_UU";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Std_AddAmt */
  String COLUMNNAME_Std_AddAmt = "Std_AddAmt";
  /** Column name Std_Base */
  String COLUMNNAME_Std_Base = "Std_Base";
  /** Column name Std_Discount */
  String COLUMNNAME_Std_Discount = "Std_Discount";
  /** Column name Std_Fixed */
  String COLUMNNAME_Std_Fixed = "Std_Fixed";
  /** Column name Std_MaxAmt */
  String COLUMNNAME_Std_MaxAmt = "Std_MaxAmt";
  /** Column name Std_MinAmt */
  String COLUMNNAME_Std_MinAmt = "Std_MinAmt";
  /** Column name Std_Rounding */
  String COLUMNNAME_Std_Rounding = "Std_Rounding";
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

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Classification. Classification for grouping */
  String getClassification();

  /** Set Classification. Classification for grouping */
  void setClassification(String Classification);

  /** Get Conversion Date. Date for selecting conversion rate */
  Timestamp getConversionDate();

  /** Set Conversion Date. Date for selecting conversion rate */
  void setConversionDate(Timestamp ConversionDate);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Group1 */
  String getGroup1();

  /** Set Group1 */
  void setGroup1(String Group1);

  /** Get Group2 */
  String getGroup2();

  /** Set Group2 */
  void setGroup2(String Group2);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Get Limit price Surcharge Amount. Amount added to the converted/copied price before multiplying
   */
  BigDecimal getLimit_AddAmt();

  /**
   * Set Limit price Surcharge Amount. Amount added to the converted/copied price before multiplying
   */
  void setLimit_AddAmt(BigDecimal Limit_AddAmt);

  /** Get Limit price Base. Base price for calculation of the new price */
  String getLimit_Base();

  /** Set Limit price Base. Base price for calculation of the new price */
  void setLimit_Base(String Limit_Base);

  /**
   * Get Limit price Discount %. Discount in percent to be subtracted from base, if negative it will
   * be added to base price
   */
  BigDecimal getLimit_Discount();

  /**
   * Set Limit price Discount %. Discount in percent to be subtracted from base, if negative it will
   * be added to base price
   */
  void setLimit_Discount(BigDecimal Limit_Discount);

  /** Get Fixed Limit Price. Fixed Limit Price (not calculated) */
  BigDecimal getLimit_Fixed();

  /** Set Fixed Limit Price. Fixed Limit Price (not calculated) */
  void setLimit_Fixed(BigDecimal Limit_Fixed);

  /** Get Limit price max Margin. Maximum difference to original limit price; ignored if zero */
  BigDecimal getLimit_MaxAmt();

  /** Set Limit price max Margin. Maximum difference to original limit price; ignored if zero */
  void setLimit_MaxAmt(BigDecimal Limit_MaxAmt);

  /** Get Limit price min Margin. Minimum difference to original limit price; ignored if zero */
  BigDecimal getLimit_MinAmt();

  /** Set Limit price min Margin. Minimum difference to original limit price; ignored if zero */
  void setLimit_MinAmt(BigDecimal Limit_MinAmt);

  /** Get Limit price Rounding. Rounding of the final result */
  String getLimit_Rounding();

  /** Set Limit price Rounding. Rounding of the final result */
  void setLimit_Rounding(String Limit_Rounding);

  /** Get List price Surcharge Amount. List Price Surcharge Amount */
  BigDecimal getList_AddAmt();

  /** Set List price Surcharge Amount. List Price Surcharge Amount */
  void setList_AddAmt(BigDecimal List_AddAmt);

  /** Get List price Base. Price used as the basis for price list calculations */
  String getList_Base();

  /** Set List price Base. Price used as the basis for price list calculations */
  void setList_Base(String List_Base);

  /** Get List price Discount %. Discount from list price as a percentage */
  BigDecimal getList_Discount();

  /** Set List price Discount %. Discount from list price as a percentage */
  void setList_Discount(BigDecimal List_Discount);

  /** Get Fixed List Price. Fixes List Price (not calculated) */
  BigDecimal getList_Fixed();

  /** Set Fixed List Price. Fixes List Price (not calculated) */
  void setList_Fixed(BigDecimal List_Fixed);

  /** Get List price max Margin. Maximum margin for a product */
  BigDecimal getList_MaxAmt();

  /** Set List price max Margin. Maximum margin for a product */
  void setList_MaxAmt(BigDecimal List_MaxAmt);

  /** Get List price min Margin. Minimum margin for a product */
  BigDecimal getList_MinAmt();

  /** Set List price min Margin. Minimum margin for a product */
  void setList_MinAmt(BigDecimal List_MinAmt);

  /** Get List price Rounding. Rounding rule for final list price */
  String getList_Rounding();

  /** Set List price Rounding. Rounding rule for final list price */
  void setList_Rounding(String List_Rounding);

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

  /** Get Discount Pricelist. Line of the pricelist trade discount schema */
  int getM_DiscountSchemaLine_ID();

  /** Set Discount Pricelist. Line of the pricelist trade discount schema */
  void setM_DiscountSchemaLine_ID(int M_DiscountSchemaLine_ID);

  /** Get M_DiscountSchemaLine_UU */
  String getM_DiscountSchemaLine_UU();

  /** Set M_DiscountSchemaLine_UU */
  void setM_DiscountSchemaLine_UU(String M_DiscountSchemaLine_UU);

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

  /** Get Standard price Surcharge Amount. Amount added to a price as a surcharge */
  BigDecimal getStd_AddAmt();

  /** Set Standard price Surcharge Amount. Amount added to a price as a surcharge */
  void setStd_AddAmt(BigDecimal Std_AddAmt);

  /** Get Standard price Base. Base price for calculating new standard price */
  String getStd_Base();

  /** Set Standard price Base. Base price for calculating new standard price */
  void setStd_Base(String Std_Base);

  /** Get Standard price Discount %. Discount percentage to subtract from base price */
  BigDecimal getStd_Discount();

  /** Set Standard price Discount %. Discount percentage to subtract from base price */
  void setStd_Discount(BigDecimal Std_Discount);

  /** Get Fixed Standard Price. Fixed Standard Price (not calculated) */
  BigDecimal getStd_Fixed();

  /** Set Fixed Standard Price. Fixed Standard Price (not calculated) */
  void setStd_Fixed(BigDecimal Std_Fixed);

  /** Get Standard max Margin. Maximum margin allowed for a product */
  BigDecimal getStd_MaxAmt();

  /** Set Standard max Margin. Maximum margin allowed for a product */
  void setStd_MaxAmt(BigDecimal Std_MaxAmt);

  /** Get Standard price min Margin. Minimum margin allowed for a product */
  BigDecimal getStd_MinAmt();

  /** Set Standard price min Margin. Minimum margin allowed for a product */
  void setStd_MinAmt(BigDecimal Std_MinAmt);

  /** Get Standard price Rounding. Rounding rule for calculated price */
  String getStd_Rounding();

  /** Set Standard price Rounding. Rounding rule for calculated price */
  void setStd_Rounding(String Std_Rounding);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
