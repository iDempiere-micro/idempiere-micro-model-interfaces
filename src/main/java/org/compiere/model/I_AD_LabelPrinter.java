package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_LabelPrinter
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_LabelPrinter {

    /**
     * TableName=AD_LabelPrinter
     */
    String Table_Name = "AD_LabelPrinter";

    /**
     * AD_Table_ID=626
     */
    int Table_ID = 626;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_LabelPrinter_ID
     */
    String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
    /**
     * Column name AD_LabelPrinter_UU
     */
    String COLUMNNAME_AD_LabelPrinter_UU = "AD_LabelPrinter_UU";
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
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Label printer. Label Printer Definition
     */
    int getAD_LabelPrinter_ID();

    /**
     * Set Label printer. Label Printer Definition
     */
    void setAD_LabelPrinter_ID(int AD_LabelPrinter_ID);

    /**
     * Get AD_LabelPrinter_UU
     */
    String getAD_LabelPrinter_UU();

    /**
     * Set AD_LabelPrinter_UU
     */
    void setAD_LabelPrinter_UU(String AD_LabelPrinter_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
