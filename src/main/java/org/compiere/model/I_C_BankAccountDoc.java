package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankAccountDoc
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccountDoc {

  /** TableName=C_BankAccountDoc */
  String Table_Name = "C_BankAccountDoc";

  /** AD_Table_ID=455 */
  int Table_ID = 455;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BankAccountDoc_ID */
  String COLUMNNAME_C_BankAccountDoc_ID = "C_BankAccountDoc_ID";
  /** Column name C_BankAccountDoc_UU */
  String COLUMNNAME_C_BankAccountDoc_UU = "C_BankAccountDoc_UU";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name Check_PrintFormat_ID */
  String COLUMNNAME_Check_PrintFormat_ID = "Check_PrintFormat_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrentNext */
  String COLUMNNAME_CurrentNext = "CurrentNext";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Bank Account Document. Checks, Transfers, etc. */
  int getC_BankAccountDoc_ID();

  /** Set Bank Account Document. Checks, Transfers, etc. */
  void setC_BankAccountDoc_ID(int C_BankAccountDoc_ID);

  /** Get C_BankAccountDoc_UU */
  String getC_BankAccountDoc_UU();

  /** Set C_BankAccountDoc_UU */
  void setC_BankAccountDoc_UU(String C_BankAccountDoc_UU);

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Check Print Format. Print Format for printing Checks */
  int getCheck_PrintFormat_ID();

  /** Set Check Print Format. Print Format for printing Checks */
  void setCheck_PrintFormat_ID(int Check_PrintFormat_ID);

  I_AD_PrintFormat getCheck_PrintFormat() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Current Next. The next number to be used */
  int getCurrentNext();

  /** Set Current Next. The next number to be used */
  void setCurrentNext(int CurrentNext);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
