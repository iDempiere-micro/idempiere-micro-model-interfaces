package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_MovementLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MovementLineConfirm {

    /**
     * AD_Table_ID=737
     */
    int Table_ID = 737;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name ConfirmedQty
     */
    String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
    /**
     * Column name DifferenceQty
     */
    String COLUMNNAME_DifferenceQty = "DifferenceQty";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
    /**
     * Column name M_MovementConfirm_ID
     */
    String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
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
     * Get Confirmed Quantity. Confirmation of a received quantity
     */
    BigDecimal getConfirmedQty();

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Difference. Difference Quantity
     */
    BigDecimal getDifferenceQty();

    /**
     * Set Difference. Difference Quantity
     */
    void setDifferenceQty(BigDecimal DifferenceQty);

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setInventoryLineId(int M_InventoryLine_ID);

    /**
     * Set Move Confirm. Inventory Move Confirmation
     */
    void setMovementConfirmId(int M_MovementConfirm_ID);

    /**
     * Get Move Line. Inventory Move document Line
     */
    int getMovementLineId();

    /**
     * Set Move Line. Inventory Move document Line
     */
    void setM_MovementLine_ID(int M_MovementLine_ID);

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

}
