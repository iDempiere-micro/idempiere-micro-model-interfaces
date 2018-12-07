package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

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
     * Online = O
     */
    String PRODUCTTYPE_Online = "O";
    /**
     * Asset = A
     */
    String PRODUCTTYPE_Asset = "A";

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Classification
     */
    String COLUMNNAME_Classification = "Classification";
    /**
     * Column name CopyFrom
     */
    String COLUMNNAME_CopyFrom = "CopyFrom";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_RevenueRecognition_ID
     */
    String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
    /**
     * Column name C_SubscriptionType_ID
     */
    String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
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
     * Column name Discontinued
     */
    String COLUMNNAME_Discontinued = "Discontinued";
    /**
     * Column name DiscontinuedAt
     */
    String COLUMNNAME_DiscontinuedAt = "DiscontinuedAt";
    /**
     * Column name DocumentNote
     */
    String COLUMNNAME_DocumentNote = "DocumentNote";
    /**
     * Column name Group1
     */
    String COLUMNNAME_Group1 = "Group1";
    /**
     * Column name Group2
     */
    String COLUMNNAME_Group2 = "Group2";
    /**
     * Column name GuaranteeDays
     */
    String COLUMNNAME_GuaranteeDays = "GuaranteeDays";
    /**
     * Column name GuaranteeDaysMin
     */
    String COLUMNNAME_GuaranteeDaysMin = "GuaranteeDaysMin";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBOM
     */
    String COLUMNNAME_IsBOM = "IsBOM";
    /**
     * Column name IsDropShip
     */
    String COLUMNNAME_IsDropShip = "IsDropShip";
    /**
     * Column name IsExcludeAutoDelivery
     */
    String COLUMNNAME_IsExcludeAutoDelivery = "IsExcludeAutoDelivery";
    /**
     * Column name IsInvoicePrintDetails
     */
    String COLUMNNAME_IsInvoicePrintDetails = "IsInvoicePrintDetails";
    /**
     * Column name IsKanban
     */
    String COLUMNNAME_IsKanban = "IsKanban";
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
     * Column name M_FreightCategory_ID
     */
    String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_PartType_ID
     */
    String COLUMNNAME_M_PartType_ID = "M_PartType_ID";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Product_UU
     */
    String COLUMNNAME_M_Product_UU = "M_Product_UU";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductType
     */
    String COLUMNNAME_ProductType = "ProductType";
    /**
     * Column name R_MailText_ID
     */
    String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
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
     * Column name UnitsPerPack
     */
    String COLUMNNAME_UnitsPerPack = "UnitsPerPack";
    /**
     * Column name UnitsPerPallet
     */
    String COLUMNNAME_UnitsPerPallet = "UnitsPerPallet";
    /**
     * Column name UPC
     */
    String COLUMNNAME_UPC = "UPC";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Classification. Classification for grouping
     */
    String getClassification();

    /**
     * Set Classification. Classification for grouping
     */
    void setClassification(String Classification);

    /**
     * Get Copy From. Copy From Record
     */
    String getCopyFrom();

    /**
     * Set Copy From. Copy From Record
     */
    void setCopyFrom(String CopyFrom);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Revenue Recognition. Method for recording revenue
     */
    int getC_RevenueRecognition_ID();

    /**
     * Set Revenue Recognition. Method for recording revenue
     */
    void setC_RevenueRecognition_ID(int C_RevenueRecognition_ID);

    I_C_RevenueRecognition getC_RevenueRecognition() throws RuntimeException;

    /**
     * Get Subscription Type. Type of subscription
     */
    int getC_SubscriptionType_ID();

    /**
     * Set Subscription Type. Type of subscription
     */
    void setC_SubscriptionType_ID(int C_SubscriptionType_ID);

    I_C_SubscriptionType getC_SubscriptionType() throws RuntimeException;

    /**
     * Get Tax Category. Tax Category
     */
    int getC_TaxCategory_ID();

    /**
     * Set Tax Category. Tax Category
     */
    void setC_TaxCategory_ID(int C_TaxCategory_ID);

    I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Description URL. URL for the description
     */
    String getDescriptionURL();

    /**
     * Set Description URL. URL for the description
     */
    void setDescriptionURL(String DescriptionURL);

    /**
     * Get Discontinued. This product is no longer available
     */
    boolean isDiscontinued();

    /**
     * Set Discontinued. This product is no longer available
     */
    void setDiscontinued(boolean Discontinued);

    /**
     * Get Discontinued At. Discontinued At indicates Date when product was discontinued
     */
    Timestamp getDiscontinuedAt();

    /**
     * Set Discontinued At. Discontinued At indicates Date when product was discontinued
     */
    void setDiscontinuedAt(Timestamp DiscontinuedAt);

    /**
     * Get Document Note. Additional information for a Document
     */
    String getDocumentNote();

    /**
     * Set Document Note. Additional information for a Document
     */
    void setDocumentNote(String DocumentNote);

    /**
     * Get Group1
     */
    String getGroup1();

    /**
     * Set Group1
     */
    void setGroup1(String Group1);

    /**
     * Get Group2
     */
    String getGroup2();

    /**
     * Set Group2
     */
    void setGroup2(String Group2);

    /**
     * Get Guarantee Days. Number of days the product is guaranteed or available
     */
    int getGuaranteeDays();

    /**
     * Set Guarantee Days. Number of days the product is guaranteed or available
     */
    void setGuaranteeDays(int GuaranteeDays);

    /**
     * Get Min Guarantee Days. Minimum number of guarantee days
     */
    int getGuaranteeDaysMin();

    /**
     * Set Min Guarantee Days. Minimum number of guarantee days
     */
    void setGuaranteeDaysMin(int GuaranteeDaysMin);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Bill of Materials. Bill of Materials
     */
    void setIsBOM(boolean IsBOM);

    /**
     * Get Bill of Materials. Bill of Materials
     */
    boolean isBOM();

    /**
     * Set Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    void setIsDropShip(boolean IsDropShip);

    /**
     * Get Drop Shipment. Drop Shipments are sent from the Vendor directly to the Customer
     */
    boolean isDropShip();

    /**
     * Set Exclude Auto Delivery. Exclude from automatic Delivery
     */
    void setIsExcludeAutoDelivery(boolean IsExcludeAutoDelivery);

    /**
     * Get Exclude Auto Delivery. Exclude from automatic Delivery
     */
    boolean isExcludeAutoDelivery();

    /**
     * Set Print detail records on invoice . Print detail BOM elements on the invoice
     */
    void setIsInvoicePrintDetails(boolean IsInvoicePrintDetails);

    /**
     * Get Print detail records on invoice . Print detail BOM elements on the invoice
     */
    boolean isInvoicePrintDetails();

    /**
     * Set Kanban controlled. This part is Kanban controlled
     */
    void setIsKanban(boolean IsKanban);

    /**
     * Get Kanban controlled. This part is Kanban controlled
     */
    boolean isKanban();

    /**
     * Set Manufactured. This product is manufactured
     */
    void setIsManufactured(boolean IsManufactured);

    /**
     * Get Manufactured. This product is manufactured
     */
    boolean isManufactured();

    /**
     * Set Own Box
     */
    void setIsOwnBox(boolean IsOwnBox);

    /**
     * Get Own Box
     */
    boolean isOwnBox();

    /**
     * Set Phantom. Phantom Component
     */
    void setIsPhantom(boolean IsPhantom);

    /**
     * Get Phantom. Phantom Component
     */
    boolean isPhantom();

    /**
     * Set Print detail records on pick list. Print detail BOM elements on the pick list
     */
    void setIsPickListPrintDetails(boolean IsPickListPrintDetails);

    /**
     * Get Print detail records on pick list. Print detail BOM elements on the pick list
     */
    boolean isPickListPrintDetails();

    /**
     * Set Purchased. Organization purchases this product
     */
    void setIsPurchased(boolean IsPurchased);

    /**
     * Get Purchased. Organization purchases this product
     */
    boolean isPurchased();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Set Sold. Organization sells this product
     */
    void setIsSold(boolean IsSold);

    /**
     * Get Sold. Organization sells this product
     */
    boolean isSold();

    /**
     * Set Stocked. Organization stocks this product
     */
    void setIsStocked(boolean IsStocked);

    /**
     * Get Stocked. Organization stocks this product
     */
    boolean isStocked();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Set Verified. The BOM configuration has been verified
     */
    void setIsVerified(boolean IsVerified);

    /**
     * Get Verified. The BOM configuration has been verified
     */
    boolean isVerified();

    /**
     * Set Featured in Web Store. If selected, the product is displayed in the initial or any empty
     * search
     */
    void setIsWebStoreFeatured(boolean IsWebStoreFeatured);

    /**
     * Get Featured in Web Store. If selected, the product is displayed in the initial or any empty
     * search
     */
    boolean isWebStoreFeatured();

    /**
     * Get Low Level. The Low Level is used to calculate the material plan and determines if a net
     * requirement should be exploited
     */
    int getLowLevel();

    /**
     * Set Low Level. The Low Level is used to calculate the material plan and determines if a net
     * requirement should be exploited
     */
    void setLowLevel(int LowLevel);

    /**
     * Set Attribute Set. Product Attribute Set
     */
    void setM_AttributeSet_ID(int M_AttributeSet_ID);

    /**
     * Get Attribute Set. Product Attribute Set
     */
    int getMAttributeSet_ID();

    I_M_AttributeSet getMAttributeSet() throws RuntimeException;

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Freight Category. Category of the Freight
     */
    int getM_FreightCategory_ID();

    /**
     * Set Freight Category. Category of the Freight
     */
    void setM_FreightCategory_ID(int M_FreightCategory_ID);

    I_M_FreightCategory getM_FreightCategory() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

    /**
     * Get Part Type
     */
    int getM_PartType_ID();

    /**
     * Set Part Type
     */
    void setM_PartType_ID(int M_PartType_ID);

    I_M_PartType getM_PartType() throws RuntimeException;

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
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    /**
     * Get M_Product_UU
     */
    String getM_Product_UU();

    /**
     * Set M_Product_UU
     */
    void setM_Product_UU(String M_Product_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Product Type. Type of product
     */
    String getProductType();

    /**
     * Set Product Type. Type of product
     */
    void setProductType(String ProductType);

    /**
     * Get Mail Template. Text templates for mailings
     */
    int getR_MailText_ID();

    /**
     * Set Mail Template. Text templates for mailings
     */
    void setR_MailText_ID(int R_MailText_ID);

    I_R_MailText getR_MailText() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Expense Type. Expense report type
     */
    int getS_ExpenseType_ID();

    /**
     * Set Expense Type. Expense report type
     */
    void setS_ExpenseType_ID(int S_ExpenseType_ID);

    I_S_ExpenseType getS_ExpenseType() throws RuntimeException;

    /**
     * Get Shelf Depth. Shelf depth required
     */
    int getShelfDepth();

    /**
     * Set Shelf Depth. Shelf depth required
     */
    void setShelfDepth(int ShelfDepth);

    /**
     * Get Shelf Height. Shelf height required
     */
    BigDecimal getShelfHeight();

    /**
     * Set Shelf Height. Shelf height required
     */
    void setShelfHeight(BigDecimal ShelfHeight);

    /**
     * Get Shelf Width. Shelf width required
     */
    int getShelfWidth();

    /**
     * Set Shelf Width. Shelf width required
     */
    void setShelfWidth(int ShelfWidth);

    /**
     * Get SKU. Stock Keeping Unit
     */
    String getSKU();

    /**
     * Set SKU. Stock Keeping Unit
     */
    void setSKU(String SKU);

    /**
     * Get Resource. Resource
     */
    int getS_Resource_ID();

    /**
     * Set Resource. Resource
     */
    void setS_Resource_ID(int S_Resource_ID);

    I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get UnitsPerPack. The Units Per Pack indicates the no of units of a product packed together.
     */
    int getUnitsPerPack();

    /**
     * Set UnitsPerPack. The Units Per Pack indicates the no of units of a product packed together.
     */
    void setUnitsPerPack(int UnitsPerPack);

    /**
     * Get Units Per Pallet. Units Per Pallet
     */
    BigDecimal getUnitsPerPallet();

    /**
     * Set Units Per Pallet. Units Per Pallet
     */
    void setUnitsPerPallet(BigDecimal UnitsPerPallet);

    /**
     * Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    String getUPC();

    /**
     * Set UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number)
     */
    void setUPC(String UPC);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Version No. Version Number
     */
    String getVersionNo();

    /**
     * Set Version No. Version Number
     */
    void setVersionNo(String VersionNo);

    /**
     * Get Volume. Volume of a product
     */
    BigDecimal getVolume();

    /**
     * Set Volume. Volume of a product
     */
    void setVolume(BigDecimal Volume);

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);

    int getUOMPrecision();

    boolean isItem();
}
