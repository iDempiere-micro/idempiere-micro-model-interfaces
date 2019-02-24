package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product extends IPO {

    /**
     * TableName=M_Product
     */
    String Table_Name = "M_Product";

    /**
     * AD_Table_ID=208
     */
    int Table_ID = 208;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /**
     * Item = I
     */
    String PRODUCTTYPE_Item = "I";
    /**
     * Service = S
     */
    String PRODUCTTYPE_Service = "S";
    /**
     * Resource = R
     */
    String PRODUCTTYPE_Resource = "R";
    /**
     * Expense type = E
     */
    String PRODUCTTYPE_ExpenseType = "E";

    /**
     * Column name C_RevenueRecognition_ID
     */
    String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
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
     * Column name IsBOM
     */
    String COLUMNNAME_IsBOM = "IsBOM";
    /**
     * Column name IsExcludeAutoDelivery
     */
    String COLUMNNAME_IsExcludeAutoDelivery = "IsExcludeAutoDelivery";
    /**
     * Column name IsInvoicePrintDetails
     */
    String COLUMNNAME_IsInvoicePrintDetails = "IsInvoicePrintDetails";
    /**
     * Column name IsManufactured
     */
    String COLUMNNAME_IsManufactured = "IsManufactured";
    /**
     * Column name IsOwnBox
     */
    String COLUMNNAME_IsOwnBox = "IsOwnBox";
    /**
     * Column name IsPhantom
     */
    String COLUMNNAME_IsPhantom = "IsPhantom";
    /**
     * Column name IsPickListPrintDetails
     */
    String COLUMNNAME_IsPickListPrintDetails = "IsPickListPrintDetails";
    /**
     * Column name IsPurchased
     */
    String COLUMNNAME_IsPurchased = "IsPurchased";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name IsSold
     */
    String COLUMNNAME_IsSold = "IsSold";
    /**
     * Column name IsStocked
     */
    String COLUMNNAME_IsStocked = "IsStocked";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name IsVerified
     */
    String COLUMNNAME_IsVerified = "IsVerified";
    /**
     * Column name IsWebStoreFeatured
     */
    String COLUMNNAME_IsWebStoreFeatured = "IsWebStoreFeatured";
    /**
     * Column name LowLevel
     */
    String COLUMNNAME_LowLevel = "LowLevel";
    /**
     * Column name M_AttributeSet_ID
     */
    String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductType
     */
    String COLUMNNAME_ProductType = "ProductType";
    /**
     * Column name S_ExpenseType_ID
     */
    String COLUMNNAME_S_ExpenseType_ID = "S_ExpenseType_ID";
    /**
     * Column name ShelfDepth
     */
    String COLUMNNAME_ShelfDepth = "ShelfDepth";
    /**
     * Column name ShelfHeight
     */
    String COLUMNNAME_ShelfHeight = "ShelfHeight";
    /**
     * Column name ShelfWidth
     */
    String COLUMNNAME_ShelfWidth = "ShelfWidth";
    /**
     * Column name SKU
     */
    String COLUMNNAME_SKU = "SKU";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name VersionNo
     */
    String COLUMNNAME_VersionNo = "VersionNo";
    /**
     * Column name Volume
     */
    String COLUMNNAME_Volume = "Volume";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Tax Category. Tax Category
     */
    void setC_TaxCategory_ID(int C_TaxCategory_ID);

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    /**
     * Set Bill of Materials. Bill of Materials
     */
    void setIsBOM(boolean IsBOM);

    /**
     * Get Exclude Auto Delivery. Exclude from automatic Delivery
     */
    boolean isExcludeAutoDelivery();

    /**
     * Get Own Box
     */
    boolean isOwnBox();

    /**
     * Get Stocked. Organization stocks this product
     */
    boolean isStocked();

    /**
     * Get Attribute Set. Product Attribute Set
     */
    int getMAttributeSet_ID();

    I_M_AttributeSet getMAttributeSet() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Set Product Type. Type of product
     */
    void setProductType(String ProductType);

    /**
     * Get Shelf Depth. Shelf depth required
     */
    int getShelfDepth();

    /**
     * Get Shelf Height. Shelf height required
     */
    BigDecimal getShelfHeight();

    /**
     * Get Shelf Width. Shelf width required
     */
    int getShelfWidth();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Volume. Volume of a product
     */
    BigDecimal getVolume();

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

    int getUOMPrecision();

    boolean isItem();
}
