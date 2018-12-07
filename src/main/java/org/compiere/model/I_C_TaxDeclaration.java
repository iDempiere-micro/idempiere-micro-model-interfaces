package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxDeclaration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxDeclaration {

    /**
     * TableName=C_TaxDeclaration
     */
    String Table_Name = "C_TaxDeclaration";

    /**
     * AD_Table_ID=818
     */
    int Table_ID = 818;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_TaxDeclaration_ID
     */
    String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
    /**
     * Column name C_TaxDeclaration_UU
     */
    String COLUMNNAME_C_TaxDeclaration_UU = "C_TaxDeclaration_UU";
    /**
     * Column name DateFrom
     */
    String COLUMNNAME_DateFrom = "DateFrom";
    /**
     * Column name DateTo
     */
    String COLUMNNAME_DateTo = "DateTo";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax Declaration. Define the declaration to the tax authorities
     */
    int getC_TaxDeclaration_ID();

    /**
     * Set Tax Declaration. Define the declaration to the tax authorities
     */
    void setC_TaxDeclaration_ID(int C_TaxDeclaration_ID);

    /**
     * Get C_TaxDeclaration_UU
     */
    String getC_TaxDeclaration_UU();

    /**
     * Set C_TaxDeclaration_UU
     */
    void setC_TaxDeclaration_UU(String C_TaxDeclaration_UU);

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
     * Get Transaction Date. Transaction Date
     */
    Timestamp getDateTrx();

    /**
     * Set Transaction Date. Transaction Date
     */
    void setDateTrx(Timestamp DateTrx);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

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
}
