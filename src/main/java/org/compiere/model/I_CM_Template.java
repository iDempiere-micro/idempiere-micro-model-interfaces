package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Template
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Template {

  /** TableName=CM_Template */
  String Table_Name = "CM_Template";

  /** AD_Table_ID=854 */
  int Table_ID = 854;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_Template_ID */
  String COLUMNNAME_CM_Template_ID = "CM_Template_ID";
  /** Column name CM_Template_UU */
  String COLUMNNAME_CM_Template_UU = "CM_Template_UU";
  /** Column name CM_WebProject_ID */
  String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Elements */
  String COLUMNNAME_Elements = "Elements";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsInclude */
  String COLUMNNAME_IsInclude = "IsInclude";
  /** Column name IsNews */
  String COLUMNNAME_IsNews = "IsNews";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name IsUseAd */
  String COLUMNNAME_IsUseAd = "IsUseAd";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name TemplateXST */
  String COLUMNNAME_TemplateXST = "TemplateXST";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Template. Template defines how content is displayed */
  int getCM_Template_ID();

  /** Set Template. Template defines how content is displayed */
  void setCM_Template_ID(int CM_Template_ID);

  /** Get CM_Template_UU */
  String getCM_Template_UU();

  /** Set CM_Template_UU */
  void setCM_Template_UU(String CM_Template_UU);

  /**
   * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  int getCM_WebProject_ID();

  /**
   * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  void setCM_WebProject_ID(int CM_WebProject_ID);

  I_CM_WebProject getCM_WebProject() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Elements. Contains list of elements separated by CR */
  String getElements();

  /** Set Elements. Contains list of elements separated by CR */
  void setElements(String Elements);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Included. Defines whether this content / template is included into another one */
  void setIsInclude(boolean IsInclude);

  /** Get Included. Defines whether this content / template is included into another one */
  boolean isInclude();

  /** Set Uses News. Template or container uses news channels */
  void setIsNews(boolean IsNews);

  /** Get Uses News. Template or container uses news channels */
  boolean isNews();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Set Use Ad. Whether or not this templates uses Ad's */
  void setIsUseAd(boolean IsUseAd);

  /** Get Use Ad. Whether or not this templates uses Ad's */
  boolean isUseAd();

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get TemplateXST. Contains the template code itself */
  String getTemplateXST();

  /** Set TemplateXST. Contains the template code itself */
  void setTemplateXST(String TemplateXST);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
