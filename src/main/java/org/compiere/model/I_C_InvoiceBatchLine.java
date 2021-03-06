package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_InvoiceBatchLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceBatchLine extends PersistentObject {

    /**
     * AD_Table_ID=768
     */
    int Table_ID = 768;

    /**
     * TableName=C_InvoiceBatchLine
     */
    String Table_Name = "C_InvoiceBatchLine";

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
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_InvoiceBatch_ID
     */
    String COLUMNNAME_C_InvoiceBatch_ID = "C_InvoiceBatch_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateInvoiced
     */
    String COLUMNNAME_DateInvoiced = "DateInvoiced";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name LineTotalAmt
     */
    String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
    /**
     * Column name PriceEntered
     */
    String COLUMNNAME_PriceEntered = "PriceEntered";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

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
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Get Invoice Batch. Expense Invoice Batch Header
     */
    int getInvoiceBatchId();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setInvoiceId(int C_Invoice_ID);

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getInvoiceLineId();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Get Tax. Tax identifier
     */
    int getTaxId();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Date Invoiced. Date printed on Invoice
     */
    Timestamp getDateInvoiced();

    /**
     * Set Date Invoiced. Date printed on Invoice
     */
    void setDateInvoiced(Timestamp DateInvoiced);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Price includes Tax. Tax is included in the price
     */
    void setIsTaxIncluded(boolean IsTaxIncluded);

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    BigDecimal getLineNetAmt();

    /**
     * Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    void setLineNetAmt(BigDecimal LineNetAmt);

    /**
     * Get Line Total. Total line amount incl. Tax
     */
    BigDecimal getLineTotalAmt();

    /**
     * Set Line Total. Total line amount incl. Tax
     */
    void setLineTotalAmt(BigDecimal LineTotalAmt);

    /**
     * Get Price. Price Entered - the price based on the selected/base UoM
     */
    BigDecimal getPriceEntered();

    /**
     * Set Price. Price Entered - the price based on the selected/base UoM
     */
    void setPriceEntered(BigDecimal PriceEntered);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Set Tax Amount. Tax Amount for a document
     */
    void setTaxAmt(BigDecimal TaxAmt);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();


}
