package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_Bid
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_Bid {

  /** TableName=B_Bid */
  String Table_Name = "B_Bid";

  /** AD_Table_ID=686 */
  int Table_ID = 686;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name B_Bid_ID */
  String COLUMNNAME_B_Bid_ID = "B_Bid_ID";
  /** Column name B_Bid_UU */
  String COLUMNNAME_B_Bid_UU = "B_Bid_UU";
  /** Column name B_BuyerFunds_ID */
  String COLUMNNAME_B_BuyerFunds_ID = "B_BuyerFunds_ID";
  /** Column name B_Topic_ID */
  String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsWillingToCommit */
  String COLUMNNAME_IsWillingToCommit = "IsWillingToCommit";
  /** Column name PrivateNote */
  String COLUMNNAME_PrivateNote = "PrivateNote";
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

  /** Get Bid. Bid for a Topic */
  int getB_Bid_ID();

  /** Set Bid. Bid for a Topic */
  void setB_Bid_ID(int B_Bid_ID);

  /** Get B_Bid_UU */
  String getB_Bid_UU();

  /** Set B_Bid_UU */
  void setB_Bid_UU(String B_Bid_UU);

  /** Get Buyer Funds. Buyer Funds for Bids on Topics */
  int getB_BuyerFunds_ID();

  /** Set Buyer Funds. Buyer Funds for Bids on Topics */
  void setB_BuyerFunds_ID(int B_BuyerFunds_ID);

  I_B_BuyerFunds getB_BuyerFunds() throws RuntimeException;

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

  /** Set Willing to commit */
  void setIsWillingToCommit(boolean IsWillingToCommit);

  /** Get Willing to commit */
  boolean isWillingToCommit();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Private Note. Private Note - not visible to the other parties */
  String getPrivateNote();

  /** Set Private Note. Private Note - not visible to the other parties */
  void setPrivateNote(String PrivateNote);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
