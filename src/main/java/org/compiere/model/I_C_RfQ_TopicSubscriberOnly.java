package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQ_TopicSubscriberOnly
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQ_TopicSubscriberOnly {

  /** TableName=C_RfQ_TopicSubscriberOnly */
  String Table_Name = "C_RfQ_TopicSubscriberOnly";

  /** AD_Table_ID=747 */
  int Table_ID = 747;

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
  /** Column name C_RfQ_TopicSubscriber_ID */
  String COLUMNNAME_C_RfQ_TopicSubscriber_ID = "C_RfQ_TopicSubscriber_ID";
  /** Column name C_RfQ_TopicSubscriberOnly_ID */
  String COLUMNNAME_C_RfQ_TopicSubscriberOnly_ID = "C_RfQ_TopicSubscriberOnly_ID";
  /** Column name C_RfQ_TopicSubscriberOnly_UU */
  String COLUMNNAME_C_RfQ_TopicSubscriberOnly_UU = "C_RfQ_TopicSubscriberOnly_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

  /** Get RfQ Subscriber. Request for Quotation Topic Subscriber */
  int getC_RfQ_TopicSubscriber_ID();

  /** Set RfQ Subscriber. Request for Quotation Topic Subscriber */
  void setC_RfQ_TopicSubscriber_ID(int C_RfQ_TopicSubscriber_ID);

  I_C_RfQ_TopicSubscriber getC_RfQ_TopicSubscriber() throws RuntimeException;

  /**
   * Get RfQ Topic Subscriber Restriction. Include Subscriber only for certain products or product
   * categories
   */
  int getC_RfQ_TopicSubscriberOnly_ID();

  /**
   * Set RfQ Topic Subscriber Restriction. Include Subscriber only for certain products or product
   * categories
   */
  void setC_RfQ_TopicSubscriberOnly_ID(int C_RfQ_TopicSubscriberOnly_ID);

  /** Get C_RfQ_TopicSubscriberOnly_UU */
  String getC_RfQ_TopicSubscriberOnly_UU();

  /** Set C_RfQ_TopicSubscriberOnly_UU */
  void setC_RfQ_TopicSubscriberOnly_UU(String C_RfQ_TopicSubscriberOnly_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  void setM_Product_Category_ID(int M_Product_Category_ID);

  I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
