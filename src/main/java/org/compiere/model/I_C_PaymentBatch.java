package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaymentBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentBatch {

  /** TableName=C_PaymentBatch */
  String Table_Name = "C_PaymentBatch";

  /** AD_Table_ID=411 */
  int Table_ID = 411;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name C_PaymentBatch_ID */
  String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
  /** Column name C_PaymentBatch_UU */
  String COLUMNNAME_C_PaymentBatch_UU = "C_PaymentBatch_UU";
  /** Column name C_PaymentProcessor_ID */
  String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
    /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProcessingDate */
  String COLUMNNAME_ProcessingDate = "ProcessingDate";

    /** Get Payment Batch. Payment batch for EFT */
  int getC_PaymentBatch_ID();

    /** Get Payment Processor. Payment processor for electronic payments */
  int getC_PaymentProcessor_ID();

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Set Process Now */
  void setProcessing(boolean Processing);

}
