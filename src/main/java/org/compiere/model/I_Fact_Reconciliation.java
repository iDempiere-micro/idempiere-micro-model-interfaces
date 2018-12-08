package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for Fact_Reconciliation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_Fact_Reconciliation {

  /** TableName=Fact_Reconciliation */
  String Table_Name = "Fact_Reconciliation";

  /** AD_Table_ID=53286 */
  int Table_ID = 53286;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name Account_ID */
  String COLUMNNAME_Account_ID = "Account_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AmtAcct */
  String COLUMNNAME_AmtAcct = "AmtAcct";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Fact_Acct_ID */
  String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
  /** Column name Fact_Reconciliation_ID */
  String COLUMNNAME_Fact_Reconciliation_ID = "Fact_Reconciliation_ID";
  /** Column name Fact_Reconciliation_UU */
  String COLUMNNAME_Fact_Reconciliation_UU = "Fact_Reconciliation_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name MatchCode */
  String COLUMNNAME_MatchCode = "MatchCode";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Account. Account used */
  int getAccount_ID();

  /** Set Account. Account used */
  void setAccount_ID(int Account_ID);

  I_C_ElementValue getAccount() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounted Amount. Amount Balance in Currency of Accounting Schema */
  BigDecimal getAmtAcct();

  /** Set Accounted Amount. Amount Balance in Currency of Accounting Schema */
  void setAmtAcct(BigDecimal AmtAcct);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Accounting Fact */
  int getFact_Acct_ID();

  /** Set Accounting Fact */
  void setFact_Acct_ID(int Fact_Acct_ID);

  I_Fact_Acct getFact_Acct() throws RuntimeException;

  /** Get Accounting Fact Reconciliation */
  int getFact_Reconciliation_ID();

  /** Set Accounting Fact Reconciliation */
  void setFact_Reconciliation_ID(int Fact_Reconciliation_ID);

  /** Get Fact_Reconciliation_UU */
  String getFact_Reconciliation_UU();

  /** Set Fact_Reconciliation_UU */
  void setFact_Reconciliation_UU(String Fact_Reconciliation_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Match Code. String identifying related accounting facts */
  String getMatchCode();

  /** Set Match Code. String identifying related accounting facts */
  void setMatchCode(String MatchCode);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
