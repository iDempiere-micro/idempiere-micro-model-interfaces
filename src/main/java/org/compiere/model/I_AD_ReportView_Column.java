package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReportView_Column
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReportView_Column {

    /**
     * TableName=AD_ReportView_Column
     */
    String Table_Name = "AD_ReportView_Column";

    /**
     * AD_Table_ID=200109
     */
    int Table_ID = 200109;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_ReportView_Column_UU
     */
    String COLUMNNAME_AD_ReportView_Column_UU = "AD_ReportView_Column_UU";
    /**
     * Column name AD_ReportView_ID
     */
    String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Column. Column in the table
     */
    int getAD_Column_ID();

    /**
     * Set Column. Column in the table
     */
    void setAD_Column_ID(int AD_Column_ID);

    I_AD_Column getAD_Column() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get AD_ReportView_Column_UU
     */
    String getAD_ReportView_Column_UU();

    /**
     * Set AD_ReportView_Column_UU
     */
    void setAD_ReportView_Column_UU(String AD_ReportView_Column_UU);

    /**
     * Get Report View. View used to generate this report
     */
    int getAD_ReportView_ID();

    /**
     * Set Report View. View used to generate this report
     */
    void setAD_ReportView_ID(int AD_ReportView_ID);

    I_AD_ReportView getAD_ReportView() throws RuntimeException;

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
