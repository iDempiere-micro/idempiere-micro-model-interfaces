package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Promotion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Promotion {

    /**
     * TableName=M_Promotion
     */
    String Table_Name = "M_Promotion";

    /**
     * AD_Table_ID=53178
     */
    int Table_ID = 53178;

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
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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
     * Column name M_Promotion_ID
     */
    String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
    /**
     * Column name M_Promotion_UU
     */
    String COLUMNNAME_M_Promotion_UU = "M_Promotion_UU";
    /**
     * Column name PromotionPriority
     */
    String COLUMNNAME_PromotionPriority = "PromotionPriority";
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
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

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
     * Get Promotion
     */
    int getM_Promotion_ID();

    /**
     * Set Promotion
     */
    void setM_Promotion_ID(int M_Promotion_ID);

    /**
     * Get M_Promotion_UU
     */
    String getM_Promotion_UU();

    /**
     * Set M_Promotion_UU
     */
    void setM_Promotion_UU(String M_Promotion_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Relative Priority. Which promotion should be apply to a product
     */
    int getPromotionPriority();

    /**
     * Set Relative Priority. Which promotion should be apply to a product
     */
    void setPromotionPriority(int PromotionPriority);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
