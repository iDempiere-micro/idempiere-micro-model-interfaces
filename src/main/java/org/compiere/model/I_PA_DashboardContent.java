package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_DashboardContent
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_DashboardContent {

  /** TableName=PA_DashboardContent */
  String Table_Name = "PA_DashboardContent";

  /** AD_Table_ID=50010 */
  int Table_ID = 50010;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Chart_ID */
  String COLUMNNAME_AD_Chart_ID = "AD_Chart_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name ColumnNo */
  String COLUMNNAME_ColumnNo = "ColumnNo";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GoalDisplay */
  String COLUMNNAME_GoalDisplay = "GoalDisplay";
  /** Column name HTML */
  String COLUMNNAME_HTML = "HTML";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCollapsedByDefault */
  String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";
  /** Column name IsCollapsible */
  String COLUMNNAME_IsCollapsible = "IsCollapsible";
  /** Column name IsEmbedReportContent */
  String COLUMNNAME_IsEmbedReportContent = "IsEmbedReportContent";
  /** Column name IsShowInDashboard */
  String COLUMNNAME_IsShowInDashboard = "IsShowInDashboard";
  /** Column name IsShowinLogin */
  String COLUMNNAME_IsShowinLogin = "IsShowinLogin";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name PA_DashboardContent_ID */
  String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";
  /** Column name PA_DashboardContent_UU */
  String COLUMNNAME_PA_DashboardContent_UU = "PA_DashboardContent_UU";
  /** Column name PA_Goal_ID */
  String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";
  /** Column name ProcessParameters */
  String COLUMNNAME_ProcessParameters = "ProcessParameters";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ZulFilePath */
  String COLUMNNAME_ZulFilePath = "ZulFilePath";

  /** Get Chart */
  int getAD_Chart_ID();

  /** Set Chart */
  void setAD_Chart_ID(int AD_Chart_ID);

  I_AD_Chart getAD_Chart() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process. Process or Report */
  int getAD_Process_ID();

  /** Set Process. Process or Report */
  void setAD_Process_ID(int AD_Process_ID);

  I_AD_Process getAD_Process() throws RuntimeException;

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  I_AD_Role getAD_Role() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Column No. Dashboard content column number */
  int getColumnNo();

  /** Set Column No. Dashboard content column number */
  void setColumnNo(int ColumnNo);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Goal Display. Type of goal display on dashboard */
  String getGoalDisplay();

  /** Set Goal Display. Type of goal display on dashboard */
  void setGoalDisplay(String GoalDisplay);

  /** Get HTML */
  String getHTML();

  /** Set HTML */
  void setHTML(String HTML);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Collapsed By Default. Flag to set the initial state of collapsible field group. */
  void setIsCollapsedByDefault(boolean IsCollapsedByDefault);

  /** Get Collapsed By Default. Flag to set the initial state of collapsible field group. */
  boolean isCollapsedByDefault();

  /** Set Collapsible. Flag to indicate the state of the dashboard panel */
  void setIsCollapsible(boolean IsCollapsible);

  /** Get Collapsible. Flag to indicate the state of the dashboard panel */
  boolean isCollapsible();

  /** Set Embed Report Content. Embed report content into dashboard */
  void setIsEmbedReportContent(boolean IsEmbedReportContent);

  /** Get Embed Report Content. Embed report content into dashboard */
  boolean isEmbedReportContent();

  /** Set Show in Dashboard. Show the dashlet in the dashboard */
  void setIsShowInDashboard(boolean IsShowInDashboard);

  /** Get Show in Dashboard. Show the dashlet in the dashboard */
  boolean isShowInDashboard();

  /** Set Show on Login */
  void setIsShowinLogin(boolean IsShowinLogin);

  /** Get Show on Login */
  boolean isShowinLogin();

  /** Get Line No. Unique line for this document */
  BigDecimal getLine();

  /** Set Line No. Unique line for this document */
  void setLine(BigDecimal Line);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Dashboard Content */
  int getPA_DashboardContent_ID();

  /** Set Dashboard Content */
  void setPA_DashboardContent_ID(int PA_DashboardContent_ID);

  /** Get PA_DashboardContent_UU */
  String getPA_DashboardContent_UU();

  /** Set PA_DashboardContent_UU */
  void setPA_DashboardContent_UU(String PA_DashboardContent_UU);

  /** Get Goal. Performance Goal */
  int getPA_Goal_ID();

  /** Set Goal. Performance Goal */
  void setPA_Goal_ID(int PA_Goal_ID);

  I_PA_Goal getPA_Goal() throws RuntimeException;

  /** Get Process Parameters. Comma separated process parameter list */
  String getProcessParameters();

  /** Set Process Parameters. Comma separated process parameter list */
  void setProcessParameters(String ProcessParameters);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Gadget URI. URI for Dashboard Gadget */
  String getZulFilePath();

  /** Set Gadget URI. URI for Dashboard Gadget */
  void setZulFilePath(String ZulFilePath);
}
