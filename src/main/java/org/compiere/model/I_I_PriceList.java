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

    /**
     * TableName=I_PriceList
     */
    String Table_Name = "I_PriceList";

    /**
     * AD_Table_ID=53173
     */
    int Table_ID = 53173;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BPartner_Value
     */
    String COLUMNNAME_BPartner_Value = "BPartner_Value";
    /**
     * Column name BreakValue
     */
    String COLUMNNAME_BreakValue = "BreakValue";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EnforcePriceLimit
     */
    String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name I_PriceList_ID
     */
    String COLUMNNAME_I_PriceList_ID = "I_PriceList_ID";
    /**
     * Column name I_PriceList_UU
     */
    String COLUMNNAME_I_PriceList_UU = "I_PriceList_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ISO_Code
     */
    String COLUMNNAME_ISO_Code = "ISO_Code";
    /**
     * Column name IsSOPriceList
     */
    String COLUMNNAME_IsSOPriceList = "IsSOPriceList";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
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
     * Column name PricePrecision
     */
    String COLUMNNAME_PricePrecision = "PricePrecision";
    /**
     * Column name PriceStd
     */
    String COLUMNNAME_PriceStd = "PriceStd";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductValue
     */
    String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name X12DE355
     */
    String COLUMNNAME_X12DE355 = "X12DE355";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner Key. The Key of the Business Partner
     */
    String getBPartner_Value();

    /**
     * Set Business Partner Key. The Key of the Business Partner
     */
    void setBPartner_Value(String BPartner_Value);

    /**
     * Get Break Value. Low Value of trade discount break level
     */
    BigDecimal getBreakValue();

    /**
     * Set Break Value. Low Value of trade discount break level
     */
    void setBreakValue(BigDecimal BreakValue);

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Enforce price limit. Do not allow prices below the limit price
     */
    boolean isEnforcePriceLimit();

    /**
     * Set Enforce price limit. Do not allow prices below the limit price
     */
    void setEnforcePriceLimit(boolean EnforcePriceLimit);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported. Has this import been processed
     */
    boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Import Price List
     */
    int getI_PriceList_ID();

    /**
     * Set Import Price List
     */
    void setI_PriceList_ID(int I_PriceList_ID);

    /**
     * Get I_PriceList_UU
     */
    String getI_PriceList_UU();

    /**
     * Set I_PriceList_UU
     */
    void setI_PriceList_UU(String I_PriceList_UU);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    String getISO_Code();

    /**
     * Set ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    void setISO_Code(String ISO_Code);

    /**
     * Set Sales Price list. This is a Sales Price List
     */
    void setIsSOPriceList(boolean IsSOPriceList);

    /**
     * Get Sales Price list. This is a Sales Price List
     */
    boolean isSOPriceList();

    /**
     * Set Price includes Tax. Tax is included in the price
     */
    void setIsTaxIncluded(boolean IsTaxIncluded);

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getM_PriceList_ID();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setM_PriceList_ID(int M_PriceList_ID);

    I_M_PriceList getM_PriceList() throws RuntimeException;

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
     * Get Price Precision. Precision (number of decimals) for the Price
     */
    int getPricePrecision();

    /**
     * Set Price Precision. Precision (number of decimals) for the Price
     */
    void setPricePrecision(int PricePrecision);

    /**
     * Get Standard Price. Standard Price
     */
    BigDecimal getPriceStd();

    /**
     * Set Standard Price. Standard Price
     */
    void setPriceStd(BigDecimal PriceStd);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Product Key. Key of the Product
     */
    String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    void setProductValue(String ProductValue);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get UOM Code. UOM EDI X12 Code
     */
    String getX12DE355();

    /**
     * Set UOM Code. UOM EDI X12 Code
     */
    void setX12DE355(String X12DE355);
}
