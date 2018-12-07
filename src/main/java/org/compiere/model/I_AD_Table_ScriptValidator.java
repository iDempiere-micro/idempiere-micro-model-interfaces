package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Table_ScriptValidator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Table_ScriptValidator {

  /** TableName=AD_Table_ScriptValidator */
  String Table_Name = "AD_Table_ScriptValidator";

  /** AD_Table_ID=53059 */
  int Table_ID = 53059;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Rule_ID */
  String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_Table_ScriptValidator_ID */
  String COLUMNNAME_AD_Table_ScriptValidator_ID = "AD_Table_ScriptValidator_ID";
  /** Column name AD_Table_ScriptValidator_UU */
  String COLUMNNAME_AD_Table_ScriptValidator_UU = "AD_Table_ScriptValidator_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EventModelValidator */
  String COLUMNNAME_EventModelValidator = "EventModelValidator";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Rule */
  int getAD_Rule_ID();

  /** Set Rule */
  void setAD_Rule_ID(int AD_Rule_ID);

  I_AD_Rule getAD_Rule() throws RuntimeException;

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Table Script Validator */
  int getAD_Table_ScriptValidator_ID();

  /** Set Table Script Validator */
  void setAD_Table_ScriptValidator_ID(int AD_Table_ScriptValidator_ID);

  /** Get AD_Table_ScriptValidator_UU */
  String getAD_Table_ScriptValidator_UU();

  /** Set AD_Table_ScriptValidator_UU */
  void setAD_Table_ScriptValidator_UU(String AD_Table_ScriptValidator_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Event Model Validator */
  String getEventModelValidator();

  /** Set Event Model Validator */
  void setEventModelValidator(String EventModelValidator);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
