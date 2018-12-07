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

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BinaryData */
  String COLUMNNAME_BinaryData = "BinaryData";
  /** Column name C_AcctProcessor_ID */
  String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
  /** Column name C_AcctProcessorLog_ID */
  String COLUMNNAME_C_AcctProcessorLog_ID = "C_AcctProcessorLog_ID";
  /** Column name C_AcctProcessorLog_UU */
  String COLUMNNAME_C_AcctProcessorLog_UU = "C_AcctProcessorLog_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsError */
  String COLUMNNAME_IsError = "IsError";
  /** Column name Reference */
  String COLUMNNAME_Reference = "Reference";
  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Binary Data. Binary Data */
  byte[] getBinaryData();

  /** Set Binary Data. Binary Data */
  void setBinaryData(byte[] BinaryData);

  /** Get Accounting Processor. Accounting Processor/Server Parameters */
  int getC_AcctProcessor_ID();

  /** Set Accounting Processor. Accounting Processor/Server Parameters */
  void setC_AcctProcessor_ID(int C_AcctProcessor_ID);

  I_C_AcctProcessor getC_AcctProcessor() throws RuntimeException;

  /** Get Accounting Processor Log. Result of the execution of the Accounting Processor */
  int getC_AcctProcessorLog_ID();

  /** Set Accounting Processor Log. Result of the execution of the Accounting Processor */
  void setC_AcctProcessorLog_ID(int C_AcctProcessorLog_ID);

  /** Get C_AcctProcessorLog_UU */
  String getC_AcctProcessorLog_UU();

  /** Set C_AcctProcessorLog_UU */
  void setC_AcctProcessorLog_UU(String C_AcctProcessorLog_UU);

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

  /** Set Error. An Error occurred in the execution */
  void setIsError(boolean IsError);

  /** Get Error. An Error occurred in the execution */
  boolean isError();

  /** Get Reference. Reference for this record */
  String getReference();

  /** Set Reference. Reference for this record */
  void setReference(String Reference);

  /** Get Summary. Textual summary of this request */
  String getSummary();

  /** Set Summary. Textual summary of this request */
  void setSummary(String Summary);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
