package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Note
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Note {

  /** TableName=AD_Note */
  String Table_Name = "AD_Note";

  /** AD_Table_ID=389 */
  int Table_ID = 389;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_BroadcastMessage_ID */
  String COLUMNNAME_AD_BroadcastMessage_ID = "AD_BroadcastMessage_ID";
  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
  /** Column name AD_Note_ID */
  String COLUMNNAME_AD_Note_ID = "AD_Note_ID";
  /** Column name AD_Note_UU */
  String COLUMNNAME_AD_Note_UU = "AD_Note_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_WF_Activity_ID */
  String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name Reference */
  String COLUMNNAME_Reference = "Reference";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Broadcast Message. Broadcast Message */
  int getAD_BroadcastMessage_ID();

  /** Set Broadcast Message. Broadcast Message */
  void setAD_BroadcastMessage_ID(int AD_BroadcastMessage_ID);

  I_AD_BroadcastMessage getAD_BroadcastMessage() throws RuntimeException;

  /** Get Message. System Message */
  int getAD_Message_ID();

  /** Set Message. System Message */
  void setAD_Message_ID(int AD_Message_ID);

  I_AD_Message getAD_Message() throws RuntimeException;

  /** Get Notice. System Notice */
  int getAD_Note_ID();

  /** Set Notice. System Notice */
  void setAD_Note_ID(int AD_Note_ID);

  /** Get AD_Note_UU */
  String getAD_Note_UU();

  /** Set AD_Note_UU */
  void setAD_Note_UU(String AD_Note_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Workflow Activity. Workflow Activity */
  int getAD_WF_Activity_ID();

  /** Set Workflow Activity. Workflow Activity */
  void setAD_WF_Activity_ID(int AD_WF_Activity_ID);

  I_AD_WF_Activity getAD_WF_Activity() throws RuntimeException;

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

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Reference. Reference for this record */
  String getReference();

  /** Set Reference. Reference for this record */
  void setReference(String Reference);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
