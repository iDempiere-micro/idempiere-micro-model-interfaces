package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Conversion_Rate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Conversion_Rate {

    /**
     * TableName=C_Conversion_Rate
     */
    String Table_Name = "C_Conversion_Rate";

    /**
     * AD_Table_ID=140
     */
    int Table_ID = 140;

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
     * Column name C_Conversion_Rate_UU
     */
    String COLUMNNAME_C_Conversion_Rate_UU = "C_Conversion_Rate_UU";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DivideRate
     */
    String COLUMNNAME_DivideRate = "DivideRate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MultiplyRate
     */
    String COLUMNNAME_MultiplyRate = "MultiplyRate";
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

    /**
     * Get C_Conversion_Rate_UU
     */
    String getC_Conversion_Rate_UU();

    /**
     * Set C_Conversion_Rate_UU
     */
    void setC_Conversion_Rate_UU(String C_Conversion_Rate_UU);

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Divide Rate. To convert Source number to Target number, the Source is divided
     */
    BigDecimal getDivideRate();

    /**
     * Set Divide Rate. To convert Source number to Target number, the Source is divided
     */
    void setDivideRate(BigDecimal DivideRate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    BigDecimal getMultiplyRate();

    /**
     * Set Multiply Rate. Rate to multiple the source by to calculate the target.
     */
    void setMultiplyRate(BigDecimal MultiplyRate);

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
