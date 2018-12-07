package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_BOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_BOM {

    /**
     * TableName=M_BOM
     */
    String Table_Name = "M_BOM";

    /**
     * AD_Table_ID=798
     */
    int Table_ID = 798;

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
     * Column name BOMType
     */
    String COLUMNNAME_BOMType = "BOMType";
    /**
     * Column name BOMUse
     */
    String COLUMNNAME_BOMUse = "BOMUse";
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
     * Column name M_BOM_ID
     */
    String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
    /**
     * Column name M_BOM_UU
     */
    String COLUMNNAME_M_BOM_UU = "M_BOM_UU";
    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
     * Get BOM Type. Type of BOM
     */
    String getBOMType();

    /**
     * Set BOM Type. Type of BOM
     */
    void setBOMType(String BOMType);

    /**
     * Get BOM Use. The use of the Bill of Material
     */
    String getBOMUse();

    /**
     * Set BOM Use. The use of the Bill of Material
     */
    void setBOMUse(String BOMUse);

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
     * Get BOM. Bill of Material
     */
    int getM_BOM_ID();

    /**
     * Set BOM. Bill of Material
     */
    void setM_BOM_ID(int M_BOM_ID);

    /**
     * Get M_BOM_UU
     */
    String getM_BOM_UU();

    /**
     * Set M_BOM_UU
     */
    void setM_BOM_UU(String M_BOM_UU);

    /**
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    int getM_ChangeNotice_ID();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

    I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

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
