package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_TopicType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_TopicType {

  /** TableName=B_TopicType */
  String Table_Name = "B_TopicType";

  /** AD_Table_ID=690 */
  int Table_ID = 690;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AuctionType */
  String COLUMNNAME_AuctionType = "AuctionType";
  /** Column name B_TopicType_ID */
  String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
  /** Column name B_TopicType_UU */
  String COLUMNNAME_B_TopicType_UU = "B_TopicType_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_ProductMember_ID */
  String COLUMNNAME_M_ProductMember_ID = "M_ProductMember_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Auction Type */
  String getAuctionType();

  /** Set Auction Type */
  void setAuctionType(String AuctionType);

  /** Get Topic Type. Auction Topic Type */
  int getB_TopicType_ID();

  /** Set Topic Type. Auction Topic Type */
  void setB_TopicType_ID(int B_TopicType_ID);

  /** Get B_TopicType_UU */
  String getB_TopicType_UU();

  /** Set B_TopicType_UU */
  void setB_TopicType_UU(String B_TopicType_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Membership. Product used to determine the price of the membership for the topic type */
  int getM_ProductMember_ID();

  /** Set Membership. Product used to determine the price of the membership for the topic type */
  void setM_ProductMember_ID(int M_ProductMember_ID);

  I_M_Product getM_ProductMember() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
