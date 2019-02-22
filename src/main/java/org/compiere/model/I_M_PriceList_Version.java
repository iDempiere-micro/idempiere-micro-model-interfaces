package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_PriceList_Version
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PriceList_Version extends IPO {

    /**
     * TableName=M_PriceList_Version
     */
    String Table_Name = "M_PriceList_Version";

    /**
     * AD_Table_ID=295
     */
    int Table_ID = 295;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name M_DiscountSchema_ID
     */
    String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Pricelist_Version_Base_ID
     */
    String COLUMNNAME_M_Pricelist_Version_Base_ID = "M_Pricelist_Version_Base_ID";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
    /**
     * Column name M_PriceList_Version_UU
     */
    String COLUMNNAME_M_PriceList_Version_UU = "M_PriceList_Version_UU";
    /**
     * Column name ProcCreate
     */
    String COLUMNNAME_ProcCreate = "ProcCreate";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Discount Schema. Schema to calculate the trade discount percentage
     */
    int getM_DiscountSchema_ID();

    /**
     * Set Discount Schema. Schema to calculate the trade discount percentage
     */
    void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

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
     * Get Base Price List. Source for Price list calculations
     */
    int getM_Pricelist_Version_Base_ID();

    /**
     * Get Price List Version. Identifies a unique instance of a Price List
     */
    int getM_PriceList_Version_ID();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);
}
