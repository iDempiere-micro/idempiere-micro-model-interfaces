package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Project_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Project_Acct {

  /** TableName=C_Project_Acct */
  String Table_Name = "C_Project_Acct";

  /** AD_Table_ID=204 */
  int Table_ID = 204;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Project_Acct_UU */
  String COLUMNNAME_C_Project_Acct_UU = "C_Project_Acct_UU";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PJ_Asset_Acct */
  String COLUMNNAME_PJ_Asset_Acct = "PJ_Asset_Acct";
  /** Column name PJ_WIP_Acct */
  String COLUMNNAME_PJ_WIP_Acct = "PJ_WIP_Acct";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get C_Project_Acct_UU */
  String getC_Project_Acct_UU();

  /** Set C_Project_Acct_UU */
  void setC_Project_Acct_UU(String C_Project_Acct_UU);

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Project Asset. Project Asset Account */
  int getPJ_Asset_Acct();

  /** Set Project Asset. Project Asset Account */
  void setPJ_Asset_Acct(int PJ_Asset_Acct);

  I_C_ValidCombination getPJ_Asset_A() throws RuntimeException;

  /** Get Work In Progress. Account for Work in Progress */
  int getPJ_WIP_Acct();

  /** Set Work In Progress. Account for Work in Progress */
  void setPJ_WIP_Acct(int PJ_WIP_Acct);

  I_C_ValidCombination getPJ_WIP_A() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
