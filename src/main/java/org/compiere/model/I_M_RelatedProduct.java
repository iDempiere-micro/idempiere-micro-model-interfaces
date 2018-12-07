package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_RelatedProduct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RelatedProduct {

    /**
     * TableName=M_RelatedProduct
     */
    String Table_Name = "M_RelatedProduct";

    /**
     * AD_Table_ID=662
     */
    int Table_ID = 662;

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
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_RelatedProduct_UU
     */
    String COLUMNNAME_M_RelatedProduct_UU = "M_RelatedProduct_UU";
    /**
     * Column name RelatedProduct_ID
     */
    String COLUMNNAME_RelatedProduct_ID = "RelatedProduct_ID";
    /**
     * Column name RelatedProductType
     */
    String COLUMNNAME_RelatedProductType = "RelatedProductType";
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
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get M_RelatedProduct_UU
     */
    String getM_RelatedProduct_UU();

    /**
     * Set M_RelatedProduct_UU
     */
    void setM_RelatedProduct_UU(String M_RelatedProduct_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Related Product. Related Product
     */
    int getRelatedProduct_ID();

    /**
     * Set Related Product. Related Product
     */
    void setRelatedProduct_ID(int RelatedProduct_ID);

    I_M_Product getRelatedProduct() throws RuntimeException;

    /**
     * Get Related Product Type
     */
    String getRelatedProductType();

    /**
     * Set Related Product Type
     */
    void setRelatedProductType(String RelatedProductType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
