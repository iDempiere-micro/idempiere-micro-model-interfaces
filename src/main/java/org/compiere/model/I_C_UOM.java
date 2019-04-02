package org.compiere.model;

import org.idempiere.icommon.model.INamedPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_UOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_UOM extends INamedPO {

    /**
     * TableName=C_UOM
     */
    String Table_Name = "C_UOM";

    /**
     * AD_Table_ID=146
     */
    int Table_ID = 146;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name CostingPrecision
     */
    String COLUMNNAME_CostingPrecision = "CostingPrecision";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name StdPrecision
     */
    String COLUMNNAME_StdPrecision = "StdPrecision";
    /**
     * Column name UOMSymbol
     */
    String COLUMNNAME_UOMSymbol = "UOMSymbol";
    /**
     * Column name X12DE355
     */
    String COLUMNNAME_X12DE355 = "X12DE355";

    /**
     * Get Costing Precision. Rounding used costing calculations
     */
    int getCostingPrecision();

    /**
     * Set Costing Precision. Rounding used costing calculations
     */
    void setCostingPrecision(int CostingPrecision);

    /**
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Standard Precision. Rule for rounding calculated amounts
     */
    int getStdPrecision();

    /**
     * Set Standard Precision. Rule for rounding calculated amounts
     */
    void setStdPrecision(int StdPrecision);

    /**
     * Get UOM Code. UOM EDI X12 Code
     */
    String getX12DE355();

    /**
     * Get Symbol.
     * Symbol for a Unit of Measure
     */
    String getUOMSymbol();

    /**
     * Set Symbol.
     * Symbol for a Unit of Measure
     */
    void setUOMSymbol(String UOMSymbol);
}
