package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Withholding_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Withholding_Acct {

  /** TableName=C_Withholding_Acct */
  String Table_Name = "C_Withholding_Acct";

  /** AD_Table_ID=400 */
  int Table_ID = 400;

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
  /** Column name C_Withholding_Acct_UU */
  String COLUMNNAME_C_Withholding_Acct_UU = "C_Withholding_Acct_UU";
  /** Column name C_Withholding_ID */
  String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Withholding_Acct */
  String COLUMNNAME_Withholding_Acct = "Withholding_Acct";

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

  /** Get C_Withholding_Acct_UU */
  String getC_Withholding_Acct_UU();

  /** Set C_Withholding_Acct_UU */
  void setC_Withholding_Acct_UU(String C_Withholding_Acct_UU);

  /** Get Withholding. Withholding type defined */
  int getC_Withholding_ID();

  /** Set Withholding. Withholding type defined */
  void setC_Withholding_ID(int C_Withholding_ID);

  I_C_Withholding getC_Withholding() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Withholding. Account for Withholdings */
  int getWithholding_Acct();

  /** Set Withholding. Account for Withholdings */
  void setWithholding_Acct(int Withholding_Acct);

  I_C_ValidCombination getWithholding_A() throws RuntimeException;
}
