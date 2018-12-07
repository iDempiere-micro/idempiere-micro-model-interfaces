package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Dunning
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Dunning {

    /**
     * TableName=C_Dunning
     */
    String Table_Name = "C_Dunning";

    /**
     * AD_Table_ID=301
     */
    int Table_ID = 301;

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
     * Column name C_Dunning_ID
     */
    String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
    /**
     * Column name C_Dunning_UU
     */
    String COLUMNNAME_C_Dunning_UU = "C_Dunning_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreateLevelsSequentially
     */
    String COLUMNNAME_CreateLevelsSequentially = "CreateLevelsSequentially";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name SendDunningLetter
     */
    String COLUMNNAME_SendDunningLetter = "SendDunningLetter";
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
     * Get Dunning. Dunning Rules for overdue invoices
     */
    int getC_Dunning_ID();

    /**
     * Set Dunning. Dunning Rules for overdue invoices
     */
    void setC_Dunning_ID(int C_Dunning_ID);

    /**
     * Get C_Dunning_UU
     */
    String getC_Dunning_UU();

    /**
     * Set C_Dunning_UU
     */
    void setC_Dunning_UU(String C_Dunning_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create levels sequentially. Create Dunning Letter by level sequentially
     */
    boolean isCreateLevelsSequentially();

    /**
     * Set Create levels sequentially. Create Dunning Letter by level sequentially
     */
    void setCreateLevelsSequentially(boolean CreateLevelsSequentially);

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Send dunning letters. Indicates if dunning letters will be sent
     */
    boolean isSendDunningLetter();

    /**
     * Set Send dunning letters. Indicates if dunning letters will be sent
     */
    void setSendDunningLetter(boolean SendDunningLetter);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
