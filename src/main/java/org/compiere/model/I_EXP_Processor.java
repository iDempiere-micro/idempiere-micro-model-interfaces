package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for EXP_Processor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_EXP_Processor {

  /** TableName=EXP_Processor */
  String Table_Name = "EXP_Processor";

  /** AD_Table_ID=53074 */
  int Table_ID = 53074;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name Account */
  String COLUMNNAME_Account = "Account";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EXP_Processor_ID */
  String COLUMNNAME_EXP_Processor_ID = "EXP_Processor_ID";
  /** Column name EXP_Processor_Type_ID */
  String COLUMNNAME_EXP_Processor_Type_ID = "EXP_Processor_Type_ID";
  /** Column name EXP_Processor_UU */
  String COLUMNNAME_EXP_Processor_UU = "EXP_Processor_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name Host */
  String COLUMNNAME_Host = "Host";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PasswordInfo */
  String COLUMNNAME_PasswordInfo = "PasswordInfo";
  /** Column name Port */
  String COLUMNNAME_Port = "Port";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Get Account */
  String getAccount();

  /** Set Account */
  void setAccount(String Account);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Export Processor */
  int getEXP_Processor_ID();

  /** Set Export Processor */
  void setEXP_Processor_ID(int EXP_Processor_ID);

  /** Get Export Processor Type */
  int getEXP_Processor_Type_ID();

  /** Set Export Processor Type */
  void setEXP_Processor_Type_ID(int EXP_Processor_Type_ID);

  I_EXP_Processor_Type getEXP_Processor_Type() throws RuntimeException;

  /** Get EXP_Processor_UU */
  String getEXP_Processor_UU();

  /** Set EXP_Processor_UU */
  void setEXP_Processor_UU(String EXP_Processor_UU);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Host */
  String getHost();

  /** Set Host */
  void setHost(String Host);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Password Info */
  String getPasswordInfo();

  /** Set Password Info */
  void setPasswordInfo(String PasswordInfo);

  /** Get Port */
  int getPort();

  /** Set Port */
  void setPort(int Port);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
