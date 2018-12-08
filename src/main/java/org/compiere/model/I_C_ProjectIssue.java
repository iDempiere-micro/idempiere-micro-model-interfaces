package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ProjectIssue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectIssue {

  /** TableName=C_ProjectIssue */
  String Table_Name = "C_ProjectIssue";

  /** AD_Table_ID=623 */
  int Table_ID = 623;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectIssue_ID */
  String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
  /** Column name C_ProjectIssue_UU */
  String COLUMNNAME_C_ProjectIssue_UU = "C_ProjectIssue_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name MovementQty */
  String COLUMNNAME_MovementQty = "MovementQty";
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
  /** Column name S_TimeExpenseLine_ID */
  String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Project Issue. Project Issues (Material, Labor) */
  int getC_ProjectIssue_ID();

  /** Set Project Issue. Project Issues (Material, Labor) */
  void setC_ProjectIssue_ID(int C_ProjectIssue_ID);

  /** Get C_ProjectIssue_UU */
  String getC_ProjectIssue_UU();

  /** Set C_ProjectIssue_UU */
  void setC_ProjectIssue_UU(String C_ProjectIssue_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

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

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

  I_M_Locator getM_Locator() throws RuntimeException;

  /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

  /** Set Movement Date. Date a product was moved in or out of inventory */
  void setMovementDate(Timestamp MovementDate);

  /** Get Movement Quantity. Quantity of a product moved. */
  BigDecimal getMovementQty();

  /** Set Movement Quantity. Quantity of a product moved. */
  void setMovementQty(BigDecimal MovementQty);

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

  /** Get Expense Line. Time and Expense Report Line */
  int getS_TimeExpenseLine_ID();

  /** Set Expense Line. Time and Expense Report Line */
  void setS_TimeExpenseLine_ID(int S_TimeExpenseLine_ID);

  I_S_TimeExpenseLine getS_TimeExpenseLine() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
