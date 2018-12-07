package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_InOutLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutLineConfirm {

    /**
     * TableName=M_InOutLineConfirm
     */
    String Table_Name = "M_InOutLineConfirm";

    /**
     * AD_Table_ID=728
     */
    int Table_ID = 728;

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
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name ConfirmationNo
     */
    String COLUMNNAME_ConfirmationNo = "ConfirmationNo";
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
     * Column name M_InOutConfirm_ID
     */
    String COLUMNNAME_M_InOutConfirm_ID = "M_InOutConfirm_ID";
    /**
     * Column name M_InOutLineConfirm_ID
     */
    String COLUMNNAME_M_InOutLineConfirm_ID = "M_InOutLineConfirm_ID";
    /**
     * Column name M_InOutLineConfirm_UU
     */
    String COLUMNNAME_M_InOutLineConfirm_UU = "M_InOutLineConfirm_UU";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
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
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /**
     * Get Confirmation No. Confirmation Number
     */
    String getConfirmationNo();

    /**
     * Set Confirmation No. Confirmation Number
     */
    void setConfirmationNo(String ConfirmationNo);

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
     * Get Ship/Receipt Confirmation. Material Shipment or Receipt Confirmation
     */
    int getM_InOutConfirm_ID();

    /**
     * Set Ship/Receipt Confirmation. Material Shipment or Receipt Confirmation
     */
    void setM_InOutConfirm_ID(int M_InOutConfirm_ID);

    I_M_InOutConfirm getM_InOutConfirm() throws RuntimeException;

    /**
     * Get Ship/Receipt Confirmation Line. Material Shipment or Receipt Confirmation Line
     */
    int getM_InOutLineConfirm_ID();

    /**
     * Set Ship/Receipt Confirmation Line. Material Shipment or Receipt Confirmation Line
     */
    void setM_InOutLineConfirm_ID(int M_InOutLineConfirm_ID);

    /**
     * Get M_InOutLineConfirm_UU
     */
    String getM_InOutLineConfirm_UU();

    /**
     * Set M_InOutLineConfirm_UU
     */
    void setM_InOutLineConfirm_UU(String M_InOutLineConfirm_UU);

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setM_InOutLine_ID(int M_InOutLine_ID);

    I_M_InOutLine getM_InOutLine() throws RuntimeException;

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
