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
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Discount Schema. Schema to calculate the trade discount percentage
     */
    void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setPriceListId(int M_PriceList_ID);

    I_M_PriceList getPriceList() throws RuntimeException;

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
