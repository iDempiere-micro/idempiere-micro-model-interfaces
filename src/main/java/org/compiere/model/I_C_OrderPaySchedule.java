package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_OrderPaySchedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderPaySchedule {

  /** TableName=C_OrderPaySchedule */
  String Table_Name = "C_OrderPaySchedule";

  /** AD_Table_ID=53296 */
  int Table_ID = 53296;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_OrderPaySchedule_ID */
  String COLUMNNAME_C_OrderPaySchedule_ID = "C_OrderPaySchedule_ID";
  /** Column name C_OrderPaySchedule_UU */
  String COLUMNNAME_C_OrderPaySchedule_UU = "C_OrderPaySchedule_UU";
  /** Column name C_PaySchedule_ID */
  String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name DiscountDate */
  String COLUMNNAME_DiscountDate = "DiscountDate";
  /** Column name DueAmt */
  String COLUMNNAME_DueAmt = "DueAmt";
  /** Column name DueDate */
  String COLUMNNAME_DueDate = "DueDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
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

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Order Payment Schedule */
  int getC_OrderPaySchedule_ID();

  /** Set Order Payment Schedule */
  void setC_OrderPaySchedule_ID(int C_OrderPaySchedule_ID);

  /** Get C_OrderPaySchedule_UU */
  String getC_OrderPaySchedule_UU();

  /** Set C_OrderPaySchedule_UU */
  void setC_OrderPaySchedule_UU(String C_OrderPaySchedule_UU);

  /** Get Payment Schedule. Payment Schedule Template */
  int getC_PaySchedule_ID();

  /** Set Payment Schedule. Payment Schedule Template */
  void setC_PaySchedule_ID(int C_PaySchedule_ID);

  I_C_PaySchedule getC_PaySchedule() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Get Discount Date. Last Date for payments with discount */
  Timestamp getDiscountDate();

  /** Set Discount Date. Last Date for payments with discount */
  void setDiscountDate(Timestamp DiscountDate);

  /** Get Amount due. Amount of the payment due */
  BigDecimal getDueAmt();

  /** Set Amount due. Amount of the payment due */
  void setDueAmt(BigDecimal DueAmt);

  /** Get Due Date. Date when the payment is due */
  Timestamp getDueDate();

  /** Set Due Date. Date when the payment is due */
  void setDueDate(Timestamp DueDate);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

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
