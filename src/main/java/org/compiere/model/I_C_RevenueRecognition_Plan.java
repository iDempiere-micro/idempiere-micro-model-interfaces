package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RevenueRecognition_Plan
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RevenueRecognition_Plan {

  /** TableName=C_RevenueRecognition_Plan */
  String Table_Name = "C_RevenueRecognition_Plan";

  /** AD_Table_ID=443 */
  int Table_ID = 443;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_RevenueRecognition_ID */
  String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
  /** Column name C_RevenueRecognition_Plan_ID */
  String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
  /** Column name C_RevenueRecognition_Plan_UU */
  String COLUMNNAME_C_RevenueRecognition_Plan_UU = "C_RevenueRecognition_Plan_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name P_Revenue_Acct */
  String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
  /** Column name RecognizedAmt */
  String COLUMNNAME_RecognizedAmt = "RecognizedAmt";
  /** Column name TotalAmt */
  String COLUMNNAME_TotalAmt = "TotalAmt";
  /** Column name UnEarnedRevenue_Acct */
  String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";
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

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Revenue Recognition. Method for recording revenue */
  int getC_RevenueRecognition_ID();

  /** Set Revenue Recognition. Method for recording revenue */
  void setC_RevenueRecognition_ID(int C_RevenueRecognition_ID);

  I_C_RevenueRecognition getC_RevenueRecognition() throws RuntimeException;

  /** Get Revenue Recognition Plan. Plan for recognizing or recording revenue */
  int getC_RevenueRecognition_Plan_ID();

  /** Set Revenue Recognition Plan. Plan for recognizing or recording revenue */
  void setC_RevenueRecognition_Plan_ID(int C_RevenueRecognition_Plan_ID);

  /** Get C_RevenueRecognition_Plan_UU */
  String getC_RevenueRecognition_Plan_UU();

  /** Set C_RevenueRecognition_Plan_UU */
  void setC_RevenueRecognition_Plan_UU(String C_RevenueRecognition_Plan_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product Revenue. Account for Product Revenue (Sales Account) */
  int getP_Revenue_Acct();

  /** Set Product Revenue. Account for Product Revenue (Sales Account) */
  void setP_Revenue_Acct(int P_Revenue_Acct);

  I_C_ValidCombination getP_Revenue_A() throws RuntimeException;

  /** Get Recognized Amount */
  BigDecimal getRecognizedAmt();

  /** Set Recognized Amount */
  void setRecognizedAmt(BigDecimal RecognizedAmt);

  /** Get Total Amount. Total Amount */
  BigDecimal getTotalAmt();

  /** Set Total Amount. Total Amount */
  void setTotalAmt(BigDecimal TotalAmt);

  /** Get Unearned Revenue. Account for unearned revenue */
  int getUnEarnedRevenue_Acct();

  /** Set Unearned Revenue. Account for unearned revenue */
  void setUnEarnedRevenue_Acct(int UnEarnedRevenue_Acct);

  I_C_ValidCombination getUnEarnedRevenue_A() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
