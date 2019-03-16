package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for I_InOutLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_InOutLineConfirm {

    /**
     * AD_Table_ID=740
     */
    int Table_ID = 740;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


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
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_InOutLineConfirm_ID
     */
    String COLUMNNAME_I_InOutLineConfirm_ID = "I_InOutLineConfirm_ID";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name M_InOutLineConfirm_ID
     */
    String COLUMNNAME_M_InOutLineConfirm_ID = "M_InOutLineConfirm_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";

    /**
     * Get Confirmation No. Confirmation Number
     */
    String getConfirmationNo();

    /**
     * Get Confirmed Quantity. Confirmation of a received quantity
     */
    BigDecimal getConfirmedQty();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Difference. Difference Quantity
     */
    BigDecimal getDifferenceQty();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setImportErrorMsg(String I_ErrorMsg);

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(boolean I_IsImported);

    /**
     * Get Ship/Receipt Confirmation Line. Material Shipment or Receipt Confirmation Line
     */
    int getInOutLineConfirmId();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    BigDecimal getScrappedQty();

}
