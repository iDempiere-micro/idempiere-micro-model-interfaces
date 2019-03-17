package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_UOM_Conversion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_UOM_Conversion {

    /**
     * TableName=C_UOM_Conversion
     */
    String Table_Name = "C_UOM_Conversion";

    /**
     * AD_Table_ID=175
     */
    int Table_ID = 175;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name C_UOM_Conversion_ID
     */
    String COLUMNNAME_C_UOM_Conversion_ID = "C_UOM_Conversion_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name C_UOM_To_ID
     */
    String COLUMNNAME_C_UOM_To_ID = "C_UOM_To_ID";
    /**
     * Column name DivideRate
     */
    String COLUMNNAME_DivideRate = "DivideRate";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";

    /**
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    /**
     * Get UoM To. Target or destination Unit of Measure
     */
    int getUOM_ToId();

    /**
     * Set UoM To. Target or destination Unit of Measure
     */
    void setUOM_ToId(int C_UOM_To_ID);

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Divide Rate. To convert Source number to Target number, the Source is divided
     */
    void setDivideRate(BigDecimal DivideRate);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

}
