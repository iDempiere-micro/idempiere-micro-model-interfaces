package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InOutLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutLineConfirm extends PersistentObject {

    /**
     * TableName=M_InOutLineConfirm
     */
    String Table_Name = "M_InOutLineConfirm";

    /**
     * AD_Table_ID=728
     */
    int Table_ID = 728;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DifferenceQty
     */
    String COLUMNNAME_DifferenceQty = "DifferenceQty";
    /**
     * Column name M_InOutConfirm_ID
     */
    String COLUMNNAME_M_InOutConfirm_ID = "M_InOutConfirm_ID";
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
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

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
     * Set Ship/Receipt Confirmation. Material Shipment or Receipt Confirmation
     */
    void setInOutConfirmId(int M_InOutConfirm_ID);

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setInventoryLineId(int M_InventoryLine_ID);

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

    boolean isFullyConfirmed();

    I_M_InOutLine getLine();

    boolean processLine(boolean soTrx, String confirmType);

    void saveEx();
}
