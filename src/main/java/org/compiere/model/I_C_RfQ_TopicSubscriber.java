package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQ_TopicSubscriber
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQ_TopicSubscriber {

  /** TableName=C_RfQ_TopicSubscriber */
  String Table_Name = "C_RfQ_TopicSubscriber";

  /** AD_Table_ID=670 */
  int Table_ID = 670;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_RfQ_Topic_ID */
  String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
  /** Column name C_RfQ_TopicSubscriber_ID */
  String COLUMNNAME_C_RfQ_TopicSubscriber_ID = "C_RfQ_TopicSubscriber_ID";
  /** Column name C_RfQ_TopicSubscriber_UU */
  String COLUMNNAME_C_RfQ_TopicSubscriber_UU = "C_RfQ_TopicSubscriber_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name OptOutDate */
  String COLUMNNAME_OptOutDate = "OptOutDate";
  /** Column name SubscribeDate */
  String COLUMNNAME_SubscribeDate = "SubscribeDate";
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

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get RfQ Topic. Topic for Request for Quotations */
  int getC_RfQ_Topic_ID();

  /** Set RfQ Topic. Topic for Request for Quotations */
  void setC_RfQ_Topic_ID(int C_RfQ_Topic_ID);

  I_C_RfQ_Topic getC_RfQ_Topic() throws RuntimeException;

  /** Get RfQ Subscriber. Request for Quotation Topic Subscriber */
  int getC_RfQ_TopicSubscriber_ID();

  /** Set RfQ Subscriber. Request for Quotation Topic Subscriber */
  void setC_RfQ_TopicSubscriber_ID(int C_RfQ_TopicSubscriber_ID);

  /** Get C_RfQ_TopicSubscriber_UU */
  String getC_RfQ_TopicSubscriber_UU();

  /** Set C_RfQ_TopicSubscriber_UU */
  void setC_RfQ_TopicSubscriber_UU(String C_RfQ_TopicSubscriber_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Opt-out Date. Date the contact opted out */
  Timestamp getOptOutDate();

  /** Set Opt-out Date. Date the contact opted out */
  void setOptOutDate(Timestamp OptOutDate);

  /** Get Subscribe Date. Date the contact actively subscribed */
  Timestamp getSubscribeDate();

  /** Set Subscribe Date. Date the contact actively subscribed */
  void setSubscribeDate(Timestamp SubscribeDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
