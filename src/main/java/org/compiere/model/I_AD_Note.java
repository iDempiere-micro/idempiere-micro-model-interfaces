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
    /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_WF_Activity_ID */
  String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
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

    /** Get Broadcast Message. Broadcast Message */
  int getAD_BroadcastMessage_ID();

    /** Get Message. System Message */
  int getAD_Message_ID();

  /** Set Message. System Message */
  void setAD_Message_ID(int AD_Message_ID);

    /** Get Notice. System Notice */
  int getAD_Note_ID();

    /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

    /** Get Workflow Activity. Workflow Activity */
  int getAD_WF_Activity_ID();

    /** Set Description. Optional short description of the record */
  void setDescription(String Description);

    /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Set Process Now */
  void setProcessing(boolean Processing);

    /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Reference. Reference for this record */
  String getReference();

  /** Set Reference. Reference for this record */
  void setReference(String Reference);

    /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

}
