package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_InvoiceBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceBatch {

    /**
     * TableName=C_InvoiceBatch
     */
    String Table_Name = "C_InvoiceBatch";

    /**
     * AD_Table_ID=767
     */
    int Table_ID = 767;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name C_InvoiceBatch_UU
     */
    String COLUMNNAME_C_InvoiceBatch_UU = "C_InvoiceBatch_UU";
    /**
     * Column name ControlAmt
     */
    String COLUMNNAME_ControlAmt = "ControlAmt";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getC_ConversionType_ID();

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setC_ConversionType_ID(int C_ConversionType_ID);

    I_C_ConversionType getC_ConversionType() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Invoice Batch. Expense Invoice Batch Header
     */
    int getC_InvoiceBatch_ID();

    /**
     * Set Invoice Batch. Expense Invoice Batch Header
     */
    void setC_InvoiceBatch_ID(int C_InvoiceBatch_ID);

    /**
     * Get C_InvoiceBatch_UU
     */
    String getC_InvoiceBatch_UU();

    /**
     * Set C_InvoiceBatch_UU
     */
    void setC_InvoiceBatch_UU(String C_InvoiceBatch_UU);

    /**
     * Get Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    BigDecimal getControlAmt();

    /**
     * Set Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    void setControlAmt(BigDecimal ControlAmt);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Amt. Document Amount
     */
    BigDecimal getDocumentAmt();

    /**
     * Set Document Amt. Document Amount
     */
    void setDocumentAmt(BigDecimal DocumentAmt);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
