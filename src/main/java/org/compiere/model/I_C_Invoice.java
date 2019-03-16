package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Generated Interface for C_Invoice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Invoice extends IPO {

    /**
     * TableName=C_Invoice
     */
    String Table_Name = "C_Invoice";

    /**
     * AD_Table_ID=318
     */
    int Table_ID = 318;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_CashLine_ID
     */
    String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";
    /**
     * Column name C_CashPlanLine_ID
     */
    String COLUMNNAME_C_CashPlanLine_ID = "C_CashPlanLine_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_DocTypeTarget_ID
     */
    String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateInvoiced
     */
    String COLUMNNAME_DateInvoiced = "DateInvoiced";
    /**
     * Column name DateOrdered
     */
    String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePrinted
     */
    String COLUMNNAME_DatePrinted = "DatePrinted";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name GrandTotal
     */
    String COLUMNNAME_GrandTotal = "GrandTotal";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsDiscountPrinted
     */
    String COLUMNNAME_IsDiscountPrinted = "IsDiscountPrinted";
    /**
     * Column name IsInDispute
     */
    String COLUMNNAME_IsInDispute = "IsInDispute";
    /**
     * Column name IsPaid
     */
    String COLUMNNAME_IsPaid = "IsPaid";
    /**
     * Column name IsPayScheduleValid
     */
    String COLUMNNAME_IsPayScheduleValid = "IsPayScheduleValid";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name IsTransferred
     */
    String COLUMNNAME_IsTransferred = "IsTransferred";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name PaymentRule
     */
    String COLUMNNAME_PaymentRule = "PaymentRule";
    /**
     * Column name POReference
     */
    String COLUMNNAME_POReference = "POReference";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ref_Invoice_ID
     */
    String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name SendEMail
     */
    String COLUMNNAME_SendEMail = "SendEMail";
    /**
     * Column name TotalLines
     */
    String COLUMNNAME_TotalLines = "TotalLines";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * On Credit = P
     */
    String PAYMENTRULE_OnCredit = "P";
    /**
     * Direct Debit = D
     */
    String PAYMENTRULE_DirectDebit = "D";
    /**
     * Completed = CO
     */
    String DOCSTATUS_Completed = "CO";
    /**
     * Voided = VO
     */
    String DOCSTATUS_Voided = "VO";
    /**
     * Reversed = RE
     */
    String DOCSTATUS_Reversed = "RE";
    /**
     * Closed = CL
     */
    String DOCSTATUS_Closed = "CL";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getBusinessPartnerLocationId();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getConversionTypeId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Get Order. Order
     */
    int getOrderId();

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getPaymentTermId();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setPaymentTermId(int C_PaymentTerm_ID);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Date Invoiced. Date printed on Invoice
     */
    Timestamp getDateInvoiced();

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Get Grand Total. Total amount of document
     */
    BigDecimal getGrandTotal();

    /**
     * Set Grand Total. Total amount of document
     */
    void setGrandTotal(BigDecimal GrandTotal);

    /**
     * Set Pay Schedule valid. Is the Payment Schedule is valid
     */
    void setIsPayScheduleValid(boolean IsPayScheduleValid);

    /**
     * Get Pay Schedule valid. Is the Payment Schedule is valid
     */
    boolean isPayScheduleValid();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setPriceListId(int M_PriceList_ID);

    /**
     * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
     * Business Partner
     */
    String getPOReference();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Total Lines. Total of all document lines
     */
    void setTotalLines(BigDecimal TotalLines);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    Properties getCtx();

    String getProcessMsg();

    boolean voidIt();

    boolean reverseCorrectIt();

    void saveEx();

    int getPrecision();

    I_C_InvoiceLine[] getLines(boolean b);

    I_C_InvoiceTax[] getTaxes(boolean b);

    ArrayList<IPODoc> getDocsPostProcess();
}
