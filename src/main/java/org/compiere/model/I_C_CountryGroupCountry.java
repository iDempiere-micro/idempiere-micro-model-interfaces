package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CountryGroupCountry
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CountryGroupCountry {

    /**
     * TableName=C_CountryGroupCountry
     */
    String Table_Name = "C_CountryGroupCountry";

    /**
     * AD_Table_ID=200145
     */
    int Table_ID = 200145;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_CountryGroupCountry_ID
     */
    String COLUMNNAME_C_CountryGroupCountry_ID = "C_CountryGroupCountry_ID";
    /**
     * Column name C_CountryGroupCountry_UU
     */
    String COLUMNNAME_C_CountryGroupCountry_UU = "C_CountryGroupCountry_UU";
    /**
     * Column name C_CountryGroup_ID
     */
    String COLUMNNAME_C_CountryGroup_ID = "C_CountryGroup_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateFrom
     */
    String COLUMNNAME_DateFrom = "DateFrom";
    /**
     * Column name DateTo
     */
    String COLUMNNAME_DateTo = "DateTo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Country on Country Group
     */
    int getC_CountryGroupCountry_ID();

    /**
     * Set Country on Country Group
     */
    void setC_CountryGroupCountry_ID(int C_CountryGroupCountry_ID);

    /**
     * Get C_CountryGroupCountry_UU
     */
    String getC_CountryGroupCountry_UU();

    /**
     * Set C_CountryGroupCountry_UU
     */
    void setC_CountryGroupCountry_UU(String C_CountryGroupCountry_UU);

    /**
     * Get Country Group
     */
    int getC_CountryGroup_ID();

    /**
     * Set Country Group
     */
    void setC_CountryGroup_ID(int C_CountryGroup_ID);

    I_C_CountryGroup getC_CountryGroup() throws RuntimeException;

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Set Country. Country
     */
    void setC_Country_ID(int C_Country_ID);

    I_C_Country getC_Country() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date From. Starting date for a range
     */
    Timestamp getDateFrom();

    /**
     * Set Date From. Starting date for a range
     */
    void setDateFrom(Timestamp DateFrom);

    /**
     * Get Date To. End date of a date range
     */
    Timestamp getDateTo();

    /**
     * Set Date To. End date of a date range
     */
    void setDateTo(Timestamp DateTo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
