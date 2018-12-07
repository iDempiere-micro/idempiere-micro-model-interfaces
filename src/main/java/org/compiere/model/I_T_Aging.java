package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_Aging
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Aging {

  /** TableName=T_Aging */
  String Table_Name = "T_Aging";

  /** AD_Table_ID=631 */
  int Table_ID = 631;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_InvoicePaySchedule_ID */
  String COLUMNNAME_C_InvoicePaySchedule_ID = "C_InvoicePaySchedule_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DaysDue */
  String COLUMNNAME_DaysDue = "DaysDue";
  /** Column name Due0 */
  String COLUMNNAME_Due0 = "Due0";
  /** Column name Due0_30 */
  String COLUMNNAME_Due0_30 = "Due0_30";
  /** Column name Due0_7 */
  String COLUMNNAME_Due0_7 = "Due0_7";
  /** Column name Due1_7 */
  String COLUMNNAME_Due1_7 = "Due1_7";
  /** Column name Due31_60 */
  String COLUMNNAME_Due31_60 = "Due31_60";
  /** Column name Due31_Plus */
  String COLUMNNAME_Due31_Plus = "Due31_Plus";
  /** Column name Due61_90 */
  String COLUMNNAME_Due61_90 = "Due61_90";
  /** Column name Due61_Plus */
  String COLUMNNAME_Due61_Plus = "Due61_Plus";
  /** Column name Due8_30 */
  String COLUMNNAME_Due8_30 = "Due8_30";
  /** Column name Due91_Plus */
  String COLUMNNAME_Due91_Plus = "Due91_Plus";
  /** Column name DueAmt */
  String COLUMNNAME_DueAmt = "DueAmt";
  /** Column name DueDate */
  String COLUMNNAME_DueDate = "DueDate";
  /** Column name InvoicedAmt */
  String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsListInvoices */
  String COLUMNNAME_IsListInvoices = "IsListInvoices";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name OpenAmt */
  String COLUMNNAME_OpenAmt = "OpenAmt";
  /** Column name PastDue1_30 */
  String COLUMNNAME_PastDue1_30 = "PastDue1_30";
  /** Column name PastDue1_7 */
  String COLUMNNAME_PastDue1_7 = "PastDue1_7";
  /** Column name PastDue31_60 */
  String COLUMNNAME_PastDue31_60 = "PastDue31_60";
  /** Column name PastDue31_Plus */
  String COLUMNNAME_PastDue31_Plus = "PastDue31_Plus";
  /** Column name PastDue61_90 */
  String COLUMNNAME_PastDue61_90 = "PastDue61_90";
  /** Column name PastDue61_Plus */
  String COLUMNNAME_PastDue61_Plus = "PastDue61_Plus";
  /** Column name PastDue8_30 */
  String COLUMNNAME_PastDue8_30 = "PastDue8_30";
  /** Column name PastDue91_Plus */
  String COLUMNNAME_PastDue91_Plus = "PastDue91_Plus";
  /** Column name PastDueAmt */
  String COLUMNNAME_PastDueAmt = "PastDueAmt";
  /** Column name StatementDate */
  String COLUMNNAME_StatementDate = "StatementDate";
  /** Column name T_Aging_UU */
  String COLUMNNAME_T_Aging_UU = "T_Aging_UU";
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

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Invoice Payment Schedule. Invoice Payment Schedule */
  int getC_InvoicePaySchedule_ID();

  /** Set Invoice Payment Schedule. Invoice Payment Schedule */
  void setC_InvoicePaySchedule_ID(int C_InvoicePaySchedule_ID);

  I_C_InvoicePaySchedule getC_InvoicePaySchedule() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  boolean isDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(boolean DateAcct);

  /** Get Days due. Number of days due (negative: due in number of days) */
  int getDaysDue();

  /** Set Days due. Number of days due (negative: due in number of days) */
  void setDaysDue(int DaysDue);

  /** Get Due Today */
  BigDecimal getDue0();

  /** Set Due Today */
  void setDue0(BigDecimal Due0);

  /** Get Due Today-30 */
  BigDecimal getDue0_30();

  /** Set Due Today-30 */
  void setDue0_30(BigDecimal Due0_30);

  /** Get Due Today-7 */
  BigDecimal getDue0_7();

  /** Set Due Today-7 */
  void setDue0_7(BigDecimal Due0_7);

  /** Get Due 1-7 */
  BigDecimal getDue1_7();

  /** Set Due 1-7 */
  void setDue1_7(BigDecimal Due1_7);

  /** Get Due 31-60 */
  BigDecimal getDue31_60();

  /** Set Due 31-60 */
  void setDue31_60(BigDecimal Due31_60);

  /** Get Due > 31 */
  BigDecimal getDue31_Plus();

  /** Set Due > 31 */
  void setDue31_Plus(BigDecimal Due31_Plus);

  /** Get Due 61-90 */
  BigDecimal getDue61_90();

  /** Set Due 61-90 */
  void setDue61_90(BigDecimal Due61_90);

  /** Get Due > 61 */
  BigDecimal getDue61_Plus();

  /** Set Due > 61 */
  void setDue61_Plus(BigDecimal Due61_Plus);

  /** Get Due 8-30 */
  BigDecimal getDue8_30();

  /** Set Due 8-30 */
  void setDue8_30(BigDecimal Due8_30);

  /** Get Due > 91 */
  BigDecimal getDue91_Plus();

  /** Set Due > 91 */
  void setDue91_Plus(BigDecimal Due91_Plus);

  /** Get Amount due. Amount of the payment due */
  BigDecimal getDueAmt();

  /** Set Amount due. Amount of the payment due */
  void setDueAmt(BigDecimal DueAmt);

  /** Get Due Date. Date when the payment is due */
  Timestamp getDueDate();

  /** Set Due Date. Date when the payment is due */
  void setDueDate(Timestamp DueDate);

  /** Get Invoiced Amount. The amount invoiced */
  BigDecimal getInvoicedAmt();

  /** Set Invoiced Amount. The amount invoiced */
  void setInvoicedAmt(BigDecimal InvoicedAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set List Invoices. Include List of Invoices */
  void setIsListInvoices(boolean IsListInvoices);

  /** Get List Invoices. Include List of Invoices */
  boolean isListInvoices();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Open Amount. Open item amount */
  BigDecimal getOpenAmt();

  /** Set Open Amount. Open item amount */
  void setOpenAmt(BigDecimal OpenAmt);

  /** Get Past Due 1-30 */
  BigDecimal getPastDue1_30();

  /** Set Past Due 1-30 */
  void setPastDue1_30(BigDecimal PastDue1_30);

  /** Get Past Due 1-7 */
  BigDecimal getPastDue1_7();

  /** Set Past Due 1-7 */
  void setPastDue1_7(BigDecimal PastDue1_7);

  /** Get Past Due 31-60 */
  BigDecimal getPastDue31_60();

  /** Set Past Due 31-60 */
  void setPastDue31_60(BigDecimal PastDue31_60);

  /** Get Past Due > 31 */
  BigDecimal getPastDue31_Plus();

  /** Set Past Due > 31 */
  void setPastDue31_Plus(BigDecimal PastDue31_Plus);

  /** Get Past Due 61-90 */
  BigDecimal getPastDue61_90();

  /** Set Past Due 61-90 */
  void setPastDue61_90(BigDecimal PastDue61_90);

  /** Get Past Due > 61 */
  BigDecimal getPastDue61_Plus();

  /** Set Past Due > 61 */
  void setPastDue61_Plus(BigDecimal PastDue61_Plus);

  /** Get Past Due 8-30 */
  BigDecimal getPastDue8_30();

  /** Set Past Due 8-30 */
  void setPastDue8_30(BigDecimal PastDue8_30);

  /** Get Past Due > 91 */
  BigDecimal getPastDue91_Plus();

  /** Set Past Due > 91 */
  void setPastDue91_Plus(BigDecimal PastDue91_Plus);

  /** Get Past Due */
  BigDecimal getPastDueAmt();

  /** Set Past Due */
  void setPastDueAmt(BigDecimal PastDueAmt);

  /** Get Statement date. Date of the statement */
  Timestamp getStatementDate();

  /** Set Statement date. Date of the statement */
  void setStatementDate(Timestamp StatementDate);

  /** Get T_Aging_UU */
  String getT_Aging_UU();

  /** Set T_Aging_UU */
  void setT_Aging_UU(String T_Aging_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
