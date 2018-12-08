package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Lot
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Lot {

  /** TableName=M_Lot */
  String Table_Name = "M_Lot";

  /** AD_Table_ID=557 */
  int Table_ID = 557;

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
  /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_LotCtl_ID */
  String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
  /** Column name M_Lot_ID */
  String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
  /** Column name M_Lot_UU */
  String COLUMNNAME_M_Lot_UU = "M_Lot_UU";
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

  /** Get Date From. Starting date for a range */
  Timestamp getDateFrom();

  /** Set Date From. Starting date for a range */
  void setDateFrom(Timestamp DateFrom);

  /** Get Date To. End date of a date range */
  Timestamp getDateTo();

  /** Set Date To. End date of a date range */
  void setDateTo(Timestamp DateTo);

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

  /** Get Lot Control. Product Lot Control */
  int getM_LotCtl_ID();

  /** Set Lot Control. Product Lot Control */
  void setM_LotCtl_ID(int M_LotCtl_ID);

  I_M_LotCtl getM_LotCtl() throws RuntimeException;

  /** Get Lot. Product Lot Definition */
  int getM_Lot_ID();

  /** Set Lot. Product Lot Definition */
  void setM_Lot_ID(int M_Lot_ID);

  /** Get M_Lot_UU */
  String getM_Lot_UU();

  /** Set M_Lot_UU */
  void setM_Lot_UU(String M_Lot_UU);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
