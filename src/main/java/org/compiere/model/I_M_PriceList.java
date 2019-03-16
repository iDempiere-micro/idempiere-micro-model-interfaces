package org.compiere.model;

import org.idempiere.icommon.model.IPO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.sql.Timestamp;

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

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name BasePriceList_ID
     */
    String COLUMNNAME_BasePriceList_ID = "BasePriceList_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EnforcePriceLimit
     */
    String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
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
     * Column name PricePrecision
     */
    String COLUMNNAME_PricePrecision = "PricePrecision";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

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
    int getPriceListId();

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

    @Nullable
    I_M_PriceList_Version getPriceListVersion(@NotNull Timestamp now);
}
