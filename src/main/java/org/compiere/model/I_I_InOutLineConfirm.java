package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_InOutLineConfirm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_InOutLineConfirm {

  /** TableName=I_InOutLineConfirm */
  String Table_Name = "I_InOutLineConfirm";

  /** AD_Table_ID=740 */
  int Table_ID = 740;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ConfirmationNo */
  String COLUMNNAME_ConfirmationNo = "ConfirmationNo";
  /** Column name ConfirmedQty */
  String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DifferenceQty */
  String COLUMNNAME_DifferenceQty = "DifferenceQty";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_InOutLineConfirm_ID */
  String COLUMNNAME_I_InOutLineConfirm_ID = "I_InOutLineConfirm_ID";
  /** Column name I_InOutLineConfirm_UU */
  String COLUMNNAME_I_InOutLineConfirm_UU = "I_InOutLineConfirm_UU";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_InOutLineConfirm_ID */
  String COLUMNNAME_M_InOutLineConfirm_ID = "M_InOutLineConfirm_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ScrappedQty */
  String COLUMNNAME_ScrappedQty = "ScrappedQty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Confirmation No. Confirmation Number */
  String getConfirmationNo();

  /** Set Confirmation No. Confirmation Number */
  void setConfirmationNo(String ConfirmationNo);

  /** Get Confirmed Quantity. Confirmation of a received quantity */
  BigDecimal getConfirmedQty();

  /** Set Confirmed Quantity. Confirmation of a received quantity */
  void setConfirmedQty(BigDecimal ConfirmedQty);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Difference. Difference Quantity */
  BigDecimal getDifferenceQty();

  /** Set Difference. Difference Quantity */
  void setDifferenceQty(BigDecimal DifferenceQty);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /**
   * Get Ship/Receipt Confirmation Import Line. Material Shipment or Receipt Confirmation Import
   * Line
   */
  int getI_InOutLineConfirm_ID();

  /**
   * Set Ship/Receipt Confirmation Import Line. Material Shipment or Receipt Confirmation Import
   * Line
   */
  void setI_InOutLineConfirm_ID(int I_InOutLineConfirm_ID);

  /** Get I_InOutLineConfirm_UU */
  String getI_InOutLineConfirm_UU();

  /** Set I_InOutLineConfirm_UU */
  void setI_InOutLineConfirm_UU(String I_InOutLineConfirm_UU);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Ship/Receipt Confirmation Line. Material Shipment or Receipt Confirmation Line */
  int getM_InOutLineConfirm_ID();

  /** Set Ship/Receipt Confirmation Line. Material Shipment or Receipt Confirmation Line */
  void setM_InOutLineConfirm_ID(int M_InOutLineConfirm_ID);

  I_M_InOutLineConfirm getM_InOutLineConfirm() throws RuntimeException;

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Scrapped Quantity. The Quantity scrapped due to QA issues */
  BigDecimal getScrappedQty();

  /** Set Scrapped Quantity. The Quantity scrapped due to QA issues */
  void setScrappedQty(BigDecimal ScrappedQty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
