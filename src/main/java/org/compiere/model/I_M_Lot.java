package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Lot
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Lot {

    /**
     * TableName=M_Lot
     */
    String Table_Name = "M_Lot";

    /**
     * AD_Table_ID=557
     */
    int Table_ID = 557;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_LotCtl_ID
     */
    String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
    /**
     * Column name M_Lot_ID
     */
    String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /**
     * Set Lot Control. Product Lot Control
     */
    void setLotControlId(int M_LotCtl_ID);

    /**
     * Get Lot. Product Lot Definition
     */
    int getLotId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

}
