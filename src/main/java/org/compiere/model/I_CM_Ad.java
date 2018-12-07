package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Ad
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Ad {

  /** TableName=CM_Ad */
  String Table_Name = "CM_Ad";

  /** AD_Table_ID=858 */
  int Table_ID = 858;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name ActualClick */
  String COLUMNNAME_ActualClick = "ActualClick";
  /** Column name ActualImpression */
  String COLUMNNAME_ActualImpression = "ActualImpression";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_Ad_Cat_ID */
  String COLUMNNAME_CM_Ad_Cat_ID = "CM_Ad_Cat_ID";
  /** Column name CM_Ad_ID */
  String COLUMNNAME_CM_Ad_ID = "CM_Ad_ID";
  /** Column name CM_Ad_UU */
  String COLUMNNAME_CM_Ad_UU = "CM_Ad_UU";
  /** Column name CM_Media_ID */
  String COLUMNNAME_CM_Media_ID = "CM_Media_ID";
  /** Column name ContentHTML */
  String COLUMNNAME_ContentHTML = "ContentHTML";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAdFlag */
  String COLUMNNAME_IsAdFlag = "IsAdFlag";
  /** Column name IsLogged */
  String COLUMNNAME_IsLogged = "IsLogged";
  /** Column name MaxClick */
  String COLUMNNAME_MaxClick = "MaxClick";
  /** Column name MaxImpression */
  String COLUMNNAME_MaxImpression = "MaxImpression";
  /** Column name StartDate */
  String COLUMNNAME_StartDate = "StartDate";
  /** Column name StartImpression */
  String COLUMNNAME_StartImpression = "StartImpression";
  /** Column name Target_Frame */
  String COLUMNNAME_Target_Frame = "Target_Frame";
  /** Column name TargetURL */
  String COLUMNNAME_TargetURL = "TargetURL";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Actual Click Count. How many clicks have been counted */
  int getActualClick();

  /** Set Actual Click Count. How many clicks have been counted */
  void setActualClick(int ActualClick);

  /** Get Actual Impression Count. How many impressions have been counted */
  int getActualImpression();

  /** Set Actual Impression Count. How many impressions have been counted */
  void setActualImpression(int ActualImpression);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Advertisement Category. Advertisement Category like Banner Homepage */
  int getCM_Ad_Cat_ID();

  /** Set Advertisement Category. Advertisement Category like Banner Homepage */
  void setCM_Ad_Cat_ID(int CM_Ad_Cat_ID);

  I_CM_Ad_Cat getCM_Ad_Cat() throws RuntimeException;

  /** Get Advertisement. An Advertisement is something like a banner */
  int getCM_Ad_ID();

  /** Set Advertisement. An Advertisement is something like a banner */
  void setCM_Ad_ID(int CM_Ad_ID);

  /** Get CM_Ad_UU */
  String getCM_Ad_UU();

  /** Set CM_Ad_UU */
  void setCM_Ad_UU(String CM_Ad_UU);

  /** Get Media Item. Contains media content like images, flash movies etc. */
  int getCM_Media_ID();

  /** Set Media Item. Contains media content like images, flash movies etc. */
  void setCM_Media_ID(int CM_Media_ID);

  I_CM_Media getCM_Media() throws RuntimeException;

  /** Get Content HTML. Contains the content itself */
  String getContentHTML();

  /** Set Content HTML. Contains the content itself */
  void setContentHTML(String ContentHTML);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get End Date. Last effective date (inclusive) */
  Timestamp getEndDate();

  /** Set End Date. Last effective date (inclusive) */
  void setEndDate(Timestamp EndDate);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Special AD Flag. Do we need to specially mention this ad? */
  void setIsAdFlag(boolean IsAdFlag);

  /** Get Special AD Flag. Do we need to specially mention this ad? */
  boolean isAdFlag();

  /** Set Logging. Do we need to log the banner impressions and clicks? (needs much performance) */
  void setIsLogged(boolean IsLogged);

  /** Get Logging. Do we need to log the banner impressions and clicks? (needs much performance) */
  boolean isLogged();

  /** Get Max Click Count. Maximum Click Count until banner is deactivated */
  int getMaxClick();

  /** Set Max Click Count. Maximum Click Count until banner is deactivated */
  void setMaxClick(int MaxClick);

  /** Get Max Impression Count. Maximum Impression Count until banner is deactivated */
  int getMaxImpression();

  /** Set Max Impression Count. Maximum Impression Count until banner is deactivated */
  void setMaxImpression(int MaxImpression);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Start Date. First effective day (inclusive) */
  Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  void setStartDate(Timestamp StartDate);

  /** Get Start Count Impression. For rotation we need a start count */
  int getStartImpression();

  /** Set Start Count Impression. For rotation we need a start count */
  void setStartImpression(int StartImpression);

  /** Get Target Frame. Which target should be used if user clicks? */
  String getTarget_Frame();

  /** Set Target Frame. Which target should be used if user clicks? */
  void setTarget_Frame(String Target_Frame);

  /** Get Target URL. URL for the Target */
  String getTargetURL();

  /** Set Target URL. URL for the Target */
  void setTargetURL(String TargetURL);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
