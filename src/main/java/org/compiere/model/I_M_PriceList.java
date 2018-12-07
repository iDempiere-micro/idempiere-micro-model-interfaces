package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Generated Interface for M_PriceList
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PriceList extends IPO {

    /**
     * TableName=M_PriceList
     */
    String Table_Name = "M_PriceList";

    /**
     * AD_Table_ID=255
     */
    int Table_ID = 255;

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
     * Column name BasePriceList_ID
     */
    String COLUMNNAME_BasePriceList_ID = "BasePriceList_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EnforcePriceLimit
     */
    String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsMandatory
     */
    String COLUMNNAME_IsMandatory = "IsMandatory";
    /**
     * Column name isPresentForProduct
     */
    String COLUMNNAME_isPresentForProduct = "isPresentForProduct";
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
     * Column name M_PriceList_UU
     */
    String COLUMNNAME_M_PriceList_UU = "M_PriceList_UU";
    /**
     * Column name PricePrecision
     */
    String COLUMNNAME_PricePrecision = "PricePrecision";
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
     * Get Base Pricelist. Pricelist to be used, if product not found on this pricelist
     */
    int getBasePriceList_ID();

    /**
     * Set Base Pricelist. Pricelist to be used, if product not found on this pricelist
     */
    void setBasePriceList_ID(int BasePriceList_ID);

    I_M_PriceList getBasePriceList() throws RuntimeException;

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Mandatory. Data entry is required in this column
     */
    void setIsMandatory(boolean IsMandatory);

    /**
     * Get Mandatory. Data entry is required in this column
     */
    boolean isMandatory();

    /**
     * Set isPresentForProduct
     */
    void setisPresentForProduct(boolean isPresentForProduct);

    /**
     * Get isPresentForProduct
     */
    boolean isPresentForProduct();

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

    /**
     * Get M_PriceList_UU
     */
    String getM_PriceList_UU();

    /**
     * Set M_PriceList_UU
     */
    void setM_PriceList_UU(String M_PriceList_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Price Precision. Precision (number of decimals) for the Price
     */
    int getPricePrecision();

    /**
     * Set Price Precision. Precision (number of decimals) for the Price
     */
    void setPricePrecision(int PricePrecision);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    @Nullable
    I_M_PriceList_Version getPriceListVersion(@NotNull Timestamp now);
}
