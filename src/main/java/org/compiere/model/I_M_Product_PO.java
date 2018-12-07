package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_PO
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_PO {

    /**
     * TableName=M_Product_PO
     */
    String Table_Name = "M_Product_PO";

    /**
     * AD_Table_ID=210
     */
    int Table_ID = 210;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CostPerOrder
     */
    String COLUMNNAME_CostPerOrder = "CostPerOrder";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DeliveryTime_Actual
     */
    String COLUMNNAME_DeliveryTime_Actual = "DeliveryTime_Actual";
    /**
     * Column name DeliveryTime_Promised
     */
    String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
    /**
     * Column name Discontinued
     */
    String COLUMNNAME_Discontinued = "Discontinued";
    /**
     * Column name DiscontinuedAt
     */
    String COLUMNNAME_DiscontinuedAt = "DiscontinuedAt";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCurrentVendor
     */
    String COLUMNNAME_IsCurrentVendor = "IsCurrentVendor";
    /**
     * Column name Manufacturer
     */
    String COLUMNNAME_Manufacturer = "Manufacturer";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Product_PO_UU
     */
    String COLUMNNAME_M_Product_PO_UU = "M_Product_PO_UU";
    /**
     * Column name Order_Min
     */
    String COLUMNNAME_Order_Min = "Order_Min";
    /**
     * Column name Order_Pack
     */
    String COLUMNNAME_Order_Pack = "Order_Pack";
    /**
     * Column name PriceEffective
     */
    String COLUMNNAME_PriceEffective = "PriceEffective";
    /**
     * Column name PriceLastInv
     */
    String COLUMNNAME_PriceLastInv = "PriceLastInv";
    /**
     * Column name PriceLastPO
     */
    String COLUMNNAME_PriceLastPO = "PriceLastPO";
    /**
     * Column name PriceList
     */
    String COLUMNNAME_PriceList = "PriceList";
    /**
     * Column name PricePO
     */
    String COLUMNNAME_PricePO = "PricePO";
    /**
     * Column name QualityRating
     */
    String COLUMNNAME_QualityRating = "QualityRating";
    /**
     * Column name RoyaltyAmt
     */
    String COLUMNNAME_RoyaltyAmt = "RoyaltyAmt";
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
     * Column name VendorCategory
     */
    String COLUMNNAME_VendorCategory = "VendorCategory";
    /**
     * Column name VendorProductNo
     */
    String COLUMNNAME_VendorProductNo = "VendorProductNo";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Cost per Order. Fixed Cost Per Order
     */
    BigDecimal getCostPerOrder();

    /**
     * Set Cost per Order. Fixed Cost Per Order
     */
    void setCostPerOrder(BigDecimal CostPerOrder);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

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
     * Get Actual Delivery Time. Actual days between order and delivery
     */
    int getDeliveryTime_Actual();

    /**
     * Set Actual Delivery Time. Actual days between order and delivery
     */
    void setDeliveryTime_Actual(int DeliveryTime_Actual);

    /**
     * Get Promised Delivery Time. Promised days between order and delivery
     */
    int getDeliveryTime_Promised();

    /**
     * Set Promised Delivery Time. Promised days between order and delivery
     */
    void setDeliveryTime_Promised(int DeliveryTime_Promised);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Current vendor. Use this Vendor for pricing and stock replenishment
     */
    void setIsCurrentVendor(boolean IsCurrentVendor);

    /**
     * Get Current vendor. Use this Vendor for pricing and stock replenishment
     */
    boolean isCurrentVendor();

    /**
     * Get Manufacturer. Manufacturer of the Product
     */
    String getManufacturer();

    /**
     * Set Manufacturer. Manufacturer of the Product
     */
    void setManufacturer(String Manufacturer);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get M_Product_PO_UU
     */
    String getM_Product_PO_UU();

    /**
     * Set M_Product_PO_UU
     */
    void setM_Product_PO_UU(String M_Product_PO_UU);

    /**
     * Get Minimum Order Qty. Minimum order quantity in UOM
     */
    BigDecimal getOrder_Min();

    /**
     * Set Minimum Order Qty. Minimum order quantity in UOM
     */
    void setOrder_Min(BigDecimal Order_Min);

    /**
     * Get Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    BigDecimal getOrder_Pack();

    /**
     * Set Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    void setOrder_Pack(BigDecimal Order_Pack);

    /**
     * Get Price effective. Effective Date of Price
     */
    Timestamp getPriceEffective();

    /**
     * Set Price effective. Effective Date of Price
     */
    void setPriceEffective(Timestamp PriceEffective);

    /**
     * Get Last Invoice Price. Price of the last invoice for the product
     */
    BigDecimal getPriceLastInv();

    /**
     * Set Last Invoice Price. Price of the last invoice for the product
     */
    void setPriceLastInv(BigDecimal PriceLastInv);

    /**
     * Get Last PO Price. Price of the last purchase order for the product
     */
    BigDecimal getPriceLastPO();

    /**
     * Set Last PO Price. Price of the last purchase order for the product
     */
    void setPriceLastPO(BigDecimal PriceLastPO);

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Set List Price. List Price
     */
    void setPriceList(BigDecimal PriceList);

    /**
     * Get PO Price. Price based on a purchase order
     */
    BigDecimal getPricePO();

    /**
     * Set PO Price. Price based on a purchase order
     */
    void setPricePO(BigDecimal PricePO);

    /**
     * Get Quality Rating. Method for rating vendors
     */
    int getQualityRating();

    /**
     * Set Quality Rating. Method for rating vendors
     */
    void setQualityRating(int QualityRating);

    /**
     * Get Royalty Amount. (Included) Amount for copyright, etc.
     */
    BigDecimal getRoyaltyAmt();

    /**
     * Set Royalty Amount. (Included) Amount for copyright, etc.
     */
    void setRoyaltyAmt(BigDecimal RoyaltyAmt);

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
     * Get Partner Category. Product Category of the Business Partner
     */
    String getVendorCategory();

    /**
     * Set Partner Category. Product Category of the Business Partner
     */
    void setVendorCategory(String VendorCategory);

    /**
     * Get Partner Product Key. Product Key of the Business Partner
     */
    String getVendorProductNo();

    /**
     * Set Partner Product Key. Product Key of the Business Partner
     */
    void setVendorProductNo(String VendorProductNo);
}
