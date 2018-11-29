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
  public static final String Table_Name = "C_Withholding_Acct";

  /** AD_Table_ID=400 */
  public static final int Table_ID = 400;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name C_AcctSchema_ID */
  public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

  /** Set Accounting Schema. Rules for accounting */
  public void setC_AcctSchema_ID(int C_AcctSchema_ID);

  /** Get Accounting Schema. Rules for accounting */
  public int getC_AcctSchema_ID();

  public I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name C_Withholding_Acct_UU */
  public static final String COLUMNNAME_C_Withholding_Acct_UU = "C_Withholding_Acct_UU";

  /** Set C_Withholding_Acct_UU */
  public void setC_Withholding_Acct_UU(String C_Withholding_Acct_UU);

  /** Get C_Withholding_Acct_UU */
  public String getC_Withholding_Acct_UU();

  /** Column name C_Withholding_ID */
  public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";

  /** Set Withholding. Withholding type defined */
  public void setC_Withholding_ID(int C_Withholding_ID);

  /** Get Withholding. Withholding type defined */
  public int getC_Withholding_ID();

  public I_C_Withholding getC_Withholding() throws RuntimeException;

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name Withholding_Acct */
  public static final String COLUMNNAME_Withholding_Acct = "Withholding_Acct";

  /** Set Withholding. Account for Withholdings */
  public void setWithholding_Acct(int Withholding_Acct);

  /** Get Withholding. Account for Withholdings */
  public int getWithholding_Acct();

  public I_C_ValidCombination getWithholding_A() throws RuntimeException;
}
