package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_InfoColumn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_InfoColumn {

  /** TableName=AD_InfoColumn */
  String Table_Name = "AD_InfoColumn";

  /** AD_Table_ID=897 */
  int Table_ID = 897;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Element_ID */
  String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
  /** Column name AD_InfoColumn_ID */
  String COLUMNNAME_AD_InfoColumn_ID = "AD_InfoColumn_ID";
  /** Column name AD_InfoColumn_UU */
  String COLUMNNAME_AD_InfoColumn_UU = "AD_InfoColumn_UU";
  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsDisplayed */
  String COLUMNNAME_IsDisplayed = "IsDisplayed";
  /** Column name IsIdentifier */
  String COLUMNNAME_IsIdentifier = "IsIdentifier";
  /** Column name IsKey */
  String COLUMNNAME_IsKey = "IsKey";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name IsQueryCriteria */
  String COLUMNNAME_IsQueryCriteria = "IsQueryCriteria";
  /** Column name QueryFunction */
  String COLUMNNAME_QueryFunction = "QueryFunction";
  /** Column name QueryOperator */
  String COLUMNNAME_QueryOperator = "QueryOperator";
  /** Column name SelectClause */
  String COLUMNNAME_SelectClause = "SelectClause";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name SeqNoSelection */
  String COLUMNNAME_SeqNoSelection = "SeqNoSelection";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

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

  /** Get Info Column. Info Window Column */
  int getAD_InfoColumn_ID();

  /** Set Info Column. Info Window Column */
  void setAD_InfoColumn_ID(int AD_InfoColumn_ID);

  /** Get AD_InfoColumn_UU */
  String getAD_InfoColumn_UU();

  /** Set AD_InfoColumn_UU */
  void setAD_InfoColumn_UU(String AD_InfoColumn_UU);

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

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

  /** Set Displayed. Determines, if this field is displayed */
  void setIsDisplayed(boolean IsDisplayed);

  /** Get Displayed. Determines, if this field is displayed */
  boolean isDisplayed();

  /** Set Identifier. This column is part of the record identifier */
  void setIsIdentifier(boolean IsIdentifier);

  /** Get Identifier. This column is part of the record identifier */
  boolean isIdentifier();

  /** Set Key column. This column is the key in this table */
  void setIsKey(boolean IsKey);

  /** Get Key column. This column is the key in this table */
  boolean isKey();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Set Query Criteria. The column is also used as a query criteria */
  void setIsQueryCriteria(boolean IsQueryCriteria);

  /** Get Query Criteria. The column is also used as a query criteria */
  boolean isQueryCriteria();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Query Function. Database function for query */
  String getQueryFunction();

  /** Set Query Function. Database function for query */
  void setQueryFunction(String QueryFunction);

  /** Get Query Operator. Operator for database query */
  String getQueryOperator();

  /** Set Query Operator. Operator for database query */
  void setQueryOperator(String QueryOperator);

  /** Get Sql SELECT. SQL SELECT clause */
  String getSelectClause();

  /** Set Sql SELECT. SQL SELECT clause */
  void setSelectClause(String SelectClause);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Selection Column Sequence. Selection Column Sequence */
  int getSeqNoSelection();

  /** Set Selection Column Sequence. Selection Column Sequence */
  void setSeqNoSelection(int SeqNoSelection);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
