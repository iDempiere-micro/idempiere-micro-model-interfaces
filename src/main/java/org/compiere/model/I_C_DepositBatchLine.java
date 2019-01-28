package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DepositBatchLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatchLine {

  /** TableName=C_DepositBatchLine */
  String Table_Name = "C_DepositBatchLine";

  /** AD_Table_ID=200057 */
  int Table_ID = 200057;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_DepositBatch_ID */
  String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
  /** Column name C_DepositBatchLine_ID */
  String COLUMNNAME_C_DepositBatchLine_ID = "C_DepositBatchLine_ID";
  /** Column name C_DepositBatchLine_UU */
  String COLUMNNAME_C_DepositBatchLine_UU = "C_DepositBatchLine_UU";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name PayAmt */
  String COLUMNNAME_PayAmt = "PayAmt";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

    /** Get Deposit Batch */
  int getC_DepositBatch_ID();

  /** Set Deposit Batch */
  void setC_DepositBatch_ID(int C_DepositBatch_ID);

    /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

    /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

    /** Set Payment amount. Amount being paid */
  void setPayAmt(BigDecimal PayAmt);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

}
