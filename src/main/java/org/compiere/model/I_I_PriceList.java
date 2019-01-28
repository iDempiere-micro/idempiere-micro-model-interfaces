package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_PriceList
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_PriceList {

  /** TableName=I_PriceList */
  String Table_Name = "I_PriceList";

  /** AD_Table_ID=53173 */
  int Table_ID = 53173;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name BPartner_Value */
  String COLUMNNAME_BPartner_Value = "BPartner_Value";
  /** Column name BreakValue */
  String COLUMNNAME_BreakValue = "BreakValue";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EnforcePriceLimit */
  String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name I_PriceList_ID */
  String COLUMNNAME_I_PriceList_ID = "I_PriceList_ID";
  /** Column name I_PriceList_UU */
  String COLUMNNAME_I_PriceList_UU = "I_PriceList_UU";
    /** Column name ISO_Code */
  String COLUMNNAME_ISO_Code = "ISO_Code";
  /** Column name IsSOPriceList */
  String COLUMNNAME_IsSOPriceList = "IsSOPriceList";
  /** Column name IsTaxIncluded */
  String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_PriceList_Version_ID */
  String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name PricePrecision */
  String COLUMNNAME_PricePrecision = "PricePrecision";
  /** Column name PriceStd */
  String COLUMNNAME_PriceStd = "PriceStd";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProductValue */
  String COLUMNNAME_ProductValue = "ProductValue";
    /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name X12DE355 */
  String COLUMNNAME_X12DE355 = "X12DE355";

    /** Get Break Value. Low Value of trade discount break level */
  BigDecimal getBreakValue();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

    /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Enforce price limit. Do not allow prices below the limit price */
  boolean isEnforcePriceLimit();

    /** Get Import Price List */
  int getI_PriceList_ID();

    /** Get Sales Price list. This is a Sales Price List */
  boolean isSOPriceList();

    /** Get Price includes Tax. Tax is included in the price */
  boolean isTaxIncluded();

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

    /** Get Price List Version. Identifies a unique instance of a Price List */
  int getM_PriceList_Version_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

    /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

    /** Get List Price. List Price */
  BigDecimal getPriceList();

    /** Get Price Precision. Precision (number of decimals) for the Price */
  int getPricePrecision();

    /** Get Standard Price. Standard Price */
  BigDecimal getPriceStd();

    /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

}
