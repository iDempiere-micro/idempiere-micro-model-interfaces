package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DunningRun
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DunningRun {

  /** TableName=C_DunningRun */
  String Table_Name = "C_DunningRun";

  /** AD_Table_ID=526 */
  int Table_ID = 526;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Dunning_ID */
  String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
  /** Column name C_DunningLevel_ID */
  String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
  /** Column name C_DunningRun_ID */
  String COLUMNNAME_C_DunningRun_ID = "C_DunningRun_ID";
  /** Column name C_DunningRun_UU */
  String COLUMNNAME_C_DunningRun_UU = "C_DunningRun_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DunningDate */
  String COLUMNNAME_DunningDate = "DunningDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name SendIt */
  String COLUMNNAME_SendIt = "SendIt";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Dunning. Dunning Rules for overdue invoices */
  int getC_Dunning_ID();

  /** Set Dunning. Dunning Rules for overdue invoices */
  void setC_Dunning_ID(int C_Dunning_ID);

  I_C_Dunning getC_Dunning() throws RuntimeException;

  /** Get Dunning Level */
  int getC_DunningLevel_ID();

  /** Set Dunning Level */
  void setC_DunningLevel_ID(int C_DunningLevel_ID);

  I_C_DunningLevel getC_DunningLevel() throws RuntimeException;

  /** Get Dunning Run. Dunning Run */
  int getC_DunningRun_ID();

  /** Set Dunning Run. Dunning Run */
  void setC_DunningRun_ID(int C_DunningRun_ID);

  /** Get C_DunningRun_UU */
  String getC_DunningRun_UU();

  /** Set C_DunningRun_UU */
  void setC_DunningRun_UU(String C_DunningRun_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Dunning Date. Date of Dunning */
  Timestamp getDunningDate();

  /** Set Dunning Date. Date of Dunning */
  void setDunningDate(Timestamp DunningDate);

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

  /** Get Send */
  String getSendIt();

  /** Set Send */
  void setSendIt(String SendIt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
