package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_InterOrg_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InterOrg_Acct {

  /** TableName=C_InterOrg_Acct */
  String Table_Name = "C_InterOrg_Acct";

  /** AD_Table_ID=397 */
  int Table_ID = 397;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTo_ID */
  String COLUMNNAME_AD_OrgTo_ID = "AD_OrgTo_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_InterOrg_Acct_UU */
  String COLUMNNAME_C_InterOrg_Acct_UU = "C_InterOrg_Acct_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IntercompanyDueFrom_Acct */
  String COLUMNNAME_IntercompanyDueFrom_Acct = "IntercompanyDueFrom_Acct";
  /** Column name IntercompanyDueTo_Acct */
  String COLUMNNAME_IntercompanyDueTo_Acct = "IntercompanyDueTo_Acct";
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

  /** Get Inter-Organization. Organization valid for intercompany documents */
  int getAD_OrgTo_ID();

  /** Set Inter-Organization. Organization valid for intercompany documents */
  void setAD_OrgTo_ID(int AD_OrgTo_ID);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get C_InterOrg_Acct_UU */
  String getC_InterOrg_Acct_UU();

  /** Set C_InterOrg_Acct_UU */
  void setC_InterOrg_Acct_UU(String C_InterOrg_Acct_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Intercompany Due From Acct. Intercompany Due From / Receivables Account */
  int getIntercompanyDueFrom_Acct();

  /** Set Intercompany Due From Acct. Intercompany Due From / Receivables Account */
  void setIntercompanyDueFrom_Acct(int IntercompanyDueFrom_Acct);

  I_C_ValidCombination getIntercompanyDueFrom_A() throws RuntimeException;

  /** Get Intercompany Due To Acct. Intercompany Due To / Payable Account */
  int getIntercompanyDueTo_Acct();

  /** Set Intercompany Due To Acct. Intercompany Due To / Payable Account */
  void setIntercompanyDueTo_Acct(int IntercompanyDueTo_Acct);

  I_C_ValidCombination getIntercompanyDueTo_A() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
