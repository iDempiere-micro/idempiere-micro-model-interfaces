package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessorLog {

  /** TableName=R_RequestProcessorLog */
  String Table_Name = "R_RequestProcessorLog";

  /** AD_Table_ID=659 */
  int Table_ID = 659;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name BinaryData */
  String COLUMNNAME_BinaryData = "BinaryData";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsError */
  String COLUMNNAME_IsError = "IsError";
  /** Column name Reference */
  String COLUMNNAME_Reference = "Reference";
  /** Column name R_RequestProcessor_ID */
  String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
  /** Column name R_RequestProcessorLog_ID */
  String COLUMNNAME_R_RequestProcessorLog_ID = "R_RequestProcessorLog_ID";
  /** Column name R_RequestProcessorLog_UU */
  String COLUMNNAME_R_RequestProcessorLog_UU = "R_RequestProcessorLog_UU";
  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";

    /** Set Error. An Error occurred in the execution */
  void setIsError(boolean IsError);

    /** Get Request Processor. Processor for Requests */
  int getR_RequestProcessor_ID();

  /** Set Request Processor. Processor for Requests */
  void setR_RequestProcessor_ID(int R_RequestProcessor_ID);

    /** Set Summary. Textual summary of this request */
  void setSummary(String Summary);

}
