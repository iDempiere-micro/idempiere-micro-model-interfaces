package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AlertProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AlertProcessorLog {

  /** TableName=AD_AlertProcessorLog */
  String Table_Name = "AD_AlertProcessorLog";

  /** AD_Table_ID=699 */
  int Table_ID = 699;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_AlertProcessor_ID */
  String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";
  /** Column name AD_AlertProcessorLog_ID */
  String COLUMNNAME_AD_AlertProcessorLog_ID = "AD_AlertProcessorLog_ID";
  /** Column name AD_AlertProcessorLog_UU */
  String COLUMNNAME_AD_AlertProcessorLog_UU = "AD_AlertProcessorLog_UU";
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

  /** Get Alert Processor. Alert Processor/Server Parameter */
  int getAD_AlertProcessor_ID();

  /** Set Alert Processor. Alert Processor/Server Parameter */
  void setAD_AlertProcessor_ID(int AD_AlertProcessor_ID);

  I_AD_AlertProcessor getAD_AlertProcessor() throws RuntimeException;

  /** Get Alert Processor Log. Result of the execution of the Alert Processor */
  int getAD_AlertProcessorLog_ID();

  /** Set Alert Processor Log. Result of the execution of the Alert Processor */
  void setAD_AlertProcessorLog_ID(int AD_AlertProcessorLog_ID);

  /** Get AD_AlertProcessorLog_UU */
  String getAD_AlertProcessorLog_UU();

  /** Set AD_AlertProcessorLog_UU */
  void setAD_AlertProcessorLog_UU(String AD_AlertProcessorLog_UU);

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
