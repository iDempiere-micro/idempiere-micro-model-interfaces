package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_StorageOnHand
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_StorageOnHand {

    /**
     * TableName=M_StorageOnHand
     */
    String Table_Name = "M_StorageOnHand";

    /**
     * AD_Table_ID=200026
     */
    int Table_ID = 200026;

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
     * Column name DateLastInventory
     */
    String COLUMNNAME_DateLastInventory = "DateLastInventory";
    /**
     * Column name DateMaterialPolicy
     */
    String COLUMNNAME_DateMaterialPolicy = "DateMaterialPolicy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_StorageOnHand_UU
     */
    String COLUMNNAME_M_StorageOnHand_UU = "M_StorageOnHand_UU";
    /**
     * Column name QtyOnHand
     */
    String COLUMNNAME_QtyOnHand = "QtyOnHand";
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
     * Get Date last inventory count. Date of Last Inventory Count
     */
    Timestamp getDateLastInventory();

    /**
     * Set Date last inventory count. Date of Last Inventory Count
     */
    void setDateLastInventory(Timestamp DateLastInventory);

    /**
     * Get Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    Timestamp getDateMaterialPolicy();

    /**
     * Set Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    void setDateMaterialPolicy(Timestamp DateMaterialPolicy);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

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
     * Get M_StorageOnHand_UU
     */
    String getM_StorageOnHand_UU();

    /**
     * Set M_StorageOnHand_UU
     */
    void setM_StorageOnHand_UU(String M_StorageOnHand_UU);

    /**
     * Get On Hand Quantity. On Hand Quantity
     */
    BigDecimal getQtyOnHand();

    /**
     * Set On Hand Quantity. On Hand Quantity
     */
    void setQtyOnHand(BigDecimal QtyOnHand);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
