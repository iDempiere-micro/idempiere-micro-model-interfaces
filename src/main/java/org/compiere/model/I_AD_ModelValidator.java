package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ModelValidator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ModelValidator {

  /** TableName=AD_ModelValidator */
  String Table_Name = "AD_ModelValidator";

  /** AD_Table_ID=53014 */
  int Table_ID = 53014;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_ModelValidator_ID */
  String COLUMNNAME_AD_ModelValidator_ID = "AD_ModelValidator_ID";
  /** Column name AD_ModelValidator_UU */
  String COLUMNNAME_AD_ModelValidator_UU = "AD_ModelValidator_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ModelValidationClass */
  String COLUMNNAME_ModelValidationClass = "ModelValidationClass";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Model Validator */
  int getAD_ModelValidator_ID();

  /** Set Model Validator */
  void setAD_ModelValidator_ID(int AD_ModelValidator_ID);

  /** Get AD_ModelValidator_UU */
  String getAD_ModelValidator_UU();

  /** Set AD_ModelValidator_UU */
  void setAD_ModelValidator_UU(String AD_ModelValidator_UU);

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

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Model Validation Class */
  String getModelValidationClass();

  /** Set Model Validation Class */
  void setModelValidationClass(String ModelValidationClass);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
