package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for I_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Product {

    /**
     * TableName=I_Product
     */
    String Table_Name = "I_Product";

    /**
     * AD_Table_ID=532
     */
    int Table_ID = 532;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DescriptionURL
     */
    String COLUMNNAME_DescriptionURL = "DescriptionURL";
    /**
     * Column name DocumentNote
     */
    String COLUMNNAME_DocumentNote = "DocumentNote";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name I_Product_ID
     */
    String COLUMNNAME_I_Product_ID = "I_Product_ID";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PriceLimit
     */
    String COLUMNNAME_PriceLimit = "PriceLimit";
    /**
     * Column name PriceList
     */
    String COLUMNNAME_PriceList = "PriceList";
    /**
     * Column name PriceStd
     */
    String COLUMNNAME_PriceStd = "PriceStd";
    /**
     * Column name ProductType
     */
    String COLUMNNAME_ProductType = "ProductType";
    /**
     * Column name SKU
     */
    String COLUMNNAME_SKU = "SKU";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name Volume
     */
    String COLUMNNAME_Volume = "Volume";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Description URL. URL for the description
     */
    String getDescriptionURL();

    /**
     * Get Document Note. Additional information for a Document
     */
    String getDocumentNote();

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Get Import Product. Import Item or Service
     */
    int getI_Product_ID();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Limit Price. Lowest price for a product
     */
    BigDecimal getPriceLimit();

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Get Standard Price. Standard Price
     */
    BigDecimal getPriceStd();

    /**
     * Get Product Type. Type of product
     */
    String getProductType();

    /**
     * Get SKU. Stock Keeping Unit
     */
    String getSKU();

    /**
     * Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    String getUPC();

    /**
     * Get Volume. Volume of a product
     */
    BigDecimal getVolume();

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

}
