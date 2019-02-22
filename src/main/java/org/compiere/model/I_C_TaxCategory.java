package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_TaxCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxCategory extends IPO {

    /**
     * TableName=C_TaxCategory
     */
    String Table_Name = "C_TaxCategory";

    /**
     * AD_Table_ID=252
     */
    int Table_ID = 252;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name CommodityCode
     */
    String COLUMNNAME_CommodityCode = "CommodityCode";
    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
    /**
     * Column name C_TaxCategory_UU
     */
    String COLUMNNAME_C_TaxCategory_UU = "C_TaxCategory_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Tax Category. Tax Category
     */
    int getC_TaxCategory_ID();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

}
