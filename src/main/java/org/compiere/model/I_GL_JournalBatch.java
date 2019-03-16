package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for GL_JournalBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalBatch {

    /**
     * AD_Table_ID=225
     */
    int Table_ID = 225;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name GL_JournalBatch_ID
     */
    String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
    int getGL_JournalBatch_ID();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

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
