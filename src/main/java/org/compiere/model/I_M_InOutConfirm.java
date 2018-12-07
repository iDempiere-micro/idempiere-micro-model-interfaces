package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Approval Amount. Document Approval Amount
     */
    BigDecimal getApprovalAmt();

    /**
     * Set Approval Amount. Document Approval Amount
     */
    void setApprovalAmt(BigDecimal ApprovalAmt);

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Confirmation No. Confirmation Number
     */
    String getConfirmationNo();

    /**
     * Set Confirmation No. Confirmation Number
     */
    void setConfirmationNo(String ConfirmationNo);

    /**
     * Get Confirmation Type. Type of confirmation
     */
    String getConfirmType();

    /**
     * Set Confirmation Type. Type of confirmation
     */
    void setConfirmType(String ConfirmType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create Package
     */
    String getCreatePackage();

    /**
     * Set Create Package
     */
    void setCreatePackage(String CreatePackage);

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
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Cancelled. The transaction was cancelled
     */
    boolean isCancelled();

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
     * Set Ship/Receipt Confirmation. Material Shipment or Receipt Confirmation
     */
    void setM_InOutConfirm_ID(int M_InOutConfirm_ID);

    /**
     * Get M_InOutConfirm_UU
     */
    String getM_InOutConfirm_UU();

    /**
     * Set M_InOutConfirm_UU
     */
    void setM_InOutConfirm_UU(String M_InOutConfirm_UU);

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

    I_M_Inventory getM_Inventory() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
