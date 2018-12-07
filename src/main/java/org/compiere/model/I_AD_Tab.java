package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Tab
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Tab {

  /** TableName=AD_Tab */
  String Table_Name = "AD_Tab";

  /** AD_Table_ID=106 */
  int Table_ID = 106;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_ColumnSortOrder_ID */
  String COLUMNNAME_AD_ColumnSortOrder_ID = "AD_ColumnSortOrder_ID";
  /** Column name AD_ColumnSortYesNo_ID */
  String COLUMNNAME_AD_ColumnSortYesNo_ID = "AD_ColumnSortYesNo_ID";
  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_Tab_UU */
  String COLUMNNAME_AD_Tab_UU = "AD_Tab_UU";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name CommitWarning */
  String COLUMNNAME_CommitWarning = "CommitWarning";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name HasTree */
  String COLUMNNAME_HasTree = "HasTree";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name ImportFields */
  String COLUMNNAME_ImportFields = "ImportFields";
  /** Column name Included_Tab_ID */
  String COLUMNNAME_Included_Tab_ID = "Included_Tab_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAdvancedTab */
  String COLUMNNAME_IsAdvancedTab = "IsAdvancedTab";
  /** Column name IsInfoTab */
  String COLUMNNAME_IsInfoTab = "IsInfoTab";
  /** Column name IsInsertRecord */
  String COLUMNNAME_IsInsertRecord = "IsInsertRecord";
  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";
  /** Column name IsSingleRow */
  String COLUMNNAME_IsSingleRow = "IsSingleRow";
  /** Column name IsSortTab */
  String COLUMNNAME_IsSortTab = "IsSortTab";
  /** Column name IsTranslationTab */
  String COLUMNNAME_IsTranslationTab = "IsTranslationTab";
  /** Column name OrderByClause */
  String COLUMNNAME_OrderByClause = "OrderByClause";
  /** Column name Parent_Column_ID */
  String COLUMNNAME_Parent_Column_ID = "Parent_Column_ID";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ReadOnlyLogic */
  String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name TabLevel */
  String COLUMNNAME_TabLevel = "TabLevel";
  /** Column name TreeDisplayedOn */
  String COLUMNNAME_TreeDisplayedOn = "TreeDisplayedOn";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Get Order Column. Column determining the order */
  int getAD_ColumnSortOrder_ID();

  /** Set Order Column. Column determining the order */
  void setAD_ColumnSortOrder_ID(int AD_ColumnSortOrder_ID);

  I_AD_Column getAD_ColumnSortOrder() throws RuntimeException;

  /** Get Included Column. Column determining if a Table Column is included in Ordering */
  int getAD_ColumnSortYesNo_ID();

  /** Set Included Column. Column determining if a Table Column is included in Ordering */
  void setAD_ColumnSortYesNo_ID(int AD_ColumnSortYesNo_ID);

  I_AD_Column getAD_ColumnSortYesNo() throws RuntimeException;

  /** Get Context Help */
  int getAD_CtxHelp_ID();

  /** Set Context Help */
  void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

  /** Get Image. Image or Icon */
  int getAD_Image_ID();

  /** Set Image. Image or Icon */
  void setAD_Image_ID(int AD_Image_ID);

  I_AD_Image getAD_Image() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get AD_Tab_UU */
  String getAD_Tab_UU();

  /** Set AD_Tab_UU */
  void setAD_Tab_UU(String AD_Tab_UU);

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Commit Warning. Warning displayed when saving */
  String getCommitWarning();

  /** Set Commit Warning. Warning displayed when saving */
  void setCommitWarning(String CommitWarning);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Get Has Tree. Window has Tree Graph */
  boolean isHasTree();

  /** Set Has Tree. Window has Tree Graph */
  void setHasTree(boolean HasTree);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Import Fields. Create Fields from Table Columns */
  String getImportFields();

  /** Set Import Fields. Create Fields from Table Columns */
  void setImportFields(String ImportFields);

  /** Get Included Tab. Included Tab in this Tab (Master Detail) */
  int getIncluded_Tab_ID();

  /** Set Included Tab. Included Tab in this Tab (Master Detail) */
  void setIncluded_Tab_ID(int Included_Tab_ID);

  I_AD_Tab getIncluded_Tab() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Advanced Tab. This Tab contains advanced Functionality */
  void setIsAdvancedTab(boolean IsAdvancedTab);

  /** Get Advanced Tab. This Tab contains advanced Functionality */
  boolean isAdvancedTab();

  /** Set Accounting Tab. This Tab contains accounting information */
  void setIsInfoTab(boolean IsInfoTab);

  /** Get Accounting Tab. This Tab contains accounting information */
  boolean isInfoTab();

  /** Set Insert Record. The user can insert a new Record */
  void setIsInsertRecord(boolean IsInsertRecord);

  /** Get Insert Record. The user can insert a new Record */
  boolean isInsertRecord();

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Set Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  void setIsSingleRow(boolean IsSingleRow);

  /** Get Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  boolean isSingleRow();

  /** Set Order Tab. The Tab determines the Order */
  void setIsSortTab(boolean IsSortTab);

  /** Get Order Tab. The Tab determines the Order */
  boolean isSortTab();

  /** Set TranslationTab. This Tab contains translation information */
  void setIsTranslationTab(boolean IsTranslationTab);

  /** Get TranslationTab. This Tab contains translation information */
  boolean isTranslationTab();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Sql ORDER BY. Fully qualified ORDER BY clause */
  String getOrderByClause();

  /** Set Sql ORDER BY. Fully qualified ORDER BY clause */
  void setOrderByClause(String OrderByClause);

  /** Get Parent Column. The link column on the parent tab. */
  int getParent_Column_ID();

  /** Set Parent Column. The link column on the parent tab. */
  void setParent_Column_ID(int Parent_Column_ID);

  I_AD_Column getParent_Column() throws RuntimeException;

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

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

  /** Get Tab Level. Hierarchical Tab Level (0 = top) */
  int getTabLevel();

  /** Set Tab Level. Hierarchical Tab Level (0 = top) */
  void setTabLevel(int TabLevel);

  /** Get Tree displayed. The tree can be displayed on master tab, detail tab or both */
  String getTreeDisplayedOn();

  /** Set Tree displayed. The tree can be displayed on master tab, detail tab or both */
  void setTreeDisplayedOn(String TreeDisplayedOn);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
