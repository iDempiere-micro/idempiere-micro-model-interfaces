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

    /** Load Meta Data */

    /**
     * Column name C_UOM_Conversion_ID
     */
    String COLUMNNAME_C_UOM_Conversion_ID = "C_UOM_Conversion_ID";
    /**
     * Column name C_UOM_Conversion_UU
     */
    String COLUMNNAME_C_UOM_Conversion_UU = "C_UOM_Conversion_UU";
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
     * Get UOM Conversion. Unit of Measure Conversion
     */
    int getC_UOM_Conversion_ID();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    /**
     * Get UoM To. Target or destination Unit of Measure
     */
    int getC_UOM_To_ID();

    /**
     * Set UoM To. Target or destination Unit of Measure
     */
    void setC_UOM_To_ID(int C_UOM_To_ID);

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
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

}
