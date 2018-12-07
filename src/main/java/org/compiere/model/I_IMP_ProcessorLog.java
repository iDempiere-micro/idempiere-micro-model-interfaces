package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for IMP_ProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_IMP_ProcessorLog {

  /** TableName=IMP_ProcessorLog */
  String Table_Name = "IMP_ProcessorLog";

  /** AD_Table_ID=53079 */
  int Table_ID = 53079;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BinaryData */
  String COLUMNNAME_BinaryData = "BinaryData";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IMP_Processor_ID */
  String COLUMNNAME_IMP_Processor_ID = "IMP_Processor_ID";
  /** Column name IMP_ProcessorLog_ID */
  String COLUMNNAME_IMP_ProcessorLog_ID = "IMP_ProcessorLog_ID";
  /** Column name IMP_ProcessorLog_UU */
  String COLUMNNAME_IMP_ProcessorLog_UU = "IMP_ProcessorLog_UU";
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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Import Processor */
  int getIMP_Processor_ID();

  /** Set Import Processor */
  void setIMP_Processor_ID(int IMP_Processor_ID);

  I_IMP_Processor getIMP_Processor() throws RuntimeException;

  /** Get Import Processor Log */
  int getIMP_ProcessorLog_ID();

  /** Set Import Processor Log */
  void setIMP_ProcessorLog_ID(int IMP_ProcessorLog_ID);

  /** Get IMP_ProcessorLog_UU */
  String getIMP_ProcessorLog_UU();

  /** Set IMP_ProcessorLog_UU */
  void setIMP_ProcessorLog_UU(String IMP_ProcessorLog_UU);

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
