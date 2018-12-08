package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_LocatorType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_LocatorType {

  /** TableName=M_LocatorType */
  String Table_Name = "M_LocatorType";

  /** AD_Table_ID=200175 */
  int Table_ID = 200175;

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
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAvailableForReplenishment */
  String COLUMNNAME_IsAvailableForReplenishment = "IsAvailableForReplenishment";
  /** Column name IsAvailableForReservation */
  String COLUMNNAME_IsAvailableForReservation = "IsAvailableForReservation";
  /** Column name IsAvailableForShipping */
  String COLUMNNAME_IsAvailableForShipping = "IsAvailableForShipping";
  /** Column name M_LocatorType_ID */
  String COLUMNNAME_M_LocatorType_ID = "M_LocatorType_ID";
  /** Column name M_LocatorType_UU */
  String COLUMNNAME_M_LocatorType_UU = "M_LocatorType_UU";
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

  /** Set Available for Replenishment */
  void setIsAvailableForReplenishment(boolean IsAvailableForReplenishment);

  /** Get Available for Replenishment */
  boolean isAvailableForReplenishment();

  /** Set Available for Reservation */
  void setIsAvailableForReservation(boolean IsAvailableForReservation);

  /** Get Available for Reservation */
  boolean isAvailableForReservation();

  /** Set Available for Shipping */
  void setIsAvailableForShipping(boolean IsAvailableForShipping);

  /** Get Available for Shipping */
  boolean isAvailableForShipping();

  /** Get Locator Type */
  int getM_LocatorType_ID();

  /** Set Locator Type */
  void setM_LocatorType_ID(int M_LocatorType_ID);

  /** Get M_LocatorType_UU */
  String getM_LocatorType_UU();

  /** Set M_LocatorType_UU */
  void setM_LocatorType_UU(String M_LocatorType_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
