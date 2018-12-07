package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_Category {

    /**
     * TableName=M_Product_Category
     */
    String Table_Name = "M_Product_Category";

    /**
     * AD_Table_ID=209
     */
    int Table_ID = 209;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
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
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name MMPolicy
     */
    String COLUMNNAME_MMPolicy = "MMPolicy";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_Category_Parent_ID
     */
    String COLUMNNAME_M_Product_Category_Parent_ID =
            "M_Product_Category_Parent_ID";
    /**
     * Column name M_Product_Category_UU
     */
    String COLUMNNAME_M_Product_Category_UU = "M_Product_Category_UU";
    /**
     * Column name PlannedMargin
     */
    String COLUMNNAME_PlannedMargin = "PlannedMargin";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Asset Group. Group of Assets
     */
    int getA_Asset_Group_ID();

    /**
     * Set Asset Group. Group of Assets
     */
    void setA_Asset_Group_ID(int A_Asset_Group_ID);

    I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Material Policy. Material Movement Policy
     */
    String getMMPolicy();

    /**
     * Set Material Policy. Material Movement Policy
     */
    void setMMPolicy(String MMPolicy);

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    /**
     * Get Parent Product Category
     */
    int getM_Product_Category_Parent_ID();

    /**
     * Set Parent Product Category
     */
    void setM_Product_Category_Parent_ID(int M_Product_Category_Parent_ID);

    I_M_Product_Category getM_Product_Category_Parent() throws RuntimeException;

    /**
     * Get M_Product_Category_UU
     */
    String getM_Product_Category_UU();

    /**
     * Set M_Product_Category_UU
     */
    void setM_Product_Category_UU(String M_Product_Category_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Planned Margin %. Project's planned margin as a percentage
     */
    BigDecimal getPlannedMargin();

    /**
     * Set Planned Margin %. Project's planned margin as a percentage
     */
    void setPlannedMargin(BigDecimal PlannedMargin);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
