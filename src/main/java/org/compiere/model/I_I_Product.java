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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
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
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
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

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner Key. The Key of the Business Partner */
  String getBPartner_Value();

  /** Set Business Partner Key. The Key of the Business Partner */
  void setBPartner_Value(String BPartner_Value);

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

  /** Get Classification. Classification for grouping */
  String getClassification();

  /** Set Classification. Classification for grouping */
  void setClassification(String Classification);

  /** Get Cost per Order. Fixed Cost Per Order */
  BigDecimal getCostPerOrder();

  /** Set Cost per Order. Fixed Cost Per Order */
  void setCostPerOrder(BigDecimal CostPerOrder);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  void setC_UOM_ID(int C_UOM_ID);

  I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Promised Delivery Time. Promised days between order and delivery */
  int getDeliveryTime_Promised();

  /** Set Promised Delivery Time. Promised days between order and delivery */
  void setDeliveryTime_Promised(int DeliveryTime_Promised);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description URL. URL for the description */
  String getDescriptionURL();

  /** Set Description URL. URL for the description */
  void setDescriptionURL(String DescriptionURL);

  /** Get Discontinued. This product is no longer available */
  boolean isDiscontinued();

  /** Set Discontinued. This product is no longer available */
  void setDiscontinued(boolean Discontinued);

  /** Get Discontinued At. Discontinued At indicates Date when product was discontinued */
  Timestamp getDiscontinuedAt();

  /** Set Discontinued At. Discontinued At indicates Date when product was discontinued */
  void setDiscontinuedAt(Timestamp DiscontinuedAt);

  /** Get Document Note. Additional information for a Document */
  String getDocumentNote();

  /** Set Document Note. Additional information for a Document */
  void setDocumentNote(String DocumentNote);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Get Image URL. URL of image */
  String getImageURL();

  /** Set Image URL. URL of image */
  void setImageURL(String ImageURL);

  /** Get Import Product. Import Item or Service */
  int getI_Product_ID();

  /** Set Import Product. Import Item or Service */
  void setI_Product_ID(int I_Product_ID);

  /** Get I_Product_UU */
  String getI_Product_UU();

  /** Set I_Product_UU */
  void setI_Product_UU(String I_Product_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  String getISO_Code();

  /** Set ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  void setISO_Code(String ISO_Code);

  /** Get Manufacturer. Manufacturer of the Product */
  String getManufacturer();

  /** Set Manufacturer. Manufacturer of the Product */
  void setManufacturer(String Manufacturer);

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Minimum Order Qty. Minimum order quantity in UOM */
  int getOrder_Min();

  /** Set Minimum Order Qty. Minimum order quantity in UOM */
  void setOrder_Min(int Order_Min);

  /** Get Order Pack Qty. Package order size in UOM (e.g. order set of 5 units) */
  int getOrder_Pack();

  /** Set Order Pack Qty. Package order size in UOM (e.g. order set of 5 units) */
  void setOrder_Pack(int Order_Pack);

  /** Get Price effective. Effective Date of Price */
  Timestamp getPriceEffective();

  /** Set Price effective. Effective Date of Price */
  void setPriceEffective(Timestamp PriceEffective);

  /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

  /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

  /** Get List Price. List Price */
  BigDecimal getPriceList();

  /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

  /** Get PO Price. Price based on a purchase order */
  BigDecimal getPricePO();

  /** Set PO Price. Price based on a purchase order */
  void setPricePO(BigDecimal PricePO);

  /** Get Standard Price. Standard Price */
  BigDecimal getPriceStd();

  /** Set Standard Price. Standard Price */
  void setPriceStd(BigDecimal PriceStd);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Product Category Key */
  String getProductCategory_Value();

  /** Set Product Category Key */
  void setProductCategory_Value(String ProductCategory_Value);

  /** Get Product Type. Type of product */
  String getProductType();

  /** Set Product Type. Type of product */
  void setProductType(String ProductType);

  /** Get Royalty Amount. (Included) Amount for copyright, etc. */
  BigDecimal getRoyaltyAmt();

  /** Set Royalty Amount. (Included) Amount for copyright, etc. */
  void setRoyaltyAmt(BigDecimal RoyaltyAmt);

  /** Get Shelf Depth. Shelf depth required */
  int getShelfDepth();

  /** Set Shelf Depth. Shelf depth required */
  void setShelfDepth(int ShelfDepth);

  /** Get Shelf Height. Shelf height required */
  BigDecimal getShelfHeight();

  /** Set Shelf Height. Shelf height required */
  void setShelfHeight(BigDecimal ShelfHeight);

  /** Get Shelf Width. Shelf width required */
  int getShelfWidth();

  /** Set Shelf Width. Shelf width required */
  void setShelfWidth(int ShelfWidth);

  /** Get SKU. Stock Keeping Unit */
  String getSKU();

  /** Set SKU. Stock Keeping Unit */
  void setSKU(String SKU);

  /** Get Units Per Pallet. Units Per Pallet */
  int getUnitsPerPallet();

  /** Set Units Per Pallet. Units Per Pallet */
  void setUnitsPerPallet(int UnitsPerPallet);

  /** Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number) */
  String getUPC();

  /** Set UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number) */
  void setUPC(String UPC);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Partner Category. Product Category of the Business Partner */
  String getVendorCategory();

  /** Set Partner Category. Product Category of the Business Partner */
  void setVendorCategory(String VendorCategory);

  /** Get Partner Product Key. Product Key of the Business Partner */
  String getVendorProductNo();

  /** Set Partner Product Key. Product Key of the Business Partner */
  void setVendorProductNo(String VendorProductNo);

  /** Get Volume. Volume of a product */
  BigDecimal getVolume();

  /** Set Volume. Volume of a product */
  void setVolume(BigDecimal Volume);

  /** Get Weight. Weight of a product */
  BigDecimal getWeight();

  /** Set Weight. Weight of a product */
  void setWeight(BigDecimal Weight);

  /** Get UOM Code. UOM EDI X12 Code */
  String getX12DE355();

  /** Set UOM Code. UOM EDI X12 Code */
  void setX12DE355(String X12DE355);
}
