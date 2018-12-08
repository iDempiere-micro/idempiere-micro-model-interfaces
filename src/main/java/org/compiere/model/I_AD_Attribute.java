package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Attribute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Attribute {

  /** TableName=AD_Attribute */
  String Table_Name = "AD_Attribute";

  /** AD_Table_ID=405 */
  int Table_ID = 405;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Attribute_ID */
  String COLUMNNAME_AD_Attribute_ID = "AD_Attribute_ID";
  /** Column name AD_Attribute_UU */
  String COLUMNNAME_AD_Attribute_UU = "AD_Attribute_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Reference_ID */
  String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
  /** Column name AD_Reference_Value_ID */
  String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_Val_Rule_ID */
  String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
  /** Column name Callout */
  String COLUMNNAME_Callout = "Callout";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DefaultValue */
  String COLUMNNAME_DefaultValue = "DefaultValue";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DisplayLength */
  String COLUMNNAME_DisplayLength = "DisplayLength";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name FieldLength */
  String COLUMNNAME_FieldLength = "FieldLength";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsEncrypted */
  String COLUMNNAME_IsEncrypted = "IsEncrypted";
  /** Column name IsFieldOnly */
  String COLUMNNAME_IsFieldOnly = "IsFieldOnly";
  /** Column name IsHeading */
  String COLUMNNAME_IsHeading = "IsHeading";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";
  /** Column name IsSameLine */
  String COLUMNNAME_IsSameLine = "IsSameLine";
  /** Column name IsUpdateable */
  String COLUMNNAME_IsUpdateable = "IsUpdateable";
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

  /** Get System Attribute */
  int getAD_Attribute_ID();

  /** Set System Attribute */
  void setAD_Attribute_ID(int AD_Attribute_ID);

  /** Get AD_Attribute_UU */
  String getAD_Attribute_UU();

  /** Set AD_Attribute_UU */
  void setAD_Attribute_UU(String AD_Attribute_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

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

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Set Dynamic Validation. Dynamic Validation Rule */
  void setAD_Val_Rule_ID(int AD_Val_Rule_ID);

  /** Get Dynamic Validation. Dynamic Validation Rule */
  int getValRule_ID();

  I_AD_Val_Rule getValRule() throws RuntimeException;

  /** Get Callout. Fully qualified class names and method - separated by semicolons */
  String getCallout();

  /** Set Callout. Fully qualified class names and method - separated by semicolons */
  void setCallout(String Callout);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Default Logic. Default value hierarchy, separated by ; */
  String getDefaultValue();

  /** Set Default Logic. Default value hierarchy, separated by ; */
  void setDefaultValue(String DefaultValue);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Display Length. Length of the display in characters */
  int getDisplayLength();

  /** Set Display Length. Length of the display in characters */
  void setDisplayLength(int DisplayLength);

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

  /** Set Encrypted. Display or Storage is encrypted */
  void setIsEncrypted(boolean IsEncrypted);

  /** Get Encrypted. Display or Storage is encrypted */
  boolean isEncrypted();

  /** Set Field Only. Label is not displayed */
  void setIsFieldOnly(boolean IsFieldOnly);

  /** Get Field Only. Label is not displayed */
  boolean isFieldOnly();

  /** Set Heading only. Field without Column - Only label is displayed */
  void setIsHeading(boolean IsHeading);

  /** Get Heading only. Field without Column - Only label is displayed */
  boolean isHeading();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Set Same Line. Displayed on same line as previous field */
  void setIsSameLine(boolean IsSameLine);

  /** Get Same Line. Displayed on same line as previous field */
  boolean isSameLine();

  /** Set Updatable. Determines, if the field can be updated */
  void setIsUpdateable(boolean IsUpdateable);

  /** Get Updatable. Determines, if the field can be updated */
  boolean isUpdateable();

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
