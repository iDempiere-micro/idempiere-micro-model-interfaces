package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_OnlineTrxHistory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OnlineTrxHistory {

  /** TableName=C_OnlineTrxHistory */
  String Table_Name = "C_OnlineTrxHistory";

  /** AD_Table_ID=200032 */
  int Table_ID = 200032;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name C_OnlineTrxHistory_ID */
  String COLUMNNAME_C_OnlineTrxHistory_ID = "C_OnlineTrxHistory_ID";
  /** Column name C_OnlineTrxHistory_UU */
  String COLUMNNAME_C_OnlineTrxHistory_UU = "C_OnlineTrxHistory_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsError */
  String COLUMNNAME_IsError = "IsError";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
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

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Online Transaction History */
  int getC_OnlineTrxHistory_ID();

  /** Set Online Transaction History */
  void setC_OnlineTrxHistory_ID(int C_OnlineTrxHistory_ID);

  /** Get C_OnlineTrxHistory_UU */
  String getC_OnlineTrxHistory_UU();

  /** Set C_OnlineTrxHistory_UU */
  void setC_OnlineTrxHistory_UU(String C_OnlineTrxHistory_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Error. An Error occurred in the execution */
  void setIsError(boolean IsError);

  /** Get Error. An Error occurred in the execution */
  boolean isError();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
