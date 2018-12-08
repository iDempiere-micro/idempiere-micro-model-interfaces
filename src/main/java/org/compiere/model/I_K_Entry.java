package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Entry
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Entry {

  /** TableName=K_Entry */
  String Table_Name = "K_Entry";

  /** AD_Table_ID=612 */
  int Table_ID = 612;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Session_ID */
  String COLUMNNAME_AD_Session_ID = "AD_Session_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DescriptionURL */
  String COLUMNNAME_DescriptionURL = "DescriptionURL";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPublic */
  String COLUMNNAME_IsPublic = "IsPublic";
  /** Column name K_Entry_ID */
  String COLUMNNAME_K_Entry_ID = "K_Entry_ID";
  /** Column name K_Entry_UU */
  String COLUMNNAME_K_Entry_UU = "K_Entry_UU";
  /** Column name Keywords */
  String COLUMNNAME_Keywords = "Keywords";
  /** Column name K_Source_ID */
  String COLUMNNAME_K_Source_ID = "K_Source_ID";
  /** Column name K_Topic_ID */
  String COLUMNNAME_K_Topic_ID = "K_Topic_ID";
  /** Column name Rating */
  String COLUMNNAME_Rating = "Rating";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidTo */
  String COLUMNNAME_ValidTo = "ValidTo";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Session. User Session Online or Web */
  int getAD_Session_ID();

  /** Set Session. User Session Online or Web */
  void setAD_Session_ID(int AD_Session_ID);

  I_AD_Session getAD_Session() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description URL. URL for the description */
  String getDescriptionURL();

  /** Set Description URL. URL for the description */
  void setDescriptionURL(String DescriptionURL);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Public. Public can read entry */
  void setIsPublic(boolean IsPublic);

  /** Get Public. Public can read entry */
  boolean isPublic();

  /** Get Entry. Knowledge Entry */
  int getK_Entry_ID();

  /** Set Entry. Knowledge Entry */
  void setK_Entry_ID(int K_Entry_ID);

  /** Get K_Entry_UU */
  String getK_Entry_UU();

  /** Set K_Entry_UU */
  void setK_Entry_UU(String K_Entry_UU);

  /** Get Keywords. List of Keywords - separated by space, comma or semicolon */
  String getKeywords();

  /** Set Keywords. List of Keywords - separated by space, comma or semicolon */
  void setKeywords(String Keywords);

  /** Get Knowledge Source. Source of a Knowledge Entry */
  int getK_Source_ID();

  /** Set Knowledge Source. Source of a Knowledge Entry */
  void setK_Source_ID(int K_Source_ID);

  I_K_Source getK_Source() throws RuntimeException;

  /** Get Knowledge Topic. Knowledge Topic */
  int getK_Topic_ID();

  /** Set Knowledge Topic. Knowledge Topic */
  void setK_Topic_ID(int K_Topic_ID);

  I_K_Topic getK_Topic() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Rating. Classification or Importance */
  int getRating();

  /** Set Rating. Classification or Importance */
  void setRating(int Rating);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid to. Valid to including this date (last day) */
  Timestamp getValidTo();

  /** Set Valid to. Valid to including this date (last day) */
  void setValidTo(Timestamp ValidTo);
}
