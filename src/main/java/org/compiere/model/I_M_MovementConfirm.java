package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_MovementConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MovementConfirm {

  /** TableName=M_MovementConfirm */
  String Table_Name = "M_MovementConfirm";

  /** AD_Table_ID=738 */
  int Table_ID = 738;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ApprovalAmt */
  String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name M_Inventory_ID */
  String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
  /** Column name M_MovementConfirm_ID */
  String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
  /** Column name M_MovementConfirm_UU */
  String COLUMNNAME_M_MovementConfirm_UU = "M_MovementConfirm_UU";
  /** Column name M_Movement_ID */
  String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Approval Amount. Document Approval Amount */
  BigDecimal getApprovalAmt();

  /** Set Approval Amount. Document Approval Amount */
  void setApprovalAmt(BigDecimal ApprovalAmt);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Get Phys.Inventory. Parameters for a Physical Inventory */
  int getM_Inventory_ID();

  /** Set Phys.Inventory. Parameters for a Physical Inventory */
  void setM_Inventory_ID(int M_Inventory_ID);

  I_M_Inventory getM_Inventory() throws RuntimeException;

  /** Get Move Confirm. Inventory Move Confirmation */
  int getM_MovementConfirm_ID();

  /** Set Move Confirm. Inventory Move Confirmation */
  void setM_MovementConfirm_ID(int M_MovementConfirm_ID);

  /** Get M_MovementConfirm_UU */
  String getM_MovementConfirm_UU();

  /** Set M_MovementConfirm_UU */
  void setM_MovementConfirm_UU(String M_MovementConfirm_UU);

  /** Get Inventory Move. Movement of Inventory */
  int getM_Movement_ID();

  /** Set Inventory Move. Movement of Inventory */
  void setM_Movement_ID(int M_Movement_ID);

  I_M_Movement getM_Movement() throws RuntimeException;

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
