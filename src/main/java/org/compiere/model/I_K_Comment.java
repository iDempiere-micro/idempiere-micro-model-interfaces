package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Comment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Comment {

  /** TableName=K_Comment */
  String Table_Name = "K_Comment";

  /** AD_Table_ID=613 */
  int Table_ID = 613;

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
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPublic */
  String COLUMNNAME_IsPublic = "IsPublic";
  /** Column name K_Comment_ID */
  String COLUMNNAME_K_Comment_ID = "K_Comment_ID";
  /** Column name K_Comment_UU */
  String COLUMNNAME_K_Comment_UU = "K_Comment_UU";
  /** Column name K_Entry_ID */
  String COLUMNNAME_K_Entry_ID = "K_Entry_ID";
  /** Column name Rating */
  String COLUMNNAME_Rating = "Rating";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Public. Public can read entry */
  void setIsPublic(boolean IsPublic);

  /** Get Public. Public can read entry */
  boolean isPublic();

  /** Get Entry Comment. Knowledge Entry Comment */
  int getK_Comment_ID();

  /** Set Entry Comment. Knowledge Entry Comment */
  void setK_Comment_ID(int K_Comment_ID);

  /** Get K_Comment_UU */
  String getK_Comment_UU();

  /** Set K_Comment_UU */
  void setK_Comment_UU(String K_Comment_UU);

  /** Get Entry. Knowledge Entry */
  int getK_Entry_ID();

  /** Set Entry. Knowledge Entry */
  void setK_Entry_ID(int K_Entry_ID);

  I_K_Entry getK_Entry() throws RuntimeException;

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
}
