package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaySelectionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelectionLine {

  /** TableName=C_PaySelectionLine */
  String Table_Name = "C_PaySelectionLine";

  /** AD_Table_ID=427 */
  int Table_ID = 427;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_PaySelectionCheck_ID */
  String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
  /** Column name C_PaySelection_ID */
  String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
  /** Column name C_PaySelectionLine_ID */
  String COLUMNNAME_C_PaySelectionLine_ID = "C_PaySelectionLine_ID";
  /** Column name C_PaySelectionLine_UU */
  String COLUMNNAME_C_PaySelectionLine_UU = "C_PaySelectionLine_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DifferenceAmt */
  String COLUMNNAME_DifferenceAmt = "DifferenceAmt";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name OpenAmt */
  String COLUMNNAME_OpenAmt = "OpenAmt";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WriteOffAmt */
  String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Pay Selection Check. Payment Selection Check */
  int getC_PaySelectionCheck_ID();

  /** Set Pay Selection Check. Payment Selection Check */
  void setC_PaySelectionCheck_ID(int C_PaySelectionCheck_ID);

  I_C_PaySelectionCheck getC_PaySelectionCheck() throws RuntimeException;

  /** Get Payment Selection. Payment Selection */
  int getC_PaySelection_ID();

  /** Set Payment Selection. Payment Selection */
  void setC_PaySelection_ID(int C_PaySelection_ID);

  I_C_PaySelection getC_PaySelection() throws RuntimeException;

  /** Get Payment Selection Line. Payment Selection Line */
  int getC_PaySelectionLine_ID();

  /** Set Payment Selection Line. Payment Selection Line */
  void setC_PaySelectionLine_ID(int C_PaySelectionLine_ID);

  /** Get C_PaySelectionLine_UU */
  String getC_PaySelectionLine_UU();

  /** Set C_PaySelectionLine_UU */
  void setC_PaySelectionLine_UU(String C_PaySelectionLine_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Difference. Difference Amount */
  BigDecimal getDifferenceAmt();

  /** Set Difference. Difference Amount */
  void setDifferenceAmt(BigDecimal DifferenceAmt);

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Open Amount. Open item amount */
  BigDecimal getOpenAmt();

  /** Set Open Amount. Open item amount */
  void setOpenAmt(BigDecimal OpenAmt);

  /** Get Payment amount. Amount being paid */
  BigDecimal getPayAmt();

  /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}