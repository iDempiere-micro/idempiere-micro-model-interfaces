package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_ContactInterest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_ContactInterest {

  /** TableName=R_ContactInterest */
  String Table_Name = "R_ContactInterest";

  /** AD_Table_ID=528 */
  int Table_ID = 528;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name OptOutDate */
  String COLUMNNAME_OptOutDate = "OptOutDate";
  /** Column name R_ContactInterest_UU */
  String COLUMNNAME_R_ContactInterest_UU = "R_ContactInterest_UU";
  /** Column name R_InterestArea_ID */
  String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Opt-out Date. Date the contact opted out */
  Timestamp getOptOutDate();

  /** Set Opt-out Date. Date the contact opted out */
  void setOptOutDate(Timestamp OptOutDate);

  /** Get R_ContactInterest_UU */
  String getR_ContactInterest_UU();

  /** Set R_ContactInterest_UU */
  void setR_ContactInterest_UU(String R_ContactInterest_UU);

  /** Get Interest Area. Interest Area or Topic */
  int getR_InterestArea_ID();

  /** Set Interest Area. Interest Area or Topic */
  void setR_InterestArea_ID(int R_InterestArea_ID);

  I_R_InterestArea getR_InterestArea() throws RuntimeException;

  /** Get Subscribe Date. Date the contact actively subscribed */
  Timestamp getSubscribeDate();

  /** Set Subscribe Date. Date the contact actively subscribed */
  void setSubscribeDate(Timestamp SubscribeDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
