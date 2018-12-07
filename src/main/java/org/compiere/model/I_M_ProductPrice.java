package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductPrice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductPrice {

    /**
     * TableName=M_ProductPrice
     */
    String Table_Name = "M_ProductPrice";

    /**
     * AD_Table_ID=251
     */
    int Table_ID = 251;

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_ProductPrice_ID
     */
    String COLUMNNAME_M_ProductPrice_ID = "M_ProductPrice_ID";
    /**
     * Column name M_ProductPrice_UU
     */
    String COLUMNNAME_M_ProductPrice_UU = "M_ProductPrice_UU";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Product Price. Intersection between a Product and a Price List Version
     */
    int getM_ProductPrice_ID();

    /**
     * Set Product Price. Intersection between a Product and a Price List Version
     */
    void setM_ProductPrice_ID(int M_ProductPrice_ID);

    /**
     * Get M_ProductPrice_UU
     */
    String getM_ProductPrice_UU();

    /**
     * Set M_ProductPrice_UU
     */
    void setM_ProductPrice_UU(String M_ProductPrice_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
