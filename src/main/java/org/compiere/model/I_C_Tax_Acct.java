package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Tax_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Tax_Acct {

  /** TableName=C_Tax_Acct */
  String Table_Name = "C_Tax_Acct";

  /** AD_Table_ID=399 */
  int Table_ID = 399;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Tax_Acct_UU */
  String COLUMNNAME_C_Tax_Acct_UU = "C_Tax_Acct_UU";
  /** Column name C_Tax_ID */
  String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name T_Credit_Acct */
  String COLUMNNAME_T_Credit_Acct = "T_Credit_Acct";
  /** Column name T_Due_Acct */
  String COLUMNNAME_T_Due_Acct = "T_Due_Acct";
  /** Column name T_Expense_Acct */
  String COLUMNNAME_T_Expense_Acct = "T_Expense_Acct";
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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get C_Tax_Acct_UU */
  String getC_Tax_Acct_UU();

  /** Set C_Tax_Acct_UU */
  void setC_Tax_Acct_UU(String C_Tax_Acct_UU);

  /** Get Tax. Tax identifier */
  int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  void setC_Tax_ID(int C_Tax_ID);

  I_C_Tax getC_Tax() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Tax Credit. Account for Tax you can reclaim */
  int getT_Credit_Acct();

  /** Set Tax Credit. Account for Tax you can reclaim */
  void setT_Credit_Acct(int T_Credit_Acct);

  I_C_ValidCombination getT_Credit_A() throws RuntimeException;

  /** Get Tax Due. Account for Tax you have to pay */
  int getT_Due_Acct();

  /** Set Tax Due. Account for Tax you have to pay */
  void setT_Due_Acct(int T_Due_Acct);

  I_C_ValidCombination getT_Due_A() throws RuntimeException;

  /** Get Tax Expense. Account for paid tax you cannot reclaim */
  int getT_Expense_Acct();

  /** Set Tax Expense. Account for paid tax you cannot reclaim */
  void setT_Expense_Acct(int T_Expense_Acct);

  I_C_ValidCombination getT_Expense_A() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
