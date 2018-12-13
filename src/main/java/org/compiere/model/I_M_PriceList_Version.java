package org.compiere.model;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_PriceList_Version
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PriceList_Version extends IPO {

  /** TableName=M_PriceList_Version */
  String Table_Name = "M_PriceList_Version";

  /** AD_Table_ID=295 */
  int Table_ID = 295;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_Pricelist_Version_Base_ID */
  String COLUMNNAME_M_Pricelist_Version_Base_ID = "M_Pricelist_Version_Base_ID";
  /** Column name M_PriceList_Version_ID */
  String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
  /** Column name M_PriceList_Version_UU */
  String COLUMNNAME_M_PriceList_Version_UU = "M_PriceList_Version_UU";
  /** Column name ProcCreate */
  String COLUMNNAME_ProcCreate = "ProcCreate";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get Base Price List. Source for Price list calculations */
  int getM_Pricelist_Version_Base_ID();

  /** Set Base Price List. Source for Price list calculations */
  void setM_Pricelist_Version_Base_ID(int M_Pricelist_Version_Base_ID);

  I_M_PriceList_Version getM_Pricelist_Version_Base() throws RuntimeException;

  /** Get Price List Version. Identifies a unique instance of a Price List */
  int getM_PriceList_Version_ID();

  /** Set Price List Version. Identifies a unique instance of a Price List */
  void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

  /** Get M_PriceList_Version_UU */
  String getM_PriceList_Version_UU();

  /** Set M_PriceList_Version_UU */
  void setM_PriceList_Version_UU(String M_PriceList_Version_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Create */
  String getProcCreate();

  /** Set Create */
  void setProcCreate(String ProcCreate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);
}
