package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_SubscriptionType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SubscriptionType {

  /** TableName=C_SubscriptionType */
  String Table_Name = "C_SubscriptionType";

  /** AD_Table_ID=668 */
  int Table_ID = 668;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SubscriptionType_ID */
  String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
  /** Column name C_SubscriptionType_UU */
  String COLUMNNAME_C_SubscriptionType_UU = "C_SubscriptionType_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Frequency */
  String COLUMNNAME_Frequency = "Frequency";
  /** Column name FrequencyType */
  String COLUMNNAME_FrequencyType = "FrequencyType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Subscription Type. Type of subscription */
  int getC_SubscriptionType_ID();

  /** Set Subscription Type. Type of subscription */
  void setC_SubscriptionType_ID(int C_SubscriptionType_ID);

  /** Get C_SubscriptionType_UU */
  String getC_SubscriptionType_UU();

  /** Set C_SubscriptionType_UU */
  void setC_SubscriptionType_UU(String C_SubscriptionType_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Frequency. Frequency of events */
  int getFrequency();

  /** Set Frequency. Frequency of events */
  void setFrequency(int Frequency);

  /** Get Frequency Type. Frequency of event */
  String getFrequencyType();

  /** Set Frequency Type. Frequency of event */
  void setFrequencyType(String FrequencyType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
