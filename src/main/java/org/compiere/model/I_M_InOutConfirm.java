package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InOutConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutConfirm extends PersistentObject {

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


    /**
     * Column name ApprovalAmt
     */
    String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name ConfirmType
     */
    String COLUMNNAME_ConfirmType = "ConfirmType";
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
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

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
    int getInOutConfirmId();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getInOutId();

    /**
     * Set Shipment/Receipt. Material Shipment Document
     */
    void setInOutId(int M_InOut_ID);

    I_M_InOut getInOut() throws RuntimeException;

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setInventoryId(int M_Inventory_ID);

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

    String getConfirmTypeName();

    boolean processIt(String docaction_void);

    String getProcessMsg();

    void saveEx();

    I_M_InOutLineConfirm[] getLines(boolean b);
}
