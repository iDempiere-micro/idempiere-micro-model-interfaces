package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Product {

  /** TableName=I_Product */
  String Table_Name = "I_Product";

  /** AD_Table_ID=532 */
  int Table_ID = 532;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name BPartner_Value */
  String COLUMNNAME_BPartner_Value = "BPartner_Value";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Classification */
  String COLUMNNAME_Classification = "Classification";
  /** Column name CostPerOrder */
  String COLUMNNAME_CostPerOrder = "CostPerOrder";
    /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name DeliveryTime_Promised */
  String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DescriptionURL */
  String COLUMNNAME_DescriptionURL = "DescriptionURL";
  /** Column name Discontinued */
  String COLUMNNAME_Discontinued = "Discontinued";
  /** Column name DiscontinuedAt */
  String COLUMNNAME_DiscontinuedAt = "DiscontinuedAt";
  /** Column name DocumentNote */
  String COLUMNNAME_DocumentNote = "DocumentNote";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name ImageURL */
  String COLUMNNAME_ImageURL = "ImageURL";
  /** Column name I_Product_ID */
  String COLUMNNAME_I_Product_ID = "I_Product_ID";
  /** Column name I_Product_UU */
  String COLUMNNAME_I_Product_UU = "I_Product_UU";
    /** Column name ISO_Code */
  String COLUMNNAME_ISO_Code = "ISO_Code";
  /** Column name Manufacturer */
  String COLUMNNAME_Manufacturer = "Manufacturer";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Order_Min */
  String COLUMNNAME_Order_Min = "Order_Min";
  /** Column name Order_Pack */
  String COLUMNNAME_Order_Pack = "Order_Pack";
  /** Column name PriceEffective */
  String COLUMNNAME_PriceEffective = "PriceEffective";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name PricePO */
  String COLUMNNAME_PricePO = "PricePO";
  /** Column name PriceStd */
  String COLUMNNAME_PriceStd = "PriceStd";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProductCategory_Value */
  String COLUMNNAME_ProductCategory_Value = "ProductCategory_Value";
  /** Column name ProductType */
  String COLUMNNAME_ProductType = "ProductType";
  /** Column name RoyaltyAmt */
  String COLUMNNAME_RoyaltyAmt = "RoyaltyAmt";
  /** Column name ShelfDepth */
  String COLUMNNAME_ShelfDepth = "ShelfDepth";
  /** Column name ShelfHeight */
  String COLUMNNAME_ShelfHeight = "ShelfHeight";
  /** Column name ShelfWidth */
  String COLUMNNAME_ShelfWidth = "ShelfWidth";
  /** Column name SKU */
  String COLUMNNAME_SKU = "SKU";
  /** Column name UnitsPerPallet */
  String COLUMNNAME_UnitsPerPallet = "UnitsPerPallet";
  /** Column name UPC */
  String COLUMNNAME_UPC = "UPC";
    /** Column name VendorCategory */
  String COLUMNNAME_VendorCategory = "VendorCategory";
  /** Column name VendorProductNo */
  String COLUMNNAME_VendorProductNo = "VendorProductNo";
  /** Column name Volume */
  String COLUMNNAME_Volume = "Volume";
  /** Column name Weight */
  String COLUMNNAME_Weight = "Weight";
  /** Column name X12DE355 */
  String COLUMNNAME_X12DE355 = "X12DE355";

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

    /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Description URL. URL for the description */
  String getDescriptionURL();

    /** Get Document Note. Additional information for a Document */
  String getDocumentNote();

    /** Get Comment/Help. Comment or Hint */
  String getHelp();

    /** Get Image URL. URL of image */
  String getImageURL();

    /** Get Import Product. Import Item or Service */
  int getI_Product_ID();

    /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

    /** Get List Price. List Price */
  BigDecimal getPriceList();

    /** Get Standard Price. Standard Price */
  BigDecimal getPriceStd();

    /** Get Product Type. Type of product */
  String getProductType();

    /** Get SKU. Stock Keeping Unit */
  String getSKU();

    /** Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number) */
  String getUPC();

    /** Get Volume. Volume of a product */
  BigDecimal getVolume();

    /** Get Weight. Weight of a product */
  BigDecimal getWeight();

}
