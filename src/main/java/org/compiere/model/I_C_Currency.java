package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Currency
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Currency extends PersistentObject {

    /**
     * TableName=C_Currency
     */
    String Table_Name = "C_Currency";

    /**
     * AD_Table_ID=141
     */
    int Table_ID = 141;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CostingPrecision
     */
    String COLUMNNAME_CostingPrecision = "CostingPrecision";
    /**
     * Column name CurSymbol
     */
    String COLUMNNAME_CurSymbol = "CurSymbol";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsEMUMember
     */
    String COLUMNNAME_IsEMUMember = "IsEMUMember";
    /**
     * Column name IsEuro
     */
    String COLUMNNAME_IsEuro = "IsEuro";
    /**
     * Column name ISO_Code
     */
    String COLUMNNAME_ISO_Code = "ISO_Code";
    /**
     * Column name StdPrecision
     */
    String COLUMNNAME_StdPrecision = "StdPrecision";

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get Costing Precision. Rounding used costing calculations
     */
    int getCostingPrecision();

    /**
     * Set Costing Precision. Rounding used costing calculations
     */
    void setCostingPrecision(int CostingPrecision);

    /**
     * Get Symbol. Symbol of the currency (opt used for printing only)
     */
    String getCurrencySymbol();

    /**
     * Set Symbol. Symbol of the currency (opt used for printing only)
     */
    void setCurrencySymbol(String CurSymbol);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set EMU Member. This currency is member if the European Monetary Union
     */
    void setIsEMUMember(boolean IsEMUMember);

    /**
     * Set The Euro Currency. This currency is the Euro
     */
    void setIsEuro(boolean IsEuro);

    /**
     * Get ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    String getISOCode();

    /**
     * Set ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    void setISOCode(String ISO_Code);

    /**
     * Get Standard Precision. Rule for rounding calculated amounts
     */
    int getStdPrecision();

    /**
     * Set Standard Precision. Rule for rounding calculated amounts
     */
    void setStdPrecision(int StdPrecision);

}
