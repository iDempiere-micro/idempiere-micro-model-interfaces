package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_BidComment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_BidComment {

  /** TableName=B_BidComment */
  String Table_Name = "B_BidComment";

  /** AD_Table_ID=685 */
  int Table_ID = 685;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name B_BidComment_ID */
  String COLUMNNAME_B_BidComment_ID = "B_BidComment_ID";
  /** Column name B_BidComment_UU */
  String COLUMNNAME_B_BidComment_UU = "B_BidComment_UU";
  /** Column name B_Topic_ID */
  String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Bid Comment. Make a comment to a Bid Topic */
  int getB_BidComment_ID();

  /** Set Bid Comment. Make a comment to a Bid Topic */
  void setB_BidComment_ID(int B_BidComment_ID);

  /** Get B_BidComment_UU */
  String getB_BidComment_UU();

  /** Set B_BidComment_UU */
  void setB_BidComment_UU(String B_BidComment_UU);

  /** Get Topic. Auction Topic */
  int getB_Topic_ID();

  /** Set Topic. Auction Topic */
  void setB_Topic_ID(int B_Topic_ID);

  I_B_Topic getB_Topic() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
