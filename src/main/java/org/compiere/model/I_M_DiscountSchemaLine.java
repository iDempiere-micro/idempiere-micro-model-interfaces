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

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name Classification */
  String COLUMNNAME_Classification = "Classification";
  /** Column name ConversionDate */
  String COLUMNNAME_ConversionDate = "ConversionDate";
    /** Column name Group1 */
  String COLUMNNAME_Group1 = "Group1";
  /** Column name Group2 */
  String COLUMNNAME_Group2 = "Group2";
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

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

    /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

    /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

}
