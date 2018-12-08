package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Subscription_Delivery
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Subscription_Delivery {

  /** TableName=C_Subscription_Delivery */
  String Table_Name = "C_Subscription_Delivery";

  /** AD_Table_ID=667 */
  int Table_ID = 667;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Subscription_Delivery_ID */
  String COLUMNNAME_C_Subscription_Delivery_ID = "C_Subscription_Delivery_ID";
  /** Column name C_Subscription_Delivery_UU */
  String COLUMNNAME_C_Subscription_Delivery_UU = "C_Subscription_Delivery_UU";
  /** Column name C_Subscription_ID */
  String COLUMNNAME_C_Subscription_ID = "C_Subscription_ID";
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

  /** Get Subscription Delivery. Optional Delivery Record for a Subscription */
  int getC_Subscription_Delivery_ID();

  /** Set Subscription Delivery. Optional Delivery Record for a Subscription */
  void setC_Subscription_Delivery_ID(int C_Subscription_Delivery_ID);

  /** Get C_Subscription_Delivery_UU */
  String getC_Subscription_Delivery_UU();

  /** Set C_Subscription_Delivery_UU */
  void setC_Subscription_Delivery_UU(String C_Subscription_Delivery_UU);

  /** Get Subscription. Subscription of a Business Partner of a Product to renew */
  int getC_Subscription_ID();

  /** Set Subscription. Subscription of a Business Partner of a Product to renew */
  void setC_Subscription_ID(int C_Subscription_ID);

  I_C_Subscription getC_Subscription() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
