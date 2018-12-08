package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaymentAllocate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentAllocate {

  /** TableName=C_PaymentAllocate */
  String Table_Name = "C_PaymentAllocate";

  /** AD_Table_ID=812 */
  int Table_ID = 812;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amount */
  String COLUMNNAME_Amount = "Amount";
  /** Column name C_AllocationLine_ID */
  String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_PaymentAllocate_ID */
  String COLUMNNAME_C_PaymentAllocate_ID = "C_PaymentAllocate_ID";
  /** Column name C_PaymentAllocate_UU */
  String COLUMNNAME_C_PaymentAllocate_UU = "C_PaymentAllocate_UU";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
  /** Column name InvoiceAmt */
  String COLUMNNAME_InvoiceAmt = "InvoiceAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name OverUnderAmt */
  String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
  /** Column name RemainingAmt */
  String COLUMNNAME_RemainingAmt = "RemainingAmt";
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

  /** Get Amount. Amount in a defined currency */
  BigDecimal getAmount();

  /** Set Amount. Amount in a defined currency */
  void setAmount(BigDecimal Amount);

  /** Get Allocation Line. Allocation Line */
  int getC_AllocationLine_ID();

  /** Set Allocation Line. Allocation Line */
  void setC_AllocationLine_ID(int C_AllocationLine_ID);

  I_C_AllocationLine getC_AllocationLine() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Allocate Payment. Allocate Payment to Invoices */
  int getC_PaymentAllocate_ID();

  /** Set Allocate Payment. Allocate Payment to Invoices */
  void setC_PaymentAllocate_ID(int C_PaymentAllocate_ID);

  /** Get C_PaymentAllocate_UU */
  String getC_PaymentAllocate_UU();

  /** Set C_PaymentAllocate_UU */
  void setC_PaymentAllocate_UU(String C_PaymentAllocate_UU);

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

  /** Get Invoice Amt */
  BigDecimal getInvoiceAmt();

  /** Set Invoice Amt */
  void setInvoiceAmt(BigDecimal InvoiceAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  BigDecimal getOverUnderAmt();

  /**
   * Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  void setOverUnderAmt(BigDecimal OverUnderAmt);

  /** Get Remaining Amt. Remaining Amount */
  BigDecimal getRemainingAmt();

  /** Set Remaining Amt. Remaining Amount */
  void setRemainingAmt(BigDecimal RemainingAmt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}
