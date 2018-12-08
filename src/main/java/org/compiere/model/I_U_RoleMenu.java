package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_RoleMenu
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_RoleMenu {

  /** TableName=U_RoleMenu */
  String Table_Name = "U_RoleMenu";

  /** AD_Table_ID=52002 */
  int Table_ID = 52002;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

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
  /** Column name U_RoleMenu_ID */
  String COLUMNNAME_U_RoleMenu_ID = "U_RoleMenu_ID";
  /** Column name U_RoleMenu_UU */
  String COLUMNNAME_U_RoleMenu_UU = "U_RoleMenu_UU";
  /** Column name U_WebMenu_ID */
  String COLUMNNAME_U_WebMenu_ID = "U_WebMenu_ID";

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

  /** Get Role Menu */
  int getU_RoleMenu_ID();

  /** Set Role Menu */
  void setU_RoleMenu_ID(int U_RoleMenu_ID);

  /** Get U_RoleMenu_UU */
  String getU_RoleMenu_UU();

  /** Set U_RoleMenu_UU */
  void setU_RoleMenu_UU(String U_RoleMenu_UU);

  /** Get Web Menu */
  int getU_WebMenu_ID();

  /** Set Web Menu */
  void setU_WebMenu_ID(int U_WebMenu_ID);

  I_U_WebMenu getU_WebMenu() throws RuntimeException;
}
