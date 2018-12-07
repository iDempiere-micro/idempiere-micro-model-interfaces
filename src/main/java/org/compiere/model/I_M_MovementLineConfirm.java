package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_MovementLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MovementLineConfirm {

    /**
     * TableName=M_MovementLineConfirm
     */
    String Table_Name = "M_MovementLineConfirm";

    /**
     * AD_Table_ID=737
     */
    int Table_ID = 737;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name ConfirmedQty
     */
    String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
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
     * Column name DifferenceQty
     */
    String COLUMNNAME_DifferenceQty = "DifferenceQty";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
    /**
     * Column name M_MovementConfirm_ID
     */
    String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
    /**
     * Column name M_MovementLineConfirm_ID
     */
    String COLUMNNAME_M_MovementLineConfirm_ID = "M_MovementLineConfirm_ID";
    /**
     * Column name M_MovementLineConfirm_UU
     */
    String COLUMNNAME_M_MovementLineConfirm_UU = "M_MovementLineConfirm_UU";
    /**
     * Column name M_MovementLine_ID
     */
    String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name TargetQty
     */
    String COLUMNNAME_TargetQty = "TargetQty";
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
     * Get Confirmed Quantity. Confirmation of a received quantity
     */
    BigDecimal getConfirmedQty();

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

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
     * Get Difference. Difference Quantity
     */
    BigDecimal getDifferenceQty();

    /**
     * Set Difference. Difference Quantity
     */
    void setDifferenceQty(BigDecimal DifferenceQty);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Phys.Inventory Line. Unique line in an Inventory document
     */
    int getM_InventoryLine_ID();

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setM_InventoryLine_ID(int M_InventoryLine_ID);

    I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

    /**
     * Get Move Confirm. Inventory Move Confirmation
     */
    int getM_MovementConfirm_ID();

    /**
     * Set Move Confirm. Inventory Move Confirmation
     */
    void setM_MovementConfirm_ID(int M_MovementConfirm_ID);

    I_M_MovementConfirm getM_MovementConfirm() throws RuntimeException;

    /**
     * Get Move Line Confirm. Inventory Move Line Confirmation
     */
    int getM_MovementLineConfirm_ID();

    /**
     * Set Move Line Confirm. Inventory Move Line Confirmation
     */
    void setM_MovementLineConfirm_ID(int M_MovementLineConfirm_ID);

    /**
     * Get M_MovementLineConfirm_UU
     */
    String getM_MovementLineConfirm_UU();

    /**
     * Set M_MovementLineConfirm_UU
     */
    void setM_MovementLineConfirm_UU(String M_MovementLineConfirm_UU);

    /**
     * Get Move Line. Inventory Move document Line
     */
    int getM_MovementLine_ID();

    /**
     * Set Move Line. Inventory Move document Line
     */
    void setM_MovementLine_ID(int M_MovementLine_ID);

    I_M_MovementLine getM_MovementLine() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    BigDecimal getScrappedQty();

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Get Target Quantity. Target Movement Quantity
     */
    BigDecimal getTargetQty();

    /**
     * Set Target Quantity. Target Movement Quantity
     */
    void setTargetQty(BigDecimal TargetQty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
