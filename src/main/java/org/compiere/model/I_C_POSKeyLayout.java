package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_POSKeyLayout
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSKeyLayout {

    /**
     * TableName=C_POSKeyLayout
     */
    String Table_Name = "C_POSKeyLayout";

    /**
     * AD_Table_ID=749
     */
    int Table_ID = 749;

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
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /**
     * Column name AD_PrintFont_ID
     */
    String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
    /**
     * Column name Columns
     */
    String COLUMNNAME_Columns = "Columns";
    /**
     * Column name C_POSKeyLayout_ID
     */
    String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
    /**
     * Column name C_POSKeyLayout_UU
     */
    String COLUMNNAME_C_POSKeyLayout_UU = "C_POSKeyLayout_UU";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name POSKeyLayoutType
     */
    String COLUMNNAME_POSKeyLayoutType = "POSKeyLayoutType";
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
     * Get Print Color. Color used for printing and display
     */
    int getAD_PrintColor_ID();

    /**
     * Set Print Color. Color used for printing and display
     */
    void setAD_PrintColor_ID(int AD_PrintColor_ID);

    I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

    /**
     * Get Print Font. Maintain Print Font
     */
    int getAD_PrintFont_ID();

    /**
     * Set Print Font. Maintain Print Font
     */
    void setAD_PrintFont_ID(int AD_PrintFont_ID);

    I_AD_PrintFont getAD_PrintFont() throws RuntimeException;

    /**
     * Get Columns. Number of columns
     */
    int getColumns();

    /**
     * Set Columns. Number of columns
     */
    void setColumns(int Columns);

    /**
     * Get POS Key Layout. POS Function Key Layout
     */
    int getC_POSKeyLayout_ID();

    /**
     * Set POS Key Layout. POS Function Key Layout
     */
    void setC_POSKeyLayout_ID(int C_POSKeyLayout_ID);

    /**
     * Get C_POSKeyLayout_UU
     */
    String getC_POSKeyLayout_UU();

    /**
     * Set C_POSKeyLayout_UU
     */
    void setC_POSKeyLayout_UU(String C_POSKeyLayout_UU);

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

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
     * Get POS Key Layout Type. The type of Key Layout
     */
    String getPOSKeyLayoutType();

    /**
     * Set POS Key Layout Type. The type of Key Layout
     */
    void setPOSKeyLayoutType(String POSKeyLayoutType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
