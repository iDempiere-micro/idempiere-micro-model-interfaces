package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for RV_WarehousePrice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_RV_WarehousePrice {

    /**
     * TableName=RV_WarehousePrice
     */
    String Table_Name = "RV_WarehousePrice";

    /**
     * AD_Table_ID=639
     */
    int Table_ID = 639;

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsInstanceAttribute
     */
    String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
    /**
     * Column name Margin
     */
    String COLUMNNAME_Margin = "Margin";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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
     * Column name QtyAvailable
     */
    String COLUMNNAME_QtyAvailable = "QtyAvailable";
    /**
     * Column name QtyOnHand
     */
    String COLUMNNAME_QtyOnHand = "QtyOnHand";
    /**
     * Column name QtyOrdered
     */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name QtyReserved
     */
    String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name SKU
     */
    String COLUMNNAME_SKU = "SKU";
    /**
     * Column name UOMSymbol
     */
    String COLUMNNAME_UOMSymbol = "UOMSymbol";
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
     * Column name WarehouseName
     */
    String COLUMNNAME_WarehouseName = "WarehouseName";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
     * or Guarantee Date)
     */
    void setIsInstanceAttribute(boolean IsInstanceAttribute);

    /**
     * Get Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
     * or Guarantee Date)
     */
    boolean isInstanceAttribute();

    /**
     * Get Margin %. Margin for a product as a percentage
     */
    BigDecimal getMargin();

    /**
     * Set Margin %. Margin for a product as a percentage
     */
    void setMargin(BigDecimal Margin);

    /**
     * Get Price List Version. Identifies a unique instance of a Price List
     */
    int getM_PriceList_Version_ID();

    /**
     * Set Price List Version. Identifies a unique instance of a Price List
     */
    void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

    I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException;

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Limit Price. Lowest price for a product
     */
    BigDecimal getPriceLimit();

    /**
     * Set Limit Price. Lowest price for a product
     */
    void setPriceLimit(BigDecimal PriceLimit);

    /**
     * Get List Price. List Price
     */
    BigDecimal getPriceList();

    /**
     * Set List Price. List Price
     */
    void setPriceList(BigDecimal PriceList);

    /**
     * Get Standard Price. Standard Price
     */
    BigDecimal getPriceStd();

    /**
     * Set Standard Price. Standard Price
     */
    void setPriceStd(BigDecimal PriceStd);

    /**
     * Get Available Quantity. Available Quantity (On Hand - Reserved)
     */
    BigDecimal getQtyAvailable();

    /**
     * Set Available Quantity. Available Quantity (On Hand - Reserved)
     */
    void setQtyAvailable(BigDecimal QtyAvailable);

    /**
     * Get On Hand Quantity. On Hand Quantity
     */
    BigDecimal getQtyOnHand();

    /**
     * Set On Hand Quantity. On Hand Quantity
     */
    void setQtyOnHand(BigDecimal QtyOnHand);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    BigDecimal getQtyOrdered();

    /**
     * Set Ordered Quantity. Ordered Quantity
     */
    void setQtyOrdered(BigDecimal QtyOrdered);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get SKU. Stock Keeping Unit
     */
    String getSKU();

    /**
     * Set SKU. Stock Keeping Unit
     */
    void setSKU(String SKU);

    /**
     * Get Symbol. Symbol for a Unit of Measure
     */
    String getUOMSymbol();

    /**
     * Set Symbol. Symbol for a Unit of Measure
     */
    void setUOMSymbol(String UOMSymbol);

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
     * Get Warehouse. Warehouse Name
     */
    String getWarehouseName();

    /**
     * Set Warehouse. Warehouse Name
     */
    void setWarehouseName(String WarehouseName);
}
