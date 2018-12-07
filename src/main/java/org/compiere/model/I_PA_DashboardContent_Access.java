package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_DashboardContent_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_DashboardContent_Access {

  /** TableName=PA_DashboardContent_Access */
  String Table_Name = "PA_DashboardContent_Access";

  /** AD_Table_ID=200106 */
  int Table_ID = 200106;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PA_DashboardContent_Access_ID */
  String COLUMNNAME_PA_DashboardContent_Access_ID = "PA_DashboardContent_Access_ID";
  /** Column name PA_DashboardContent_Access_UU */
  String COLUMNNAME_PA_DashboardContent_Access_UU = "PA_DashboardContent_Access_UU";
  /** Column name PA_DashboardContent_ID */
  String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  I_AD_Role getAD_Role() throws RuntimeException;

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

  /** Get PA_DashboardContent_Access_ID */
  int getPA_DashboardContent_Access_ID();

  /** Set PA_DashboardContent_Access_ID */
  void setPA_DashboardContent_Access_ID(int PA_DashboardContent_Access_ID);

  /** Get PA_DashboardContent_Access_UU */
  String getPA_DashboardContent_Access_UU();

  /** Set PA_DashboardContent_Access_UU */
  void setPA_DashboardContent_Access_UU(String PA_DashboardContent_Access_UU);

  /** Get Dashboard Content */
  int getPA_DashboardContent_ID();

  /** Set Dashboard Content */
  void setPA_DashboardContent_ID(int PA_DashboardContent_ID);

  I_PA_DashboardContent getPA_DashboardContent() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
