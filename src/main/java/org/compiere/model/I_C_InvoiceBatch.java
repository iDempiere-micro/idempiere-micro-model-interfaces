package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_InvoiceBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceBatch {

    /**
     * AD_Table_ID=767
     */
    int Table_ID = 767;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_InvoiceBatch_ID
     */
    String COLUMNNAME_C_InvoiceBatch_ID = "C_InvoiceBatch_ID";
    /**
     * Column name ControlAmt
     */
    String COLUMNNAME_ControlAmt = "ControlAmt";
    /**
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentAmt
     */
    String COLUMNNAME_DocumentAmt = "DocumentAmt";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getConversionTypeId();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Get Invoice Batch. Expense Invoice Batch Header
     */
    int getC_InvoiceBatch_ID();

    /**
     * Get Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    BigDecimal getControlAmt();

    /**
     * Set Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    void setControlAmt(BigDecimal ControlAmt);

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Document Amt. Document Amount
     */
    BigDecimal getDocumentAmt();

    /**
     * Set Document Amt. Document Amount
     */
    void setDocumentAmt(BigDecimal DocumentAmt);

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

}
