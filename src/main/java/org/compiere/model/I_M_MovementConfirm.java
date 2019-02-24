package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_MovementConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MovementConfirm {

    /**
     * TableName=M_MovementConfirm
     */
    String Table_Name = "M_MovementConfirm";

    /**
     * AD_Table_ID=738
     */
    int Table_ID = 738;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name ApprovalAmt
     */
    String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
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
     * Column name M_Inventory_ID
     */
    String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
    /**
     * Column name M_MovementConfirm_ID
     */
    String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
    /**
     * Column name M_Movement_ID
     */
    String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
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
     * Get Phys.Inventory. Parameters for a Physical Inventory
     */
    int getM_Inventory_ID();

    /**
     * Set Phys.Inventory. Parameters for a Physical Inventory
     */
    void setM_Inventory_ID(int M_Inventory_ID);

    /**
     * Get Move Confirm. Inventory Move Confirmation
     */
    int getM_MovementConfirm_ID();

    /**
     * Get Inventory Move. Movement of Inventory
     */
    int getM_Movement_ID();

    /**
     * Set Inventory Move. Movement of Inventory
     */
    void setM_Movement_ID(int M_Movement_ID);

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
