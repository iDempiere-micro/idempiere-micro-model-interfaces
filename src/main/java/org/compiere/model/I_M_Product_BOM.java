package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Product_BOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_BOM {

    /**
     * TableName=M_Product_BOM
     */
    String Table_Name = "M_Product_BOM";

    /**
     * AD_Table_ID=383
     */
    int Table_ID = 383;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name BOMQty
     */
    String COLUMNNAME_BOMQty = "BOMQty";
    /**
     * Column name BOMType
     */
    String COLUMNNAME_BOMType = "BOMType";
    /**
     * Column name CostStandard
     */
    String COLUMNNAME_CostStandard = "CostStandard";
    /**
     * Column name CostStandardCumAmt
     */
    String COLUMNNAME_CostStandardCumAmt = "CostStandardCumAmt";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsBillOfMaterial
     */
    String COLUMNNAME_IsBillOfMaterial = "IsBillOfMaterial";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_PartType_ID
     */
    String COLUMNNAME_M_PartType_ID = "M_PartType_ID";
    /**
     * Column name M_Product_BOM_ID
     */
    String COLUMNNAME_M_Product_BOM_ID = "M_Product_BOM_ID";
    /**
     * Column name M_ProductBOM_ID
     */
    String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
    /**
     * Column name M_Product_BOM_UU
     */
    String COLUMNNAME_M_Product_BOM_UU = "M_Product_BOM_UU";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get BOM Quantity. Bill of Materials Quantity
     */
    BigDecimal getBOMQty();

    /**
     * Set BOM Quantity. Bill of Materials Quantity
     */
    void setBOMQty(BigDecimal BOMQty);

    /**
     * Get BOM Type. Type of BOM
     */
    String getBOMType();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Part Type
     */
    int getM_PartType_ID();

    /**
     * Get BOM Line
     */
    int getM_Product_BOM_ID();

    /**
     * Get BOM Product. Bill of Material Component Product
     */
    int getM_ProductBOM_ID();

    /**
     * Set BOM Product. Bill of Material Component Product
     */
    void setM_ProductBOM_ID(int M_ProductBOM_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

}
