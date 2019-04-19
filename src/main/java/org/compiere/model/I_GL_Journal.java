package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for GL_Journal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Journal {

    /**
     * AD_Table_ID=224
     */
    int Table_ID = 224;

    /**
     * TableName=GL_Journal
     */
    String Table_Name = "GL_Journal";

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
     * Column name ControlAmt
     */
    String COLUMNNAME_ControlAmt = "ControlAmt";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name CurrencyRate
     */
    String COLUMNNAME_CurrencyRate = "CurrencyRate";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
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
     * Column name GL_Budget_ID
     */
    String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name GL_JournalBatch_ID
     */
    String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
    /**
     * Column name GL_Journal_ID
     */
    String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /**
     * Column name TotalCr
     */
    String COLUMNNAME_TotalCr = "TotalCr";
    /**
     * Column name TotalDr
     */
    String COLUMNNAME_TotalDr = "TotalDr";

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    AccountingSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getConversionTypeId();

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setConversionTypeId(int C_ConversionType_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    /**
     * Get Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    BigDecimal getControlAmt();

    /**
     * Set Control Amount. If not zero, the Debit amount of the document must be equal this amount
     */
    void setControlAmt(BigDecimal ControlAmt);

    /**
     * Get Period. Period of the Calendar
     */
    int getPeriodId();

    /**
     * Set Period. Period of the Calendar
     */
    void setPeriodId(int C_Period_ID);

    I_C_Period getPeriod() throws RuntimeException;

    /**
     * Get Rate. Currency Conversion Rate
     */
    BigDecimal getCurrencyRate();

    /**
     * Set Rate. Currency Conversion Rate
     */
    void setCurrencyRate(BigDecimal CurrencyRate);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

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
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

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
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Budget. General Ledger Budget
     */
    int getGLBudgetId();

    /**
     * Set Budget. General Ledger Budget
     */
    void setGLBudgetId(int GL_Budget_ID);

    /**
     * Get GL Category. General Ledger Category
     */
    int getGLCategoryId();

    /**
     * Set GL Category. General Ledger Category
     */
    void setGLCategoryId(int GL_Category_ID);

    /**
     * Get Journal Batch. General Ledger Journal Batch
     */
    int getGLJournalBatchId();

    /**
     * Set Journal Batch. General Ledger Journal Batch
     */
    void setGLJournalBatchId(int GL_JournalBatch_ID);

    /**
     * Get Journal. General Ledger Journal
     */
    int getGLJournalId();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    BigDecimal getProcessedOn();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Set Reversal ID. ID of document reversal
     */
    void setReversalId(int Reversal_ID);

    /**
     * Get Total Credit. Total Credit in document currency
     */
    BigDecimal getTotalCr();

    /**
     * Set Total Credit. Total Credit in document currency
     */
    void setTotalCr(BigDecimal TotalCr);

    /**
     * Get Total Debit. Total debit in document currency
     */
    BigDecimal getTotalDr();

    /**
     * Set Total Debit. Total debit in document currency
     */
    void setTotalDr(BigDecimal TotalDr);

}
