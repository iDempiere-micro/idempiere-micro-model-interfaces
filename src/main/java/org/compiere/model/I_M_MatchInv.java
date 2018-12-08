package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_MatchInv
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MatchInv {

  /** TableName=M_MatchInv */
  String Table_Name = "M_MatchInv";

  /** AD_Table_ID=472 */
  int Table_ID = 472;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateTrx */
  String COLUMNNAME_DateTrx = "DateTrx";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_MatchInv_ID */
  String COLUMNNAME_M_MatchInv_ID = "M_MatchInv_ID";
  /** Column name M_MatchInv_UU */
  String COLUMNNAME_M_MatchInv_UU = "M_MatchInv_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Transaction Date. Transaction Date */
  Timestamp getDateTrx();

  /** Set Transaction Date. Transaction Date */
  void setDateTrx(Timestamp DateTrx);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Match Invoice. Match Shipment/Receipt to Invoice */
  int getM_MatchInv_ID();

  /** Set Match Invoice. Match Shipment/Receipt to Invoice */
  void setM_MatchInv_ID(int M_MatchInv_ID);

  /** Get M_MatchInv_UU */
  String getM_MatchInv_UU();

  /** Set M_MatchInv_UU */
  void setM_MatchInv_UU(String M_MatchInv_UU);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /**
   * Get Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  BigDecimal getProcessedOn();

  /**
   * Set Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  void setProcessedOn(BigDecimal ProcessedOn);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

  I_M_MatchInv getReversal() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
