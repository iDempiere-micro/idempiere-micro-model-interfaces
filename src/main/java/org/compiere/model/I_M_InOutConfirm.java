package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InOutConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutConfirm {

    /**
     * TableName=M_InOutConfirm
     */
    String Table_Name = "M_InOutConfirm";

    /**
     * AD_Table_ID=727
     */
    int Table_ID = 727;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name ApprovalAmt
     */
    String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name ConfirmationNo
     */
    String COLUMNNAME_ConfirmationNo = "ConfirmationNo";
    /**
     * Column name ConfirmType
     */
    String COLUMNNAME_ConfirmType = "ConfirmType";
    /**
     * Column name CreatePackage
     */
    String COLUMNNAME_CreatePackage = "CreatePackage";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsCancelled
     */
    String COLUMNNAME_IsCancelled = "IsCancelled";
    /**
     * Column name IsInDispute
     */
    String COLUMNNAME_IsInDispute = "IsInDispute";
    /**
     * Column name M_InOutConfirm_ID
     */
    String COLUMNNAME_M_InOutConfirm_ID = "M_InOutConfirm_ID";
    /**
     * Column name M_InOutConfirm_UU
     */
    String COLUMNNAME_M_InOutConfirm_UU = "M_InOutConfirm_UU";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_Inventory_ID
     */
    String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Approval Amount. Document Approval Amount
     */
    BigDecimal getApprovalAmt();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    /**
     * Get Confirmation Type. Type of confirmation
     */
    String getConfirmType();

    /**
     * Set Confirmation Type. Type of confirmation
     */
    void setConfirmType(String ConfirmType);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Cancelled. The transaction was cancelled
     */
    void setIsCancelled(boolean IsCancelled);

    /**
     * Set In Dispute. Document is in dispute
     */
    void setIsInDispute(boolean IsInDispute);

    /**
     * Get In Dispute. Document is in dispute
     */
    boolean isInDispute();

    /**
     * Get Ship/Receipt Confirmation. Material Shipment or Receipt Confirmation
     */
    int getM_InOutConfirm_ID();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getM_InOut_ID();

    /**
     * Set Shipment/Receipt. Material Shipment Document
     */
    void setM_InOut_ID(int M_InOut_ID);

    I_M_InOut getM_InOut() throws RuntimeException;

    /**
     * Get Phys.Inventory. Parameters for a Physical Inventory
     */
    int getM_Inventory_ID();

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setM_Inventory_ID(int M_Inventory_ID);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

}
