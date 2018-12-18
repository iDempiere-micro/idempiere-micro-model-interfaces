package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Properties;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_Invoice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Invoice extends IPO {

  /** TableName=C_Invoice */
  String Table_Name = "C_Invoice";

  /** AD_Table_ID=318 */
  int Table_ID = 318;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_CashLine_ID */
  String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
  /** Column name C_CashPlanLine_ID */
  String COLUMNNAME_C_CashPlanLine_ID = "C_CashPlanLine_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_DocTypeTarget_ID */
  String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
  /** Column name C_DunningLevel_ID */
  String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Invoice_UU */
  String COLUMNNAME_C_Invoice_UU = "C_Invoice_UU";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateInvoiced */
  String COLUMNNAME_DateInvoiced = "DateInvoiced";
  /** Column name DateOrdered */
  String COLUMNNAME_DateOrdered = "DateOrdered";
  /** Column name DatePrinted */
  String COLUMNNAME_DatePrinted = "DatePrinted";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name DunningGrace */
  String COLUMNNAME_DunningGrace = "DunningGrace";
  /** Column name GenerateTo */
  String COLUMNNAME_GenerateTo = "GenerateTo";
  /** Column name GrandTotal */
  String COLUMNNAME_GrandTotal = "GrandTotal";
  /** Column name InvoiceCollectionType */
  String COLUMNNAME_InvoiceCollectionType = "InvoiceCollectionType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsDiscountPrinted */
  String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
  /** Column name IsFixedAssetInvoice */
  String COLUMNNAME_IsFixedAssetInvoice = "IsFixedAssetInvoice";
  /** Column name IsInDispute */
  String COLUMNNAME_IsInDispute = "IsInDispute";
  /** Column name IsPaid */
  String COLUMNNAME_IsPaid = "IsPaid";
  /** Column name IsPayScheduleValid */
  String COLUMNNAME_IsPayScheduleValid = "IsPayScheduleValid";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name IsTaxIncluded */
  String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
  /** Column name IsTransferred */
  String COLUMNNAME_IsTransferred = "IsTransferred";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_RMA_ID */
  String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Ref_Invoice_ID */
  String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name SendEMail */
  String COLUMNNAME_SendEMail = "SendEMail";
  /** Column name TotalLines */
  String COLUMNNAME_TotalLines = "TotalLines";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";
  /** PaymentRule AD_Reference_ID=195 */
  int PAYMENTRULE_AD_Reference_ID = 195;
  /** Cash = B */
  String PAYMENTRULE_Cash = "B";
  /** Credit Card = K */
  String PAYMENTRULE_CreditCard = "K";
  /** Direct Deposit = T */
  String PAYMENTRULE_DirectDeposit = "T";
  /** Check = S */
  String PAYMENTRULE_Check = "S";
  /** On Credit = P */
  String PAYMENTRULE_OnCredit = "P";
  /** Direct Debit = D */
  String PAYMENTRULE_DirectDebit = "D";
  /** Mixed POS Payment = M */
  String PAYMENTRULE_MixedPOSPayment = "M";
  /** DocStatus AD_Reference_ID=131 */
  int DOCSTATUS_AD_Reference_ID = 131;
  /** Drafted = DR */
  String DOCSTATUS_Drafted = "DR";
  /** Completed = CO */
  String DOCSTATUS_Completed = "CO";
  /** Approved = AP */
  String DOCSTATUS_Approved = "AP";
  /** Not Approved = NA */
  String DOCSTATUS_NotApproved = "NA";
  /** Voided = VO */
  String DOCSTATUS_Voided = "VO";
  /** Invalid = IN */
  String DOCSTATUS_Invalid = "IN";
  /** Reversed = RE */
  String DOCSTATUS_Reversed = "RE";
  /** Closed = CL */
  String DOCSTATUS_Closed = "CL";
  /** Unknown = ?? */
  String DOCSTATUS_Unknown = "??";
  /** In Progress = IP */
  String DOCSTATUS_InProgress = "IP";
  /** Waiting Payment = WP */
  String DOCSTATUS_WaitingPayment = "WP";
  /** Waiting Confirmation = WC */
  String DOCSTATUS_WaitingConfirmation = "WC";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

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

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Cash Journal Line. Cash Journal Line */
  int getC_CashLine_ID();

  /** Set Cash Journal Line. Cash Journal Line */
  void setC_CashLine_ID(int C_CashLine_ID);

  I_C_CashLine getC_CashLine() throws RuntimeException;

  /** Get Cash Plan Line */
  int getC_CashPlanLine_ID();

  /** Set Cash Plan Line */
  void setC_CashPlanLine_ID(int C_CashPlanLine_ID);

  I_C_CashPlanLine getC_CashPlanLine() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Target Document Type. Target document type for conversing documents */
  int getC_DocTypeTarget_ID();

  /** Set Target Document Type. Target document type for conversing documents */
  void setC_DocTypeTarget_ID(int C_DocTypeTarget_ID);

  I_C_DocType getC_DocTypeTarget() throws RuntimeException;

  /** Get Dunning Level */
  int getC_DunningLevel_ID();

  /** Set Dunning Level */
  void setC_DunningLevel_ID(int C_DunningLevel_ID);

  I_C_DunningLevel getC_DunningLevel() throws RuntimeException;

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  /** Get C_Invoice_UU */
  String getC_Invoice_UU();

  /** Set C_Invoice_UU */
  void setC_Invoice_UU(String C_Invoice_UU);

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

  /** Set Payment Term. The terms of Payment (timing, discount) */
  void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

  I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  String getCreateFrom();

  /**
   * Set Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  void setCreateFrom(String CreateFrom);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Date Invoiced. Date printed on Invoice */
  Timestamp getDateInvoiced();

  /** Set Date Invoiced. Date printed on Invoice */
  void setDateInvoiced(Timestamp DateInvoiced);

  /** Get Date Ordered. Date of Order */
  Timestamp getDateOrdered();

  /** Set Date Ordered. Date of Order */
  void setDateOrdered(Timestamp DateOrdered);

  /** Get Date printed. Date the document was printed. */
  Timestamp getDatePrinted();

  /** Set Date printed. Date the document was printed. */
  void setDatePrinted(Timestamp DatePrinted);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Dunning Grace Date */
  Timestamp getDunningGrace();

  /** Set Dunning Grace Date */
  void setDunningGrace(Timestamp DunningGrace);

  /** Get Generate To. Generate To */
  String getGenerateTo();

  /** Set Generate To. Generate To */
  void setGenerateTo(String GenerateTo);

  /** Get Grand Total. Total amount of document */
  BigDecimal getGrandTotal();

  /** Set Grand Total. Total amount of document */
  void setGrandTotal(BigDecimal GrandTotal);

  /** Get Collection Status. Invoice Collection Status */
  String getInvoiceCollectionType();

  /** Set Collection Status. Invoice Collection Status */
  void setInvoiceCollectionType(String InvoiceCollectionType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Discount Printed. Print Discount on Invoice and Order */
  void setIsDiscountPrinted(boolean IsDiscountPrinted);

  /** Get Discount Printed. Print Discount on Invoice and Order */
  boolean isDiscountPrinted();

  /** Set IsFixedAssetInvoice */
  void setIsFixedAssetInvoice(boolean IsFixedAssetInvoice);

  /** Get IsFixedAssetInvoice */
  boolean isFixedAssetInvoice();

  /** Set In Dispute. Document is in dispute */
  void setIsInDispute(boolean IsInDispute);

  /** Get In Dispute. Document is in dispute */
  boolean isInDispute();

  /** Set Paid. The document is paid */
  void setIsPaid(boolean IsPaid);

  /** Get Paid. The document is paid */
  boolean isPaid();

  /** Set Pay Schedule valid. Is the Payment Schedule is valid */
  void setIsPayScheduleValid(boolean IsPayScheduleValid);

  /** Get Pay Schedule valid. Is the Payment Schedule is valid */
  boolean isPayScheduleValid();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Price includes Tax. Tax is included in the price */
  void setIsTaxIncluded(boolean IsTaxIncluded);

  /** Get Price includes Tax. Tax is included in the price */
  boolean isTaxIncluded();

  /** Set Transferred. Transferred to General Ledger (i.e. accounted) */
  void setIsTransferred(boolean IsTransferred);

  /** Get Transferred. Transferred to General Ledger (i.e. accounted) */
  boolean isTransferred();

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get RMA. Return Material Authorization */
  int getM_RMA_ID();

  /** Set RMA. Return Material Authorization */
  void setM_RMA_ID(int M_RMA_ID);

  I_M_RMA getM_RMA() throws RuntimeException;

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

  /**
   * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
   * Business Partner
   */
  String getPOReference();

  /**
   * Set Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
   * Business Partner
   */
  void setPOReference(String POReference);

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /**
   * Get Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  BigDecimal getProcessedOn();

  /**
   * Set Processed On. The date+time (expressed in decimal format) when the document has been
   * processed
   */
  void setProcessedOn(BigDecimal ProcessedOn);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Referenced Invoice */
  int getRef_Invoice_ID();

  /** Set Referenced Invoice */
  void setRef_Invoice_ID(int Ref_Invoice_ID);

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

  I_C_Invoice getReversal() throws RuntimeException;

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Send EMail. Enable sending Document EMail */
  boolean isSendEMail();

  /** Set Send EMail. Enable sending Document EMail */
  void setSendEMail(boolean SendEMail);

  /** Get Total Lines. Total of all document lines */
  BigDecimal getTotalLines();

  /** Set Total Lines. Total of all document lines */
  void setTotalLines(BigDecimal TotalLines);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;

  Properties getCtx();



  void set_TrxName(String trxName);

  String getProcessMsg();

  boolean voidIt();

  boolean reverseCorrectIt();

  void saveEx(String trxName);

  int getPrecision();

  I_C_InvoiceLine[] getLines(boolean b);

  I_C_InvoiceTax[] getTaxes(boolean b);

  ArrayList<IPODoc> getDocsPostProcess();
}
