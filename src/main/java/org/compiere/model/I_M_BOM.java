package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_BOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_BOM {

    /**
     * TableName=M_BOM
     */
    String Table_Name = "M_BOM";

    /**
     * AD_Table_ID=798
     */
    int Table_ID = 798;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name BOMType
     */
    String COLUMNNAME_BOMType = "BOMType";
    /**
     * Column name BOMUse
     */
    String COLUMNNAME_BOMUse = "BOMUse";
    /**
     * Column name M_BOM_ID
     */
    String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /**
     * Get BOM Type. Type of BOM
     */
    String getBOMType();

    /**
     * Set BOM Type. Type of BOM
     */
    void setBOMType(String BOMType);

    /**
     * Get BOM Use. The use of the Bill of Material
     */
    String getBOMUse();

    /**
     * Set BOM Use. The use of the Bill of Material
     */
    void setBOMUse(String BOMUse);

    /**
     * Get BOM. Bill of Material
     */
    int getBOMId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

}
