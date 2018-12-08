package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ToolBarButton
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ToolBarButton {

  /** TableName=AD_ToolBarButton */
  String Table_Name = "AD_ToolBarButton";

  /** AD_Table_ID=200003 */
  int Table_ID = 200003;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name Action */
  String COLUMNNAME_Action = "Action";
  /** Column name ActionClassName */
  String COLUMNNAME_ActionClassName = "ActionClassName";
  /** Column name ActionName */
  String COLUMNNAME_ActionName = "ActionName";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_ToolBarButton_ID */
  String COLUMNNAME_AD_ToolBarButton_ID = "AD_ToolBarButton_ID";
  /** Column name AD_ToolBarButton_UU */
  String COLUMNNAME_AD_ToolBarButton_UU = "AD_ToolBarButton_UU";
  /** Column name ComponentName */
  String COLUMNNAME_ComponentName = "ComponentName";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DisplayLogic */
  String COLUMNNAME_DisplayLogic = "DisplayLogic";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAddSeparator */
  String COLUMNNAME_IsAddSeparator = "IsAddSeparator";
  /** Column name IsAdvancedButton */
  String COLUMNNAME_IsAdvancedButton = "IsAdvancedButton";
  /** Column name IsCustomization */
  String COLUMNNAME_IsCustomization = "IsCustomization";
  /** Column name KeyStroke_KeyCode */
  String COLUMNNAME_KeyStroke_KeyCode = "KeyStroke_KeyCode";
  /** Column name KeyStroke_Modifiers */
  String COLUMNNAME_KeyStroke_Modifiers = "KeyStroke_Modifiers";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Action. Indicates the Action to be performed */
  String getAction();

  /** Set Action. Indicates the Action to be performed */
  void setAction(String Action);

  /**
   * Get Service Component Name. The service component name that implements the interface for
   * toolbar actions
   */
  String getActionClassName();

  /**
   * Set Service Component Name. The service component name that implements the interface for
   * toolbar actions
   */
  void setActionClassName(String ActionClassName);

  /** Get Action Name. Action name on the toolbar */
  String getActionName();

  /** Set Action Name. Action name on the toolbar */
  void setActionName(String ActionName);

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

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get ToolBar Button */
  int getAD_ToolBarButton_ID();

  /** Set ToolBar Button */
  void setAD_ToolBarButton_ID(int AD_ToolBarButton_ID);

  /** Get AD_ToolBarButton_UU */
  String getAD_ToolBarButton_UU();

  /** Set AD_ToolBarButton_UU */
  void setAD_ToolBarButton_UU(String AD_ToolBarButton_UU);

  /** Get Component Name */
  String getComponentName();

  /** Set Component Name */
  void setComponentName(String ComponentName);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Add Separator */
  void setIsAddSeparator(boolean IsAddSeparator);

  /** Get Add Separator */
  boolean isAddSeparator();

  /** Set Advanced Button. This Button contains advanced Functionality */
  void setIsAdvancedButton(boolean IsAdvancedButton);

  /** Get Advanced Button. This Button contains advanced Functionality */
  boolean isAdvancedButton();

  /**
   * Set Customization. The change is a customization of the data dictionary and can be applied
   * after Migration
   */
  void setIsCustomization(boolean IsCustomization);

  /**
   * Get Customization. The change is a customization of the data dictionary and can be applied
   * after Migration
   */
  boolean isCustomization();

  /** Get KeyCode. KeyCode for shortcuts */
  int getKeyStroke_KeyCode();

  /** Set KeyCode. KeyCode for shortcuts */
  void setKeyStroke_KeyCode(int KeyStroke_KeyCode);

  /** Get Keystroke Modifiers. Keystroke Modifiers for shortcuts */
  int getKeyStroke_Modifiers();

  /** Set Keystroke Modifiers. Keystroke Modifiers for shortcuts */
  void setKeyStroke_Modifiers(int KeyStroke_Modifiers);

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
