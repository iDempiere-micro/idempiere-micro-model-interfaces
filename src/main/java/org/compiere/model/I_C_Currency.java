package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Currency
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Currency {

    /**
     * TableName=C_Currency
     */
    String Table_Name = "C_Currency";

    /**
     * AD_Table_ID=141
     */
    int Table_ID = 141;

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
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Currency_UU
     */
    String COLUMNNAME_C_Currency_UU = "C_Currency_UU";
    /**
     * Column name CostingPrecision
     */
    String COLUMNNAME_CostingPrecision = "CostingPrecision";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CurSymbol
     */
    String COLUMNNAME_CurSymbol = "CurSymbol";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EMUEntryDate
     */
    String COLUMNNAME_EMUEntryDate = "EMUEntryDate";
    /**
     * Column name EMURate
     */
    String COLUMNNAME_EMURate = "EMURate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name RoundOffFactor
     */
    String COLUMNNAME_RoundOffFactor = "RoundOffFactor";
    /**
     * Column name StdPrecision
     */
    String COLUMNNAME_StdPrecision = "StdPrecision";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get C_Currency_UU
     */
    String getC_Currency_UU();

    /**
     * Set C_Currency_UU
     */
    void setC_Currency_UU(String C_Currency_UU);

    /**
     * Get Costing Precision. Rounding used costing calculations
     */
    int getCostingPrecision();

    /**
     * Set Costing Precision. Rounding used costing calculations
     */
    void setCostingPrecision(int CostingPrecision);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Symbol. Symbol of the currency (opt used for printing only)
     */
    String getCurSymbol();

    /**
     * Set Symbol. Symbol of the currency (opt used for printing only)
     */
    void setCurSymbol(String CurSymbol);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get EMU Entry Date. Date when the currency joined / will join the EMU
     */
    Timestamp getEMUEntryDate();

    /**
     * Set EMU Entry Date. Date when the currency joined / will join the EMU
     */
    void setEMUEntryDate(Timestamp EMUEntryDate);

    /**
     * Get EMU Rate. Official rate to the Euro
     */
    BigDecimal getEMURate();

    /**
     * Set EMU Rate. Official rate to the Euro
     */
    void setEMURate(BigDecimal EMURate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set EMU Member. This currency is member if the European Monetary Union
     */
    void setIsEMUMember(boolean IsEMUMember);

    /**
     * Get EMU Member. This currency is member if the European Monetary Union
     */
    boolean isEMUMember();

    /**
     * Set The Euro Currency. This currency is the Euro
     */
    void setIsEuro(boolean IsEuro);

    /**
     * Get The Euro Currency. This currency is the Euro
     */
    boolean isEuro();

    /**
     * Get ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    String getISO_Code();

    /**
     * Set ISO Currency Code. Three letter ISO 4217 Code of the Currency
     */
    void setISO_Code(String ISO_Code);

    /**
     * Get Round Off Factor. Used to Round Off Payment Amount
     */
    BigDecimal getRoundOffFactor();

    /**
     * Set Round Off Factor. Used to Round Off Payment Amount
     */
    void setRoundOffFactor(BigDecimal RoundOffFactor);

    /**
     * Get Standard Precision. Rule for rounding calculated amounts
     */
    int getStdPrecision();

    /**
     * Set Standard Precision. Rule for rounding calculated amounts
     */
    void setStdPrecision(int StdPrecision);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
