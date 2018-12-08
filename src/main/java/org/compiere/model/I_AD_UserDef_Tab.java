package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserDef_Tab
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserDef_Tab {

  /** TableName=AD_UserDef_Tab */
  String Table_Name = "AD_UserDef_Tab";

  /** AD_Table_ID=466 */
  int Table_ID = 466;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_UserDef_Tab_ID */
  String COLUMNNAME_AD_UserDef_Tab_ID = "AD_UserDef_Tab_ID";
  /** Column name AD_UserDef_Tab_UU */
  String COLUMNNAME_AD_UserDef_Tab_UU = "AD_UserDef_Tab_UU";
  /** Column name AD_UserDef_Win_ID */
  String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsMultiRowOnly */
  String COLUMNNAME_IsMultiRowOnly = "IsMultiRowOnly";
  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";
  /** Column name IsSingleRow */
  String COLUMNNAME_IsSingleRow = "IsSingleRow";
  /** Column name ReadOnlyLogic */
  String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get User defined Tab */
  int getAD_UserDef_Tab_ID();

  /** Set User defined Tab */
  void setAD_UserDef_Tab_ID(int AD_UserDef_Tab_ID);

  /** Get AD_UserDef_Tab_UU */
  String getAD_UserDef_Tab_UU();

  /** Set AD_UserDef_Tab_UU */
  void setAD_UserDef_Tab_UU(String AD_UserDef_Tab_UU);

  /** Get User defined Window */
  int getAD_UserDef_Win_ID();

  /** Set User defined Window */
  void setAD_UserDef_Win_ID(int AD_UserDef_Win_ID);

  I_AD_UserDef_Win getAD_UserDef_Win() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Multi Row Only. This applies to Multi-Row view only */
  void setIsMultiRowOnly(boolean IsMultiRowOnly);

  /** Get Multi Row Only. This applies to Multi-Row view only */
  boolean isMultiRowOnly();

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Set Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  void setIsSingleRow(boolean IsSingleRow);

  /** Get Single Row Layout. Default for toggle between Single- and Multi-Row (Grid) Layout */
  boolean isSingleRow();

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
