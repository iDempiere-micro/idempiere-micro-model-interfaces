package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Table_Detail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Table_Detail {

    /**
     * TableName=A_Depreciation_Table_Detail
     */
    String Table_Name = "A_Depreciation_Table_Detail";

    /**
     * AD_Table_ID=53113
     */
    int Table_ID = 53113;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Depreciation_Rate
     */
    String COLUMNNAME_A_Depreciation_Rate = "A_Depreciation_Rate";
    /**
     * Column name A_Depreciation_Table_Code
     */
    String COLUMNNAME_A_Depreciation_Table_Code = "A_Depreciation_Table_Code";
    /**
     * Column name A_Depreciation_Table_Detail_ID
     */
    String COLUMNNAME_A_Depreciation_Table_Detail_ID =
            "A_Depreciation_Table_Detail_ID";
    /**
     * Column name A_Depreciation_Table_Detail_UU
     */
    String COLUMNNAME_A_Depreciation_Table_Detail_UU =
            "A_Depreciation_Table_Detail_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Period
     */
    String COLUMNNAME_A_Period = "A_Period";
    /**
     * Column name A_Table_Rate_Type
     */
    String COLUMNNAME_A_Table_Rate_Type = "A_Table_Rate_Type";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Rate
     */
    BigDecimal getA_Depreciation_Rate();

    /**
     * Set Rate
     */
    void setA_Depreciation_Rate(BigDecimal A_Depreciation_Rate);

    /**
     * Get Depreciation Code
     */
    String getA_Depreciation_Table_Code();

    /**
     * Set Depreciation Code
     */
    void setA_Depreciation_Table_Code(String A_Depreciation_Table_Code);

    /**
     * Get Depreciation Table Detail
     */
    int getA_Depreciation_Table_Detail_ID();

    /**
     * Set Depreciation Table Detail
     */
    void setA_Depreciation_Table_Detail_ID(int A_Depreciation_Table_Detail_ID);

    /**
     * Get A_Depreciation_Table_Detail_UU
     */
    String getA_Depreciation_Table_Detail_UU();

    /**
     * Set A_Depreciation_Table_Detail_UU
     */
    void setA_Depreciation_Table_Detail_UU(String A_Depreciation_Table_Detail_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Asset Period
     */
    int getA_Period();

    /**
     * Set Asset Period
     */
    void setA_Period(int A_Period);

    /**
     * Get Type
     */
    String getA_Table_Rate_Type();

    /**
     * Set Type
     */
    void setA_Table_Rate_Type(String A_Table_Rate_Type);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
