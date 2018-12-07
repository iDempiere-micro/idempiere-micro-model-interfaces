package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_Conversion_Rate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Conversion_Rate {

    /**
     * TableName=I_Conversion_Rate
     */
    String Table_Name = "I_Conversion_Rate";

    /**
     * AD_Table_ID=641
     */
    int Table_ID = 641;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name ConversionTypeValue
     */
    String COLUMNNAME_ConversionTypeValue = "ConversionTypeValue";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name I_Conversion_Rate_UU
     */
    String COLUMNNAME_I_Conversion_Rate_UU = "I_Conversion_Rate_UU";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ISO_Code
     */
    String COLUMNNAME_ISO_Code = "ISO_Code";
    /**
     * Column name ISO_Code_To
     */
    String COLUMNNAME_ISO_Code_To = "ISO_Code_To";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Conversion Rate. Rate used for converting currencies
     */
    int getC_Conversion_Rate_ID();

    /**
     * Set Conversion Rate. Rate used for converting currencies
     */
    void setC_Conversion_Rate_ID(int C_Conversion_Rate_ID);

    I_C_Conversion_Rate getC_Conversion_Rate() throws RuntimeException;

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getC_ConversionType_ID();

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setC_ConversionType_ID(int C_ConversionType_ID);

    I_C_ConversionType getC_ConversionType() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Currency To. Target currency
     */
    int getC_Currency_ID_To();

    /**
     * Set Currency To. Target currency
     */
    void setC_Currency_ID_To(int C_Currency_ID_To);

    I_C_Currency getC_Currency_To() throws RuntimeException;

    /**
     * Get Currency Type Key. Key value for the Currency Conversion Rate Type
     */
    String getConversionTypeValue();

    /**
     * Set Currency Type Key. Key value for the Currency Conversion Rate Type
     */
    void setConversionTypeValue(String ConversionTypeValue);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create Reciprocal Rate. Create Reciprocal Rate from current information
     */
    boolean isCreateReciprocalRate();

    /**
     * Set Create Reciprocal Rate. Create Reciprocal Rate from current information
     */
    void setCreateReciprocalRate(boolean CreateReciprocalRate);

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Divide Rate. To convert Source number to Target number, the Source is divided
     */
    void setDivideRate(BigDecimal DivideRate);

    /**
     * Get Import Conversion Rate. Import Currency Conversion Rate
     */
    int getI_Conversion_Rate_ID();

    /**
     * Set Import Conversion Rate. Import Currency Conversion Rate
     */
    void setI_Conversion_Rate_ID(int I_Conversion_Rate_ID);

    /**
     * Get I_Conversion_Rate_UU
     */
    String getI_Conversion_Rate_UU();

    /**
     * Set I_Conversion_Rate_UU
     */
    void setI_Conversion_Rate_UU(String I_Conversion_Rate_UU);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported. Has this import been processed
     */
    boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    String getISO_Code();

    /**
     * Set ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    void setISO_Code(String ISO_Code);

    /**
     * Get ISO Currency To Code. Three letter ISO 4217 Code of the To Currency
     */
    String getISO_Code_To();

    /**
     * Set ISO Currency To Code. Three letter ISO 4217 Code of the To Currency
     */
    void setISO_Code_To(String ISO_Code_To);

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

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
