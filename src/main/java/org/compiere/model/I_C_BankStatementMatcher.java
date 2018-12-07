package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankStatementMatcher
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatementMatcher {

  /** TableName=C_BankStatementMatcher */
  String Table_Name = "C_BankStatementMatcher";

  /** AD_Table_ID=658 */
  int Table_ID = 658;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BankStatementMatcher_ID */
  String COLUMNNAME_C_BankStatementMatcher_ID = "C_BankStatementMatcher_ID";
  /** Column name C_BankStatementMatcher_UU */
  String COLUMNNAME_C_BankStatementMatcher_UU = "C_BankStatementMatcher_UU";
  /** Column name Classname */
  String COLUMNNAME_Classname = "Classname";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /**
   * Get Bank Statement Matcher. Algorithm to match Bank Statement Info to Business Partners,
   * Invoices and Payments
   */
  int getC_BankStatementMatcher_ID();

  /**
   * Set Bank Statement Matcher. Algorithm to match Bank Statement Info to Business Partners,
   * Invoices and Payments
   */
  void setC_BankStatementMatcher_ID(int C_BankStatementMatcher_ID);

  /** Get C_BankStatementMatcher_UU */
  String getC_BankStatementMatcher_UU();

  /** Set C_BankStatementMatcher_UU */
  void setC_BankStatementMatcher_UU(String C_BankStatementMatcher_UU);

  /** Get Classname. Java Classname */
  String getClassname();

  /** Set Classname. Java Classname */
  void setClassname(String Classname);

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
