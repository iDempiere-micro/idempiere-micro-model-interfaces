package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionGroup {

    /**
     * TableName=M_PromotionGroup
     */
    String Table_Name = "M_PromotionGroup";

    /**
     * AD_Table_ID=53176
     */
    int Table_ID = 53176;

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
     * Column name M_PromotionGroup_ID
     */
    String COLUMNNAME_M_PromotionGroup_ID = "M_PromotionGroup_ID";
    /**
     * Column name M_PromotionGroup_UU
     */
    String COLUMNNAME_M_PromotionGroup_UU = "M_PromotionGroup_UU";
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
     * Get Promotion Group
     */
    int getM_PromotionGroup_ID();

    /**
     * Set Promotion Group
     */
    void setM_PromotionGroup_ID(int M_PromotionGroup_ID);

    /**
     * Get M_PromotionGroup_UU
     */
    String getM_PromotionGroup_UU();

    /**
     * Set M_PromotionGroup_UU
     */
    void setM_PromotionGroup_UU(String M_PromotionGroup_UU);

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
