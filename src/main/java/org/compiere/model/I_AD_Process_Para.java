package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Process_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Process_Para {

  /** TableName=AD_Process_Para */
  String Table_Name = "AD_Process_Para";

  /** AD_Table_ID=285 */
  int Table_ID = 285;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Element_ID */
  String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Process_Para_ID */
  String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
  /** Column name AD_Process_Para_UU */
  String COLUMNNAME_AD_Process_Para_UU = "AD_Process_Para_UU";
  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Reference_Value_ID */
  String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
  /** Column name ColumnName */
  String COLUMNNAME_ColumnName = "ColumnName";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DefaultValue */
  String COLUMNNAME_DefaultValue = "DefaultValue";
  /** Column name DefaultValue2 */
  String COLUMNNAME_DefaultValue2 = "DefaultValue2";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name FieldLength */
  String COLUMNNAME_FieldLength = "FieldLength";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsEncrypted */
  String COLUMNNAME_IsEncrypted = "IsEncrypted";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name IsRange */
  String COLUMNNAME_IsRange = "IsRange";
  /** Column name MandatoryLogic */
  String COLUMNNAME_MandatoryLogic = "MandatoryLogic";
  /** Column name ReadOnlyLogic */
  String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValueMax */
  String COLUMNNAME_ValueMax = "ValueMax";
  /** Column name ValueMin */
  String COLUMNNAME_ValueMin = "ValueMin";
  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /**
   * Get System Element. System Element enables the central maintenance of column description and
   * help.
   */
  int getAD_Element_ID();

  /**
   * Set System Element. System Element enables the central maintenance of column description and
   * help.
   */
  void setAD_Element_ID(int AD_Element_ID);

  I_AD_Element getAD_Element() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get Process Parameter */
  int getAD_Process_Para_ID();

  /** Set Process Parameter */
  void setAD_Process_Para_ID(int AD_Process_Para_ID);

  /** Get AD_Process_Para_UU */
  String getAD_Process_Para_UU();

  /** Set AD_Process_Para_UU */
  void setAD_Process_Para_UU(String AD_Process_Para_UU);

  /** Get Reference. System Reference and Validation */
  int getAD_Reference_ID();

  /** Set Reference. System Reference and Validation */
  void setAD_Reference_ID(int AD_Reference_ID);

  I_AD_Reference getAD_Reference() throws RuntimeException;

  /** Get Reference Key. Required to specify, if data type is Table or List */
  int getAD_Reference_Value_ID();

  /** Set Reference Key. Required to specify, if data type is Table or List */
  void setAD_Reference_Value_ID(int AD_Reference_Value_ID);

  I_AD_Reference getAD_Reference_Value() throws RuntimeException;

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

  /** Get DB Column Name. Name of the column in the database */
  String getColumnName();

  /** Set DB Column Name. Name of the column in the database */
  void setColumnName(String ColumnName);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Default Logic. Default value hierarchy, separated by ; */
  String getDefaultValue();

  /** Set Default Logic. Default value hierarchy, separated by ; */
  void setDefaultValue(String DefaultValue);

  /** Get Default Logic 2. Default value hierarchy, separated by ; */
  String getDefaultValue2();

  /** Set Default Logic 2. Default value hierarchy, separated by ; */
  void setDefaultValue2(String DefaultValue2);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /**
   * Get Display Logic. If the Field is displayed, the result determines if the field is actually
   * displayed
   */
  String getDisplayLogic();

  /**
   * Set Display Logic. If the Field is displayed, the result determines if the field is actually
   * displayed
   */
  void setDisplayLogic(String DisplayLogic);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Length. Length of the column in the database */
  int getFieldLength();

  /** Set Length. Length of the column in the database */
  void setFieldLength(int FieldLength);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

  /** Get Centrally maintained. Information maintained in System Element table */
  boolean isCentrallyMaintained();

  /** Set Encrypted. Display or Storage is encrypted */
  void setIsEncrypted(boolean IsEncrypted);

  /** Get Encrypted. Display or Storage is encrypted */
  boolean isEncrypted();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Set Range. The parameter is a range of values */
  void setIsRange(boolean IsRange);

  /** Get Range. The parameter is a range of values */
  boolean isRange();

  /** Get Mandatory Logic */
  String getMandatoryLogic();

  /** Set Mandatory Logic */
  void setMandatoryLogic(String MandatoryLogic);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /**
   * Get Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  String getReadOnlyLogic();

  /**
   * Set Read Only Logic. Logic to determine if field is read only (applies only when field is
   * read-write)
   */
  void setReadOnlyLogic(String ReadOnlyLogic);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Max. Value. Maximum Value for a field */
  String getValueMax();

  /** Set Max. Value. Maximum Value for a field */
  void setValueMax(String ValueMax);

  /** Get Min. Value. Minimum Value for a field */
  String getValueMin();

  /** Set Min. Value. Minimum Value for a field */
  void setValueMin(String ValueMin);

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);
}
