package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Year
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Year {

    /**
     * TableName=C_Year
     */
    String Table_Name = "C_Year";

    /**
     * AD_Table_ID=177
     */
    int Table_ID = 177;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Year_ID
     */
    String COLUMNNAME_C_Year_ID = "C_Year_ID";
    /**
     * Column name C_Year_UU
     */
    String COLUMNNAME_C_Year_UU = "C_Year_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name FiscalYear
     */
    String COLUMNNAME_FiscalYear = "FiscalYear";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

    /**
     * Set Calendar. Accounting Calendar Name
     */
    void setC_Calendar_ID(int C_Calendar_ID);

    I_C_Calendar getC_Calendar() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Year. Calendar Year
     */
    int getC_Year_ID();

    /**
     * Set Year. Calendar Year
     */
    void setC_Year_ID(int C_Year_ID);

    /**
     * Get C_Year_UU
     */
    String getC_Year_UU();

    /**
     * Set C_Year_UU
     */
    void setC_Year_UU(String C_Year_UU);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Year. The Fiscal Year
     */
    String getFiscalYear();

    /**
     * Set Year. The Fiscal Year
     */
    void setFiscalYear(String FiscalYear);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
