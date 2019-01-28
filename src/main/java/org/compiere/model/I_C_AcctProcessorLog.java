package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctProcessorLog {

  /** TableName=C_AcctProcessorLog */
  String Table_Name = "C_AcctProcessorLog";

  /** AD_Table_ID=694 */
  int Table_ID = 694;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name BinaryData */
  String COLUMNNAME_BinaryData = "BinaryData";
  /** Column name C_AcctProcessor_ID */
  String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
  /** Column name C_AcctProcessorLog_ID */
  String COLUMNNAME_C_AcctProcessorLog_ID = "C_AcctProcessorLog_ID";
  /** Column name C_AcctProcessorLog_UU */
  String COLUMNNAME_C_AcctProcessorLog_UU = "C_AcctProcessorLog_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsError */
  String COLUMNNAME_IsError = "IsError";
  /** Column name Reference */
  String COLUMNNAME_Reference = "Reference";
  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";

    /** Get Accounting Processor. Accounting Processor/Server Parameters */
  int getC_AcctProcessor_ID();

  /** Set Accounting Processor. Accounting Processor/Server Parameters */
  void setC_AcctProcessor_ID(int C_AcctProcessor_ID);

    /** Set Summary. Textual summary of this request */
  void setSummary(String Summary);

}
