package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AllocationLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AllocationLine {

  /** TableName=C_AllocationLine */
  String Table_Name = "C_AllocationLine";

  /** AD_Table_ID=390 */
  int Table_ID = 390;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name Amount */
  String COLUMNNAME_Amount = "Amount";
  /** Column name C_AllocationHdr_ID */
  String COLUMNNAME_C_AllocationHdr_ID = "C_AllocationHdr_ID";
  /** Column name C_AllocationLine_ID */
  String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
  /** Column name C_AllocationLine_UU */
  String COLUMNNAME_C_AllocationLine_UU = "C_AllocationLine_UU";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_CashLine_ID */
  String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /** Column name DateTrx */
  String COLUMNNAME_DateTrx = "DateTrx";
  /** Column name DiscountAmt */
  String COLUMNNAME_DiscountAmt = "DiscountAmt";
    /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name OverUnderAmt */
  String COLUMNNAME_OverUnderAmt = "OverUnderAmt";
    /** Column name WriteOffAmt */
  String COLUMNNAME_WriteOffAmt = "WriteOffAmt";

    /** Get Amount. Amount in a defined currency */
  BigDecimal getAmount();

  /** Set Amount. Amount in a defined currency */
  void setAmount(BigDecimal Amount);

  /** Get Allocation. Payment allocation */
  int getC_AllocationHdr_ID();

  /** Set Allocation. Payment allocation */
  void setC_AllocationHdr_ID(int C_AllocationHdr_ID);

    /** Get Allocation Line. Allocation Line */
  int getC_AllocationLine_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Get Cash Journal Line. Cash Journal Line */
  int getC_CashLine_ID();

  /** Set Cash Journal Line. Cash Journal Line */
  void setC_CashLine_ID(int C_CashLine_ID);

    /** Get Charge. Additional document charges */
  int getC_Charge_ID();

    /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

    /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

    /** Get Discount Amount. Calculated amount of discount */
  BigDecimal getDiscountAmt();

  /** Set Discount Amount. Calculated amount of discount */
  void setDiscountAmt(BigDecimal DiscountAmt);

    /**
   * Get Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  BigDecimal getOverUnderAmt();

  /**
   * Set Over/Under Payment. Over-Payment (unallocated) or Under-Payment (partial payment) Amount
   */
  void setOverUnderAmt(BigDecimal OverUnderAmt);

    /** Get Write-off Amount. Amount to write-off */
  BigDecimal getWriteOffAmt();

  /** Set Write-off Amount. Amount to write-off */
  void setWriteOffAmt(BigDecimal WriteOffAmt);
}
