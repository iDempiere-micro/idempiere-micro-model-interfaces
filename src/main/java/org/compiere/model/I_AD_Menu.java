package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Menu
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Menu {

  /** TableName=AD_Menu */
  String Table_Name = "AD_Menu";

  /** AD_Table_ID=116 */
  int Table_ID = 116;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name Action */
  String COLUMNNAME_Action = "Action";
  /** Column name AD_Form_ID */
  String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
  /** Column name AD_Menu_ID */
  String COLUMNNAME_AD_Menu_ID = "AD_Menu_ID";
  /** Column name AD_Menu_UU */
  String COLUMNNAME_AD_Menu_UU = "AD_Menu_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Task_ID */
  String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name AD_Workflow_ID */
  String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCentrallyMaintained */
  String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
  /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Action. Indicates the Action to be performed */
  String getAction();

  /** Set Action. Indicates the Action to be performed */
  void setAction(String Action);

  /** Get Special Form. Special Form */
  int getAD_Form_ID();

  /** Set Special Form. Special Form */
  void setAD_Form_ID(int AD_Form_ID);

  I_AD_Form getAD_Form() throws RuntimeException;

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

  /** Get Menu. Identifies a Menu */
  int getAD_Menu_ID();

  /** Set Menu. Identifies a Menu */
  void setAD_Menu_ID(int AD_Menu_ID);

  /** Get AD_Menu_UU */
  String getAD_Menu_UU();

  /** Set AD_Menu_UU */
  void setAD_Menu_UU(String AD_Menu_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get OS Task. Operation System Task */
  int getAD_Task_ID();

  /** Set OS Task. Operation System Task */
  void setAD_Task_ID(int AD_Task_ID);

  I_AD_Task getAD_Task() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Workflow. Workflow or combination of tasks */
  int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  void setAD_Workflow_ID(int AD_Workflow_ID);

  I_AD_Workflow getAD_Workflow() throws RuntimeException;

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Centrally maintained. Information maintained in System Element table */
  void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

  /** Get Centrally maintained. Information maintained in System Element table */
  boolean isCentrallyMaintained();

  /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
