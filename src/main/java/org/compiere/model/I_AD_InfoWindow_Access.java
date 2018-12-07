package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_InfoWindow_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_InfoWindow_Access {

  /** TableName=AD_InfoWindow_Access */
  String Table_Name = "AD_InfoWindow_Access";

  /** AD_Table_ID=200054 */
  int Table_ID = 200054;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_InfoWindow_Access_UU */
  String COLUMNNAME_AD_InfoWindow_Access_UU = "AD_InfoWindow_Access_UU";
  /** Column name AD_InfoWindow_ID */
  String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get AD_InfoWindow_Access_UU */
  String getAD_InfoWindow_Access_UU();

  /** Set AD_InfoWindow_Access_UU */
  void setAD_InfoWindow_Access_UU(String AD_InfoWindow_Access_UU);

  /** Get Info Window. Info and search/select Window */
  int getAD_InfoWindow_ID();

  /** Set Info Window. Info and search/select Window */
  void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

  I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  I_AD_Role getAD_Role() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
