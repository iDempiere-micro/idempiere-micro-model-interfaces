package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Conversion_Rate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Conversion_Rate {

    /**
     * AD_Table_ID=641
     */
    int Table_ID = 641;

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
     * Column name CreateReciprocalRate
     */
    String COLUMNNAME_CreateReciprocalRate = "CreateReciprocalRate";
    /**
     * Column name DivideRate
     */
    String COLUMNNAME_DivideRate = "DivideRate";
    /**
     * Column name I_Conversion_Rate_ID
     */
    String COLUMNNAME_I_Conversion_Rate_ID = "I_Conversion_Rate_ID";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Set Conversion Rate. Rate used for converting currencies
     */
    void setC_Conversion_Rate_ID(int C_Conversion_Rate_ID);

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getC_ConversionType_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Get Currency To. Target currency
     */
    int getC_Currency_ID_To();

    /**
     * Get Create Reciprocal Rate. Create Reciprocal Rate from current information
     */
    boolean isCreateReciprocalRate();

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

}
