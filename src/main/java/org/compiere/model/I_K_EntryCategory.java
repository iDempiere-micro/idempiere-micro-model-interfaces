package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_EntryCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_EntryCategory {

    /**
     * TableName=K_EntryCategory
     */
    String Table_Name = "K_EntryCategory";

    /**
     * AD_Table_ID=611
     */
    int Table_ID = 611;

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name K_Category_ID
     */
    String COLUMNNAME_K_Category_ID = "K_Category_ID";
    /**
     * Column name K_CategoryValue_ID
     */
    String COLUMNNAME_K_CategoryValue_ID = "K_CategoryValue_ID";
    /**
     * Column name K_EntryCategory_UU
     */
    String COLUMNNAME_K_EntryCategory_UU = "K_EntryCategory_UU";
    /**
     * Column name K_Entry_ID
     */
    String COLUMNNAME_K_Entry_ID = "K_Entry_ID";
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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Knowledge Category. Knowledge Category
     */
    int getK_Category_ID();

    /**
     * Set Knowledge Category. Knowledge Category
     */
    void setK_Category_ID(int K_Category_ID);

    I_K_Category getK_Category() throws RuntimeException;

    /**
     * Get Category Value. The value of the category
     */
    int getK_CategoryValue_ID();

    /**
     * Set Category Value. The value of the category
     */
    void setK_CategoryValue_ID(int K_CategoryValue_ID);

    I_K_CategoryValue getK_CategoryValue() throws RuntimeException;

    /**
     * Get K_EntryCategory_UU
     */
    String getK_EntryCategory_UU();

    /**
     * Set K_EntryCategory_UU
     */
    void setK_EntryCategory_UU(String K_EntryCategory_UU);

    /**
     * Get Entry. Knowledge Entry
     */
    int getK_Entry_ID();

    /**
     * Set Entry. Knowledge Entry
     */
    void setK_Entry_ID(int K_Entry_ID);

    I_K_Entry getK_Entry() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
