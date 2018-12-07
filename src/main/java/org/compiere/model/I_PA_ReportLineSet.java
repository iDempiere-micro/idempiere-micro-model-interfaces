package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_ReportLineSet
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ReportLineSet {

    /**
     * TableName=PA_ReportLineSet
     */
    String Table_Name = "PA_ReportLineSet";

    /**
     * AD_Table_ID=449
     */
    int Table_ID = 449;

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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PA_ReportLineSet_ID
     */
    String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
    /**
     * Column name PA_ReportLineSet_UU
     */
    String COLUMNNAME_PA_ReportLineSet_UU = "PA_ReportLineSet_UU";
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
     * Get Report Line Set
     */
    int getPA_ReportLineSet_ID();

    /**
     * Set Report Line Set
     */
    void setPA_ReportLineSet_ID(int PA_ReportLineSet_ID);

    /**
     * Get PA_ReportLineSet_UU
     */
    String getPA_ReportLineSet_UU();

    /**
     * Set PA_ReportLineSet_UU
     */
    void setPA_ReportLineSet_UU(String PA_ReportLineSet_UU);

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
