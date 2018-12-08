package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_WebProject
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_WebProject {

  /** TableName=CM_WebProject */
  String Table_Name = "CM_WebProject";

  /** AD_Table_ID=853 */
  int Table_ID = 853;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_TreeCMC_ID */
  String COLUMNNAME_AD_TreeCMC_ID = "AD_TreeCMC_ID";
  /** Column name AD_TreeCMM_ID */
  String COLUMNNAME_AD_TreeCMM_ID = "AD_TreeCMM_ID";
  /** Column name AD_TreeCMS_ID */
  String COLUMNNAME_AD_TreeCMS_ID = "AD_TreeCMS_ID";
  /** Column name AD_TreeCMT_ID */
  String COLUMNNAME_AD_TreeCMT_ID = "AD_TreeCMT_ID";
  /** Column name CM_WebProject_ID */
  String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
  /** Column name CM_WebProject_UU */
  String COLUMNNAME_CM_WebProject_UU = "CM_WebProject_UU";
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
  /** Column name Meta_Author */
  String COLUMNNAME_Meta_Author = "Meta_Author";
  /** Column name Meta_Content */
  String COLUMNNAME_Meta_Content = "Meta_Content";
  /** Column name Meta_Copyright */
  String COLUMNNAME_Meta_Copyright = "Meta_Copyright";
  /** Column name Meta_Publisher */
  String COLUMNNAME_Meta_Publisher = "Meta_Publisher";
  /** Column name Meta_RobotsTag */
  String COLUMNNAME_Meta_RobotsTag = "Meta_RobotsTag";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Container Tree. Container Tree */
  int getAD_TreeCMC_ID();

  /** Set Container Tree. Container Tree */
  void setAD_TreeCMC_ID(int AD_TreeCMC_ID);

  I_AD_Tree getAD_TreeCMC() throws RuntimeException;

  /** Get Media Tree. Media Tree */
  int getAD_TreeCMM_ID();

  /** Set Media Tree. Media Tree */
  void setAD_TreeCMM_ID(int AD_TreeCMM_ID);

  I_AD_Tree getAD_TreeCMM() throws RuntimeException;

  /** Get Stage Tree. Stage Tree */
  int getAD_TreeCMS_ID();

  /** Set Stage Tree. Stage Tree */
  void setAD_TreeCMS_ID(int AD_TreeCMS_ID);

  I_AD_Tree getAD_TreeCMS() throws RuntimeException;

  /** Get Template Tree. Template Tree */
  int getAD_TreeCMT_ID();

  /** Set Template Tree. Template Tree */
  void setAD_TreeCMT_ID(int AD_TreeCMT_ID);

  I_AD_Tree getAD_TreeCMT() throws RuntimeException;

  /**
   * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  int getCM_WebProject_ID();

  /**
   * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  void setCM_WebProject_ID(int CM_WebProject_ID);

  /** Get CM_WebProject_UU */
  String getCM_WebProject_UU();

  /** Set CM_WebProject_UU */
  void setCM_WebProject_UU(String CM_WebProject_UU);

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

  /** Get Meta Author. Author of the content */
  String getMeta_Author();

  /** Set Meta Author. Author of the content */
  void setMeta_Author(String Meta_Author);

  /** Get Meta Content Type. Defines the type of content i.e. "text/html; charset=UTF-8" */
  String getMeta_Content();

  /** Set Meta Content Type. Defines the type of content i.e. "text/html; charset=UTF-8" */
  void setMeta_Content(String Meta_Content);

  /** Get Meta Copyright. Contains Copyright information for the content */
  String getMeta_Copyright();

  /** Set Meta Copyright. Contains Copyright information for the content */
  void setMeta_Copyright(String Meta_Copyright);

  /** Get Meta Publisher. Meta Publisher defines the publisher of the content */
  String getMeta_Publisher();

  /** Set Meta Publisher. Meta Publisher defines the publisher of the content */
  void setMeta_Publisher(String Meta_Publisher);

  /** Get Meta RobotsTag. RobotsTag defines how search robots should handle this content */
  String getMeta_RobotsTag();

  /** Set Meta RobotsTag. RobotsTag defines how search robots should handle this content */
  void setMeta_RobotsTag(String Meta_RobotsTag);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
