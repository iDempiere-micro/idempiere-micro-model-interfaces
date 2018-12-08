package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_InvoiceGL
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_InvoiceGL {

  /** TableName=T_InvoiceGL */
  String Table_Name = "T_InvoiceGL";

  /** AD_Table_ID=803 */
  int Table_ID = 803;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name AmtAcctBalance */
  String COLUMNNAME_AmtAcctBalance = "AmtAcctBalance";
  /** Column name AmtRevalCr */
  String COLUMNNAME_AmtRevalCr = "AmtRevalCr";
  /** Column name AmtRevalCrDiff */
  String COLUMNNAME_AmtRevalCrDiff = "AmtRevalCrDiff";
  /** Column name AmtRevalDr */
  String COLUMNNAME_AmtRevalDr = "AmtRevalDr";
  /** Column name AmtRevalDrDiff */
  String COLUMNNAME_AmtRevalDrDiff = "AmtRevalDrDiff";
  /** Column name AmtSourceBalance */
  String COLUMNNAME_AmtSourceBalance = "AmtSourceBalance";
  /** Column name APAR */
  String COLUMNNAME_APAR = "APAR";
  /** Column name C_ConversionTypeReval_ID */
  String COLUMNNAME_C_ConversionTypeReval_ID = "C_ConversionTypeReval_ID";
  /** Column name C_DocTypeReval_ID */
  String COLUMNNAME_C_DocTypeReval_ID = "C_DocTypeReval_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateReval */
  String COLUMNNAME_DateReval = "DateReval";
  /** Column name Fact_Acct_ID */
  String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
  /** Column name GrandTotal */
  String COLUMNNAME_GrandTotal = "GrandTotal";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAllCurrencies */
  String COLUMNNAME_IsAllCurrencies = "IsAllCurrencies";
  /** Column name OpenAmt */
  String COLUMNNAME_OpenAmt = "OpenAmt";
  /** Column name Percent */
  String COLUMNNAME_Percent = "Percent";
  /** Column name T_InvoiceGL_UU */
  String COLUMNNAME_T_InvoiceGL_UU = "T_InvoiceGL_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Accounted Balance. Accounted Balance Amount */
  BigDecimal getAmtAcctBalance();

  /** Set Accounted Balance. Accounted Balance Amount */
  void setAmtAcctBalance(BigDecimal AmtAcctBalance);

  /** Get Revaluated Amount Cr. Revaluated Cr Amount */
  BigDecimal getAmtRevalCr();

  /** Set Revaluated Amount Cr. Revaluated Cr Amount */
  void setAmtRevalCr(BigDecimal AmtRevalCr);

  /** Get Revaluated Difference Cr. Revaluated Cr Amount Difference */
  BigDecimal getAmtRevalCrDiff();

  /** Set Revaluated Difference Cr. Revaluated Cr Amount Difference */
  void setAmtRevalCrDiff(BigDecimal AmtRevalCrDiff);

  /** Get Revaluated Amount Dr. Revaluated Dr Amount */
  BigDecimal getAmtRevalDr();

  /** Set Revaluated Amount Dr. Revaluated Dr Amount */
  void setAmtRevalDr(BigDecimal AmtRevalDr);

  /** Get Revaluated Difference Dr. Revaluated Dr Amount Difference */
  BigDecimal getAmtRevalDrDiff();

  /** Set Revaluated Difference Dr. Revaluated Dr Amount Difference */
  void setAmtRevalDrDiff(BigDecimal AmtRevalDrDiff);

  /** Get Source Balance. Source Balance Amount */
  BigDecimal getAmtSourceBalance();

  /** Set Source Balance. Source Balance Amount */
  void setAmtSourceBalance(BigDecimal AmtSourceBalance);

  /** Get AP - AR. Include Receivables and/or Payables transactions */
  String getAPAR();

  /** Set AP - AR. Include Receivables and/or Payables transactions */
  void setAPAR(String APAR);

  /** Get Revaluation Conversion Type. Revaluation Currency Conversion Type */
  int getC_ConversionTypeReval_ID();

  /** Set Revaluation Conversion Type. Revaluation Currency Conversion Type */
  void setC_ConversionTypeReval_ID(int C_ConversionTypeReval_ID);

  I_C_ConversionType getC_ConversionTypeReval() throws RuntimeException;

  /** Get Revaluation Document Type. Document Type for Revaluation Journal */
  int getC_DocTypeReval_ID();

  /** Set Revaluation Document Type. Document Type for Revaluation Journal */
  void setC_DocTypeReval_ID(int C_DocTypeReval_ID);

  I_C_DocType getC_DocTypeReval() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Revaluation Date. Date of Revaluation */
  Timestamp getDateReval();

  /** Set Revaluation Date. Date of Revaluation */
  void setDateReval(Timestamp DateReval);

  /** Get Accounting Fact */
  int getFact_Acct_ID();

  /** Set Accounting Fact */
  void setFact_Acct_ID(int Fact_Acct_ID);

  /** Get Grand Total. Total amount of document */
  BigDecimal getGrandTotal();

  /** Set Grand Total. Total amount of document */
  void setGrandTotal(BigDecimal GrandTotal);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Include All Currencies. Report not just foreign currency Invoices */
  void setIsAllCurrencies(boolean IsAllCurrencies);

  /** Get Include All Currencies. Report not just foreign currency Invoices */
  boolean isAllCurrencies();

  /** Get Open Amount. Open item amount */
  BigDecimal getOpenAmt();

  /** Set Open Amount. Open item amount */
  void setOpenAmt(BigDecimal OpenAmt);

  /** Get Percent. Percentage */
  BigDecimal getPercent();

  /** Set Percent. Percentage */
  void setPercent(BigDecimal Percent);

  /** Get T_InvoiceGL_UU */
  String getT_InvoiceGL_UU();

  /** Set T_InvoiceGL_UU */
  void setT_InvoiceGL_UU(String T_InvoiceGL_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
