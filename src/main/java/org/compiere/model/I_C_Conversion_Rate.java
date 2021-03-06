package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_Conversion_Rate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Conversion_Rate {

    /**
     * AD_Table_ID=140
     */
    int Table_ID = 140;

    /**
     * TableName=C_Conversion_Rate
     */
    String Table_Name = "C_Conversion_Rate";

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name C_Conversion_Rate_ID
     */
    String COLUMNNAME_C_Conversion_Rate_ID = "C_Conversion_Rate_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Currency_ID_To
     */
    String COLUMNNAME_C_Currency_ID_To = "C_Currency_ID_To";
    /**
     * Column name DivideRate
     */
    String COLUMNNAME_DivideRate = "DivideRate";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Conversion Rate. Rate used for converting currencies
     */
    int getConversionRateId();

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setConversionTypeId(int C_ConversionType_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Get Currency To. Target currency
     */
    int getTargetCurrencyId();

    /**
     * Set Currency To. Target currency
     */
    void setTargetCurrencyId(int C_Currency_ID_To);

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Divide Rate. To convert Source number to Target number, the Source is divided
     */
    void setDivideRate(BigDecimal DivideRate);

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);
}
