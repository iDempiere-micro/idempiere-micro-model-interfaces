package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for EXP_ProcessorParameter
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_EXP_ProcessorParameter {

  /** TableName=EXP_ProcessorParameter */
  String Table_Name = "EXP_ProcessorParameter";

  /** AD_Table_ID=53075 */
  int Table_ID = 53075;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

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
  /** Column name EXP_ProcessorParameter_ID */
  String COLUMNNAME_EXP_ProcessorParameter_ID = "EXP_ProcessorParameter_ID";
  /** Column name EXP_ProcessorParameter_UU */
  String COLUMNNAME_EXP_ProcessorParameter_UU = "EXP_ProcessorParameter_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ParameterValue */
  String COLUMNNAME_ParameterValue = "ParameterValue";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

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

  I_EXP_Processor getEXP_Processor() throws RuntimeException;

  /** Get Processor Parameter */
  int getEXP_ProcessorParameter_ID();

  /** Set Processor Parameter */
  void setEXP_ProcessorParameter_ID(int EXP_ProcessorParameter_ID);

  /** Get EXP_ProcessorParameter_UU */
  String getEXP_ProcessorParameter_UU();

  /** Set EXP_ProcessorParameter_UU */
  void setEXP_ProcessorParameter_UU(String EXP_ProcessorParameter_UU);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Parameter Value */
  String getParameterValue();

  /** Set Parameter Value */
  void setParameterValue(String ParameterValue);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
